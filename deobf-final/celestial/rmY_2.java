package celestial;

import java.io.IOException;

public class rmY_2 implements ruS_2<rmH_2> {
   public static final rqO_2 class_ = new rqO_2("brand");
   private rqO_2 break_;
   private ruu_3 byte_;

   public rmY_2() {
   }

   public rmY_2(rqO_2 var1, ruu_3 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
      if (this.byte_ != null) {
         this.byte_.release();
      }
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.break_ = var1.volatile_();
      int var2 = var1.readableBytes();
      if (var2 >= 0 && var2 <= 32767) {
         this.byte_ = new ruu_3(var1.readBytes(var2));
      } else {
         throw new IOException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.break_);
      var1.writeBytes(this.byte_);
   }
}
