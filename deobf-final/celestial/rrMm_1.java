package celestial;

public class rrMm_1 {
   private int class_;
   private int break_;
   private int byte_;
   private String protected_;

   public int byte_() {
      return this.byte_;
   }

   public rrMm_1(int var1, int var2, int var3, String var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public rrMm_1(int var1, int var2, int var3) {
      this(var1, var2, var3, (String)null);
   }

   public rrMm_1(int var1, int var2) {
      this(var1, var2, 0);
   }

   @Override
   public String toString() {
      return this.protected_ == null
         ? this.class_ + "." + this.break_ + "." + this.byte_
         : this.class_ + "." + this.break_ + "." + this.byte_ + this.protected_;
   }

   public int class_() {
      return this.class_;
   }

   public int break_() {
      return this.break_;
   }

   public int protected_() {
      if (this.break_ > 9) {
         return this.class_ * 100 + this.break_;
      } else {
         return this.byte_ > 9 ? this.class_ * 100 + this.break_ * 10 + 9 : this.class_ * 100 + this.break_ * 10 + this.byte_;
      }
   }
}
