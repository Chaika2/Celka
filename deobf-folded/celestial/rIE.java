package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class rIE extends DataFix {
   public rIE(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <T> Dynamic<T> id_class(Dynamic<T> var0) {
      return var0.update("references", var0x -> var0x.createInt(var0x.asNumber().map(Number::intValue).result().filter(var0xx -> var0xx > 0).orElse(1)));
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.id_this);
      return this.fixTypeEverywhereTyped("Structure Reference Fix", var1, var0 -> var0.update(DSL.remainderFinder(), rIE::id_class));
   }
}
