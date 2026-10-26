package celestial;

import java.io.IOException;

public class rZx_1 implements ruS_2<rmH_2> {
   private rff_3 class_;
   private rpm_3 break_;

   public rff_3 byte_() {
      return this.class_;
   }

   public rZx_1() {
   }

   public rZx_1(rpm_3 var1, rff_3 var2) {
      this.break_ = var1;
      this.class_ = var2;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.break_ = var1.class_(rpm_3.class);
      this.class_ = var1.package_();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.break_);
      var1.class_(this.class_);
   }

   public rpm_3 break_() {
      return this.break_;
   }
}
