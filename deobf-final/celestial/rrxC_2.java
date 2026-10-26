package celestial;

public class rrxC_2 {
   private fj_3 class_;
   private int[] break_;
   private int[] byte_;

   public int[] byte_() {
      return this.byte_;
   }

   public rrxC_2(fj_3 var1, int[] var2, int[] var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      if (var2.length != var3.length) {
         throw new IllegalArgumentException(var2.length + " != " + var3.length);
      }
   }

   @Override
   public String toString() {
      return this.class_.finally_() + ", " + this.break_.length;
   }

   public fj_3 class_() {
      return this.class_;
   }

   public int[] break_() {
      return this.break_;
   }
}
