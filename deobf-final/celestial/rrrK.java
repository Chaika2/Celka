package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class rrrK {
   private final rrPt_1 class_;
   private final Random break_;
   private int byte_;
   private int protected_;

   private void byte_(List<rrrY> var1, rrro_1 var2) {
      var2.break_ = var2.break_.class_(var2.class_.class_(rpr_3.SOUTH), -1);
      var1.add(new rrrY(this.class_, "wall_corner", var2.break_, var2.class_));
      var2.break_ = var2.break_.class_(var2.class_.class_(rpr_3.SOUTH), -7);
      var2.break_ = var2.break_.class_(var2.class_.class_(rpr_3.WEST), -6);
      var2.class_ = var2.class_.class_(rqd_3.CLOCKWISE_90);
   }

   public rrrK(rrPt_1 var1, Random var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(rfH_2 var1, rqd_3 var2, List<rrrY> var3, rrrR var4) {
      rrro_1 var5 = new rrro_1();
      var5.break_ = var1;
      var5.class_ = var2;
      var5.byte_ = "wall_flat";
      rrro_1 var6 = new rrro_1();
      this.class_(var3, var5);
      var6.break_ = var5.break_.break_(8);
      var6.class_ = var5.class_;
      var6.byte_ = "wall_window";
      if (!var3.isEmpty()) {
      }

      rrre_1 var7 = var4.break_;
      rrre_1 var8 = var4.byte_;
      this.byte_ = var4.throws_ + 1;
      this.protected_ = var4.case_ + 1;
      int var9 = var4.throws_ + 1;
      int var10 = var4.case_;
      this.class_(var3, var5, var7, rpr_3.SOUTH, this.byte_, this.protected_, var9, var10);
      this.class_(var3, var6, var7, rpr_3.SOUTH, this.byte_, this.protected_, var9, var10);
      rrro_1 var11 = new rrro_1();
      var11.break_ = var5.break_.break_(19);
      var11.class_ = var5.class_;
      var11.byte_ = "wall_window";
      boolean var12 = false;

      for (int var13 = 0; var13 < var8.byte_ && !var12; var13++) {
         for (int var14 = var8.break_ - 1; var14 >= 0 && !var12; var14--) {
            if (rrrR.class_(var8, var14, var13)) {
               var11.break_ = var11.break_.class_(var2.class_(rpr_3.SOUTH), 8 + (var13 - this.protected_) * 8);
               var11.break_ = var11.break_.class_(var2.class_(rpr_3.EAST), (var14 - this.byte_) * 8);
               this.break_(var3, var11);
               this.class_(var3, var11, var8, rpr_3.SOUTH, var14, var13, var14, var13);
               var12 = true;
            }
         }
      }

      this.class_(var3, var1.break_(16), var2, var7, var8);
      this.class_(var3, var1.break_(27), var2, var8, (rrre_1)null);
      if (!var3.isEmpty()) {
      }

      rrrD[] var33 = new rrrD[]{new rrrg_1(), new rrrU(), new rrra_1()};

      for (int var34 = 0; var34 < 3; var34++) {
         rfH_2 var15 = var1.break_(8 * var34 + (var34 == 2 ? 3 : 0));
         rrre_1 var16 = var4.protected_[var34];
         rrre_1 var17 = var34 == 2 ? var8 : var7;
         String var18 = var34 == 0 ? "carpet_south_1" : "carpet_south_2";
         String var19 = var34 == 0 ? "carpet_west_1" : "carpet_west_2";

         for (int var20 = 0; var20 < var17.byte_; var20++) {
            for (int var21 = 0; var21 < var17.break_; var21++) {
               if (var17.class_(var21, var20) == 1) {
                  rfH_2 var22 = var15.class_(var2.class_(rpr_3.SOUTH), 8 + (var20 - this.protected_) * 8);
                  var22 = var22.class_(var2.class_(rpr_3.EAST), (var21 - this.byte_) * 8);
                  var3.add(new rrrY(this.class_, "corridor_floor", var22, var2));
                  if (var17.class_(var21, var20 - 1) == 1 || (var16.class_(var21, var20 - 1) & 8388608) == 8388608) {
                     var3.add(new rrrY(this.class_, "carpet_north", var22.class_(var2.class_(rpr_3.EAST), 1).final_(), var2));
                  }

                  if (var17.class_(var21 + 1, var20) == 1 || (var16.class_(var21 + 1, var20) & 8388608) == 8388608) {
                     var3.add(new rrrY(this.class_, "carpet_east", var22.class_(var2.class_(rpr_3.SOUTH), 1).class_(var2.class_(rpr_3.EAST), 5).final_(), var2));
                  }

                  if (var17.class_(var21, var20 + 1) == 1 || (var16.class_(var21, var20 + 1) & 8388608) == 8388608) {
                     var3.add(new rrrY(this.class_, var18, var22.class_(var2.class_(rpr_3.SOUTH), 5).class_(var2.class_(rpr_3.WEST), 1), var2));
                  }

                  if (var17.class_(var21 - 1, var20) == 1 || (var16.class_(var21 - 1, var20) & 8388608) == 8388608) {
                     var3.add(new rrrY(this.class_, var19, var22.class_(var2.class_(rpr_3.WEST), 1).class_(var2.class_(rpr_3.NORTH), 1), var2));
                  }
               }
            }
         }

         String var35 = var34 == 0 ? "indoors_wall_1" : "indoors_wall_2";
         String var36 = var34 == 0 ? "indoors_door_1" : "indoors_door_2";
         ArrayList var38 = Lists.newArrayList();

         for (int var23 = 0; var23 < var17.byte_; var23++) {
            for (int var24 = 0; var24 < var17.break_; var24++) {
               boolean var25 = var34 == 2 && var17.class_(var24, var23) == 3;
               if (var17.class_(var24, var23) == 2 || var25) {
                  int var26 = var16.class_(var24, var23);
                  int var27 = var26 & 983040;
                  int var28 = var26 & 65535;
                  var25 = var25 && (var26 & 8388608) == 8388608;
                  var38.clear();
                  if ((var26 & 2097152) == 2097152) {
                     for (rpr_3 var30 : rpb_3.HORIZONTAL) {
                        if (var17.class_(var24 + var30.implements_(), var23 + var30.extends_()) == 1) {
                           var38.add(var30);
                        }
                     }
                  }

                  rpr_3 var40 = null;
                  if (!var38.isEmpty()) {
                     var40 = (rpr_3)var38.get(this.break_.nextInt(var38.size()));
                  } else if ((var26 & 1048576) == 1048576) {
                     var40 = rpr_3.UP;
                  }

                  rfH_2 var41 = var15.class_(var2.class_(rpr_3.SOUTH), 8 + (var23 - this.protected_) * 8);
                  var41 = var41.class_(var2.class_(rpr_3.EAST), -1 + (var24 - this.byte_) * 8);
                  if (rrrR.class_(var17, var24 - 1, var23) && !var4.class_(var17, var24 - 1, var23, var34, var28)) {
                     var3.add(new rrrY(this.class_, var40 == rpr_3.WEST ? var36 : var35, var41, var2));
                  }

                  if (var17.class_(var24 + 1, var23) == 1 && !var25) {
                     rfH_2 var31 = var41.class_(var2.class_(rpr_3.EAST), 8);
                     var3.add(new rrrY(this.class_, var40 == rpr_3.EAST ? var36 : var35, var31, var2));
                  }

                  if (rrrR.class_(var17, var24, var23 + 1) && !var4.class_(var17, var24, var23 + 1, var34, var28)) {
                     rfH_2 var43 = var41.class_(var2.class_(rpr_3.SOUTH), 7);
                     var43 = var43.class_(var2.class_(rpr_3.EAST), 7);
                     var3.add(new rrrY(this.class_, var40 == rpr_3.SOUTH ? var36 : var35, var43, var2.class_(rqd_3.CLOCKWISE_90)));
                  }

                  if (var17.class_(var24, var23 - 1) == 1 && !var25) {
                     rfH_2 var45 = var41.class_(var2.class_(rpr_3.NORTH), 1);
                     var45 = var45.class_(var2.class_(rpr_3.EAST), 7);
                     var3.add(new rrrY(this.class_, var40 == rpr_3.NORTH ? var36 : var35, var45, var2.class_(rqd_3.CLOCKWISE_90)));
                  }

                  if (var27 == 65536) {
                     this.class_(var3, var41, var2, var40, var33[var34]);
                  } else if (var27 == 131072 && var40 != null) {
                     rpr_3 var48 = var4.break_(var17, var24, var23, var34, var28);
                     boolean var32 = (var26 & 4194304) == 4194304;
                     this.class_(var3, var41, var2, var48, var40, var33[var34], var32);
                  } else if (var27 == 262144 && var40 != null && var40 != rpr_3.UP) {
                     rpr_3 var47 = var40.catch_();
                     if (!var4.class_(var17, var24 + var47.implements_(), var23 + var47.extends_(), var34, var28)) {
                        var47 = var47.case_();
                     }

                     this.class_(var3, var41, var2, var47, var40, var33[var34]);
                  } else if (var27 == 262144 && var40 == rpr_3.UP) {
                     this.class_(var3, var41, var2, var33[var34]);
                  }
               }
            }
         }
      }
   }

   private void class_(List<rrrY> var1, rfH_2 var2, rqd_3 var3, rrrD var4) {
      rfH_2 var5 = var2.class_(var3.class_(rpr_3.EAST), 1);
      var1.add(new rrrY(this.class_, var4.throws_(this.break_), var5, var3, rpa_3.NONE));
   }

   private void class_(List<rrrY> var1, rfH_2 var2, rqd_3 var3, rpr_3 var4, rrrD var5) {
      rqd_3 var6 = rqd_3.NONE;
      String var7 = var5.class_(this.break_);
      if (var4 != rpr_3.EAST) {
         if (var4 == rpr_3.NORTH) {
            var6 = var6.class_(rqd_3.COUNTERCLOCKWISE_90);
         } else if (var4 == rpr_3.WEST) {
            var6 = var6.class_(rqd_3.CLOCKWISE_180);
         } else if (var4 == rpr_3.SOUTH) {
            var6 = var6.class_(rqd_3.CLOCKWISE_90);
         } else {
            var7 = var5.break_(this.break_);
         }
      }

      rfH_2 var8 = rrPl_1.class_(new rfH_2(1, 0, 0), rpa_3.NONE, var6, 7, 7);
      var6 = var6.class_(var3);
      var8 = var8.class_(var3);
      rfH_2 var9 = var2.break_(var8.b_(), 0, var8.d_());
      var1.add(new rrrY(this.class_, var7, var9, var6));
   }

   private void class_(List<rrrY> var1, rfH_2 var2, rqd_3 var3, rpr_3 var4, rpr_3 var5, rrrD var6, boolean var7) {
      if (var5 == rpr_3.EAST && var4 == rpr_3.SOUTH) {
         rfH_2 var29 = var2.class_(var3.class_(rpr_3.EAST), 1);
         var1.add(new rrrY(this.class_, var6.class_(this.break_, var7), var29, var3));
      } else if (var5 == rpr_3.EAST && var4 == rpr_3.NORTH) {
         rfH_2 var27 = var2.class_(var3.class_(rpr_3.EAST), 1);
         var27 = var27.class_(var3.class_(rpr_3.SOUTH), 6);
         var1.add(new rrrY(this.class_, var6.class_(this.break_, var7), var27, var3, rpa_3.LEFT_RIGHT));
      } else if (var5 == rpr_3.WEST && var4 == rpr_3.NORTH) {
         rfH_2 var25 = var2.class_(var3.class_(rpr_3.EAST), 7);
         var25 = var25.class_(var3.class_(rpr_3.SOUTH), 6);
         var1.add(new rrrY(this.class_, var6.class_(this.break_, var7), var25, var3.class_(rqd_3.CLOCKWISE_180)));
      } else if (var5 == rpr_3.WEST && var4 == rpr_3.SOUTH) {
         rfH_2 var24 = var2.class_(var3.class_(rpr_3.EAST), 7);
         var1.add(new rrrY(this.class_, var6.class_(this.break_, var7), var24, var3, rpa_3.FRONT_BACK));
      } else if (var5 == rpr_3.SOUTH && var4 == rpr_3.EAST) {
         rfH_2 var23 = var2.class_(var3.class_(rpr_3.EAST), 1);
         var1.add(new rrrY(this.class_, var6.class_(this.break_, var7), var23, var3.class_(rqd_3.CLOCKWISE_90), rpa_3.LEFT_RIGHT));
      } else if (var5 == rpr_3.SOUTH && var4 == rpr_3.WEST) {
         rfH_2 var22 = var2.class_(var3.class_(rpr_3.EAST), 7);
         var1.add(new rrrY(this.class_, var6.class_(this.break_, var7), var22, var3.class_(rqd_3.CLOCKWISE_90)));
      } else if (var5 == rpr_3.NORTH && var4 == rpr_3.WEST) {
         rfH_2 var20 = var2.class_(var3.class_(rpr_3.EAST), 7);
         var20 = var20.class_(var3.class_(rpr_3.SOUTH), 6);
         var1.add(new rrrY(this.class_, var6.class_(this.break_, var7), var20, var3.class_(rqd_3.CLOCKWISE_90), rpa_3.FRONT_BACK));
      } else if (var5 == rpr_3.NORTH && var4 == rpr_3.EAST) {
         rfH_2 var18 = var2.class_(var3.class_(rpr_3.EAST), 1);
         var18 = var18.class_(var3.class_(rpr_3.SOUTH), 6);
         var1.add(new rrrY(this.class_, var6.class_(this.break_, var7), var18, var3.class_(rqd_3.COUNTERCLOCKWISE_90)));
      } else if (var5 == rpr_3.SOUTH && var4 == rpr_3.NORTH) {
         rfH_2 var16 = var2.class_(var3.class_(rpr_3.EAST), 1);
         var16 = var16.class_(var3.class_(rpr_3.NORTH), 8);
         var1.add(new rrrY(this.class_, var6.break_(this.break_, var7), var16, var3));
      } else if (var5 == rpr_3.NORTH && var4 == rpr_3.SOUTH) {
         rfH_2 var14 = var2.class_(var3.class_(rpr_3.EAST), 7);
         var14 = var14.class_(var3.class_(rpr_3.SOUTH), 14);
         var1.add(new rrrY(this.class_, var6.break_(this.break_, var7), var14, var3.class_(rqd_3.CLOCKWISE_180)));
      } else if (var5 == rpr_3.WEST && var4 == rpr_3.EAST) {
         rfH_2 var13 = var2.class_(var3.class_(rpr_3.EAST), 15);
         var1.add(new rrrY(this.class_, var6.break_(this.break_, var7), var13, var3.class_(rqd_3.CLOCKWISE_90)));
      } else if (var5 == rpr_3.EAST && var4 == rpr_3.WEST) {
         rfH_2 var11 = var2.class_(var3.class_(rpr_3.WEST), 7);
         var11 = var11.class_(var3.class_(rpr_3.SOUTH), 6);
         var1.add(new rrrY(this.class_, var6.break_(this.break_, var7), var11, var3.class_(rqd_3.COUNTERCLOCKWISE_90)));
      } else if (var5 == rpr_3.UP && var4 == rpr_3.EAST) {
         rfH_2 var10 = var2.class_(var3.class_(rpr_3.EAST), 15);
         var1.add(new rrrY(this.class_, var6.byte_(this.break_), var10, var3.class_(rqd_3.CLOCKWISE_90)));
      } else if (var5 == rpr_3.UP && var4 == rpr_3.SOUTH) {
         rfH_2 var8 = var2.class_(var3.class_(rpr_3.EAST), 1);
         var8 = var8.class_(var3.class_(rpr_3.NORTH), 0);
         var1.add(new rrrY(this.class_, var6.byte_(this.break_), var8, var3));
      }
   }

   private void class_(List<rrrY> var1, rfH_2 var2, rqd_3 var3, rpr_3 var4, rpr_3 var5, rrrD var6) {
      byte var7 = 0;
      byte var8 = 0;
      rqd_3 var9 = var3;
      rpa_3 var10 = rpa_3.NONE;
      if (var5 == rpr_3.EAST && var4 == rpr_3.SOUTH) {
         var7 = -7;
      } else if (var5 == rpr_3.EAST && var4 == rpr_3.NORTH) {
         var7 = -7;
         var8 = 6;
         var10 = rpa_3.LEFT_RIGHT;
      } else if (var5 == rpr_3.NORTH && var4 == rpr_3.EAST) {
         var7 = 1;
         var8 = 14;
         var9 = var3.class_(rqd_3.COUNTERCLOCKWISE_90);
      } else if (var5 == rpr_3.NORTH && var4 == rpr_3.WEST) {
         var7 = 7;
         var8 = 14;
         var9 = var3.class_(rqd_3.COUNTERCLOCKWISE_90);
         var10 = rpa_3.LEFT_RIGHT;
      } else if (var5 == rpr_3.SOUTH && var4 == rpr_3.WEST) {
         var7 = 7;
         var8 = -8;
         var9 = var3.class_(rqd_3.CLOCKWISE_90);
      } else if (var5 == rpr_3.SOUTH && var4 == rpr_3.EAST) {
         var7 = 1;
         var8 = -8;
         var9 = var3.class_(rqd_3.CLOCKWISE_90);
         var10 = rpa_3.LEFT_RIGHT;
      } else if (var5 == rpr_3.WEST && var4 == rpr_3.NORTH) {
         var7 = 15;
         var8 = 6;
         var9 = var3.class_(rqd_3.CLOCKWISE_180);
      } else if (var5 == rpr_3.WEST && var4 == rpr_3.SOUTH) {
         var7 = 15;
         var10 = rpa_3.FRONT_BACK;
      }

      rfH_2 var11 = var2.class_(var3.class_(rpr_3.EAST), var7);
      var11 = var11.class_(var3.class_(rpr_3.SOUTH), var8);
      var1.add(new rrrY(this.class_, var6.protected_(this.break_), var11, var9, var10));
   }

   private void class_(List<rrrY> var1, rfH_2 var2, rqd_3 var3, rrre_1 var4, rrre_1 var5) {
      for (int var6 = 0; var6 < var4.byte_; var6++) {
         for (int var7 = 0; var7 < var4.break_; var7++) {
            rfH_2 var8 = var2.class_(var3.class_(rpr_3.SOUTH), 8 + (var6 - this.protected_) * 8);
            var8 = var8.class_(var3.class_(rpr_3.EAST), (var7 - this.byte_) * 8);
            boolean var9 = var5 != null && rrrR.class_(var5, var7, var6);
            if (rrrR.class_(var4, var7, var6) && !var9) {
               var1.add(new rrrY(this.class_, "roof", var8.break_(3), var3));
               if (!rrrR.class_(var4, var7 + 1, var6)) {
                  rfH_2 var10 = var8.class_(var3.class_(rpr_3.EAST), 6);
                  var1.add(new rrrY(this.class_, "roof_front", var10, var3));
               }

               if (!rrrR.class_(var4, var7 - 1, var6)) {
                  rfH_2 var23 = var8.class_(var3.class_(rpr_3.EAST), 0);
                  var23 = var23.class_(var3.class_(rpr_3.SOUTH), 7);
                  var1.add(new rrrY(this.class_, "roof_front", var23, var3.class_(rqd_3.CLOCKWISE_180)));
               }

               if (!rrrR.class_(var4, var7, var6 - 1)) {
                  rfH_2 var25 = var8.class_(var3.class_(rpr_3.WEST), 1);
                  var1.add(new rrrY(this.class_, "roof_front", var25, var3.class_(rqd_3.COUNTERCLOCKWISE_90)));
               }

               if (!rrrR.class_(var4, var7, var6 + 1)) {
                  rfH_2 var26 = var8.class_(var3.class_(rpr_3.EAST), 6);
                  var26 = var26.class_(var3.class_(rpr_3.SOUTH), 6);
                  var1.add(new rrrY(this.class_, "roof_front", var26, var3.class_(rqd_3.CLOCKWISE_90)));
               }
            }
         }
      }

      if (var5 != null) {
         for (int var12 = 0; var12 < var4.byte_; var12++) {
            for (int var14 = 0; var14 < var4.break_; var14++) {
               rfH_2 var17 = var2.class_(var3.class_(rpr_3.SOUTH), 8 + (var12 - this.protected_) * 8);
               var17 = var17.class_(var3.class_(rpr_3.EAST), (var14 - this.byte_) * 8);
               boolean var21 = rrrR.class_(var5, var14, var12);
               if (rrrR.class_(var4, var14, var12) && var21) {
                  if (!rrrR.class_(var4, var14 + 1, var12)) {
                     rfH_2 var28 = var17.class_(var3.class_(rpr_3.EAST), 7);
                     var1.add(new rrrY(this.class_, "small_wall", var28, var3));
                  }

                  if (!rrrR.class_(var4, var14 - 1, var12)) {
                     rfH_2 var29 = var17.class_(var3.class_(rpr_3.WEST), 1);
                     var29 = var29.class_(var3.class_(rpr_3.SOUTH), 6);
                     var1.add(new rrrY(this.class_, "small_wall", var29, var3.class_(rqd_3.CLOCKWISE_180)));
                  }

                  if (!rrrR.class_(var4, var14, var12 - 1)) {
                     rfH_2 var31 = var17.class_(var3.class_(rpr_3.WEST), 0);
                     var31 = var31.class_(var3.class_(rpr_3.NORTH), 1);
                     var1.add(new rrrY(this.class_, "small_wall", var31, var3.class_(rqd_3.COUNTERCLOCKWISE_90)));
                  }

                  if (!rrrR.class_(var4, var14, var12 + 1)) {
                     rfH_2 var33 = var17.class_(var3.class_(rpr_3.EAST), 6);
                     var33 = var33.class_(var3.class_(rpr_3.SOUTH), 7);
                     var1.add(new rrrY(this.class_, "small_wall", var33, var3.class_(rqd_3.CLOCKWISE_90)));
                  }

                  if (!rrrR.class_(var4, var14 + 1, var12)) {
                     if (!rrrR.class_(var4, var14, var12 - 1)) {
                        rfH_2 var35 = var17.class_(var3.class_(rpr_3.EAST), 7);
                        var35 = var35.class_(var3.class_(rpr_3.NORTH), 2);
                        var1.add(new rrrY(this.class_, "small_wall_corner", var35, var3));
                     }

                     if (!rrrR.class_(var4, var14, var12 + 1)) {
                        rfH_2 var37 = var17.class_(var3.class_(rpr_3.EAST), 8);
                        var37 = var37.class_(var3.class_(rpr_3.SOUTH), 7);
                        var1.add(new rrrY(this.class_, "small_wall_corner", var37, var3.class_(rqd_3.CLOCKWISE_90)));
                     }
                  }

                  if (!rrrR.class_(var4, var14 - 1, var12)) {
                     if (!rrrR.class_(var4, var14, var12 - 1)) {
                        rfH_2 var39 = var17.class_(var3.class_(rpr_3.WEST), 2);
                        var39 = var39.class_(var3.class_(rpr_3.NORTH), 1);
                        var1.add(new rrrY(this.class_, "small_wall_corner", var39, var3.class_(rqd_3.COUNTERCLOCKWISE_90)));
                     }

                     if (!rrrR.class_(var4, var14, var12 + 1)) {
                        rfH_2 var41 = var17.class_(var3.class_(rpr_3.WEST), 1);
                        var41 = var41.class_(var3.class_(rpr_3.SOUTH), 8);
                        var1.add(new rrrY(this.class_, "small_wall_corner", var41, var3.class_(rqd_3.CLOCKWISE_180)));
                     }
                  }
               }
            }
         }
      }

      for (int var13 = 0; var13 < var4.byte_; var13++) {
         for (int var15 = 0; var15 < var4.break_; var15++) {
            rfH_2 var19 = var2.class_(var3.class_(rpr_3.SOUTH), 8 + (var13 - this.protected_) * 8);
            var19 = var19.class_(var3.class_(rpr_3.EAST), (var15 - this.byte_) * 8);
            boolean var22 = var5 != null && rrrR.class_(var5, var15, var13);
            if (rrrR.class_(var4, var15, var13) && !var22) {
               if (!rrrR.class_(var4, var15 + 1, var13)) {
                  rfH_2 var43 = var19.class_(var3.class_(rpr_3.EAST), 6);
                  if (!rrrR.class_(var4, var15, var13 + 1)) {
                     rfH_2 var11 = var43.class_(var3.class_(rpr_3.SOUTH), 6);
                     var1.add(new rrrY(this.class_, "roof_corner", var11, var3));
                  } else if (rrrR.class_(var4, var15 + 1, var13 + 1)) {
                     rfH_2 var46 = var43.class_(var3.class_(rpr_3.SOUTH), 5);
                     var1.add(new rrrY(this.class_, "roof_inner_corner", var46, var3));
                  }

                  if (!rrrR.class_(var4, var15, var13 - 1)) {
                     var1.add(new rrrY(this.class_, "roof_corner", var43, var3.class_(rqd_3.COUNTERCLOCKWISE_90)));
                  } else if (rrrR.class_(var4, var15 + 1, var13 - 1)) {
                     rfH_2 var47 = var19.class_(var3.class_(rpr_3.EAST), 9);
                     var47 = var47.class_(var3.class_(rpr_3.NORTH), 2);
                     var1.add(new rrrY(this.class_, "roof_inner_corner", var47, var3.class_(rqd_3.CLOCKWISE_90)));
                  }
               }

               if (!rrrR.class_(var4, var15 - 1, var13)) {
                  rfH_2 var44 = var19.class_(var3.class_(rpr_3.EAST), 0);
                  var44 = var44.class_(var3.class_(rpr_3.SOUTH), 0);
                  if (!rrrR.class_(var4, var15, var13 + 1)) {
                     rfH_2 var49 = var44.class_(var3.class_(rpr_3.SOUTH), 6);
                     var1.add(new rrrY(this.class_, "roof_corner", var49, var3.class_(rqd_3.CLOCKWISE_90)));
                  } else if (rrrR.class_(var4, var15 - 1, var13 + 1)) {
                     rfH_2 var50 = var44.class_(var3.class_(rpr_3.SOUTH), 8);
                     var50 = var50.class_(var3.class_(rpr_3.WEST), 3);
                     var1.add(new rrrY(this.class_, "roof_inner_corner", var50, var3.class_(rqd_3.COUNTERCLOCKWISE_90)));
                  }

                  if (!rrrR.class_(var4, var15, var13 - 1)) {
                     var1.add(new rrrY(this.class_, "roof_corner", var44, var3.class_(rqd_3.CLOCKWISE_180)));
                  } else if (rrrR.class_(var4, var15 - 1, var13 - 1)) {
                     rfH_2 var52 = var44.class_(var3.class_(rpr_3.SOUTH), 1);
                     var1.add(new rrrY(this.class_, "roof_inner_corner", var52, var3.class_(rqd_3.CLOCKWISE_180)));
                  }
               }
            }
         }
      }
   }

   private void class_(List<rrrY> var1, rrro_1 var2) {
      rpr_3 var3 = var2.class_.class_(rpr_3.WEST);
      var1.add(new rrrY(this.class_, "entrance", var2.break_.class_(var3, 9), var2.class_));
      var2.break_ = var2.break_.class_(var2.class_.class_(rpr_3.SOUTH), 16);
   }

   private void class_(List<rrrY> var1, rrro_1 var2, rrre_1 var3, rpr_3 var4, int var5, int var6, int var7, int var8) {
      int var9 = var5;
      int var10 = var6;
      rpr_3 var11 = var4;

      do {
         if (!rrrR.class_(var3, var9 + var4.implements_(), var10 + var4.extends_())) {
            this.byte_(var1, var2);
            var4 = var4.catch_();
            if (var9 != var7 || var10 != var8 || var11 != var4) {
               this.break_(var1, var2);
            }
         } else if (rrrR.class_(var3, var9 + var4.implements_(), var10 + var4.extends_())
            && rrrR.class_(var3, var9 + var4.implements_() + var4.private_().implements_(), var10 + var4.extends_() + var4.private_().extends_())) {
            this.protected_(var1, var2);
            var9 += var4.implements_();
            var10 += var4.extends_();
            var4 = var4.private_();
         } else {
            var9 += var4.implements_();
            var10 += var4.extends_();
            if (var9 != var7 || var10 != var8 || var11 != var4) {
               this.break_(var1, var2);
            }
         }
      } while (var9 != var7 || var10 != var8 || var11 != var4);
   }

   private void break_(List<rrrY> var1, rrro_1 var2) {
      var1.add(new rrrY(this.class_, var2.byte_, var2.break_.class_(var2.class_.class_(rpr_3.EAST), 7), var2.class_));
      var2.break_ = var2.break_.class_(var2.class_.class_(rpr_3.SOUTH), 8);
   }

   private void protected_(List<rrrY> var1, rrro_1 var2) {
      var2.break_ = var2.break_.class_(var2.class_.class_(rpr_3.SOUTH), 6);
      var2.break_ = var2.break_.class_(var2.class_.class_(rpr_3.EAST), 8);
      var2.class_ = var2.class_.class_(rqd_3.COUNTERCLOCKWISE_90);
   }
}
