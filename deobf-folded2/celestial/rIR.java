package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class rIR extends rTA {
   protected static final HookFunction id_break = new rIY();

   public rIR(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void id_class(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> rIl_1.id_class(var0));
   }

   protected static void id_break(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("inTile", rTC.id_new.in(var0)));
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
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
               id_break,
               HookFunction.IDENTITY
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap var2 = Maps.newHashMap();
      var1.registerSimple(var2, "minecraft:area_effect_cloud");
      id_class(var1, var2, "minecraft:armor_stand");
      var1.register(var2, "minecraft:arrow", var1x -> DSL.optionalFields("inTile", rTC.id_new.in(var1)));
      id_class(var1, var2, "minecraft:bat");
      id_class(var1, var2, "minecraft:blaze");
      var1.registerSimple(var2, "minecraft:boat");
      id_class(var1, var2, "minecraft:cave_spider");
      var1.register(
         var2, "minecraft:chest_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1), "Items", DSL.list(rTC.id_native.in(var1)))
      );
      id_class(var1, var2, "minecraft:chicken");
      var1.register(var2, "minecraft:commandblock_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1)));
      id_class(var1, var2, "minecraft:cow");
      id_class(var1, var2, "minecraft:creeper");
      var1.register(
         var2,
         "minecraft:donkey",
         var1x -> DSL.optionalFields("Items", DSL.list(rTC.id_native.in(var1)), "SaddleItem", rTC.id_native.in(var1), rIl_1.id_class(var1))
      );
      var1.registerSimple(var2, "minecraft:dragon_fireball");
      id_break(var1, var2, "minecraft:egg");
      id_class(var1, var2, "minecraft:elder_guardian");
      var1.registerSimple(var2, "minecraft:ender_crystal");
      id_class(var1, var2, "minecraft:ender_dragon");
      var1.register(var2, "minecraft:enderman", var1x -> DSL.optionalFields("carried", rTC.id_new.in(var1), rIl_1.id_class(var1)));
      id_class(var1, var2, "minecraft:endermite");
      id_break(var1, var2, "minecraft:ender_pearl");
      var1.registerSimple(var2, "minecraft:eye_of_ender_signal");
      var1.register(var2, "minecraft:falling_block", var1x -> DSL.optionalFields("Block", rTC.id_new.in(var1), "TileEntityData", rTC.id_extends.in(var1)));
      id_break(var1, var2, "minecraft:fireball");
      var1.register(var2, "minecraft:fireworks_rocket", var1x -> DSL.optionalFields("FireworksItem", rTC.id_native.in(var1)));
      var1.register(var2, "minecraft:furnace_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1)));
      id_class(var1, var2, "minecraft:ghast");
      id_class(var1, var2, "minecraft:giant");
      id_class(var1, var2, "minecraft:guardian");
      var1.register(
         var2, "minecraft:hopper_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1), "Items", DSL.list(rTC.id_native.in(var1)))
      );
      var1.register(
         var2, "minecraft:horse", var1x -> DSL.optionalFields("ArmorItem", rTC.id_native.in(var1), "SaddleItem", rTC.id_native.in(var1), rIl_1.id_class(var1))
      );
      id_class(var1, var2, "minecraft:husk");
      var1.register(var2, "minecraft:item", var1x -> DSL.optionalFields("Item", rTC.id_native.in(var1)));
      var1.register(var2, "minecraft:item_frame", var1x -> DSL.optionalFields("Item", rTC.id_native.in(var1)));
      var1.registerSimple(var2, "minecraft:leash_knot");
      id_class(var1, var2, "minecraft:magma_cube");
      var1.register(var2, "minecraft:minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1)));
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
      var1.register(var2, "minecraft:potion", var1x -> DSL.optionalFields("Potion", rTC.id_native.in(var1), "inTile", rTC.id_new.in(var1)));
      id_class(var1, var2, "minecraft:rabbit");
      id_class(var1, var2, "minecraft:sheep");
      id_class(var1, var2, "minecraft:shulker");
      var1.registerSimple(var2, "minecraft:shulker_bullet");
      id_class(var1, var2, "minecraft:silverfish");
      id_class(var1, var2, "minecraft:skeleton");
      var1.register(var2, "minecraft:skeleton_horse", var1x -> DSL.optionalFields("SaddleItem", rTC.id_native.in(var1), rIl_1.id_class(var1)));
      id_class(var1, var2, "minecraft:slime");
      id_break(var1, var2, "minecraft:small_fireball");
      id_break(var1, var2, "minecraft:snowball");
      id_class(var1, var2, "minecraft:snowman");
      var1.register(var2, "minecraft:spawner_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1), rTC.id_super.in(var1)));
      var1.register(var2, "minecraft:spectral_arrow", var1x -> DSL.optionalFields("inTile", rTC.id_new.in(var1)));
      id_class(var1, var2, "minecraft:spider");
      id_class(var1, var2, "minecraft:squid");
      id_class(var1, var2, "minecraft:stray");
      var1.registerSimple(var2, "minecraft:tnt");
      var1.register(var2, "minecraft:tnt_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.id_new.in(var1)));
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
      id_class(var1, var2, "minecraft:witch");
      id_class(var1, var2, "minecraft:wither");
      id_class(var1, var2, "minecraft:wither_skeleton");
      id_break(var1, var2, "minecraft:wither_skull");
      id_class(var1, var2, "minecraft:wolf");
      id_break(var1, var2, "minecraft:xp_bottle");
      var1.registerSimple(var2, "minecraft:xp_orb");
      id_class(var1, var2, "minecraft:zombie");
      var1.register(var2, "minecraft:zombie_horse", var1x -> DSL.optionalFields("SaddleItem", rTC.id_native.in(var1), rIl_1.id_class(var1)));
      id_class(var1, var2, "minecraft:zombie_pigman");
      id_class(var1, var2, "minecraft:zombie_villager");
      var1.registerSimple(var2, "minecraft:evocation_fangs");
      id_class(var1, var2, "minecraft:evocation_illager");
      var1.registerSimple(var2, "minecraft:illusion_illager");
      var1.register(
         var2,
         "minecraft:llama",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(rTC.id_native.in(var1)), "SaddleItem", rTC.id_native.in(var1), "DecorItem", rTC.id_native.in(var1), rIl_1.id_class(var1)
            )
      );
      var1.registerSimple(var2, "minecraft:llama_spit");
      id_class(var1, var2, "minecraft:vex");
      id_class(var1, var2, "minecraft:vindication_illager");
      return var2;
   }
}
