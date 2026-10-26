package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rTI extends rwW_2 {
   public rTI(Schema var1, boolean var2) {
      super(var1, var2, "EntityArmorStandSilentFix", rTC.id_int, "ArmorStand");
   }

   public Dynamic<?> id_class(Dynamic<?> var1) {
      return var1.get("Silent").asBoolean(false) && !var1.get("Marker").asBoolean(false) ? var1.remove("Silent") : var1;
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::id_class);
   }
}
