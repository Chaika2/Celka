package celestial;

import java.util.EnumSet;

class rbU_2 extends rBk_1 {
   private final rbo_3 class_;
   private boolean break_;

   @Override
   public void byte_() {
      if ((rYB)this.class_.throws_[7] instanceof rrEm_1 var1) {
         this.break_ = false;
         this.class_.public_().final_();
         rfH_2 var2 = this.class_.Bs();
         rrrZ var3 = (double)var1.int_.nextFloat() >= 0.5 ? rrrZ.volatile_ : rrrZ.implements_;
         rfH_2 var4 = var1.class_(var3, var2, 50, false);
         if (var4 == null) {
            rrrZ var5 = var3.equals(rrrZ.volatile_) ? rrrZ.implements_ : rrrZ.volatile_;
            rfH_2 var6 = var1.class_(var5, var2, 50, false);
            if (var6 == null) {
               this.break_ = true;
               return;
            }

            this.class_.implements_(var6);
         } else {
            this.class_.implements_(var4);
         }

         var1.class_(this.class_, (byte)38);
      }
   }

   rbU_2(rbo_3 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      return this.class_.L() && this.class_.PA() >= 100;
   }

   @Override
   public boolean break_() {
      rfH_2 var1 = this.class_.throws_();
      return !new rfH_2((double)var1.b_(), this.class_.re(), (double)var1.d_()).class_(this.class_.Ps(), 4.0) && !this.break_ && this.class_.PA() >= 100;
   }

   @Override
   public void throws_() {
      rYB var1 = (rYB)this.class_.throws_[7];
      if (this.class_.sx() || this.class_.public_().native_()) {
         rjU_2 var2 = rjU_2.class_((rja_3)this.class_.throws_());
         rjU_2 var3 = iX_2.class_(this.class_, 16, 1, var2, (float) (Math.PI / 8));
         if (var3 == null) {
            var3 = iX_2.break_(this.class_, 8, 4, var2);
         }

         if (var3 != null) {
            rfH_2 var4 = new rfH_2(var3);
            if (!var1.break_(var4).class_(rlG_2.break_) || !var1.byte_(var4).class_(var1, var4, rLT.WATER)) {
               var3 = iX_2.break_(this.class_, 8, 5, var2);
            }
         }

         if (var3 == null) {
            this.break_ = true;
            return;
         }

         this.class_.continue_().class_(var3.break_, var3.byte_, var3.protected_, (float)(this.class_.S() + 20), (float)this.class_.r());
         this.class_.public_().class_(var3.break_, var3.byte_, var3.protected_, 1.3);
         if (var1.int_.nextInt(80) == 0) {
            var1.class_(this.class_, (byte)38);
         }
      }
   }

   @Override
   public void protected_() {
      rfH_2 var1 = this.class_.throws_();
      if (new rfH_2((double)var1.b_(), this.class_.re(), (double)var1.d_()).class_(this.class_.Ps(), 4.0) || this.break_) {
         this.class_.this_(false);
      }
   }

   @Override
   public boolean J_() {
      return false;
   }
}
