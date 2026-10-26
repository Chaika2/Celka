package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rIK extends Schema {
   public rIK(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(false, rTC.id_return, () -> DSL.constType(rTA.id_class()));
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
      var1.registerType(false, rTC.id_protected, () -> DSL.compoundList(DSL.list(rTC.id_native.in(var1))));
   }
}
