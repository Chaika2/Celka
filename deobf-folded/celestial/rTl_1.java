package celestial;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public class rTl_1 extends DataFix {
   private final String id_class;
   private final TypeReference id_break;

   public rTl_1(Schema var1, String var2, TypeReference var3) {
      super(var1, true);
      this.id_class = var2;
      this.id_break = var3;
   }

   protected TypeRewriteRule makeRule() {
      return this.writeAndRead(this.id_class, this.getInputSchema().getType(this.id_break), this.getOutputSchema().getType(this.id_break));
   }
}
