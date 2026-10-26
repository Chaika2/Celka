package celestial;

import java.io.IOException;

public class rvb_3 implements ruS_2<At_1> {
   private rgP_2 class_;

   public rvb_3() {
   }

   public rvb_3(rgP_2 var1) {
      this.class_ = var1;
   }

   public void class_(rgP_2 var1) {
      this.class_ = var1;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.throws_();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
   }

   public rgP_2 break_() {
      return this.class_;
   }
}
