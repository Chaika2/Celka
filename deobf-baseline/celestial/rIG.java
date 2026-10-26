package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rIG extends DataFix {
   private final String id_class;
   private final String id_break;
   private final String id_byte;

   public rIG(Schema var1, boolean var2, String var3, String var4, String var5) {
      super(var1, var2);
      this.id_class = var3;
      this.id_break = var4;
      this.id_byte = var5;
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.id_class,
         this.getInputSchema().getType(rTC.id_throws),
         var1 -> var1.update(
               DSL.remainderFinder(),
               var1x -> (Dynamic)DataFixUtils.orElse(var1x.get(this.id_break).result().map(var2 -> var1x.set(this.id_byte, var2).remove(this.id_break)), var1x)
            )
      );
   }
}
