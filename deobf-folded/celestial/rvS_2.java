package celestial;

import java.io.IOException;

public class rvS_2 implements ruS_2<At_1> {
   private int id_class;
   private short id_break;
   private boolean id_byte;

   public short id_byte() {
      return this.id_break;
   }

   public rvS_2() {
   }

   public rvS_2(int var1, short var2, boolean var3) {
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
      this.id_byte = var1.readBoolean();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
      var1.writeShort(this.id_break);
      var1.writeBoolean(this.id_byte);
   }

   public int id_break() {
      return this.id_class;
   }

   public boolean id_protected() {
      return this.id_byte;
   }
}
