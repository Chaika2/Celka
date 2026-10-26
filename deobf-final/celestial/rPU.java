package celestial;

import java.util.EnumSet;

public class rPU extends rBk_1 {
   private final rOH class_;
   private rhd_3 break_;
   private final rYB byte_;
   private final float protected_;
   private int throws_;
   private final ay_3 case_;

   @Override
   public void byte_() {
      this.class_.this_(true);
      this.throws_ = 40 + this.class_.Sa().nextInt(40);
   }

   public rPU(rOH var1, float var2) {
      this.class_ = var1;
      this.byte_ = (rYB)var1.throws_[7];
      this.protected_ = var2;
      this.case_ = new ay_3().class_((double)var2).class_().break_().protected_();
      this.class_(EnumSet.of(rBW.LOOK));
   }

   private boolean class_(rhd_3 var1) {
      for (rpm_3 var5 : rpm_3.values()) {
         rdn_3 var6 = var1.protected_(var5);
         if (this.class_.sZ() && var6.break_() == rdy_3.XR) {
            return true;
         }

         if (this.class_.extends_(var6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean class_() {
      this.break_ = this.byte_.class_(this.case_, this.class_);
      return this.break_ == null ? false : this.class_(this.break_);
   }

   @Override
   public boolean break_() {
      if (!this.break_.BM()) {
         return false;
      } else {
         return this.class_.int_(this.break_) > (double)(this.protected_ * this.protected_) ? false : this.throws_ > 0 && this.class_(this.break_);
      }
   }

   @Override
   public void throws_() {
      this.class_.continue_().class_(this.break_.rx(), this.break_.rH(), this.break_.BO(), 10.0F, (float)this.class_.r());
      this.throws_--;
   }

   @Override
   public void protected_() {
      this.class_.this_(false);
      this.break_ = null;
   }
}
