package celestial;

import java.util.function.Consumer;

class rlo_3 implements rlC_2 {
   rlo_3(rlY_2 var1, Consumer var2) {
      this.class_ = var2;
   }

   @Override
   public void class_(rle_3 var1) {
   }

   @Override
   public void break_(rle_3 var1) {
      this.class_.accept(var1);
   }
}
