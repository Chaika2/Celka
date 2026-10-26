package celestial;

import java.io.IOException;

public class rvQ_2 implements ruS_2<At_1> {
   private int id_class;
   private byte id_break;

   public rvQ_2() {
   }

   public rvQ_2(an_3 var1, byte var2) {
      this.id_class = var1.V();
      this.id_break = var2;
   }

   public an_3 id_class(rYB var1) {
      return var1.id_break(this.id_class);
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readInt();
      this.id_break = var1.readByte();
   }

   public byte id_break() {
      return this.id_break;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeInt(this.id_class);
      var1.writeByte(this.id_break);
   }
}
