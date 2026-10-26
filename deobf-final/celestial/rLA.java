package celestial;

public class rLA extends rLy_1 {
   private boolean class_;

   @Override
   protected rjU_2 byte_() {
      return new rjU_2(this.break_.rx(), (double)this.super_(), this.break_.BO());
   }

   public rLA(is_3 var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public rLC class_(an_3 var1, int var2) {
      return this.class_(var1.Bs(), var2);
   }

   protected boolean class_(rLp_1 var1) {
      if (var1 == rLp_1.WATER) {
         return false;
      } else {
         return var1 == rLp_1.LAVA ? false : var1 != rLp_1.OPEN;
      }
   }

   private boolean class_(int var1, int var2, int var3, int var4, int var5, int var6, rjU_2 var7, double var8, double var10) {
      int var12 = var1 - var4 / 2;
      int var13 = var3 - var6 / 2;
      if (!this.break_(var12, var2, var13, var4, var5, var6, var7, var8, var10)) {
         return false;
      } else {
         for (int var14 = var12; var14 < var12 + var4; var14++) {
            for (int var15 = var13; var15 < var13 + var6; var15++) {
               double var16 = (double)var14 + 0.5 - var7.break_;
               double var18 = (double)var15 + 0.5 - var7.protected_;
               if (!(var16 * var8 + var18 * var10 < 0.0)) {
                  rLp_1 var20 = this.int_.class_(this.byte_, var14, var2 - 1, var15, this.break_, var4, var5, var6, true, true);
                  if (!this.class_(var20)) {
                     return false;
                  }

                  var20 = this.int_.class_(this.byte_, var14, var2, var15, this.break_, var4, var5, var6, true, true);
                  float var21 = this.break_.class_(var20);
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
   protected boolean class_(rjU_2 var1, rjU_2 var2, int var3, int var4, int var5) {
      int var6 = rfU_2.byte_(var1.break_);
      int var7 = rfU_2.byte_(var1.protected_);
      double var8 = var2.break_ - var1.break_;
      double var10 = var2.protected_ - var1.protected_;
      double var12 = var8 * var8 + var10 * var10;
      if (var12 < 1.0E-8) {
         return false;
      } else {
         double var14 = 1.0 / Math.sqrt(var12);
         var8 *= var14;
         var10 *= var14;
         var3 += 2;
         var5 += 2;
         if (!this.class_(var6, rfU_2.byte_(var1.byte_), var7, var3, var4, var5, var1, var8, var10)) {
            return false;
         } else {
            var3 -= 2;
            var5 -= 2;
            double var16 = 1.0 / Math.abs(var8);
            double var18 = 1.0 / Math.abs(var10);
            double var20 = (double)var6 - var1.break_;
            double var22 = (double)var7 - var1.protected_;
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
            int var26 = rfU_2.byte_(var2.break_);
            int var27 = rfU_2.byte_(var2.protected_);
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

               if (!this.class_(var6, rfU_2.byte_(var1.byte_), var7, var3, var4, var5, var1, var8, var10)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   @Override
   protected rLl_1 class_(int var1) {
      this.int_ = new rLf_1();
      this.int_.class_(true);
      return new rLl_1(this.int_, var1);
   }

   @Override
   public rLC class_(rfH_2 var1, int var2) {
      if (this.byte_.byte_(var1).catch_()) {
         rfH_2 var3 = var1.break_();

         while (var3.c_() > 0 && this.byte_.byte_(var3).catch_()) {
            var3 = var3.break_();
         }

         if (var3.c_() > 0) {
            return super.class_(var3.final_(), var2);
         }

         while (var3.c_() < this.byte_.try_() && this.byte_.byte_(var3).catch_()) {
            var3 = var3.final_();
         }

         var1 = var3;
      }

      if (!this.byte_.byte_(var1).byte_().break_()) {
         return super.class_(var1, var2);
      } else {
         rfH_2 var4 = var1.final_();

         while (var4.c_() < this.byte_.try_() && this.byte_.byte_(var4).byte_().break_()) {
            var4 = var4.final_();
         }

         return super.class_(var4, var2);
      }
   }

   public void class_(boolean var1) {
      this.int_.break_(var1);
   }

   private boolean break_(int var1, int var2, int var3, int var4, int var5, int var6, rjU_2 var7, double var8, double var10) {
      for (rfH_2 var13 : rfH_2.class_(new rfH_2(var1, var2, var3), new rfH_2(var1 + var4 - 1, var2 + var5 - 1, var3 + var6 - 1))) {
         double var14 = (double)var13.b_() + 0.5 - var7.break_;
         double var16 = (double)var13.d_() + 0.5 - var7.protected_;
         if (!(var14 * var8 + var16 * var10 < 0.0) && !this.byte_.byte_(var13).class_(this.byte_, var13, rLT.LAND)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected boolean break_() {
      return this.break_.BL() || this.package_() || this.break_.Pm();
   }

   public void break_(boolean var1) {
      this.class_ = var1;
   }

   public boolean throws_() {
      return this.int_.byte_();
   }

   private int super_() {
      if (this.break_.rT() && this.new_()) {
         int var1 = rfU_2.byte_(this.break_.re());
         xd_3 var2 = this.byte_.byte_(new rfH_2(this.break_.rx(), (double)var1, this.break_.BO())).break_();
         int var3 = 0;

         while (var2 == xu_3.try_) {
            var2 = this.byte_.byte_(new rfH_2(this.break_.rx(), (double)(++var1), this.break_.BO())).break_();
            if (++var3 > 16) {
               return rfU_2.byte_(this.break_.re());
            }
         }

         return var1;
      } else {
         return rfU_2.byte_(this.break_.re() + 0.5);
      }
   }

   @Override
   protected void protected_() {
      super.protected_();
      if (this.class_) {
         if (this.byte_.case_(new rfH_2(this.break_.rx(), this.break_.re() + 0.5, this.break_.BO()))) {
            return;
         }

         for (int var1 = 0; var1 < this.protected_.throws_(); var1++) {
            rLq_1 var2 = this.protected_.class_(var1);
            if (this.byte_.case_(new rfH_2(var2.class_, var2.break_, var2.byte_))) {
               this.protected_.break_(var1);
               return;
            }
         }
      }
   }
}
