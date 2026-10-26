package celestial;

import java.io.IOException;

public class rmj_3 implements ruS_2<rmH_2> {
   private int class_;

   public rmj_3() {
   }

   public rmj_3(int var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readByte();
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
   }
}
