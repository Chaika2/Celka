package celestial;

import java.util.function.Predicate;

public class rPi_1 extends rBu_1 {
   private final Predicate<rRO> catch_;
   protected int class_;
   protected int break_ = -1;
   protected int byte_ = -1;

   @Override
   public void byte_() {
      super.byte_();
      this.class_ = 0;
   }

   public rPi_1(is_3 var1, Predicate<rRO> var2) {
      super(var1);
      this.catch_ = var2;
   }

   public rPi_1(is_3 var1, int var2, Predicate<rRO> var3) {
      this(var1, var3);
      this.byte_ = var2;
   }

   private boolean class_(rRO var1) {
      return this.catch_.test(var1);
   }

   @Override
   public boolean class_() {
      if (!super.class_()) {
         return false;
      } else {
         return !((rYB)this.protected_.throws_[7]).B().break_(rRu_1.break_)
            ? false
            : this.class_(((rYB)this.protected_.throws_[7]).abstract_()) && !this.catch_();
      }
   }

   @Override
   public boolean break_() {
      return this.class_ <= this.case_()
         && !this.catch_()
         && this.throws_.class_(this.protected_.Ps(), 2.0)
         && this.class_(((rYB)this.protected_.throws_[7]).abstract_());
   }

   @Override
   public void throws_() {
      super.throws_();
      if (this.protected_.Sa().nextInt(20) == 0) {
         ((rYB)this.protected_.throws_[7]).byte_(1019, this.throws_, 0);
         if (!(Boolean)this.protected_.private_[5]) {
            this.protected_.class_(this.protected_.P());
         }
      }

      this.class_++;
      int var1 = (int)((float)this.class_ / (float)this.case_() * 10.0F);
      if (var1 != this.break_) {
         ((rYB)this.protected_.throws_[7]).class_(this.protected_.V(), this.throws_, var1);
         this.break_ = var1;
      }

      if (this.class_ == this.case_() && this.class_(((rYB)this.protected_.throws_[7]).abstract_())) {
         ((rYB)this.protected_.throws_[7]).class_(this.throws_, false);
         ((rYB)this.protected_.throws_[7]).byte_(1021, this.throws_, 0);
         ((rYB)this.protected_.throws_[7]).byte_(2001, this.throws_, xd_3.finally_(((rYB)this.protected_.throws_[7]).byte_(this.throws_)));
      }
   }

   protected int case_() {
      return Math.max(240, this.byte_);
   }

   @Override
   public void protected_() {
      super.protected_();
      ((rYB)this.protected_.throws_[7]).class_(this.protected_.V(), this.throws_, -1);
   }
}
