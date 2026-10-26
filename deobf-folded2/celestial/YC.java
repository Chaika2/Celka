package celestial;

import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class YC implements ArgumentType<Integer> {
   private static final Collection<String> id_class = Arrays.asList("container.5", "12", "weapon");
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("slot.unknown", var0));
   private static final Map<String, Integer> id_byte = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      for (int var1 = 0; var1 < 54; var1++) {
         var0.put("container." + var1, var1);
      }

      for (int var2 = 0; var2 < 9; var2++) {
         var0.put("hotbar." + var2, var2);
      }

      for (int var3 = 0; var3 < 27; var3++) {
         var0.put("inventory." + var3, 9 + var3);
      }

      for (int var4 = 0; var4 < 27; var4++) {
         var0.put("enderchest." + var4, 200 + var4);
      }

      for (int var5 = 0; var5 < 8; var5++) {
         var0.put("villager." + var5, 300 + var5);
      }

      for (int var6 = 0; var6 < 15; var6++) {
         var0.put("horse." + var6, 500 + var6);
      }

      var0.put("weapon", 98);
      var0.put("weapon.mainhand", 98);
      var0.put("weapon.offhand", 99);
      var0.put("armor.head", 100 + rXQ.HEAD.id_break());
      var0.put("armor.chest", 100 + rXQ.CHEST.id_break());
      var0.put("armor.legs", 100 + rXQ.LEGS.id_break());
      var0.put("armor.feet", 100 + rXQ.FEET.id_break());
      var0.put("horse.saddle", 400);
      var0.put("horse.armor", 401);
      var0.put("horse.chest", 499);
   });

   public static YC id_class() {
      return new YC();
   }

   public Integer id_class(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readUnquotedString();
      if (!id_byte.containsKey(var2)) {
         throw id_break.create(var2);
      } else {
         return id_byte.get(var2);
      }
   }

   public static int id_class(CommandContext<gy_3> var0, String var1) {
      return (Integer)var0.getArgument(var1, Integer.class);
   }

   public Collection<String> getExamples() {
      return id_class;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return gR_2.id_break(id_byte.keySet(), var2);
   }
}
