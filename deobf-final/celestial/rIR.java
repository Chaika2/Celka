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
   protected static final HookFunction break_ = new rIY();

   public rIR(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void class_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> rIl_1.class_(var0));
   }

   protected static void break_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("inTile", rTC.new_.in(var0)));
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
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
               break_,
               HookFunction.IDENTITY
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap var2 = Maps.newHashMap();
      var1.registerSimple(var2, "minecraft:area_effect_cloud");
      class_(var1, var2, "minecraft:armor_stand");
      var1.register(var2, "minecraft:arrow", var1x -> DSL.optionalFields("inTile", rTC.new_.in(var1)));
      class_(var1, var2, "minecraft:bat");
      class_(var1, var2, "minecraft:blaze");
      var1.registerSimple(var2, "minecraft:boat");
      class_(var1, var2, "minecraft:cave_spider");
      var1.register(var2, "minecraft:chest_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1), "Items", DSL.list(rTC.native_.in(var1))));
      class_(var1, var2, "minecraft:chicken");
      var1.register(var2, "minecraft:commandblock_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1)));
      class_(var1, var2, "minecraft:cow");
      class_(var1, var2, "minecraft:creeper");
      var1.register(
         var2, "minecraft:donkey", var1x -> DSL.optionalFields("Items", DSL.list(rTC.native_.in(var1)), "SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1))
      );
      var1.registerSimple(var2, "minecraft:dragon_fireball");
      break_(var1, var2, "minecraft:egg");
      class_(var1, var2, "minecraft:elder_guardian");
      var1.registerSimple(var2, "minecraft:ender_crystal");
      class_(var1, var2, "minecraft:ender_dragon");
      var1.register(var2, "minecraft:enderman", var1x -> DSL.optionalFields("carried", rTC.new_.in(var1), rIl_1.class_(var1)));
      class_(var1, var2, "minecraft:endermite");
      break_(var1, var2, "minecraft:ender_pearl");
      var1.registerSimple(var2, "minecraft:eye_of_ender_signal");
      var1.register(var2, "minecraft:falling_block", var1x -> DSL.optionalFields("Block", rTC.new_.in(var1), "TileEntityData", rTC.extends_.in(var1)));
      break_(var1, var2, "minecraft:fireball");
      var1.register(var2, "minecraft:fireworks_rocket", var1x -> DSL.optionalFields("FireworksItem", rTC.native_.in(var1)));
      var1.register(var2, "minecraft:furnace_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1)));
      class_(var1, var2, "minecraft:ghast");
      class_(var1, var2, "minecraft:giant");
      class_(var1, var2, "minecraft:guardian");
      var1.register(var2, "minecraft:hopper_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1), "Items", DSL.list(rTC.native_.in(var1))));
      var1.register(
         var2, "minecraft:horse", var1x -> DSL.optionalFields("ArmorItem", rTC.native_.in(var1), "SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1))
      );
      class_(var1, var2, "minecraft:husk");
      var1.register(var2, "minecraft:item", var1x -> DSL.optionalFields("Item", rTC.native_.in(var1)));
      var1.register(var2, "minecraft:item_frame", var1x -> DSL.optionalFields("Item", rTC.native_.in(var1)));
      var1.registerSimple(var2, "minecraft:leash_knot");
      class_(var1, var2, "minecraft:magma_cube");
      var1.register(var2, "minecraft:minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1)));
      class_(var1, var2, "minecraft:mooshroom");
      var1.register(
         var2, "minecraft:mule", var1x -> DSL.optionalFields("Items", DSL.list(rTC.native_.in(var1)), "SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1))
      );
      class_(var1, var2, "minecraft:ocelot");
      var1.registerSimple(var2, "minecraft:painting");
      var1.registerSimple(var2, "minecraft:parrot");
      class_(var1, var2, "minecraft:pig");
      class_(var1, var2, "minecraft:polar_bear");
      var1.register(var2, "minecraft:potion", var1x -> DSL.optionalFields("Potion", rTC.native_.in(var1), "inTile", rTC.new_.in(var1)));
      class_(var1, var2, "minecraft:rabbit");
      class_(var1, var2, "minecraft:sheep");
      class_(var1, var2, "minecraft:shulker");
      var1.registerSimple(var2, "minecraft:shulker_bullet");
      class_(var1, var2, "minecraft:silverfish");
      class_(var1, var2, "minecraft:skeleton");
      var1.register(var2, "minecraft:skeleton_horse", var1x -> DSL.optionalFields("SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1)));
      class_(var1, var2, "minecraft:slime");
      break_(var1, var2, "minecraft:small_fireball");
      break_(var1, var2, "minecraft:snowball");
      class_(var1, var2, "minecraft:snowman");
      var1.register(var2, "minecraft:spawner_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1), rTC.super_.in(var1)));
      var1.register(var2, "minecraft:spectral_arrow", var1x -> DSL.optionalFields("inTile", rTC.new_.in(var1)));
      class_(var1, var2, "minecraft:spider");
      class_(var1, var2, "minecraft:squid");
      class_(var1, var2, "minecraft:stray");
      var1.registerSimple(var2, "minecraft:tnt");
      var1.register(var2, "minecraft:tnt_minecart", var1x -> DSL.optionalFields("DisplayTile", rTC.new_.in(var1)));
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
      class_(var1, var2, "minecraft:witch");
      class_(var1, var2, "minecraft:wither");
      class_(var1, var2, "minecraft:wither_skeleton");
      break_(var1, var2, "minecraft:wither_skull");
      class_(var1, var2, "minecraft:wolf");
      break_(var1, var2, "minecraft:xp_bottle");
      var1.registerSimple(var2, "minecraft:xp_orb");
      class_(var1, var2, "minecraft:zombie");
      var1.register(var2, "minecraft:zombie_horse", var1x -> DSL.optionalFields("SaddleItem", rTC.native_.in(var1), rIl_1.class_(var1)));
      class_(var1, var2, "minecraft:zombie_pigman");
      class_(var1, var2, "minecraft:zombie_villager");
      var1.registerSimple(var2, "minecraft:evocation_fangs");
      class_(var1, var2, "minecraft:evocation_illager");
      var1.registerSimple(var2, "minecraft:illusion_illager");
      var1.register(
         var2,
         "minecraft:llama",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(rTC.native_.in(var1)), "SaddleItem", rTC.native_.in(var1), "DecorItem", rTC.native_.in(var1), rIl_1.class_(var1)
            )
      );
      var1.registerSimple(var2, "minecraft:llama_spit");
      class_(var1, var2, "minecraft:vex");
      class_(var1, var2, "minecraft:vindication_illager");
      return var2;
   }
}
