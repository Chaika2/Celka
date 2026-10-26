package celestial;

import java.io.IOException;

public class rZZ implements ruS_2<rmH_2> {
   private rRO id_class;

   public rZZ() {
   }

   public rZZ(rRO var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = rRO.id_class(var1.readUnsignedByte());
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   public rRO id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class.id_class());
   }
}
