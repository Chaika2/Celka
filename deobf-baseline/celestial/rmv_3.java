package celestial;

import java.io.IOException;

public class rmv_3 implements ruS_2<AH> {
   private int id_class;
   private rqO_2 id_break;
   private ruu_3 id_byte;

   public void id_class(AH var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_volatile();
      int var2 = var1.readableBytes();
      if (var2 >= 0 && var2 <= 1048576) {
         this.id_byte = new ruu_3(var1.readBytes(var2));
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
      }
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
      var1.writeBytes(this.id_byte.copy());
   }
}
