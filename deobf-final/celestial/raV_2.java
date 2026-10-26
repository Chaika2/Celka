package celestial;

import java.util.List;
import java.util.Random;

public class raV_2 extends raR_2 {
   private final boolean break_;
   private final boolean byte_;
   private boolean protected_;
   private final int throws_;

   public raV_2(int var1, Random var2, rfi_3 var3, rpr_3 var4, raU_2 var5) {
      super(raF_2.class_, var1, var5);
      this.class_(var4);
      this.final_ = var3;
      this.break_ = var2.nextInt(3) == 0;
      this.byte_ = !this.break_ && var2.nextInt(23) == 0;
      if (this.implements_().final_() == rpB_2.Z) {
         this.throws_ = var3.case_() / 5;
      } else {
         this.throws_ = var3.protected_() / 5;
      }
   }

   public raV_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.class_, var2);
      this.break_ = var2.new_("hr");
      this.byte_ = var2.new_("sc");
      this.protected_ = var2.new_("hps");
      this.throws_ = var2.private_("Num");
   }

   @Override
   protected boolean class_(rRI var1, rfi_3 var2, Random var3, int var4, int var5, int var6, rqO_2 var7) {
      rfH_2 var8 = new rfH_2(this.class_(var4, var6), this.class_(var5), this.break_(var4, var6));
      if (var2.break_(var8) && var1.byte_(var8).catch_() && !var1.byte_(var8.break_()).catch_()) {
         xc_3 var9 = xu_3.Px.continue_().class_(Wh_1.package_, var3.nextBoolean() ? rCR.NORTH_SOUTH : rCR.EAST_WEST);
         this.class_(var1, var9, var4, var5, var6, var2);
         rsk_3 var10 = new rsk_3(var1.byte_(), (double)var8.b_() + 0.5, (double)var8.c_() + 0.5, (double)var8.d_() + 0.5);
         var10.class_(var7, var3.nextLong());
         var1.a_(var10);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.class_(var1, var5)) {
         return false;
      } else {
         boolean var8 = false;
         byte var9 = 2;
         boolean var10 = false;
         byte var11 = 2;
         int var12 = this.throws_ * 5 - 1;
         xc_3 var13 = this.break_();
         this.class_(var1, var5, 0, 0, 0, 2, 1, var12, volatile_, volatile_, false);
         this.class_(var1, var5, var4, 0.8F, 0, 2, 0, 2, 2, var12, volatile_, volatile_, false, false);
         if (this.byte_) {
            this.class_(var1, var5, var4, 0.6F, 0, 0, 0, 2, 1, var12, xu_3.U.continue_(), volatile_, false, true);
         }

         for (int var14 = 0; var14 < this.throws_; var14++) {
            int var15 = 2 + var14 * 5;
            this.class_(var1, var5, 0, 0, var15, 2, 2, var4);
            this.class_(var1, var5, var4, 0.1F, 0, 2, var15 - 1);
            this.class_(var1, var5, var4, 0.1F, 2, 2, var15 - 1);
            this.class_(var1, var5, var4, 0.1F, 0, 2, var15 + 1);
            this.class_(var1, var5, var4, 0.1F, 2, 2, var15 + 1);
            this.class_(var1, var5, var4, 0.05F, 0, 2, var15 - 2);
            this.class_(var1, var5, var4, 0.05F, 2, 2, var15 - 2);
            this.class_(var1, var5, var4, 0.05F, 0, 2, var15 + 2);
            this.class_(var1, var5, var4, 0.05F, 2, 2, var15 + 2);
            if (var4.nextInt(100) == 0) {
               this.class_(var1, var5, var4, 2, 0, var15 - 1, rzl_3.else_);
            }

            if (var4.nextInt(100) == 0) {
               this.class_(var1, var5, var4, 0, 0, var15 + 1, rzl_3.else_);
            }

            if (this.byte_ && !this.protected_) {
               int var16 = this.class_(0);
               int var17 = var15 - 1 + var4.nextInt(3);
               int var18 = this.class_(1, var17);
               int var19 = this.break_(1, var17);
               rfH_2 var20 = new rfH_2(var18, var16, var19);
               if (var5.break_(var20) && this.class_(var1, 1, 0, var17, var5)) {
                  this.protected_ = true;
                  var1.class_(var20, xu_3.rD.continue_(), 2);
                  ryO_2 var21 = var1.class_(var20);
                  if (var21 instanceof rHU) {
                     ((rHU)var21).catch_().class_(aI_2.implements_);
                  }
               }
            }
         }

         for (int var22 = 0; var22 <= 2; var22++) {
            for (int var24 = 0; var24 <= var12; var24++) {
               byte var26 = -1;
               xc_3 var28 = this.class_(var1, var22, -1, var24, var5);
               if (var28.catch_() && this.class_(var1, var22, -1, var24, var5)) {
                  byte var30 = -1;
                  this.class_(var1, var13, var22, -1, var24, var5);
               }
            }
         }

         if (this.break_) {
            xc_3 var23 = xu_3.Px.continue_().class_(Wh_1.package_, rCR.NORTH_SOUTH);

            for (int var25 = 0; var25 <= var12; var25++) {
               xc_3 var27 = this.class_(var1, 1, -1, var25, var5);
               if (!var27.catch_() && var27.implements_(var1, new rfH_2(this.class_(1, var25), this.class_(-1), this.break_(1, var25)))) {
                  float var29 = this.class_(var1, 1, 0, var25, var5) ? 0.7F : 0.9F;
                  this.class_(var1, var5, var4, var29, 1, 0, var25, var23);
               }
            }
         }

         return true;
      }
   }

   private void class_(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, Random var8) {
      if (this.class_(var1, var2, var3, var7, var6, var5)) {
         xc_3 var9 = this.break_();
         xc_3 var10 = this.byte_();
         this.class_(var1, var2, var3, var4, var5, var3, var6 - 1, var5, var10.class_(dp_3.int_, Boolean.valueOf(true)), volatile_, false);
         this.class_(var1, var2, var7, var4, var5, var7, var6 - 1, var5, var10.class_(dp_3.final_, Boolean.valueOf(true)), volatile_, false);
         if (var8.nextInt(4) == 0) {
            this.class_(var1, var2, var3, var6, var5, var3, var6, var5, var9, volatile_, false);
            this.class_(var1, var2, var7, var6, var5, var7, var6, var5, var9, volatile_, false);
         } else {
            this.class_(var1, var2, var3, var6, var5, var7, var6, var5, var9, volatile_, false);
            this.class_(var1, var2, var8, 0.05F, var3 + 1, var6, var5 - 1, xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.NORTH));
            this.class_(var1, var2, var8, 0.05F, var3 + 1, var6, var5 + 1, xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.SOUTH));
         }
      }
   }

   private void class_(rRI var1, rfi_3 var2, Random var3, float var4, int var5, int var6, int var7) {
      if (this.class_(var1, var5, var6, var7, var2)) {
         this.class_(var1, var2, var3, var4, var5, var6, var7, xu_3.U.continue_());
      }
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      int var4 = this.private_();
      int var5 = var3.nextInt(4);
      rpr_3 var6 = this.implements_();
      if (var6 != null) {
         switch (var6) {
            case NORTH:
            default:
               if (var5 <= 1) {
                  raf_3.class_(var1, var2, var3, this.final_.class_, this.final_.break_ - 1 + var3.nextInt(3), this.final_.byte_ - 1, var6, var4);
               } else if (var5 == 2) {
                  raf_3.class_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_ - 1 + var3.nextInt(3), this.final_.byte_, rpr_3.WEST, var4);
               } else {
                  raf_3.class_(var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ - 1 + var3.nextInt(3), this.final_.byte_, rpr_3.EAST, var4);
               }
               break;
            case SOUTH:
               if (var5 <= 1) {
                  raf_3.class_(var1, var2, var3, this.final_.class_, this.final_.break_ - 1 + var3.nextInt(3), this.final_.case_ + 1, var6, var4);
               } else if (var5 == 2) {
                  raf_3.class_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_ - 1 + var3.nextInt(3), this.final_.case_ - 3, rpr_3.WEST, var4);
               } else {
                  raf_3.class_(var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ - 1 + var3.nextInt(3), this.final_.case_ - 3, rpr_3.EAST, var4);
               }
               break;
            case WEST:
               if (var5 <= 1) {
                  raf_3.class_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_ - 1 + var3.nextInt(3), this.final_.byte_, var6, var4);
               } else if (var5 == 2) {
                  raf_3.class_(var1, var2, var3, this.final_.class_, this.final_.break_ - 1 + var3.nextInt(3), this.final_.byte_ - 1, rpr_3.NORTH, var4);
               } else {
                  raf_3.class_(var1, var2, var3, this.final_.class_, this.final_.break_ - 1 + var3.nextInt(3), this.final_.case_ + 1, rpr_3.SOUTH, var4);
               }
               break;
            case EAST:
               if (var5 <= 1) {
                  raf_3.class_(var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ - 1 + var3.nextInt(3), this.final_.byte_, var6, var4);
               } else if (var5 == 2) {
                  raf_3.class_(var1, var2, var3, this.final_.protected_ - 3, this.final_.break_ - 1 + var3.nextInt(3), this.final_.byte_ - 1, rpr_3.NORTH, var4);
               } else {
                  raf_3.class_(var1, var2, var3, this.final_.protected_ - 3, this.final_.break_ - 1 + var3.nextInt(3), this.final_.case_ + 1, rpr_3.SOUTH, var4);
               }
         }
      }

      if (var4 < 8) {
         if (var6 != rpr_3.NORTH && var6 != rpr_3.SOUTH) {
            for (int var9 = this.final_.class_ + 3; var9 + 3 <= this.final_.protected_; var9 += 5) {
               int var10 = var3.nextInt(5);
               if (var10 == 0) {
                  raf_3.class_(var1, var2, var3, var9, this.final_.break_, this.final_.byte_ - 1, rpr_3.NORTH, var4 + 1);
               } else if (var10 == 1) {
                  raf_3.class_(var1, var2, var3, var9, this.final_.break_, this.final_.case_ + 1, rpr_3.SOUTH, var4 + 1);
               }
            }
         } else {
            for (int var7 = this.final_.byte_ + 3; var7 + 3 <= this.final_.case_; var7 += 5) {
               int var8 = var3.nextInt(5);
               if (var8 == 0) {
                  raf_3.class_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_, var7, rpr_3.WEST, var4 + 1);
               } else if (var8 == 1) {
                  raf_3.class_(var1, var2, var3, this.final_.protected_ + 1, this.final_.break_, var7, rpr_3.EAST, var4 + 1);
               }
            }
         }
      }
   }

   public static rfi_3 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5) {
      rfi_3 var6 = new rfi_3(var2, var3, var4, var2, var3 + 3 - 1, var4);

      int var7;
      for (var7 = var1.nextInt(3) + 2; var7 > 0; var7--) {
         int var8 = var7 * 5;
         switch (var5) {
            case NORTH:
            default:
               var6.protected_ = var2 + 3 - 1;
               var6.byte_ = var4 - (var8 - 1);
               break;
            case SOUTH:
               var6.protected_ = var2 + 3 - 1;
               var6.case_ = var4 + var8 - 1;
               break;
            case WEST:
               var6.class_ = var2 - (var8 - 1);
               var6.case_ = var4 + 3 - 1;
               break;
            case EAST:
               var6.protected_ = var2 + var8 - 1;
               var6.case_ = var4 + 3 - 1;
         }

         if (rrrn_1.class_(var0, var6) == null) {
            break;
         }
      }

      return var7 > 0 ? var6 : null;
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("hr", this.break_);
      var1.class_("sc", this.byte_);
      var1.class_("hps", this.protected_);
      var1.break_("Num", this.throws_);
   }
}
