package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public final class rKT extends rKd_1 {
   public static final Codec<rKT> protected_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rYY.class_.fieldOf("biome_source").forGetter(var0x -> var0x.break_),
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.return_),
               rKW.break_.fieldOf("settings").forGetter(var0x -> var0x.private_)
            )
            .apply(var0, var0.stable(rKT::new))
   );
   private static final float[] implements_ = rqR_2.class_(new float[13824], var0 -> {
      for (int var1 = 0; var1 < 24; var1++) {
         for (int var2 = 0; var2 < 24; var2++) {
            for (int var3 = 0; var3 < 24; var3++) {
               var0[var1 * 24 * 24 + var2 * 24 + var3] = (float)break_(var2 - 12, var3 - 12, var1 - 12);
            }
         }
      }
   });
   private static final float[] finally_ = rqR_2.class_(new float[25], var0 -> {
      for (int var1 = -2; var1 <= 2; var1++) {
         for (int var2 = -2; var2 <= 2; var2++) {
            float var3 = 10.0F / rfU_2.byte_((float)(var1 * var1 + var2 * var2) + 0.2F);
            var0[var1 + 2 + (var2 + 2) * 5] = var3;
         }
      }
   });
   private static final xc_3 extends_ = xu_3.class_.continue_();
   private final int native_;
   private final int volatile_;
   private final int final_;
   private final int package_;
   private final int int_;
   protected final rqm_3 throws_;
   private final rKt_1 new_;
   private final rKt_1 continue_;
   private final rKt_1 super_;
   private final rKn_1 this_;
   private final rKt_1 else_;
   private final rKI synchronized_;
   protected final xc_3 case_;
   protected final xc_3 catch_;
   private final long return_;
   protected final Supplier<rKW> private_;
   private final int public_;

   private double byte_(int var1, int var2) {
      double var3 = this.else_.class_((double)(var1 * 200), 10.0, (double)(var2 * 200), 1.0, 0.0, true);
      double var5;
      if (var3 < 0.0) {
         var5 = -var3 * 0.3;
      } else {
         var5 = var3;
      }

      double var7 = var5 * 24.575625 - 2.0;
      return var7 < 0.0 ? var7 * 0.009486607142857142 : Math.min(var7, 1.0) * 0.006640625;
   }

   public rKT(rYY var1, long var2, Supplier<rKW> var4) {
      this(var1, var1, var2, var4);
   }

   private rKT(rYY var1, rYY var2, long var3, Supplier<rKW> var5) {
      super(var1, var2, ((rKW)var5.get()).class_(), var3);
      this.return_ = var3;
      rKW var6 = (rKW)var5.get();
      this.private_ = var5;
      rrST var7 = var6.break_();
      this.public_ = var7.class_();
      this.native_ = var7.case_() * 4;
      this.volatile_ = var7.throws_() * 4;
      this.case_ = var6.byte_();
      this.catch_ = var6.protected_();
      this.final_ = 16 / this.volatile_;
      this.package_ = var7.class_() / this.native_;
      this.int_ = 16 / this.volatile_;
      this.throws_ = new rqm_3(var3);
      this.new_ = new rKt_1(this.throws_, IntStream.rangeClosed(-15, 0));
      this.continue_ = new rKt_1(this.throws_, IntStream.rangeClosed(-15, 0));
      this.super_ = new rKt_1(this.throws_, IntStream.rangeClosed(-7, 0));
      this.this_ = (rKn_1)(var7.implements_() ? new rKw_1(this.throws_, IntStream.rangeClosed(-3, 0)) : new rKt_1(this.throws_, IntStream.rangeClosed(-3, 0)));
      this.throws_.class_(2620);
      this.else_ = new rKt_1(this.throws_, IntStream.rangeClosed(-15, 0));
      if (var7.extends_()) {
         rqm_3 var8 = new rqm_3(var3);
         var8.class_(17292);
         this.synchronized_ = new rKI(var8);
      } else {
         this.synchronized_ = null;
      }
   }

   @Override
   public void class_(rKf_1 var1) {
      if (!this.private_.get().private_()) {
         int var2 = var1.protected_();
         int var3 = var1.throws_();
         rYG var4 = var1.implements_(new rfj_3(var2, var3).finally_());
         rqm_3 var5 = new rqm_3();
         var5.class_(var1.break_(), var2 << 4, var3 << 4);
         rrEj_1.class_(var1, var4, var2, var3, var5);
      }
   }

   @Override
   public List<rYf_1> class_(rYG var1, rrrA var2, aH_2 var3, rfH_2 var4) {
      if (var2.class_(var4, true, rrrZ.finally_).throws_()) {
         if (var3 == aH_2.MONSTER) {
            return rrrZ.finally_.byte_();
         }

         if (var3 == aH_2.CREATURE) {
            return rrrZ.finally_.private_();
         }
      }

      if (var3 == aH_2.MONSTER) {
         if (var2.class_(var4, false, rrrZ.break_).throws_()) {
            return rrrZ.break_.byte_();
         }

         if (var2.class_(var4, false, rrrZ.native_).throws_()) {
            return rrrZ.native_.byte_();
         }

         if (var2.class_(var4, true, rrrZ.final_).throws_()) {
            return rrrZ.final_.byte_();
         }
      }

      return super.class_(var1, var2, var3, var4);
   }

   @Override
   public void class_(rRg_1 var1, rrrA var2, roC_2 var3) {
      ObjectArrayList var4 = new ObjectArrayList(10);
      ObjectArrayList var5 = new ObjectArrayList(32);
      rfj_3 var6 = var3.private_();
      int var7 = var6.break_;
      int var8 = var6.byte_;
      int var9 = var7 << 4;
      int var10 = var8 << 4;

      for (rrrZ var12 : rrrZ.this_) {
         var2.class_(rjh_3.class_(var6, 0), var12).forEach(var5x -> {
            for (rrrn_1 var7x : var5x.protected_()) {
               if (var7x.class_(var6, 12)) {
                  if (var7x instanceof rel_3) {
                     rel_3 var8x = (rel_3)var7x;
                     rem_3 var9x = var8x.break_().byte_();
                     if (var9x == rem_3.RIGID) {
                        var4.add(var8x);
                     }

                     for (rek_3 var11 : var8x.throws_()) {
                        int var12x = var11.class_();
                        int var13x = var11.byte_();
                        if (var12x > var9 - 12 && var13x > var10 - 12 && var12x < var9 + 15 + 12 && var13x < var10 + 15 + 12) {
                           var5.add(var11);
                        }
                     }
                  } else {
                     var4.add(var7x);
                  }
               }
            }
         });
      }

      double[][][] var75 = new double[2][this.int_ + 1][this.package_ + 1];

      for (int var76 = 0; var76 < this.int_ + 1; var76++) {
         var75[0][var76] = new double[this.package_ + 1];
         this.class_(var75[0][var76], var7 * this.final_, var8 * this.int_ + var76);
         var75[1][var76] = new double[this.package_ + 1];
      }

      rok_3 var77 = (rok_3)var3;
      rKZ var13 = var77.class_(rKv_1.OCEAN_FLOOR_WG);
      rKZ var14 = var77.class_(rKv_1.WORLD_SURFACE_WG);
      rfw_3 var15 = new rfw_3();
      ObjectListIterator var16 = var4.iterator();
      ObjectListIterator var17 = var5.iterator();

      for (int var18 = 0; var18 < this.final_; var18++) {
         for (int var19 = 0; var19 < this.int_ + 1; var19++) {
            this.class_(var75[1][var19], var7 * this.final_ + var18 + 1, var8 * this.int_ + var19);
         }

         for (int var78 = 0; var78 < this.int_; var78++) {
            roQ_2 var20 = var77.class_(15);
            var20.class_();

            for (int var21 = this.package_ - 1; var21 >= 0; var21--) {
               double var22 = var75[0][var78][var21];
               double var24 = var75[0][var78 + 1][var21];
               double var26 = var75[1][var78][var21];
               double var28 = var75[1][var78 + 1][var21];
               double var30 = var75[0][var78][var21 + 1];
               double var32 = var75[0][var78 + 1][var21 + 1];
               double var34 = var75[1][var78][var21 + 1];
               double var36 = var75[1][var78 + 1][var21 + 1];

               for (int var38 = this.native_ - 1; var38 >= 0; var38--) {
                  int var39 = var21 * this.native_ + var38;
                  int var40 = var39 & 15;
                  int var41 = var39 >> 4;
                  if (var20.catch_() >> 4 != var41) {
                     var20.break_();
                     var20 = var77.class_(var41);
                     var20.class_();
                  }

                  double var42 = (double)var38 / (double)this.native_;
                  double var44 = rfU_2.protected_(var42, var22, var30);
                  double var46 = rfU_2.protected_(var42, var26, var34);
                  double var48 = rfU_2.protected_(var42, var24, var32);
                  double var50 = rfU_2.protected_(var42, var28, var36);

                  for (int var52 = 0; var52 < this.volatile_; var52++) {
                     int var53 = var9 + var18 * this.volatile_ + var52;
                     int var54 = var53 & 15;
                     double var55 = (double)var52 / (double)this.volatile_;
                     double var57 = rfU_2.protected_(var55, var44, var46);
                     double var59 = rfU_2.protected_(var55, var48, var50);

                     for (int var61 = 0; var61 < this.volatile_; var61++) {
                        int var62 = var10 + var78 * this.volatile_ + var61;
                        int var63 = var62 & 15;
                        double var64 = (double)var61 / (double)this.volatile_;
                        double var66 = rfU_2.protected_(var64, var57, var59);
                        double var68 = rfU_2.class_(var66 / 200.0, -1.0, 1.0);
                        var68 = var68 / 2.0 - var68 * var68 * var68 / 24.0;

                        while (var16.hasNext()) {
                           rrrn_1 var73 = (rrrn_1)var16.next();
                           rfi_3 var74 = var73.catch_();
                           int var70 = Math.max(0, Math.max(var74.class_ - var53, var53 - var74.protected_));
                           int var71 = var39 - (var74.break_ + (var73 instanceof rel_3 ? ((rel_3)var73).protected_() : 0));
                           int var72 = Math.max(0, Math.max(var74.byte_ - var62, var62 - var74.case_));
                           var68 += class_(var70, var71, var72) * 0.8;
                        }

                        var16.back(var4.size());

                        while (var17.hasNext()) {
                           rek_3 var83 = (rek_3)var17.next();
                           int var85 = var53 - var83.class_();
                           int var81 = var39 - var83.break_();
                           int var82 = var62 - var83.byte_();
                           var68 += class_(var85, var81, var82) * 0.4;
                        }

                        var17.back(var5.size());
                        xc_3 var84 = this.class_(var68, var39);
                        if (var84 != extends_) {
                           if (var84.case_() != 0) {
                              var15.class_(var53, var39, var62);
                              var77.implements_(var15);
                           }

                           var20.class_(var54, var40, var63, var84, false);
                           var13.class_(var54, var39, var63, var84);
                           var14.class_(var54, var39, var63, var84);
                        }
                     }
                  }
               }
            }

            var20.break_();
         }

         double[][] var79 = var75[0];
         var75[0] = var75[1];
         var75[1] = var79;
      }
   }

   private static double class_(int var0, int var1, int var2) {
      int var3 = var0 + 12;
      int var4 = var1 + 12;
      int var5 = var2 + 12;
      if (var3 < 0 || var3 >= 24) {
         return 0.0;
      } else if (var4 >= 0 && var4 < 24) {
         return var5 >= 0 && var5 < 24 ? (double)implements_[var5 * 24 * 24 + var3 * 24 + var4] : 0.0;
      } else {
         return 0.0;
      }
   }

   @Override
   public rKd_1 class_(long var1) {
      return new rKT(this.break_.class_(var1), var1, this.private_);
   }

   @Override
   protected Codec<? extends rKd_1> class_() {
      return protected_;
   }

   private int class_(int var1, int var2, xc_3[] var3, Predicate<xc_3> var4) {
      int var5 = Math.floorDiv(var1, this.volatile_);
      int var6 = Math.floorDiv(var2, this.volatile_);
      int var7 = Math.floorMod(var1, this.volatile_);
      int var8 = Math.floorMod(var2, this.volatile_);
      double var9 = (double)var7 / (double)this.volatile_;
      double var11 = (double)var8 / (double)this.volatile_;
      double[][] var13 = new double[][]{this.break_(var5, var6), this.break_(var5, var6 + 1), this.break_(var5 + 1, var6), this.break_(var5 + 1, var6 + 1)};

      for (int var14 = this.package_ - 1; var14 >= 0; var14--) {
         double var15 = var13[0][var14];
         double var17 = var13[1][var14];
         double var19 = var13[2][var14];
         double var21 = var13[3][var14];
         double var23 = var13[0][var14 + 1];
         double var25 = var13[1][var14 + 1];
         double var27 = var13[2][var14 + 1];
         double var29 = var13[3][var14 + 1];

         for (int var31 = this.native_ - 1; var31 >= 0; var31--) {
            double var32 = (double)var31 / (double)this.native_;
            double var34 = rfU_2.class_(var32, var9, var11, var15, var23, var19, var27, var17, var25, var21, var29);
            int var36 = var14 * this.native_ + var31;
            xc_3 var37 = this.class_(var34, var36);
            if (var3 != null) {
               var3[var36] = var37;
            }

            if (var4 != null && var4.test(var37)) {
               return var36 + 1;
            }
         }
      }

      return 0;
   }

   @Override
   public rRq_1 class_(int var1, int var2) {
      xc_3[] var3 = new xc_3[this.package_ * this.native_];
      this.class_(var1, var2, var3, (Predicate<xc_3>)null);
      return new rRE(var3);
   }

   @Override
   public int class_(int var1, int var2, rKv_1 var3) {
      return this.class_(var1, var2, (xc_3[])null, var3.throws_());
   }

   public boolean class_(long var1, rqM_2<rKW> var3) {
      return this.return_ == var1 && this.private_.get().class_(var3);
   }

   private void class_(double[] var1, int var2, int var3) {
      rrST var4 = this.private_.get().break_();
      double var5;
      double var7;
      if (this.synchronized_ != null) {
         var5 = (double)(rYK.class_(this.synchronized_, var2, var3) - 8.0F);
         if (var5 > 0.0) {
            var7 = 0.25;
         } else {
            var7 = 1.0;
         }
      } else {
         float var9 = 0.0F;
         float var10 = 0.0F;
         float var11 = 0.0F;
         byte var12 = 2;
         int var13 = this.case_();
         float var14 = this.break_.protected_(var2, var13, var3).private_();

         for (int var15 = -2; var15 <= 2; var15++) {
            for (int var16 = -2; var16 <= 2; var16++) {
               rYG var17 = this.break_.protected_(var2 + var15, var13, var3 + var16);
               float var18 = var17.private_();
               float var19 = var17.finally_();
               float var20;
               float var21;
               if (var4.native_() && var18 > 0.0F) {
                  var20 = 1.0F + var18 * 2.0F;
                  var21 = 1.0F + var19 * 4.0F;
               } else {
                  var20 = var18;
                  var21 = var19;
               }

               float var22 = var18 > var14 ? 0.5F : 1.0F;
               float var23 = var22 * finally_[var15 + 2 + (var16 + 2) * 5] / (var20 + 2.0F);
               var9 += var21 * var23;
               var10 += var20 * var23;
               var11 += var23;
            }
         }

         float var49 = var10 / var11;
         float var51 = var9 / var11;
         double var52 = (double)(var49 * 0.5F - 0.125F);
         double var54 = (double)(var51 * 0.9F + 0.1F);
         var5 = var52 * 0.265625;
         var7 = 96.0 / var54;
      }

      double var46 = 684.412 * var4.break_().class_();
      double var47 = 684.412 * var4.break_().break_();
      double var48 = var46 / var4.break_().byte_();
      double var50 = var47 / var4.break_().protected_();
      double var53 = (double)var4.byte_().class_();
      double var55 = (double)var4.byte_().break_();
      double var56 = (double)var4.byte_().byte_();
      double var57 = (double)var4.protected_().class_();
      double var25 = (double)var4.protected_().break_();
      double var27 = (double)var4.protected_().byte_();
      double var29 = var4.finally_() ? this.byte_(var2, var3) : 0.0;
      double var31 = var4.catch_();
      double var33 = var4.private_();

      for (int var35 = 0; var35 <= this.package_; var35++) {
         double var36 = this.class_(var2, var35, var3, var46, var47, var48, var50);
         double var38 = 1.0 - (double)var35 * 2.0 / (double)this.package_ + var29;
         double var40 = var38 * var31 + var33;
         double var42 = (var40 + var5) * var7;
         if (var42 > 0.0) {
            var36 += var42 * 4.0;
         } else {
            var36 += var42;
         }

         if (var55 > 0.0) {
            double var44 = ((double)(this.package_ - var35) - var56) / var55;
            var36 = rfU_2.break_(var53, var36, var44);
         }

         if (var25 > 0.0) {
            double var59 = ((double)var35 - var27) / var25;
            var36 = rfU_2.break_(var57, var36, var59);
         }

         var1[var35] = var36;
      }
   }

   private double class_(int var1, int var2, int var3, double var4, double var6, double var8, double var10) {
      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = 0.0;
      boolean var18 = true;
      double var19 = 1.0;

      for (int var21 = 0; var21 < 16; var21++) {
         double var22 = rKt_1.class_((double)var1 * var4 * var19);
         double var24 = rKt_1.class_((double)var2 * var6 * var19);
         double var26 = rKt_1.class_((double)var3 * var4 * var19);
         double var28 = var6 * var19;
         rKy_1 var30 = this.new_.class_(var21);
         if (var30 != null) {
            var12 += var30.class_(var22, var24, var26, var28, (double)var2 * var28) / var19;
         }

         rKy_1 var31 = this.continue_.class_(var21);
         if (var31 != null) {
            var14 += var31.class_(var22, var24, var26, var28, (double)var2 * var28) / var19;
         }

         if (var21 < 8) {
            rKy_1 var32 = this.super_.class_(var21);
            if (var32 != null) {
               var16 += var32.class_(
                     rKt_1.class_((double)var1 * var8 * var19),
                     rKt_1.class_((double)var2 * var10 * var19),
                     rKt_1.class_((double)var3 * var8 * var19),
                     var10 * var19,
                     (double)var2 * var10 * var19
                  )
                  / var19;
            }
         }

         var19 /= 2.0;
      }

      return rfU_2.break_(var12 / 512.0, var14 / 512.0, (var16 / 10.0 + 1.0) / 2.0);
   }

   protected xc_3 class_(double var1, int var3) {
      xc_3 var4;
      if (var1 > 0.0) {
         var4 = this.case_;
      } else if (var3 < this.case_()) {
         var4 = this.catch_;
      } else {
         var4 = extends_;
      }

      return var4;
   }

   private void class_(roC_2 var1, Random var2) {
      rfw_3 var3 = new rfw_3();
      int var4 = var1.private_().break_();
      int var5 = var1.private_().byte_();
      rKW var6 = this.private_.get();
      int var7 = var6.case_();
      int var8 = this.public_ - 1 - var6.throws_();
      byte var9 = 5;
      boolean var10 = var8 + 4 >= 0 && var8 < this.public_;
      boolean var11 = var7 + 4 >= 0 && var7 < this.public_;
      if (var10 || var11) {
         for (rfH_2 var13 : rfH_2.break_(var4, 0, var5, var4 + 15, 0, var5 + 15)) {
            if (var10) {
               for (int var14 = 0; var14 < 5; var14++) {
                  if (var14 <= var2.nextInt(5)) {
                     var1.class_(var3.class_(var13.b_(), var8 - var14, var13.d_()), xu_3.while_.continue_(), false);
                  }
               }
            }

            if (var11) {
               for (int var15 = 4; var15 >= 0; var15--) {
                  if (var15 <= var2.nextInt(5)) {
                     var1.class_(var3.class_(var13.b_(), var7 + var15, var13.d_()), xu_3.while_.continue_(), false);
                  }
               }
            }
         }
      }
   }

   @Override
   public void class_(rKf_1 var1, roC_2 var2) {
      rfj_3 var3 = var2.private_();
      int var4 = var3.break_;
      int var5 = var3.byte_;
      rqm_3 var6 = new rqm_3();
      var6.class_(var4, var5);
      rfj_3 var7 = var2.private_();
      int var8 = var7.break_();
      int var9 = var7.byte_();
      double var10 = 0.0625;
      rfw_3 var12 = new rfw_3();

      for (int var13 = 0; var13 < 16; var13++) {
         for (int var14 = 0; var14 < 16; var14++) {
            int var15 = var8 + var13;
            int var16 = var9 + var14;
            int var17 = var2.class_(rKv_1.WORLD_SURFACE_WG, var13, var14) + 1;
            double var18 = this.this_.class_((double)var15 * 0.0625, (double)var16 * 0.0625, 0.0625, (double)var13 * 0.0625) * 15.0;
            var1.implements_(var12.class_(var8 + var13, var17, var9 + var14))
               .class_(var6, var2, var15, var16, var17, var18, this.case_, this.catch_, this.case_(), var1.break_());
         }
      }

      this.class_(var2, var6);
   }

   private double[] break_(int var1, int var2) {
      double[] var3 = new double[this.package_ + 1];
      this.class_(var3, var1, var2);
      return var3;
   }

   private static double break_(int var0, int var1, int var2) {
      double var3 = (double)(var0 * var0 + var2 * var2);
      double var5 = (double)var1 + 0.5;
      double var7 = var5 * var5;
      double var9 = Math.pow(Math.E, -(var7 / 16.0 + var3 / 16.0));
      double var11 = -var5 * rfU_2.private_(var7 / 2.0 + var3 / 2.0) / 2.0;
      return var11 * var9;
   }

   @Override
   public int throws_() {
      return this.public_;
   }

   @Override
   public int case_() {
      return this.private_.get().catch_();
   }
}
