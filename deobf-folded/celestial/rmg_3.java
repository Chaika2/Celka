package celestial;

import java.io.IOException;

public class rmg_3 implements ruS_2<rmH_2> {
   private int id_class;
   private short id_break;
   private boolean id_byte;

   public short id_byte() {
      return this.id_break;
   }

   public rmg_3() {
   }

   public rmg_3(int var1, short var2, boolean var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readByte();
      this.id_break = var1.readShort();
      this.id_byte = var1.readByte() != 0;
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
      var1.writeShort(this.id_break);
      var1.writeByte(this.id_byte ? 1 : 0);
   }
}
