package celestial;

import java.util.Random;

public class kp_3 extends xF_2 implements kX_2 {
   protected static final rjC_2 volatile_ = xd_3.class_(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);

   public kp_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      this.class_(var1, var3, var4, var2);
   }

   public boolean class_(rrEm_1 var1, rfH_2 var2, xc_3 var3, Random var4) {
      var1.class_(var2, false);
      rDg_1 var5;
      if (this == xu_3.rq) {
         var5 = rUx_1.rw;
      } else {
         if (this != xu_3.rT) {
            var1.class_(var2, var3, 3);
            return false;
         }

         var5 = rUx_1.rI;
      }

      if (var5.class_(var1, var1.else_().implements_(), var4, var2)) {
         return true;
      } else {
         var1.class_(var2, var3, 3);
         return false;
      }
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(25) == 0) {
         int var5 = 5;
         byte var6 = 4;

         for (rfH_2 var8 : rfH_2.class_(var3.break_(-4, -1, -4), var3.break_(4, 1, 4))) {
            if (var2.byte_(var8).class_(this)) {
               if (--var5 <= 0) {
                  return;
               }
            }
         }

         rfH_2 var9 = var3.break_(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);

         for (int var10 = 0; var10 < 4; var10++) {
            if (var2.finally_(var9) && var1.class_(var2, var9)) {
               var3 = var9;
            }

            var9 = var3.break_(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);
         }

         if (var2.finally_(var9) && var1.class_(var2, var9)) {
            var2.class_(var9, var1, 2);
         }
      }
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.break_();
      xc_3 var5 = var2.byte_(var4);
      return var5.class_(rls_3.T) ? true : var2.class_(var3, 0) < 13 && this.catch_(var5, var2, var4);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return volatile_;
   }

   @Override
   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.implements_(var2, var3);
   }
}
