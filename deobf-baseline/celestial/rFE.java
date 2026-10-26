package celestial;

import java.io.IOException;

public class rFE implements ruS_2<At_1> {
   private rRO id_class;
   private boolean id_break;

   public rRO id_byte() {
      return this.id_class;
   }

   public rFE() {
   }

   public rFE(rRO var1, boolean var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = rRO.id_class(var1.readUnsignedByte());
      this.id_break = var1.readBoolean();
   }

   public boolean id_break() {
      return this.id_break;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class.id_class());
      var1.writeBoolean(this.id_break);
   }
}
