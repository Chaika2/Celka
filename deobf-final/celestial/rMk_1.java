package celestial;

import java.util.EnumSet;

class rMk_1 extends rMr_1 {
   private double byte_;
   private double protected_;
   private int throws_;
   private int case_;

   @Override
   public void byte_() {
      this.finally_();
      this.case_ = 2 + this.break_.Sa().nextInt(3);
      this.break_.this_(true);
      this.break_.public_().final_();
   }

   public rMk_1(rba_3 var1) {
      super(var1);
      this.break_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      return this.break_.Sr() == null
         && this.break_.Sa().nextFloat() < 0.02F
         && !this.break_.Sc()
         && this.break_.I_() == null
         && this.break_.public_().native_()
         && !this.private_()
         && !this.break_.sd()
         && !this.break_.x();
   }

   @Override
   public boolean break_() {
      return this.case_ > 0;
   }

   @Override
   public void throws_() {
      this.throws_--;
      if (this.throws_ <= 0) {
         this.case_--;
         this.finally_();
      }

      this.break_
         .continue_()
         .class_(this.break_.rx() + this.byte_, this.break_.rH(), this.break_.BO() + this.protected_, (float)this.break_.S(), (float)this.break_.r());
   }

   private void finally_() {
      double var1 = (Math.PI * 2) * this.break_.Sa().nextDouble();
      this.byte_ = Math.cos(var1);
      this.protected_ = Math.sin(var1);
      this.throws_ = 80 + this.break_.Sa().nextInt(20);
   }

   @Override
   public void protected_() {
      this.break_.this_(false);
   }
}
