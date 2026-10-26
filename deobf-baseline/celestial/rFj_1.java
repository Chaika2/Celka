package celestial;

import java.io.IOException;

public class rFj_1 implements ruS_2<At_1> {
   private rfH_2 id_class;
   private float id_break;

   public float id_byte() {
      return this.id_break;
   }

   public rFj_1() {
   }

   public rFj_1(rfH_2 var1, float var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_byte();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
   }

   public rfH_2 id_break() {
      return this.id_class;
   }
}
