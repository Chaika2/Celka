package celestial;

class rrre_1 {
   private final int[][] class_;
   final int break_;
   final int byte_;
   private final int protected_;

   public rrre_1(int var1, int var2, int var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.class_ = new int[var1][var2];
   }

   public void class_(int var1, int var2, int var3, int var4) {
      if (this.class_(var1, var2) == var3) {
         this.class_(var1, var2, var4);
      }
   }

   public int class_(int var1, int var2) {
      return var1 >= 0 && var1 < this.break_ && var2 >= 0 && var2 < this.byte_ ? this.class_[var1][var2] : this.protected_;
   }

   public void class_(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = var2; var6 <= var4; var6++) {
         for (int var7 = var1; var7 <= var3; var7++) {
            this.class_(var7, var6, var5);
         }
      }
   }

   public void class_(int var1, int var2, int var3) {
      if (var1 >= 0 && var1 < this.break_ && var2 >= 0 && var2 < this.byte_) {
         this.class_[var1][var2] = var3;
      }
   }

   public boolean break_(int var1, int var2, int var3) {
      return this.class_(var1 - 1, var2) == var3
         || this.class_(var1 + 1, var2) == var3
         || this.class_(var1, var2 + 1) == var3
         || this.class_(var1, var2 - 1) == var3;
   }
}
