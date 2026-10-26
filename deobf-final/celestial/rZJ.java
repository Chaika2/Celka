package celestial;

import java.io.IOException;

public class rZJ extends rZO {
   public rZJ() {
      this.private_ = true;
   }

   public rZJ(float var1, float var2, boolean var3) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.private_ = true;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.protected_ = var1.readFloat();
      this.throws_ = var1.readFloat();
      super.class_(var1);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeFloat(this.protected_);
      var1.writeFloat(this.throws_);
      super.break_(var1);
   }
}
