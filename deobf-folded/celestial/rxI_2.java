package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multisets;
import java.util.List;

public class rxI_2 extends rxP_2 {
   public rxI_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ruS_2<?> id_class(rdn_3 var1, rYB var2, rhd_3 var3) {
      return id_break(var1, var2).id_class(var1, var2, var3);
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, an_3 var3, int var4, boolean var5) {
      if (!var2.id_continue) {
         rrGb_1 var6 = id_break(var1, var2);
         if (var6 != null) {
            if (var3 instanceof rhd_3 var7) {
               var6.id_class(var7, var1);
            }

            if (!var6.id_private && (var5 || var3 instanceof rhd_3 && ((rhd_3)var3).Sn() == var1)) {
               this.id_class(var2, var3, var6);
            }
         }
      }
   }

   public static void id_class(rrEm_1 var0, rdn_3 var1) {
      rrGb_1 var2 = id_break(var1, var0);
      if (var2 != null && var0.E() == var2.id_byte) {
         int var3 = 1 << var2.id_case;
         int var4 = var2.id_class;
         int var5 = var2.id_break;
         rYG[] var6 = new rYG[128 * var3 * 128 * var3];

         for (int var7 = 0; var7 < 128 * var3; var7++) {
            for (int var8 = 0; var8 < 128 * var3; var8++) {
               var6[var7 * 128 * var3 + var8] = var0.id_implements(new rfH_2((var4 / var3 - 64) * var3 + var8, 0, (var5 / var3 - 64) * var3 + var7));
            }
         }

         for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
               if (var13 > 0 && var14 > 0 && var13 < 127 && var14 < 127) {
                  rYG var9 = var6[var13 * var3 + var14 * var3 * 128 * var3];
                  int var10 = 8;
                  if (id_class(var6, var3, var13 - 1, var14 - 1)) {
                     var10--;
                  }

                  if (id_class(var6, var3, var13 - 1, var14 + 1)) {
                     var10--;
                  }

                  if (id_class(var6, var3, var13 - 1, var14)) {
                     var10--;
                  }

                  if (id_class(var6, var3, var13 + 1, var14 - 1)) {
                     var10--;
                  }

                  if (id_class(var6, var3, var13 + 1, var14 + 1)) {
                     var10--;
                  }

                  if (id_class(var6, var3, var13 + 1, var14)) {
                     var10--;
                  }

                  if (id_class(var6, var3, var13, var14 - 1)) {
                     var10--;
                  }

                  if (id_class(var6, var3, var13, var14 + 1)) {
                     var10--;
                  }

                  int var11 = 3;
                  QS var12 = QS.id_break;
                  if (var9.id_private() < 0.0F) {
                     var12 = QS.id_new;
                     if (var10 > 7 && var14 % 2 == 0) {
                        var11 = (var13 + (int)(rfU_2.id_class((float)var14 + 0.0F) * 7.0F)) / 8 % 5;
                        if (var11 == 3) {
                           var11 = 1;
                        } else if (var11 == 4) {
                           var11 = 0;
                        }
                     } else if (var10 > 7) {
                        var12 = QS.id_break;
                     } else if (var10 > 5) {
                        var11 = 1;
                     } else if (var10 > 3) {
                        var11 = 0;
                     } else if (var10 > 1) {
                        var11 = 0;
                     }
                  } else if (var10 > 0) {
                     var12 = QS.id_instanceof;
                     if (var10 > 3) {
                        var11 = 1;
                     } else {
                        var11 = 3;
                     }
                  }

                  if (var12 != QS.id_break) {
                     var2.id_catch[var13 + var14 * 128] = (byte)(var12.k * 4 + var11);
                     var2.id_class(var13, var14);
                  }
               }
            }
         }
      }
   }

   private static boolean id_class(rYG[] var0, int var1, int var2, int var3) {
      return var0[var2 * var1 + var3 * var1 * 128 * var1].id_private() >= 0.0F;
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      xc_3 var2 = var1.id_int().id_byte(var1.id_class());
      if (var2.id_class(rls_3.id_instanceof)) {
         if (!var1.id_int().id_continue) {
            rrGb_1 var3 = id_break(var1.id_volatile(), var1.id_int());
            var3.id_class(var1.id_int(), var1.id_class());
         }

         return ryZ_2.id_class(var1.id_int().id_continue);
      } else {
         return super.id_class(var1);
      }
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rrGb_1 var5 = var2 == null ? null : id_break(var1, var2);
      if (var5 != null && var5.id_private) {
         var3.add(new rgn_3("filled_map.locked", id_protected(var1)).id_class(rgF_2.GRAY));
      }

      if (var4.id_class()) {
         if (var5 != null) {
            var3.add(new rgn_3("filled_map.id", id_protected(var1)).id_class(rgF_2.GRAY));
            var3.add(new rgn_3("filled_map.scale", 1 << var5.id_case).id_class(rgF_2.GRAY));
            var3.add(new rgn_3("filled_map.level", var5.id_case, 4).id_class(rgF_2.GRAY));
         } else {
            var3.add(new rgn_3("filled_map.unknown").id_class(rgF_2.GRAY));
         }
      }
   }

   public static void id_class(rYB var0, rdn_3 var1) {
      rrGb_1 var2 = id_break(var1, var0);
      if (var2 != null) {
         rrGb_1 var3 = id_class(var1, var0, 0, 0, var2.id_case, var2.id_protected, var2.id_throws, var2.id_byte);
         var3.id_class(var2);
      }
   }

   protected static void id_class(rdn_3 var0, rYB var1, int var2) {
      rrGb_1 var3 = id_break(var0, var1);
      if (var3 != null) {
         id_class(var0, var1, var3.id_class, var3.id_break, rfU_2.id_class(var3.id_case + var2, 0, 4), var3.id_protected, var3.id_throws, var3.id_byte);
      }
   }

   public static rrGb_1 id_class(rdn_3 var0, rYB var1) {
      return var1.id_class(id_class(id_protected(var0)));
   }

   public static rdn_3 id_class(rYB var0, int var1, int var2, byte var3, boolean var4, boolean var5) {
      rdn_3 var6 = new rdn_3(rdy_3.JX);
      id_class(var6, var0, var1, var2, var3, var4, var5, var0.E());
      return var6;
   }

   private static rrGb_1 id_class(rdn_3 var0, rYB var1, int var2, int var3, int var4, boolean var5, boolean var6, rqM_2<rYB> var7) {
      int var8 = var1.id_final();
      rrGb_1 var9 = new rrGb_1(id_class(var8));
      var9.id_class(var2, var3, var4, var5, var6, var7);
      var1.id_class(var9);
      var0.id_int().id_break("map", var8);
      return var9;
   }

   public void id_class(rYB var1, an_3 var2, rrGb_1 var3) {
      if (var1.E() == var3.id_byte && var2 instanceof rhd_3) {
         int var4 = 1 << var3.id_case;
         int var5 = var3.id_class;
         int var6 = var3.id_break;
         int var7 = rfU_2.id_byte(var2.rx() - (double)var5) / var4 + 64;
         int var8 = rfU_2.id_byte(var2.BO() - (double)var6) / var4 + 64;
         int var9 = 128 / var4;
         if (var1.id_default().id_byte()) {
            var9 /= 2;
         }

         rrGM var10 = var3.id_class((rhd_3)var2);
         var10.id_break++;
         boolean var11 = false;

         for (int var12 = var7 - var9 + 1; var12 < var7 + var9; var12++) {
            if ((var12 & 15) == (var10.id_break & 15) || var11) {
               var11 = false;
               double var13 = 0.0;

               for (int var15 = var8 - var9 - 1; var15 < var8 + var9; var15++) {
                  if (var12 >= 0 && var15 >= -1 && var12 < 128 && var15 < 128) {
                     int var16 = var12 - var7;
                     int var17 = var15 - var8;
                     boolean var18 = var16 * var16 + var17 * var17 > (var9 - 2) * (var9 - 2);
                     int var19 = (var5 / var4 + var12 - 64) * var4;
                     int var20 = (var6 / var4 + var15 - 64) * var4;
                     LinkedHashMultiset var21 = LinkedHashMultiset.create();
                     roJ_2 var22 = var1.id_this(new rfH_2(var19, 0, var20));
                     if (!var22.id_catch()) {
                        rfj_3 var23 = var22.id_private();
                        int var24 = var19 & 15;
                        int var25 = var20 & 15;
                        int var26 = 0;
                        double var27 = 0.0;
                        if (var1.id_default().id_byte()) {
                           int var29 = var19 + var20 * 231871;
                           var29 = var29 * var29 * 31287121 + var29 * 11;
                           if ((var29 >> 20 & 1) == 0) {
                              var21.add(xu_3.id_finally.id_continue().id_protected(var1, rfH_2.id_protected), 10);
                           } else {
                              var21.add(xu_3.id_break.id_continue().id_protected(var1, rfH_2.id_protected), 100);
                           }

                           var27 = 100.0;
                        } else {
                           rfw_3 var39 = new rfw_3();
                           rfw_3 var30 = new rfw_3();

                           for (int var31 = 0; var31 < var4; var31++) {
                              for (int var32 = 0; var32 < var4; var32++) {
                                 int var33 = var22.id_class(rKv_1.WORLD_SURFACE, var31 + var24, var32 + var25) + 1;
                                 xc_3 var34;
                                 if (var33 <= 1) {
                                    var34 = xu_3.id_while.id_continue();
                                 } else {
                                    do {
                                       var39.id_class(var23.id_break() + var31 + var24, --var33, var23.id_byte() + var32 + var25);
                                       var34 = var22.id_byte(var39);
                                    } while (var34.id_protected(var1, var39) == QS.id_break && var33 > 0);

                                    if (var33 > 0 && !var34.id_volatile().id_byte()) {
                                       int var35 = var33 - 1;
                                       var30.id_class(var39);

                                       xc_3 var36;
                                       do {
                                          var30.b_(var35--);
                                          var36 = var22.id_byte(var30);
                                          var26++;
                                       } while (var35 > 0 && !var36.id_volatile().id_byte());

                                       var34 = this.id_class(var1, var34, var39);
                                    }
                                 }

                                 var3.id_class(var1, var23.id_break() + var31 + var24, var23.id_byte() + var32 + var25);
                                 var27 += (double)var33 / (double)(var4 * var4);
                                 var21.add(var34.id_protected(var1, var39));
                              }
                           }
                        }

                        var26 /= var4 * var4;
                        double var40 = (var27 - var13) * 4.0 / (double)(var4 + 4) + ((double)(var12 + var15 & 1) - 0.5) * 0.4;
                        byte var42 = 1;
                        if (var40 > 0.6) {
                           var42 = 2;
                        }

                        if (var40 < -0.6) {
                           var42 = 0;
                        }

                        QS var43 = (QS)Iterables.getFirst(Multisets.copyHighestCountFirst(var21), QS.id_break);
                        if (var43 == QS.id_final) {
                           var40 = (double)var26 * 0.1 + (double)(var12 + var15 & 1) * 0.2;
                           var42 = 1;
                           if (var40 < 0.5) {
                              var42 = 2;
                           }

                           if (var40 > 0.9) {
                              var42 = 0;
                           }
                        }

                        var13 = var27;
                        if (var15 >= 0 && var16 * var16 + var17 * var17 < var9 * var9 && (!var18 || (var12 + var15 & 1) != 0)) {
                           byte var44 = var3.id_catch[var12 + var15 * 128];
                           byte var45 = (byte)(var43.k * 4 + var42);
                           if (var44 != var45) {
                              var3.id_catch[var12 + var15 * 128] = var45;
                              var3.id_class(var12, var15);
                              var11 = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private xc_3 id_class(rYB var1, xc_3 var2, rfH_2 var3) {
      rXE var4 = var2.id_volatile();
      return !var4.id_byte() && !var2.id_protected(var1, var3, rpr_3.UP) ? var4.id_catch() : var2;
   }

   public static String id_class(int var0) {
      return "map_" + var0;
   }

   public static rrGb_1 id_break(rdn_3 var0, rYB var1) {
      rrGb_1 var2 = id_class(var0, var1);
      if (var2 == null && var1 instanceof rrEm_1) {
         var2 = id_class(var0, var1, var1.id_public().id_class(), var1.id_public().id_byte(), 3, false, false, var1.E());
      }

      return var2;
   }

   @Override
   public void id_break(rdn_3 var1, rYB var2, rhd_3 var3) {
      rcd_3 var4 = var1.id_package();
      if (var4 != null && var4.id_byte("map_scale_direction", 99)) {
         id_class(var1, var2, var4.id_private("map_scale_direction"));
         var4.id_continue("map_scale_direction");
      } else if (var4 != null && var4.id_byte("map_to_lock", 1) && var4.id_new("map_to_lock")) {
         id_class(var2, var1);
         var4.id_continue("map_to_lock");
      }
   }

   public static int id_catch(rdn_3 var0) {
      rcd_3 var1 = var0.id_break("display");
      if (var1 != null && var1.id_byte("MapColor", 99)) {
         int var2 = var1.id_private("MapColor");
         return 0xFF000000 | var2 & 16777215;
      } else {
         return -12173266;
      }
   }

   public static int id_protected(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      return var1 != null && var1.id_byte("map", 99) ? var1.id_private("map") : 0;
   }
}
