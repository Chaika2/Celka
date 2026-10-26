package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;

public class rTe_1 extends DataFix {
   public rTe_1(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.id_new);
      Type var2 = this.getOutputSchema().getType(rTC.id_new);
      Type var3 = DSL.named(rTC.id_new.typeName(), DSL.or(DSL.intType(), rTA.id_class()));
      Type var4 = DSL.named(rTC.id_new.typeName(), rTA.id_class());
      if (Objects.equals(var1, var3) && Objects.equals(var2, var4)) {
         return this.fixTypeEverywhere(
            "BlockNameFlatteningFix",
            var3,
            var4,
            var0 -> var0x -> var0x.mapSecond(var0xx -> (String)var0xx.map(rtS_2::id_class, var0xxx -> rtS_2.id_class(rTA.id_class(var0xxx))))
         );
      } else {
         throw new IllegalStateException("Expected and actual types don't match.");
      }
   }
}
