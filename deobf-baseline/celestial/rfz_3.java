package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfz_3 extends rTA {
   public rfz_3(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void id_class(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> id_class(var0));
   }

   protected static TypeTemplate id_class(Schema var0) {
      return DSL.optionalFields("ArmorItems", DSL.list(rTC.id_native.in(var0)), "HandItems", DSL.list(rTC.id_native.in(var0)));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var2 = super.registerEntities(var1);
      var2.remove("minecraft:illager_beast");
      id_class(var1, var2, "minecraft:ravager");
      return var2;
   }
}
