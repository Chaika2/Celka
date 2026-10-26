package celestial;

import java.util.Random;

public class zO_2 extends xF_2 implements kX_2 {
   public static final rCm_1 volatile_ = rCT.d;
   protected static final rjC_2[] final_ = new rjC_2[]{
      xd_3.class_(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      xd_3.class_(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      xd_3.class_(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      xd_3.class_(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      xd_3.class_(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      xd_3.class_(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      xd_3.class_(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      xd_3.class_(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final zh_3 package_;

   protected zO_2(zh_3 var1, Jq_1 var2) {
      super(var2);
      this.package_ = var1;
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_[var1.byte_(volatile_)];
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var3.byte_(volatile_) != 7;
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      int var5 = Math.min(7, var4.byte_(volatile_) + rfU_2.class_(var1.int_, 2, 5));
      xc_3 var6 = var4.class_(volatile_, Integer.valueOf(var5));
      var1.class_(var3, var6, 2);
      if (var5 == 7) {
         var6.break_(var1, var3, var1.int_);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.class_(var3, 0) >= 9) {
         float var5 = dO_2.class_(this, var2, var3);
         if (var4.nextInt((int)(25.0F / var5) + 1) == 0) {
            int var6 = var1.byte_(volatile_);
            if (var6 < 7) {
               var1 = var1.class_(volatile_, Integer.valueOf(var6 + 1));
               var2.class_(var3, var1, 2);
            } else {
               rpr_3 var7 = rpb_3.HORIZONTAL.class_(var4);
               rfH_2 var8 = var3.break_(var7);
               xc_3 var9 = var2.byte_(var8.break_());
               if (var2.byte_(var8).catch_()
                  && (
                     var9.class_(xu_3.PS)
                        || var9.class_(xu_3.finally_)
                        || var9.class_(xu_3.extends_)
                        || var9.class_(xu_3.native_)
                        || var9.class_(xu_3.implements_)
                  )) {
                  var2.break_(var8, this.package_.continue_());
                  var2.break_(var3, this.package_.implements_().continue_().class_(kE_2.p, var7));
               }
            }
         }
      }
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      rdb_3 var4 = this.break_();
      return var4 == null ? rdn_3.break_ : new rdn_3(var4);
   }

   protected rdb_3 break_() {
      if (this.package_ == xu_3.Pg) {
         return rdy_3.Jk;
      } else {
         return this.package_ == xu_3.Bg ? rdy_3.JW : null;
      }
   }

   @Override
   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.class_(xu_3.PS);
   }

   public zh_3 implements_() {
      return this.package_;
   }
}
