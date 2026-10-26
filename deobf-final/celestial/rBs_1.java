package celestial;

import java.util.EnumSet;

public class rBs_1 extends rBk_1 {
   private final rEJ class_;
   private iB_2 break_;

   @Override
   public void byte_() {
      this.class_.public_().final_();
      this.break_ = this.class_.I_();
   }

   public rBs_1(rEJ var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.class_.I_();
      return this.class_.L() > 0 || var1 != null && this.class_.int_(var1) < 9.0;
   }

   @Override
   public void throws_() {
      if (this.break_ == null) {
         this.class_.class_(-1);
      } else if (this.class_.int_(this.break_) > 49.0) {
         this.class_.class_(-1);
      } else if (!this.class_.goto_().class_(this.break_)) {
         this.class_.class_(-1);
      } else {
         this.class_.class_(1);
      }
   }

   @Override
   public void protected_() {
      this.break_ = null;
   }
}
