package celestial;

public class rLA extends rLy_1 {
   private boolean id_class;

   @Override
   protected rjU_2 id_byte() {
      return new rjU_2(this.id_break.rx(), (double)this.id_super(), this.id_break.BO());
   }

   public rLA(is_3 var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public rLC id_class(an_3 var1, int var2) {
      return this.id_class(var1.Bs(), var2);
   }

   protected boolean id_class(rLp_1 var1) {
      if (var1 == rLp_1.WATER) {
         return false;
      } else {
         return var1 == rLp_1.LAVA ? false : var1 != rLp_1.OPEN;
      }
   }

   private boolean id_class(int var1, int var2, int var3, int var4, int var5, int var6, rjU_2 var7, double var8, double var10) {
      int var12 = var1 - var4 / 2;
      int var13 = var3 - var6 / 2;
      if (!this.id_break(var12, var2, var13, var4, var5, var6, var7, var8, var10)) {
         return false;
      } else {
         for (int var14 = var12; var14 < var12 + var4; var14++) {
            for (int var15 = var13; var15 < var13 + var6; var15++) {
               double var16 = (double)var14 + 0.5 - var7.id_break;
               double var18 = (double)var15 + 0.5 - var7.id_protected;
               if (!(var16 * var8 + var18 * var10 < 0.0)) {
                  rLp_1 var20 = this.id_int.id_class(this.id_byte, var14, var2 - 1, var15, this.id_break, var4, var5, var6, true, true);
                  if (!this.id_class(var20)) {
                     return false;
                  }

                  var20 = this.id_int.id_class(this.id_byte, var14, var2, var15, this.id_break, var4, var5, var6, true, true);
                  float var21 = this.id_break.id_class(var20);
                  if (var21 < 0.0F || var21 >= 8.0F) {
                     return false;
                  }

                  if (var20 == rLp_1.DAMAGE_FIRE || var20 == rLp_1.DANGER_FIRE || var20 == rLp_1.DAMAGE_OTHER) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   protected boolean id_class(rjU_2 var1, rjU_2 var2, int var3, int var4, int var5) {
      int var6 = rfU_2.id_byte(var1.id_break);
      int var7 = rfU_2.id_byte(var1.id_protected);
      double var8 = var2.id_break - var1.id_break;
      double var10 = var2.id_protected - var1.id_protected;
      double var12 = var8 * var8 + var10 * var10;
      if (var12 < 1.0E-8) {
         return false;
      } else {
         double var14 = 1.0 / Math.sqrt(var12);
         var8 *= var14;
         var10 *= var14;
         var3 += 2;
         var5 += 2;
         if (!this.id_class(var6, rfU_2.id_byte(var1.id_byte), var7, var3, var4, var5, var1, var8, var10)) {
            return false;
         } else {
            var3 -= 2;
            var5 -= 2;
            double var16 = 1.0 / Math.abs(var8);
            double var18 = 1.0 / Math.abs(var10);
            double var20 = (double)var6 - var1.id_break;
            double var22 = (double)var7 - var1.id_protected;
            if (var8 >= 0.0) {
               var20++;
            }

            if (var10 >= 0.0) {
               var22++;
            }

            var20 /= var8;
            var22 /= var10;
            int var24 = var8 < 0.0 ? -1 : 1;
            int var25 = var10 < 0.0 ? -1 : 1;
            int var26 = rfU_2.id_byte(var2.id_break);
            int var27 = rfU_2.id_byte(var2.id_protected);
            int var28 = var26 - var6;
            int var29 = var27 - var7;

            while (var28 * var24 > 0 || var29 * var25 > 0) {
               if (var20 < var22) {
                  var20 += var16;
                  var6 += var24;
                  var28 = var26 - var6;
               } else {
                  var22 += var18;
                  var7 += var25;
                  var29 = var27 - var7;
               }

               if (!this.id_class(var6, rfU_2.id_byte(var1.id_byte), var7, var3, var4, var5, var1, var8, var10)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   @Override
   protected rLl_1 id_class(int var1) {
      this.id_int = new rLf_1();
      this.id_int.id_class(true);
      return new rLl_1(this.id_int, var1);
   }

   @Override
   public rLC id_class(rfH_2 var1, int var2) {
      if (this.id_byte.id_byte(var1).id_catch()) {
         rfH_2 var3 = var1.id_break();

         while (var3.c_() > 0 && this.id_byte.id_byte(var3).id_catch()) {
            var3 = var3.id_break();
         }

         if (var3.c_() > 0) {
            return super.id_class(var3.id_final(), var2);
         }

         while (var3.c_() < this.id_byte.id_try() && this.id_byte.id_byte(var3).id_catch()) {
            var3 = var3.id_final();
         }

         var1 = var3;
      }

      if (!this.id_byte.id_byte(var1).id_byte().id_break()) {
         return super.id_class(var1, var2);
      } else {
         rfH_2 var4 = var1.id_final();

         while (var4.c_() < this.id_byte.id_try() && this.id_byte.id_byte(var4).id_byte().id_break()) {
            var4 = var4.id_final();
         }

         return super.id_class(var4, var2);
      }
   }

   public void id_class(boolean var1) {
      this.id_int.id_break(var1);
   }

   private boolean id_break(int var1, int var2, int var3, int var4, int var5, int var6, rjU_2 var7, double var8, double var10) {
      for (rfH_2 var13 : rfH_2.id_class(new rfH_2(var1, var2, var3), new rfH_2(var1 + var4 - 1, var2 + var5 - 1, var3 + var6 - 1))) {
         double var14 = (double)var13.b_() + 0.5 - var7.id_break;
         double var16 = (double)var13.d_() + 0.5 - var7.id_protected;
         if (!(var14 * var8 + var16 * var10 < 0.0) && !this.id_byte.id_byte(var13).id_class(this.id_byte, var13, rLT.LAND)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected boolean id_break() {
      return this.id_break.BL() || this.id_package() || this.id_break.Pm();
   }

   public void id_break(boolean var1) {
      this.id_class = var1;
   }

   public boolean id_throws() {
      return this.id_int.id_byte();
   }

   private int id_super() {
      if (this.id_break.rT() && this.id_new()) {
         int var1 = rfU_2.id_byte(this.id_break.re());
         xd_3 var2 = this.id_byte.id_byte(new rfH_2(this.id_break.rx(), (double)var1, this.id_break.BO())).id_break();
         int var3 = 0;

         while (var2 == xu_3.id_try) {
            var2 = this.id_byte.id_byte(new rfH_2(this.id_break.rx(), (double)(++var1), this.id_break.BO())).id_break();
            if (++var3 > 16) {
               return rfU_2.id_byte(this.id_break.re());
            }
         }

         return var1;
      } else {
         return rfU_2.id_byte(this.id_break.re() + 0.5);
      }
   }

   @Override
   protected void id_protected() {
      super.id_protected();
      if (this.id_class) {
         if (this.id_byte.id_case(new rfH_2(this.id_break.rx(), this.id_break.re() + 0.5, this.id_break.BO()))) {
            return;
         }

         for (int var1 = 0; var1 < this.id_protected.id_throws(); var1++) {
            rLq_1 var2 = this.id_protected.id_class(var1);
            if (this.id_byte.id_case(new rfH_2(var2.id_class, var2.id_break, var2.id_byte))) {
               this.id_protected.id_break(var1);
               return;
            }
         }
      }
   }
}
