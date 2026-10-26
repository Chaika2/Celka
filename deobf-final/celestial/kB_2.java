package celestial;

public class kB_2 extends xm_3 {
   protected static final rjC_2 volatile_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   private static boolean byte_(an_3 var0) {
      return var0 instanceof iB_2 || var0 instanceof rsJ_2 || var0 instanceof rsX_2 || var0 instanceof rSK;
   }

   public kB_2(Jq_1 var1) {
      super(var1);
   }

   private void class_(rYB var1, an_3 var2) {
      if (byte_(var2)) {
         if (var1.int_.nextInt(5) == 0) {
            var2.class_(rqn_3.so, 1.0F, 1.0F);
         }

         if (!var1.continue_ && var1.int_.nextInt(5) == 0) {
            var1.class_(var2, (byte)53);
         }
      }
   }

   public static void class_(an_3 var0) {
      class_(var0, 5);
   }

   private static void class_(an_3 var0, int var1) {
      if (((rYB)var0.throws_[7]).continue_) {
         xc_3 var2 = xu_3.Jh.continue_();

         for (int var3 = 0; var3 < var1; var3++) {
            ((rYB)var0.throws_[7]).class_(new rLX(rLQ.protected_, var2), var0.rx(), var0.re(), var0.BO(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void class_(an_3 var1, rfH_2 var2) {
      if (var1 instanceof rhN_2 && ((rYB)var1.throws_[7]).r() % 20L == 0L) {
         Oo_1.static_.class_((rhN_2)var1, ((rYB)var1.throws_[7]).byte_(var2));
      }
   }

   private boolean class_(rfH_2 var1, an_3 var2) {
      if (var2.BL()) {
         return false;
      } else if (var2.re() > (double)var1.c_() + 0.9375 - 1.0E-7) {
         return false;
      } else if (var2.rv().byte_ >= -0.08) {
         return false;
      } else {
         double var3 = Math.abs((double)var1.b_() + 0.5 - var2.rx());
         double var5 = Math.abs((double)var1.d_() + 0.5 - var2.BO());
         double var7 = 0.4375 + (double)(var2.PN() / 2.0F);
         return var3 + 1.0E-7 > var7 || var5 + 1.0E-7 > var7;
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (this.class_(var3, var4)) {
         this.class_(var4, var3);
         this.protected_(var4);
         this.class_(var2, var4);
      }

      super.class_(var1, var2, var3, var4);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, an_3 var3, float var4) {
      var3.class_(rqn_3.so, 1.0F, 1.0F);
      if (!var1.continue_) {
         var1.class_(var3, (byte)54);
      }

      if (var3.class_(var4, 0.2F)) {
         var3.class_(this.case_.catch_(), this.case_.class_() * 0.5F, this.case_.break_() * 0.75F);
      }
   }

   public static void break_(an_3 var0) {
      class_(var0, 10);
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return volatile_;
   }

   private void protected_(an_3 var1) {
      rjU_2 var2 = var1.rv();
      if (var2.byte_ < -0.13) {
         double var3 = -0.05 / var2.byte_;
         var1.byte_(new rjU_2(var2.break_ * var3, -0.05, var2.protected_ * var3));
      } else {
         var1.byte_(new rjU_2(var2.break_, -0.05, var2.protected_));
      }

      Float var9 = 0.0F;
      var1.throws_[31] = var9;
   }
}
