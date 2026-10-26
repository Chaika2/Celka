package celestial;

public class rrzS_2 {
   private int class_;
   private int break_;
   private final int byte_;

   public rrzS_2(int var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var1 + 37 * var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof rrzS_2 var2) ? false : this.class_ == var2.class_ && this.break_ == var2.break_;
      }
   }

   @Override
   public String toString() {
      return "(" + this.class_ + ", " + this.break_ + ")";
   }

   @Override
   public int hashCode() {
      return this.byte_;
   }

   public static rrzS_2 class_(int var0, int var1) {
      return new rrzS_2(var0, var1);
   }

   public int class_() {
      return this.class_;
   }

   public int break_() {
      return this.break_;
   }
}
