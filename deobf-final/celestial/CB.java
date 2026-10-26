package celestial;

public class CB extends CL {
   private int class_;
   private final Cy_1 break_;
   private rcy_3 instanceof_;
   private boolean throw_;

   public CB(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Cy_1 var14, rcd_3 var15) {
      super(var1, var2, var4, var6);
      this.finally_ = var8;
      this.extends_ = var10;
      this.native_ = var12;
      this.break_ = var14;
      this.this_ = 8;
      if (var15 != null) {
         this.instanceof_ = var15.protected_("Explosions", 10);
         if (this.instanceof_.isEmpty()) {
            this.instanceof_ = null;
         } else {
            this.this_ = this.instanceof_.size() * 2 - 1;

            for (int var16 = 0; var16 < this.instanceof_.size(); var16++) {
               rcd_3 var17 = this.instanceof_.class_(var16);
               if (var17.new_("Flicker")) {
                  this.throw_ = true;
                  this.this_ += 15;
                  break;
               }
            }
         }
      }
   }

   private void class_(double var1, int var3, int[] var4, int[] var5, boolean var6, boolean var7) {
      double var8 = this.catch_;
      double var10 = this.private_;
      double var12 = this.implements_;

      for (int var14 = -var3; var14 <= var3; var14++) {
         for (int var15 = -var3; var15 <= var3; var15++) {
            for (int var16 = -var3; var16 <= var3; var16++) {
               double var17 = (double)var15 + (this.continue_.nextDouble() - this.continue_.nextDouble()) * 0.5;
               double var19 = (double)var14 + (this.continue_.nextDouble() - this.continue_.nextDouble()) * 0.5;
               double var21 = (double)var16 + (this.continue_.nextDouble() - this.continue_.nextDouble()) * 0.5;
               double var23 = (double)rfU_2.class_(var17 * var17 + var19 * var19 + var21 * var21) / var1 + this.continue_.nextGaussian() * 0.05;
               this.class_(var8, var10, var12, var17 / var23, var19 / var23, var21 / var23, var4, var5, var6, var7);
               if (var14 != -var3 && var14 != var3 && var15 != -var3 && var15 != var3) {
                  var16 += var3 * 2 - 1;
               }
            }
         }
      }
   }

   private void class_(double var1, double[][] var3, int[] var4, int[] var5, boolean var6, boolean var7, boolean var8) {
      double var9 = var3[0][0];
      double var11 = var3[0][1];
      this.class_(this.catch_, this.private_, this.implements_, var9 * var1, var11 * var1, 0.0, var4, var5, var6, var7);
      float var13 = this.continue_.nextFloat() * (float) Math.PI;
      double var14 = var8 ? 0.034 : 0.34;

      for (int var16 = 0; var16 < 3; var16++) {
         double var17 = (double)var13 + (double)((float)var16 * (float) Math.PI) * var14;
         double var19 = var9;
         double var21 = var11;

         for (int var23 = 1; var23 < var3.length; var23++) {
            double var24 = var3[var23][0];
            double var26 = var3[var23][1];

            for (double var28 = 0.25; var28 <= 1.0; var28 += 0.25) {
               double var30 = rfU_2.protected_(var28, var19, var24) * var1;
               double var32 = rfU_2.protected_(var28, var21, var26) * var1;
               double var34 = var30 * Math.sin(var17);
               var30 *= Math.cos(var17);

               for (double var36 = -1.0; var36 <= 1.0; var36 += 2.0) {
                  this.class_(this.catch_, this.private_, this.implements_, var30 * var36, var32, var34 * var36, var4, var5, var6, var7);
               }
            }

            var19 = var24;
            var21 = var26;
         }
      }
   }

