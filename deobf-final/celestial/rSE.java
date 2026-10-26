package celestial;

import java.util.EnumSet;

public class rSE extends rBk_1 {
   private static final ay_3 class_ = new ay_3().class_(6.0).break_().class_();
   private final rMZ break_;
   private rsq_3 byte_;
   private int protected_;

   @Override
   public void byte_() {
      this.protected_ = 400;
      this.break_.this_(true);
   }

   public rSE(rMZ var1) {
      this.break_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      if (!((rYB)this.break_.throws_[7]).strictfp_()) {
         return false;
      } else if (this.break_.Sa().nextInt(8000) != 0) {
         return false;
      } else {
         this.byte_ = ((rYB)this.break_.throws_[7])
            .class_(rsq_3.class, class_, this.break_, this.break_.rx(), this.break_.re(), this.break_.BO(), this.break_.rN().byte_(6.0, 2.0, 6.0));
         return this.byte_ != null;
      }
   }

   @Override
   public boolean break_() {
      return this.protected_ > 0;
   }

   @Override
   public void throws_() {
      this.break_.continue_().class_(this.byte_, 30.0F, 30.0F);
      this.protected_--;
   }

   @Override
   public void protected_() {
      this.break_.this_(false);
      this.byte_ = null;
   }
}
