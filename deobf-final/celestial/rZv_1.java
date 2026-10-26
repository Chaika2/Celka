package celestial;

import java.io.IOException;
import java.util.UUID;

public class rZv_1 implements ruS_2<rmH_2> {
   private UUID class_;

   public rZv_1() {
   }

   public rZv_1(UUID var1) {
      this.class_ = var1;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   public an_3 class_(rrEm_1 var1) {
      return var1.break_(this.class_);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.private_();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
   }
}
