package celestial;

import java.io.IOException;

public class rZU implements ruS_2<At_1> {
   private int id_class;

   public rZU() {
   }

   public rZU(int var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readUnsignedByte();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
   }
}
