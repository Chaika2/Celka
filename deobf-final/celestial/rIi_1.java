package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rIi_1 extends rTA {
   public rIi_1(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var2 = super.registerEntities(var1);
      var1.registerSimple(var2, "minecraft:egg");
      var1.registerSimple(var2, "minecraft:ender_pearl");
      var1.registerSimple(var2, "minecraft:fireball");
      var1.register(var2, "minecraft:potion", var1x -> DSL.optionalFields("Potion", rTC.native_.in(var1)));
      var1.registerSimple(var2, "minecraft:small_fireball");
      var1.registerSimple(var2, "minecraft:snowball");
      var1.registerSimple(var2, "minecraft:wither_skull");
      var1.registerSimple(var2, "minecraft:xp_bottle");
      var1.register(var2, "minecraft:arrow", () -> DSL.optionalFields("inBlockState", rTC.volatile_.in(var1)));
      var1.register(var2, "minecraft:enderman", () -> DSL.optionalFields("carriedBlockState", rTC.volatile_.in(var1), rIl_1.class_(var1)));
      var1.register(var2, "minecraft:falling_block", () -> DSL.optionalFields("BlockState", rTC.volatile_.in(var1), "TileEntityData", rTC.extends_.in(var1)));
      var1.register(var2, "minecraft:spectral_arrow", () -> DSL.optionalFields("inBlockState", rTC.volatile_.in(var1)));
      var1.register(var2, "minecraft:chest_minecart", () -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1), "Items", DSL.list(rTC.native_.in(var1))));
      var1.register(var2, "minecraft:commandblock_minecart", () -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1)));
      var1.register(var2, "minecraft:furnace_minecart", () -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1)));
      var1.register(
         var2, "minecraft:hopper_minecart", () -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1), "Items", DSL.list(rTC.native_.in(var1)))
      );
      var1.register(var2, "minecraft:minecart", () -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1)));
      var1.register(var2, "minecraft:spawner_minecart", () -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1), rTC.super_.in(var1)));
      var1.register(var2, "minecraft:tnt_minecart", () -> DSL.optionalFields("DisplayState", rTC.volatile_.in(var1)));
      return var2;
   }
}
