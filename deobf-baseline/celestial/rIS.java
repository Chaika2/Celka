package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rIS extends rwW_2 {
   public rIS(Schema var1, boolean var2) {
      super(var1, var2, "StriderGravityFix", rTC.id_int, "minecraft:strider");
   }

   public Dynamic<?> id_class(Dynamic<?> var1) {
      return var1.get("NoGravity").asBoolean(false) ? var1.set("NoGravity", var1.createBoolean(false)) : var1;
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::id_class);
   }
}
