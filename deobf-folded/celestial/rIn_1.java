package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rIn_1 extends Schema {
   private static final Logger id_break = LogManager.getLogger();
   static final Map<String, String> id_byte = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("minecraft:furnace", "Furnace");
      var0.put("minecraft:lit_furnace", "Furnace");
      var0.put("minecraft:chest", "Chest");
      var0.put("minecraft:trapped_chest", "Chest");
      var0.put("minecraft:ender_chest", "EnderChest");
      var0.put("minecraft:jukebox", "RecordPlayer");
      var0.put("minecraft:dispenser", "Trap");
      var0.put("minecraft:dropper", "Dropper");
      var0.put("minecraft:sign", "Sign");
      var0.put("minecraft:mob_spawner", "MobSpawner");
      var0.put("minecraft:noteblock", "Music");
      var0.put("minecraft:brewing_stand", "Cauldron");
      var0.put("minecraft:enhanting_table", "EnchantTable");
      var0.put("minecraft:command_block", "CommandBlock");
      var0.put("minecraft:beacon", "Beacon");
      var0.put("minecraft:skull", "Skull");
      var0.put("minecraft:daylight_detector", "DLDetector");
      var0.put("minecraft:hopper", "Hopper");
      var0.put("minecraft:banner", "Banner");
      var0.put("minecraft:flower_pot", "FlowerPot");
      var0.put("minecraft:repeating_command_block", "CommandBlock");
      var0.put("minecraft:chain_command_block", "CommandBlock");
      var0.put("minecraft:standing_sign", "Sign");
      var0.put("minecraft:wall_sign", "Sign");
      var0.put("minecraft:piston_head", "Piston");
      var0.put("minecraft:daylight_detector_inverted", "DLDetector");
      var0.put("minecraft:unpowered_comparator", "Comparator");
      var0.put("minecraft:powered_comparator", "Comparator");
      var0.put("minecraft:wall_banner", "Banner");
      var0.put("minecraft:standing_banner", "Banner");
      var0.put("minecraft:structure_block", "Structure");
      var0.put("minecraft:end_portal", "Airportal");
      var0.put("minecraft:end_gateway", "EndGateway");
      var0.put("minecraft:shield", "Banner");
   });
   protected static final HookFunction id_class = new rIC();

   protected static void id_byte(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var0)));
   }

   public rIn_1(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void id_class(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> id_class(var0));
   }

   protected static TypeTemplate id_class(Schema var0) {
      return DSL.optionalFields("Equipment", DSL.list(rTC.id_native.in(var0)));
   }

   protected static <T> T id_class(Dynamic<T> var0, Map<String, String> var1, String var2) {
      return (T)var0.update("tag", var3 -> var3.update("BlockEntityTag", var2xx -> {
            String var3x = var0.get("id").asString("");
            String var4 = (String)var1.get(rTA.id_class(var3x));
            if (var4 == null) {
               id_break.warn("Unable to resolve BlockEntity for ItemStack: {}", var3x);
               return var2xx;
            } else {
               return var2xx.set("id", var0.createString(var4));
            }
         }).update("EntityTag", var2xx -> {
            String var3x = var0.get("id").asString("");
            return Objects.equals(rTA.id_class(var3x), "minecraft:armor_stand") ? var2xx.set("id", var0.createString(var2)) : var2xx;
         })).getValue();
   }

   protected static void id_break(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("inTile", rTC.id_new.in(var0)));
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      var1.registerType(false, rTC.id_class, DSL::remainder);
      var1.registerType(
         false, rTC.id_break, () -> DSL.optionalFields("Inventory", DSL.list(rTC.id_native.in(var1)), "EnderItems", DSL.list(rTC.id_native.in(var1)))
      );
      var1.registerType(
         false,
         rTC.id_byte,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(rTC.id_package.in(var1)),
                  "TileEntities",
                  DSL.list(rTC.id_extends.in(var1)),
                  "TileTicks",
                  DSL.list(DSL.fields("i", rTC.id_new.in(var1)))
               )
            )
      );
      var1.registerType(true, rTC.id_extends, () -> DSL.taggedChoiceLazy("id", DSL.string(), var3));
      var1.registerType(true, rTC.id_package, () -> DSL.optionalFields("Riding", rTC.id_package.in(var1), rTC.id_int.in(var1)));
      var1.registerType(false, rTC.id_final, () -> DSL.constType(rTA.id_class()));
      var1.registerType(true, rTC.id_int, () -> DSL.taggedChoiceLazy("id", DSL.string(), var2));
      var1.registerType(
         true,
         rTC.id_native,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  DSL.or(DSL.constType(DSL.intType()), rTC.id_continue.in(var1)),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     rTC.id_package.in(var1),
                     "BlockEntityTag",
                     rTC.id_extends.in(var1),
                     "CanDestroy",
                     DSL.list(rTC.id_new.in(var1)),
                     "CanPlaceOn",
                     DSL.list(rTC.id_new.in(var1))
                  )
               ),
               id_class,
               HookFunction.IDENTITY
            )
      );
      var1.registerType(false, rTC.id_throws, DSL::remainder);
      var1.registerType(false, rTC.id_new, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(rTA.id_class())));
      var1.registerType(false, rTC.id_continue, () -> DSL.constType(rTA.id_class()));
      var1.registerType(false, rTC.id_catch, DSL::remainder);
      var1.registerType(
         false,
         rTC.id_private,
         () -> DSL.optionalFields(
               "data",
               DSL.optionalFields(
                  "Features",
                  DSL.compoundList(rTC.id_this.in(var1)),
                  "Objectives",
                  DSL.list(rTC.id_else.in(var1)),
                  "Teams",
                  DSL.list(rTC.id_synchronized.in(var1))
               )
            )
      );
      var1.registerType(false, rTC.id_this, DSL::remainder);
      var1.registerType(false, rTC.id_else, DSL::remainder);
      var1.registerType(false, rTC.id_synchronized, DSL::remainder);
      var1.registerType(true, rTC.id_super, DSL::remainder);
      var1.registerType(false, rTC.id_finally, DSL::remainder);
      var1.registerType(true, rTC.id_goto, DSL::remainder);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap var2 = Maps.newHashMap();
      var1.register(var2, "Item", var1x -> DSL.optionalFields("Item", rTC.id_native.in(var1)));
      var1.registerSimple(var2, "XPOrb");
      id_break(var1, var2, "ThrownEgg");
      var1.registerSimple(var2, "LeashKnot");
      var1.registerSimple(var2, "Painting");
      var1.register(var2, "Arrow", var1x -> DSL.optionalFields("inTile", rTC.id_new.in(var1)));
      var1.register(var2, "TippedArrow", var1x -> DSL.optionalFields("inTile", rTC.id_new.in(var1)));
      var1.register(var2, "SpectralArrow", var1x -> DSL.optionalFields("inTile", rTC.id_new.in(var1)));
      id_break(var1, var2, "Snowball");
      id_break(var1, var2, "Fireball");
      id_break(var1, var2, "SmallFireball");
      id_break(var1, var2, "ThrownEnderpearl");
      var1.registerSimple(var2, "EyeOfEnderSignal");
      var1.register(var2, "ThrownPotion", var1x -> DSL.optionalFields("inTile", rTC.id_new.in(var1), "Potion", rTC.id_native.in(var1)));
      id_break(var1, var2, "ThrownExpBottle");
      var1.register(var2, "ItemFrame", var1x -> DSL.optionalFields("Item", rTC.id_native.in(var1)));
      id_break(var1, var2, "WitherSkull");
      var1.registerSimple(var2, "PrimedTnt");
      var1.register(var2, "FallingSand", var1x -> DSL.optionalFields("Block", rTC.id_new.in(var1), "TileEntityData", rTC.id_extends.in(var1)));
      var1.register(var2, "FireworksRocketEntity", var1x -> DSL.optionalFields("FireworksItem", rTC.id_native.in(var1)));
      var1.registerSimple(var2, "Boat");
      var1.register(var2, "Minecart", () -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1), "Items", DSL.list(rTC.id_native.in(var1))));
      id_byte(var1, var2, "MinecartRideable");
      var1.register(var2, "MinecartChest", var1x -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1), "Items", DSL.list(rTC.id_native.in(var1))));
      id_byte(var1, var2, "MinecartFurnace");
      id_byte(var1, var2, "MinecartTNT");
      var1.register(var2, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1), rTC.id_super.in(var1)));
      var1.register(var2, "MinecartHopper", var1x -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1), "Items", DSL.list(rTC.id_native.in(var1))));
      id_byte(var1, var2, "MinecartCommandBlock");
      id_class(var1, var2, "ArmorStand");
      id_class(var1, var2, "Creeper");
      id_class(var1, var2, "Skeleton");
      id_class(var1, var2, "Spider");
      id_class(var1, var2, "Giant");
      id_class(var1, var2, "Zombie");
      id_class(var1, var2, "Slime");
      id_class(var1, var2, "Ghast");
      id_class(var1, var2, "PigZombie");
      var1.register(var2, "Enderman", var1x -> DSL.optionalFields("carried", rTC.id_new.in(var1), id_class(var1)));
      id_class(var1, var2, "CaveSpider");
      id_class(var1, var2, "Silverfish");
      id_class(var1, var2, "Blaze");
      id_class(var1, var2, "LavaSlime");
      id_class(var1, var2, "EnderDragon");
      id_class(var1, var2, "WitherBoss");
      id_class(var1, var2, "Bat");
      id_class(var1, var2, "Witch");
      id_class(var1, var2, "Endermite");
      id_class(var1, var2, "Guardian");
      id_class(var1, var2, "Pig");
      id_class(var1, var2, "Sheep");
      id_class(var1, var2, "Cow");
      id_class(var1, var2, "Chicken");
      id_class(var1, var2, "Squid");
      id_class(var1, var2, "Wolf");
      id_class(var1, var2, "MushroomCow");
      id_class(var1, var2, "SnowMan");
      id_class(var1, var2, "Ozelot");
      id_class(var1, var2, "VillagerGolem");
      var1.register(
         var2,
         "EntityHorse",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(rTC.id_native.in(var1)), "ArmorItem", rTC.id_native.in(var1), "SaddleItem", rTC.id_native.in(var1), id_class(var1)
            )
      );
      id_class(var1, var2, "Rabbit");
      var1.register(
         var2,
         "Villager",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(rTC.id_native.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes", DSL.list(DSL.optionalFields("buy", rTC.id_native.in(var1), "buyB", rTC.id_native.in(var1), "sell", rTC.id_native.in(var1)))
               ),
               id_class(var1)
            )
      );
      var1.registerSimple(var2, "EnderCrystal");
      var1.registerSimple(var2, "AreaEffectCloud");
      var1.registerSimple(var2, "ShulkerBullet");
      id_class(var1, var2, "Shulker");
      return var2;
   }

   protected static void id_protected(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("Items", DSL.list(rTC.id_native.in(var0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      HashMap var2 = Maps.newHashMap();
      id_protected(var1, var2, "Furnace");
      id_protected(var1, var2, "Chest");
      var1.registerSimple(var2, "EnderChest");
      var1.register(var2, "RecordPlayer", var1x -> DSL.optionalFields("RecordItem", rTC.id_native.in(var1)));
      id_protected(var1, var2, "Trap");
      id_protected(var1, var2, "Dropper");
      var1.registerSimple(var2, "Sign");
      var1.register(var2, "MobSpawner", var1x -> rTC.id_super.in(var1));
      var1.registerSimple(var2, "Music");
      var1.registerSimple(var2, "Piston");
      id_protected(var1, var2, "Cauldron");
      var1.registerSimple(var2, "EnchantTable");
      var1.registerSimple(var2, "Airportal");
      var1.registerSimple(var2, "Control");
      var1.registerSimple(var2, "Beacon");
      var1.registerSimple(var2, "Skull");
      var1.registerSimple(var2, "DLDetector");
      id_protected(var1, var2, "Hopper");
      var1.registerSimple(var2, "Comparator");
      var1.register(var2, "FlowerPot", var1x -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), rTC.id_continue.in(var1))));
      var1.registerSimple(var2, "Banner");
      var1.registerSimple(var2, "Structure");
      var1.registerSimple(var2, "EndGateway");
      return var2;
   }
}
