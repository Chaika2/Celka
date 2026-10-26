package celestial;

import java.util.function.Predicate;

public class rQE implements rQz_1 {
   final rQz_1[] class_;
   private final Predicate<rzr_3> break_;

   rQE(rQz_1[] var1) {
      this.class_ = var1;
      this.break_ = rQF.break_(var1);
   }

   @Override
   public void class_(rQs_1 var1) {
      rQz_1.super.class_(var1);

      for (int var2 = 0; var2 < this.class_.length; var2++) {
         this.class_[var2].class_(var1.break_(".term[" + var2 + "]"));
      }
   }

   public static rQG class_(rQQ... var0) {
      return new rQG(var0);
   }

   public final boolean class_(rzr_3 var1) {
      return this.break_.test(var1);
   }

   @Override
   public rWi_1 break_() {
      return rQF.break_;
   }
}
