package celestial;

import java.io.IOException;

public class rZc_1 implements ruS_2<rmH_2> {
   private rZu_1 class_;
   private rqO_2 break_;

   public rZu_1 byte_() {
      return this.class_;
   }

   public rZc_1() {
   }

   public rZc_1(rZu_1 var1, rqO_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   public static rZc_1 class_(OT var0) {
      return new rZc_1(rZu_1.OPENED_TAB, var0.private_());
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.class_(rZu_1.class);
      if (this.class_ == rZu_1.OPENED_TAB) {
         this.break_ = var1.volatile_();
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      if (this.class_ == rZu_1.OPENED_TAB) {
         var1.class_(this.break_);
      }
   }

   public static rZc_1 break_() {
      return new rZc_1(rZu_1.CLOSED_SCREEN, (rqO_2)null);
   }

   public rqO_2 protected_() {
      return this.break_;
   }
}
