package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class rwQ_2 extends DataFix {
   public rwQ_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = DSL.named(rTC.id_else.typeName(), DSL.remainderType());
      if (!Objects.equals(var1, this.getInputSchema().getType(rTC.id_else))) {
         throw new IllegalStateException("Objective type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(
            "ObjectiveDisplayNameFix",
            var1,
            var0 -> var0x -> var0x.mapSecond(
                     var0xx -> var0xx.update(
                           "DisplayName",
                           var1x -> (Dynamic)DataFixUtils.orElse(
                                 var1x.asString().map(var0xxxx -> rgB_2.id_class(new rgN_2(var0xxxx))).map(var0xx::createString).result(), var1x
                              )
                        )
                  )
         );
      }
   }
}
