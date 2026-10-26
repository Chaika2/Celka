package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class pS_2 implements yD_2 {
   private final QY id_class;
   private final Map<Long, Map<rfH_2, Integer>> id_break = Maps.newTreeMap(Ordering.natural().reverse());

   pS_2(QY var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      long var9 = ((gm_3)this.id_class.id_class[56]).r();
      short var11 = 200;
      double var12 = 0.0025;
      HashSet var14 = Sets.newHashSet();
      HashMap var15 = Maps.newHashMap();
      Ok_1 var16 = var2.getBuffer(HU.id_return());
      Iterator var17 = this.id_break.entrySet().iterator();

      while (var17.hasNext()) {
         Entry var18 = (Entry)var17.next();
         Long var19 = (Long)var18.getKey();
         Map var20 = (Map)var18.getValue();
         long var21 = var9 - var19;
         if (var21 > 200L) {
            var17.remove();
         } else {
            for (Entry var24 : var20.entrySet()) {
               rfH_2 var25 = (rfH_2)var24.getKey();
               Integer var26 = (Integer)var24.getValue();
               if (var14.add(var25)) {
                  rfl_3 var27 = new rfl_3(rfH_2.id_protected)
                     .id_class(0.002)
                     .id_break(0.0025 * (double)var21)
                     .id_protected((double)var25.b_(), (double)var25.c_(), (double)var25.d_())
                     .id_protected(-var3, -var5, -var7);
                  yX_2.id_class(
                     var1, var16, var27.id_class, var27.id_break, var27.id_byte, var27.id_protected, var27.id_throws, var27.id_case, 1.0F, 1.0F, 1.0F, 1.0F
                  );
                  var15.put(var25, var26);
               }
            }
         }
      }

      for (Entry var29 : var15.entrySet()) {
         rfH_2 var30 = (rfH_2)var29.getKey();
         Integer var31 = (Integer)var29.getValue();
         yK_2.id_class(String.valueOf(var31), var30.b_(), var30.c_(), var30.d_(), -1);
      }
   }

   public void id_class(long var1, rfH_2 var3) {
      Map var4 = this.id_break.computeIfAbsent(var1, var0 -> Maps.newHashMap());
      int var5 = var4.getOrDefault(var3, 0);
      var4.put(var3, var5 + 1);
   }
}
