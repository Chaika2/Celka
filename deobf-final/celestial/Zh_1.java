package celestial;

class Zh_1 {
   static final Zh_1 class_ = new Zh_1("", new ZX(0, 0), true, new int[]{0}, new ZO[]{new ZO(rgc_3.class_, "", 0, 0)}, new HZ[0]);
   private final String break_;
   final ZX byte_;
   final boolean protected_;
   private final int[] throws_;
   final ZO[] case_;
   final HZ[] catch_;

   public Zh_1(String var1, ZX var2, boolean var3, int[] var4, ZO[] var5, HZ[] var6) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
   }

   public int class_(int var1) {
      int var2 = ZM.class_(this.throws_, var1);
      return this.throws_[var2];
   }

   public int class_(cm_3 var1, ZX var2) {
      int var3 = var2.break_ / 9;
      if (var3 < 0) {
         return 0;
      } else if (var3 >= this.case_.length) {
         return this.break_.length();
      } else {
         ZO var4 = this.case_[var3];
         return this.throws_[var3] + var1.break_().class_(var4.break_, var2.class_, var4.class_);
      }
   }

   public int class_(int var1, int var2) {
      int var3 = ZM.class_(this.throws_, var1);
      int var4 = var3 + var2;
      int var5;
      if (0 <= var4 && var4 < this.throws_.length) {
         int var6 = var1 - this.throws_[var3];
         int var7 = this.case_[var4].break_.length();
         var5 = this.throws_[var4] + Math.min(var6, var7);
      } else {
         var5 = var1;
      }

      return var5;
   }

   public int break_(int var1) {
      int var2 = ZM.class_(this.throws_, var1);
      return this.throws_[var2] + this.case_[var2].break_.length();
   }
}
