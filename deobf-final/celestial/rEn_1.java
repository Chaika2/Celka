package celestial;

class rEn_1 extends rGt_1 {
   rEn_1(rEA var1) {
      super(var1);
      this.class_ = var1;
   }

   private void class_(double var1, double var3, double var5, double var7, float var9, int var10) {
      rfH_2 var11 = new rfH_2(var1, var7, var3);
      boolean var12 = false;
      double var13 = 0.0;

      do {
         rfH_2 var15 = var11.break_();
         xc_3 var16 = ((rYB)this.class_.throws_[7]).byte_(var15);
         if (var16.protected_((rYB)this.class_.throws_[7], var15, rpr_3.UP)) {
            if (!((rYB)this.class_.throws_[7]).finally_(var11)) {
               xc_3 var17 = ((rYB)this.class_.throws_[7]).byte_(var11);
               rjC_2 var18 = var17.extends_((rYB)this.class_.throws_[7], var11);
               if (!var18.break_()) {
                  var13 = var18.byte_(rpB_2.Y);
               }
            }

            var12 = true;
            break;
         }

         var11 = var11.break_();
      } while (var11.c_() >= rfU_2.byte_(var5) - 1);

      if (var12) {
         ((rYB)this.class_.throws_[7]).a_(new rhC_2((rYB)this.class_.throws_[7], var1, (double)var11.c_() + var13, var3, var9, var10, this.class_));
      }
   }

   @Override
   protected void finally_() {
      iB_2 var1 = this.class_.I_();
      double var2 = Math.min(var1.re(), this.class_.re());
      double var4 = Math.max(var1.re(), this.class_.re()) + 1.0;
      float var6 = (float)rfU_2.protected_(var1.BO() - this.class_.BO(), var1.rx() - this.class_.rx());
      if (this.class_.int_(var1) < 9.0) {
         for (int var7 = 0; var7 < 5; var7++) {
            float var8 = var6 + (float)var7 * (float) Math.PI * 0.4F;
            this.class_(this.class_.rx() + (double)rfU_2.break_(var8) * 1.5, this.class_.BO() + (double)rfU_2.class_(var8) * 1.5, var2, var4, var8, 0);
         }

         for (int var11 = 0; var11 < 8; var11++) {
            float var13 = var6 + (float)var11 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
            this.class_(this.class_.rx() + (double)rfU_2.break_(var13) * 2.5, this.class_.BO() + (double)rfU_2.class_(var13) * 2.5, var2, var4, var13, 3);
         }
      } else {
         for (int var12 = 0; var12 < 16; var12++) {
            double var14 = 1.25 * (double)(var12 + 1);
            int var10 = 1 * var12;
            this.class_(this.class_.rx() + (double)rfU_2.break_(var6) * var14, this.class_.BO() + (double)rfU_2.class_(var6) * var14, var2, var4, var6, var10);
         }
      }
   }

   @Override
   protected int catch_() {
      return 40;
   }

   @Override
   protected rqA_2 extends_() {
      return rqn_3.Ba;
   }

   @Override
   protected int private_() {
      return 100;
   }

   @Override
   protected rGT native_() {
      return rGT.FANGS;
   }
}
