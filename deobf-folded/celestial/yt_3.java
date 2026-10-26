package celestial;

public class yt_3 implements rrxN_2 {
   private final rji_3[] id_break = new rji_3[6];
   private double id_byte;
   private double id_protected;
   private double id_throws;
   public boolean id_class = false;

   public double id_byte() {
      return this.id_protected;
   }

   public yt_3(rjV_2 var1, rjV_2 var2) {
      this.id_class(var1, var2);
   }

   public boolean id_class(eX_2 var1) {
      return this.id_break(var1.id_class(), var1.id_break(), var1.id_byte(), var1.id_class(), var1.id_break(), var1.id_byte());
   }

   private boolean id_class(float var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var7 = 0; var7 < 6; var7++) {
         rji_3 var8 = this.id_break[var7];
         float var9 = var8.id_class();
         float var10 = var8.id_break();
         float var11 = var8.id_byte();
         float var12 = var8.id_protected();
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
   public boolean id_class(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (this.id_class) {
         return true;
      } else {
         float var13 = (float)var1;
         float var14 = (float)var3;
         float var15 = (float)var5;
         float var16 = (float)var7;
         float var17 = (float)var9;
         float var18 = (float)var11;

         for (int var19 = 0; var19 < 6; var19++) {
            rji_3 var20 = this.id_break[var19];
            float var21 = var20.id_class();
            float var22 = var20.id_break();
            float var23 = var20.id_byte();
            float var24 = var20.id_protected();
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

   public rji_3[] id_class() {
      return this.id_break;
   }

   @Override
   public void id_class(double var1, double var3, double var5) {
      this.id_byte = var1;
      this.id_protected = var3;
      this.id_throws = var5;
   }

   private void id_class(rjV_2 var1, rjV_2 var2) {
      rjV_2 var3 = var2.id_case();
      var3.id_class(var1);
      var3.id_protected();
      this.id_class(var3, -1, 0, 0, 0);
      this.id_class(var3, 1, 0, 0, 1);
      this.id_class(var3, 0, -1, 0, 2);
      this.id_class(var3, 0, 1, 0, 3);
      this.id_class(var3, 0, 0, -1, 4);
      this.id_class(var3, 0, 0, 1, 5);
   }

   private void id_class(rjV_2 var1, int var2, int var3, int var4, int var5) {
      rji_3 var6 = new rji_3((float)var2, (float)var3, (float)var4, 1.0F);
      var6.id_class(var1);
      var6.id_throws();
      this.id_break[var5] = var6;
   }

   @Override
   public boolean id_class(rfl_3 var1) {
      return this.id_break(var1.id_class, var1.id_break, var1.id_byte, var1.id_protected, var1.id_throws, var1.id_case);
   }

   public double id_break() {
      return this.id_byte;
   }

   private boolean id_break(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (this.id_class) {
         return true;
      } else {
         float var13 = (float)(var1 - this.id_byte);
         float var14 = (float)(var3 - this.id_protected);
         float var15 = (float)(var5 - this.id_throws);
         float var16 = (float)(var7 - this.id_byte);
         float var17 = (float)(var9 - this.id_protected);
         float var18 = (float)(var11 - this.id_throws);
         return this.id_class(var13, var14, var15, var16, var17, var18);
      }
   }

   public boolean id_break(double var1, double var3, double var5) {
      return this.id_break(var1, var3, var5, var1, var3, var5);
   }

   public double id_protected() {
      return this.id_throws;
   }
}
