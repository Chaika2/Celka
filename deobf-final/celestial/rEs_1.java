package celestial;

import java.util.EnumSet;

public class rEs_1 extends rBk_1 {
   private final rEB break_;
   private final float byte_;
   public final ay_3 class_ = new ay_3().class_(8.0).protected_().class_().break_().byte_().throws_();

   @Override
   public void byte_() {
      super.byte_();
      this.break_.public_().final_();

      for (rEB var2 : ((rYB)this.break_.throws_[7]).class_(rEB.class, this.class_, this.break_, this.break_.rN().byte_(8.0, 8.0, 8.0))) {
         var2.byte_(this.break_.I_());
      }
   }

   public rEs_1(rEB var1, rsi_3 var2, float var3) {
      this.break_ = var2;
      this.byte_ = var3 * var3;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.break_.Sr();
      return this.break_.sx() == null && this.break_.sA() && this.break_.I_() != null && !this.break_.v() && (var1 == null || var1.BC() != aI_2.rM);
   }

   @Override
   public void throws_() {
      iB_2 var1 = this.break_.I_();
      if (var1 != null) {
         if (this.break_.int_(var1) > (double)this.byte_) {
            this.break_.continue_().class_(var1, 30.0F, 30.0F);
            if (rEB.throws_(this.break_).nextInt(50) == 0) {
               this.break_.long_();
            }
         } else {
            this.break_.case_(true);
         }

         super.throws_();
      }
   }

   @Override
   public void protected_() {
      super.protected_();
      iB_2 var1 = this.break_.I_();
      if (var1 != null) {
         for (rEB var3 : ((rYB)this.break_.throws_[7]).class_(rEB.class, this.class_, this.break_, this.break_.rN().byte_(8.0, 8.0, 8.0))) {
            var3.byte_(var1);
            var3.case_(true);
         }

         this.break_.case_(true);
      }
   }
}
