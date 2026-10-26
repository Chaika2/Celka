package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class rix_3 extends riW_2 {
   private riz_3 int_;
   private riz_3 new_;
   private final List<riW_2> continue_ = Lists.newArrayList();

   private void byte_(rRI var1, Random var2, rfi_3 var3) {
      if (this.class_(var3, 21, 21, 36, 36)) {
         this.class_(var1, var3, 21, 0, 22, 36, 0, 36, class_, class_, false);
         this.class_(var1, var3, 21, 1, 22, 36, 23, 36);

         for (int var4 = 0; var4 < 4; var4++) {
            this.class_(var1, var3, 21 + var4, 13 + var4, 21 + var4, 36 - var4, 13 + var4, 21 + var4, break_, break_, false);
            this.class_(var1, var3, 21 + var4, 13 + var4, 36 - var4, 36 - var4, 13 + var4, 36 - var4, break_, break_, false);
            this.class_(var1, var3, 21 + var4, 13 + var4, 22 + var4, 21 + var4, 13 + var4, 35 - var4, break_, break_, false);
            this.class_(var1, var3, 36 - var4, 13 + var4, 22 + var4, 36 - var4, 13 + var4, 35 - var4, break_, break_, false);
         }

         this.class_(var1, var3, 25, 16, 25, 32, 16, 32, class_, class_, false);
         this.class_(var1, var3, 25, 17, 25, 25, 19, 25, break_, break_, false);
         this.class_(var1, var3, 32, 17, 25, 32, 19, 25, break_, break_, false);
         this.class_(var1, var3, 25, 17, 32, 25, 19, 32, break_, break_, false);
         this.class_(var1, var3, 32, 17, 32, 32, 19, 32, break_, break_, false);
         this.class_(var1, break_, 26, 20, 26, var3);
         this.class_(var1, break_, 27, 21, 27, var3);
         this.class_(var1, throws_, 27, 20, 27, var3);
         this.class_(var1, break_, 26, 20, 31, var3);
         this.class_(var1, break_, 27, 21, 30, var3);
         this.class_(var1, throws_, 27, 20, 30, var3);
         this.class_(var1, break_, 31, 20, 31, var3);
         this.class_(var1, break_, 30, 21, 30, var3);
         this.class_(var1, throws_, 30, 20, 30, var3);
         this.class_(var1, break_, 31, 20, 26, var3);
         this.class_(var1, break_, 30, 21, 27, var3);
         this.class_(var1, throws_, 30, 20, 27, var3);
         this.class_(var1, var3, 28, 21, 27, 29, 21, 27, class_, class_, false);
         this.class_(var1, var3, 27, 21, 28, 27, 21, 29, class_, class_, false);
         this.class_(var1, var3, 28, 21, 30, 29, 21, 30, class_, class_, false);
         this.class_(var1, var3, 30, 21, 28, 30, 21, 29, class_, class_, false);
      }
   }

   public rix_3(Random var1, int var2, int var3, rpr_3 var4) {
      super(raF_2.default_, 0);
      this.class_(var4);
      rpr_3 var5 = this.implements_();
      if (var5.final_() == rpB_2.Z) {
         this.final_ = new rfi_3(var2, 39, var3, var2 + 58 - 1, 61, var3 + 58 - 1);
      } else {
         this.final_ = new rfi_3(var2, 39, var3, var2 + 58 - 1, 61, var3 + 58 - 1);
      }

      List var6 = this.class_(var1);
      this.int_.protected_ = true;
      this.continue_.add(new riO_2(var5, this.int_));
      this.continue_.add(new rid_3(var5, this.new_));
      ArrayList var7 = Lists.newArrayList();
      var7.add(new rim_3());
      var7.add(new riv_3());
      var7.add(new riF_2());
      var7.add(new riu_3());
      var7.add(new riZ_2());
      var7.add(new riX_2());
      var7.add(new rih_3());

      for (riz_3 var9 : var6) {
         if (!var9.protected_ && !var9.break_()) {
            for (riJ_2 var11 : var7) {
               if (var11.class_(var9)) {
                  this.continue_.add(var11.class_(var5, var9, var1));
                  break;
               }
            }
         }
      }

      int var15 = this.final_.break_;
      int var16 = this.class_(9, 22);
      int var17 = this.break_(9, 22);

      for (riW_2 var12 : this.continue_) {
         var12.catch_().class_(var16, var15, var17);
      }

      rfi_3 var19 = rfi_3.class_(this.class_(1, 1), this.class_(1), this.break_(1, 1), this.class_(23, 21), this.class_(8), this.break_(23, 21));
      rfi_3 var20 = rfi_3.class_(this.class_(34, 1), this.class_(1), this.break_(34, 1), this.class_(56, 21), this.class_(8), this.break_(56, 21));
      rfi_3 var13 = rfi_3.class_(this.class_(22, 22), this.class_(13), this.break_(22, 22), this.class_(35, 35), this.class_(17), this.break_(35, 35));
      int var14 = var1.nextInt();
      this.continue_.add(new ric_3(var5, var19, var14++));
      this.continue_.add(new ric_3(var5, var20, var14++));
      this.continue_.add(new rik_3(var5, var13));
   }

   public rix_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.default_, var2);
   }

   private void class_(rRI var1, Random var2, rfi_3 var3) {
      if (this.class_(var3, 22, 5, 35, 17)) {
         this.class_(var1, var3, 25, 0, 0, 32, 8, 20);

         for (int var4 = 0; var4 < 4; var4++) {
            this.class_(var1, var3, 24, 2, 5 + var4 * 4, 24, 4, 5 + var4 * 4, break_, break_, false);
            this.class_(var1, var3, 22, 4, 5 + var4 * 4, 23, 4, 5 + var4 * 4, break_, break_, false);
            this.class_(var1, break_, 25, 5, 5 + var4 * 4, var3);
            this.class_(var1, break_, 26, 6, 5 + var4 * 4, var3);
            this.class_(var1, throws_, 26, 5, 5 + var4 * 4, var3);
            this.class_(var1, var3, 33, 2, 5 + var4 * 4, 33, 4, 5 + var4 * 4, break_, break_, false);
            this.class_(var1, var3, 34, 4, 5 + var4 * 4, 35, 4, 5 + var4 * 4, break_, break_, false);
            this.class_(var1, break_, 32, 5, 5 + var4 * 4, var3);
            this.class_(var1, break_, 31, 6, 5 + var4 * 4, var3);
            this.class_(var1, throws_, 31, 5, 5 + var4 * 4, var3);
            this.class_(var1, var3, 27, 6, 5 + var4 * 4, 30, 6, 5 + var4 * 4, class_, class_, false);
         }
      }
   }

   private void class_(boolean var1, int var2, rRI var3, Random var4, rfi_3 var5) {
      byte var6 = 24;
      if (this.class_(var5, var2, 0, var2 + 23, 20)) {
         this.class_(var3, var5, var2 + 0, 0, 0, var2 + 24, 0, 20, class_, class_, false);
         this.class_(var3, var5, var2 + 0, 1, 0, var2 + 24, 10, 20);

         for (int var7 = 0; var7 < 4; var7++) {
            this.class_(var3, var5, var2 + var7, var7 + 1, var7, var2 + var7, var7 + 1, 20, break_, break_, false);
            this.class_(var3, var5, var2 + var7 + 7, var7 + 5, var7 + 7, var2 + var7 + 7, var7 + 5, 20, break_, break_, false);
            this.class_(var3, var5, var2 + 17 - var7, var7 + 5, var7 + 7, var2 + 17 - var7, var7 + 5, 20, break_, break_, false);
            this.class_(var3, var5, var2 + 24 - var7, var7 + 1, var7, var2 + 24 - var7, var7 + 1, 20, break_, break_, false);
            this.class_(var3, var5, var2 + var7 + 1, var7 + 1, var7, var2 + 23 - var7, var7 + 1, var7, break_, break_, false);
            this.class_(var3, var5, var2 + var7 + 8, var7 + 5, var7 + 7, var2 + 16 - var7, var7 + 5, var7 + 7, break_, break_, false);
         }

         this.class_(var3, var5, var2 + 4, 4, 4, var2 + 6, 4, 20, class_, class_, false);
         this.class_(var3, var5, var2 + 7, 4, 4, var2 + 17, 4, 6, class_, class_, false);
         this.class_(var3, var5, var2 + 18, 4, 4, var2 + 20, 4, 20, class_, class_, false);
         this.class_(var3, var5, var2 + 11, 8, 11, var2 + 13, 8, 20, class_, class_, false);
         this.class_(var3, protected_, var2 + 12, 9, 12, var5);
         this.class_(var3, protected_, var2 + 12, 9, 15, var5);
         this.class_(var3, protected_, var2 + 12, 9, 18, var5);
         int var11 = var2 + (var1 ? 19 : 5);
         int var8 = var2 + (var1 ? 5 : 19);

         for (byte var9 = 20; var9 >= 5; var9 -= 3) {
            this.class_(var3, protected_, var11, 5, var9, var5);
         }

         for (byte var12 = 19; var12 >= 7; var12 -= 3) {
            this.class_(var3, protected_, var8, 5, var12, var5);
         }

         for (int var13 = 0; var13 < 4; var13++) {
            int var10 = var1 ? var2 + 24 - (17 - var13 * 3) : var2 + 17 - var13 * 3;
            this.class_(var3, protected_, var10, 5, 5, var5);
         }

         this.class_(var3, protected_, var8, 5, 5, var5);
         this.class_(var3, var5, var2 + 11, 1, 12, var2 + 13, 7, 12, class_, class_, false);
         this.class_(var3, var5, var2 + 12, 1, 11, var2 + 12, 7, 13, class_, class_, false);
      }
   }

   private List<riz_3> class_(Random var1) {
      riz_3[] var2 = new riz_3[75];

      for (int var3 = 0; var3 < 5; var3++) {
         for (int var4 = 0; var4 < 4; var4++) {
            boolean var5 = false;
            int var6 = break_(var3, 0, var4);
            var2[var6] = new riz_3(var6);
         }
      }

      for (int var15 = 0; var15 < 5; var15++) {
         for (int var19 = 0; var19 < 4; var19++) {
            boolean var23 = true;
            int var27 = break_(var15, 1, var19);
            var2[var27] = new riz_3(var27);
         }
      }

      for (int var16 = 1; var16 < 4; var16++) {
         for (int var20 = 0; var20 < 2; var20++) {
            byte var24 = 2;
            int var28 = break_(var16, 2, var20);
            var2[var28] = new riz_3(var28);
         }
      }

      this.int_ = var2[private_];

      for (int var17 = 0; var17 < 5; var17++) {
         for (int var21 = 0; var21 < 5; var21++) {
            for (int var25 = 0; var25 < 3; var25++) {
               int var29 = break_(var17, var25, var21);
               if (var2[var29] != null) {
                  for (rpr_3 var10 : rpr_3.values()) {
                     int var11 = var17 + var10.implements_();
                     int var12 = var25 + var10.finally_();
                     int var13 = var21 + var10.extends_();
                     if (var11 >= 0 && var11 < 5 && var13 >= 0 && var13 < 5 && var12 >= 0 && var12 < 3) {
                        int var14 = break_(var11, var12, var13);
                        if (var2[var14] != null) {
                           if (var13 == var21) {
                              var2[var29].class_(var10, var2[var14]);
                           } else {
                              var2[var29].class_(var10.case_(), var2[var14]);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      riz_3 var18 = new riz_3(1003);
      riz_3 var22 = new riz_3(1001);
      riz_3 var26 = new riz_3(1002);
      var2[implements_].class_(rpr_3.UP, var18);
      var2[finally_].class_(rpr_3.SOUTH, var22);
      var2[extends_].class_(rpr_3.SOUTH, var26);
      var18.protected_ = true;
      var22.protected_ = true;
      var26.protected_ = true;
      this.int_.throws_ = true;
      this.new_ = var2[break_(var1.nextInt(4), 0, 2)];
      this.new_.protected_ = true;
      this.new_.break_[rpr_3.EAST.byte_()].protected_ = true;
      this.new_.break_[rpr_3.NORTH.byte_()].protected_ = true;
      this.new_.break_[rpr_3.EAST.byte_()].break_[rpr_3.NORTH.byte_()].protected_ = true;
      this.new_.break_[rpr_3.UP.byte_()].protected_ = true;
      this.new_.break_[rpr_3.EAST.byte_()].break_[rpr_3.UP.byte_()].protected_ = true;
      this.new_.break_[rpr_3.NORTH.byte_()].break_[rpr_3.UP.byte_()].protected_ = true;
      this.new_.break_[rpr_3.EAST.byte_()].break_[rpr_3.NORTH.byte_()].break_[rpr_3.UP.byte_()].protected_ = true;
      ArrayList var30 = Lists.newArrayList();

      for (riz_3 var37 : var2) {
         if (var37 != null) {
            var37.class_();
            var30.add(var37);
         }
      }

      var18.class_();
      Collections.shuffle(var30, var1);
      int var32 = 1;

      for (riz_3 var36 : var30) {
         int var38 = 0;
         int var39 = 0;

         while (var38 < 2 && var39 < 5) {
            var39++;
            int var40 = var1.nextInt(6);
            if (var36.byte_[var40]) {
               int var41 = rpr_3.class_(var40).case_().byte_();
               var36.byte_[var40] = false;
               var36.break_[var40].byte_[var41] = false;
               if (var36.class_(var32++) && var36.break_[var40].class_(var32++)) {
                  var38++;
               } else {
                  var36.byte_[var40] = true;
                  var36.break_[var40].byte_[var41] = true;
               }
            }
         }
      }

      var30.add(var18);
      var30.add(var22);
      var30.add(var26);
      return var30;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      int var8 = Math.max(var1.short_(), 64) - this.final_.break_;
      this.class_(var1, var5, 0, 0, 0, 58, var8, 58);
      this.class_(false, 0, var1, var4, var5);
      this.class_(true, 33, var1, var4, var5);
      this.class_(var1, var4, var5);
      this.break_(var1, var4, var5);
      this.byte_(var1, var4, var5);
      this.protected_(var1, var4, var5);
      this.throws_(var1, var4, var5);
      this.case_(var1, var4, var5);

      for (int var9 = 0; var9 < 7; var9++) {
         int var10 = 0;

         while (var10 < 7) {
            if (var10 == 0 && var9 == 3) {
               var10 = 6;
            }

            int var11 = var9 * 9;
            int var12 = var10 * 9;

            for (int var13 = 0; var13 < 4; var13++) {
               for (int var14 = 0; var14 < 4; var14++) {
                  this.class_(var1, break_, var11 + var13, 0, var12 + var14, var5);
                  this.break_(var1, break_, var11 + var13, -1, var12 + var14, var5);
               }
            }

            if (var9 != 0 && var9 != 6) {
               var10 += 6;
            } else {
               var10++;
            }
         }
      }

      for (int var15 = 0; var15 < 5; var15++) {
         this.class_(var1, var5, -1 - var15, 0 + var15 * 2, -1 - var15, -1 - var15, 23, 58 + var15);
         this.class_(var1, var5, 58 + var15, 0 + var15 * 2, -1 - var15, 58 + var15, 23, 58 + var15);
         this.class_(var1, var5, 0 - var15, 0 + var15 * 2, -1 - var15, 57 + var15, 23, -1 - var15);
         this.class_(var1, var5, 0 - var15, 0 + var15 * 2, 58 + var15, 57 + var15, 23, 58 + var15);
      }

      for (riW_2 var17 : this.continue_) {
         if (var17.catch_().class_(var5)) {
            var17.class_(var1, var2, var3, var4, var5, var6, var7);
         }
      }

      return true;
   }

   private void break_(rRI var1, Random var2, rfi_3 var3) {
      if (this.class_(var3, 15, 20, 42, 21)) {
         this.class_(var1, var3, 15, 0, 21, 42, 0, 21, class_, class_, false);
         this.class_(var1, var3, 26, 1, 21, 31, 3, 21);
         this.class_(var1, var3, 21, 12, 21, 36, 12, 21, class_, class_, false);
         this.class_(var1, var3, 17, 11, 21, 40, 11, 21, class_, class_, false);
         this.class_(var1, var3, 16, 10, 21, 41, 10, 21, class_, class_, false);
         this.class_(var1, var3, 15, 7, 21, 42, 9, 21, class_, class_, false);
         this.class_(var1, var3, 16, 6, 21, 41, 6, 21, class_, class_, false);
         this.class_(var1, var3, 17, 5, 21, 40, 5, 21, class_, class_, false);
         this.class_(var1, var3, 21, 4, 21, 36, 4, 21, class_, class_, false);
         this.class_(var1, var3, 22, 3, 21, 26, 3, 21, class_, class_, false);
         this.class_(var1, var3, 31, 3, 21, 35, 3, 21, class_, class_, false);
         this.class_(var1, var3, 23, 2, 21, 25, 2, 21, class_, class_, false);
         this.class_(var1, var3, 32, 2, 21, 34, 2, 21, class_, class_, false);
         this.class_(var1, var3, 28, 4, 20, 29, 4, 21, break_, break_, false);
         this.class_(var1, break_, 27, 3, 21, var3);
         this.class_(var1, break_, 30, 3, 21, var3);
         this.class_(var1, break_, 26, 2, 21, var3);
         this.class_(var1, break_, 31, 2, 21, var3);
         this.class_(var1, break_, 25, 1, 21, var3);
         this.class_(var1, break_, 32, 1, 21, var3);

         for (int var4 = 0; var4 < 7; var4++) {
            this.class_(var1, byte_, 28 - var4, 6 + var4, 21, var3);
            this.class_(var1, byte_, 29 + var4, 6 + var4, 21, var3);
         }

         for (int var5 = 0; var5 < 4; var5++) {
            this.class_(var1, byte_, 28 - var5, 9 + var5, 21, var3);
            this.class_(var1, byte_, 29 + var5, 9 + var5, 21, var3);
         }

         this.class_(var1, byte_, 28, 12, 21, var3);
         this.class_(var1, byte_, 29, 12, 21, var3);

         for (int var6 = 0; var6 < 3; var6++) {
            this.class_(var1, byte_, 22 - var6 * 2, 8, 21, var3);
            this.class_(var1, byte_, 22 - var6 * 2, 9, 21, var3);
            this.class_(var1, byte_, 35 + var6 * 2, 8, 21, var3);
            this.class_(var1, byte_, 35 + var6 * 2, 9, 21, var3);
         }

         this.class_(var1, var3, 15, 13, 21, 42, 15, 21);
         this.class_(var1, var3, 15, 1, 21, 15, 6, 21);
         this.class_(var1, var3, 16, 1, 21, 16, 5, 21);
         this.class_(var1, var3, 17, 1, 21, 20, 4, 21);
         this.class_(var1, var3, 21, 1, 21, 21, 3, 21);
         this.class_(var1, var3, 22, 1, 21, 22, 2, 21);
         this.class_(var1, var3, 23, 1, 21, 24, 1, 21);
         this.class_(var1, var3, 42, 1, 21, 42, 6, 21);
         this.class_(var1, var3, 41, 1, 21, 41, 5, 21);
         this.class_(var1, var3, 37, 1, 21, 40, 4, 21);
         this.class_(var1, var3, 36, 1, 21, 36, 3, 21);
         this.class_(var1, var3, 33, 1, 21, 34, 1, 21);
         this.class_(var1, var3, 35, 1, 21, 35, 2, 21);
      }
   }

   private void throws_(rRI var1, Random var2, rfi_3 var3) {
      if (this.class_(var3, 7, 21, 13, 50)) {
         this.class_(var1, var3, 7, 0, 21, 13, 0, 50, class_, class_, false);
         this.class_(var1, var3, 7, 1, 21, 13, 10, 50);
         this.class_(var1, var3, 11, 8, 21, 13, 8, 53, class_, class_, false);

         for (int var4 = 0; var4 < 4; var4++) {
            this.class_(var1, var3, var4 + 7, var4 + 5, 21, var4 + 7, var4 + 5, 54, break_, break_, false);
         }

         for (byte var5 = 21; var5 <= 45; var5 += 3) {
            this.class_(var1, protected_, 12, 9, var5, var3);
         }
      }

      if (this.class_(var3, 44, 21, 50, 54)) {
         this.class_(var1, var3, 44, 0, 21, 50, 0, 50, class_, class_, false);
         this.class_(var1, var3, 44, 1, 21, 50, 10, 50);
         this.class_(var1, var3, 44, 8, 21, 46, 8, 53, class_, class_, false);

         for (int var6 = 0; var6 < 4; var6++) {
            this.class_(var1, var3, 50 - var6, var6 + 5, 21, 50 - var6, var6 + 5, 54, break_, break_, false);
         }

         for (byte var7 = 21; var7 <= 45; var7 += 3) {
            this.class_(var1, protected_, 45, 9, var7, var3);
         }
      }

      if (this.class_(var3, 8, 44, 49, 54)) {
         this.class_(var1, var3, 14, 0, 44, 43, 0, 50, class_, class_, false);
         this.class_(var1, var3, 14, 1, 44, 43, 10, 50);

         for (byte var8 = 12; var8 <= 45; var8 += 3) {
            this.class_(var1, protected_, var8, 9, 45, var3);
            this.class_(var1, protected_, var8, 9, 52, var3);
            if (var8 == 12 || var8 == 18 || var8 == 24 || var8 == 33 || var8 == 39 || var8 == 45) {
               this.class_(var1, protected_, var8, 9, 47, var3);
               this.class_(var1, protected_, var8, 9, 50, var3);
               this.class_(var1, protected_, var8, 10, 45, var3);
               this.class_(var1, protected_, var8, 10, 46, var3);
               this.class_(var1, protected_, var8, 10, 51, var3);
               this.class_(var1, protected_, var8, 10, 52, var3);
               this.class_(var1, protected_, var8, 11, 47, var3);
               this.class_(var1, protected_, var8, 11, 50, var3);
               this.class_(var1, protected_, var8, 12, 48, var3);
               this.class_(var1, protected_, var8, 12, 49, var3);
            }
         }

         for (int var9 = 0; var9 < 3; var9++) {
            this.class_(var1, var3, 8 + var9, 5 + var9, 54, 49 - var9, 5 + var9, 54, class_, class_, false);
         }

         this.class_(var1, var3, 11, 8, 54, 46, 8, 54, break_, break_, false);
         this.class_(var1, var3, 14, 8, 44, 43, 8, 53, class_, class_, false);
      }
   }

   private void case_(rRI var1, Random var2, rfi_3 var3) {
      if (this.class_(var3, 14, 21, 20, 43)) {
         this.class_(var1, var3, 14, 0, 21, 20, 0, 43, class_, class_, false);
         this.class_(var1, var3, 14, 1, 22, 20, 14, 43);
         this.class_(var1, var3, 18, 12, 22, 20, 12, 39, class_, class_, false);
         this.class_(var1, var3, 18, 12, 21, 20, 12, 21, break_, break_, false);

         for (int var4 = 0; var4 < 4; var4++) {
            this.class_(var1, var3, var4 + 14, var4 + 9, 21, var4 + 14, var4 + 9, 43 - var4, break_, break_, false);
         }

         for (byte var5 = 23; var5 <= 39; var5 += 3) {
            this.class_(var1, protected_, 19, 13, var5, var3);
         }
      }

      if (this.class_(var3, 37, 21, 43, 43)) {
         this.class_(var1, var3, 37, 0, 21, 43, 0, 43, class_, class_, false);
         this.class_(var1, var3, 37, 1, 22, 43, 14, 43);
         this.class_(var1, var3, 37, 12, 22, 39, 12, 39, class_, class_, false);
         this.class_(var1, var3, 37, 12, 21, 39, 12, 21, break_, break_, false);

         for (int var6 = 0; var6 < 4; var6++) {
            this.class_(var1, var3, 43 - var6, var6 + 9, 21, 43 - var6, var6 + 9, 43 - var6, break_, break_, false);
         }

         for (byte var7 = 23; var7 <= 39; var7 += 3) {
            this.class_(var1, protected_, 38, 13, var7, var3);
         }
      }

      if (this.class_(var3, 15, 37, 42, 43)) {
         this.class_(var1, var3, 21, 0, 37, 36, 0, 43, class_, class_, false);
         this.class_(var1, var3, 21, 1, 37, 36, 14, 43);
         this.class_(var1, var3, 21, 12, 37, 36, 12, 39, class_, class_, false);

         for (int var8 = 0; var8 < 4; var8++) {
            this.class_(var1, var3, 15 + var8, var8 + 9, 43 - var8, 42 - var8, var8 + 9, 43 - var8, break_, break_, false);
         }

         for (byte var9 = 21; var9 <= 36; var9 += 3) {
            this.class_(var1, protected_, var9, 13, 38, var3);
         }
      }
   }

   private void protected_(rRI var1, Random var2, rfi_3 var3) {
      if (this.class_(var3, 0, 21, 6, 58)) {
         this.class_(var1, var3, 0, 0, 21, 6, 0, 57, class_, class_, false);
         this.class_(var1, var3, 0, 1, 21, 6, 7, 57);
         this.class_(var1, var3, 4, 4, 21, 6, 4, 53, class_, class_, false);

         for (int var4 = 0; var4 < 4; var4++) {
            this.class_(var1, var3, var4, var4 + 1, 21, var4, var4 + 1, 57 - var4, break_, break_, false);
         }

         for (byte var5 = 23; var5 < 53; var5 += 3) {
            this.class_(var1, protected_, 5, 5, var5, var3);
         }

         this.class_(var1, protected_, 5, 5, 52, var3);

         for (int var6 = 0; var6 < 4; var6++) {
            this.class_(var1, var3, var6, var6 + 1, 21, var6, var6 + 1, 57 - var6, break_, break_, false);
         }

         this.class_(var1, var3, 4, 1, 52, 6, 3, 52, class_, class_, false);
         this.class_(var1, var3, 5, 1, 51, 5, 3, 53, class_, class_, false);
      }

      if (this.class_(var3, 51, 21, 58, 58)) {
         this.class_(var1, var3, 51, 0, 21, 57, 0, 57, class_, class_, false);
         this.class_(var1, var3, 51, 1, 21, 57, 7, 57);
         this.class_(var1, var3, 51, 4, 21, 53, 4, 53, class_, class_, false);

         for (int var7 = 0; var7 < 4; var7++) {
            this.class_(var1, var3, 57 - var7, var7 + 1, 21, 57 - var7, var7 + 1, 57 - var7, break_, break_, false);
         }

         for (byte var8 = 23; var8 < 53; var8 += 3) {
            this.class_(var1, protected_, 52, 5, var8, var3);
         }

         this.class_(var1, protected_, 52, 5, 52, var3);
         this.class_(var1, var3, 51, 1, 52, 53, 3, 52, class_, class_, false);
         this.class_(var1, var3, 52, 1, 51, 52, 3, 53, class_, class_, false);
      }

      if (this.class_(var3, 0, 51, 57, 57)) {
         this.class_(var1, var3, 7, 0, 51, 50, 0, 57, class_, class_, false);
         this.class_(var1, var3, 7, 1, 51, 50, 10, 57);

         for (int var9 = 0; var9 < 4; var9++) {
            this.class_(var1, var3, var9 + 1, var9 + 1, 57 - var9, 56 - var9, var9 + 1, 57 - var9, break_, break_, false);
         }
      }
   }
}
