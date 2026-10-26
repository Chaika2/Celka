package celestial;

import java.util.Random;

class Kd_1 {
   double class_;
   double break_;

   public void class_(Random var1, double var2, double var4, double var6, double var8) {
      this.class_ = rfU_2.class_(var1, var2, var6);
      this.break_ = rfU_2.class_(var1, var4, var8);
   }

   public boolean class_(double var1, double var3, double var5, double var7) {
      boolean var9 = false;
      if (this.class_ < var1) {
         this.class_ = var1;
         var9 = true;
      } else if (this.class_ > var5) {
         this.class_ = var5;
         var9 = true;
      }

      if (this.break_ < var3) {
         this.break_ = var3;
         var9 = true;
      } else if (this.break_ > var7) {
         this.break_ = var7;
         var9 = true;
      }

      return var9;
   }

   public int class_(rRq_1 var1, int var2) {
      rfw_3 var3 = new rfw_3(this.class_, (double)(var2 + 1), this.break_);
      boolean var4 = var1.byte_(var3).catch_();
      var3.class_(rpr_3.DOWN);
      boolean var6 = var1.byte_(var3).catch_();

      while (var3.c_() > 0) {
         var3.class_(rpr_3.DOWN);
         boolean var5 = var1.byte_(var3).catch_();
         if (!var5 && var6 && var4) {
            return var3.c_() + 1;
         }

         var4 = var6;
         var6 = var5;
      }

      return var2 + 1;
   }

   double class_(Kd_1 var1) {
      double var2 = this.class_ - var1.class_;
      double var4 = this.break_ - var1.break_;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   void class_() {
      double var1 = (double)this.break_();
      this.class_ /= var1;
      this.break_ /= var1;
   }

   public boolean break_(rRq_1 var1, int var2) {
      rfH_2 var3 = new rfH_2(this.class_, (double)(this.class_(var1, var2) - 1), this.break_);
      xc_3 var4 = var1.byte_(var3);
      QP var5 = var4.byte_();
      return var3.c_() < var2 && !var5.class_() && var5 != QP.final_;
   }

   public void break_(Kd_1 var1) {
      this.class_ = this.class_ - var1.class_;
      this.break_ = this.break_ - var1.break_;
   }

   float break_() {
      return rfU_2.class_(this.class_ * this.class_ + this.break_ * this.break_);
   }
}
