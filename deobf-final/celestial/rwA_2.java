package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class rwA_2 extends rTp_1 {
   public rwA_2(Schema var1) {
      super(var1, rTC.break_);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "PlayerUUIDFix",
         this.getInputSchema().getType(this.break_),
         var0 -> {
            OpticFinder var1 = var0.getType().findField("RootVehicle");
            return var0.updateTyped(var1, var1.type(), var0x -> var0x.update(DSL.remainderFinder(), var0xx -> byte_(var0xx, "Attach", "Attach").orElse(var0xx)))
               .update(DSL.remainderFinder(), var0x -> rtw_3.byte_(rtw_3.break_(var0x)));
         }
      );
   }
}
