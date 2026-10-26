package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class rTt_1 extends DataFix {
   private final String id_class;
   private final Function<String, String> id_break;

   public rTt_1(Schema var1, boolean var2, String var3, Function<String, String> var4) {
      super(var1, var2);
      this.id_class = var3;
      this.id_break = var4;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.id_class, this.getInputSchema().getType(rTC.id_implements), var1 -> var1.update(DSL.remainderFinder(), var1x -> var1x.updateMapValues(var2 -> {
                  String var3 = ((Dynamic)var2.getFirst()).asString("");
                  return var2.mapFirst(var3x -> var1x.createString(this.id_break.apply(var3)));
               }))
      );
   }
}
