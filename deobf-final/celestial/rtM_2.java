package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class rtM_2 extends DataFix {
   public rtM_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.byte_);
      Type var2 = var1.findFieldType("Level");
      OpticFinder var3 = DSL.fieldFinder("Level", var2);
      return this.fixTypeEverywhereTyped(
         "ChunkLightRemoveFix",
         var1,
         this.getOutputSchema().getType(rTC.byte_),
         var1x -> var1x.updateTyped(var3, var0x -> var0x.update(DSL.remainderFinder(), var0xx -> var0xx.remove("isLightOn")))
      );
   }
}
