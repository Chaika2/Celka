package celestial;

import java.util.EnumSet;

public class rBT extends rBk_1 {
   private final aA_2 id_class;
   private double id_break;
   private double id_byte;
   private double id_protected;
   private final double id_throws;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_class(this.id_break, this.id_byte, this.id_protected, this.id_throws);
   }

   public rBT(aA_2 var1, double var2) {
      this.id_class = var1;
      this.id_throws = var2;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (this.id_class.X()) {
         return false;
      } else {
         rjU_2 var1 = iX_2.id_break(this.id_class, 16, 7, rjU_2.id_protected(this.id_class.J()));
         if (var1 == null) {
            return false;
         } else {
            this.id_break = var1.id_break;
            this.id_byte = var1.id_byte;
            this.id_protected = var1.id_protected;
            return true;
         }
      }
   }

   @Override
   public boolean id_break() {
      return !this.id_class.id_public().id_native();
   }
}
