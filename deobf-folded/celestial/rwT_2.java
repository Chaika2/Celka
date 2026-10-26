package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.function.Function;

public class rwT_2 extends DataFix {
   private final String id_class;
   private final Function<String, String> id_break;

   public rwT_2(Schema var1, boolean var2, String var3, Function<String, String> var4) {
      super(var1, var2);
      this.id_class = var3;
      this.id_break = var4;
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = DSL.named(rTC.id_return.typeName(), rTA.id_class());
      if (!Objects.equals(var1, this.getInputSchema().getType(rTC.id_return))) {
         throw new IllegalStateException("Recipe type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.id_class, var1, var1x -> var1xx -> var1xx.mapSecond(this.id_break));
      }
   }
}
