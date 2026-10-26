package celestial;

import java.io.IOException;

public class rZX extends rZO {
   public rZX() {
      this.catch_ = true;
      this.private_ = true;
   }

   public rZX(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.class_ = var1;
      this.break_ = var3;
      this.byte_ = var5;
      this.protected_ = var7;
      this.throws_ = var8;
      this.case_ = var9;
      this.private_ = true;
      this.catch_ = true;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readDouble();
      this.break_ = var1.readDouble();
      this.byte_ = var1.readDouble();
      this.protected_ = var1.readFloat();
      this.throws_ = var1.readFloat();
      super.class_(var1);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeDouble(this.class_);
      var1.writeDouble(this.break_);
      var1.writeDouble(this.byte_);
      var1.writeFloat(this.protected_);
      var1.writeFloat(this.throws_);
      super.break_(var1);
   }
}
