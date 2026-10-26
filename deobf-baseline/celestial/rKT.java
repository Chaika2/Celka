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
   public static final Codec<rKT> id_protected = RecordCodecBuilder.create(
      var0 -> var0.group(
               rYY.id_class.fieldOf("biome_source").forGetter(var0x -> var0x.id_break),
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.id_return),
               rKW.id_break.fieldOf("settings").forGetter(var0x -> var0x.id_private)
            )
            .apply(var0, var0.stable(rKT::new))
   );
   private static final float[] id_implements = rqR_2.id_class(new float[13824], var0 -> {
      for (int var1 = 0; var1 < 24; var1++) {
         for (int var2 = 0; var2 < 24; var2++) {
            for (int var3 = 0; var3 < 24; var3++) {
               var0[var1 * 24 * 24 + var2 * 24 + var3] = (float)id_break(var2 - 12, var3 - 12, var1 - 12);
            }
         }
      }
   });
   private static final float[] id_finally = rqR_2.id_class(new float[25], var0 -> {
      for (int var1 = -2; var1 <= 2; var1++) {
         for (int var2 = -2; var2 <= 2; var2++) {
            float var3 = 10.0F / rfU_2.id_byte((float)(var1 * var1 + var2 * var2) + 0.2F);
            var0[var1 + 2 + (var2 + 2) * 5] = var3;
         }
      }
   });
   private static final xc_3 id_extends = xu_3.id_class.id_continue();
   private final int id_native;
   private final int id_volatile;
   private final int id_final;
   private final int id_package;
   private final int id_int;
   protected final rqm_3 id_throws;
   private final rKt_1 id_new;
   private final rKt_1 id_continue;
   private final rKt_1 id_super;
   private final rKn_1 id_this;
   private final rKt_1 id_else;
   private final rKI id_synchronized;
   protected final xc_3 id_case;
   protected final xc_3 id_catch;
   private final long id_return;
   protected final Supplier<rKW> id_private;
   private final int id_public;

   private double id_byte(int var1, int var2) {
      double var3 = this.id_else.id_class((double)(var1 * 200), 10.0, (double)(var2 * 200), 1.0, 0.0, true);
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
      super(var1, var2, ((rKW)var5.get()).id_class(), var3);
      this.id_return = var3;
      rKW var6 = (rKW)var5.get();
      this.id_private = var5;
      rrST var7 = var6.id_break();
      this.id_public = var7.id_class();
      this.id_native = var7.id_case() * 4;
      this.id_volatile = var7.id_throws() * 4;
      this.id_case = var6.id_byte();
      this.id_catch = var6.id_protected();
      this.id_final = 16 / this.id_volatile;
      this.id_package = var7.id_class() / this.id_native;
      this.id_int = 16 / this.id_volatile;
      this.id_throws = new rqm_3(var3);
      this.id_new = new rKt_1(this.id_throws, IntStream.rangeClosed(-15, 0));
      this.id_continue = new rKt_1(this.id_throws, IntStream.rangeClosed(-15, 0));
      this.id_super = new rKt_1(this.id_throws, IntStream.rangeClosed(-7, 0));
      this.id_this = (rKn_1)(var7.id_implements()
         ? new rKw_1(this.id_throws, IntStream.rangeClosed(-3, 0))
         : new rKt_1(this.id_throws, IntStream.rangeClosed(-3, 0)));
      this.id_throws.id_class(2620);
      this.id_else = new rKt_1(this.id_throws, IntStream.rangeClosed(-15, 0));
      if (var7.id_extends()) {
         rqm_3 var8 = new rqm_3(var3);
         var8.id_class(17292);
         this.id_synchronized = new rKI(var8);
      } else {
         this.id_synchronized = null;
      }
   }

   @Override
   public void id_class(rKf_1 var1) {
      if (!this.id_private.get().id_private()) {
         int var2 = var1.id_protected();
         int var3 = var1.id_throws();
         rYG var4 = var1.id_implements(new rfj_3(var2, var3).id_finally());
         rqm_3 var5 = new rqm_3();
         var5.id_class(var1.id_break(), var2 << 4, var3 << 4);
         rrEj_1.id_class(var1, var4, var2, var3, var5);
      }
   }

   @Override
   public List<rYf_1> id_class(rYG var1, rrrA var2, aH_2 var3, rfH_2 var4) {
      if (var2.id_class(var4, true, rrrZ.id_finally).id_throws()) {
         if (var3 == aH_2.MONSTER) {
            return rrrZ.id_finally.id_byte();
         }

         if (var3 == aH_2.CREATURE) {
            return rrrZ.id_finally.id_private();
         }
      }

      if (var3 == aH_2.MONSTER) {
         if (var2.id_class(var4, false, rrrZ.id_break).id_throws()) {
            return rrrZ.id_break.id_byte();
         }

         if (var2.id_class(var4, false, rrrZ.id_native).id_throws()) {
            return rrrZ.id_native.id_byte();
         }

         if (var2.id_class(var4, true, rrrZ.id_final).id_throws()) {
            return rrrZ.id_final.id_byte();
         }
      }

      return super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_class(rRg_1 var1, rrrA var2, roC_2 var3) {
      ObjectArrayList var4 = new ObjectArrayList(10);
      ObjectArrayList var5 = new ObjectArrayList(32);
      rfj_3 var6 = var3.id_private();
      int var7 = var6.id_break;
      int var8 = var6.id_byte;
      int var9 = var7 << 4;
      int var10 = var8 << 4;

      for (rrrZ var12 : rrrZ.id_this) {
         var2.id_class(rjh_3.id_class(var6, 0), var12).forEach(var5x -> {
            for (rrrn_1 var7x : var5x.id_protected()) {
               if (var7x.id_class(var6, 12)) {
                  if (var7x instanceof rel_3) {
                     rel_3 var8x = (rel_3)var7x;
                     rem_3 var9x = var8x.id_break().id_byte();
                     if (var9x == rem_3.RIGID) {
                        var4.add(var8x);
                     }

                     for (rek_3 var11 : var8x.id_throws()) {
                        int var12x = var11.id_class();
                        int var13x = var11.id_byte();
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

      double[][][] var75 = new double[2][this.id_int + 1][this.id_package + 1];

      for (int var76 = 0; var76 < this.id_int + 1; var76++) {
         var75[0][var76] = new double[this.id_package + 1];
         this.id_class(var75[0][var76], var7 * this.id_final, var8 * this.id_int + var76);
         var75[1][var76] = new double[this.id_package + 1];
      }

      rok_3 var77 = (rok_3)var3;
      rKZ var13 = var77.id_class(rKv_1.OCEAN_FLOOR_WG);
      rKZ var14 = var77.id_class(rKv_1.WORLD_SURFACE_WG);
      rfw_3 var15 = new rfw_3();
      ObjectListIterator var16 = var4.iterator();
      ObjectListIterator var17 = var5.iterator();

      for (int var18 = 0; var18 < this.id_final; var18++) {
         for (int var19 = 0; var19 < this.id_int + 1; var19++) {
            this.id_class(var75[1][var19], var7 * this.id_final + var18 + 1, var8 * this.id_int + var19);
         }

         for (int var78 = 0; var78 < this.id_int; var78++) {
            roQ_2 var20 = var77.id_class(15);
            var20.id_class();

            for (int var21 = this.id_package - 1; var21 >= 0; var21--) {
               double var22 = var75[0][var78][var21];
               double var24 = var75[0][var78 + 1][var21];
               double var26 = var75[1][var78][var21];
               double var28 = var75[1][var78 + 1][var21];
               double var30 = var75[0][var78][var21 + 1];
               double var32 = var75[0][var78 + 1][var21 + 1];
               double var34 = var75[1][var78][var21 + 1];
               double var36 = var75[1][var78 + 1][var21 + 1];

               for (int var38 = this.id_native - 1; var38 >= 0; var38--) {
                  int var39 = var21 * this.id_native + var38;
                  int var40 = var39 & 15;
                  int var41 = var39 >> 4;
                  if (var20.id_catch() >> 4 != var41) {
                     var20.id_break();
                     var20 = var77.id_class(var41);
                     var20.id_class();
                  }

                  double var42 = (double)var38 / (double)this.id_native;
                  double var44 = rfU_2.id_protected(var42, var22, var30);
                  double var46 = rfU_2.id_protected(var42, var26, var34);
                  double var48 = rfU_2.id_protected(var42, var24, var32);
                  double var50 = rfU_2.id_protected(var42, var28, var36);

                  for (int var52 = 0; var52 < this.id_volatile; var52++) {
                     int var53 = var9 + var18 * this.id_volatile + var52;
                     int var54 = var53 & 15;
                     double var55 = (double)var52 / (double)this.id_volatile;
                     double var57 = rfU_2.id_protected(var55, var44, var46);
                     double var59 = rfU_2.id_protected(var55, var48, var50);

                     for (int var61 = 0; var61 < this.id_volatile; var61++) {
                        int var62 = var10 + var78 * this.id_volatile + var61;
                        int var63 = var62 & 15;
                        double var64 = (double)var61 / (double)this.id_volatile;
                        double var66 = rfU_2.id_protected(var64, var57, var59);
                        double var68 = rfU_2.id_class(var66 / 200.0, -1.0, 1.0);
                        var68 = var68 / 2.0 - var68 * var68 * var68 / 24.0;

                        while (var16.hasNext()) {
                           rrrn_1 var73 = (rrrn_1)var16.next();
                           rfi_3 var74 = var73.id_catch();
                           int var70 = Math.max(0, Math.max(var74.id_class - var53, var53 - var74.id_protected));
                           int var71 = var39 - (var74.id_break + (var73 instanceof rel_3 ? ((rel_3)var73).id_protected() : 0));
                           int var72 = Math.max(0, Math.max(var74.id_byte - var62, var62 - var74.id_case));
                           var68 += id_class(var70, var71, var72) * 0.8;
                        }

                        var16.back(var4.size());

                        while (var17.hasNext()) {
                           rek_3 var83 = (rek_3)var17.next();
                           int var85 = var53 - var83.id_class();
                           int var81 = var39 - var83.id_break();
                           int var82 = var62 - var83.id_byte();
                           var68 += id_class(var85, var81, var82) * 0.4;
                        }

                        var17.back(var5.size());
                        xc_3 var84 = this.id_class(var68, var39);
                        if (var84 != id_extends) {
                           if (var84.id_case() != 0) {
                              var15.id_class(var53, var39, var62);
                              var77.id_implements(var15);
                           }

                           var20.id_class(var54, var40, var63, var84, false);
                           var13.id_class(var54, var39, var63, var84);
                           var14.id_class(var54, var39, var63, var84);
                        }
                     }
                  }
               }
            }

            var20.id_break();
         }

         double[][] var79 = var75[0];
         var75[0] = var75[1];
         var75[1] = var79;
      }
   }

   private static double id_class(int var0, int var1, int var2) {
      int var3 = var0 + 12;
      int var4 = var1 + 12;
      int var5 = var2 + 12;
      if (var3 < 0 || var3 >= 24) {
         return 0.0;
      } else if (var4 >= 0 && var4 < 24) {
         return var5 >= 0 && var5 < 24 ? (double)id_implements[var5 * 24 * 24 + var3 * 24 + var4] : 0.0;
      } else {
         return 0.0;
      }
   }

   @Override
   public rKd_1 id_class(long var1) {
      return new rKT(this.id_break.id_class(var1), var1, this.id_private);
   }

   @Override
   protected Codec<? extends rKd_1> id_class() {
      return id_protected;
   }

   private int id_class(int var1, int var2, xc_3[] var3, Predicate<xc_3> var4) {
      int var5 = Math.floorDiv(var1, this.id_volatile);
      int var6 = Math.floorDiv(var2, this.id_volatile);
      int var7 = Math.floorMod(var1, this.id_volatile);
      int var8 = Math.floorMod(var2, this.id_volatile);
      double var9 = (double)var7 / (double)this.id_volatile;
      double var11 = (double)var8 / (double)this.id_volatile;
      double[][] var13 = new double[][]{
         this.id_break(var5, var6), this.id_break(var5, var6 + 1), this.id_break(var5 + 1, var6), this.id_break(var5 + 1, var6 + 1)
      };

      for (int var14 = this.id_package - 1; var14 >= 0; var14--) {
         double var15 = var13[0][var14];
         double var17 = var13[1][var14];
         double var19 = var13[2][var14];
         double var21 = var13[3][var14];
         double var23 = var13[0][var14 + 1];
         double var25 = var13[1][var14 + 1];
         double var27 = var13[2][var14 + 1];
         double var29 = var13[3][var14 + 1];

         for (int var31 = this.id_native - 1; var31 >= 0; var31--) {
            double var32 = (double)var31 / (double)this.id_native;
            double var34 = rfU_2.id_class(var32, var9, var11, var15, var23, var19, var27, var17, var25, var21, var29);
            int var36 = var14 * this.id_native + var31;
            xc_3 var37 = this.id_class(var34, var36);
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
   public rRq_1 id_class(int var1, int var2) {
      xc_3[] var3 = new xc_3[this.id_package * this.id_native];
      this.id_class(var1, var2, var3, (Predicate<xc_3>)null);
      return new rRE(var3);
   }

   @Override
   public int id_class(int var1, int var2, rKv_1 var3) {
      return this.id_class(var1, var2, (xc_3[])null, var3.id_throws());
   }

   public boolean id_class(long var1, rqM_2<rKW> var3) {
      return this.id_return == var1 && this.id_private.get().id_class(var3);
   }

   private void id_class(double[] var1, int var2, int var3) {
      rrST var4 = this.id_private.get().id_break();
      double var5;
      double var7;
      if (this.id_synchronized != null) {
         var5 = (double)(rYK.id_class(this.id_synchronized, var2, var3) - 8.0F);
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
         int var13 = this.id_case();
         float var14 = this.id_break.id_protected(var2, var13, var3).id_private();

         for (int var15 = -2; var15 <= 2; var15++) {
            for (int var16 = -2; var16 <= 2; var16++) {
               rYG var17 = this.id_break.id_protected(var2 + var15, var13, var3 + var16);
               float var18 = var17.id_private();
               float var19 = var17.id_finally();
               float var20;
               float var21;
               if (var4.id_native() && var18 > 0.0F) {
                  var20 = 1.0F + var18 * 2.0F;
                  var21 = 1.0F + var19 * 4.0F;
               } else {
                  var20 = var18;
                  var21 = var19;
               }

               float var22 = var18 > var14 ? 0.5F : 1.0F;
               float var23 = var22 * id_finally[var15 + 2 + (var16 + 2) * 5] / (var20 + 2.0F);
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

      double var46 = 684.412 * var4.id_break().id_class();
      double var47 = 684.412 * var4.id_break().id_break();
      double var48 = var46 / var4.id_break().id_byte();
      double var50 = var47 / var4.id_break().id_protected();
      double var53 = (double)var4.id_byte().id_class();
      double var55 = (double)var4.id_byte().id_break();
      double var56 = (double)var4.id_byte().id_byte();
      double var57 = (double)var4.id_protected().id_class();
      double var25 = (double)var4.id_protected().id_break();
      double var27 = (double)var4.id_protected().id_byte();
      double var29 = var4.id_finally() ? this.id_byte(var2, var3) : 0.0;
      double var31 = var4.id_catch();
      double var33 = var4.id_private();

      for (int var35 = 0; var35 <= this.id_package; var35++) {
         double var36 = this.id_class(var2, var35, var3, var46, var47, var48, var50);
         double var38 = 1.0 - (double)var35 * 2.0 / (double)this.id_package + var29;
         double var40 = var38 * var31 + var33;
         double var42 = (var40 + var5) * var7;
         if (var42 > 0.0) {
            var36 += var42 * 4.0;
         } else {
            var36 += var42;
         }

         if (var55 > 0.0) {
            double var44 = ((double)(this.id_package - var35) - var56) / var55;
            var36 = rfU_2.id_break(var53, var36, var44);
         }

         if (var25 > 0.0) {
            double var59 = ((double)var35 - var27) / var25;
            var36 = rfU_2.id_break(var57, var36, var59);
         }

         var1[var35] = var36;
      }
   }

   private double id_class(int var1, int var2, int var3, double var4, double var6, double var8, double var10) {
      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = 0.0;
      boolean var18 = true;
      double var19 = 1.0;

      for (int var21 = 0; var21 < 16; var21++) {
         double var22 = rKt_1.id_class((double)var1 * var4 * var19);
         double var24 = rKt_1.id_class((double)var2 * var6 * var19);
         double var26 = rKt_1.id_class((double)var3 * var4 * var19);
         double var28 = var6 * var19;
         rKy_1 var30 = this.id_new.id_class(var21);
         if (var30 != null) {
            var12 += var30.id_class(var22, var24, var26, var28, (double)var2 * var28) / var19;
         }

         rKy_1 var31 = this.id_continue.id_class(var21);
         if (var31 != null) {
            var14 += var31.id_class(var22, var24, var26, var28, (double)var2 * var28) / var19;
         }

         if (var21 < 8) {
            rKy_1 var32 = this.id_super.id_class(var21);
            if (var32 != null) {
               var16 += var32.id_class(
                     rKt_1.id_class((double)var1 * var8 * var19),
                     rKt_1.id_class((double)var2 * var10 * var19),
                     rKt_1.id_class((double)var3 * var8 * var19),
                     var10 * var19,
                     (double)var2 * var10 * var19
                  )
                  / var19;
            }
         }

         var19 /= 2.0;
      }

      return rfU_2.id_break(var12 / 512.0, var14 / 512.0, (var16 / 10.0 + 1.0) / 2.0);
   }

   protected xc_3 id_class(double var1, int var3) {
      xc_3 var4;
      if (var1 > 0.0) {
         var4 = this.id_case;
      } else if (var3 < this.id_case()) {
         var4 = this.id_catch;
      } else {
         var4 = id_extends;
      }

      return var4;
   }

   private void id_class(roC_2 var1, Random var2) {
      rfw_3 var3 = new rfw_3();
      int var4 = var1.id_private().id_break();
      int var5 = var1.id_private().id_byte();
      rKW var6 = this.id_private.get();
      int var7 = var6.id_case();
      int var8 = this.id_public - 1 - var6.id_throws();
      byte var9 = 5;
      boolean var10 = var8 + 4 >= 0 && var8 < this.id_public;
      boolean var11 = var7 + 4 >= 0 && var7 < this.id_public;
      if (var10 || var11) {
         for (rfH_2 var13 : rfH_2.id_break(var4, 0, var5, var4 + 15, 0, var5 + 15)) {
            if (var10) {
               for (int var14 = 0; var14 < 5; var14++) {
                  if (var14 <= var2.nextInt(5)) {
                     var1.id_class(var3.id_class(var13.b_(), var8 - var14, var13.d_()), xu_3.id_while.id_continue(), false);
                  }
               }
            }

            if (var11) {
               for (int var15 = 4; var15 >= 0; var15--) {
                  if (var15 <= var2.nextInt(5)) {
                     var1.id_class(var3.id_class(var13.b_(), var7 + var15, var13.d_()), xu_3.id_while.id_continue(), false);
                  }
               }
            }
         }
      }
   }

   @Override
   public void id_class(rKf_1 var1, roC_2 var2) {
      rfj_3 var3 = var2.id_private();
      int var4 = var3.id_break;
      int var5 = var3.id_byte;
      rqm_3 var6 = new rqm_3();
      var6.id_class(var4, var5);
      rfj_3 var7 = var2.id_private();
      int var8 = var7.id_break();
      int var9 = var7.id_byte();
      double var10 = 0.0625;
      rfw_3 var12 = new rfw_3();

      for (int var13 = 0; var13 < 16; var13++) {
         for (int var14 = 0; var14 < 16; var14++) {
            int var15 = var8 + var13;
            int var16 = var9 + var14;
            int var17 = var2.id_class(rKv_1.WORLD_SURFACE_WG, var13, var14) + 1;
            double var18 = this.id_this.id_class((double)var15 * 0.0625, (double)var16 * 0.0625, 0.0625, (double)var13 * 0.0625) * 15.0;
            var1.id_implements(var12.id_class(var8 + var13, var17, var9 + var14))
               .id_class(var6, var2, var15, var16, var17, var18, this.id_case, this.id_catch, this.id_case(), var1.id_break());
         }
      }

      this.id_class(var2, var6);
   }

   private double[] id_break(int var1, int var2) {
      double[] var3 = new double[this.id_package + 1];
      this.id_class(var3, var1, var2);
      return var3;
   }

   private static double id_break(int var0, int var1, int var2) {
      double var3 = (double)(var0 * var0 + var2 * var2);
      double var5 = (double)var1 + 0.5;
      double var7 = var5 * var5;
      double var9 = Math.pow(Math.E, -(var7 / 16.0 + var3 / 16.0));
      double var11 = -var5 * rfU_2.id_private(var7 / 2.0 + var3 / 2.0) / 2.0;
      return var11 * var9;
   }

   @Override
   public int id_throws() {
      return this.id_public;
   }

   @Override
   public int id_case() {
      return this.id_private.get().id_catch();
   }
}
