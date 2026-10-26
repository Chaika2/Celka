package celestial;

import java.io.IOException;

public class rve_3 implements ruS_2<At_1> {
   private int id_class;
   private rcd_3 id_break;

   public rcd_3 id_byte() {
      return this.id_break;
   }

   public rve_3() {
   }

   public rve_3(int var1, rcd_3 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean id_class() {
      return true;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_implements();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
   }
}
