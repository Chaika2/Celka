package celestial;

import java.util.EnumSet;

public class rGq_1 extends rBk_1 {
   @Override
   public void byte_() {
      super.byte_();
      rGp_1.class_(this.break_).final_();
   }

   public rGq_1(rGp_1 var1) {
      this.break_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      return this.break_.sl() > 0;
   }

   @Override
   public void throws_() {
      if (this.break_.I_() != null) {
         this.break_.continue_().class_(this.break_.I_(), (float)this.break_.S(), (float)this.break_.r());
      }
   }

   @Override
   public void protected_() {
      super.protected_();
      this.break_.class_(rGT.NONE);
   }
}
