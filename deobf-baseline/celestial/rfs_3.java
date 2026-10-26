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

   protected static void id_class(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> rIl_1.id_class(var0));
   }

   protected static void id_break(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("Items", DSL.list(rTC.id_native.in(var0))));
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      var1.registerType(false, rTC.id_class, DSL::remainder);
      var1.registerType(false, rTC.id_return, () -> DSL.constType(id_class()));
      var1.registerType(
         false,
         rTC.id_break,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", rTC.id_package.in(var1)),
               "Inventory",
               DSL.list(rTC.id_native.in(var1)),
               "EnderItems",
               DSL.list(rTC.id_native.in(var1)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  rTC.id_package.in(var1),
                  "ShoulderEntityRight",
                  rTC.id_package.in(var1),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(rTC.id_return.in(var1)), "toBeDisplayed", DSL.list(rTC.id_return.in(var1)))
               )
            )
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
                  DSL.list(DSL.fields("i", rTC.id_new.in(var1))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(rTC.id_volatile.in(var1))))
               )
            )
      );
      var1.registerType(true, rTC.id_extends, () -> DSL.taggedChoiceLazy("id", id_class(), var3));
      var1.registerType(true, rTC.id_package, () -> DSL.optionalFields("Passengers", DSL.list(rTC.id_package.in(var1)), rTC.id_int.in(var1)));
      var1.registerType(true, rTC.id_int, () -> DSL.taggedChoiceLazy("id", id_class(), var2));
      var1.registerType(
         true,
         rTC.id_native,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  rTC.id_continue.in(var1),
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
               rIR.id_break,
               HookFunction.IDENTITY
            )
      );
      var1.registerType(false, rTC.id_protected, () -> DSL.compoundList(DSL.list(rTC.id_native.in(var1))));
      var1.registerType(false, rTC.id_throws, DSL::remainder);
      var1.registerType(
         false,
         rTC.id_case,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", rTC.id_package.in(var1))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", rTC.id_extends.in(var1))),
               "palette",
               DSL.list(rTC.id_volatile.in(var1))
            )
      );
      var1.registerType(false, rTC.id_new, () -> DSL.constType(id_class()));
      var1.registerType(false, rTC.id_continue, () -> DSL.constType(id_class()));
      var1.registerType(false, rTC.id_volatile, DSL::remainder);
      Supplier var4 = () -> DSL.compoundList(rTC.id_continue.in(var1), DSL.constType(DSL.intType()));
      var1.registerType(
         false,
         rTC.id_catch,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  "minecraft:mined",
                  DSL.compoundList(rTC.id_new.in(var1), DSL.constType(DSL.intType())),
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
                     DSL.compoundList(rTC.id_final.in(var1), DSL.constType(DSL.intType())),
                     "minecraft:killed_by",
                     DSL.compoundList(rTC.id_final.in(var1), DSL.constType(DSL.intType())),
                     "minecraft:custom",
                     DSL.compoundList(DSL.constType(id_class()), DSL.constType(DSL.intType()))
                  )
               )
            )
      );
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
      var1.registerType(
         false,
         rTC.id_this,
         () -> DSL.optionalFields(
               "Children",
               DSL.list(
                  DSL.optionalFields(
                     "CA", rTC.id_volatile.in(var1), "CB", rTC.id_volatile.in(var1), "CC", rTC.id_volatile.in(var1), "CD", rTC.id_volatile.in(var1)
                  )
               )
            )
      );
      var1.registerType(false, rTC.id_else, DSL::remainder);
      var1.registerType(false, rTC.id_synchronized, DSL::remainder);
      var1.registerType(
         true,
         rTC.id_super,
         () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", rTC.id_package.in(var1))), "SpawnData", rTC.id_package.in(var1))
      );
      var1.registerType(
         false,
         rTC.id_implements,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(rTC.id_public.in(var1), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(rTC.id_final.in(var1), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(rTC.id_final.in(var1), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(rTC.id_final.in(var1), DSL.constType(DSL.string())))
            )
      );
      var1.registerType(false, rTC.id_public, () -> DSL.constType(id_class()));
      var1.registerType(false, rTC.id_final, () -> DSL.constType(id_class()));
      var1.registerType(false, rTC.id_finally, DSL::remainder);
      var1.registerType(true, rTC.id_goto, DSL::remainder);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap var2 = Maps.newHashMap();
      var1.registerSimple(var2, "minecraft:area_effect_cloud");
      id_class(var1, var2, "minecraft:armor_stand");
      var1.register(var2, "minecraft:arrow", var1x -> DSL.optionalFields("inBlockState", rTC.id_volatile.in(var1)));
      id_class(var1, var2, "minecraft:bat");
      id_class(var1, var2, "minecraft:blaze");
      var1.registerSimple(var2, "minecraft:boat");
      id_class(var1, var2, "minecraft:cave_spider");
      var1.register(
         var2, "minecraft:chest_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.id_volatile.in(var1), "Items", DSL.list(rTC.id_native.in(var1)))
      );
      id_class(var1, var2, "minecraft:chicken");
      var1.register(var2, "minecraft:commandblock_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.id_volatile.in(var1)));
      id_class(var1, var2, "minecraft:cow");
      id_class(var1, var2, "minecraft:creeper");
      var1.register(
         var2,
         "minecraft:donkey",
         var1x -> DSL.optionalFields("Items", DSL.list(rTC.id_native.in(var1)), "SaddleItem", rTC.id_native.in(var1), rIl_1.id_class(var1))
      );
      var1.registerSimple(var2, "minecraft:dragon_fireball");
      var1.registerSimple(var2, "minecraft:egg");
      id_class(var1, var2, "minecraft:elder_guardian");
      var1.registerSimple(var2, "minecraft:ender_crystal");
      id_class(var1, var2, "minecraft:ender_dragon");
      var1.register(var2, "minecraft:enderman", var1x -> DSL.optionalFields("carriedBlockState", rTC.id_volatile.in(var1), rIl_1.id_class(var1)));
      id_class(var1, var2, "minecraft:endermite");
      var1.registerSimple(var2, "minecraft:ender_pearl");
      var1.registerSimple(var2, "minecraft:evocation_fangs");
      id_class(var1, var2, "minecraft:evocation_illager");
      var1.registerSimple(var2, "minecraft:eye_of_ender_signal");
      var1.register(
         var2, "minecraft:falling_block", var1x -> DSL.optionalFields("BlockState", rTC.id_volatile.in(var1), "TileEntityData", rTC.id_extends.in(var1))
      );
      var1.registerSimple(var2, "minecraft:fireball");
      var1.register(var2, "minecraft:fireworks_rocket", var1x -> DSL.optionalFields("FireworksItem", rTC.id_native.in(var1)));
      var1.register(var2, "minecraft:furnace_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.id_volatile.in(var1)));
      id_class(var1, var2, "minecraft:ghast");
      id_class(var1, var2, "minecraft:giant");
      id_class(var1, var2, "minecraft:guardian");
      var1.register(
         var2, "minecraft:hopper_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.id_volatile.in(var1), "Items", DSL.list(rTC.id_native.in(var1)))
      );
      var1.register(
         var2, "minecraft:horse", var1x -> DSL.optionalFields("ArmorItem", rTC.id_native.in(var1), "SaddleItem", rTC.id_native.in(var1), rIl_1.id_class(var1))
      );
      id_class(var1, var2, "minecraft:husk");
      var1.registerSimple(var2, "minecraft:illusion_illager");
      var1.register(var2, "minecraft:item", var1x -> DSL.optionalFields("Item", rTC.id_native.in(var1)));
      var1.register(var2, "minecraft:item_frame", var1x -> DSL.optionalFields("Item", rTC.id_native.in(var1)));
      var1.registerSimple(var2, "minecraft:leash_knot");
      var1.register(
         var2,
         "minecraft:llama",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(rTC.id_native.in(var1)), "SaddleItem", rTC.id_native.in(var1), "DecorItem", rTC.id_native.in(var1), rIl_1.id_class(var1)
            )
      );
      var1.registerSimple(var2, "minecraft:llama_spit");
      id_class(var1, var2, "minecraft:magma_cube");
      var1.register(var2, "minecraft:minecart", var1x -> DSL.optionalFields("DisplayState", rTC.id_volatile.in(var1)));
      id_class(var1, var2, "minecraft:mooshroom");
      var1.register(
         var2,
         "minecraft:mule",
         var1x -> DSL.optionalFields("Items", DSL.list(rTC.id_native.in(var1)), "SaddleItem", rTC.id_native.in(var1), rIl_1.id_class(var1))
      );
      id_class(var1, var2, "minecraft:ocelot");
      var1.registerSimple(var2, "minecraft:painting");
      var1.registerSimple(var2, "minecraft:parrot");
      id_class(var1, var2, "minecraft:pig");
      id_class(var1, var2, "minecraft:polar_bear");
      var1.register(var2, "minecraft:potion", var1x -> DSL.optionalFields("Potion", rTC.id_native.in(var1)));
      id_class(var1, var2, "minecraft:rabbit");
      id_class(var1, var2, "minecraft:sheep");
      id_class(var1, var2, "minecraft:shulker");
      var1.registerSimple(var2, "minecraft:shulker_bullet");
      id_class(var1, var2, "minecraft:silverfish");
      id_class(var1, var2, "minecraft:skeleton");
      var1.register(var2, "minecraft:skeleton_horse", var1x -> DSL.optionalFields("SaddleItem", rTC.id_native.in(var1), rIl_1.id_class(var1)));
      id_class(var1, var2, "minecraft:slime");
      var1.registerSimple(var2, "minecraft:small_fireball");
      var1.registerSimple(var2, "minecraft:snowball");
      id_class(var1, var2, "minecraft:snowman");
      var1.register(var2, "minecraft:spawner_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.id_volatile.in(var1), rTC.id_super.in(var1)));
      var1.register(var2, "minecraft:spectral_arrow", var1x -> DSL.optionalFields("inBlockState", rTC.id_volatile.in(var1)));
      id_class(var1, var2, "minecraft:spider");
      id_class(var1, var2, "minecraft:squid");
      id_class(var1, var2, "minecraft:stray");
      var1.registerSimple(var2, "minecraft:tnt");
      var1.register(var2, "minecraft:tnt_minecart", var1x -> DSL.optionalFields("DisplayState", rTC.id_volatile.in(var1)));
      id_class(var1, var2, "minecraft:vex");
      var1.register(
         var2,
         "minecraft:villager",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(rTC.id_native.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes", DSL.list(DSL.optionalFields("buy", rTC.id_native.in(var1), "buyB", rTC.id_native.in(var1), "sell", rTC.id_native.in(var1)))
               ),
               rIl_1.id_class(var1)
            )
      );
      id_class(var1, var2, "minecraft:villager_golem");
      id_class(var1, var2, "minecraft:vindication_illager");
      id_class(var1, var2, "minecraft:witch");
      id_class(var1, var2, "minecraft:wither");
      id_class(var1, var2, "minecraft:wither_skeleton");
      var1.registerSimple(var2, "minecraft:wither_skull");
      id_class(var1, var2, "minecraft:wolf");
      var1.registerSimple(var2, "minecraft:xp_bottle");
      var1.registerSimple(var2, "minecraft:xp_orb");
      id_class(var1, var2, "minecraft:zombie");
      var1.register(var2, "minecraft:zombie_horse", var1x -> DSL.optionalFields("SaddleItem", rTC.id_native.in(var1), rIl_1.id_class(var1)));
      id_class(var1, var2, "minecraft:zombie_pigman");
      id_class(var1, var2, "minecraft:zombie_villager");
      return var2;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      HashMap var2 = Maps.newHashMap();
      id_break(var1, var2, "minecraft:furnace");
      id_break(var1, var2, "minecraft:chest");
      id_break(var1, var2, "minecraft:trapped_chest");
      var1.registerSimple(var2, "minecraft:ender_chest");
      var1.register(var2, "minecraft:jukebox", var1x -> DSL.optionalFields("RecordItem", rTC.id_native.in(var1)));
      id_break(var1, var2, "minecraft:dispenser");
      id_break(var1, var2, "minecraft:dropper");
      var1.registerSimple(var2, "minecraft:sign");
      var1.register(var2, "minecraft:mob_spawner", var1x -> rTC.id_super.in(var1));
      var1.register(var2, "minecraft:piston", var1x -> DSL.optionalFields("blockState", rTC.id_volatile.in(var1)));
      id_break(var1, var2, "minecraft:brewing_stand");
      var1.registerSimple(var2, "minecraft:enchanting_table");
      var1.registerSimple(var2, "minecraft:end_portal");
      var1.registerSimple(var2, "minecraft:beacon");
      var1.registerSimple(var2, "minecraft:skull");
      var1.registerSimple(var2, "minecraft:daylight_detector");
      id_break(var1, var2, "minecraft:hopper");
      var1.registerSimple(var2, "minecraft:comparator");
      var1.registerSimple(var2, "minecraft:banner");
      var1.registerSimple(var2, "minecraft:structure_block");
      var1.registerSimple(var2, "minecraft:end_gateway");
      var1.registerSimple(var2, "minecraft:command_block");
      id_break(var1, var2, "minecraft:shulker_box");
      var1.registerSimple(var2, "minecraft:bed");
      return var2;
   }
}
