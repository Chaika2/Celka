package celestial;

import java.util.Random;

class Kd_1 {
   double id_class;
   double id_break;

   public void id_class(Random var1, double var2, double var4, double var6, double var8) {
      this.id_class = rfU_2.id_class(var1, var2, var6);
      this.id_break = rfU_2.id_class(var1, var4, var8);
   }

   public boolean id_class(double var1, double var3, double var5, double var7) {
      boolean var9 = false;
      if (this.id_class < var1) {
         this.id_class = var1;
         var9 = true;
      } else if (this.id_class > var5) {
         this.id_class = var5;
         var9 = true;
      }

      if (this.id_break < var3) {
         this.id_break = var3;
         var9 = true;
      } else if (this.id_break > var7) {
         this.id_break = var7;
         var9 = true;
      }

      return var9;
   }

   public int id_class(rRq_1 var1, int var2) {
      rfw_3 var3 = new rfw_3(this.id_class, (double)(var2 + 1), this.id_break);
      boolean var4 = var1.id_byte(var3).id_catch();
      var3.id_class(rpr_3.DOWN);
      boolean var6 = var1.id_byte(var3).id_catch();

      while (var3.c_() > 0) {
         var3.id_class(rpr_3.DOWN);
         boolean var5 = var1.id_byte(var3).id_catch();
         if (!var5 && var6 && var4) {
            return var3.c_() + 1;
         }

         var4 = var6;
         var6 = var5;
      }

      return var2 + 1;
   }

   double id_class(Kd_1 var1) {
      double var2 = this.id_class - var1.id_class;
      double var4 = this.id_break - var1.id_break;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   void id_class() {
      double var1 = (double)this.id_break();
      this.id_class /= var1;
      this.id_break /= var1;
   }

   public boolean id_break(rRq_1 var1, int var2) {
      rfH_2 var3 = new rfH_2(this.id_class, (double)(this.id_class(var1, var2) - 1), this.id_break);
      xc_3 var4 = var1.id_byte(var3);
      QP var5 = var4.id_byte();
      return var3.c_() < var2 && !var5.id_class() && var5 != QP.id_final;
   }

   public void id_break(Kd_1 var1) {
      this.id_class = this.id_class - var1.id_class;
      this.id_break = this.id_break - var1.id_break;
   }

   float id_break() {
      return rfU_2.id_class(this.id_class * this.id_class + this.id_break * this.id_break);
   }
}
