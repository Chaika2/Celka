package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class rQk_1 implements rQz_1 {
   final Map<String, rzV_2> id_class;
   final rzB_2 id_break;

   rQk_1(Map<String, rzV_2> var1, rzB_2 var2) {
      this.id_class = ImmutableMap.copyOf(var1);
      this.id_break = var2;
   }

   public boolean id_class(rzr_3 var1) {
      an_3 var2 = var1.id_break(this.id_break.id_class());
      if (var2 == null) {
         return false;
      } else {
         rns_3 var3 = ((rYB)var2.id_throws[7]).id_package();

         for (Entry var5 : this.id_class.entrySet()) {
            if (!this.id_class(var2, var3, (String)var5.getKey(), (rzV_2)var5.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean id_class(an_3 var1, rns_3 var2, String var3, rzV_2 var4) {
      rnP_2 var5 = var2.id_byte(var3);
      if (var5 == null) {
         return false;
      } else {
         String var6 = var1.i();
         return !var2.id_class(var6, var5) ? false : var4.id_class(var2.id_break(var6, var5).id_break());
      }
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(this.id_break.id_class());
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_catch;
   }
}
