package celestial;

import java.util.List;
import java.util.function.Predicate;

public class rBd_1 extends rBk_1 {
   private final rOt_1 class_;
   private int break_;
   private int byte_;

   @Override
   public void byte_() {
      this.break_ = 0;
   }

   public rBd_1(rOt_1 var1) {
      this.class_ = var1;
      this.byte_ = this.class_(var1);
   }

   protected int class_(rOt_1 var1) {
      return 200 + var1.Sa().nextInt(200) % 20;
   }

   @Override
   public boolean class_() {
      if (this.class_.sz()) {
         return false;
      } else if (this.class_.sd()) {
         return true;
      } else if (this.byte_ > 0) {
         this.byte_--;
         return false;
      } else {
         this.byte_ = this.class_(this.class_);
         Predicate var1 = var0 -> var0.sW() || !var0.sd();
         List var2 = ((rYB)this.class_.throws_[7]).class_(this.class_.getClass(), this.class_.rN().byte_(8.0, 8.0, 8.0), var1);
         rOt_1 var3 = var2.stream().filter(rOt_1::sW).findAny().orElse(this.class_);
         var3.class_(var2.stream().filter(var0 -> !var0.sd()));
         return this.class_.sd();
      }
   }

   @Override
   public boolean break_() {
      return this.class_.sd() && this.class_.sQ();
   }

   @Override
   public void throws_() {
      if (--this.break_ <= 0) {
         this.break_ = 10;
         this.class_.sN();
      }
   }

   @Override
   public void protected_() {
      this.class_.sk();
   }
}
