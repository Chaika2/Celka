package celestial;

import java.io.IOException;

public class rvy_3 implements ruS_2<At_1> {
   private rfH_2 id_class;

   public rvy_3() {
   }

   public rvy_3(rfH_2 var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_byte();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public rfH_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
   }
}
