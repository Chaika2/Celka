package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfu_3 extends rTA {
   public rfu_3(int var1, Schema var2) {
      super(var1, var2);
   }

   private static void class_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(
         var1,
         var2,
         () -> DSL.optionalFields("Items", DSL.list(rTC.native_.in(var0)), "RecipesUsed", DSL.compoundList(rTC.return_.in(var0), DSL.constType(DSL.intType())))
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var2 = super.registerBlockEntities(var1);
      class_(var1, var2, "minecraft:furnace");
      class_(var1, var2, "minecraft:smoker");
      class_(var1, var2, "minecraft:blast_furnace");
      return var2;
   }
}
