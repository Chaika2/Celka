package celestial;

import java.io.IOException;

public class rZJ extends rZO {
   public rZJ() {
      this.id_private = true;
   }

   public rZJ(float var1, float var2, boolean var3) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_private = true;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_protected = var1.readFloat();
      this.id_throws = var1.readFloat();
      super.id_class(var1);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeFloat(this.id_protected);
      var1.writeFloat(this.id_throws);
      super.id_break(var1);
   }
}
