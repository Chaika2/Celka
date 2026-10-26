package celestial;

import java.io.IOException;

public class rZP implements ruS_2<rmH_2> {
   private boolean class_;

   public rZP() {
   }

   public rZP(boolean var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readBoolean();
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   public boolean break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeBoolean(this.class_);
   }
}
