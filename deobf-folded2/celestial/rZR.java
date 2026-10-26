package celestial;

import java.io.IOException;

public class rZR implements ruS_2<At_1> {
   private rfH_2 id_class;
   private xc_3 id_break;

   public rfH_2 id_byte() {
      return this.id_class;
   }

   public rZR(rRq_1 var1, rfH_2 var2) {
      this(var2, var1.id_byte(var2));
   }

   public rZR(rfH_2 var1, xc_3 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public rZR() {
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_byte();
      this.id_break = xd_3.id_char.id_class(var1.id_case());
   }

   public xc_3 id_break() {
      return this.id_break;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_protected(xd_3.id_finally(this.id_break));
   }
}
