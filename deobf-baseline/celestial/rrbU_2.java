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
   private rrbe_3[] id_break;
   private Map<rrWx_1, Integer> id_byte = new HashMap<>();
   public static final Integer id_class = new Integer(-1);

   public rrbU_2(rrbe_3[] var1) {
      this.id_break = var1;
   }

   @Override
   public String toString() {
      return "properties: " + this.id_break.length + ", modelIndexes: " + this.id_byte.size();
   }

   public static rrbU_2 id_class(List<IZ> var0) {
      if (var0.isEmpty()) {
         return null;
      } else if (!rrxr_3.Sx.id_protected()) {
         return null;
      } else {
         LinkedHashMap var1 = new LinkedHashMap();

         for (IZ var3 : var0) {
            Map var4 = (Map)rrxr_3.id_class(var3, rrxr_3.Sx);

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
         id_class(var11, var0);
         return var13;
      }
   }

   private static void id_class(rrbe_3[] var0, List<IZ> var1) {
      StringBuffer var2 = new StringBuffer();

      for (int var3 = 0; var3 < var0.length; var3++) {
         rrbe_3 var4 = var0[var3];
         if (var2.length() > 0) {
            var2.append(", ");
         }

         var2.append(var4.id_class() + "=" + var4.id_break().length);
      }

      if (var1.size() > 0) {
         var2.append(" -> " + ((IZ)var1.get(0)).id_class() + " ...");
      }

      rrbb_3.id_byte("ItemOverrideCache: " + var2.toString());
   }

   public Integer id_class(rdn_3 var1, gm_3 var2, iB_2 var3) {
      rrWx_1 var4 = this.id_break(var1, var2, var3);
      return var4 == null ? null : this.id_byte.get(var4);
   }

   public void id_class(rdn_3 var1, gm_3 var2, iB_2 var3, Integer var4) {
      rrWx_1 var5 = this.id_break(var1, var2, var3);
      if (var5 != null) {
         this.id_byte.put(var5, var4);
      }
   }

   private rrWx_1 id_break(rdn_3 var1, gm_3 var2, iB_2 var3) {
      Integer[] var4 = new Integer[this.id_break.length];

      for (int var5 = 0; var5 < var4.length; var5++) {
         Integer var6 = this.id_break[var5].id_class(var1, var2, var3);
         if (var6 == null) {
            return null;
         }

         var4[var5] = var6;
      }

      return new rrWx_1(var4);
   }
}
