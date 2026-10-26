package celestial;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

class rEE extends rBk_1 {
   private final rEB class_;
   private final double break_;
   private rfH_2 byte_;
   private final List<rfH_2> protected_ = Lists.newArrayList();
   private final int throws_;
   private boolean case_;

   @Override
   public void byte_() {
      super.byte_();
      this.class_.native_(0);
      this.class_.public_().class_((double)this.byte_.b_(), (double)this.byte_.c_(), (double)this.byte_.d_(), this.break_);
      this.case_ = false;
   }

   public rEE(rEB var1, double var2, int var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.throws_ = var4;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   private boolean class_(rfH_2 var1) {
      for (rfH_2 var3 : this.protected_) {
         if (Objects.equals(var1, var3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean class_() {
      this.finally_();
      return this.catch_() && this.private_() && this.class_.I_() == null;
   }

   @Override
   public boolean break_() {
      return this.class_.public_().native_()
         ? false
         : this.class_.I_() == null && !this.byte_.class_(this.class_.Ps(), (double)(this.class_.PN() + (float)this.throws_)) && !this.case_;
   }

   @Override
   public void throws_() {
      if (this.class_.public_().native_()) {
         rjU_2 var1 = rjU_2.protected_(this.byte_);
         rjU_2 var2 = iX_2.class_(this.class_, 16, 7, var1, (float) (Math.PI / 10));
         if (var2 == null) {
            var2 = iX_2.break_(this.class_, 8, 7, var1);
         }

         if (var2 == null) {
            this.case_ = true;
            return;
         }

         this.class_.public_().class_(var2.break_, var2.byte_, var2.protected_, this.break_);
      }
   }

   private void finally_() {
      if (this.protected_.size() > 2) {
         this.protected_.remove(0);
      }
   }

   private boolean catch_() {
      return this.class_.sd() && !this.class_.sx().class_();
   }

   @Override
   public void protected_() {
      if (this.byte_.class_(this.class_.Ps(), (double)this.throws_)) {
         this.protected_.add(this.byte_);
      }
   }

   private boolean private_() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.class_.throws_[7]);
      rfH_2 var2 = this.class_.Bs();
      Optional var3 = var1.d().class_(var0 -> var0 == rRP.continue_, this::class_, rRr_1.ANY, var2, 48, rEB.case_(this.class_));
      if (!var3.isPresent()) {
         return false;
      } else {
         this.byte_ = ((rfH_2)var3.get()).int_();
         return true;
      }
   }
}
