package celestial;

import java.util.EnumSet;
import java.util.function.Predicate;

public class rBb_1 extends rBk_1 {
   private static final Predicate<xc_3> class_ = Qd_1.class_(xu_3.e);
   private final is_3 break_;
   private final rYB byte_;
   private int protected_;

   @Override
   public void byte_() {
      this.protected_ = 40;
      this.byte_.class_(this.break_, (byte)10);
      this.break_.public_().final_();
   }

   public rBb_1(is_3 var1) {
      this.break_ = var1;
      this.byte_ = (rYB)var1.throws_[7];
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK, rBW.JUMP));
   }

   @Override
   public boolean class_() {
      if (this.break_.Sa().nextInt(this.break_.n_() ? 50 : 1000) != 0) {
         return false;
      } else {
         rfH_2 var1 = this.break_.Bs();
         return class_.test(this.byte_.byte_(var1)) ? true : this.byte_.byte_(var1.break_()).class_(xu_3.implements_);
      }
   }

   @Override
   public boolean break_() {
      return this.protected_ > 0;
   }

   @Override
   public void throws_() {
      this.protected_ = Math.max(0, this.protected_ - 1);
      if (this.protected_ == 4) {
         rfH_2 var1 = this.break_.Bs();
         if (class_.test(this.byte_.byte_(var1))) {
            if (this.byte_.B().break_(rRu_1.break_)) {
               this.byte_.break_(var1, false);
            }

            this.break_.instanceof_();
         } else {
            rfH_2 var2 = var1.break_();
            if (this.byte_.byte_(var2).class_(xu_3.implements_)) {
               if (this.byte_.B().break_(rRu_1.break_)) {
                  this.byte_.byte_(2001, var2, xd_3.finally_(xu_3.implements_.continue_()));
                  this.byte_.class_(var2, xu_3.finally_.continue_(), 2);
               }

               this.break_.instanceof_();
            }
         }
      }
   }

   public int catch_() {
      return this.protected_;
   }

   @Override
   public void protected_() {
      this.protected_ = 0;
   }
}
