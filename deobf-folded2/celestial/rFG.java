package celestial;

import java.io.IOException;

public class rFG implements ruS_2<At_1> {
   private float id_class;
   private int id_break;
   private int id_byte;

   public int id_byte() {
      return this.id_break;
   }

   public rFG() {
   }

   public rFG(float var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readFloat();
      this.id_byte = var1.id_case();
      this.id_break = var1.id_case();
   }

   public float id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeFloat(this.id_class);
      var1.id_protected(this.id_byte);
      var1.id_protected(this.id_break);
   }

   public int id_protected() {
      return this.id_byte;
   }
}
