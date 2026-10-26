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
   private static final Logger break_ = LogManager.getLogger();
   static final Map<String, String> byte_ = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
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
   protected static final HookFunction class_ = new rIC();

   protected static void byte_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("DisplayTile", rTC.new_.in(var0)));
   }

   public rIn_1(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void class_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> class_(var0));
   }

   protected static TypeTemplate class_(Schema var0) {
      return DSL.optionalFields("Equipment", DSL.list(rTC.native_.in(var0)));
   }

   protected static <T> T class_(Dynamic<T> var0, Map<String, String> var1, String var2) {
      return (T)var0.update("tag", var3 -> var3.update("BlockEntityTag", var2xx -> {
            String var3x = var0.get("id").asString("");
            String var4 = (String)var1.get(rTA.class_(var3x));
            if (var4 == null) {
               break_.warn("Unable to resolve BlockEntity for ItemStack: {}", var3x);
               return var2xx;
            } else {
               return var2xx.set("id", var0.createString(var4));
            }
         }).update("EntityTag", var2xx -> {
            String var3x = var0.get("id").asString("");
            return Objects.equals(rTA.class_(var3x), "minecraft:armor_stand") ? var2xx.set("id", var0.createString(var2)) : var2xx;
         })).getValue();
   }

   protected static void break_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("inTile", rTC.new_.in(var0)));
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      var1.registerType(false, rTC.class_, DSL::remainder);
      var1.registerType(false, rTC.break_, () -> DSL.optionalFields("Inventory", DSL.list(rTC.native_.in(var1)), "EnderItems", DSL.list(rTC.native_.in(var1))));
      var1.registerType(
         false,
         rTC.byte_,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(rTC.package_.in(var1)),
                  "TileEntities",
                  DSL.list(rTC.extends_.in(var1)),
                  "TileTicks",
                  DSL.list(DSL.fields("i", rTC.new_.in(var1)))
               )
            )
      );
      var1.registerType(true, rTC.extends_, () -> DSL.taggedChoiceLazy("id", DSL.string(), var3));
      var1.registerType(true, rTC.package_, () -> DSL.optionalFields("Riding", rTC.package_.in(var1), rTC.int_.in(var1)));
      var1.registerType(false, rTC.final_, () -> DSL.constType(rTA.class_()));
      var1.registerType(true, rTC.int_, () -> DSL.taggedChoiceLazy("id", DSL.string(), var2));
      var1.registerType(
         true,
         rTC.native_,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  DSL.or(DSL.constType(DSL.intType()), rTC.continue_.in(var1)),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     rTC.package_.in(var1),
                     "BlockEntityTag",
                     rTC.extends_.in(var1),
                     "CanDestroy",
                     DSL.list(rTC.new_.in(var1)),
                     "CanPlaceOn",
                     DSL.list(rTC.new_.in(var1))
                  )
               ),
               class_,
               HookFunction.IDENTITY
            )
      );
      var1.registerType(false, rTC.throws_, DSL::remainder);
      var1.registerType(false, rTC.new_, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(rTA.class_())));
      var1.registerType(false, rTC.continue_, () -> DSL.constType(rTA.class_()));
      var1.registerType(false, rTC.catch_, DSL::remainder);
      var1.registerType(
         false,
         rTC.private_,
         () -> DSL.optionalFields(
               "data",
               DSL.optionalFields(
                  "Features", DSL.compoundList(rTC.this_.in(var1)), "Objectives", DSL.list(rTC.else_.in(var1)), "Teams", DSL.list(rTC.synchronized_.in(var1))
               )
            )
      );
      var1.registerType(false, rTC.this_, DSL::remainder);
      var1.registerType(false, rTC.else_, DSL::remainder);
      var1.registerType(false, rTC.synchronized_, DSL::remainder);
      var1.registerType(true, rTC.super_, DSL::remainder);
      var1.registerType(false, rTC.finally_, DSL::remainder);
      var1.registerType(true, rTC.goto_, DSL::remainder);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap var2 = Maps.newHashMap();
      var1.register(var2, "Item", var1x -> DSL.optionalFields("Item", rTC.native_.in(var1)));
      var1.registerSimple(var2, "XPOrb");
      break_(var1, var2, "ThrownEgg");
      var1.registerSimple(var2, "LeashKnot");
      var1.registerSimple(var2, "Painting");
      var1.register(var2, "Arrow", var1x -> DSL.optionalFields("inTile", rTC.new_.in(var1)));
      var1.register(var2, "TippedArrow", var1x -> DSL.optionalFields("inTile", rTC.new_.in(var1)));
      var1.register(var2, "SpectralArrow", var1x -> DSL.optionalFields("inTile", rTC.new_.in(var1)));
      break_(var1, var2, "Snowball");
      break_(var1, var2, "Fireball");
      break_(var1, var2, "SmallFireball");
      break_(var1, var2, "ThrownEnderpearl");
      var1.registerSimple(var2, "EyeOfEnderSignal");
      var1.register(var2, "ThrownPotion", var1x -> DSL.optionalFields("inTile", rTC.new_.in(var1), "Potion", rTC.native_.in(var1)));
      break_(var1, var2, "ThrownExpBottle");
      var1.register(var2, "ItemFrame", var1x -> DSL.optionalFields("Item", rTC.native_.in(var1)));
      break_(var1, var2, "WitherSkull");
      var1.registerSimple(var2, "PrimedTnt");
      var1.register(var2, "FallingSand", var1x -> DSL.optionalFields("Block", rTC.new_.in(var1), "TileEntityData", rTC.extends_.in(var1)));
      var1.register(var2, "FireworksRocketEntity", var1x -> DSL.optionalFields("FireworksItem", rTC.native_.in(var1)));
      var1.registerSimple(var2, "Boat");
      var1.register(var2, "Minecart", () -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1), "Items", DSL.list(rTC.native_.in(var1))));
      byte_(var1, var2, "MinecartRideable");
      var1.register(var2, "MinecartChest", var1x -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1), "Items", DSL.list(rTC.native_.in(var1))));
      byte_(var1, var2, "MinecartFurnace");
      byte_(var1, var2, "MinecartTNT");
      var1.register(var2, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1), rTC.super_.in(var1)));
      var1.register(var2, "MinecartHopper", var1x -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1), "Items", DSL.list(rTC.native_.in(var1))));
      byte_(var1, var2, "MinecartCommandBlock");
      class_(var1, var2, "ArmorStand");
      class_(var1, var2, "Creeper");
      class_(var1, var2, "Skeleton");
      class_(var1, var2, "Spider");
      class_(var1, var2, "Giant");
      class_(var1, var2, "Zombie");
      class_(var1, var2, "Slime");
      class_(var1, var2, "Ghast");
      class_(var1, var2, "PigZombie");
      var1.register(var2, "Enderman", var1x -> DSL.optionalFields("carried", rTC.new_.in(var1), class_(var1)));
      class_(var1, var2, "CaveSpider");
      class_(var1, var2, "Silverfish");
      class_(var1, var2, "Blaze");
      class_(var1, var2, "LavaSlime");
      class_(var1, var2, "EnderDragon");
      class_(var1, var2, "WitherBoss");
      class_(var1, var2, "Bat");
      class_(var1, var2, "Witch");
      class_(var1, var2, "Endermite");
      class_(var1, var2, "Guardian");
      class_(var1, var2, "Pig");
      class_(var1, var2, "Sheep");
      class_(var1, var2, "Cow");
      class_(var1, var2, "Chicken");
      class_(var1, var2, "Squid");
      class_(var1, var2, "Wolf");
      class_(var1, var2, "MushroomCow");
      class_(var1, var2, "SnowMan");
      class_(var1, var2, "Ozelot");
      class_(var1, var2, "VillagerGolem");
      var1.register(
         var2,
         "EntityHorse",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(rTC.native_.in(var1)), "ArmorItem", rTC.native_.in(var1), "SaddleItem", rTC.native_.in(var1), class_(var1)
            )
      );
      class_(var1, var2, "Rabbit");
      var1.register(
         var2,
         "Villager",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(rTC.native_.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes", DSL.list(DSL.optionalFields("buy", rTC.native_.in(var1), "buyB", rTC.native_.in(var1), "sell", rTC.native_.in(var1)))
               ),
               class_(var1)
            )
      );
      var1.registerSimple(var2, "EnderCrystal");
      var1.registerSimple(var2, "AreaEffectCloud");
      var1.registerSimple(var2, "ShulkerBullet");
      class_(var1, var2, "Shulker");
      return var2;
   }

   protected static void protected_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("Items", DSL.list(rTC.native_.in(var0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      HashMap var2 = Maps.newHashMap();
      protected_(var1, var2, "Furnace");
      protected_(var1, var2, "Chest");
      var1.registerSimple(var2, "EnderChest");
      var1.register(var2, "RecordPlayer", var1x -> DSL.optionalFields("RecordItem", rTC.native_.in(var1)));
      protected_(var1, var2, "Trap");
      protected_(var1, var2, "Dropper");
      var1.registerSimple(var2, "Sign");
      var1.register(var2, "MobSpawner", var1x -> rTC.super_.in(var1));
      var1.registerSimple(var2, "Music");
      var1.registerSimple(var2, "Piston");
      protected_(var1, var2, "Cauldron");
      var1.registerSimple(var2, "EnchantTable");
      var1.registerSimple(var2, "Airportal");
      var1.registerSimple(var2, "Control");
      var1.registerSimple(var2, "Beacon");
      var1.registerSimple(var2, "Skull");
      var1.registerSimple(var2, "DLDetector");
      protected_(var1, var2, "Hopper");
      var1.registerSimple(var2, "Comparator");
      var1.register(var2, "FlowerPot", var1x -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), rTC.continue_.in(var1))));
      var1.registerSimple(var2, "Banner");
      var1.registerSimple(var2, "Structure");
      var1.registerSimple(var2, "EndGateway");
      return var2;
   }
}
