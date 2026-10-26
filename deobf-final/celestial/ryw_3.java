package celestial;

import java.util.function.Predicate;

public class ryw_3 {
   private final rRR class_;
   private final rfH_2 break_;
   private final boolean byte_;
   private xc_3 protected_;
   private ryO_2 throws_;
   private boolean case_;

   public rRR byte_() {
      return this.class_;
   }

   public ryw_3(rRR var1, rfH_2 var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2.int_();
      this.byte_ = var3;
   }

   public xc_3 class_() {
      if (this.protected_ == null && (this.byte_ || this.class_.int_(this.break_))) {
         this.protected_ = this.class_.byte_(this.break_);
      }

      return this.protected_;
   }

   public static Predicate<ryw_3> class_(Predicate<xc_3> var0) {
      return var1 -> var1 != null && var0.test(var1.class_());
   }

   public ryO_2 break_() {
      if (this.throws_ == null && !this.case_) {
         this.throws_ = this.class_.class_(this.break_);
         this.case_ = true;
      }

      return this.throws_;
   }

   public rfH_2 protected_() {
      return this.break_;
   }
}
