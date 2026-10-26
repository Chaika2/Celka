package celestial;

import java.util.EnumSet;
import java.util.Random;

public class rBH extends rBk_1 {
   private final aA_2 class_;
   private final int break_;
   private rfH_2 byte_;

   public rBH(aA_2 var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (this.class_.BP()) {
         return false;
      } else if (((rYB)this.class_.throws_[7]).strictfp_()) {
         return false;
      } else if (this.class_.Sa().nextInt(this.break_) != 0) {
         return false;
      } else {
         rrEm_1 var1 = (rrEm_1)((rYB)this.class_.throws_[7]);
         rfH_2 var2 = this.class_.Bs();
         if (!var1.byte_(var2, 6)) {
            return false;
         } else {
            rjU_2 var3 = iX_2.class_(this.class_, 15, 7, var1x -> (double)(-var1.break_(rjh_3.class_(var1x))));
            this.byte_ = var3 == null ? null : new rfH_2(var3);
            return this.byte_ != null;
         }
      }
   }

   @Override
   public boolean break_() {
      return this.byte_ != null && !this.class_.public_().native_() && this.class_.public_().catch_().equals(this.byte_);
   }

   @Override
   public void throws_() {
      if (this.byte_ != null) {
         rLy_1 var1 = this.class_.public_();
         if (var1.native_() && !this.byte_.class_(this.class_.Ps(), 10.0)) {
            rjU_2 var2 = rjU_2.protected_(this.byte_);
            rjU_2 var3 = this.class_.Ps();
            rjU_2 var4 = var3.protected_(var2);
            var2 = var4.class_(0.4).throws_(var2);
            rjU_2 var5 = var2.protected_(var3).protected_().class_(10.0).throws_(var3);
            rfH_2 var6 = new rfH_2(var5);
            var6 = ((rYB)this.class_.throws_[7]).class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, var6);
            if (!var1.class_((double)var6.b_(), (double)var6.c_(), (double)var6.d_(), 1.0)) {
               this.catch_();
            }
         }
      }
   }

   private void catch_() {
      Random var1 = this.class_.Sa();
      rfH_2 var2 = ((rYB)this.class_.throws_[7])
         .class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, this.class_.Bs().break_(-8 + var1.nextInt(16), 0, -8 + var1.nextInt(16)));
      this.class_.public_().class_((double)var2.b_(), (double)var2.c_(), (double)var2.d_(), 1.0);
   }
}
