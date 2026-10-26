package celestial;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class rtL_2 extends rtT_2 {
   public rtL_2(Schema var1, boolean var2) {
      super("EntityElderGuardianSplitFix", var1, var2);
   }

   @Override
   protected Pair<String, Dynamic<?>> class_(String var1, Dynamic<?> var2) {
      return Pair.of(Objects.equals(var1, "Guardian") && var2.get("Elder").asBoolean(false) ? "ElderGuardian" : var1, var2);
   }
}
