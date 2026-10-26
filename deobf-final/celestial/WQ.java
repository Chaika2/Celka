package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

public class WQ extends zZ_2 {
   public static final rCN volatile_ = rCT.continue_;
   private static final Map<rRq_1, List<WN>> final_ = new WeakHashMap<>();

   @Override
   public boolean byte_(xc_3 var1) {
      return true;
   }

   protected WQ(Jq_1 var1) {
      super(var1, rLc_1.class_);
      this.extends_(this.abstract_.break_().class_(volatile_, Boolean.valueOf(true)));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      for (rpr_3 var9 : rpr_3.values()) {
         var2.break_(var3.break_(var9), this);
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.byte_(volatile_)) {
         double var5 = (double)var3.b_() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         double var7 = (double)var3.c_() + 0.7 + (var4.nextDouble() - 0.5) * 0.2;
         double var9 = (double)var3.d_() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         var2.class_(this.new_, var5, var7, var9, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   private static boolean class_(rYB var0, rfH_2 var1, boolean var2) {
      List var3 = final_.computeIfAbsent(var0, var0x -> Lists.newArrayList());
      if (var2) {
         var3.add(new WN(var1.int_(), var0.r()));
      }

      int var4 = 0;

      for (int var5 = 0; var5 < var3.size(); var5++) {
         WN var6 = (WN)var3.get(var5);
         if (var6.class_.equals(var1)) {
            if (++var4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.byte_(volatile_) && rpr_3.UP != var4 ? 15 : 0;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (var1.byte_(volatile_) == this.class_(var2, var3, var1) && !var2.finally_().break_(var3, this)) {
         var2.finally_().class_(var3, this, 2);
      }
   }

   protected boolean class_(rYB var1, rfH_2 var2, xc_3 var3) {
      return var1.break_(var2.break_(), rpr_3.DOWN);
   }

   @Override
   public int break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var4 == rpr_3.DOWN ? var1.break_(var2, var3, var4) : 0;
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5) {
         for (rpr_3 var9 : rpr_3.values()) {
            var2.break_(var3.break_(var9), this);
         }
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      boolean var5 = this.class_(var2, var3, var1);
      List var6 = final_.get(var2);

      while (var6 != null && !var6.isEmpty() && var2.r() - ((WN)var6.get(0)).break_ > 60L) {
         var6.remove(0);
      }

      if (var1.byte_(volatile_)) {
         if (var5) {
            var2.class_(var3, var1.class_(volatile_, Boolean.valueOf(false)), 3);
            if (class_(var2, var3, true)) {
               var2.byte_(1502, var3, 0);
               var2.synchronized_().class_(var3, var2.byte_(var3).break_(), 160);
            }
         }
      } else if (!var5 && !class_(var2, var3, false)) {
         var2.class_(var3, var1.class_(volatile_, Boolean.valueOf(true)), 3);
      }
   }
}
