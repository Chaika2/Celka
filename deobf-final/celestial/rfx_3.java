package celestial;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfx_3 extends rTA {
   public rfx_3(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void class_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> rIl_1.class_(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var2 = super.registerEntities(var1);
      class_(var1, var2, "minecraft:cat");
      return var2;
   }
}
