package celestial;

public class Hs_1 {
   private final fj_3[] id_class = new fj_3[2];
   private final fj_3[] id_break = new fj_3[2];
   private fj_3 id_byte;

   private void id_class(Ok_1 var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11, float var12, int var13) {
      var1.id_class(var2, var4, var6).id_class(var8, var9, var10, 1.0F).id_class(var11, var12).id_break(var13).id_class(0.0F, 1.0F, 0.0F).id_class();
   }

   public boolean id_class(rRp_1 var1, rfH_2 var2, Ok_1 var3, rXE var4) {
      xc_3 var5 = var4.id_catch();

      boolean var6;
      try {
         if (rrbb_3.rs()) {
            rrdk_1.id_class(var5, var3);
         }

         boolean var7 = var4.id_class(rlG_2.id_byte);
         fj_3[] var8 = var7 ? this.id_class : this.id_break;
         xc_3 var9 = var1.id_byte(var2);
         if (rrxr_3.rc.id_byte()) {
            fj_3[] var10 = (fj_3[])rrxr_3.id_private(rrxr_3.rc, var1, var2, var4);
            if (var10 != null) {
               var8 = var10;
            }
         }

         rrxF_2 var72 = var3.id_class(var5, var2);
         int var11 = -1;
         float var12 = 1.0F;
         if (rrxr_3.L.id_byte()) {
            Object var13 = rrxr_3.id_private(var4.id_class(), rrxr_3.L);
            if (var13 != null && rrxr_3.T.id_byte()) {
               var11 = rrxr_3.id_byte(var13, rrxr_3.T, var1, var2);
               var12 = (float)(var11 >> 24 & 0xFF) / 255.0F;
            }
         }

         boolean var73 = !id_class(var1, var2, rpr_3.UP, var4);
         boolean var14 = id_class(var1, var2, var4, var9, rpr_3.DOWN) && !id_class(var1, var2, rpr_3.DOWN, 0.8888889F);
         boolean var15 = id_class(var1, var2, var4, var9, rpr_3.NORTH);
         boolean var16 = id_class(var1, var2, var4, var9, rpr_3.SOUTH);
         boolean var17 = id_class(var1, var2, var4, var9, rpr_3.WEST);
         boolean var18 = id_class(var1, var2, var4, var9, rpr_3.EAST);
         if (var73 || var14 || var18 || var17 || var15 || var16) {
            if (var11 < 0) {
               var11 = rrbN_2.id_class(var1, var5, var2, var72);
            }

            float var19 = (float)(var11 >> 16 & 0xFF) / 255.0F;
            float var20 = (float)(var11 >> 8 & 0xFF) / 255.0F;
            float var21 = (float)(var11 & 0xFF) / 255.0F;
            var6 = false;
            float var22 = var1.id_class(rpr_3.DOWN, true);
            float var23 = var1.id_class(rpr_3.UP, true);
            float var24 = var1.id_class(rpr_3.NORTH, true);
            float var25 = var1.id_class(rpr_3.WEST, true);
            float var26 = this.id_class(var1, var2, var4.id_class());
            float var27 = this.id_class(var1, var2.id_protected(), var4.id_class());
            float var28 = this.id_class(var1, var2.id_extends().id_protected(), var4.id_class());
            float var29 = this.id_class(var1, var2.id_extends(), var4.id_class());
            double var30 = (double)(var2.b_() & 15);
            double var32 = (double)(var2.c_() & 15);
            double var34 = (double)(var2.d_() & 15);
            if (rrbb_3.ry()) {
               int var36 = var2.b_() >> 4 << 4;
               int var37 = var2.c_() >> 4 << 4;
               int var38 = var2.d_() >> 4 << 4;
               byte var39 = 8;
               int var40 = var36 >> var39 << var39;
               int var41 = var38 >> var39 << var39;
               int var42 = var36 - var40;
               int var43 = var38 - var41;
               var30 += (double)var42;
               var32 += (double)var37;
               var34 += (double)var43;
            }

            if (rrbb_3.rs() && rrdZ.q) {
               var3.id_byte((float)(var30 + 0.5), (float)(var32 + 0.5), (float)(var34 + 0.5));
            }

            float var74 = 0.001F;
            float var75 = var14 ? 0.001F : 0.0F;
            if (var73 && !id_class(var1, var2, rpr_3.UP, Math.min(Math.min(var26, var27), Math.min(var28, var29)))) {
               var6 = true;
               var26 -= 0.001F;
               var27 -= 0.001F;
               var28 -= 0.001F;
               var29 -= 0.001F;
               rjU_2 var76 = var4.id_byte(var1, var2);
               float var44;
               float var45;
               float var46;
               float var80;
               float var84;
               float var88;
               float var92;
               float var95;
               if (var76.id_break == 0.0 && var76.id_protected == 0.0) {
                  fj_3 var106 = var8[0];
                  var3.id_break(var106);
                  var92 = var106.id_class(0.0);
                  var80 = var106.id_break(0.0);
                  var95 = var92;
                  var46 = var106.id_break(16.0);
                  var44 = var106.id_class(16.0);
                  var84 = var46;
                  var45 = var44;
                  var88 = var80;
               } else {
                  fj_3 var47 = var8[1];
                  var3.id_break(var47);
                  float var48 = (float)rfU_2.id_protected(var76.id_protected, var76.id_break) - (float) (Math.PI / 2);
                  float var49 = rfU_2.id_class(var48) * 0.25F;
                  float var50 = rfU_2.id_break(var48) * 0.25F;
                  float var51 = 8.0F;
                  var92 = var47.id_class((double)(8.0F + (-var50 - var49) * 16.0F));
                  var80 = var47.id_break((double)(8.0F + (-var50 + var49) * 16.0F));
                  var95 = var47.id_class((double)(8.0F + (-var50 + var49) * 16.0F));
                  var46 = var47.id_break((double)(8.0F + (var50 + var49) * 16.0F));
                  var44 = var47.id_class((double)(8.0F + (var50 + var49) * 16.0F));
                  var84 = var47.id_break((double)(8.0F + (var50 - var49) * 16.0F));
                  var45 = var47.id_class((double)(8.0F + (var50 - var49) * 16.0F));
                  var88 = var47.id_break((double)(8.0F + (-var50 - var49) * 16.0F));
               }

               float var107 = (var92 + var95 + var44 + var45) / 4.0F;
               float var109 = (var80 + var46 + var84 + var88) / 4.0F;
               float var110 = (float)var8[0].id_protected() / (var8[0].id_catch() - var8[0].id_case());
               float var112 = (float)var8[0].id_throws() / (var8[0].id_implements() - var8[0].id_private());
               float var114 = 4.0F / Math.max(var112, var110);
               var92 = rfU_2.id_catch(var114, var92, var107);
               var95 = rfU_2.id_catch(var114, var95, var107);
               var44 = rfU_2.id_catch(var114, var44, var107);
               var45 = rfU_2.id_catch(var114, var45, var107);
               var80 = rfU_2.id_catch(var114, var80, var109);
               var46 = rfU_2.id_catch(var114, var46, var109);
               var84 = rfU_2.id_catch(var114, var84, var109);
               var88 = rfU_2.id_catch(var114, var88, var109);
               int var52 = this.id_class(var1, var2);
               float var53 = var23 * var19;
               float var54 = var23 * var20;
               float var55 = var23 * var21;
               this.id_class(var3, var30 + 0.0, var32 + (double)var26, var34 + 0.0, var53, var54, var55, var12, var92, var80, var52);
               this.id_class(var3, var30 + 0.0, var32 + (double)var27, var34 + 1.0, var53, var54, var55, var12, var95, var46, var52);
               this.id_class(var3, var30 + 1.0, var32 + (double)var28, var34 + 1.0, var53, var54, var55, var12, var44, var84, var52);
               this.id_class(var3, var30 + 1.0, var32 + (double)var29, var34 + 0.0, var53, var54, var55, var12, var45, var88, var52);
               if (var4.id_break(var1, var2.id_final())) {
                  this.id_class(var3, var30 + 0.0, var32 + (double)var26, var34 + 0.0, var53, var54, var55, var12, var92, var80, var52);
                  this.id_class(var3, var30 + 1.0, var32 + (double)var29, var34 + 0.0, var53, var54, var55, var12, var45, var88, var52);
                  this.id_class(var3, var30 + 1.0, var32 + (double)var28, var34 + 1.0, var53, var54, var55, var12, var44, var84, var52);
                  this.id_class(var3, var30 + 0.0, var32 + (double)var27, var34 + 1.0, var53, var54, var55, var12, var95, var46, var52);
               }
            }

            if (var14) {
               var3.id_break(var8[0]);
               float var77 = var8[0].id_case();
               float var82 = var8[0].id_catch();
               float var86 = var8[0].id_private();
               float var90 = var8[0].id_implements();
               int var94 = this.id_class(var1, var2.id_break());
               float var97 = var1.id_class(rpr_3.DOWN, true);
               float var100 = var97 * var19;
               float var102 = var97 * var20;
               float var105 = var97 * var21;
               this.id_class(var3, var30, var32 + (double)var75, var34 + 1.0, var100, var102, var105, var12, var77, var90, var94);
               this.id_class(var3, var30, var32 + (double)var75, var34, var100, var102, var105, var12, var77, var86, var94);
               this.id_class(var3, var30 + 1.0, var32 + (double)var75, var34, var100, var102, var105, var12, var82, var86, var94);
               this.id_class(var3, var30 + 1.0, var32 + (double)var75, var34 + 1.0, var100, var102, var105, var12, var82, var90, var94);
               var6 = true;
            }

            for (int var78 = 0; var78 < 4; var78++) {
               float var83;
               float var87;
               double var91;
               double var98;
               double var103;
               double var108;
               rpr_3 var111;
               boolean var113;
               if (var78 == 0) {
                  var83 = var26;
                  var87 = var29;
                  var91 = var30;
                  var103 = var30 + 1.0;
                  var98 = var34 + 0.001F;
                  var108 = var34 + 0.001F;
                  var111 = rpr_3.NORTH;
                  var113 = var15;
               } else if (var78 == 1) {
                  var83 = var28;
                  var87 = var27;
                  var91 = var30 + 1.0;
                  var103 = var30;
                  var98 = var34 + 1.0 - 0.001F;
                  var108 = var34 + 1.0 - 0.001F;
                  var111 = rpr_3.SOUTH;
                  var113 = var16;
               } else if (var78 == 2) {
                  var83 = var27;
                  var87 = var26;
                  var91 = var30 + 0.001F;
                  var103 = var30 + 0.001F;
                  var98 = var34 + 1.0;
                  var108 = var34;
                  var111 = rpr_3.WEST;
                  var113 = var17;
               } else {
                  var83 = var29;
                  var87 = var28;
                  var91 = var30 + 1.0 - 0.001F;
                  var103 = var30 + 1.0 - 0.001F;
                  var98 = var34;
                  var108 = var34 + 1.0;
                  var111 = rpr_3.EAST;
                  var113 = var18;
               }

               if (var113 && !id_class(var1, var2, var111, Math.max(var83, var87))) {
                  var6 = true;
                  rfH_2 var115 = var2.id_break(var111);
                  fj_3 var116 = var8[1];
                  float var117 = 0.0F;
                  float var119 = 0.0F;
                  boolean var121 = !var7;
                  if (rrxr_3.v.id_byte()) {
                     var121 = var8[2] != null;
                  }

                  if (var121) {
                     xc_3 var56 = var1.id_byte(var115);
                     xd_3 var57 = var56.id_break();
                     boolean var58 = false;
                     if (rrxr_3.v.id_byte()) {
                        var58 = rrxr_3.id_break(var56, rrxr_3.v, var1, var115, var4);
                     }

                     if (var58 || var57 instanceof xm_3 || var57 instanceof kZ_2 || var57 == xu_3.Sv) {
                        var116 = this.id_byte;
                     }

                     if (var57 == xu_3.PS || var57 == xu_3.bt) {
                        var117 = 0.9375F;
                        var119 = 0.9375F;
                     }

                     if (var57 instanceof Wg_1 var59 && var56.id_byte(Wg_1.id_volatile) == rCo_1.BOTTOM) {
                        var117 = 0.5F;
                        var119 = 0.5F;
                     }
                  }

                  var3.id_break(var116);
                  if (!(var83 <= var117) || !(var87 <= var119)) {
                     var117 = Math.min(var117, var83);
                     var119 = Math.min(var119, var87);
                     if (var117 > var74) {
                        var117 -= var74;
                     }

                     if (var119 > var74) {
                        var119 -= var74;
                     }

                     float var122 = var116.id_break((double)((1.0F - var117) * 16.0F * 0.5F));
                     float var123 = var116.id_break((double)((1.0F - var119) * 16.0F * 0.5F));
                     float var124 = var116.id_class(0.0);
                     float var125 = var116.id_class(8.0);
                     float var60 = var116.id_break((double)((1.0F - var83) * 16.0F * 0.5F));
                     float var61 = var116.id_break((double)((1.0F - var87) * 16.0F * 0.5F));
                     float var62 = var116.id_break(8.0);
                     int var63 = this.id_class(var1, var115);
                     float var64 = var78 < 2 ? var1.id_class(rpr_3.NORTH, true) : var1.id_class(rpr_3.WEST, true);
                     float var65 = 1.0F * var64 * var19;
                     float var66 = 1.0F * var64 * var20;
                     float var67 = 1.0F * var64 * var21;
                     this.id_class(var3, var91, var32 + (double)var83, var98, var65, var66, var67, var12, var124, var60, var63);
                     this.id_class(var3, var103, var32 + (double)var87, var108, var65, var66, var67, var12, var125, var61, var63);
                     this.id_class(var3, var103, var32 + (double)var75, var108, var65, var66, var67, var12, var125, var123, var63);
                     this.id_class(var3, var91, var32 + (double)var75, var98, var65, var66, var67, var12, var124, var122, var63);
                     if (var116 != this.id_byte) {
                        this.id_class(var3, var91, var32 + (double)var75, var98, var65, var66, var67, var12, var124, var122, var63);
                        this.id_class(var3, var103, var32 + (double)var75, var108, var65, var66, var67, var12, var125, var123, var63);
                        this.id_class(var3, var103, var32 + (double)var87, var108, var65, var66, var67, var12, var125, var61, var63);
                        this.id_class(var3, var91, var32 + (double)var83, var98, var65, var66, var67, var12, var124, var60, var63);
                     }
                  }
               }
            }

            var3.id_break((fj_3)null);
            return var6;
         }

         var6 = false;
      } finally {
         if (rrbb_3.rs()) {
            rrdk_1.id_class(var3);
         }
      }

      return var6;
   }

