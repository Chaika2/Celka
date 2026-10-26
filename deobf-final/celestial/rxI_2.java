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
   public ruS_2<?> class_(rdn_3 var1, rYB var2, rhd_3 var3) {
      return break_(var1, var2).class_(var1, var2, var3);
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, an_3 var3, int var4, boolean var5) {
      if (!var2.continue_) {
         rrGb_1 var6 = break_(var1, var2);
         if (var6 != null) {
            if (var3 instanceof rhd_3 var7) {
               var6.class_(var7, var1);
            }

            if (!var6.private_ && (var5 || var3 instanceof rhd_3 && ((rhd_3)var3).Sn() == var1)) {
               this.class_(var2, var3, var6);
            }
         }
      }
   }

   public static void class_(rrEm_1 var0, rdn_3 var1) {
      rrGb_1 var2 = break_(var1, var0);
      if (var2 != null && var0.E() == var2.byte_) {
         int var3 = 1 << var2.case_;
         int var4 = var2.class_;
         int var5 = var2.break_;
         rYG[] var6 = new rYG[128 * var3 * 128 * var3];

         for (int var7 = 0; var7 < 128 * var3; var7++) {
            for (int var8 = 0; var8 < 128 * var3; var8++) {
               var6[var7 * 128 * var3 + var8] = var0.implements_(new rfH_2((var4 / var3 - 64) * var3 + var8, 0, (var5 / var3 - 64) * var3 + var7));
            }
         }

         for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
               if (var13 > 0 && var14 > 0 && var13 < 127 && var14 < 127) {
                  rYG var9 = var6[var13 * var3 + var14 * var3 * 128 * var3];
                  int var10 = 8;
                  if (class_(var6, var3, var13 - 1, var14 - 1)) {
                     var10--;
                  }

                  if (class_(var6, var3, var13 - 1, var14 + 1)) {
                     var10--;
                  }

                  if (class_(var6, var3, var13 - 1, var14)) {
                     var10--;
                  }

                  if (class_(var6, var3, var13 + 1, var14 - 1)) {
                     var10--;
                  }

                  if (class_(var6, var3, var13 + 1, var14 + 1)) {
                     var10--;
                  }

                  if (class_(var6, var3, var13 + 1, var14)) {
                     var10--;
                  }

                  if (class_(var6, var3, var13, var14 - 1)) {
                     var10--;
                  }

                  if (class_(var6, var3, var13, var14 + 1)) {
                     var10--;
                  }

                  int var11 = 3;
                  QS var12 = QS.break_;
                  if (var9.private_() < 0.0F) {
                     var12 = QS.new_;
                     if (var10 > 7 && var14 % 2 == 0) {
                        var11 = (var13 + (int)(rfU_2.class_((float)var14 + 0.0F) * 7.0F)) / 8 % 5;
                        if (var11 == 3) {
                           var11 = 1;
                        } else if (var11 == 4) {
                           var11 = 0;
                        }
                     } else if (var10 > 7) {
                        var12 = QS.break_;
                     } else if (var10 > 5) {
                        var11 = 1;
                     } else if (var10 > 3) {
                        var11 = 0;
                     } else if (var10 > 1) {
                        var11 = 0;
                     }
                  } else if (var10 > 0) {
                     var12 = QS.instanceof_;
                     if (var10 > 3) {
                        var11 = 1;
                     } else {
                        var11 = 3;
                     }
                  }

                  if (var12 != QS.break_) {
                     var2.catch_[var13 + var14 * 128] = (byte)(var12.k * 4 + var11);
                     var2.class_(var13, var14);
                  }
               }
            }
         }
      }
   }

   private static boolean class_(rYG[] var0, int var1, int var2, int var3) {
      return var0[var2 * var1 + var3 * var1 * 128 * var1].private_() >= 0.0F;
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      xc_3 var2 = var1.int_().byte_(var1.class_());
      if (var2.class_(rls_3.instanceof_)) {
         if (!var1.int_().continue_) {
            rrGb_1 var3 = break_(var1.volatile_(), var1.int_());
            var3.class_(var1.int_(), var1.class_());
         }

         return ryZ_2.class_(var1.int_().continue_);
      } else {
         return super.class_(var1);
      }
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rrGb_1 var5 = var2 == null ? null : break_(var1, var2);
      if (var5 != null && var5.private_) {
         var3.add(new rgn_3("filled_map.locked", protected_(var1)).class_(rgF_2.GRAY));
      }

      if (var4.class_()) {
         if (var5 != null) {
            var3.add(new rgn_3("filled_map.id", protected_(var1)).class_(rgF_2.GRAY));
            var3.add(new rgn_3("filled_map.scale", 1 << var5.case_).class_(rgF_2.GRAY));
            var3.add(new rgn_3("filled_map.level", var5.case_, 4).class_(rgF_2.GRAY));
         } else {
            var3.add(new rgn_3("filled_map.unknown").class_(rgF_2.GRAY));
         }
      }
   }

   public static void class_(rYB var0, rdn_3 var1) {
      rrGb_1 var2 = break_(var1, var0);
      if (var2 != null) {
         rrGb_1 var3 = class_(var1, var0, 0, 0, var2.case_, var2.protected_, var2.throws_, var2.byte_);
         var3.class_(var2);
      }
   }

   protected static void class_(rdn_3 var0, rYB var1, int var2) {
      rrGb_1 var3 = break_(var0, var1);
      if (var3 != null) {
         class_(var0, var1, var3.class_, var3.break_, rfU_2.class_(var3.case_ + var2, 0, 4), var3.protected_, var3.throws_, var3.byte_);
      }
   }

   public static rrGb_1 class_(rdn_3 var0, rYB var1) {
      return var1.class_(class_(protected_(var0)));
   }

   public static rdn_3 class_(rYB var0, int var1, int var2, byte var3, boolean var4, boolean var5) {
      rdn_3 var6 = new rdn_3(rdy_3.JX);
      class_(var6, var0, var1, var2, var3, var4, var5, var0.E());
      return var6;
   }

   private static rrGb_1 class_(rdn_3 var0, rYB var1, int var2, int var3, int var4, boolean var5, boolean var6, rqM_2<rYB> var7) {
      int var8 = var1.final_();
      rrGb_1 var9 = new rrGb_1(class_(var8));
      var9.class_(var2, var3, var4, var5, var6, var7);
      var1.class_(var9);
      var0.int_().break_("map", var8);
      return var9;
   }

   public void class_(rYB var1, an_3 var2, rrGb_1 var3) {
      if (var1.E() == var3.byte_ && var2 instanceof rhd_3) {
         int var4 = 1 << var3.case_;
         int var5 = var3.class_;
         int var6 = var3.break_;
         int var7 = rfU_2.byte_(var2.rx() - (double)var5) / var4 + 64;
         int var8 = rfU_2.byte_(var2.BO() - (double)var6) / var4 + 64;
         int var9 = 128 / var4;
         if (var1.default_().byte_()) {
            var9 /= 2;
         }

         rrGM var10 = var3.class_((rhd_3)var2);
         var10.break_++;
         boolean var11 = false;

         for (int var12 = var7 - var9 + 1; var12 < var7 + var9; var12++) {
            if ((var12 & 15) == (var10.break_ & 15) || var11) {
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
                     roJ_2 var22 = var1.this_(new rfH_2(var19, 0, var20));
                     if (!var22.catch_()) {
                        rfj_3 var23 = var22.private_();
                        int var24 = var19 & 15;
                        int var25 = var20 & 15;
                        int var26 = 0;
                        double var27 = 0.0;
                        if (var1.default_().byte_()) {
                           int var29 = var19 + var20 * 231871;
                           var29 = var29 * var29 * 31287121 + var29 * 11;
                           if ((var29 >> 20 & 1) == 0) {
                              var21.add(xu_3.finally_.continue_().protected_(var1, rfH_2.protected_), 10);
                           } else {
                              var21.add(xu_3.break_.continue_().protected_(var1, rfH_2.protected_), 100);
                           }

                           var27 = 100.0;
                        } else {
                           rfw_3 var39 = new rfw_3();
                           rfw_3 var30 = new rfw_3();

                           for (int var31 = 0; var31 < var4; var31++) {
                              for (int var32 = 0; var32 < var4; var32++) {
                                 int var33 = var22.class_(rKv_1.WORLD_SURFACE, var31 + var24, var32 + var25) + 1;
                                 xc_3 var34;
                                 if (var33 <= 1) {
                                    var34 = xu_3.while_.continue_();
                                 } else {
                                    do {
                                       var39.class_(var23.break_() + var31 + var24, --var33, var23.byte_() + var32 + var25);
                                       var34 = var22.byte_(var39);
                                    } while (var34.protected_(var1, var39) == QS.break_ && var33 > 0);

                                    if (var33 > 0 && !var34.volatile_().byte_()) {
                                       int var35 = var33 - 1;
                                       var30.class_(var39);

                                       xc_3 var36;
                                       do {
                                          var30.b_(var35--);
                                          var36 = var22.byte_(var30);
                                          var26++;
                                       } while (var35 > 0 && !var36.volatile_().byte_());

                                       var34 = this.class_(var1, var34, var39);
                                    }
                                 }

                                 var3.class_(var1, var23.break_() + var31 + var24, var23.byte_() + var32 + var25);
                                 var27 += (double)var33 / (double)(var4 * var4);
                                 var21.add(var34.protected_(var1, var39));
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

                        QS var43 = (QS)Iterables.getFirst(Multisets.copyHighestCountFirst(var21), QS.break_);
                        if (var43 == QS.final_) {
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
                           byte var44 = var3.catch_[var12 + var15 * 128];
                           byte var45 = (byte)(var43.k * 4 + var42);
                           if (var44 != var45) {
                              var3.catch_[var12 + var15 * 128] = var45;
                              var3.class_(var12, var15);
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

   private xc_3 class_(rYB var1, xc_3 var2, rfH_2 var3) {
      rXE var4 = var2.volatile_();
      return !var4.byte_() && !var2.protected_(var1, var3, rpr_3.UP) ? var4.catch_() : var2;
   }

   public static String class_(int var0) {
      return "map_" + var0;
   }

   public static rrGb_1 break_(rdn_3 var0, rYB var1) {
      rrGb_1 var2 = class_(var0, var1);
      if (var2 == null && var1 instanceof rrEm_1) {
         var2 = class_(var0, var1, var1.public_().class_(), var1.public_().byte_(), 3, false, false, var1.E());
      }

      return var2;
   }

   @Override
   public void break_(rdn_3 var1, rYB var2, rhd_3 var3) {
      rcd_3 var4 = var1.package_();
      if (var4 != null && var4.byte_("map_scale_direction", 99)) {
         class_(var1, var2, var4.private_("map_scale_direction"));
         var4.continue_("map_scale_direction");
      } else if (var4 != null && var4.byte_("map_to_lock", 1) && var4.new_("map_to_lock")) {
         class_(var2, var1);
         var4.continue_("map_to_lock");
      }
   }

   public static int catch_(rdn_3 var0) {
      rcd_3 var1 = var0.break_("display");
      if (var1 != null && var1.byte_("MapColor", 99)) {
         int var2 = var1.private_("MapColor");
         return 0xFF000000 | var2 & 16777215;
      } else {
         return -12173266;
      }
   }

   public static int protected_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      return var1 != null && var1.byte_("map", 99) ? var1.private_("map") : 0;
   }
}
