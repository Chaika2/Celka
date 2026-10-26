package celestial;

import java.io.IOException;

public class rmI_2 implements ruS_2<rmH_2> {
   private rmf_3 class_;

   public rmI_2() {
   }

   public rmI_2(rmf_3 var1) {
      this.class_ = var1;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.class_(rmf_3.class);
   }

   public rmf_3 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
   }
}
