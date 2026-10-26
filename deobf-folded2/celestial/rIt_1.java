package celestial;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rIt_1 extends Schema {
   public rIt_1(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void id_class(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> rIl_1.id_class(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var2 = super.registerEntities(var1);
      id_class(var1, var2, "PolarBear");
      return var2;
   }
}
