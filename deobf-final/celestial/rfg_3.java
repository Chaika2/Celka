package celestial;

public class rfg_3 {
   public final int class_;
   public final int break_;

   public rfg_3(int var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public rfg_3(rfH_2 var1) {
      this.class_ = var1.b_();
      this.break_ = var1.d_();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rfg_3 var2) ? false : this.class_ == var2.class_ && this.break_ == var2.break_;
      }
   }

   @Override
   public String toString() {
      return "[" + this.class_ + ", " + this.break_ + "]";
   }

   @Override
   public int hashCode() {
      int var1 = 1664525 * this.class_ + 1013904223;
      int var2 = 1664525 * (this.break_ ^ -559038737) + 1013904223;
      return var1 ^ var2;
   }
}
