package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Map;
import java.util.Objects;

public class rTR extends DataFix {
   private final String class_;
   private final Map<String, String> break_;

   public rTR(Schema var1, boolean var2, String var3, Map<String, String> var4) {
      super(var1, var2);
      this.break_ = var4;
      this.class_ = var3;
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = DSL.named(rTC.public_.typeName(), rTA.class_());
      if (!Objects.equals(var1, this.getInputSchema().getType(rTC.public_))) {
         throw new IllegalStateException("Biome type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.class_, var1, var1x -> var1xx -> var1xx.mapSecond(var1xxx -> this.break_.getOrDefault(var1xxx, var1xxx)));
      }
   }
}
