package celestial;

import java.io.IOException;

public class rmL_2 implements ruS_2<AH> {
   private int id_class;

   public rmL_2() {
   }

   public rmL_2(int var1) {
      this.id_class = var1;
   }

   public void id_class(AH var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
   }
}
