package celestial;

public class rVr_1 {
   private int class_;
   private int break_;
   private int byte_;
   private int protected_;

   public void byte_(int var1) {
      this.byte_ = var1;
   }

   public int byte_() {
      return this.byte_;
   }

   public rVr_1() {
   }

   public rVr_1(int var1, int var2, int var3, int var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rVr_1 var2 = (rVr_1)var1;
         if (var2.class_ != this.class_) {
            return false;
         } else if (var2.break_ != this.break_) {
            return false;
         } else {
            return var2.byte_ != this.byte_ ? false : var2.protected_ == this.protected_;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "[" + this.class_ + ", " + this.break_ + ", " + this.byte_ + ", " + this.protected_ + "]";
   }

   @Override
   public int hashCode() {
      int var1 = this.class_;
      var1 = 31 * var1 + this.break_;
      var1 = 31 * var1 + this.byte_;
      return 31 * var1 + this.protected_;
   }

   public int class_() {
      return this.class_;
   }

   public void class_(int var1) {
      this.class_ = var1;
   }

   public int break_() {
      return this.break_;
   }

   public void break_(int var1) {
      this.break_ = var1;
   }

   public int protected_() {
      return this.protected_;
   }

   public void protected_(int var1) {
      this.protected_ = var1;
   }
}
