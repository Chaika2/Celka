package celestial;

import java.io.IOException;

public class rZG implements ruS_2<rmH_2> {
   private boolean id_class;

   public rZG() {
   }

   public rZG(rhx_3 var1) {
      this.id_class = var1.id_break;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      byte var2 = var1.readByte();
      this.id_class = (var2 & 2) != 0;
   }

   public boolean id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      byte var2 = 0;
      if (this.id_class) {
         var2 = (byte)(var2 | 2);
      }

      var1.writeByte(var2);
   }
}
