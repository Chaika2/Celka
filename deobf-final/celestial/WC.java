package celestial;

import java.util.Random;

public class WC extends xF_2 implements kX_2 {
   public static final rCm_1 volatile_ = rCT.y;
   protected static final rjC_2 final_ = xd_3.class_(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final QZ package_;

   protected WC(QZ var1, Jq_1 var2) {
      super(var2);
      this.package_ = var1;
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return (double)var1.int_.nextFloat() < 0.45;
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      this.class_(var1, var3, var4, var2);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return true;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_;
   }

   public void class_(rrEm_1 var1, rfH_2 var2, xc_3 var3, Random var4) {
      if (var3.byte_(volatile_) == 0) {
         var1.class_(var2, var3.class_(volatile_), 4);
      } else {
         this.package_.class_(var1, var1.else_().implements_(), var2, var3, var4);
      }
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.package_(var3.final_()) >= 9 && var4.nextInt(7) == 0) {
         this.class_(var2, var3, var1, var4);
      }
   }
}
