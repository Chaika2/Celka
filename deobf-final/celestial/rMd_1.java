package celestial;

import java.util.UUID;
import java.util.function.Predicate;

class rMd_1 extends rBI<iB_2> {
   private iB_2 finally_;
   private iB_2 extends_;
   private int native_;

   @Override
   public void byte_() {
      this.class_(this.finally_);
      this.byte_ = this.finally_;
      if (this.extends_ != null) {
         this.native_ = this.extends_.Sb();
      }

      this.implements_.class_(rqn_3.Su, 1.0F, 1.0F);
      this.implements_.goto_(true);
      this.implements_.sF();
      super.byte_();
   }

   public rMd_1(Class<iB_2> var1, boolean var2, boolean var3, Predicate<iB_2> var4, Predicate var5) {
      super(var1, var2, 10, var3, var4, var5);
      this.implements_ = var1;
   }

   @Override
   public boolean class_() {
      if (this.break_ > 0 && this.throws_.Sa().nextInt(this.break_) != 0) {
         return false;
      } else {
         for (UUID var2 : this.implements_.sZ()) {
            if (var2 != null
               && (rYB)this.implements_.throws_[7] instanceof rrEm_1
               && ((rrEm_1)((rYB)this.implements_.throws_[7])).break_(var2) instanceof iB_2 var4) {
               this.extends_ = var4;
               this.finally_ = var4.Sr();
               int var5 = var4.Sb();
               return var5 != this.native_ && this.class_(this.finally_, this.protected_);
            }
         }

         return false;
      }
   }
}
