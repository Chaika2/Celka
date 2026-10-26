package celestial;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class rwi_3 extends rtT_2 {
   public rwi_3(Schema var1, boolean var2) {
      super("EntitySkeletonSplitFix", var1, var2);
   }

   @Override
   protected Pair<String, Dynamic<?>> id_class(String var1, Dynamic<?> var2) {
      if (Objects.equals(var1, "Skeleton")) {
         int var3 = var2.get("SkeletonType").asInt(0);
         if (var3 == 1) {
            var1 = "WitherSkeleton";
         } else if (var3 == 2) {
            var1 = "Stray";
         }
      }

      return Pair.of(var1, var2);
   }
}
