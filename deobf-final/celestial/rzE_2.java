package celestial;

import java.util.function.Predicate;

public abstract class rzE_2 implements rWV {
   protected final rQz_1[] byte_;
   private final Predicate<rzr_3> protected_;

   protected rzE_2(rQz_1[] var1) {
      this.byte_ = var1;
      this.protected_ = rQF.class_(var1);
   }

   public abstract rzm_3 class_();

   protected final boolean class_(rzr_3 var1) {
      return this.protected_.test(var1);
   }

   public void class_(rQs_1 var1) {
      for (int var2 = 0; var2 < this.byte_.length; var2++) {
         this.byte_[var2].class_(var1.break_(".condition[" + var2 + "]"));
      }
   }
}
