package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

public interface cv_3 {
   cv_3 id_class = new cF_2();

   int id_byte(Ml_1 var1, int var2, int var3, int var4, int var5);

   static cv_3 id_class(cm_3 var0, rgS_2 var1, int var2) {
      return id_class(var0, var0.id_break(var1, var2).stream().map(var1x -> new cA_2(var1x, var0.id_class(var1x))).collect(ImmutableList.toImmutableList()));
   }

   int id_class();

   static cv_3 id_class(cm_3 var0, rgS_2 var1, int var2, int var3) {
      return id_class(
         var0,
         var0.id_break(var1, var2).stream().limit((long)var3).map(var1x -> new cA_2(var1x, var0.id_class(var1x))).collect(ImmutableList.toImmutableList())
      );
   }

   static cv_3 id_class(cm_3 var0, rgP_2... var1) {
      return id_class(
         var0, Arrays.stream(var1).map(rgP_2::id_catch).map(var1x -> new cA_2(var1x, var0.id_class(var1x))).collect(ImmutableList.toImmutableList())
      );
   }

   static cv_3 id_class(cm_3 var0, List<cA_2> var1) {
      return (cv_3)(var1.isEmpty() ? id_class : new cL_2(var1, var0));
   }

   int id_class(Ml_1 var1, int var2, int var3, int var4, int var5);

   int id_class(Ml_1 var1, int var2, int var3);

   int id_break(Ml_1 var1, int var2, int var3, int var4, int var5);
}
