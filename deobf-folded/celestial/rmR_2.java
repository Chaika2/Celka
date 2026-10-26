package celestial;

import java.io.IOException;

public class rmR_2 implements ruS_2<rmH_2> {
   private int id_class;
   private rdn_3 id_break;

   public rdn_3 id_byte() {
      return this.id_break;
   }

   public rmR_2() {
      this.id_break = rdn_3.id_break;
   }

   public rmR_2(int var1, rdn_3 var2) {
      this.id_break = rdn_3.id_break;
      this.id_class = var1;
      this.id_break = var2.id_implements();
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readShort();
      this.id_break = var1.id_extends();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeShort(this.id_class);
      var1.id_class(this.id_break);
   }
}
