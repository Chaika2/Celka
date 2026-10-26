package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class rIH extends Schema {
   public rIH(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         true,
         rTC.id_native,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  rTC.id_continue.in(var1),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     rTC.id_package.in(var1),
                     "BlockEntityTag",
                     rTC.id_extends.in(var1),
                     "CanDestroy",
                     DSL.list(rTC.id_new.in(var1)),
                     "CanPlaceOn",
                     DSL.list(rTC.id_new.in(var1))
                  )
               ),
               rIn_1.id_class,
               HookFunction.IDENTITY
            )
      );
   }
}
