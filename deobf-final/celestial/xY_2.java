package celestial;

import java.util.Random;

public class xY_2 extends kE_2 implements kX_2 {
   public static final rCm_1 volatile_ = rCT.X;
   protected static final rjC_2[] final_ = new rjC_2[]{
      xd_3.class_(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), xd_3.class_(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), xd_3.class_(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final rjC_2[] package_ = new rjC_2[]{
      xd_3.class_(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), xd_3.class_(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), xd_3.class_(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final rjC_2[] int_ = new rjC_2[]{
      xd_3.class_(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), xd_3.class_(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), xd_3.class_(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final rjC_2[] new_ = new rjC_2[]{
      xd_3.class_(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), xd_3.class_(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), xd_3.class_(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public xY_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(p, rpr_3.NORTH).class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var3.byte_(volatile_) < 2;
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      var1.class_(var3, var4.class_(volatile_, Integer.valueOf(var4.byte_(volatile_) + 1)), 2);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(p, volatile_);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == var1.byte_(p) && !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      xd_3 var4 = var2.byte_(var3.break_(var1.byte_(p))).break_();
      return var4.class_(rls_3.public_);
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.int_.nextInt(5) == 0) {
         int var5 = var1.byte_(volatile_);
         if (var5 < 2) {
            var2.class_(var3, var1.class_(volatile_, Integer.valueOf(var5 + 1)), 2);
         }
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = this.continue_();
      rYB var3 = var1.int_();
      rfH_2 var4 = var1.class_();

      for (rpr_3 var8 : var1.throws_()) {
         if (var8.final_().protected_()) {
            var2 = var2.class_(p, var8);
            if (var2.class_((rRR)var3, var4)) {
               return var2;
            }
         }
      }

      return null;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      int var5 = var1.byte_(volatile_);
      switch ((rpr_3)var1.byte_(p)) {
         case SOUTH:
            return new_[var5];
         case NORTH:
         default:
            return int_[var5];
         case WEST:
            return package_[var5];
         case EAST:
            return final_[var5];
      }
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.byte_(volatile_) < 2;
   }
}
