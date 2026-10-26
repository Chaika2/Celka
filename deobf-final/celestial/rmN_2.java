package celestial;

import java.io.IOException;

public class rmN_2 implements ruS_2<rmk_3> {
   private int class_;
   private ruu_3 break_;

   public rmN_2() {
   }

   public rmN_2(int var1, ruu_3 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(rmk_3 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      if (var1.readBoolean()) {
         int var2 = var1.readableBytes();
         if (var2 < 0 || var2 > 1048576) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
         }

         this.break_ = new ruu_3(var1.readBytes(var2));
      } else {
         this.break_ = null;
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      if (this.break_ != null) {
         var1.writeBoolean(true);
         var1.writeBytes(this.break_.copy());
      } else {
         var1.writeBoolean(false);
      }
   }
}
