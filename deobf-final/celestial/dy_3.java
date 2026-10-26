package celestial;

import java.util.Random;

public class dy_3 extends xd_3 {
   public static final rCm_1 volatile_ = rCT.n;
   protected static final rjC_2 final_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);

   public static void byte_(xc_3 var0, rYB var1, rfH_2 var2) {
      var1.break_(var2, class_(var0, xu_3.finally_.continue_(), var1, var2));
   }

   protected dy_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == rpr_3.UP && !var1.class_(var4, var5)) {
         var4.finally_().class_(var5, this, 1);
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   private static boolean class_(rRq_1 var0, rfH_2 var1) {
      xd_3 var2 = var0.byte_(var1.final_()).break_();
      return var2 instanceof dO_2 || var2 instanceof zO_2 || var2 instanceof xr_3;
   }

   private static boolean class_(rRR var0, rfH_2 var1) {
      for (rfH_2 var3 : rfH_2.class_(var1.break_(-4, 0, -4), var1.break_(4, 1, 4))) {
         if (var0.break_(var3).class_(rlG_2.break_)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      int var5 = var1.byte_(volatile_);
      if (!class_((rRR)var2, var3) && !var2.while_(var3.final_())) {
         if (var5 > 0) {
            var2.class_(var3, var1.class_(volatile_, Integer.valueOf(var5 - 1)), 2);
         } else if (!class_((rRq_1)var2, var3)) {
            byte_(var1, var2, var3);
         }
      } else if (var5 < 7) {
         var2.class_(var3, var1.class_(volatile_, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return !this.continue_().class_((rRR)var1.int_(), var1.class_()) ? xu_3.finally_.continue_() : super.class_(var1);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_;
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, an_3 var3, float var4) {
      if (!var1.continue_
         && var1.int_.nextFloat() < var4 - 0.5F
         && var3 instanceof iB_2
         && (var3 instanceof rhd_3 || var1.B().break_(rRu_1.break_))
         && var3.PN() * var3.PN() * var3.Bm() > 0.512F) {
         byte_(var1.byte_(var2), var1, var2);
      }

      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.byte_(var3.final_());
      return !var4.byte_().break_() || var4.break_() instanceof dq_3 || var4.break_() instanceof ky_3;
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.class_(var2, var3)) {
         byte_(var1, var2, var3);
      }
   }

   @Override
   public boolean break_(xc_3 var1) {
      return true;
   }
}
