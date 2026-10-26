package celestial;

public class rBZ extends rBk_1 {
   private final rOh_1 class_;
   private rhN_2 break_;
   private boolean byte_;

   @Override
   public void byte_() {
      this.break_ = (rhN_2)this.class_.sF();
      this.byte_ = false;
   }

   public rBZ(rOh_1 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      rhN_2 var1 = (rhN_2)this.class_.sF();
      boolean var2 = var1 != null && !var1.native_() && !((rhx_3)var1.implements_[18]).break_ && !var1.rT();
      return !this.class_.sL() && var2 && this.class_.sd();
   }

   @Override
   public void throws_() {
      if (!this.byte_ && !this.class_.Sc() && !this.class_.z() && this.class_.rN().byte_(this.break_.rN())) {
         this.byte_ = this.class_.protected_(this.break_);
      }
   }

   @Override
   public boolean J_() {
      return !this.byte_;
   }
}
