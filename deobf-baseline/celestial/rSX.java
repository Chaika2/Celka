package celestial;

import java.util.EnumSet;

public class rSX extends rBk_1 {
   private final rsy_3 id_class;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_final();
   }

   public rSX(rsy_3 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (!this.id_class.BM()) {
         return false;
      } else if (this.id_class.rT()) {
         return false;
      } else if (!this.id_class.BL()) {
         return false;
      } else if ((Boolean)this.id_class.id_throws[25]) {
         return false;
      } else {
         rhd_3 var1 = this.id_class.id_class();
         if (var1 == null) {
            return false;
         } else {
            return this.id_class.id_int(var1) > 16.0 ? false : (rJr_1)var1.id_implements[4] != null;
         }
      }
   }

   @Override
   public void id_protected() {
      this.id_class.id_class((rhd_3)null);
   }
}
