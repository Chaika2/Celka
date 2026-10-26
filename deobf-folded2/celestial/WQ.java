package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

public class WQ extends zZ_2 {
   public static final rCN id_volatile = rCT.id_continue;
   private static final Map<rRq_1, List<WN>> id_final = new WeakHashMap<>();

   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   protected WQ(Jq_1 var1) {
      super(var1, rLc_1.id_class);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Boolean.valueOf(true)));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      for (rpr_3 var9 : rpr_3.values()) {
         var2.id_break(var3.id_break(var9), this);
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_volatile)) {
         double var5 = (double)var3.b_() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         double var7 = (double)var3.c_() + 0.7 + (var4.nextDouble() - 0.5) * 0.2;
         double var9 = (double)var3.d_() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         var2.id_class(this.id_new, var5, var7, var9, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   private static boolean id_class(rYB var0, rfH_2 var1, boolean var2) {
      List var3 = id_final.computeIfAbsent(var0, var0x -> Lists.newArrayList());
      if (var2) {
         var3.add(new WN(var1.id_int(), var0.r()));
      }

      int var4 = 0;

      for (int var5 = 0; var5 < var3.size(); var5++) {
         WN var6 = (WN)var3.get(var5);
         if (var6.id_class.equals(var1)) {
            if (++var4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_byte(id_volatile) && rpr_3.UP != var4 ? 15 : 0;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (var1.id_byte(id_volatile) == this.id_class(var2, var3, var1) && !var2.id_finally().id_break(var3, this)) {
         var2.id_finally().id_class(var3, this, 2);
      }
   }

   protected boolean id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      return var1.id_break(var2.id_break(), rpr_3.DOWN);
   }

   @Override
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var4 == rpr_3.DOWN ? var1.id_break(var2, var3, var4) : 0;
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5) {
         for (rpr_3 var9 : rpr_3.values()) {
            var2.id_break(var3.id_break(var9), this);
         }
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      boolean var5 = this.id_class(var2, var3, var1);
      List var6 = id_final.get(var2);

      while (var6 != null && !var6.isEmpty() && var2.r() - ((WN)var6.get(0)).id_break > 60L) {
         var6.remove(0);
      }

      if (var1.id_byte(id_volatile)) {
         if (var5) {
            var2.id_class(var3, var1.id_class(id_volatile, Boolean.valueOf(false)), 3);
            if (id_class(var2, var3, true)) {
               var2.id_byte(1502, var3, 0);
               var2.id_synchronized().id_class(var3, var2.id_byte(var3).id_break(), 160);
            }
         }
      } else if (!var5 && !id_class(var2, var3, false)) {
         var2.id_class(var3, var1.id_class(id_volatile, Boolean.valueOf(true)), 3);
      }
   }
}
