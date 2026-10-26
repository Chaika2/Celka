package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class rQk_1 implements rQz_1 {
   final Map<String, rzV_2> class_;
   final rzB_2 break_;

   rQk_1(Map<String, rzV_2> var1, rzB_2 var2) {
      this.class_ = ImmutableMap.copyOf(var1);
      this.break_ = var2;
   }

   public boolean class_(rzr_3 var1) {
      an_3 var2 = var1.break_(this.break_.class_());
      if (var2 == null) {
         return false;
      } else {
         rns_3 var3 = ((rYB)var2.throws_[7]).package_();

         for (Entry var5 : this.class_.entrySet()) {
            if (!this.class_(var2, var3, (String)var5.getKey(), (rzV_2)var5.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean class_(an_3 var1, rns_3 var2, String var3, rzV_2 var4) {
      rnP_2 var5 = var2.byte_(var3);
      if (var5 == null) {
         return false;
      } else {
         String var6 = var1.i();
         return !var2.class_(var6, var5) ? false : var4.class_(var2.break_(var6, var5).break_());
      }
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(this.break_.class_());
   }

   @Override
   public rWi_1 break_() {
      return rQF.catch_;
   }
}
