package celestial;

import java.io.IOException;

public class rmi_3 implements ruS_2<rmH_2> {
   private rfH_2 id_class;
   private int id_break;
   private boolean id_byte;

   public int id_byte() {
      return this.id_break;
   }

   public rmi_3() {
   }

   public rmi_3(rfH_2 var1, int var2, boolean var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_byte();
      this.id_break = var1.id_case();
      this.id_byte = var1.readBoolean();
   }

   public rfH_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_protected(this.id_break);
      var1.writeBoolean(this.id_byte);
   }

   public boolean id_protected() {
      return this.id_byte;
   }
}
