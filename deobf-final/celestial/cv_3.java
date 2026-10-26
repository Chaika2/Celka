package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

public interface cv_3 {
   cv_3 class_ = new cF_2();

   int byte_(Ml_1 var1, int var2, int var3, int var4, int var5);

   static cv_3 class_(cm_3 var0, rgS_2 var1, int var2) {
      return class_(var0, var0.break_(var1, var2).stream().map(var1x -> new cA_2(var1x, var0.class_(var1x))).collect(ImmutableList.toImmutableList()));
   }

   int class_();

   static cv_3 class_(cm_3 var0, rgS_2 var1, int var2, int var3) {
      return class_(
         var0, var0.break_(var1, var2).stream().limit((long)var3).map(var1x -> new cA_2(var1x, var0.class_(var1x))).collect(ImmutableList.toImmutableList())
      );
   }

   static cv_3 class_(cm_3 var0, rgP_2... var1) {
      return class_(var0, Arrays.stream(var1).map(rgP_2::catch_).map(var1x -> new cA_2(var1x, var0.class_(var1x))).collect(ImmutableList.toImmutableList()));
   }

   static cv_3 class_(cm_3 var0, List<cA_2> var1) {
      return (cv_3)(var1.isEmpty() ? class_ : new cL_2(var1, var0));
   }

   int class_(Ml_1 var1, int var2, int var3, int var4, int var5);

   int class_(Ml_1 var1, int var2, int var3);

   int break_(Ml_1 var1, int var2, int var3, int var4, int var5);
}
