package celestial;

import java.util.EnumSet;

public class rSs_1 extends rBk_1 {
   private final rOD id_class;
   private final double id_break;
   private double id_byte;
   private double id_protected;
   private double id_throws;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_class(this.id_byte, this.id_protected, this.id_throws, this.id_break);
   }

   public rSs_1(rOD var1, double var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (!this.id_class.sm() && this.id_class.BP()) {
         rjU_2 var1 = iX_2.id_class(this.id_class, 5, 4);
         if (var1 == null) {
            return false;
         } else {
            this.id_byte = var1.id_break;
            this.id_protected = var1.id_byte;
            this.id_throws = var1.id_protected;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean id_break() {
      return !this.id_class.sm() && !this.id_class.id_public().id_native() && this.id_class.BP();
   }

   @Override
   public void id_throws() {
      if (!this.id_class.sm() && this.id_class.Sa().nextInt(50) == 0) {
         an_3 var1 = this.id_class.Bh().get(0);
         if (var1 == null) {
            return;
         }

         if (var1 instanceof rhd_3) {
            int var2 = this.id_class.sn();
            int var3 = this.id_class.sT();
            if (var3 > 0 && this.id_class.Sa().nextInt(var3) < var2) {
               this.id_class.id_private((rhd_3)var1);
               return;
            }

            this.id_class.id_return(5);
         }

         this.id_class.Bn();
         this.id_class.sI();
         ((rYB)this.id_class.id_throws[7]).id_class(this.id_class, (byte)6);
      }
   }
}
