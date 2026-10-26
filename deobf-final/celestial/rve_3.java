package celestial;

import java.io.IOException;

public class rve_3 implements ruS_2<At_1> {
   private int class_;
   private rcd_3 break_;

   public rcd_3 byte_() {
      return this.break_;
   }

   public rve_3() {
   }

   public rve_3(int var1, rcd_3 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean class_() {
      return true;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.implements_();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_);
   }
}
