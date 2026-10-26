package celestial;

import java.io.IOException;

public class rmN_2 implements ruS_2<rmk_3> {
   private int id_class;
   private ruu_3 id_break;

   public rmN_2() {
   }

   public rmN_2(int var1, ruu_3 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(rmk_3 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      if (var1.readBoolean()) {
         int var2 = var1.readableBytes();
         if (var2 < 0 || var2 > 1048576) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
         }

         this.id_break = new ruu_3(var1.readBytes(var2));
      } else {
         this.id_break = null;
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      if (this.id_break != null) {
         var1.writeBoolean(true);
         var1.writeBytes(this.id_break.copy());
      } else {
         var1.writeBoolean(false);
      }
   }
}
