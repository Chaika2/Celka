package celestial;

import java.util.Random;

class rso_3 implements rsR_2 {
   private final rdn_3 class_;
   private final int break_;
   private final int byte_;
   private final rdn_3 protected_;
   private final int throws_;
   private final int case_;
   private final int catch_;
   private final float private_;

   public rso_3(rpL_2 var1, int var2, rdb_3 var3, int var4, int var5, int var6) {
      this(var1, var2, 1, var3, var4, var5, var6);
   }

   public rso_3(rpL_2 var1, int var2, int var3, rdb_3 var4, int var5, int var6, int var7) {
      this.class_ = new rdn_3(var1);
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = new rdn_3(var4);
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = 0.05F;
   }

   @Override
   public rdI_2 class_(an_3 var1, Random var2) {
      return new rdI_2(
         new rdn_3(rdy_3.dP, this.byte_),
         new rdn_3(this.class_.break_(), this.break_),
         new rdn_3(this.protected_.break_(), this.throws_),
         this.case_,
         this.catch_,
         this.private_
      );
   }
}
