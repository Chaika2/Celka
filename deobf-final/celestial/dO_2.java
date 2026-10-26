package celestial;

import java.util.Random;

public class dO_2 extends xF_2 implements kX_2 {
   public static final rCm_1 final_ = rCT.d;
   private static final rjC_2[] volatile_ = new rjC_2[]{
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   public xc_3 byte_(int var1) {
      return this.continue_().class_(this.break_(), Integer.valueOf(var1));
   }

   protected dO_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(this.break_(), Integer.valueOf(0)));
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(this.finally_());
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (var4 instanceof rGx_1 && var2.B().break_(rRu_1.break_)) {
         var2.class_(var3, true, var4);
      }

      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return (var2.class_(var3, 0) >= 8 || var2.case_(var3)) && super.class_(var1, var2, var3);
   }

   protected int class_(rYB var1) {
      return rfU_2.class_(var1.int_, 2, 5);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return volatile_[var1.byte_(this.break_())];
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(final_);
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      this.class_((rYB)var1, var3, var4);
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return !this.implements_(var3);
   }

   protected static float class_(xd_3 var0, rRq_1 var1, rfH_2 var2) {
      float var3 = 1.0F;
      rfH_2 var4 = var2.break_();

      for (int var5 = -1; var5 <= 1; var5++) {
         for (int var6 = -1; var6 <= 1; var6++) {
            float var7 = 0.0F;
            xc_3 var8 = var1.byte_(var4.break_(var5, 0, var6));
            if (var8.class_(xu_3.PS)) {
               var7 = 1.0F;
               if (var8.byte_(dy_3.volatile_) > 0) {
                  var7 = 3.0F;
               }
            }

            if (var5 != 0 || var6 != 0) {
               var7 /= 4.0F;
            }

            var3 += var7;
         }
      }

      rfH_2 var12 = var2.private_();
      rfH_2 var13 = var2.protected_();
      rfH_2 var14 = var2.byte_();
      rfH_2 var15 = var2.extends_();
      boolean var9 = var0 == var1.byte_(var14).break_() || var0 == var1.byte_(var15).break_();
      boolean var10 = var0 == var1.byte_(var12).break_() || var0 == var1.byte_(var13).break_();
      if (var9 && var10) {
         var3 /= 2.0F;
      } else {
         boolean var11 = var0 == var1.byte_(var14.private_()).break_()
            || var0 == var1.byte_(var15.private_()).break_()
            || var0 == var1.byte_(var15.protected_()).break_()
            || var0 == var1.byte_(var14.protected_()).break_();
         if (var11) {
            var3 /= 2.0F;
         }
      }

      return var3;
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.class_(var3, 0) >= 9) {
         int var5 = this.private_(var1);
         if (var5 < this.implements_()) {
            float var6 = class_(this, var2, var3);
            if (var4.nextInt((int)(25.0F / var6) + 1) == 0) {
               var2.class_(var3, this.byte_(var5 + 1), 2);
            }
         }
      }
   }

   public void class_(rYB var1, rfH_2 var2, xc_3 var3) {
      int var4 = this.private_(var3) + this.class_(var1);
      int var5 = this.implements_();
      if (var4 > var5) {
         var4 = var5;
      }

      var1.class_(var2, this.byte_(var4), 2);
   }

   public rCm_1 break_() {
      return final_;
   }

   protected rpL_2 finally_() {
      return rdy_3.hP;
   }

   @Override
   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.class_(xu_3.PS);
   }

   public int implements_() {
      return 7;
   }

   public boolean implements_(xc_3 var1) {
      return var1.byte_(this.break_()) >= this.implements_();
   }

   protected int private_(xc_3 var1) {
      return var1.byte_(this.break_());
   }

   @Override
   public boolean a_(xc_3 var1) {
      return !this.implements_(var1);
   }
}
