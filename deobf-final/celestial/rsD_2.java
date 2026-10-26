package celestial;

import java.util.Random;

class rsD_2 implements rsR_2 {
   final rLR class_;
   final int break_;
   final int byte_;
   private final float protected_;

   public rsD_2(rLR var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = 0.05F;
   }

   @Override
   public rdI_2 class_(an_3 var1, Random var2) {
      rdn_3 var3 = new rdn_3(rdy_3.ke, 1);
      rkJ_2.class_(var3, this.class_, this.break_);
      return new rdI_2(new rdn_3(rdy_3.dP, 1), var3, 12, this.byte_, this.protected_);
   }
}
