package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.Optional;

public class rwN_2 extends DataFix {
   public rwN_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static rnr_3 class_(String var0) {
      return var0.equals("health") ? rnr_3.HEARTS : rnr_3.INTEGER;
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = DSL.named(rTC.else_.typeName(), DSL.remainderType());
      if (!Objects.equals(var1, this.getInputSchema().getType(rTC.else_))) {
         throw new IllegalStateException("Objective type is not what was expected.");
      } else {
         return this.fixTypeEverywhere("ObjectiveRenderTypeFix", var1, var0 -> var0x -> var0x.mapSecond(var0xx -> {
                  Optional var1x = var0xx.get("RenderType").asString().result();
                  if (!var1x.isPresent()) {
                     String var2 = var0xx.get("CriteriaName").asString("");
                     rnr_3 var3 = class_(var2);
                     return var0xx.set("RenderType", var0xx.createString(var3.class_()));
                  } else {
                     return var0xx;
                  }
               }));
      }
   }
}
