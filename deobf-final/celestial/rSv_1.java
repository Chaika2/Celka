package celestial;

public class rSv_1 extends rSw_1 {
   private int break_;

   @Override
   public void byte_() {
      this.break_ = 0;
   }

   public rSv_1(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void class_() {
      ((rYB)this.class_.throws_[7])
         .class_(this.class_.rx(), this.class_.re(), this.class_.BO(), rqn_3.BF, this.class_.Pr(), 2.5F, 0.8F + this.class_.Sa().nextFloat() * 0.3F, false);
   }

   @Override
   public void break_() {
      if (this.break_++ >= 40) {
         this.class_.L().class_(rST.case_);
      }
   }

   @Override
   public rST<rSv_1> protected_() {
      return rST.private_;
   }
}
