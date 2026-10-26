package celestial;

public class rrMk_1 {
   private final rqO_2 class_;
   private gm_3 break_;
   private rYG byte_;
   private static QY protected_ = QY.instanceof_();

   private void byte_() {
      this.byte_ = null;
      rVL var1 = rrWr_1.break_(this.break_);
      if (var1.byte_(this.class_)) {
         this.byte_ = (rYG)var1.class_(this.class_);
      }
   }

   private rrMk_1(rqO_2 var1) {
      this.class_ = var1;
      this.break_ = (gm_3)protected_.class_[56];
      this.byte_();
   }

   @Override
   public String toString() {
      return this.class_ + "";
   }

   public static rrMk_1 class_(rqO_2 var0) {
      rrMk_1 var1 = new rrMk_1(var0);
      return var1.byte_ == null ? null : var1;
   }

   public rYG class_() {
      if (this.break_ != (gm_3)protected_.class_[56]) {
         this.break_ = (gm_3)protected_.class_[56];
         this.byte_();
      }

      return this.byte_;
   }

   public rqO_2 break_() {
      return this.class_;
   }
}
