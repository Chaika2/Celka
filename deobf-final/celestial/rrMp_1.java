package celestial;

public class rrMp_1 {
   private int class_;
   private int break_;

   public rrMp_1(int var1, int var2) {
      this.class_ = Math.min(var1, var2);
      this.break_ = Math.max(var1, var2);
   }

   @Override
   public String toString() {
      return "min: " + this.class_ + ", max: " + this.break_;
   }

   public boolean class_(int var1) {
      return var1 < this.class_ ? false : var1 <= this.break_;
   }

   public int class_() {
      return this.class_;
   }

   public int break_() {
      return this.break_;
   }
}
