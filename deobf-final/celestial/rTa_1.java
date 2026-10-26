package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public abstract class rTa_1 extends DataFix {
   private final String class_;

   public rTa_1(Schema var1, String var2) {
      super(var1, false);
      this.class_ = var2;
   }

   public static DataFix class_(Schema var0, String var1, Function<String, String> var2) {
      return new rTi_1(var0, var1, var2);
   }

   protected abstract String class_(String var1);

   public TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.new_);
      Type var2 = DSL.named(rTC.new_.typeName(), rTA.class_());
      if (!Objects.equals(var1, var2)) {
         throw new IllegalStateException("block type is not what was expected.");
      } else {
         TypeRewriteRule var3 = this.fixTypeEverywhere(this.class_ + " for block", var2, var1x -> var1xx -> var1xx.mapSecond(this::class_));
         TypeRewriteRule var4 = this.fixTypeEverywhereTyped(
            this.class_ + " for block_state", this.getInputSchema().getType(rTC.volatile_), var1x -> var1x.update(DSL.remainderFinder(), var1xx -> {
                  Optional var2x = var1xx.get("Name").asString().result();
                  return var2x.isPresent() ? var1xx.set("Name", var1xx.createString(this.class_((String)var2x.get()))) : var1xx;
               })
         );
         return TypeRewriteRule.seq(var3, var4);
      }
   }
}
