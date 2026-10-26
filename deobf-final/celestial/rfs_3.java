package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class rfs_3 extends rTA {
   public rfs_3(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void class_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> rIl_1.class_(var0));
   }

   protected static void break_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("Items", DSL.list(rTC.native_.in(var0))));
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      var1.registerType(false, rTC.class_, DSL::remainder);
      var1.registerType(false, rTC.return_, () -> DSL.constType(class_()));
      var1.registerType(
         false,
         rTC.break_,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", rTC.package_.in(var1)),
               "Inventory",
               DSL.list(rTC.native_.in(var1)),
               "EnderItems",
               DSL.list(rTC.native_.in(var1)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  rTC.package_.in(var1),
                  "ShoulderEntityRight",
                  rTC.package_.in(var1),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(rTC.return_.in(var1)), "toBeDisplayed", DSL.list(rTC.return_.in(var1)))
               )
            )
      );
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
                  DSL.list(DSL.fields("i", rTC.new_.in(var1))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(rTC.volatile_.in(var1))))
               )
            )
      );
      var1.registerType(true, rTC.extends_, () -> DSL.taggedChoiceLazy("id", class_(), var3));
      var1.registerType(true, rTC.package_, () -> DSL.optionalFields("Passengers", DSL.list(rTC.package_.in(var1)), rTC.int_.in(var1)));
      var1.registerType(true, rTC.int_, () -> DSL.taggedChoiceLazy("id", class_(), var2));
      var1.registerType(
         true,
         rTC.native_,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  rTC.continue_.in(var1),
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
               rIR.break_,
               HookFunction.IDENTITY
            )
      );
      var1.registerType(false, rTC.protected_, () -> DSL.compoundList(DSL.list(rTC.native_.in(var1))));
      var1.registerType(false, rTC.throws_, DSL::remainder);
      var1.registerType(
         false,
         rTC.case_,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", rTC.package_.in(var1))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", rTC.extends_.in(var1))),
               "palette",
               DSL.list(rTC.volatile_.in(var1))
            )
      );
      var1.registerType(false, rTC.new_, () -> DSL.constType(class_()));
      var1.registerType(false, rTC.continue_, () -> DSL.constType(class_()));
      var1.registerType(false, rTC.volatile_, DSL::remainder);
      Supplier var4 = () -> DSL.compoundList(rTC.continue_.in(var1), DSL.constType(DSL.intType()));
      var1.registerType(
         false,
         rTC.catch_,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  "minecraft:mined",
                  DSL.compoundList(rTC.new_.in(var1), DSL.constType(DSL.intType())),
                  "minecraft:crafted",
                  (TypeTemplate)var4.get(),
                  "minecraft:used",
                  (TypeTemplate)var4.get(),
                  "minecraft:broken",
                  (TypeTemplate)var4.get(),
                  "minecraft:picked_up",
                  (TypeTemplate)var4.get(),
                  DSL.optionalFields(
                     "minecraft:dropped",
                     (TypeTemplate)var4.get(),
                     "minecraft:killed",
                     DSL.compoundList(rTC.final_.in(var1), DSL.constType(DSL.intType())),
                     "minecraft:killed_by",
                     DSL.compoundList(rTC.final_.in(var1), DSL.constType(DSL.intType())),
                     "minecraft:custom",
                     DSL.compoundList(DSL.constType(class_()), DSL.constType(DSL.intType()))
                  )
               )
            )
      );
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
      var1.registerType(
         false,
         rTC.this_,
         () -> DSL.optionalFields(
               "Children",
               DSL.list(
                  DSL.optionalFields("CA", rTC.volatile_.in(var1), "CB", rTC.volatile_.in(var1), "CC", rTC.volatile_.in(var1), "CD", rTC.volatile_.in(var1))
               )
            )
      );
      var1.registerType(false, rTC.else_, DSL::remainder);
      var1.registerType(false, rTC.synchronized_, DSL::remainder);
      var1.registerType(
         true,
         rTC.super_,
         () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", rTC.package_.in(var1))), "SpawnData", rTC.package_.in(var1))
      );
      var1.registerType(
         false,
         rTC.implements_,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(rTC.public_.in(var1), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(rTC.final_.in(var1), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(rTC.final_.in(var1), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(rTC.final_.in(var1), DSL.constType(DSL.string())))
            )
      );
      var1.registerType(false, rTC.public_, () -> DSL.constType(class_()));
      var1.registerType(false, rTC.final_, () -> DSL.constType(class_()));
      var1.registerType(false, rTC.finally_, DSL::remainder);
      var1.registerType(true, rTC.goto_, DSL::remainder);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap var2 = Maps.newHashMap();
      var1.registerSimple(var2, "minecraft:area_effect_cloud");
      class_(var1, var2, "minecraft:armor_stand");
      var1.register(var2, "minecraft:arrow", var1x -> DSL.optionalFields("inBlockState", rTC.volatile_.in(var1)));
      class_(var1, var2, "minecraft:bat");
      class_(var1, var2, "minecraft:blaze");
      var1.registerSimple(var2, "minecraft:boat");
      class_(var1, var2, "minecraft:cave_spider");
      var1.register(
         var2, "minecraft:chest_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1), "Items", DSL.list(rTC.native_.in(var1)))
      );
      class_(var1, var2, "minecraft:chicken");
      var1.register(var2, "minecraft:commandblock_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1)));
      class_(var1, var2, "minecraft:cow");
      class_(var1, var2, "minecraft:creeper");
      var1.register(
         var2, "minecraft:donkey", var1x -> DSL.optionalFields("Items", DSL.list(rTC.native_.in(var1)), "SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1))
      );
      var1.registerSimple(var2, "minecraft:dragon_fireball");
      var1.registerSimple(var2, "minecraft:egg");
      class_(var1, var2, "minecraft:elder_guardian");
      var1.registerSimple(var2, "minecraft:ender_crystal");
      class_(var1, var2, "minecraft:ender_dragon");
      var1.register(var2, "minecraft:enderman", var1x -> DSL.optionalFields("carriedBlockState", rTC.volatile_.in(var1), rIl_1.class_(var1)));
      class_(var1, var2, "minecraft:endermite");
      var1.registerSimple(var2, "minecraft:ender_pearl");
      var1.registerSimple(var2, "minecraft:evocation_fangs");
      class_(var1, var2, "minecraft:evocation_illager");
      var1.registerSimple(var2, "minecraft:eye_of_ender_signal");
      var1.register(var2, "minecraft:falling_block", var1x -> DSL.optionalFields("BlockState", rTC.volatile_.in(var1), "TileEntityData", rTC.extends_.in(var1)));
      var1.registerSimple(var2, "minecraft:fireball");
      var1.register(var2, "minecraft:fireworks_rocket", var1x -> DSL.optionalFields("FireworksItem", rTC.native_.in(var1)));
      var1.register(var2, "minecraft:furnace_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1)));
      class_(var1, var2, "minecraft:ghast");
      class_(var1, var2, "minecraft:giant");
      class_(var1, var2, "minecraft:guardian");
      var1.register(
         var2, "minecraft:hopper_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1), "Items", DSL.list(rTC.native_.in(var1)))
      );
      var1.register(
         var2, "minecraft:horse", var1x -> DSL.optionalFields("ArmorItem", rTC.native_.in(var1), "SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1))
      );
      class_(var1, var2, "minecraft:husk");
      var1.registerSimple(var2, "minecraft:illusion_illager");
      var1.register(var2, "minecraft:item", var1x -> DSL.optionalFields("Item", rTC.native_.in(var1)));
      var1.register(var2, "minecraft:item_frame", var1x -> DSL.optionalFields("Item", rTC.native_.in(var1)));
      var1.registerSimple(var2, "minecraft:leash_knot");
      var1.register(
         var2,
         "minecraft:llama",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(rTC.native_.in(var1)), "SaddleItem", rTC.native_.in(var1), "DecorItem", rTC.native_.in(var1), rIl_1.class_(var1)
            )
      );
      var1.registerSimple(var2, "minecraft:llama_spit");
      class_(var1, var2, "minecraft:magma_cube");
      var1.register(var2, "minecraft:minecart", var1x -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1)));
      class_(var1, var2, "minecraft:mooshroom");
      var1.register(
         var2, "minecraft:mule", var1x -> DSL.optionalFields("Items", DSL.list(rTC.native_.in(var1)), "SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1))
      );
      class_(var1, var2, "minecraft:ocelot");
      var1.registerSimple(var2, "minecraft:painting");
      var1.registerSimple(var2, "minecraft:parrot");
      class_(var1, var2, "minecraft:pig");
      class_(var1, var2, "minecraft:polar_bear");
      var1.register(var2, "minecraft:potion", var1x -> DSL.optionalFields("Potion", rTC.native_.in(var1)));
      class_(var1, var2, "minecraft:rabbit");
      class_(var1, var2, "minecraft:sheep");
      class_(var1, var2, "minecraft:shulker");
      var1.registerSimple(var2, "minecraft:shulker_bullet");
      class_(var1, var2, "minecraft:silverfish");
      class_(var1, var2, "minecraft:skeleton");
      var1.register(var2, "minecraft:skeleton_horse", var1x -> DSL.optionalFields("SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1)));
      class_(var1, var2, "minecraft:slime");
      var1.registerSimple(var2, "minecraft:small_fireball");
      var1.registerSimple(var2, "minecraft:snowball");
      class_(var1, var2, "minecraft:snowman");
      var1.register(var2, "minecraft:spawner_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1), rTC.super_.in(var1)));
      var1.register(var2, "minecraft:spectral_arrow", var1x -> DSL.optionalFields("inBlockState", rTC.volatile_.in(var1)));
      class_(var1, var2, "minecraft:spider");
      class_(var1, var2, "minecraft:squid");
      class_(var1, var2, "minecraft:stray");
      var1.registerSimple(var2, "minecraft:tnt");
      var1.register(var2, "minecraft:tnt_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1)));
      class_(var1, var2, "minecraft:vex");
      var1.register(
         var2,
         "minecraft:villager",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(rTC.native_.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes", DSL.list(DSL.optionalFields("buy", rTC.native_.in(var1), "buyB", rTC.native_.in(var1), "sell", rTC.native_.in(var1)))
               ),
               rIl_1.class_(var1)
            )
      );
      class_(var1, var2, "minecraft:villager_golem");
      class_(var1, var2, "minecraft:vindication_illager");
      class_(var1, var2, "minecraft:witch");
      class_(var1, var2, "minecraft:wither");
      class_(var1, var2, "minecraft:wither_skeleton");
      var1.registerSimple(var2, "minecraft:wither_skull");
      class_(var1, var2, "minecraft:wolf");
      var1.registerSimple(var2, "minecraft:xp_bottle");
      var1.registerSimple(var2, "minecraft:xp_orb");
      class_(var1, var2, "minecraft:zombie");
      var1.register(var2, "minecraft:zombie_horse", var1x -> DSL.optionalFields("SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1)));
      class_(var1, var2, "minecraft:zombie_pigman");
      class_(var1, var2, "minecraft:zombie_villager");
      return var2;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      HashMap var2 = Maps.newHashMap();
      break_(var1, var2, "minecraft:furnace");
      break_(var1, var2, "minecraft:chest");
      break_(var1, var2, "minecraft:trapped_chest");
      var1.registerSimple(var2, "minecraft:ender_chest");
      var1.register(var2, "minecraft:jukebox", var1x -> DSL.optionalFields("RecordItem", rTC.native_.in(var1)));
      break_(var1, var2, "minecraft:dispenser");
      break_(var1, var2, "minecraft:dropper");
      var1.registerSimple(var2, "minecraft:sign");
      var1.register(var2, "minecraft:mob_spawner", var1x -> rTC.super_.in(var1));
      var1.register(var2, "minecraft:piston", var1x -> DSL.optionalFields("blockState", rTC.volatile_.in(var1)));
      break_(var1, var2, "minecraft:brewing_stand");
      var1.registerSimple(var2, "minecraft:enchanting_table");
      var1.registerSimple(var2, "minecraft:end_portal");
      var1.registerSimple(var2, "minecraft:beacon");
      var1.registerSimple(var2, "minecraft:skull");
      var1.registerSimple(var2, "minecraft:daylight_detector");
      break_(var1, var2, "minecraft:hopper");
      var1.registerSimple(var2, "minecraft:comparator");
      var1.registerSimple(var2, "minecraft:banner");
      var1.registerSimple(var2, "minecraft:structure_block");
      var1.registerSimple(var2, "minecraft:end_gateway");
      var1.registerSimple(var2, "minecraft:command_block");
      break_(var1, var2, "minecraft:shulker_box");
      var1.registerSimple(var2, "minecraft:bed");
      return var2;
   }
}
