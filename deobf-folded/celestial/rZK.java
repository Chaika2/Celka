package celestial;

import java.io.IOException;
import java.util.UUID;

public class rZK implements ruS_2<At_1> {
   private rgP_2 id_class;
   private rVU id_break;
   private UUID id_byte;

   public boolean id_byte() {
      return this.id_break == rVU.SYSTEM || this.id_break == rVU.GAME_INFO;
   }

   public rZK() {
   }

   public rZK(rgP_2 var1, rVU var2, UUID var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public boolean id_class() {
      return true;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_throws();
      this.id_break = rVU.id_class(var1.readByte());
      this.id_byte = var1.id_private();
   }

   public rgP_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.writeByte(this.id_break.id_class());
      var1.id_class(this.id_byte);
   }

   public UUID id_throws() {
      return this.id_byte;
   }

   public rVU id_protected() {
      return this.id_break;
   }
}
