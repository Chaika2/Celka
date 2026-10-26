package celestial;

public class rpN_2 {
   private final long[] class_ = new long[240];
   private int break_;
   private int byte_;
   private int protected_;

   public long[] byte_() {
      return this.class_;
   }

   public int class_(int var1) {
      return var1 % 240;
   }

   public int class_() {
      return this.break_;
   }

   public void class_(long var1) {
      this.class_[this.protected_] = var1;
      this.protected_++;
      if (this.protected_ == 240) {
         this.protected_ = 0;
      }

      if (this.byte_ < 240) {
         this.break_ = 0;
         this.byte_++;
      } else {
         this.break_ = this.class_(this.protected_ + 1);
      }
   }

   public int class_(long var1, int var3, int var4) {
      double var5 = (double)var1 / (double)(1000000000L / (long)var4);
      return (int)(var5 * (double)var3);
   }

   public int break_() {
      return this.protected_;
   }
}
