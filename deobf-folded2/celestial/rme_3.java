package celestial;

import java.io.IOException;

public class rme_3 implements ruS_2<rmH_2> {
   private int id_break;
   public static int id_class;

   public rme_3() {
   }

   public rme_3(int var1) {
      this.id_break = var1;
      id_class = var1;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_break = var1.readShort();
      id_class = this.id_break;
   }

   public int id_break() {
      return this.id_break;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeShort(this.id_break);
   }
}
