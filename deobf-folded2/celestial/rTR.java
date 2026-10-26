package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Map;
import java.util.Objects;

public class rTR extends DataFix {
   private final String id_class;
   private final Map<String, String> id_break;

   public rTR(Schema var1, boolean var2, String var3, Map<String, String> var4) {
      super(var1, var2);
      this.id_break = var4;
      this.id_class = var3;
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = DSL.named(rTC.id_public.typeName(), rTA.id_class());
      if (!Objects.equals(var1, this.getInputSchema().getType(rTC.id_public))) {
         throw new IllegalStateException("Biome type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.id_class, var1, var1x -> var1xx -> var1xx.mapSecond(var1xxx -> this.id_break.getOrDefault(var1xxx, var1xxx)));
      }
   }
}
