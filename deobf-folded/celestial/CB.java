package celestial;

public class CB extends CL {
   private int id_class;
   private final Cy_1 id_break;
   private rcy_3 id_instanceof;
   private boolean id_throw;

   public CB(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Cy_1 var14, rcd_3 var15) {
      super(var1, var2, var4, var6);
      this.id_finally = var8;
      this.id_extends = var10;
      this.id_native = var12;
      this.id_break = var14;
      this.id_this = 8;
      if (var15 != null) {
         this.id_instanceof = var15.id_protected("Explosions", 10);
         if (this.id_instanceof.isEmpty()) {
            this.id_instanceof = null;
         } else {
            this.id_this = this.id_instanceof.size() * 2 - 1;

            for (int var16 = 0; var16 < this.id_instanceof.size(); var16++) {
               rcd_3 var17 = this.id_instanceof.id_class(var16);
               if (var17.id_new("Flicker")) {
                  this.id_throw = true;
                  this.id_this += 15;
                  break;
               }
            }
         }
      }
   }

   private void id_class(double var1, int var3, int[] var4, int[] var5, boolean var6, boolean var7) {
      double var8 = this.id_catch;
      double var10 = this.id_private;
      double var12 = this.id_implements;

      for (int var14 = -var3; var14 <= var3; var14++) {
         for (int var15 = -var3; var15 <= var3; var15++) {
            for (int var16 = -var3; var16 <= var3; var16++) {
               double var17 = (double)var15 + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 0.5;
               double var19 = (double)var14 + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 0.5;
               double var21 = (double)var16 + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 0.5;
               double var23 = (double)rfU_2.id_class(var17 * var17 + var19 * var19 + var21 * var21) / var1 + this.id_continue.nextGaussian() * 0.05;
               this.id_class(var8, var10, var12, var17 / var23, var19 / var23, var21 / var23, var4, var5, var6, var7);
               if (var14 != -var3 && var14 != var3 && var15 != -var3 && var15 != var3) {
                  var16 += var3 * 2 - 1;
               }
            }
         }
      }
   }

   private void id_class(double var1, double[][] var3, int[] var4, int[] var5, boolean var6, boolean var7, boolean var8) {
      double var9 = var3[0][0];
      double var11 = var3[0][1];
      this.id_class(this.id_catch, this.id_private, this.id_implements, var9 * var1, var11 * var1, 0.0, var4, var5, var6, var7);
      float var13 = this.id_continue.nextFloat() * (float) Math.PI;
      double var14 = var8 ? 0.034 : 0.34;

      for (int var16 = 0; var16 < 3; var16++) {
         double var17 = (double)var13 + (double)((float)var16 * (float) Math.PI) * var14;
         double var19 = var9;
         double var21 = var11;

         for (int var23 = 1; var23 < var3.length; var23++) {
            double var24 = var3[var23][0];
            double var26 = var3[var23][1];

            for (double var28 = 0.25; var28 <= 1.0; var28 += 0.25) {
               double var30 = rfU_2.id_protected(var28, var19, var24) * var1;
               double var32 = rfU_2.id_protected(var28, var21, var26) * var1;
               double var34 = var30 * Math.sin(var17);
               var30 *= Math.cos(var17);

               for (double var36 = -1.0; var36 <= 1.0; var36 += 2.0) {
                  this.id_class(this.id_catch, this.id_private, this.id_implements, var30 * var36, var32, var34 * var36, var4, var5, var6, var7);
               }
            }

            var19 = var24;
            var21 = var26;
         }
      }
   }

   private void id_class(int[] var1, int[] var2, boolean var3, boolean var4) {
      double var5 = this.id_continue.nextGaussian() * 0.05;
      double var7 = this.id_continue.nextGaussian() * 0.05;

      for (int var9 = 0; var9 < 70; var9++) {
         double var10 = this.id_finally * 0.5 + this.id_continue.nextGaussian() * 0.15 + var5;
         double var12 = this.id_native * 0.5 + this.id_continue.nextGaussian() * 0.15 + var7;
         double var14 = this.id_extends * 0.5 + this.id_continue.nextDouble() * 0.5;
         this.id_class(this.id_catch, this.id_private, this.id_implements, var10, var14, var12, var1, var2, var3, var4);
      }
   }

