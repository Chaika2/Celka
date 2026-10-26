package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rTI extends rwW_2 {
   public rTI(Schema var1, boolean var2) {
      super(var1, var2, "EntityArmorStandSilentFix", rTC.int_, "ArmorStand");
   }

   public Dynamic<?> class_(Dynamic<?> var1) {
      return var1.get("Silent").asBoolean(false) && !var1.get("Marker").asBoolean(false) ? var1.remove("Silent") : var1;
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::class_);
   }
}
