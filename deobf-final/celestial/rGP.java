package celestial;

import java.util.EnumSet;
import java.util.List;
import java.util.Random;

public class rGP<T extends rGr_1> extends rBk_1 {
   private final T class_;
   private final double break_;
   private final double byte_;
   private long protected_;

   @Override
   public void byte_() {
   }

   public rGP(T var1, double var2, double var4) {
      this.class_ = (T)var1;
      this.break_ = var2;
      this.byte_ = var4;
      this.protected_ = -1L;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      boolean var1 = ((rYB)this.class_.throws_[7]).r() < this.protected_;
      return this.class_.sA() && this.class_.I_() == null && !this.class_.BP() && this.class_.sv() && !var1;
   }

   @Override
   public void throws_() {
      boolean var1 = this.class_.sF();
      rLy_1 var2 = this.class_.public_();
      if (var2.native_()) {
         List var3 = this.catch_();
         if (this.class_.sA() && var3.isEmpty()) {
            this.class_.return_(false);
         } else if (var1 && this.class_.sZ().class_(this.class_.Ps(), 10.0)) {
            this.class_.sL();
         } else {
            rjU_2 var4 = rjU_2.protected_(this.class_.sZ());
            rjU_2 var5 = this.class_.Ps();
            rjU_2 var6 = var5.protected_(var4);
            var4 = var6.break_(90.0F).class_(0.4).throws_(var4);
            rjU_2 var7 = var4.protected_(var5).protected_().class_(10.0).throws_(var5);
            rfH_2 var8 = new rfH_2(var7);
            var8 = ((rYB)this.class_.throws_[7]).class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, var8);
            if (!var2.class_((double)var8.b_(), (double)var8.c_(), (double)var8.d_(), var1 ? this.byte_ : this.break_)) {
               this.private_();
               this.protected_ = ((rYB)this.class_.throws_[7]).r() + 200L;
            } else if (var1) {
               for (rGr_1 var10 : var3) {
                  var10.implements_(var8);
               }
            }
         }
      }
   }

   private List<rGr_1> catch_() {
      return ((rYB)this.class_.throws_[7]).class_(rGr_1.class, this.class_.rN().class_(16.0), var1 -> var1.sJ() && !var1.continue_(this.class_));
   }

   @Override
   public void protected_() {
   }

   private boolean private_() {
      Random var1 = this.class_.Sa();
      rfH_2 var2 = ((rYB)this.class_.throws_[7])
         .class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, this.class_.Bs().break_(-8 + var1.nextInt(16), 0, -8 + var1.nextInt(16)));
      return this.class_.public_().class_((double)var2.b_(), (double)var2.c_(), (double)var2.d_(), this.break_);
   }
}
