package celestial;

public class rSW extends rBl_1 {
   private final rbB_2 break_;
   private int byte_;

   @Override
   public void byte_() {
      super.byte_();
      this.byte_ = 0;
   }

   public rSW(rbB_2 var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.break_ = var1;
   }

   @Override
   public void throws_() {
      super.throws_();
      this.byte_++;
      if (this.byte_ >= 5 && this.finally_() < this.extends_() / 2) {
         this.break_.case_(true);
      } else {
         this.break_.case_(false);
      }
   }

   @Override
   public void protected_() {
      super.protected_();
      this.break_.case_(false);
   }
}
