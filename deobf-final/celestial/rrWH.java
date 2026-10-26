package celestial;

public class rrWH {
   private int[] class_ = null;
   private int break_ = 0;
   private int byte_ = 0;

   public int byte_(int var1) {
      return this.class_[var1];
   }

   public int byte_() {
      return this.byte_;
   }

   public rrWH(int var1) {
      this.class_ = new int[var1];
   }

   @Override
   public String toString() {
      return "position: " + this.break_ + ", limit: " + this.byte_ + ", capacity: " + this.class_.length;
   }

   public void class_(int var1, int var2) {
      this.protected_(var2);
      this.class_[var1] = var2;
      if (this.byte_ < var1) {
         this.byte_ = var1;
      }
   }

   public int[] class_() {
      return this.class_;
   }

   public void class_(int var1) {
      this.protected_(this.break_);
      this.class_[this.break_] = var1;
      this.break_++;
      if (this.byte_ < this.break_) {
         this.byte_ = this.break_;
      }
   }

   public void class_(int[] var1) {
      this.protected_(this.break_ + var1.length - 1);
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2; var3++) {
         this.class_[this.break_] = var1[var3];
         this.break_++;
      }

      if (this.byte_ < this.break_) {
         this.byte_ = this.break_;
      }
   }

   public void break_(int var1) {
      this.break_ = var1;
   }

   public void break_() {
      this.break_ = 0;
      this.byte_ = 0;
   }

   public int[] throws_() {
      int[] var1 = new int[this.byte_];
      System.arraycopy(this.class_, 0, var1, 0, var1.length);
      return var1;
   }

   public int protected_() {
      return this.break_;
   }

   private void protected_(int var1) {
      if (var1 >= this.class_.length) {
         int var2 = rfU_2.byte_(var1 + 1);
         int[] var3 = new int[var2];
         System.arraycopy(this.class_, 0, var3, 0, this.class_.length);
         this.class_ = var3;
      }
   }
}
