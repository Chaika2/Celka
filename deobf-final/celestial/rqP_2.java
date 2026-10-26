package celestial;

public class rqP_2 extends rqr_3 {
   private final Qw_1 class_;

   public rqP_2(Qw_1 var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(boolean var1) {
      rrAO var2 = rrAO.class_(
         this.class_.h.protected_(),
         this.class_.J.protected_(),
         this.class_.X.protected_(),
         this.class_.x.protected_(),
         this.protected_ == this.throws_ ? 0.0F : (this.protected_ ? 1.0F : -1.0F),
         this.case_ == this.catch_ ? 0.0F : (this.case_ ? 1.0F : -1.0F),
         this.class_.d.protected_(),
         this.class_.k.protected_(),
         0.3
      );
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
      if (var2.byte_()) {
         this.protected_ = false;
         this.throws_ = false;
         this.case_ = false;
         this.catch_ = false;
         this.byte_ = 0.0F;
         this.break_ = 0.0F;
         this.private_ = false;
         this.implements_ = false;
      } else {
         if (this.finally_) {
            var2.protected_(false);
            var2.byte_(false);
            var2.case_(false);
            var2.throws_(false);
            var2.break_(0.0F);
            var2.class_(0.0F);
         }

         if (this.extends_) {
            var2.break_(false);
         }

         if (this.native_) {
            var2.catch_(false);
         }

         double var3 = var2.case_();
         this.protected_ = var2.extends_();
         this.throws_ = var2.class_();
         this.case_ = var2.protected_();
         this.catch_ = var2.finally_();
         this.byte_ = var2.catch_();
         this.break_ = var2.throws_();
         this.private_ = var2.break_();
         this.implements_ = var2.implements_();
         if (var1) {
            this.break_ = (float)((double)this.break_ * var3);
            this.byte_ = (float)((double)this.byte_ * var3);
         }

         this.finally_ = false;
         this.extends_ = false;
         this.native_ = false;
      }
   }
}
