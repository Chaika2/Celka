package celestial;

import java.util.List;

public class rBx_1 extends rBk_1 {
   private final rbZ_2 id_class;
   private rbZ_2 id_break;
   private final double id_byte;
   private int id_protected;

   @Override
   public void id_byte() {
      this.id_protected = 0;
   }

   public rBx_1(rbZ_2 var1, double var2) {
      this.id_class = var1;
      this.id_byte = var2;
   }

   @Override
   public boolean id_class() {
      if (this.id_class.O_() >= 0) {
         return false;
      } else {
         List var1 = ((rYB)this.id_class.id_throws[7]).id_class(this.id_class.getClass(), this.id_class.rN().id_byte(8.0, 4.0, 8.0));
         rbZ_2 var2 = null;
         double var3 = Double.MAX_VALUE;

         for (rbZ_2 var6 : var1) {
            if (var6.O_() >= 0) {
               double var7 = this.id_class.id_int(var6);
               if (!(var7 > var3)) {
                  var3 = var7;
                  var2 = var6;
               }
            }
         }

         if (var2 == null) {
            return false;
         } else if (var3 < 9.0) {
            return false;
         } else {
            this.id_break = var2;
            return true;
         }
      }
   }

   @Override
   public boolean id_break() {
      if (this.id_class.O_() >= 0) {
         return false;
      } else if (!this.id_break.BM()) {
         return false;
      } else {
         double var1 = this.id_class.id_int(this.id_break);
         return !(var1 < 9.0) && !(var1 > 256.0);
      }
   }

   @Override
   public void id_throws() {
      if (--this.id_protected <= 0) {
         this.id_protected = 10;
         this.id_class.id_public().id_class(this.id_break, this.id_byte);
      }
   }

   @Override
   public void id_protected() {
      this.id_break = null;
   }
}
