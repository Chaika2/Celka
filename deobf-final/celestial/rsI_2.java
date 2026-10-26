package celestial;

import java.util.Random;

class rsI_2 implements rsR_2 {
   private final rdb_3 class_;
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final float throws_;

   public rsI_2(rpL_2 var1, int var2, int var3, int var4) {
      this.class_ = var1.case_();
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = 0.05F;
   }

   @Override
   public rdI_2 class_(an_3 var1, Random var2) {
      rdn_3 var3 = new rdn_3(this.class_, this.break_);
      return new rdI_2(var3, new rdn_3(rdy_3.dP), this.byte_, this.protected_, this.throws_);
   }
}