   private void class_(int[] var1, int[] var2, boolean var3, boolean var4) {
      double var5 = this.continue_.nextGaussian() * 0.05;
      double var7 = this.continue_.nextGaussian() * 0.05;

      for (int var9 = 0; var9 < 70; var9++) {
         double var10 = this.finally_ * 0.5 + this.continue_.nextGaussian() * 0.15 + var5;
         double var12 = this.native_ * 0.5 + this.continue_.nextGaussian() * 0.15 + var7;
         double var14 = this.extends_ * 0.5 + this.continue_.nextDouble() * 0.5;
         this.class_(this.catch_, this.private_, this.implements_, var10, var14, var12, var1, var2, var3, var4);
      }
   }

   private void class_(double var1, double var3, double var5, double var7, double var9, double var11, int[] var13, int[] var14, boolean var15, boolean var16) {
      Cr_1 var17 = (Cr_1)this.break_.class_(rLQ.goto_, var1, var3, var5, var7, var9, var11);
      var17.class_(var15);
      var17.break_(var16);
      var17.throws_(0.99F);
      int var18 = this.continue_.nextInt(var13.length);
      var17.break_(var13[var18]);
      if (var14.length > 0) {
         var17.byte_(rqR_2.class_(var14, this.continue_));
      }
   }

   private boolean break_() {
      QY var1 = QY.instanceof_();
      return ((Hh_1)var1.class_[16]).finally_().break_().protected_(this.catch_, this.private_, this.implements_) >= 256.0;
   }

   @Override
   public void case_() {
      if (this.class_ == 0 && this.instanceof_ != null) {
         boolean var1 = this.break_();
         boolean var2 = false;
         if (this.instanceof_.size() >= 3) {
            var2 = true;
         } else {
            for (int var3 = 0; var3 < this.instanceof_.size(); var3++) {
               rcd_3 var4 = this.instanceof_.class_(var3);
               if (rxV_2.class_(var4.case_("Type")) == rxV_2.LARGE_BALL) {
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

         this.byte_.class_(this.catch_, this.private_, this.implements_, var17, rqL_2.AMBIENT, 20.0F, 0.95F + this.continue_.nextFloat() * 0.1F, true);
      }

      if (this.class_ % 2 == 0 && this.instanceof_ != null && this.class_ / 2 < this.instanceof_.size()) {
         int var13 = this.class_ / 2;
         rcd_3 var15 = this.instanceof_.class_(var13);
         rxV_2 var18 = rxV_2.class_(var15.case_("Type"));
         boolean var19 = var15.new_("Trail");
         boolean var5 = var15.new_("Flicker");
         int[] var6 = var15.final_("Colors");
         int[] var7 = var15.final_("FadeColors");
         if (var6.length == 0) {
            var6 = new int[]{rxL_2.BLACK.case_()};
         }

         switch (var18) {
            case SMALL_BALL:
            default:
               this.class_(0.25, 2, var6, var7, var19, var5);
               break;
            case LARGE_BALL:
               this.class_(0.5, 4, var6, var7, var19, var5);
               break;
            case STAR:
               this.class_(
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
               this.class_(
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
               this.class_(var6, var7, var19, var5);
         }

         int var8 = var6[0];
         float var9 = (float)((var8 & 0xFF0000) >> 16) / 255.0F;
         float var10 = (float)((var8 & 0xFF00) >> 8) / 255.0F;
         float var11 = (float)((var8 & 0xFF) >> 0) / 255.0F;
         CH var12 = this.break_.class_(rLQ.interface_, this.catch_, this.private_, this.implements_, 0.0, 0.0, 0.0);
         var12.class_(var9, var10, var11);
      }

      this.class_++;
      if (this.class_ > this.this_) {
         if (this.throw_) {
            boolean var14 = this.break_();
            rqA_2 var16 = var14 ? rqn_3.Sx : rqn_3.SJ;
            this.byte_.class_(this.catch_, this.private_, this.implements_, var16, rqL_2.AMBIENT, 20.0F, 0.9F + this.continue_.nextFloat() * 0.15F, true);
         }

         this.finally_();
      }
   }
}
