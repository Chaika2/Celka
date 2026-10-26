package celestial;

import java.io.IOException;

public class rZW implements ruS_2<rmH_2> {
   private int id_class;
   private rfH_2 id_break;

   public rfH_2 id_byte() {
      return this.id_break;
   }

   public rZW() {
   }

   public rZW(int var1, rfH_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_byte();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
   }

   public int id_break() {
      return this.id_class;
   }
}
