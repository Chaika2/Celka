package celestial;

class Iw_1 {
   public final It_1[] class_;
   public final rje_3 break_;

   public Iw_1(It_1[] var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8, rpr_3 var9) {
      this.class_ = var1;
      float var10 = 0.0F / var6;
      float var11 = 0.0F / var7;
      if (rrbb_3.T()) {
         var10 = 0.05F / var6;
         var11 = 0.05F / var7;
         if (var4 < var2) {
            var10 = -var10;
         }

         if (var5 < var3) {
            var11 = -var11;
         }
      }

      var1[0] = var1[0].class_(var4 / var6 - var10, var3 / var7 + var11);
      var1[1] = var1[1].class_(var2 / var6 + var10, var3 / var7 + var11);
      var1[2] = var1[2].class_(var2 / var6 + var10, var5 / var7 - var11);
      var1[3] = var1[3].class_(var4 / var6 - var10, var5 / var7 - var11);
      if (var8) {
         int var12 = var1.length;

         for (int var13 = 0; var13 < var12 / 2; var13++) {
            It_1 var14 = var1[var13];
            var1[var13] = var1[var12 - 1 - var13];
            var1[var12 - 1 - var13] = var14;
         }
      }

      this.break_ = var9.native_();
      if (var8) {
         this.break_.class_(-1.0F, 1.0F, 1.0F);
      }
   }
}
