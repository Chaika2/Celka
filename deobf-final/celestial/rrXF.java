package celestial;

public class rrXF implements rrXI, rrXj_1 {
   private rrXj_1 class_;
   private boolean break_;
   private float[] byte_;

   @Override
   public rrXC byte_() {
      return rrXC.FLOAT;
   }

   public rrXF(rrXj_1 var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return "cached(" + this.class_ + ")";
   }

   @Override
   public float[] class_() {
      if (!this.break_) {
         this.byte_ = this.class_.class_();
         this.break_ = true;
      }

      return this.byte_;
   }

   @Override
   public void break_() {
      this.break_ = false;
   }
}
