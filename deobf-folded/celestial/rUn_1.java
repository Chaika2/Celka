package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUn_1 extends rUO<rDq_1> {
   private boolean id_byte(xd_3 var1) {
      return var1 == xu_3.Ei || var1 == xu_3.Pt || var1 == xu_3.hP;
   }

   public rUn_1(Codec<rDq_1> var1) {
      super(var1);
   }

   private double id_class(int var1, int var2, rfH_2 var3, int var4, Random var5) {
      float var6 = 10.0F * rfU_2.id_class(var5.nextFloat(), 0.2F, 0.8F) / (float)var4;
      return (double)var6 + Math.pow((double)(var1 - var3.b_()), 2.0) + Math.pow((double)(var2 - var3.d_()), 2.0) - Math.pow((double)var4, 2.0);
   }

   private double id_class(int var1, int var2, rfH_2 var3, int var4, int var5, double var6) {
      return Math.pow(((double)(var1 - var3.b_()) * Math.cos(var6) - (double)(var2 - var3.d_()) * Math.sin(var6)) / (double)var4, 2.0)
         + Math.pow(((double)(var1 - var3.b_()) * Math.sin(var6) + (double)(var2 - var3.d_()) * Math.cos(var6)) / (double)var5, 2.0)
         - 1.0;
   }

   private int id_class(Random var1, int var2, int var3, int var4) {
      float var5 = 3.5F - var1.nextFloat();
      float var6 = (1.0F - (float)Math.pow((double)var2, 2.0) / ((float)var3 * var5)) * (float)var4;
      if (var3 > 15 + var1.nextInt(5)) {
         int var7 = var2 < 3 + var1.nextInt(6) ? var2 / 2 : var2;
         var6 = (1.0F - (float)var7 / ((float)var3 * var5 * 0.4F)) * (float)var4;
      }

      return rfU_2.id_case(var6 / 2.0F);
   }

   private boolean id_class(rRq_1 var1, rfH_2 var2) {
      return var1.id_byte(var2.id_break()).id_byte() == QP.id_class;
   }

   private void id_class(rRg_1 var1, rfH_2 var2, int var3, int var4, boolean var5, int var6) {
      int var7 = var5 ? var6 : var3 / 2;

      for (int var8 = -var7; var8 <= var7; var8++) {
         for (int var9 = -var7; var9 <= var7; var9++) {
            for (int var10 = 0; var10 <= var4; var10++) {
               rfH_2 var11 = var2.id_break(var8, var10, var9);
               xd_3 var12 = var1.id_byte(var11).id_break();
               if (this.id_byte(var12) || var12 == xu_3.Pq) {
                  if (this.id_class((rRq_1)var1, var11)) {
                     this.id_class(var1, var11, xu_3.id_class.id_continue());
                     this.id_class(var1, var11.id_final(), xu_3.id_class.id_continue());
                  } else if (this.id_byte(var12)) {
                     xd_3[] var13 = new xd_3[]{
                        var1.id_byte(var11.id_byte()).id_break(),
                        var1.id_byte(var11.id_extends()).id_break(),
                        var1.id_byte(var11.id_private()).id_break(),
                        var1.id_byte(var11.id_protected()).id_break()
                     };
                     int var14 = 0;

                     for (xd_3 var18 : var13) {
                        if (!this.id_byte(var18)) {
                           var14++;
                        }
                     }

                     if (var14 >= 3) {
                        this.id_class(var1, var11, xu_3.id_class.id_continue());
                     }
                  }
               }
            }
         }
      }
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDq_1 var5) {
      var4 = new rfH_2(var4.b_(), var2.id_case(), var4.d_());
      boolean var6 = var3.nextDouble() > 0.7;
      xc_3 var7 = var5.id_break;
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
               int var21 = var12 ? this.id_break(var20, var14, var16) : this.id_class(var3, var20, var14, var16);
               if (var12 || var18 < var21) {
                  this.id_class(var1, var3, var4, var14, var18, var20, var19, var21, var17, var12, var11, var8, var6, var7);
               }
            }
         }
      }

      this.id_class(var1, var4, var16, var14, var12, var10);

      for (int var24 = -var17; var24 < var17; var24++) {
         for (int var26 = -var17; var26 < var17; var26++) {
            for (int var27 = -1; var27 > -var15; var27--) {
               int var28 = var12 ? rfU_2.id_case((float)var17 * (1.0F - (float)Math.pow((double)var27, 2.0) / ((float)var15 * 8.0F))) : var17;
               int var22 = this.id_break(var3, -var27, var15, var16);
               if (var24 < var22) {
                  this.id_class(var1, var3, var4, var15, var24, var27, var26, var22, var28, var12, var11, var8, var6, var7);
               }
            }
         }
      }

      boolean var25 = var12 ? var3.nextDouble() > 0.1 : var3.nextDouble() > 0.7;
      if (var25) {
         this.id_class(var3, var1, var16, var14, var4, var12, var10, var8, var11);
      }

      return true;
   }

   private void id_class(rRg_1 var1, rfH_2 var2) {
      if (var1.id_byte(var2.id_final()).id_class(xu_3.Pq)) {
         this.id_class(var1, var2.id_final(), xu_3.id_class.id_continue());
      }
   }

   private void id_class(int var1, int var2, rfH_2 var3, rRg_1 var4, boolean var5, double var6, rfH_2 var8, int var9, int var10) {
      int var11 = var1 + 1 + var9 / 3;
      int var12 = Math.min(var1 - 3, 3) + var10 / 2 - 1;

      for (int var13 = -var11; var13 < var11; var13++) {
         for (int var14 = -var11; var14 < var11; var14++) {
            double var15 = this.id_class(var13, var14, var8, var11, var12, var6);
            if (var15 < 0.0) {
               rfH_2 var17 = var3.id_break(var13, var2, var14);
               xd_3 var18 = var4.id_byte(var17).id_break();
               if (this.id_byte(var18) || var18 == xu_3.Pt) {
                  if (var5) {
                     this.id_class(var4, var17, xu_3.id_try.id_continue());
                  } else {
                     this.id_class(var4, var17, xu_3.id_class.id_continue());
                     this.id_class(var4, var17);
                  }
               }
            }
         }
      }
   }

   private void id_class(Random var1, rRg_1 var2, int var3, int var4, rfH_2 var5, boolean var6, int var7, double var8, int var10) {
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
         int var19 = this.id_class(var1, var18, var4, var3);
         this.id_class(var19, var18, var5, var2, false, var16, var15, var7, var10);
      }

      for (int var20 = -1; var20 > -var4 + var1.nextInt(5); var20--) {
         int var21 = this.id_break(var1, -var20, var4, var3);
         this.id_class(var21, var20, var5, var2, true, var16, var15, var7, var10);
      }
   }

   private int id_class(int var1, int var2, int var3) {
      int var4 = var3;
      if (var1 > 0 && var2 - var1 <= 3) {
         var4 = var3 - (4 - (var2 - var1));
      }

      return var4;
   }

   private void id_class(
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
         ? this.id_class(var5, var7, rfH_2.id_protected, var9, this.id_class(var6, var4, var11), var12)
         : this.id_class(var5, var7, rfH_2.id_protected, var8, var2);
      if (var16 < 0.0) {
         rfH_2 var18 = var3.id_break(var5, var6, var7);
         double var19 = var10 ? -0.5 : (double)(-6 - var2.nextInt(3));
         if (var16 > var19 && var2.nextDouble() > 0.9) {
            return;
         }

         this.id_class(var18, var1, var2, var4 - var6, var4, var10, var14, var15);
      }
   }

   private void id_class(rfH_2 var1, rRg_1 var2, Random var3, int var4, int var5, boolean var6, boolean var7, xc_3 var8) {
      xc_3 var9 = var2.id_byte(var1);
      if (var9.id_byte() == QP.id_class || var9.id_class(xu_3.Pt) || var9.id_class(xu_3.PT) || var9.id_class(xu_3.id_try)) {
         boolean var10 = !var6 || var3.nextDouble() > 0.05;
         int var11 = var6 ? 3 : 2;
         if (var7 && !var9.id_class(xu_3.id_try) && (double)var4 <= (double)var3.nextInt(Math.max(1, var5 / var11)) + (double)var5 * 0.6 && var10) {
            this.id_class(var2, var1, xu_3.Pt.id_continue());
         } else {
            this.id_class(var2, var1, var8);
         }
      }
   }

   private int id_break(Random var1, int var2, int var3, int var4) {
      float var5 = 1.0F + var1.nextFloat() / 2.0F;
      float var6 = (1.0F - (float)var2 / ((float)var3 * var5)) * (float)var4;
      return rfU_2.id_case(var6 / 2.0F);
   }

   private int id_break(int var1, int var2, int var3) {
      float var4 = 1.0F;
      float var5 = (1.0F - (float)Math.pow((double)var1, 2.0) / ((float)var2 * 1.0F)) * (float)var3;
      return rfU_2.id_case(var5 / 2.0F);
   }
}
