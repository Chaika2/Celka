package celestial;

import java.io.IOException;

public class rmY_2 implements ruS_2<rmH_2> {
   public static final rqO_2 id_class = new rqO_2("brand");
   private rqO_2 id_break;
   private ruu_3 id_byte;

   public rmY_2() {
   }

   public rmY_2(rqO_2 var1, ruu_3 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
      if (this.id_byte != null) {
         this.id_byte.release();
      }
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_break = var1.id_volatile();
      int var2 = var1.readableBytes();
      if (var2 >= 0 && var2 <= 32767) {
         this.id_byte = new ruu_3(var1.readBytes(var2));
      } else {
         throw new IOException("Payload may not be larger than 32767 bytes");
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_break);
      var1.writeBytes(this.id_byte);
   }
}
