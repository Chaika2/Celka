package celestial;

public class cP_2 implements NW {
   private final cb_3 class_;
   private final Nf_1 break_;
   private int byte_ = 0;

   public cP_2(cb_3 var1, Nf_1 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public void break_() {
      this.byte_--;
      if (this.byte_ <= 0 && this.class_.W()) {
         float var1 = ((rYB)this.class_.throws_[7]).int_.nextFloat();
         if (var1 < 1.0E-4F) {
            this.byte_ = 0;
            this.break_.class_((NQ)(new cS_2(this.class_, rqn_3.synchronized_)));
         } else if (var1 < 0.001F) {
            this.byte_ = 0;
            this.break_.class_((NQ)(new cS_2(this.class_, rqn_3.else_)));
         } else if (var1 < 0.01F) {
            this.byte_ = 0;
            this.break_.class_((NQ)(new cS_2(this.class_, rqn_3.this_)));
         }
      }
   }
}
