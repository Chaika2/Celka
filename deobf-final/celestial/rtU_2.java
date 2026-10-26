package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.function.Function;

public abstract class rtU_2 extends DataFix {
   private final String class_;

   public rtU_2(Schema var1, String var2) {
      super(var1, false);
      this.class_ = var2;
   }

   public static DataFix class_(Schema var0, String var1, Function<String, String> var2) {
      return new rte_3(var0, var1, var2);
   }

   protected abstract String class_(String var1);

   public TypeRewriteRule makeRule() {
      Type var1 = DSL.named(rTC.continue_.typeName(), rTA.class_());
      if (!Objects.equals(this.getInputSchema().getType(rTC.continue_), var1)) {
         throw new IllegalStateException("item name type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.class_, var1, var1x -> var1xx -> var1xx.mapSecond(this::class_));
      }
   }
}
