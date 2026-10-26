package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSF extends rSp_1 {
   private static final Logger break_ = LogManager.getLogger();
   private rjU_2 byte_;
   private int protected_;

   @Override
   public void byte_() {
      this.byte_ = null;
      this.protected_ = 0;
   }

   public rSF(rSu_1 var1) {
      super(var1);
   }

   public void class_(rjU_2 var1) {
      this.byte_ = var1;
   }

   @Override
   public void break_() {
      if (this.byte_ == null) {
         break_.warn("Aborting charge player as no target was set.");
         this.class_.L().class_(rST.class_);
      } else if (this.protected_ > 0 && this.protected_++ >= 10) {
         this.class_.L().class_(rST.class_);
      } else {
         double var1 = this.byte_.protected_(this.class_.rx(), this.class_.re(), this.class_.BO());
         if (var1 < 100.0 || var1 > 22500.0 || (Boolean)this.class_.throws_[23] || (Boolean)this.class_.throws_[24]) {
            this.protected_++;
         }
      }
   }

   @Override
   public float throws_() {
      return 3.0F;
   }

   @Override
   public rjU_2 case_() {
      return this.byte_;
   }

   @Override
   public rST<rSF> protected_() {
      return rST.implements_;
   }
}
