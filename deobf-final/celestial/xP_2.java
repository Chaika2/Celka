package celestial;

import java.util.Random;

public class xP_2 extends xd_3 implements kX_2 {
   protected static final rjC_2 volatile_ = xd_3.class_(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final rjC_2 final_ = xd_3.class_(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final rjC_2 package_ = xd_3.class_(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final rCm_1 int_ = rCT.h;
   public static final rCu_1<rCy_1> new_ = rCT.o;
   public static final rCm_1 continue_ = rCT.y;

   @Override
   public Jp_1 byte_() {
      return Jp_1.XZ;
   }

   public xP_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(int_, Integer.valueOf(0)).class_(new_, rCy_1.NONE).class_(continue_, Integer.valueOf(0)));
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      int var5 = this.class_(var1, var2);
      int var6 = this.break_(var1, var2);
      return var5 + var6 + 1 < 16 && var1.byte_(var2.break_(var5)).byte_(continue_) != 1;
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.byte_(continue_) == 0 && var4.nextInt(3) == 0 && var2.finally_(var3.final_()) && var2.class_(var3.final_(), 0) >= 9) {
         int var5 = this.break_(var2, var3) + 1;
         if (var5 < 16) {
            this.class_(var1, var2, var3, var4, var5);
         }
      }
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return var2.byte_(var3.break_()).class_(rls_3.M);
   }

   protected int class_(rRq_1 var1, rfH_2 var2) {
      int var3 = 0;

      while (var3 < 16 && var1.byte_(var2.break_(var3 + 1)).class_(xu_3.hs)) {
         var3++;
      }

      return var3;
   }

   protected void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4, int var5) {
      xc_3 var6 = var2.byte_(var3.break_());
      rfH_2 var7 = var3.catch_(2);
      xc_3 var8 = var2.byte_(var7);
      rCy_1 var9 = rCy_1.NONE;
      if (var5 >= 1) {
         if (!var6.class_(xu_3.hs) || var6.byte_(new_) == rCy_1.NONE) {
            var9 = rCy_1.SMALL;
         } else if (var6.class_(xu_3.hs) && var6.byte_(new_) != rCy_1.NONE) {
            var9 = rCy_1.LARGE;
            if (var8.class_(xu_3.hs)) {
               var2.class_(var3.break_(), var6.class_(new_, rCy_1.SMALL), 3);
               var2.class_(var7, var8.class_(new_, rCy_1.NONE), 3);
            }
         }
      }

      int var10 = var1.byte_(int_) != 1 && !var8.class_(xu_3.hs) ? 0 : 1;
      int var11 = (var5 < 11 || !(var4.nextFloat() < 0.25F)) && var5 != 15 ? 0 : 1;
      var2.class_(var3.final_(), this.continue_().class_(int_, Integer.valueOf(var10)).class_(new_, var9).class_(continue_, Integer.valueOf(var11)), 3);
   }

   @Override
   public float class_(xc_3 var1, rhd_3 var2, rRq_1 var3, rfH_2 var4) {
      return var2.ss().break_() instanceof rkx_3 ? 1.0F : super.class_(var1, var2, var3, var4);
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      int var5 = this.class_(var1, var3);
      int var6 = this.break_(var1, var3);
      int var7 = var5 + var6 + 1;
      int var8 = 1 + var2.nextInt(2);

      for (int var9 = 0; var9 < var8; var9++) {
         rfH_2 var10 = var3.break_(var5);
         xc_3 var11 = var1.byte_(var10);
         if (var7 >= 16 || var11.byte_(continue_) == 1 || !var1.finally_(var10.final_())) {
            return;
         }

         this.class_(var11, var1, var10, var2, var7);
         var5++;
         var7++;
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rXE var2 = var1.int_().break_(var1.class_());
      if (!var2.byte_()) {
         return null;
      } else {
         xc_3 var3 = var1.int_().byte_(var1.class_().break_());
         if (!var3.class_(rls_3.M)) {
            return null;
         } else if (var3.class_(xu_3.hS)) {
            return this.continue_().class_(int_, Integer.valueOf(0));
         } else if (var3.class_(xu_3.hs)) {
            int var5 = var3.byte_(int_) > 0 ? 1 : 0;
            return this.continue_().class_(int_, Integer.valueOf(var5));
         } else {
            xc_3 var4 = var1.int_().byte_(var1.class_().final_());
            return !var4.class_(xu_3.hs) && !var4.class_(xu_3.hS) ? xu_3.hS.continue_() : this.continue_().class_(int_, var4.byte_(int_));
         }
      }
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rjC_2 var5 = var1.byte_(new_) == rCy_1.LARGE ? final_ : volatile_;
      rjU_2 var6 = var1.class_(var3);
      return var5.class_(var6.break_, var6.byte_, var6.protected_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.class_(var4, var5)) {
         var4.finally_().class_(var5, this, 1);
      }

      if (var2 == rpr_3.UP && var3.class_(xu_3.hs) && var3.byte_(int_) > var1.byte_(int_)) {
         var4.class_(var5, var1.class_(int_), 2);
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(int_, new_, continue_);
   }

   protected int break_(rRq_1 var1, rfH_2 var2) {
      int var3 = 0;

      while (var3 < 16 && var1.byte_(var2.catch_(var3 + 1)).class_(xu_3.hs)) {
         var3++;
      }

      return var3;
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rjU_2 var5 = var1.class_(var3);
      return package_.class_(var5.break_, var5.byte_, var5.protected_);
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.class_(var2, var3)) {
         var2.break_(var3, true);
      }
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.byte_(continue_) == 0;
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return true;
   }
}
