package celestial;

import java.util.EnumSet;

public class rES extends rBk_1 {
   private final rEB break_;

   @Override
   public void byte_() {
      this.break_.else_(true);
      super.byte_();
   }

   rES(rEB var1, rEB var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      rrEr_1 var1 = this.break_.sx();
      return this.break_.BM() && this.break_.I_() == null && var1 != null && var1.case_();
   }

   @Override
   public void throws_() {
      if (!this.break_.BF() && rEB.class_(this.break_).nextInt(100) == 0) {
         this.class_.class_(this.class_.sQ(), rEB.break_(this.class_), rEB.byte_(this.class_));
      }

      if (!this.break_.Pm() && rEB.protected_(this.break_).nextInt(50) == 0) {
         this.break_.else_().class_();
      }

      super.throws_();
   }

   @Override
   public void protected_() {
      this.break_.else_(false);
      super.protected_();
   }
}
