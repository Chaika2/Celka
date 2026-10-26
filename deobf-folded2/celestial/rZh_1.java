package celestial;

import java.io.IOException;

public class rZh_1 extends rZO {
   public rZh_1() {
      this.id_catch = true;
   }

   public rZh_1(double var1, double var3, double var5, boolean var7) {
      this.id_class = var1;
      this.id_break = var3;
      this.id_byte = var5;
      this.id_case = var7;
      this.id_catch = true;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readDouble();
      this.id_break = var1.readDouble();
      this.id_byte = var1.readDouble();
      super.id_class(var1);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeDouble(this.id_class);
      var1.writeDouble(this.id_break);
      var1.writeDouble(this.id_byte);
      super.id_break(var1);
   }
}
