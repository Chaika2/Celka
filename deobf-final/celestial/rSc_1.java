package celestial;

import java.util.EnumSet;

class rSc_1 extends rBk_1 {
   public rSc_1(rSN var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.JUMP, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      return this.class_.n() > 0;
   }
}
