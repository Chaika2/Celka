package celestial;

import java.io.IOException;

public class rmv_3 implements ruS_2<AH> {
   private int class_;
   private rqO_2 break_;
   private ruu_3 byte_;

   public void class_(AH var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.volatile_();
      int var2 = var1.readableBytes();
      if (var2 >= 0 && var2 <= 1048576) {
         this.byte_ = new ruu_3(var1.readBytes(var2));
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
      }
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_);
      var1.writeBytes(this.byte_.copy());
   }
}
