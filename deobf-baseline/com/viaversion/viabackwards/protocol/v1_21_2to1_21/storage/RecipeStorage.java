package com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage;

import com.viaversion.viabackwards.protocol.v1_21_2to1_21.Protocol1_21_2To1_21;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.RecipeStorage.FurnaceRecipe;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.RecipeStorage.Recipe;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.RecipeStorage.ShapedRecipe;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.RecipeStorage.ShapelessRecipe;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.RecipeStorage.StoneCutterRecipe;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.HolderSet;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import java.util.ArrayList;
import java.util.List;
import offline.launcher.ViaProtocolDiagnostics;

public final class RecipeStorage implements StorableObject {
   public static final int RECIPE_BOOK_SETTINGS = 8;
   private static final String[] EMPTY_STRINGS = new String[0];
   private final List<Recipe> recipes = new ArrayList<>();
   private final List<Recipe> tempRecipes = new ArrayList<>();
   private final List<StoneCutterRecipe> stoneCutterRecipes = new ArrayList<>();
   private boolean[] recipeBookSettings = new boolean[8];
   private final Protocol1_21_2To1_21 protocol;

   public RecipeStorage(Protocol1_21_2To1_21 protocol) {
      this.protocol = protocol;
   }

   public void sendRecipes(UserConnection var1) {
      ViaProtocolDiagnostics.recipeSynthesisSkipped(var1);
   }

   private static String identifier(int recipeIndex) {
      return String.format("%06d", recipeIndex);
   }

   public void lockRecipes(PacketWrapper wrapper, int[] ids) {
      for (int id : ids) {
         this.recipes.removeIf(recipe -> recipe.index == id);
      }

      wrapper.write(Types.VAR_INT, 2);

      for (boolean recipeBookSetting : this.recipeBookSettings) {
         wrapper.write(Types.BOOLEAN, recipeBookSetting);
      }

      String[] recipeKeys = new String[ids.length];

      for (int i = 0; i < ids.length; i++) {
         recipeKeys[i] = identifier(ids[i]);
      }

      wrapper.write(Types.STRING_ARRAY, recipeKeys);
   }

   private void sendUnlockedRecipes(UserConnection connection, List<Recipe> recipes) {
      PacketWrapper wrapper = PacketWrapper.create(ClientboundPackets1_21.RECIPE, connection);
      wrapper.write(Types.VAR_INT, 0);

      for (boolean recipeBookSetting : this.recipeBookSettings) {
         wrapper.write(Types.BOOLEAN, recipeBookSetting);
      }

      String[] recipeKeys = new String[recipes.size()];
      List<String> highlightRecipes = new ArrayList<>();

      for (int i = 0; i < recipes.size(); i++) {
         recipeKeys[i] = identifier(recipes.get(i).index);
         if (recipes.get(i).highlight) {
            highlightRecipes.add(recipeKeys[i]);
         }
      }

      wrapper.write(Types.STRING_ARRAY, recipeKeys);
      wrapper.write(Types.STRING_ARRAY, highlightRecipes.toArray(EMPTY_STRINGS));
      wrapper.send(Protocol1_21_2To1_21.class);
   }

   public void readRecipe(PacketWrapper wrapper) {
      int id = (Integer)wrapper.read(Types.VAR_INT);
      int type = (Integer)wrapper.passthrough(Types.VAR_INT);

      Recipe recipe = switch (type) {
         case 0 -> this.readShapeless(wrapper);
         case 1 -> this.readShaped(wrapper);
         case 2 -> this.readFurnace(wrapper);
         case 3 -> this.readStoneCutter(wrapper);
         case 4 -> this.readSmithing(wrapper);
         default -> null;
      };
      Integer group = (Integer)wrapper.read(Types.OPTIONAL_VAR_INT);
      int category = (Integer)wrapper.read(Types.VAR_INT);
      if ((Boolean)wrapper.read(Types.BOOLEAN)) {
         int ingredientsSize = (Integer)wrapper.read(Types.VAR_INT);

         for (int j = 0; j < ingredientsSize; j++) {
            wrapper.read(Types.HOLDER_SET);
         }
      }

      byte flags = (Byte)wrapper.read(Types.BYTE);
      if (recipe != null) {
         recipe.index = id;
         recipe.group = group;
         recipe.category = category;
         recipe.highlight = (flags & 2) != 0;
      }
   }

   private Recipe readShapeless(PacketWrapper wrapper) {
      Item[][] ingredients = this.readSlotDisplayList(wrapper);
      Item result = this.readSingleSlotDisplay(wrapper);
      this.readSlotDisplay(wrapper);
      return this.add(new ShapelessRecipe(ingredients, result));
   }

