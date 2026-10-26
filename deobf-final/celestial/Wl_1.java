package celestial;

import java.util.Random;

public class Wl_1 extends xd_3 implements kd_3 {
   private static final rjC_2 int_;
   private static final rjC_2 new_;
   private static final rjC_2 continue_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final rjC_2 super_ = rjw_3.break_().class_(0.0, -1.0, 0.0);
   public static final rCm_1 volatile_ = rCT.p;
   public static final rCN final_ = rCT.throw_;
   public static final rCN package_ = rCT.break_;

   @Override
   public rjC_2 byte_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return rjw_3.break_();
   }

   protected Wl_1(Jq_1 var1) {
      super(var1);
      this.extends_(
         this.abstract_.break_().class_(volatile_, Integer.valueOf(7)).class_(final_, Boolean.valueOf(false)).class_(package_, Boolean.valueOf(false))
      );
   }

   static {
      rjC_2 var0 = xd_3.class_(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      rjC_2 var1 = xd_3.class_(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      rjC_2 var2 = xd_3.class_(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      rjC_2 var3 = xd_3.class_(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      rjC_2 var4 = xd_3.class_(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      int_ = rjw_3.class_(var0, var1, var2, var3, var4);
      rjC_2 var5 = xd_3.class_(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      rjC_2 var6 = xd_3.class_(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      rjC_2 var7 = xd_3.class_(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      rjC_2 var8 = xd_3.class_(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      new_ = rjw_3.class_(Wl_1.continue_, int_, var6, var5, var8, var7);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, package_);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      super.class_(var1, var2, var3, var4);
      var4.rL();
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return class_(var2, var3) < 7;
   }

   private boolean class_(rRq_1 var1, rfH_2 var2, int var3) {
      return var3 > 0 && !var1.byte_(var2.break_()).class_(this);
   }

   public static int class_(rRq_1 var0, rfH_2 var1) {
      rfw_3 var2 = var1.new_().class_(rpr_3.DOWN);
      xc_3 var3 = var0.byte_(var2);
      int var4 = 7;
      if (var3.class_(xu_3.hU)) {
         var4 = var3.byte_(volatile_);
      } else if (var3.protected_(var0, var2, rpr_3.UP)) {
         return 0;
      }

      for (rpr_3 var6 : rpb_3.HORIZONTAL) {
         xc_3 var7 = var0.byte_(var2.class_(var1, var6));
         if (var7.class_(xu_3.hU)) {
            var4 = Math.min(var4, var7.byte_(volatile_) + 1);
            if (var4 == 1) {
               break;
            }
         }
      }

      return var4;
   }

   @Override
   public boolean class_(xc_3 var1, rxx_3 var2) {
      return var2.volatile_().break_() == this.case_();
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (!var4.class_(var1.break_().case_())) {
         return var1.byte_(package_) ? new_ : int_;
      } else {
         return rjw_3.break_();
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rfH_2 var2 = var1.class_();
      rYB var3 = var1.int_();
      int var4 = class_(var3, var2);
      return this.continue_()
         .class_(final_, Boolean.valueOf(var3.break_(var2).class_() == rXG.byte_))
         .class_(volatile_, Integer.valueOf(var4))
         .class_(package_, Boolean.valueOf(this.class_(var3, var2, var4)));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var2.continue_) {
         var2.finally_().class_(var3, this, 1);
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(final_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      if (!var4.import_()) {
         var4.finally_().class_(var5, this, 1);
      }

      return var1;
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      int var5 = class_(var2, var3);
      xc_3 var6 = var1.class_(volatile_, Integer.valueOf(var5)).class_(package_, Boolean.valueOf(this.class_(var2, var3, var5)));
      if (var6.byte_(volatile_) == 7) {
         if (var1.byte_(volatile_) == 7) {
            var2.a_(new rsB_2(var2, (double)var3.b_() + 0.5, (double)var3.c_(), (double)var3.d_() + 0.5, var6.class_(final_, Boolean.valueOf(false))));
         } else {
            var2.break_(var3, true);
         }
      } else if (var1 != var6) {
         var2.class_(var3, var6, 3);
      }
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var4.class_(rjw_3.break_(), var3, true) && !var4.class_()) {
         return int_;
      } else {
         return var1.byte_(volatile_) != 0 && var1.byte_(package_) && var4.class_(super_, var3, true) ? continue_ : rjw_3.class_();
      }
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(final_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }
}