   public static boolean id_class(rRp_1 var0, rfH_2 var1, rXE var2, xc_3 var3, rpr_3 var4) {
      return !id_class(var0, var1, var3, var4) && !id_class(var0, var1, var4, var2);
   }

   private void id_class(
      Ok_1 var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11, float var12, float var13, int var14
   ) {
      var1.id_class(var2, var4, var6).id_class(var8, var9, var10, var11).id_class(var12, var13).id_break(var14).id_class(0.0F, 1.0F, 0.0F).id_class();
   }

   private int id_class(rRp_1 var1, rfH_2 var2) {
      int var3 = yX_2.id_class(var1, var2);
      int var4 = yX_2.id_class(var1, var2.id_final());
      int var5 = var3 & 0xFF;
      int var6 = var4 & 0xFF;
      int var7 = var3 >> 16 & 0xFF;
      int var8 = var4 >> 16 & 0xFF;
      return (var5 > var6 ? var5 : var6) | (var7 > var8 ? var7 : var8) << 16;
   }

   private float id_class(rRq_1 var1, rfH_2 var2, rXs_1 var3) {
      int var4 = 0;
      float var5 = 0.0F;

      for (int var6 = 0; var6 < 4; var6++) {
         rfH_2 var7 = var2.id_break(-(var6 & 1), 0, -(var6 >> 1 & 1));
         if (var1.id_break(var7.id_final()).id_class().id_class(var3)) {
            return 1.0F;
         }

         rXE var8 = var1.id_break(var7);
         if (var8.id_class().id_class(var3)) {
            float var9 = var8.id_class(var1, var7);
            if (var9 >= 0.8F) {
               var5 += var9 * 10.0F;
               var4 += 10;
            } else {
               var5 += var9;
               var4++;
            }
         } else if (!var1.id_byte(var7).id_byte().id_break()) {
            var4++;
         }
      }

      return var5 / (float)var4;
   }

