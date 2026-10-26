package celestial;

import java.util.EnumSet;

class rSc_1 extends rBk_1 {
   public rSc_1(rSN var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.JUMP, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      return this.id_class.n() > 0;
   }
}
