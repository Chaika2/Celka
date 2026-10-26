package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class rwn_3 extends DataFix {
   public rwn_3(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <T> Dynamic<T> class_(Dynamic<T> var0) {
      return var0.update("Sections", var0x -> var0x.updateMapValues(var0xx -> var0xx.mapSecond(var0xxx -> var0xxx.remove("Valid"))));
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = DSL.named(rTC.finally_.typeName(), DSL.remainderType());
      if (!Objects.equals(var1, this.getInputSchema().getType(rTC.finally_))) {
         throw new IllegalStateException("Poi type is not what was expected.");
      } else {
         return this.fixTypeEverywhere("POI rebuild", var1, var0 -> var0x -> var0x.mapSecond(rwn_3::class_));
      }
   }
}
