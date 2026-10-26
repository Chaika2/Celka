package celestial;

import java.io.IOException;

public class rmK_2 implements ruS_2<rmH_2> {
   private int id_class;
   private int id_break;

   public int id_byte() {
      return this.id_break;
   }

   public rmK_2() {
   }

   public rmK_2(int var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readByte();
      this.id_break = var1.readByte();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
      var1.writeByte(this.id_break);
   }
}
