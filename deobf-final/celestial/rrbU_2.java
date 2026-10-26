package celestial;

import com.google.common.primitives.Floats;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class rrbU_2 {
   private rrbe_3[] break_;
   private Map<rrWx_1, Integer> byte_ = new HashMap<>();
   public static final Integer class_ = new Integer(-1);

   public rrbU_2(rrbe_3[] var1) {
      this.break_ = var1;
   }

   @Override
   public String toString() {
      return "properties: " + this.break_.length + ", modelIndexes: " + this.byte_.size();
   }

   public static rrbU_2 class_(List<IZ> var0) {
      if (var0.isEmpty()) {
         return null;
      } else if (!rrxr_3.Sx.protected_()) {
         return null;
      } else {
         LinkedHashMap var1 = new LinkedHashMap();

         for (IZ var3 : var0) {
            Map var4 = (Map)rrxr_3.class_(var3, rrxr_3.Sx);

            for (rqO_2 var6 : var4.keySet()) {
               Float var7 = (Float)var4.get(var6);
               if (var7 != null) {
                  Object var8 = (Set)var1.get(var6);
                  if (var8 == null) {
                     var8 = new HashSet();
                     var1.put(var6, var8);
                  }

                  var8.add(var7);
               }
            }
         }

         ArrayList var9 = new ArrayList();

         for (rqO_2 var12 : var1.keySet()) {
            Set var14 = (Set)var1.get(var12);
            float[] var15 = Floats.toArray(var14);
            rrbe_3 var16 = new rrbe_3(var12, var15);
            var9.add(var16);
         }

         rrbe_3[] var11 = var9.toArray(new rrbe_3[var9.size()]);
         rrbU_2 var13 = new rrbU_2(var11);
         class_(var11, var0);
         return var13;
      }
   }

   private static void class_(rrbe_3[] var0, List<IZ> var1) {
      StringBuffer var2 = new StringBuffer();

      for (int var3 = 0; var3 < var0.length; var3++) {
         rrbe_3 var4 = var0[var3];
         if (var2.length() > 0) {
            var2.append(", ");
         }

         var2.append(var4.class_() + "=" + var4.break_().length);
      }

      if (var1.size() > 0) {
         var2.append(" -> " + ((IZ)var1.get(0)).class_() + " ...");
      }

      rrbb_3.byte_("ItemOverrideCache: " + var2.toString());
   }

   public Integer class_(rdn_3 var1, gm_3 var2, iB_2 var3) {
      rrWx_1 var4 = this.break_(var1, var2, var3);
      return var4 == null ? null : this.byte_.get(var4);
   }

   public void class_(rdn_3 var1, gm_3 var2, iB_2 var3, Integer var4) {
      rrWx_1 var5 = this.break_(var1, var2, var3);
      if (var5 != null) {
         this.byte_.put(var5, var4);
      }
   }

   private rrWx_1 break_(rdn_3 var1, gm_3 var2, iB_2 var3) {
      Integer[] var4 = new Integer[this.break_.length];

      for (int var5 = 0; var5 < var4.length; var5++) {
         Integer var6 = this.break_[var5].class_(var1, var2, var3);
         if (var6 == null) {
            return null;
         }

         var4[var5] = var6;
      }

      return new rrWx_1(var4);
   }
}
