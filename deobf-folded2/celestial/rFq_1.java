package celestial;

import java.io.IOException;

public class rFq_1 implements ruS_2<At_1> {
   private int id_class;

   public rFq_1() {
   }

   public rFq_1(int var1) {
      this.id_class = var1;
   }

   public void id_class(At_1 var1) {
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
