package celestial;

import java.util.Random;

public class WD extends xd_3 {
   public static final rCm_1 volatile_ = rCT.m;
   protected static final rjC_2[] final_ = new rjC_2[]{
      rjw_3.class_(),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public rjC_2 byte_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_[var1.byte_(volatile_)];
   }

   protected WD(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(1)));
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.byte_(var3.break_());
      if (var4.class_(xu_3.PT) || var4.class_(xu_3.Ei) || var4.class_(xu_3.Ec)) {
         return false;
      } else {
         return !var4.class_(xu_3.Jh) && !var4.class_(xu_3.PY)
            ? xd_3.class_(var4.extends_(var2, var3.break_()), rpr_3.UP) || var4.break_() == this && var4.byte_(volatile_) == 8
            : true;
      }
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.class_(rRo_1.BLOCK, var3) > 11) {
         protected_(var1, var2, var3);
         var2.class_(var3, false);
      }
   }

   @Override
   public boolean class_(xc_3 var1, rxx_3 var2) {
      int var3 = var1.byte_(volatile_);
      if (var2.volatile_().break_() != this.case_() || var3 >= 8) {
         return var3 == 1;
      } else {
         return var2.byte_() ? var2.finally_() == rpr_3.UP : true;
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = var1.int_().byte_(var1.class_());
      if (var2.class_(this)) {
         int var3 = var2.byte_(volatile_);
         return var2.class_(volatile_, Integer.valueOf(Math.min(8, var3 + 1)));
      } else {
         return super.class_(var1);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_[var1.byte_(volatile_)];
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return var1.byte_(volatile_) < 5;
         case WATER:
            return false;
         case AIR:
            return false;
         default:
            return false;
      }
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_[var1.byte_(volatile_) - 1];
   }

   @Override
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return final_[var1.byte_(volatile_)];
   }

   @Override
   public boolean break_(xc_3 var1) {
      return true;
   }
}
