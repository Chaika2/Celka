package celestial;

import java.util.List;
import java.util.Random;

public class raV_2 extends raR_2 {
   private final boolean id_break;
   private final boolean id_byte;
   private boolean id_protected;
   private final int id_throws;

   public raV_2(int var1, Random var2, rfi_3 var3, rpr_3 var4, raU_2 var5) {
      super(raF_2.id_class, var1, var5);
      this.id_class(var4);
      this.id_final = var3;
      this.id_break = var2.nextInt(3) == 0;
      this.id_byte = !this.id_break && var2.nextInt(23) == 0;
      if (this.id_implements().id_final() == rpB_2.Z) {
         this.id_throws = var3.id_case() / 5;
      } else {
         this.id_throws = var3.id_protected() / 5;
      }
   }

   public raV_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_class, var2);
      this.id_break = var2.id_new("hr");
      this.id_byte = var2.id_new("sc");
      this.id_protected = var2.id_new("hps");
      this.id_throws = var2.id_private("Num");
   }

   @Override
   protected boolean id_class(rRI var1, rfi_3 var2, Random var3, int var4, int var5, int var6, rqO_2 var7) {
      rfH_2 var8 = new rfH_2(this.id_class(var4, var6), this.id_class(var5), this.id_break(var4, var6));
      if (var2.id_break(var8) && var1.id_byte(var8).id_catch() && !var1.id_byte(var8.id_break()).id_catch()) {
         xc_3 var9 = xu_3.Px.id_continue().id_class(Wh_1.id_package, var3.nextBoolean() ? rCR.NORTH_SOUTH : rCR.EAST_WEST);
         this.id_class(var1, var9, var4, var5, var6, var2);
         rsk_3 var10 = new rsk_3(var1.id_byte(), (double)var8.b_() + 0.5, (double)var8.c_() + 0.5, (double)var8.d_() + 0.5);
         var10.id_class(var7, var3.nextLong());
         var1.a_(var10);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.id_class(var1, var5)) {
         return false;
      } else {
         boolean var8 = false;
         byte var9 = 2;
         boolean var10 = false;
         byte var11 = 2;
         int var12 = this.id_throws * 5 - 1;
         xc_3 var13 = this.id_break();
         this.id_class(var1, var5, 0, 0, 0, 2, 1, var12, id_volatile, id_volatile, false);
         this.id_class(var1, var5, var4, 0.8F, 0, 2, 0, 2, 2, var12, id_volatile, id_volatile, false, false);
         if (this.id_byte) {
            this.id_class(var1, var5, var4, 0.6F, 0, 0, 0, 2, 1, var12, xu_3.U.id_continue(), id_volatile, false, true);
         }

         for (int var14 = 0; var14 < this.id_throws; var14++) {
            int var15 = 2 + var14 * 5;
            this.id_class(var1, var5, 0, 0, var15, 2, 2, var4);
            this.id_class(var1, var5, var4, 0.1F, 0, 2, var15 - 1);
            this.id_class(var1, var5, var4, 0.1F, 2, 2, var15 - 1);
            this.id_class(var1, var5, var4, 0.1F, 0, 2, var15 + 1);
            this.id_class(var1, var5, var4, 0.1F, 2, 2, var15 + 1);
            this.id_class(var1, var5, var4, 0.05F, 0, 2, var15 - 2);
            this.id_class(var1, var5, var4, 0.05F, 2, 2, var15 - 2);
            this.id_class(var1, var5, var4, 0.05F, 0, 2, var15 + 2);
            this.id_class(var1, var5, var4, 0.05F, 2, 2, var15 + 2);
            if (var4.nextInt(100) == 0) {
               this.id_class(var1, var5, var4, 2, 0, var15 - 1, rzl_3.id_else);
            }

            if (var4.nextInt(100) == 0) {
               this.id_class(var1, var5, var4, 0, 0, var15 + 1, rzl_3.id_else);
            }

            if (this.id_byte && !this.id_protected) {
               int var16 = this.id_class(0);
               int var17 = var15 - 1 + var4.nextInt(3);
               int var18 = this.id_class(1, var17);
               int var19 = this.id_break(1, var17);
               rfH_2 var20 = new rfH_2(var18, var16, var19);
               if (var5.id_break(var20) && this.id_class(var1, 1, 0, var17, var5)) {
                  this.id_protected = true;
                  var1.id_class(var20, xu_3.rD.id_continue(), 2);
                  ryO_2 var21 = var1.id_class(var20);
                  if (var21 instanceof rHU) {
                     ((rHU)var21).id_catch().id_class(aI_2.id_implements);
                  }
               }
            }
         }

         for (int var22 = 0; var22 <= 2; var22++) {
            for (int var24 = 0; var24 <= var12; var24++) {
               byte var26 = -1;
               xc_3 var28 = this.id_class(var1, var22, -1, var24, var5);
               if (var28.id_catch() && this.id_class(var1, var22, -1, var24, var5)) {
                  byte var30 = -1;
                  this.id_class(var1, var13, var22, -1, var24, var5);
               }
            }
         }

         if (this.id_break) {
            xc_3 var23 = xu_3.Px.id_continue().id_class(Wh_1.id_package, rCR.NORTH_SOUTH);

            for (int var25 = 0; var25 <= var12; var25++) {
               xc_3 var27 = this.id_class(var1, 1, -1, var25, var5);
               if (!var27.id_catch() && var27.id_implements(var1, new rfH_2(this.id_class(1, var25), this.id_class(-1), this.id_break(1, var25)))) {
                  float var29 = this.id_class(var1, 1, 0, var25, var5) ? 0.7F : 0.9F;
                  this.id_class(var1, var5, var4, var29, 1, 0, var25, var23);
               }
            }
         }

         return true;
      }
   }

   private void id_class(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, Random var8) {
      if (this.id_class(var1, var2, var3, var7, var6, var5)) {
         xc_3 var9 = this.id_break();
         xc_3 var10 = this.id_byte();
         this.id_class(var1, var2, var3, var4, var5, var3, var6 - 1, var5, var10.id_class(dp_3.id_int, Boolean.valueOf(true)), id_volatile, false);
         this.id_class(var1, var2, var7, var4, var5, var7, var6 - 1, var5, var10.id_class(dp_3.id_final, Boolean.valueOf(true)), id_volatile, false);
         if (var8.nextInt(4) == 0) {
            this.id_class(var1, var2, var3, var6, var5, var3, var6, var5, var9, id_volatile, false);
            this.id_class(var1, var2, var7, var6, var5, var7, var6, var5, var9, id_volatile, false);
         } else {
            this.id_class(var1, var2, var3, var6, var5, var7, var6, var5, var9, id_volatile, false);
            this.id_class(var1, var2, var8, 0.05F, var3 + 1, var6, var5 - 1, xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.NORTH));
            this.id_class(var1, var2, var8, 0.05F, var3 + 1, var6, var5 + 1, xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.SOUTH));
         }
      }
   }

   private void id_class(rRI var1, rfi_3 var2, Random var3, float var4, int var5, int var6, int var7) {
      if (this.id_class(var1, var5, var6, var7, var2)) {
         this.id_class(var1, var2, var3, var4, var5, var6, var7, xu_3.U.id_continue());
      }
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      int var4 = this.id_private();
      int var5 = var3.nextInt(4);
      rpr_3 var6 = this.id_implements();
      if (var6 != null) {
         switch (var6) {
            case NORTH:
            default:
               if (var5 <= 1) {
                  raf_3.id_class(var1, var2, var3, this.id_final.id_class, this.id_final.id_break - 1 + var3.nextInt(3), this.id_final.id_byte - 1, var6, var4);
               } else if (var5 == 2) {
                  raf_3.id_class(
                     var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break - 1 + var3.nextInt(3), this.id_final.id_byte, rpr_3.WEST, var4
                  );
               } else {
                  raf_3.id_class(
                     var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break - 1 + var3.nextInt(3), this.id_final.id_byte, rpr_3.EAST, var4
                  );
               }
               break;
            case SOUTH:
               if (var5 <= 1) {
                  raf_3.id_class(var1, var2, var3, this.id_final.id_class, this.id_final.id_break - 1 + var3.nextInt(3), this.id_final.id_case + 1, var6, var4);
               } else if (var5 == 2) {
                  raf_3.id_class(
                     var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break - 1 + var3.nextInt(3), this.id_final.id_case - 3, rpr_3.WEST, var4
                  );
               } else {
                  raf_3.id_class(
                     var1,
                     var2,
                     var3,
                     this.id_final.id_protected + 1,
                     this.id_final.id_break - 1 + var3.nextInt(3),
                     this.id_final.id_case - 3,
                     rpr_3.EAST,
                     var4
                  );
               }
               break;
            case WEST:
               if (var5 <= 1) {
                  raf_3.id_class(var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break - 1 + var3.nextInt(3), this.id_final.id_byte, var6, var4);
               } else if (var5 == 2) {
                  raf_3.id_class(
                     var1, var2, var3, this.id_final.id_class, this.id_final.id_break - 1 + var3.nextInt(3), this.id_final.id_byte - 1, rpr_3.NORTH, var4
                  );
               } else {
                  raf_3.id_class(
                     var1, var2, var3, this.id_final.id_class, this.id_final.id_break - 1 + var3.nextInt(3), this.id_final.id_case + 1, rpr_3.SOUTH, var4
                  );
               }
               break;
            case EAST:
               if (var5 <= 1) {
                  raf_3.id_class(
                     var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break - 1 + var3.nextInt(3), this.id_final.id_byte, var6, var4
                  );
               } else if (var5 == 2) {
                  raf_3.id_class(
                     var1,
                     var2,
                     var3,
                     this.id_final.id_protected - 3,
                     this.id_final.id_break - 1 + var3.nextInt(3),
                     this.id_final.id_byte - 1,
                     rpr_3.NORTH,
                     var4
                  );
               } else {
                  raf_3.id_class(
                     var1,
                     var2,
                     var3,
                     this.id_final.id_protected - 3,
                     this.id_final.id_break - 1 + var3.nextInt(3),
                     this.id_final.id_case + 1,
                     rpr_3.SOUTH,
                     var4
                  );
               }
         }
      }

      if (var4 < 8) {
         if (var6 != rpr_3.NORTH && var6 != rpr_3.SOUTH) {
            for (int var9 = this.id_final.id_class + 3; var9 + 3 <= this.id_final.id_protected; var9 += 5) {
               int var10 = var3.nextInt(5);
               if (var10 == 0) {
                  raf_3.id_class(var1, var2, var3, var9, this.id_final.id_break, this.id_final.id_byte - 1, rpr_3.NORTH, var4 + 1);
               } else if (var10 == 1) {
                  raf_3.id_class(var1, var2, var3, var9, this.id_final.id_break, this.id_final.id_case + 1, rpr_3.SOUTH, var4 + 1);
               }
            }
         } else {
            for (int var7 = this.id_final.id_byte + 3; var7 + 3 <= this.id_final.id_case; var7 += 5) {
               int var8 = var3.nextInt(5);
               if (var8 == 0) {
                  raf_3.id_class(var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break, var7, rpr_3.WEST, var4 + 1);
               } else if (var8 == 1) {
                  raf_3.id_class(var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break, var7, rpr_3.EAST, var4 + 1);
               }
            }
         }
      }
   }

   public static rfi_3 id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5) {
      rfi_3 var6 = new rfi_3(var2, var3, var4, var2, var3 + 3 - 1, var4);

      int var7;
      for (var7 = var1.nextInt(3) + 2; var7 > 0; var7--) {
         int var8 = var7 * 5;
         switch (var5) {
            case NORTH:
            default:
               var6.id_protected = var2 + 3 - 1;
               var6.id_byte = var4 - (var8 - 1);
               break;
            case SOUTH:
               var6.id_protected = var2 + 3 - 1;
               var6.id_case = var4 + var8 - 1;
               break;
            case WEST:
               var6.id_class = var2 - (var8 - 1);
               var6.id_case = var4 + 3 - 1;
               break;
            case EAST:
               var6.id_protected = var2 + var8 - 1;
               var6.id_case = var4 + 3 - 1;
         }

         if (rrrn_1.id_class(var0, var6) == null) {
            break;
         }
      }

      return var7 > 0 ? var6 : null;
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("hr", this.id_break);
      var1.id_class("sc", this.id_byte);
      var1.id_class("hps", this.id_protected);
      var1.id_break("Num", this.id_throws);
   }
}
