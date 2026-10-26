package celestial;

import java.util.EnumSet;

class rMG extends rBk_1 {
   @Override
   public void byte_() {
      this.class_.this_(false);
      this.class_.public_(false);
   }

   public rMG(rba_3 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      if (this.class_.Sc()) {
         return false;
      } else {
         iB_2 var1 = this.class_.I_();
         return var1 != null
            && var1.BM()
            && rba_3.goto_.test(var1)
            && this.class_.int_(var1) > 36.0
            && !this.class_.x()
            && !this.class_.su()
            && !rba_3.break_(this.class_);
      }
   }

   @Override
   public void throws_() {
      iB_2 var1 = this.class_.I_();
      this.class_.continue_().class_(var1, (float)this.class_.S(), (float)this.class_.r());
      if (this.class_.int_(var1) <= 36.0) {
         this.class_.return_(true);
         this.class_.synchronized_(true);
         this.class_.public_().final_();
      } else {
         this.class_.public_().class_(var1, 1.5);
      }
   }

   @Override
   public void protected_() {
      iB_2 var1 = this.class_.I_();
      if (var1 != null && rba_3.class_(this.class_, var1)) {
         this.class_.return_(true);
         this.class_.synchronized_(true);
         this.class_.public_().final_();
         this.class_.continue_().class_(var1, (float)this.class_.S(), (float)this.class_.r());
      } else {
         this.class_.return_(false);
         this.class_.synchronized_(false);
      }
   }
}
