package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUn_1 extends rUO<rDq_1> {
   private boolean byte_(xd_3 var1) {
      return var1 == xu_3.Ei || var1 == xu_3.Pt || var1 == xu_3.hP;
   }

   public rUn_1(Codec<rDq_1> var1) {
      super(var1);
   }

   private double class_(int var1, int var2, rfH_2 var3, int var4, Random var5) {
      float var6 = 10.0F * rfU_2.class_(var5.nextFloat(), 0.2F, 0.8F) / (float)var4;
      return (double)var6 + Math.pow((double)(var1 - var3.b_()), 2.0) + Math.pow((double)(var2 - var3.d_()), 2.0) - Math.pow((double)var4, 2.0);
   }

   private double class_(int var1, int var2, rfH_2 var3, int var4, int var5, double var6) {
      return Math.pow(((double)(var1 - var3.b_()) * Math.cos(var6) - (double)(var2 - var3.d_()) * Math.sin(var6)) / (double)var4, 2.0)
         + Math.pow(((double)(var1 - var3.b_()) * Math.sin(var6) + (double)(var2 - var3.d_()) * Math.cos(var6)) / (double)var5, 2.0)
         - 1.0;
   }

   private int class_(Random var1, int var2, int var3, int var4) {
      float var5 = 3.5F - var1.nextFloat();
      float var6 = (1.0F - (float)Math.pow((double)var2, 2.0) / ((float)var3 * var5)) * (float)var4;
      if (var3 > 15 + var1.nextInt(5)) {
         int var7 = var2 < 3 + var1.nextInt(6) ? var2 / 2 : var2;
         var6 = (1.0F - (float)var7 / ((float)var3 * var5 * 0.4F)) * (float)var4;
      }

      return rfU_2.case_(var6 / 2.0F);
   }

   private boolean class_(rRq_1 var1, rfH_2 var2) {
      return var1.byte_(var2.break_()).byte_() == QP.class_;
   }

   private void class_(rRg_1 var1, rfH_2 var2, int var3, int var4, boolean var5, int var6) {
      int var7 = var5 ? var6 : var3 / 2;

      for (int var8 = -var7; var8 <= var7; var8++) {
         for (int var9 = -var7; var9 <= var7; var9++) {
            for (int var10 = 0; var10 <= var4; var10++) {
               rfH_2 var11 = var2.break_(var8, var10, var9);
               xd_3 var12 = var1.byte_(var11).break_();
               if (this.byte_(var12) || var12 == xu_3.Pq) {
                  if (this.class_((rRq_1)var1, var11)) {
                     this.class_(var1, var11, xu_3.class_.continue_());
                     this.class_(var1, var11.final_(), xu_3.class_.continue_());
                  } else if (this.byte_(var12)) {
                     xd_3[] var13 = new xd_3[]{
                        var1.byte_(var11.byte_()).break_(),
                        var1.byte_(var11.extends_()).break_(),
                        var1.byte_(var11.private_()).break_(),
                        var1.byte_(var11.protected_()).break_()
                     };
                     int var14 = 0;

                     for (xd_3 var18 : var13) {
                        if (!this.byte_(var18)) {
                           var14++;
                        }
                     }

                     if (var14 >= 3) {
                        this.class_(var1, var11, xu_3.class_.continue_());
                     }
                  }
               }
            }
         }
      }
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDq_1 var5) {
      var4 = new rfH_2(var4.b_(), var2.case_(), var4.d_());
      boolean var6 = var3.nextDouble() > 0.7;
      xc_3 var7 = var5.break_;
      double var8 = var3.nextDouble() * 2.0 * Math.PI;
      int var10 = 11 - var3.nextInt(5);
      int var11 = 3 + var3.nextInt(3);
      boolean var12 = var3.nextDouble() > 0.7;
      byte var13 = 11;
      int var14 = var12 ? var3.nextInt(6) + 6 : var3.nextInt(15) + 3;
      if (!var12 && var3.nextDouble() > 0.9) {
         var14 += var3.nextInt(19) + 7;
      }

      int var15 = Math.min(var14 + var3.nextInt(11), 18);
      int var16 = Math.min(var14 + var3.nextInt(7) - var3.nextInt(5), 11);
      int var17 = var12 ? var10 : 11;

      for (int var18 = -var17; var18 < var17; var18++) {
         for (int var19 = -var17; var19 < var17; var19++) {
            for (int var20 = 0; var20 < var14; var20++) {
               int var21 = var12 ? this.break_(var20, var14, var16) : this.class_(var3, var20, var14, var16);
               if (var12 || var18 < var21) {
                  this.class_(var1, var3, var4, var14, var18, var20, var19, var21, var17, var12, var11, var8, var6, var7);
               }
            }
         }
      }

      this.class_(var1, var4, var16, var14, var12, var10);

      for (int var24 = -var17; var24 < var17; var24++) {
         for (int var26 = -var17; var26 < var17; var26++) {
            for (int var27 = -1; var27 > -var15; var27--) {
               int var28 = var12 ? rfU_2.case_((float)var17 * (1.0F - (float)Math.pow((double)var27, 2.0) / ((float)var15 * 8.0F))) : var17;
               int var22 = this.break_(var3, -var27, var15, var16);
               if (var24 < var22) {
                  this.class_(var1, var3, var4, var15, var24, var27, var26, var22, var28, var12, var11, var8, var6, var7);
               }
            }
         }
      }

      boolean var25 = var12 ? var3.nextDouble() > 0.1 : var3.nextDouble() > 0.7;
      if (var25) {
         this.class_(var3, var1, var16, var14, var4, var12, var10, var8, var11);
      }

      return true;
   }

   private void class_(rRg_1 var1, rfH_2 var2) {
      if (var1.byte_(var2.final_()).class_(xu_3.Pq)) {
         this.class_(var1, var2.final_(), xu_3.class_.continue_());
      }
   }

   private void class_(int var1, int var2, rfH_2 var3, rRg_1 var4, boolean var5, double var6, rfH_2 var8, int var9, int var10) {
      int var11 = var1 + 1 + var9 / 3;
      int var12 = Math.min(var1 - 3, 3) + var10 / 2 - 1;

      for (int var13 = -var11; var13 < var11; var13++) {
         for (int var14 = -var11; var14 < var11; var14++) {
            double var15 = this.class_(var13, var14, var8, var11, var12, var6);
            if (var15 < 0.0) {
               rfH_2 var17 = var3.break_(var13, var2, var14);
               xd_3 var18 = var4.byte_(var17).break_();
               if (this.byte_(var18) || var18 == xu_3.Pt) {
                  if (var5) {
                     this.class_(var4, var17, xu_3.try_.continue_());
                  } else {
                     this.class_(var4, var17, xu_3.class_.continue_());
                     this.class_(var4, var17);
                  }
               }
            }
         }
      }
   }

   private void class_(Random var1, rRg_1 var2, int var3, int var4, rfH_2 var5, boolean var6, int var7, double var8, int var10) {
      int var11 = var1.nextBoolean() ? -1 : 1;
      int var12 = var1.nextBoolean() ? -1 : 1;
      int var13 = var1.nextInt(Math.max(var3 / 2 - 2, 1));
      if (var1.nextBoolean()) {
         var13 = var3 / 2 + 1 - var1.nextInt(Math.max(var3 - var3 / 2 - 1, 1));
      }

      int var14 = var1.nextInt(Math.max(var3 / 2 - 2, 1));
      if (var1.nextBoolean()) {
         var14 = var3 / 2 + 1 - var1.nextInt(Math.max(var3 - var3 / 2 - 1, 1));
      }

      if (var6) {
         var13 = var14 = var1.nextInt(Math.max(var7 - 5, 1));
      }

      rfH_2 var15 = new rfH_2(var11 * var13, 0, var12 * var14);
      double var16 = var6 ? var8 + (Math.PI / 2) : var1.nextDouble() * 2.0 * Math.PI;

      for (int var18 = 0; var18 < var4 - 3; var18++) {
         int var19 = this.class_(var1, var18, var4, var3);
         this.class_(var19, var18, var5, var2, false, var16, var15, var7, var10);
      }

      for (int var20 = -1; var20 > -var4 + var1.nextInt(5); var20--) {
         int var21 = this.break_(var1, -var20, var4, var3);
         this.class_(var21, var20, var5, var2, true, var16, var15, var7, var10);
      }
   }

   private int class_(int var1, int var2, int var3) {
      int var4 = var3;
      if (var1 > 0 && var2 - var1 <= 3) {
         var4 = var3 - (4 - (var2 - var1));
      }

      return var4;
   }

   private void class_(
      rRg_1 var1,
      Random var2,
      rfH_2 var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      boolean var10,
      int var11,
      double var12,
      boolean var14,
      xc_3 var15
   ) {
      double var16 = var10
         ? this.class_(var5, var7, rfH_2.protected_, var9, this.class_(var6, var4, var11), var12)
         : this.class_(var5, var7, rfH_2.protected_, var8, var2);
      if (var16 < 0.0) {
         rfH_2 var18 = var3.break_(var5, var6, var7);
         double var19 = var10 ? -0.5 : (double)(-6 - var2.nextInt(3));
         if (var16 > var19 && var2.nextDouble() > 0.9) {
            return;
         }

         this.class_(var18, var1, var2, var4 - var6, var4, var10, var14, var15);
      }
   }

   private void class_(rfH_2 var1, rRg_1 var2, Random var3, int var4, int var5, boolean var6, boolean var7, xc_3 var8) {
      xc_3 var9 = var2.byte_(var1);
      if (var9.byte_() == QP.class_ || var9.class_(xu_3.Pt) || var9.class_(xu_3.PT) || var9.class_(xu_3.try_)) {
         boolean var10 = !var6 || var3.nextDouble() > 0.05;
         int var11 = var6 ? 3 : 2;
         if (var7 && !var9.class_(xu_3.try_) && (double)var4 <= (double)var3.nextInt(Math.max(1, var5 / var11)) + (double)var5 * 0.6 && var10) {
            this.class_(var2, var1, xu_3.Pt.continue_());
         } else {
            this.class_(var2, var1, var8);
         }
      }
   }

   private int break_(Random var1, int var2, int var3, int var4) {
      float var5 = 1.0F + var1.nextFloat() / 2.0F;
      float var6 = (1.0F - (float)var2 / ((float)var3 * var5)) * (float)var4;
      return rfU_2.case_(var6 / 2.0F);
   }

   private int break_(int var1, int var2, int var3) {
      float var4 = 1.0F;
      float var5 = (1.0F - (float)Math.pow((double)var1, 2.0) / ((float)var2 * 1.0F)) * (float)var3;
      return rfU_2.case_(var5 / 2.0F);
   }
}
