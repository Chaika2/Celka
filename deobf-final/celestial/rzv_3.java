package celestial;

import java.util.function.Predicate;

class rzv_3 implements rQz_1 {
   private final rQz_1[] class_;
   private final Predicate<rzr_3> break_;

   rzv_3(rQz_1[] var1) {
      this.class_ = var1;
      this.break_ = rQF.class_(var1);
   }

   public final boolean class_(rzr_3 var1) {
      return this.break_.test(var1);
   }

   @Override
   public void class_(rQs_1 var1) {
      rQz_1.super.class_(var1);

      for (int var2 = 0; var2 < this.class_.length; var2++) {
         this.class_[var2].class_(var1.break_(".term[" + var2 + "]"));
      }
   }

   @Override
   public rWi_1 break_() {
      throw new UnsupportedOperationException();
   }
}
