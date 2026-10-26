package celestial;

import java.io.IOException;

public class rZb_1 implements ruS_2<rmH_2> {
   private rfH_2 id_class;
   private rpr_3 id_break;
   private rZM id_byte;

   public rpr_3 id_byte() {
      return this.id_break;
   }

   public rZb_1() {
   }

   public rZb_1(rZM var1, rfH_2 var2, rpr_3 var3) {
      this.id_byte = var1;
      this.id_class = var2.id_int();
      this.id_break = var3;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_byte = var1.id_class(rZM.class);
      this.id_class = var1.id_byte();
      this.id_break = rpr_3.id_class(var1.readUnsignedByte());
   }

   public rfH_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_byte);
      var1.id_class(this.id_class);
      var1.writeByte(this.id_break.id_byte());
   }

   public rZM id_protected() {
      return this.id_byte;
   }
}
