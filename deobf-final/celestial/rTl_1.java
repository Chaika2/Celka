package celestial;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public class rTl_1 extends DataFix {
   private final String class_;
   private final TypeReference break_;

   public rTl_1(Schema var1, String var2, TypeReference var3) {
      super(var1, true);
      this.class_ = var2;
      this.break_ = var3;
   }

   protected TypeRewriteRule makeRule() {
      return this.writeAndRead(this.class_, this.getInputSchema().getType(this.break_), this.getOutputSchema().getType(this.break_));
   }
}
