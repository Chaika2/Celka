package celestial;

public class yt_3 implements rrxN_2 {
   private final rji_3[] break_ = new rji_3[6];
   private double byte_;
   private double protected_;
   private double throws_;
   public boolean class_ = false;

   public double byte_() {
      return this.protected_;
   }

   public yt_3(rjV_2 var1, rjV_2 var2) {
      this.class_(var1, var2);
   }

   public boolean class_(eX_2 var1) {
      return this.break_(var1.class_(), var1.break_(), var1.byte_(), var1.class_(), var1.break_(), var1.byte_());
   }

   private boolean class_(float var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var7 = 0; var7 < 6; var7++) {
         rji_3 var8 = this.break_[var7];
         float var9 = var8.class_();
         float var10 = var8.break_();
         float var11 = var8.byte_();
         float var12 = var8.protected_();
         if (var9 * var1 + var10 * var2 + var11 * var3 + var12 <= 0.0F
            && var9 * var4 + var10 * var2 + var11 * var3 + var12 <= 0.0F
            && var9 * var1 + var10 * var5 + var11 * var3 + var12 <= 0.0F
            && var9 * var4 + var10 * var5 + var11 * var3 + var12 <= 0.0F
            && var9 * var1 + var10 * var2 + var11 * var6 + var12 <= 0.0F
            && var9 * var4 + var10 * var2 + var11 * var6 + var12 <= 0.0F
            && var9 * var1 + var10 * var5 + var11 * var6 + var12 <= 0.0F
            && var9 * var4 + var10 * var5 + var11 * var6 + var12 <= 0.0F) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean class_(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (this.class_) {
         return true;
      } else {
         float var13 = (float)var1;
         float var14 = (float)var3;
         float var15 = (float)var5;
         float var16 = (float)var7;
         float var17 = (float)var9;
         float var18 = (float)var11;

         for (int var19 = 0; var19 < 6; var19++) {
            rji_3 var20 = this.break_[var19];
            float var21 = var20.class_();
            float var22 = var20.break_();
            float var23 = var20.byte_();
            float var24 = var20.protected_();
            if (var19 < 4) {
               if (var21 * var13 + var22 * var14 + var23 * var15 + var24 <= 0.0F
                  || var21 * var16 + var22 * var14 + var23 * var15 + var24 <= 0.0F
                  || var21 * var13 + var22 * var17 + var23 * var15 + var24 <= 0.0F
                  || var21 * var16 + var22 * var17 + var23 * var15 + var24 <= 0.0F
                  || var21 * var13 + var22 * var14 + var23 * var18 + var24 <= 0.0F
                  || var21 * var16 + var22 * var14 + var23 * var18 + var24 <= 0.0F
                  || var21 * var13 + var22 * var17 + var23 * var18 + var24 <= 0.0F
                  || var21 * var16 + var22 * var17 + var23 * var18 + var24 <= 0.0F) {
                  return false;
               }
            } else if (var21 * var13 + var22 * var14 + var23 * var15 + var24 <= 0.0F
               && var21 * var16 + var22 * var14 + var23 * var15 + var24 <= 0.0F
               && var21 * var13 + var22 * var17 + var23 * var15 + var24 <= 0.0F
               && var21 * var16 + var22 * var17 + var23 * var15 + var24 <= 0.0F
               && var21 * var13 + var22 * var14 + var23 * var18 + var24 <= 0.0F
               && var21 * var16 + var22 * var14 + var23 * var18 + var24 <= 0.0F
               && var21 * var13 + var22 * var17 + var23 * var18 + var24 <= 0.0F
               && var21 * var16 + var22 * var17 + var23 * var18 + var24 <= 0.0F) {
               return false;
            }
         }

         return true;
      }
   }

   public rji_3[] class_() {
      return this.break_;
   }

   @Override
   public void class_(double var1, double var3, double var5) {
      this.byte_ = var1;
      this.protected_ = var3;
      this.throws_ = var5;
   }

   private void class_(rjV_2 var1, rjV_2 var2) {
      rjV_2 var3 = var2.case_();
      var3.class_(var1);
      var3.protected_();
      this.class_(var3, -1, 0, 0, 0);
      this.class_(var3, 1, 0, 0, 1);
      this.class_(var3, 0, -1, 0, 2);
      this.class_(var3, 0, 1, 0, 3);
      this.class_(var3, 0, 0, -1, 4);
      this.class_(var3, 0, 0, 1, 5);
   }

   private void class_(rjV_2 var1, int var2, int var3, int var4, int var5) {
      rji_3 var6 = new rji_3((float)var2, (float)var3, (float)var4, 1.0F);
      var6.class_(var1);
      var6.throws_();
      this.break_[var5] = var6;
   }

   @Override
   public boolean class_(rfl_3 var1) {
      return this.break_(var1.class_, var1.break_, var1.byte_, var1.protected_, var1.throws_, var1.case_);
   }

   public double break_() {
      return this.byte_;
   }

   private boolean break_(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (this.class_) {
         return true;
      } else {
         float var13 = (float)(var1 - this.byte_);
         float var14 = (float)(var3 - this.protected_);
         float var15 = (float)(var5 - this.throws_);
         float var16 = (float)(var7 - this.byte_);
         float var17 = (float)(var9 - this.protected_);
         float var18 = (float)(var11 - this.throws_);
         return this.class_(var13, var14, var15, var16, var17, var18);
      }
   }

   public boolean break_(double var1, double var3, double var5) {
      return this.break_(var1, var3, var5, var1, var3, var5);
   }

   public double protected_() {
      return this.throws_;
   }
}
