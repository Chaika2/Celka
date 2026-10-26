package celestial;

class rGM extends rPY {
   private float finally_;

   public rGM(rGB var1, is_3 var2) {
      super(var2);
      this.implements_ = var1;
      this.finally_ = 0.1F;
   }

   @Override
   public void class_() {
      if ((Boolean)this.implements_.throws_[23]) {
         rGB var10000 = this.implements_;
         Float var27 = (Float)this.implements_.throws_[15] + 180.0F;
         var10000.throws_[15] = var27;
         this.finally_ = 0.1F;
      }

      float var1 = (float)(this.implements_.break_.break_ - this.implements_.rx());
      float var2 = (float)(this.implements_.break_.byte_ - this.implements_.re());
      float var3 = (float)(this.implements_.break_.protected_ - this.implements_.BO());
      double var4 = (double)rfU_2.byte_(var1 * var1 + var3 * var3);
      double var6 = 1.0 - (double)rfU_2.throws_(var2 * 0.7F) / var4;
      var1 = (float)((double)var1 * var6);
      var3 = (float)((double)var3 * var6);
      var4 = (double)rfU_2.byte_(var1 * var1 + var3 * var3);
      double var8 = (double)rfU_2.byte_(var1 * var1 + var3 * var3 + var2 * var2);
      float var10 = (Float)this.implements_.throws_[15];
      float var11 = (float)rfU_2.protected_((double)var3, (double)var1);
      float var12 = rfU_2.catch_((Float)this.implements_.throws_[15] + 90.0F);
      float var13 = rfU_2.catch_(var11 * (180.0F / (float)Math.PI));
      rGB var34 = this.implements_;
      Float var28 = rfU_2.protected_(var12, var13, 4.0F) - 90.0F;
      var34.throws_[15] = var28;
      var34 = this.implements_;
      Float var29 = (Float)this.implements_.throws_[15];
      var34.private_[23] = var29;
      if (rfU_2.protected_(var10, (Float)this.implements_.throws_[15]) < 3.0F) {
         this.finally_ = rfU_2.byte_(this.finally_, 1.8F, 0.005F * (1.8F / this.finally_));
      } else {
         this.finally_ = rfU_2.byte_(this.finally_, 0.2F, 0.025F);
      }

      float var14 = (float)(-(rfU_2.protected_((double)(-var2), var4) * 180.0F / (float)Math.PI));
      var34 = this.implements_;
      Float var30 = var14;
      var34.throws_[16] = var30;
      float var15 = (Float)this.implements_.throws_[15] + 90.0F;
      double var16 = (double)(this.finally_ * rfU_2.break_(var15 * (float) (Math.PI / 180.0))) * Math.abs((double)var1 / var8);
      double var18 = (double)(this.finally_ * rfU_2.class_(var15 * (float) (Math.PI / 180.0))) * Math.abs((double)var3 / var8);
      double var20 = (double)(this.finally_ * rfU_2.class_(var14 * (float) (Math.PI / 180.0))) * Math.abs((double)var2 / var8);
      rjU_2 var22 = this.implements_.rv();
      this.implements_.byte_(var22.throws_(new rjU_2(var16, var20, var18).protected_(var22).class_(0.2)));
   }
}
