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
   static <T> rlW_2<T> id_byte() {
      return id_class(ImmutableBiMap.of());
   }

   static <T> rlW_2<T> id_class(Map<rqO_2, rlb_3<T>> var0) {
      ImmutableBiMap var1 = ImmutableBiMap.copyOf(var0);
      return new rlz_3(var1);
   }

   default Collection<rqO_2> id_class(T var1) {
      ArrayList var2 = Lists.newArrayList();

      for (Entry var4 : this.id_class().entrySet()) {
         if (((rlb_3)var4.getValue()).id_class(var1)) {
            var2.add((rqO_2)var4.getKey());
         }
      }

      return var2;
   }

   default void id_class(ruu_3 var1, rVu_1<T> var2) {
      Map var3 = this.id_class();
      var1.id_protected(var3.size());

      for (Entry var5 : var3.entrySet()) {
         var1.id_class((rqO_2)var5.getKey());
         var1.id_protected(((rlb_3)var5.getValue()).id_class().size());

         for (Object var7 : ((rlb_3)var5.getValue()).id_class()) {
            var1.id_protected(var2.id_class(var7));
         }
      }
   }

   static <T> rlW_2<T> id_class(ruu_3 var0, rVL<T> var1) {
      HashMap var2 = Maps.newHashMap();
      int var3 = var0.id_case();

      for (int var4 = 0; var4 < var3; var4++) {
         rqO_2 var5 = var0.id_volatile();
         int var6 = var0.id_case();
         Builder var7 = ImmutableSet.builder();

         for (int var8 = 0; var8 < var6; var8++) {
            var7.add(var1.id_class(var0.id_case()));
         }

         var2.put(var5, rlb_3.id_class(var7.build()));
      }

      return id_class(var2);
   }

   Map<rqO_2, rlb_3<T>> id_class();

   rqO_2 id_class(rlb_3<T> var1);

   default rlb_3<T> id_class(rqO_2 var1) {
      return this.id_class().get(var1);
   }

   default Collection<rqO_2> id_break() {
      return this.id_class().keySet();
   }

   default rqO_2 id_break(rlb_3<T> var1) {
      rqO_2 var2 = this.id_class(var1);
      if (var2 == null) {
         throw new IllegalStateException("Unrecognized tag");
      } else {
         return var2;
      }
   }

   rlb_3<T> id_break(rqO_2 var1);
}