   private void id_class(double var1, double var3, double var5, double var7, double var9, double var11, int[] var13, int[] var14, boolean var15, boolean var16) {
      Cr_1 var17 = (Cr_1)this.id_break.id_class(rLQ.id_goto, var1, var3, var5, var7, var9, var11);
      var17.id_class(var15);
      var17.id_break(var16);
      var17.id_throws(0.99F);
      int var18 = this.id_continue.nextInt(var13.length);
      var17.id_break(var13[var18]);
      if (var14.length > 0) {
         var17.id_byte(rqR_2.id_class(var14, this.id_continue));
      }
   }

   private boolean id_break() {
      QY var1 = QY.id_instanceof();
      return ((Hh_1)var1.id_class[16]).id_finally().id_break().id_protected(this.id_catch, this.id_private, this.id_implements) >= 256.0;
   }

   @Override
   public void id_case() {
      if (this.id_class == 0 && this.id_instanceof != null) {
         boolean var1 = this.id_break();
         boolean var2 = false;
         if (this.id_instanceof.size() >= 3) {
            var2 = true;
         } else {
            for (int var3 = 0; var3 < this.id_instanceof.size(); var3++) {
               rcd_3 var4 = this.id_instanceof.id_class(var3);
               if (rxV_2.id_class(var4.id_case("Type")) == rxV_2.LARGE_BALL) {
                  var2 = true;
                  break;
               }
            }
         }

         rqA_2 var17;
         if (var2) {
            var17 = var1 ? rqn_3.SO : rqn_3.SM;
         } else {
            var17 = var1 ? rqn_3.Sb : rqn_3.SG;
         }

         this.id_byte
            .id_class(this.id_catch, this.id_private, this.id_implements, var17, rqL_2.AMBIENT, 20.0F, 0.95F + this.id_continue.nextFloat() * 0.1F, true);
      }

      if (this.id_class % 2 == 0 && this.id_instanceof != null && this.id_class / 2 < this.id_instanceof.size()) {
         int var13 = this.id_class / 2;
         rcd_3 var15 = this.id_instanceof.id_class(var13);
         rxV_2 var18 = rxV_2.id_class(var15.id_case("Type"));
         boolean var19 = var15.id_new("Trail");
         boolean var5 = var15.id_new("Flicker");
         int[] var6 = var15.id_final("Colors");
         int[] var7 = var15.id_final("FadeColors");
         if (var6.length == 0) {
            var6 = new int[]{rxL_2.BLACK.id_case()};
         }

         switch (var18) {
            case SMALL_BALL:
            default:
               this.id_class(0.25, 2, var6, var7, var19, var5);
               break;
            case LARGE_BALL:
               this.id_class(0.5, 4, var6, var7, var19, var5);
               break;
            case STAR:
               this.id_class(
                  0.5,
                  new double[][]{
                     {0.0, 1.0},
                     {0.3455, 0.309},
                     {0.9511, 0.309},
                     {0.3795918367346939, -0.12653061224489795},
                     {0.6122448979591837, -0.8040816326530612},
                     {0.0, -0.35918367346938773}
                  },
                  var6,
                  var7,
                  var19,
                  var5,
                  false
               );
               break;
            case CREEPER:
               this.id_class(
                  0.5,
                  new double[][]{
                     {0.0, 0.2},
                     {0.2, 0.2},
                     {0.2, 0.6},
                     {0.6, 0.6},
                     {0.6, 0.2},
                     {0.2, 0.2},
                     {0.2, 0.0},
                     {0.4, 0.0},
                     {0.4, -0.6},
                     {0.2, -0.6},
                     {0.2, -0.4},
                     {0.0, -0.4}
                  },
                  var6,
                  var7,
                  var19,
                  var5,
                  true
               );
               break;
            case BURST:
               this.id_class(var6, var7, var19, var5);
         }

         int var8 = var6[0];
         float var9 = (float)((var8 & 0xFF0000) >> 16) / 255.0F;
         float var10 = (float)((var8 & 0xFF00) >> 8) / 255.0F;
         float var11 = (float)((var8 & 0xFF) >> 0) / 255.0F;
         CH var12 = this.id_break.id_class(rLQ.id_interface, this.id_catch, this.id_private, this.id_implements, 0.0, 0.0, 0.0);
         var12.id_class(var9, var10, var11);
      }

      this.id_class++;
      if (this.id_class > this.id_this) {
         if (this.id_throw) {
            boolean var14 = this.id_break();
            rqA_2 var16 = var14 ? rqn_3.Sx : rqn_3.SJ;
            this.id_byte
               .id_class(this.id_catch, this.id_private, this.id_implements, var16, rqL_2.AMBIENT, 20.0F, 0.9F + this.id_continue.nextFloat() * 0.15F, true);
         }

         this.id_finally();
      }
   }
}
