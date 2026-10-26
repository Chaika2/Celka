package celestial;

import java.io.IOException;

public class rFM implements ruS_2<At_1> {
   private int id_class;
   private int id_break;
   private rdn_3 id_byte = rdn_3.id_break;

   public int id_byte() {
      return this.id_break;
   }

   public rFM() {
   }

   public rFM(int var1, int var2, rdn_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3.id_implements();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readByte();
      this.id_break = var1.readShort();
      this.id_byte = var1.id_extends();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
      var1.writeShort(this.id_break);
      var1.id_class(this.id_byte);
   }

   public int id_break() {
      return this.id_class;
   }

   public rdn_3 id_protected() {
      return this.id_byte;
   }
}
