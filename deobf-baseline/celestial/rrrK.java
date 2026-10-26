package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class rrrK {
   private final rrPt_1 id_class;
   private final Random id_break;
   private int id_byte;
   private int id_protected;

   private void id_byte(List<rrrY> var1, rrro_1 var2) {
      var2.id_break = var2.id_break.id_class(var2.id_class.id_class(rpr_3.SOUTH), -1);
      var1.add(new rrrY(this.id_class, "wall_corner", var2.id_break, var2.id_class));
      var2.id_break = var2.id_break.id_class(var2.id_class.id_class(rpr_3.SOUTH), -7);
      var2.id_break = var2.id_break.id_class(var2.id_class.id_class(rpr_3.WEST), -6);
      var2.id_class = var2.id_class.id_class(rqd_3.CLOCKWISE_90);
   }

   public rrrK(rrPt_1 var1, Random var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(rfH_2 var1, rqd_3 var2, List<rrrY> var3, rrrR var4) {
      rrro_1 var5 = new rrro_1();
      var5.id_break = var1;
      var5.id_class = var2;
      var5.id_byte = "wall_flat";
      rrro_1 var6 = new rrro_1();
      this.id_class(var3, var5);
      var6.id_break = var5.id_break.id_break(8);
      var6.id_class = var5.id_class;
      var6.id_byte = "wall_window";
      if (!var3.isEmpty()) {
      }

      rrre_1 var7 = var4.id_break;
      rrre_1 var8 = var4.id_byte;
      this.id_byte = var4.id_throws + 1;
      this.id_protected = var4.id_case + 1;
      int var9 = var4.id_throws + 1;
      int var10 = var4.id_case;
      this.id_class(var3, var5, var7, rpr_3.SOUTH, this.id_byte, this.id_protected, var9, var10);
      this.id_class(var3, var6, var7, rpr_3.SOUTH, this.id_byte, this.id_protected, var9, var10);
      rrro_1 var11 = new rrro_1();
      var11.id_break = var5.id_break.id_break(19);
      var11.id_class = var5.id_class;
      var11.id_byte = "wall_window";
      boolean var12 = false;

      for (int var13 = 0; var13 < var8.id_byte && !var12; var13++) {
         for (int var14 = var8.id_break - 1; var14 >= 0 && !var12; var14--) {
            if (rrrR.id_class(var8, var14, var13)) {
               var11.id_break = var11.id_break.id_class(var2.id_class(rpr_3.SOUTH), 8 + (var13 - this.id_protected) * 8);
               var11.id_break = var11.id_break.id_class(var2.id_class(rpr_3.EAST), (var14 - this.id_byte) * 8);
               this.id_break(var3, var11);
               this.id_class(var3, var11, var8, rpr_3.SOUTH, var14, var13, var14, var13);
               var12 = true;
            }
         }
      }

      this.id_class(var3, var1.id_break(16), var2, var7, var8);
      this.id_class(var3, var1.id_break(27), var2, var8, (rrre_1)null);
      if (!var3.isEmpty()) {
      }

      rrrD[] var33 = new rrrD[]{new rrrg_1(), new rrrU(), new rrra_1()};

      for (int var34 = 0; var34 < 3; var34++) {
         rfH_2 var15 = var1.id_break(8 * var34 + (var34 == 2 ? 3 : 0));
         rrre_1 var16 = var4.id_protected[var34];
         rrre_1 var17 = var34 == 2 ? var8 : var7;
         String var18 = var34 == 0 ? "carpet_south_1" : "carpet_south_2";
         String var19 = var34 == 0 ? "carpet_west_1" : "carpet_west_2";

         for (int var20 = 0; var20 < var17.id_byte; var20++) {
            for (int var21 = 0; var21 < var17.id_break; var21++) {
               if (var17.id_class(var21, var20) == 1) {
                  rfH_2 var22 = var15.id_class(var2.id_class(rpr_3.SOUTH), 8 + (var20 - this.id_protected) * 8);
                  var22 = var22.id_class(var2.id_class(rpr_3.EAST), (var21 - this.id_byte) * 8);
                  var3.add(new rrrY(this.id_class, "corridor_floor", var22, var2));
                  if (var17.id_class(var21, var20 - 1) == 1 || (var16.id_class(var21, var20 - 1) & 8388608) == 8388608) {
                     var3.add(new rrrY(this.id_class, "carpet_north", var22.id_class(var2.id_class(rpr_3.EAST), 1).id_final(), var2));
                  }

                  if (var17.id_class(var21 + 1, var20) == 1 || (var16.id_class(var21 + 1, var20) & 8388608) == 8388608) {
                     var3.add(
                        new rrrY(
                           this.id_class, "carpet_east", var22.id_class(var2.id_class(rpr_3.SOUTH), 1).id_class(var2.id_class(rpr_3.EAST), 5).id_final(), var2
                        )
                     );
                  }

                  if (var17.id_class(var21, var20 + 1) == 1 || (var16.id_class(var21, var20 + 1) & 8388608) == 8388608) {
                     var3.add(new rrrY(this.id_class, var18, var22.id_class(var2.id_class(rpr_3.SOUTH), 5).id_class(var2.id_class(rpr_3.WEST), 1), var2));
                  }

                  if (var17.id_class(var21 - 1, var20) == 1 || (var16.id_class(var21 - 1, var20) & 8388608) == 8388608) {
                     var3.add(new rrrY(this.id_class, var19, var22.id_class(var2.id_class(rpr_3.WEST), 1).id_class(var2.id_class(rpr_3.NORTH), 1), var2));
                  }
               }
            }
         }

         String var35 = var34 == 0 ? "indoors_wall_1" : "indoors_wall_2";
         String var36 = var34 == 0 ? "indoors_door_1" : "indoors_door_2";
         ArrayList var38 = Lists.newArrayList();

         for (int var23 = 0; var23 < var17.id_byte; var23++) {
            for (int var24 = 0; var24 < var17.id_break; var24++) {
               boolean var25 = var34 == 2 && var17.id_class(var24, var23) == 3;
               if (var17.id_class(var24, var23) == 2 || var25) {
                  int var26 = var16.id_class(var24, var23);
                  int var27 = var26 & 983040;
                  int var28 = var26 & 65535;
                  var25 = var25 && (var26 & 8388608) == 8388608;
                  var38.clear();
                  if ((var26 & 2097152) == 2097152) {
                     for (rpr_3 var30 : rpb_3.HORIZONTAL) {
                        if (var17.id_class(var24 + var30.id_implements(), var23 + var30.id_extends()) == 1) {
                           var38.add(var30);
                        }
                     }
                  }

                  rpr_3 var40 = null;
                  if (!var38.isEmpty()) {
                     var40 = (rpr_3)var38.get(this.id_break.nextInt(var38.size()));
                  } else if ((var26 & 1048576) == 1048576) {
                     var40 = rpr_3.UP;
                  }

                  rfH_2 var41 = var15.id_class(var2.id_class(rpr_3.SOUTH), 8 + (var23 - this.id_protected) * 8);
                  var41 = var41.id_class(var2.id_class(rpr_3.EAST), -1 + (var24 - this.id_byte) * 8);
                  if (rrrR.id_class(var17, var24 - 1, var23) && !var4.id_class(var17, var24 - 1, var23, var34, var28)) {
                     var3.add(new rrrY(this.id_class, var40 == rpr_3.WEST ? var36 : var35, var41, var2));
                  }

                  if (var17.id_class(var24 + 1, var23) == 1 && !var25) {
                     rfH_2 var31 = var41.id_class(var2.id_class(rpr_3.EAST), 8);
                     var3.add(new rrrY(this.id_class, var40 == rpr_3.EAST ? var36 : var35, var31, var2));
                  }

                  if (rrrR.id_class(var17, var24, var23 + 1) && !var4.id_class(var17, var24, var23 + 1, var34, var28)) {
                     rfH_2 var43 = var41.id_class(var2.id_class(rpr_3.SOUTH), 7);
                     var43 = var43.id_class(var2.id_class(rpr_3.EAST), 7);
                     var3.add(new rrrY(this.id_class, var40 == rpr_3.SOUTH ? var36 : var35, var43, var2.id_class(rqd_3.CLOCKWISE_90)));
                  }

                  if (var17.id_class(var24, var23 - 1) == 1 && !var25) {
                     rfH_2 var45 = var41.id_class(var2.id_class(rpr_3.NORTH), 1);
                     var45 = var45.id_class(var2.id_class(rpr_3.EAST), 7);
                     var3.add(new rrrY(this.id_class, var40 == rpr_3.NORTH ? var36 : var35, var45, var2.id_class(rqd_3.CLOCKWISE_90)));
                  }

                  if (var27 == 65536) {
                     this.id_class(var3, var41, var2, var40, var33[var34]);
                  } else if (var27 == 131072 && var40 != null) {
                     rpr_3 var48 = var4.id_break(var17, var24, var23, var34, var28);
                     boolean var32 = (var26 & 4194304) == 4194304;
                     this.id_class(var3, var41, var2, var48, var40, var33[var34], var32);
                  } else if (var27 == 262144 && var40 != null && var40 != rpr_3.UP) {
                     rpr_3 var47 = var40.id_catch();
                     if (!var4.id_class(var17, var24 + var47.id_implements(), var23 + var47.id_extends(), var34, var28)) {
                        var47 = var47.id_case();
                     }

                     this.id_class(var3, var41, var2, var47, var40, var33[var34]);
                  } else if (var27 == 262144 && var40 == rpr_3.UP) {
                     this.id_class(var3, var41, var2, var33[var34]);
                  }
               }
            }
         }
      }
   }

   private void id_class(List<rrrY> var1, rfH_2 var2, rqd_3 var3, rrrD var4) {
      rfH_2 var5 = var2.id_class(var3.id_class(rpr_3.EAST), 1);
      var1.add(new rrrY(this.id_class, var4.id_throws(this.id_break), var5, var3, rpa_3.NONE));
   }

   private void id_class(List<rrrY> var1, rfH_2 var2, rqd_3 var3, rpr_3 var4, rrrD var5) {
      rqd_3 var6 = rqd_3.NONE;
      String var7 = var5.id_class(this.id_break);
      if (var4 != rpr_3.EAST) {
         if (var4 == rpr_3.NORTH) {
            var6 = var6.id_class(rqd_3.COUNTERCLOCKWISE_90);
         } else if (var4 == rpr_3.WEST) {
            var6 = var6.id_class(rqd_3.CLOCKWISE_180);
         } else if (var4 == rpr_3.SOUTH) {
            var6 = var6.id_class(rqd_3.CLOCKWISE_90);
         } else {
            var7 = var5.id_break(this.id_break);
         }
      }

      rfH_2 var8 = rrPl_1.id_class(new rfH_2(1, 0, 0), rpa_3.NONE, var6, 7, 7);
      var6 = var6.id_class(var3);
      var8 = var8.id_class(var3);
      rfH_2 var9 = var2.id_break(var8.b_(), 0, var8.d_());
      var1.add(new rrrY(this.id_class, var7, var9, var6));
   }

   private void id_class(List<rrrY> var1, rfH_2 var2, rqd_3 var3, rpr_3 var4, rpr_3 var5, rrrD var6, boolean var7) {
      if (var5 == rpr_3.EAST && var4 == rpr_3.SOUTH) {
         rfH_2 var29 = var2.id_class(var3.id_class(rpr_3.EAST), 1);
         var1.add(new rrrY(this.id_class, var6.id_class(this.id_break, var7), var29, var3));
      } else if (var5 == rpr_3.EAST && var4 == rpr_3.NORTH) {
         rfH_2 var27 = var2.id_class(var3.id_class(rpr_3.EAST), 1);
         var27 = var27.id_class(var3.id_class(rpr_3.SOUTH), 6);
         var1.add(new rrrY(this.id_class, var6.id_class(this.id_break, var7), var27, var3, rpa_3.LEFT_RIGHT));
      } else if (var5 == rpr_3.WEST && var4 == rpr_3.NORTH) {
         rfH_2 var25 = var2.id_class(var3.id_class(rpr_3.EAST), 7);
         var25 = var25.id_class(var3.id_class(rpr_3.SOUTH), 6);
         var1.add(new rrrY(this.id_class, var6.id_class(this.id_break, var7), var25, var3.id_class(rqd_3.CLOCKWISE_180)));
      } else if (var5 == rpr_3.WEST && var4 == rpr_3.SOUTH) {
         rfH_2 var24 = var2.id_class(var3.id_class(rpr_3.EAST), 7);
         var1.add(new rrrY(this.id_class, var6.id_class(this.id_break, var7), var24, var3, rpa_3.FRONT_BACK));
      } else if (var5 == rpr_3.SOUTH && var4 == rpr_3.EAST) {
         rfH_2 var23 = var2.id_class(var3.id_class(rpr_3.EAST), 1);
         var1.add(new rrrY(this.id_class, var6.id_class(this.id_break, var7), var23, var3.id_class(rqd_3.CLOCKWISE_90), rpa_3.LEFT_RIGHT));
      } else if (var5 == rpr_3.SOUTH && var4 == rpr_3.WEST) {
         rfH_2 var22 = var2.id_class(var3.id_class(rpr_3.EAST), 7);
         var1.add(new rrrY(this.id_class, var6.id_class(this.id_break, var7), var22, var3.id_class(rqd_3.CLOCKWISE_90)));
      } else if (var5 == rpr_3.NORTH && var4 == rpr_3.WEST) {
         rfH_2 var20 = var2.id_class(var3.id_class(rpr_3.EAST), 7);
         var20 = var20.id_class(var3.id_class(rpr_3.SOUTH), 6);
         var1.add(new rrrY(this.id_class, var6.id_class(this.id_break, var7), var20, var3.id_class(rqd_3.CLOCKWISE_90), rpa_3.FRONT_BACK));
      } else if (var5 == rpr_3.NORTH && var4 == rpr_3.EAST) {
         rfH_2 var18 = var2.id_class(var3.id_class(rpr_3.EAST), 1);
         var18 = var18.id_class(var3.id_class(rpr_3.SOUTH), 6);
         var1.add(new rrrY(this.id_class, var6.id_class(this.id_break, var7), var18, var3.id_class(rqd_3.COUNTERCLOCKWISE_90)));
      } else if (var5 == rpr_3.SOUTH && var4 == rpr_3.NORTH) {
         rfH_2 var16 = var2.id_class(var3.id_class(rpr_3.EAST), 1);
         var16 = var16.id_class(var3.id_class(rpr_3.NORTH), 8);
         var1.add(new rrrY(this.id_class, var6.id_break(this.id_break, var7), var16, var3));
      } else if (var5 == rpr_3.NORTH && var4 == rpr_3.SOUTH) {
         rfH_2 var14 = var2.id_class(var3.id_class(rpr_3.EAST), 7);
         var14 = var14.id_class(var3.id_class(rpr_3.SOUTH), 14);
         var1.add(new rrrY(this.id_class, var6.id_break(this.id_break, var7), var14, var3.id_class(rqd_3.CLOCKWISE_180)));
      } else if (var5 == rpr_3.WEST && var4 == rpr_3.EAST) {
         rfH_2 var13 = var2.id_class(var3.id_class(rpr_3.EAST), 15);
         var1.add(new rrrY(this.id_class, var6.id_break(this.id_break, var7), var13, var3.id_class(rqd_3.CLOCKWISE_90)));
      } else if (var5 == rpr_3.EAST && var4 == rpr_3.WEST) {
         rfH_2 var11 = var2.id_class(var3.id_class(rpr_3.WEST), 7);
         var11 = var11.id_class(var3.id_class(rpr_3.SOUTH), 6);
         var1.add(new rrrY(this.id_class, var6.id_break(this.id_break, var7), var11, var3.id_class(rqd_3.COUNTERCLOCKWISE_90)));
      } else if (var5 == rpr_3.UP && var4 == rpr_3.EAST) {
         rfH_2 var10 = var2.id_class(var3.id_class(rpr_3.EAST), 15);
         var1.add(new rrrY(this.id_class, var6.id_byte(this.id_break), var10, var3.id_class(rqd_3.CLOCKWISE_90)));
      } else if (var5 == rpr_3.UP && var4 == rpr_3.SOUTH) {
         rfH_2 var8 = var2.id_class(var3.id_class(rpr_3.EAST), 1);
         var8 = var8.id_class(var3.id_class(rpr_3.NORTH), 0);
         var1.add(new rrrY(this.id_class, var6.id_byte(this.id_break), var8, var3));
      }
   }

   private void id_class(List<rrrY> var1, rfH_2 var2, rqd_3 var3, rpr_3 var4, rpr_3 var5, rrrD var6) {
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
         var9 = var3.id_class(rqd_3.COUNTERCLOCKWISE_90);
      } else if (var5 == rpr_3.NORTH && var4 == rpr_3.WEST) {
         var7 = 7;
         var8 = 14;
         var9 = var3.id_class(rqd_3.COUNTERCLOCKWISE_90);
         var10 = rpa_3.LEFT_RIGHT;
      } else if (var5 == rpr_3.SOUTH && var4 == rpr_3.WEST) {
         var7 = 7;
         var8 = -8;
         var9 = var3.id_class(rqd_3.CLOCKWISE_90);
      } else if (var5 == rpr_3.SOUTH && var4 == rpr_3.EAST) {
         var7 = 1;
         var8 = -8;
         var9 = var3.id_class(rqd_3.CLOCKWISE_90);
         var10 = rpa_3.LEFT_RIGHT;
      } else if (var5 == rpr_3.WEST && var4 == rpr_3.NORTH) {
         var7 = 15;
         var8 = 6;
         var9 = var3.id_class(rqd_3.CLOCKWISE_180);
      } else if (var5 == rpr_3.WEST && var4 == rpr_3.SOUTH) {
         var7 = 15;
         var10 = rpa_3.FRONT_BACK;
      }

      rfH_2 var11 = var2.id_class(var3.id_class(rpr_3.EAST), var7);
      var11 = var11.id_class(var3.id_class(rpr_3.SOUTH), var8);
      var1.add(new rrrY(this.id_class, var6.id_protected(this.id_break), var11, var9, var10));
   }

   private void id_class(List<rrrY> var1, rfH_2 var2, rqd_3 var3, rrre_1 var4, rrre_1 var5) {
      for (int var6 = 0; var6 < var4.id_byte; var6++) {
         for (int var7 = 0; var7 < var4.id_break; var7++) {
            rfH_2 var8 = var2.id_class(var3.id_class(rpr_3.SOUTH), 8 + (var6 - this.id_protected) * 8);
            var8 = var8.id_class(var3.id_class(rpr_3.EAST), (var7 - this.id_byte) * 8);
            boolean var9 = var5 != null && rrrR.id_class(var5, var7, var6);
            if (rrrR.id_class(var4, var7, var6) && !var9) {
               var1.add(new rrrY(this.id_class, "roof", var8.id_break(3), var3));
               if (!rrrR.id_class(var4, var7 + 1, var6)) {
                  rfH_2 var10 = var8.id_class(var3.id_class(rpr_3.EAST), 6);
                  var1.add(new rrrY(this.id_class, "roof_front", var10, var3));
               }

               if (!rrrR.id_class(var4, var7 - 1, var6)) {
                  rfH_2 var23 = var8.id_class(var3.id_class(rpr_3.EAST), 0);
                  var23 = var23.id_class(var3.id_class(rpr_3.SOUTH), 7);
                  var1.add(new rrrY(this.id_class, "roof_front", var23, var3.id_class(rqd_3.CLOCKWISE_180)));
               }

               if (!rrrR.id_class(var4, var7, var6 - 1)) {
                  rfH_2 var25 = var8.id_class(var3.id_class(rpr_3.WEST), 1);
                  var1.add(new rrrY(this.id_class, "roof_front", var25, var3.id_class(rqd_3.COUNTERCLOCKWISE_90)));
               }

               if (!rrrR.id_class(var4, var7, var6 + 1)) {
                  rfH_2 var26 = var8.id_class(var3.id_class(rpr_3.EAST), 6);
                  var26 = var26.id_class(var3.id_class(rpr_3.SOUTH), 6);
                  var1.add(new rrrY(this.id_class, "roof_front", var26, var3.id_class(rqd_3.CLOCKWISE_90)));
               }
            }
         }
      }

      if (var5 != null) {
         for (int var12 = 0; var12 < var4.id_byte; var12++) {
            for (int var14 = 0; var14 < var4.id_break; var14++) {
               rfH_2 var17 = var2.id_class(var3.id_class(rpr_3.SOUTH), 8 + (var12 - this.id_protected) * 8);
               var17 = var17.id_class(var3.id_class(rpr_3.EAST), (var14 - this.id_byte) * 8);
               boolean var21 = rrrR.id_class(var5, var14, var12);
               if (rrrR.id_class(var4, var14, var12) && var21) {
                  if (!rrrR.id_class(var4, var14 + 1, var12)) {
                     rfH_2 var28 = var17.id_class(var3.id_class(rpr_3.EAST), 7);
                     var1.add(new rrrY(this.id_class, "small_wall", var28, var3));
                  }

                  if (!rrrR.id_class(var4, var14 - 1, var12)) {
                     rfH_2 var29 = var17.id_class(var3.id_class(rpr_3.WEST), 1);
                     var29 = var29.id_class(var3.id_class(rpr_3.SOUTH), 6);
                     var1.add(new rrrY(this.id_class, "small_wall", var29, var3.id_class(rqd_3.CLOCKWISE_180)));
                  }

                  if (!rrrR.id_class(var4, var14, var12 - 1)) {
                     rfH_2 var31 = var17.id_class(var3.id_class(rpr_3.WEST), 0);
                     var31 = var31.id_class(var3.id_class(rpr_3.NORTH), 1);
                     var1.add(new rrrY(this.id_class, "small_wall", var31, var3.id_class(rqd_3.COUNTERCLOCKWISE_90)));
                  }

                  if (!rrrR.id_class(var4, var14, var12 + 1)) {
                     rfH_2 var33 = var17.id_class(var3.id_class(rpr_3.EAST), 6);
                     var33 = var33.id_class(var3.id_class(rpr_3.SOUTH), 7);
                     var1.add(new rrrY(this.id_class, "small_wall", var33, var3.id_class(rqd_3.CLOCKWISE_90)));
                  }

                  if (!rrrR.id_class(var4, var14 + 1, var12)) {
                     if (!rrrR.id_class(var4, var14, var12 - 1)) {
                        rfH_2 var35 = var17.id_class(var3.id_class(rpr_3.EAST), 7);
                        var35 = var35.id_class(var3.id_class(rpr_3.NORTH), 2);
                        var1.add(new rrrY(this.id_class, "small_wall_corner", var35, var3));
                     }

                     if (!rrrR.id_class(var4, var14, var12 + 1)) {
                        rfH_2 var37 = var17.id_class(var3.id_class(rpr_3.EAST), 8);
                        var37 = var37.id_class(var3.id_class(rpr_3.SOUTH), 7);
                        var1.add(new rrrY(this.id_class, "small_wall_corner", var37, var3.id_class(rqd_3.CLOCKWISE_90)));
                     }
                  }

                  if (!rrrR.id_class(var4, var14 - 1, var12)) {
                     if (!rrrR.id_class(var4, var14, var12 - 1)) {
                        rfH_2 var39 = var17.id_class(var3.id_class(rpr_3.WEST), 2);
                        var39 = var39.id_class(var3.id_class(rpr_3.NORTH), 1);
                        var1.add(new rrrY(this.id_class, "small_wall_corner", var39, var3.id_class(rqd_3.COUNTERCLOCKWISE_90)));
                     }

                     if (!rrrR.id_class(var4, var14, var12 + 1)) {
                        rfH_2 var41 = var17.id_class(var3.id_class(rpr_3.WEST), 1);
                        var41 = var41.id_class(var3.id_class(rpr_3.SOUTH), 8);
                        var1.add(new rrrY(this.id_class, "small_wall_corner", var41, var3.id_class(rqd_3.CLOCKWISE_180)));
                     }
                  }
               }
            }
         }
      }

      for (int var13 = 0; var13 < var4.id_byte; var13++) {
         for (int var15 = 0; var15 < var4.id_break; var15++) {
            rfH_2 var19 = var2.id_class(var3.id_class(rpr_3.SOUTH), 8 + (var13 - this.id_protected) * 8);
            var19 = var19.id_class(var3.id_class(rpr_3.EAST), (var15 - this.id_byte) * 8);
            boolean var22 = var5 != null && rrrR.id_class(var5, var15, var13);
            if (rrrR.id_class(var4, var15, var13) && !var22) {
               if (!rrrR.id_class(var4, var15 + 1, var13)) {
                  rfH_2 var43 = var19.id_class(var3.id_class(rpr_3.EAST), 6);
                  if (!rrrR.id_class(var4, var15, var13 + 1)) {
                     rfH_2 var11 = var43.id_class(var3.id_class(rpr_3.SOUTH), 6);
                     var1.add(new rrrY(this.id_class, "roof_corner", var11, var3));
                  } else if (rrrR.id_class(var4, var15 + 1, var13 + 1)) {
                     rfH_2 var46 = var43.id_class(var3.id_class(rpr_3.SOUTH), 5);
                     var1.add(new rrrY(this.id_class, "roof_inner_corner", var46, var3));
                  }

                  if (!rrrR.id_class(var4, var15, var13 - 1)) {
                     var1.add(new rrrY(this.id_class, "roof_corner", var43, var3.id_class(rqd_3.COUNTERCLOCKWISE_90)));
                  } else if (rrrR.id_class(var4, var15 + 1, var13 - 1)) {
                     rfH_2 var47 = var19.id_class(var3.id_class(rpr_3.EAST), 9);
                     var47 = var47.id_class(var3.id_class(rpr_3.NORTH), 2);
                     var1.add(new rrrY(this.id_class, "roof_inner_corner", var47, var3.id_class(rqd_3.CLOCKWISE_90)));
                  }
               }

               if (!rrrR.id_class(var4, var15 - 1, var13)) {
                  rfH_2 var44 = var19.id_class(var3.id_class(rpr_3.EAST), 0);
                  var44 = var44.id_class(var3.id_class(rpr_3.SOUTH), 0);
                  if (!rrrR.id_class(var4, var15, var13 + 1)) {
                     rfH_2 var49 = var44.id_class(var3.id_class(rpr_3.SOUTH), 6);
                     var1.add(new rrrY(this.id_class, "roof_corner", var49, var3.id_class(rqd_3.CLOCKWISE_90)));
                  } else if (rrrR.id_class(var4, var15 - 1, var13 + 1)) {
                     rfH_2 var50 = var44.id_class(var3.id_class(rpr_3.SOUTH), 8);
                     var50 = var50.id_class(var3.id_class(rpr_3.WEST), 3);
                     var1.add(new rrrY(this.id_class, "roof_inner_corner", var50, var3.id_class(rqd_3.COUNTERCLOCKWISE_90)));
                  }

                  if (!rrrR.id_class(var4, var15, var13 - 1)) {
                     var1.add(new rrrY(this.id_class, "roof_corner", var44, var3.id_class(rqd_3.CLOCKWISE_180)));
                  } else if (rrrR.id_class(var4, var15 - 1, var13 - 1)) {
                     rfH_2 var52 = var44.id_class(var3.id_class(rpr_3.SOUTH), 1);
                     var1.add(new rrrY(this.id_class, "roof_inner_corner", var52, var3.id_class(rqd_3.CLOCKWISE_180)));
                  }
               }
            }
         }
      }
   }

   private void id_class(List<rrrY> var1, rrro_1 var2) {
      rpr_3 var3 = var2.id_class.id_class(rpr_3.WEST);
      var1.add(new rrrY(this.id_class, "entrance", var2.id_break.id_class(var3, 9), var2.id_class));
      var2.id_break = var2.id_break.id_class(var2.id_class.id_class(rpr_3.SOUTH), 16);
   }

   private void id_class(List<rrrY> var1, rrro_1 var2, rrre_1 var3, rpr_3 var4, int var5, int var6, int var7, int var8) {
      int var9 = var5;
      int var10 = var6;
      rpr_3 var11 = var4;

      do {
         if (!rrrR.id_class(var3, var9 + var4.id_implements(), var10 + var4.id_extends())) {
            this.id_byte(var1, var2);
            var4 = var4.id_catch();
            if (var9 != var7 || var10 != var8 || var11 != var4) {
               this.id_break(var1, var2);
            }
         } else if (rrrR.id_class(var3, var9 + var4.id_implements(), var10 + var4.id_extends())
            && rrrR.id_class(var3, var9 + var4.id_implements() + var4.id_private().id_implements(), var10 + var4.id_extends() + var4.id_private().id_extends())
            )
          {
            this.id_protected(var1, var2);
            var9 += var4.id_implements();
            var10 += var4.id_extends();
            var4 = var4.id_private();
         } else {
            var9 += var4.id_implements();
            var10 += var4.id_extends();
            if (var9 != var7 || var10 != var8 || var11 != var4) {
               this.id_break(var1, var2);
            }
         }
      } while (var9 != var7 || var10 != var8 || var11 != var4);
   }

   private void id_break(List<rrrY> var1, rrro_1 var2) {
      var1.add(new rrrY(this.id_class, var2.id_byte, var2.id_break.id_class(var2.id_class.id_class(rpr_3.EAST), 7), var2.id_class));
      var2.id_break = var2.id_break.id_class(var2.id_class.id_class(rpr_3.SOUTH), 8);
   }

   private void id_protected(List<rrrY> var1, rrro_1 var2) {
      var2.id_break = var2.id_break.id_class(var2.id_class.id_class(rpr_3.SOUTH), 6);
      var2.id_break = var2.id_break.id_class(var2.id_class.id_class(rpr_3.EAST), 8);
      var2.id_class = var2.id_class.id_class(rqd_3.COUNTERCLOCKWISE_90);
   }
}
