package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfS_2 extends rTA {
   public rfS_2(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         rTC.this_,
         () -> DSL.optionalFields(
               "Children",
               DSL.list(
                  DSL.optionalFields("CA", rTC.volatile_.in(var1), "CB", rTC.volatile_.in(var1), "CC", rTC.volatile_.in(var1), "CD", rTC.volatile_.in(var1))
               )
            )
      );
   }
}
