package celestial;

import java.io.IOException;

public class rvy_3 implements ruS_2<At_1> {
   private rfH_2 class_;

   public rvy_3() {
   }

   public rvy_3(rfH_2 var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.byte_();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public rfH_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
   }
}
