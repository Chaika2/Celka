package celestial;

import java.util.Random;

public class xh_3 extends dO_2 {
   public static final rCm_1 volatile_ = rCT.J;
   private static final rjC_2[] package_ = new rjC_2[]{
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   public xh_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return package_[var1.byte_(this.break_())];
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(3) != 0) {
         super.class_(var1, var2, var3, var4);
      }
   }

   @Override
   protected int class_(rYB var1) {
      return super.class_(var1) / 3;
   }

   @Override
   public rCm_1 break_() {
      return volatile_;
   }

   @Override
   protected rpL_2 finally_() {
      return rdy_3.kJ;
   }

   @Override
   public int implements_() {
      return 3;
   }
}
