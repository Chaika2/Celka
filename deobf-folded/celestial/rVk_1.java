package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;

enum rVk_1 {
   private final ThreadLocal<List<ObjectSet<rfH_2>>> field_208828_g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

   rVk_1(boolean var3, xd_3... var4) {
   }

   @Override
   public void id_class(rRg_1 var1) {
      rfw_3 var2 = new rfw_3();
      List var3 = this.field_208828_g.get();

      for (int var4 = 2; var4 < var3.size(); var4++) {
         int var5 = var4 - 1;
         ObjectSet var6 = (ObjectSet)var3.get(var5);
         ObjectSet var7 = (ObjectSet)var3.get(var4);
         ObjectIterator var8 = var6.iterator();

         while (var8.hasNext()) {
            rfH_2 var9 = (rfH_2)var8.next();
            xc_3 var10 = var1.id_byte(var9);
            if (var10.id_byte(rCT.N) >= var5) {
               var1.id_class(var9, var10.id_class(rCT.N, Integer.valueOf(var5)), 18);
               if (var4 != 7) {
                  for (rpr_3 var14 : field_208827_f) {
                     var2.id_class(var9, var14);
                     xc_3 var15 = var1.id_byte(var2);
                     if (var15.id_break(rCT.N) && var10.id_byte(rCT.N) > var4) {
                        var7.add(var2.id_int());
                     }
                  }
               }
            }
         }
      }

      var3.clear();
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      xc_3 var7 = var1.id_class(var2, var4.id_byte(var6), var4, var5, var6);
      if (var1 != var7) {
         int var8 = var7.id_byte(rCT.N);
         List var9 = this.field_208828_g.get();
         if (var9.isEmpty()) {
            for (int var10 = 0; var10 < 7; var10++) {
               var9.add(new ObjectOpenHashSet());
            }
         }

         ((ObjectSet)var9.get(var8)).add(var5.id_int());
      }

      return var1;
   }
}