   protected void id_class() {
      this.id_class[0] = QY.id_instanceof().id_extends().id_byte().id_break(xu_3.id_instanceof.id_continue()).id_throws();
      this.id_class[1] = IC.id_byte.id_byte();
      this.id_break[0] = QY.id_instanceof().id_extends().id_byte().id_break(xu_3.id_try.id_continue()).id_throws();
      this.id_break[1] = IC.id_protected.id_byte();
      this.id_byte = IC.id_throws.id_byte();
   }

   private static boolean id_class(rRq_1 var0, rfH_2 var1, rpr_3 var2, rXE var3) {
      rfH_2 var4 = var1.id_break(var2);
      rXE var5 = var0.id_break(var4);
      return var5.id_class().id_class(var3.id_class());
   }

   private static boolean id_class(rRq_1 var0, rpr_3 var1, float var2, rfH_2 var3, xc_3 var4) {
      if (var4.id_native()) {
         rjC_2 var5 = rjw_3.id_class(0.0, 0.0, 0.0, 1.0, (double)var2, 1.0);
         rjC_2 var6 = var4.id_byte(var0, var3);
         return rjw_3.id_class(var5, var6, var1);
      } else {
         return false;
      }
   }

   private static boolean id_class(rRq_1 var0, rfH_2 var1, rpr_3 var2, float var3) {
      rfH_2 var4 = var1.id_break(var2);
      xc_3 var5 = var0.id_byte(var4);
      return id_class(var0, var2, var3, var4, var5);
   }

   private static boolean id_class(rRq_1 var0, rfH_2 var1, xc_3 var2, rpr_3 var3) {
      return id_class(var0, var3.id_case(), 1.0F, var1, var2);
   }
}
