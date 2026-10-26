package celestial;

import java.util.Optional;

public class gw_3 {
   public static final gw_3 class_ = new gw_3((rqO_2)null);
   private final rqO_2 break_;
   private boolean byte_;
   private Optional<gt_3> protected_ = Optional.empty();

   public gw_3(rqO_2 var1) {
      this.break_ = var1;
   }

   public gw_3(gt_3 var1) {
      this.byte_ = true;
      this.break_ = null;
      this.protected_ = Optional.of(var1);
   }

   public Optional<gt_3> class_(Oa_1 var1) {
      if (!this.byte_) {
         if (this.break_ != null) {
            this.protected_ = var1.class_(this.break_);
         }

         this.byte_ = true;
      }

      return this.protected_;
   }

   public rqO_2 class_() {
      return this.protected_.<rqO_2>map(var0 -> var0.break_).orElse(this.break_);
   }
}
