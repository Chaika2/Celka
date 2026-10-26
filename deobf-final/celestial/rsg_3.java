package celestial;

import java.util.Random;

class rsg_3 implements rsR_2 {
   private final rdn_3 class_;
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final float throws_;

   public rsg_3(rdb_3 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 0.05F);
   }

   public rsg_3(rdb_3 var1, int var2, int var3, int var4, float var5) {
      this.class_ = new rdn_3(var1);
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   @Override
   public rdI_2 class_(an_3 var1, Random var2) {
      int var3 = 5 + var2.nextInt(15);
      rdn_3 var4 = eA_2.class_(var2, new rdn_3(this.class_.break_()), var3, false);
      int var5 = Math.min(this.break_ + var3, 64);
      rdn_3 var6 = new rdn_3(rdy_3.dP, var5);
      return new rdI_2(var6, var4, this.byte_, this.protected_, this.throws_);
   }
}
