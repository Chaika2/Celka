package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfc_3 extends rTA {
   public rfc_3(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void class_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> rIl_1.class_(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var2 = super.registerEntities(var1);
      class_(var1, var2, "minecraft:bee");
      class_(var1, var2, "minecraft:bee_stinger");
      return var2;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var2 = super.registerBlockEntities(var1);
      var1.register(
         var2,
         "minecraft:beehive",
         () -> DSL.optionalFields("Items", DSL.list(rTC.native_.in(var1)), "Bees", DSL.list(DSL.optionalFields("EntityData", rTC.package_.in(var1))))
      );
      return var2;
   }
}
