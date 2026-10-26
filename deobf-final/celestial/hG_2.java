package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public abstract class hG_2<T extends hZ_2> implements hP_2<T> {
   private final Map<hs_3, Set<hB_2<T>>> class_ = Maps.newIdentityHashMap();

   protected abstract T class_(JsonObject var1, ho_3 var2, rWl_1 var3);

   protected void class_(rhN_2 var1, Predicate<T> var2) {
      hs_3 var3 = var1.r();
      Set var4 = this.class_.get(var3);
      if (var4 != null && !var4.isEmpty()) {
         rzr_3 var5 = hY_2.break_(var1, var1);
         ArrayList var6 = null;

         for (hB_2 var8 : var4) {
            hZ_2 var9 = (hZ_2)var8.class_();
            if (var9.byte_().class_(var5) && var2.test(var9)) {
               if (var6 == null) {
                  var6 = Lists.newArrayList();
               }

               var6.add(var8);
            }
         }

         if (var6 != null) {
            for (hB_2 var11 : var6) {
               var11.class_(var3);
            }
         }
      }
   }

   @Override
   public final void class_(hs_3 var1) {
      this.class_.remove(var1);
   }

   @Override
   public final void class_(hs_3 var1, hB_2<T> var2) {
      this.class_.computeIfAbsent(var1, var0 -> Sets.newHashSet()).add(var2);
   }

   @Override
   public final void break_(hs_3 var1, hB_2<T> var2) {
      Set var3 = this.class_.get(var1);
      if (var3 != null) {
         var3.remove(var2);
         if (var3.isEmpty()) {
            this.class_.remove(var1);
         }
      }
   }

   public final T break_(JsonObject var1, rWl_1 var2) {
      ho_3 var3 = ho_3.class_(var1, "player", var2);
      return this.class_(var1, var3, var2);
   }
}
