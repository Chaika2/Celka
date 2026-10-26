package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class rtP_2 extends DataFix {
   public rtP_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "BlockStateStructureTemplateFix", this.getInputSchema().getType(rTC.id_volatile), var0 -> var0.update(DSL.remainderFinder(), rtS_2::id_class)
      );
   }
}