   private Recipe readShaped(PacketWrapper wrapper) {
      int width = (Integer)wrapper.passthrough(Types.VAR_INT);
      int height = (Integer)wrapper.passthrough(Types.VAR_INT);
      Item[][] ingredients = this.readSlotDisplayList(wrapper);
      Item result = this.readSingleSlotDisplay(wrapper);
      this.readSlotDisplay(wrapper);
      return this.add(new ShapedRecipe(width, height, ingredients, result));
   }

   private Recipe readFurnace(PacketWrapper wrapper) {
      Item[] ingredient = this.readSlotDisplay(wrapper);
      this.readSlotDisplay(wrapper);
      Item result = this.readSingleSlotDisplay(wrapper);
      this.readSlotDisplay(wrapper);
      int duration = (Integer)wrapper.read(Types.VAR_INT);
      float experience = (Float)wrapper.read(Types.FLOAT);
      return this.add(new FurnaceRecipe(ingredient, result, duration, experience));
   }

   private Recipe readStoneCutter(PacketWrapper wrapper) {
      this.readSlotDisplay(wrapper);
      this.readSlotDisplay(wrapper);
      this.readSlotDisplay(wrapper);
      return null;
   }

   private Recipe readSmithing(PacketWrapper wrapper) {
      this.readSlotDisplay(wrapper);
      this.readSlotDisplay(wrapper);
      this.readSlotDisplay(wrapper);
      this.readSlotDisplay(wrapper);
      this.readSlotDisplay(wrapper);
      return null;
   }

   private Recipe add(Recipe recipe) {
      this.tempRecipes.add(recipe);
      return recipe;
   }

   private Item[][] readSlotDisplayList(PacketWrapper wrapper) {
      int size = (Integer)wrapper.passthrough(Types.VAR_INT);
      Item[][] ingredients = new Item[size][];

      for (int i = 0; i < size; i++) {
         ingredients[i] = this.readSlotDisplay(wrapper);
      }

      return ingredients;
   }

   private Item readSingleSlotDisplay(PacketWrapper wrapper) {
      Item[] items = this.readSlotDisplay(wrapper);
      return (Item)(items.length == 0 ? new StructuredItem(1, 1) : items[0]);
   }

   private Item[] readSlotDisplay(PacketWrapper wrapper) {
      int type = (Integer)wrapper.read(Types.VAR_INT);

      return switch (type) {
         case 2 -> {
            int id = (Integer)wrapper.read(Types.VAR_INT);
            if (id == 0) {
               this.protocol.getLogger().warning("Empty item id in recipe");
               yield new Item[0];
            } else {
               yield new Item[]{new StructuredItem(this.rewriteItemId(id), 1)};
            }
         }
         case 3 -> {
            Item item = this.protocol.getItemRewriter().handleItemToClient(wrapper.user(), (Item)wrapper.read(VersionedTypes.V1_21_2.item()));
            if (item.isEmpty()) {
               this.protocol.getLogger().warning("Empty item in recipe");
               yield new Item[0];
            } else {
               yield new Item[]{item};
            }
         }
         case 4 -> {
            wrapper.read(Types.STRING);
            yield new Item[0];
         }
         case 5 -> {
            this.readSlotDisplay(wrapper);
            this.readSlotDisplay(wrapper);
            this.readSlotDisplay(wrapper);
            yield new Item[0];
         }
         case 6 -> {
            this.readSlotDisplay(wrapper);
            this.readSlotDisplay(wrapper);
            yield new Item[0];
         }
         case 7 -> this.readSlotDisplayList(wrapper)[0];
         default -> new Item[0];
      };
   }

   private int rewriteItemId(int id) {
      return this.protocol.getMappingData().getNewItemId(id);
   }

   public void readStoneCutterRecipes(PacketWrapper wrapper) {
      this.stoneCutterRecipes.clear();
      int stonecutterRecipesSize = (Integer)wrapper.read(Types.VAR_INT);

      for (int i = 0; i < stonecutterRecipesSize; i++) {
         Item[] ingredient = this.readHolderSet(wrapper);
         Item result = this.readSingleSlotDisplay(wrapper);
         this.stoneCutterRecipes.add(new StoneCutterRecipe(ingredient, result));
      }
   }

   private Item[] readHolderSet(PacketWrapper wrapper) {
      HolderSet holderSet = (HolderSet)wrapper.read(Types.HOLDER_SET);
      if (holderSet.hasTagKey()) {
         return new Item[]{new StructuredItem(1, 1)};
      } else {
         int[] ids = holderSet.ids();

         for (int i = 0; i < ids.length; i++) {
            ids[i] = this.rewriteItemId(ids[i]);
         }

         Item[] ingredient = new Item[ids.length];

         for (int i = 0; i < ingredient.length; i++) {
            ingredient[i] = new StructuredItem(ids[i], 1);
         }

         return ingredient;
      }
   }

   public void setRecipeBookSettings(boolean[] recipeBookSettings) {
      this.recipeBookSettings = recipeBookSettings;
   }

   public void clearRecipes() {
      this.recipes.clear();
   }
}
