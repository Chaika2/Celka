package celestial;

public class rLP implements rLr_1 {
   private static final rgP_2 class_ = new rgn_3("multiplayer.status.request_handled");
   private final rnW_2 break_;
   private final rud_3 byte_;
   private boolean protected_;

   public rLP(rnW_2 var1, rud_3 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public void class_(rLS var1) {
      if (this.protected_) {
         this.byte_.class_(class_);
      } else {
         this.protected_ = true;
         this.byte_.class_(new rLb_1(this.break_.L()));
      }
   }

   @Override
   public void class_(rLB var1) {
      this.byte_.class_(new rLG(var1.break_()));
      this.byte_.class_(class_);
   }

   @Override
   public void class_(rgP_2 var1, rgP_2 var2) {
   }

   @Override
   public rud_3 class_() {
      return this.byte_;
   }
}
