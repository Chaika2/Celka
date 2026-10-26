package celestial;

import java.io.IOException;

public class rFy_1 implements ruS_2<At_1> {
   private rfH_2 id_class;
   private int id_break;
   private rcd_3 id_byte;

   public int id_byte() {
      return this.id_break;
   }

   public rFy_1() {
   }

   public rFy_1(rfH_2 var1, int var2, rcd_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_byte();
      this.id_break = var1.readUnsignedByte();
      this.id_byte = var1.id_implements();
   }

   public rfH_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.writeByte((byte)this.id_break);
      var1.id_class(this.id_byte);
   }

   public rcd_3 id_protected() {
      return this.id_byte;
   }
}
