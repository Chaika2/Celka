package celestial;

import java.io.IOException;

public class rvl_3 implements ruS_2<At_1> {
   private rpm_3 class_;

   public rvl_3() {
   }

   public rvl_3(rpm_3 var1) {
      this.class_ = var1;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.class_(rpm_3.class);
   }

   public rpm_3 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
   }
}
