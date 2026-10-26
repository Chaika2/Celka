package celestial;

import java.io.IOException;

public class rFn_1 implements ruS_2<At_1> {
   private float id_class;
   private int id_break;
   private float id_byte;

   public int id_byte() {
      return this.id_break;
   }

   public rFn_1() {
   }

   public rFn_1(float var1, int var2, float var3) {
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
      this.id_break = var1.id_case();
      this.id_byte = var1.readFloat();
   }

   public float id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeFloat(this.id_class);
      var1.id_protected(this.id_break);
      var1.writeFloat(this.id_byte);
   }

   public float id_protected() {
      return this.id_byte;
   }
}
