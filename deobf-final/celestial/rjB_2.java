package celestial;

import java.util.function.Predicate;

public class rjB_2 {
   private final rjU_2 class_;
   private final rjU_2 break_;
   private final rjS_2 byte_;
   private final rjs_3 protected_;
   private final rjm_3 throws_;
   private Predicate<xc_3> case_ = var0 -> true;

   public rjS_2 byte_() {
      return this.byte_;
   }

   public rjB_2(rjU_2 var1, rjU_2 var2, rjS_2 var3, rjs_3 var4, an_3 var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = rjm_3.class_(var5);
   }

   public rjC_2 class_(rXE var1, rRq_1 var2, rfH_2 var3) {
      return this.protected_.class_(var1) ? var1.protected_(var2, var3) : rjw_3.class_();
   }

   public void class_(Predicate<xc_3> var1) {
      this.case_ = var1;
   }

   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return this.case_ != null && !this.case_.test(var1) ? rjw_3.class_() : this.byte_.get(var1, var2, var3, this.throws_);
   }

   public rjU_2 class_() {
      return this.break_;
   }

   public rjU_2 break_() {
      return this.class_;
   }
}
