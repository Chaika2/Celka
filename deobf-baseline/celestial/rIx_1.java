package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import java.util.Objects;

public abstract class rIx_1 extends DataFix {
   private final String id_class;

   public rIx_1(String var1, Schema var2, boolean var3) {
      super(var2, var3);
      this.id_class = var1;
   }

   protected abstract String id_class(String var1);

   public TypeRewriteRule makeRule() {
      TaggedChoiceType var1 = this.getInputSchema().findChoiceType(rTC.id_int);
      TaggedChoiceType var2 = this.getOutputSchema().findChoiceType(rTC.id_int);
      Type var3 = DSL.named(rTC.id_final.typeName(), rTA.id_class());
      if (!Objects.equals(this.getOutputSchema().getType(rTC.id_final), var3)) {
         throw new IllegalStateException("Entity name type is not what was expected.");
      } else {
         return TypeRewriteRule.seq(this.fixTypeEverywhere(this.id_class, var1, var2, var3x -> var3xx -> var3xx.mapFirst(var3xxx -> {
                  String var4 = this.id_class(var3xxx);
                  Type var5 = (Type)var1.types().get(var3xxx);
                  Type var6 = (Type)var2.types().get(var4);
                  if (!var6.equals(var5, true, true)) {
                     throw new IllegalStateException(String.format("Dynamic type check failed: %s not equal to %s", var6, var5));
                  } else {
                     return var4;
                  }
               })), this.fixTypeEverywhere(this.id_class + " for entity name", var3, var1x -> var1xx -> var1xx.mapSecond(this::id_class)));
      }
   }
}
