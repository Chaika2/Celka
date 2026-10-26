package celestial;

import java.util.Random;

public class kZ_2 extends xd_3 {
   public static final rCm_1 volatile_ = rCT.N;
   public static final rCN final_ = rCT.synchronized_;

   public kZ_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(7)).class_(final_, Boolean.valueOf(false)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      int var7 = private_(var3) + 1;
      if (var7 != 1 || var1.byte_(volatile_) != var7) {
         var4.finally_().class_(var5, this, 1);
      }

      return var1;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var2.while_(var3.final_()) && var4.nextInt(15) == 1) {
         rfH_2 var5 = var3.break_();
         xc_3 var6 = var2.byte_(var5);
         if (!var6.native_() || !var6.protected_(var2, var5, rpr_3.UP)) {
            double var7 = (double)var3.b_() + var4.nextDouble();
            double var9 = (double)var3.c_() - 0.05;
            double var11 = (double)var3.d_() + var4.nextDouble();
            var2.class_(rLQ.volatile_, var7, var9, var11, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return class_(this.continue_().class_(final_, Boolean.valueOf(true)), var1.int_(), var1.class_());
   }

   private static xc_3 class_(xc_3 var0, rRg_1 var1, rfH_2 var2) {
      int var3 = 7;
      rfw_3 var4 = new rfw_3();

      for (rpr_3 var8 : rpr_3.values()) {
         var4.class_(var2, var8);
         var3 = Math.min(var3, private_(var1.byte_(var4)) + 1);
         if (var3 == 1) {
            break;
         }
      }

      return var0.class_(volatile_, Integer.valueOf(var3));
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.byte_(final_) && var1.byte_(volatile_) == 7) {
         protected_(var1, var2, var3);
         var2.class_(var3, false);
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      var2.class_(var3, class_(var1, var2, var3), 3);
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return rjw_3.class_();
   }

   @Override
   public int protected_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return 1;
   }

   private static int private_(xc_3 var0) {
      if (rls_3.super_.class_(var0.break_())) {
         return 0;
      } else {
         return var0.break_() instanceof kZ_2 ? var0.byte_(volatile_) : 7;
      }
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.byte_(volatile_) == 7 && !var1.byte_(final_);
   }
}
