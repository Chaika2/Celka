package celestial;

import java.io.IOException;

public class rZG implements ruS_2<rmH_2> {
   private boolean class_;

   public rZG() {
   }

   public rZG(rhx_3 var1) {
      this.class_ = var1.break_;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      byte var2 = var1.readByte();
      this.class_ = (var2 & 2) != 0;
   }

   public boolean break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      byte var2 = 0;
      if (this.class_) {
         var2 = (byte)(var2 | 2);
      }

      var1.writeByte(var2);
   }
}
