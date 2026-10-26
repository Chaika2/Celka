package celestial;

import java.io.IOException;

public class rmj_3 implements ruS_2<rmH_2> {
   private int id_class;

   public rmj_3() {
   }

   public rmj_3(int var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readByte();
   }

   public void id_class(rmH_2 var1) {
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
