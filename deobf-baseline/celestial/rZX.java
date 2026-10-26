package celestial;

import java.io.IOException;

public class rZX extends rZO {
   public rZX() {
      this.id_catch = true;
      this.id_private = true;
   }

   public rZX(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.id_class = var1;
      this.id_break = var3;
      this.id_byte = var5;
      this.id_protected = var7;
      this.id_throws = var8;
      this.id_case = var9;
      this.id_private = true;
      this.id_catch = true;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readDouble();
      this.id_break = var1.readDouble();
      this.id_byte = var1.readDouble();
      this.id_protected = var1.readFloat();
      this.id_throws = var1.readFloat();
      super.id_class(var1);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeDouble(this.id_class);
      var1.writeDouble(this.id_break);
      var1.writeDouble(this.id_byte);
      var1.writeFloat(this.id_protected);
      var1.writeFloat(this.id_throws);
      super.id_break(var1);
   }
}
