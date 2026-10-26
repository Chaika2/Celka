package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rIG extends DataFix {
   private final String class_;
   private final String break_;
   private final String byte_;

   public rIG(Schema var1, boolean var2, String var3, String var4, String var5) {
      super(var1, var2);
      this.class_ = var3;
      this.break_ = var4;
      this.byte_ = var5;
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.class_,
         this.getInputSchema().getType(rTC.throws_),
         var1 -> var1.update(
               DSL.remainderFinder(),
               var1x -> (Dynamic)DataFixUtils.orElse(var1x.get(this.break_).result().map(var2 -> var1x.set(this.byte_, var2).remove(this.break_)), var1x)
            )
      );
   }
}
