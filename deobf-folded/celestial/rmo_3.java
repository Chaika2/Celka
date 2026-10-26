package celestial;

import java.io.IOException;

public class rmo_3 implements ruS_2<rmH_2> {
   private rdn_3 id_class;
   private boolean id_break;
   private int id_byte;

   public boolean id_byte() {
      return this.id_break;
   }

   public rmo_3() {
   }

   public rmo_3(rdn_3 var1, boolean var2, int var3) {
      this.id_class = var1.id_implements();
      this.id_break = var2;
      this.id_byte = var3;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_extends();
      this.id_break = var1.readBoolean();
      this.id_byte = var1.id_case();
   }

   public rdn_3 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.writeBoolean(this.id_break);
      var1.id_protected(this.id_byte);
   }

   public int id_protected() {
      return this.id_byte;
   }
}
