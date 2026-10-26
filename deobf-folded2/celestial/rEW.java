package celestial;

import java.util.EnumSet;
import java.util.Random;

class rEW extends rBk_1 {
   private final aA_2 id_class;
   private double id_break;
   private double id_byte;
   private double id_protected;
   private final double id_throws;
   private final rYB id_case;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_class(this.id_break, this.id_byte, this.id_protected, this.id_throws);
   }

   public rEW(aA_2 var1, double var2) {
      this.id_class = var1;
      this.id_throws = var2;
      this.id_case = (rYB)var1.id_throws[7];
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (!this.id_case.id_strictfp()) {
         return false;
      } else if (this.id_class.rT()) {
         return false;
      } else {
         rjU_2 var1 = this.id_catch();
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

   private rjU_2 id_catch() {
      Random var1 = this.id_class.Sa();
      rfH_2 var2 = this.id_class.Bs();

      for (int var3 = 0; var3 < 10; var3++) {
         rfH_2 var4 = var2.id_break(var1.nextInt(20) - 10, 2 - var1.nextInt(8), var1.nextInt(20) - 10);
         if (this.id_case.id_byte(var4).id_class(xu_3.id_try)) {
            return rjU_2.id_protected(var4);
         }
      }

      return null;
   }
}
