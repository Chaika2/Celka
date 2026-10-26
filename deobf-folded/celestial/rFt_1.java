package celestial;

import java.io.IOException;

public class rFt_1 implements ruS_2<At_1> {
   private int id_class;
   private int id_break;
   private int id_byte;

   public int id_byte() {
      return this.id_break;
   }

   public rFt_1() {
   }

   public rFt_1(int var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readUnsignedByte();
      this.id_break = var1.readShort();
      this.id_byte = var1.readShort();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
      var1.writeShort(this.id_break);
      var1.writeShort(this.id_byte);
   }

   public int id_break() {
      return this.id_class;
   }

   public int id_protected() {
      return this.id_byte;
   }
}
