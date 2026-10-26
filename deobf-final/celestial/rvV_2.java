package celestial;

import java.io.IOException;

public class rvV_2 implements ruS_2<At_1> {
   private rgP_2 class_;
   private rgP_2 break_;

   public rgP_2 byte_() {
      return this.break_;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.throws_();
      this.break_ = var1.throws_();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.class_(this.break_);
   }

   public rgP_2 break_() {
      return this.class_;
   }
}
