package celestial;

import java.util.Random;

class rsK_2 implements rsR_2 {
   private final rdn_3 class_;
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final int throws_;
   private final float case_;

   public rsK_2(rdn_3 var1, int var2, int var3, int var4, int var5, float var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
   }

   public rsK_2(rdn_3 var1, int var2, int var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 0.05F);
   }

   public rsK_2(rdb_3 var1, int var2, int var3, int var4, int var5) {
      this(new rdn_3(var1), var2, var3, var4, var5);
   }

   public rsK_2(rdb_3 var1, int var2, int var3, int var4) {
      this(new rdn_3(var1), var2, var3, 12, var4);
   }

   public rsK_2(xd_3 var1, int var2, int var3, int var4, int var5) {
      this(new rdn_3(var1), var2, var3, var4, var5);
   }

   @Override
   public rdI_2 class_(an_3 var1, Random var2) {
      return new rdI_2(new rdn_3(rdy_3.dP, this.break_), new rdn_3(this.class_.break_(), this.byte_), this.protected_, this.throws_, this.case_);
   }
}
