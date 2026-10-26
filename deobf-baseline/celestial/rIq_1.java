package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rIq_1 extends Schema {
   public rIq_1(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         rTC.id_break,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", rTC.id_package.in(var1)),
               "Inventory",
               DSL.list(rTC.id_native.in(var1)),
               "EnderItems",
               DSL.list(rTC.id_native.in(var1))
            )
      );
      var1.registerType(true, rTC.id_package, () -> DSL.optionalFields("Passengers", DSL.list(rTC.id_package.in(var1)), rTC.id_int.in(var1)));
   }
}
