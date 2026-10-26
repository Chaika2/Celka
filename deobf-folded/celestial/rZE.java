package celestial;

import java.io.IOException;

public class rZE implements ruS_2<rmH_2> {
   private int id_class;
   private rqO_2 id_break;
   private boolean id_byte;

   public rqO_2 id_byte() {
      return this.id_break;
   }

   public rZE() {
   }

   public rZE(int var1, rkw_3<?> var2, boolean var3) {
      this.id_class = var1;
      this.id_break = var2.id_case();
      this.id_byte = var3;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readByte();
      this.id_break = var1.id_volatile();
      this.id_byte = var1.readBoolean();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
      var1.id_class(this.id_break);
      var1.writeBoolean(this.id_byte);
   }

   public boolean id_protected() {
      return this.id_byte;
   }
}
