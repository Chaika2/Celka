package celestial;

import java.util.EnumSet;

class rGe_1 extends rPi_1 {
   @Override
   public void id_byte() {
      super.id_byte();
      this.id_protected.id_native(0);
   }

   public rGe_1(is_3 var1) {
      super(var1, 6, rGD.id_protected);
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      rGD var1 = (rGD)this.id_protected;
      return var1.sd() && rGD.id_class(var1).nextInt(10) == 0 && super.id_class();
   }

   @Override
   public boolean id_break() {
      rGD var1 = (rGD)this.id_protected;
      return var1.sd() && super.id_break();
   }
}
