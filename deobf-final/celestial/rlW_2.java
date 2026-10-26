package celestial;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public interface rlW_2<T> {
   static <T> rlW_2<T> byte_() {
      return class_(ImmutableBiMap.of());
   }

   static <T> rlW_2<T> class_(Map<rqO_2, rlb_3<T>> var0) {
      ImmutableBiMap var1 = ImmutableBiMap.copyOf(var0);
      return new rlz_3(var1);
   }

   default Collection<rqO_2> class_(T var1) {
      ArrayList var2 = Lists.newArrayList();

      for (Entry var4 : this.class_().entrySet()) {
         if (((rlb_3)var4.getValue()).class_(var1)) {
            var2.add((rqO_2)var4.getKey());
         }
      }

      return var2;
   }

   default void class_(ruu_3 var1, rVu_1<T> var2) {
      Map var3 = this.class_();
      var1.protected_(var3.size());

      for (Entry var5 : var3.entrySet()) {
         var1.class_((rqO_2)var5.getKey());
         var1.protected_(((rlb_3)var5.getValue()).class_().size());

         for (Object var7 : ((rlb_3)var5.getValue()).class_()) {
            var1.protected_(var2.class_(var7));
         }
      }
   }

   static <T> rlW_2<T> class_(ruu_3 var0, rVL<T> var1) {
      HashMap var2 = Maps.newHashMap();
      int var3 = var0.case_();

      for (int var4 = 0; var4 < var3; var4++) {
         rqO_2 var5 = var0.volatile_();
         int var6 = var0.case_();
         Builder var7 = ImmutableSet.builder();

         for (int var8 = 0; var8 < var6; var8++) {
            var7.add(var1.class_(var0.case_()));
         }

         var2.put(var5, rlb_3.class_(var7.build()));
      }

      return class_(var2);
   }

   Map<rqO_2, rlb_3<T>> class_();

   rqO_2 class_(rlb_3<T> var1);

   default rlb_3<T> class_(rqO_2 var1) {
      return this.class_().get(var1);
   }

   default Collection<rqO_2> break_() {
      return this.class_().keySet();
   }

   default rqO_2 break_(rlb_3<T> var1) {
      rqO_2 var2 = this.class_(var1);
      if (var2 == null) {
         throw new IllegalStateException("Unrecognized tag");
      } else {
         return var2;
      }
   }

   rlb_3<T> break_(rqO_2 var1);
}
