package celestial;

import java.io.IOException;

public class rZh_1 extends rZO {
   public rZh_1() {
      this.catch_ = true;
   }

   public rZh_1(double var1, double var3, double var5, boolean var7) {
      this.class_ = var1;
      this.break_ = var3;
      this.byte_ = var5;
      this.case_ = var7;
      this.catch_ = true;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readDouble();
      this.break_ = var1.readDouble();
      this.byte_ = var1.readDouble();
      super.class_(var1);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeDouble(this.class_);
      var1.writeDouble(this.break_);
      var1.writeDouble(this.byte_);
      super.break_(var1);
   }
}
