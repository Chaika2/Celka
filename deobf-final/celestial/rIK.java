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
      var1.registerType(false, rTC.return_, () -> DSL.constType(rTA.class_()));
      var1.registerType(
         false,
         rTC.break_,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", rTC.package_.in(var1)),
               "Inventory",
               DSL.list(rTC.native_.in(var1)),
               "EnderItems",
               DSL.list(rTC.native_.in(var1)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  rTC.package_.in(var1),
                  "ShoulderEntityRight",
                  rTC.package_.in(var1),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(rTC.return_.in(var1)), "toBeDisplayed", DSL.list(rTC.return_.in(var1)))
               )
            )
      );
      var1.registerType(false, rTC.protected_, () -> DSL.compoundList(DSL.list(rTC.native_.in(var1))));
   }
}
