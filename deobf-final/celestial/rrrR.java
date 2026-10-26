package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class rrrR {
   private final Random class_;
   final rrre_1 break_;
   final rrre_1 byte_;
   final rrre_1[] protected_;
   final int throws_;
   final int case_;

   public rrrR(Random var1) {
      this.class_ = var1;
      byte var2 = 11;
      this.throws_ = 7;
      this.case_ = 4;
      this.break_ = new rrre_1(11, 11, 5);
      this.break_.class_(this.throws_, this.case_, this.throws_ + 1, this.case_ + 1, 3);
      this.break_.class_(this.throws_ - 1, this.case_, this.throws_ - 1, this.case_ + 1, 2);
      this.break_.class_(this.throws_ + 2, this.case_ - 2, this.throws_ + 3, this.case_ + 3, 5);
      this.break_.class_(this.throws_ + 1, this.case_ - 2, this.throws_ + 1, this.case_ - 1, 1);
      this.break_.class_(this.throws_ + 1, this.case_ + 2, this.throws_ + 1, this.case_ + 3, 1);
      this.break_.class_(this.throws_ - 1, this.case_ - 1, 1);
      this.break_.class_(this.throws_ - 1, this.case_ + 2, 1);
      this.break_.class_(0, 0, 11, 1, 5);
      this.break_.class_(0, 9, 11, 11, 5);
      this.class_(this.break_, this.throws_, this.case_ - 2, rpr_3.WEST, 6);
      this.class_(this.break_, this.throws_, this.case_ + 3, rpr_3.WEST, 6);
      this.class_(this.break_, this.throws_ - 2, this.case_ - 1, rpr_3.WEST, 3);
      this.class_(this.break_, this.throws_ - 2, this.case_ + 2, rpr_3.WEST, 3);

      while (this.class_(this.break_)) {
      }

      this.protected_ = new rrre_1[3];
      this.protected_[0] = new rrre_1(11, 11, 5);
      this.protected_[1] = new rrre_1(11, 11, 5);
      this.protected_[2] = new rrre_1(11, 11, 5);
      this.class_(this.break_, this.protected_[0]);
      this.class_(this.break_, this.protected_[1]);
      this.protected_[0].class_(this.throws_ + 1, this.case_, this.throws_ + 1, this.case_ + 1, 8388608);
      this.protected_[1].class_(this.throws_ + 1, this.case_, this.throws_ + 1, this.case_ + 1, 8388608);
      this.byte_ = new rrre_1(this.break_.break_, this.break_.byte_, 5);
      this.class_();
      this.class_(this.byte_, this.protected_[2]);
   }

   private void class_(rrre_1 var1, int var2, int var3, rpr_3 var4, int var5) {
      if (var5 > 0) {
         var1.class_(var2, var3, 1);
         var1.class_(var2 + var4.implements_(), var3 + var4.extends_(), 0, 1);

         for (int var6 = 0; var6 < 8; var6++) {
            rpr_3 var7 = rpr_3.break_(this.class_.nextInt(4));
            if (var7 != var4.case_() && (var7 != rpr_3.EAST || !this.class_.nextBoolean())) {
               int var8 = var2 + var4.implements_();
               int var9 = var3 + var4.extends_();
               if (var1.class_(var8 + var7.implements_(), var9 + var7.extends_()) == 0
                  && var1.class_(var8 + var7.implements_() * 2, var9 + var7.extends_() * 2) == 0) {
                  this.class_(var1, var2 + var4.implements_() + var7.implements_(), var3 + var4.extends_() + var7.extends_(), var7, var5 - 1);
                  break;
               }
            }
         }

         rpr_3 var10 = var4.catch_();
         rpr_3 var11 = var4.private_();
         var1.class_(var2 + var10.implements_(), var3 + var10.extends_(), 0, 2);
         var1.class_(var2 + var11.implements_(), var3 + var11.extends_(), 0, 2);
         var1.class_(var2 + var4.implements_() + var10.implements_(), var3 + var4.extends_() + var10.extends_(), 0, 2);
         var1.class_(var2 + var4.implements_() + var11.implements_(), var3 + var4.extends_() + var11.extends_(), 0, 2);
         var1.class_(var2 + var4.implements_() * 2, var3 + var4.extends_() * 2, 0, 2);
         var1.class_(var2 + var10.implements_() * 2, var3 + var10.extends_() * 2, 0, 2);
         var1.class_(var2 + var11.implements_() * 2, var3 + var11.extends_() * 2, 0, 2);
      }
   }

   private boolean class_(rrre_1 var1) {
      boolean var2 = false;

      for (int var3 = 0; var3 < var1.byte_; var3++) {
         for (int var4 = 0; var4 < var1.break_; var4++) {
            if (var1.class_(var4, var3) == 0) {
               int var5 = 0;
               var5 += class_(var1, var4 + 1, var3) ? 1 : 0;
               var5 += class_(var1, var4 - 1, var3) ? 1 : 0;
               var5 += class_(var1, var4, var3 + 1) ? 1 : 0;
               var5 += class_(var1, var4, var3 - 1) ? 1 : 0;
               if (var5 >= 3) {
                  var1.class_(var4, var3, 2);
                  var2 = true;
               } else if (var5 == 2) {
                  int var6 = 0;
                  var6 += class_(var1, var4 + 1, var3 + 1) ? 1 : 0;
                  var6 += class_(var1, var4 - 1, var3 + 1) ? 1 : 0;
                  var6 += class_(var1, var4 + 1, var3 - 1) ? 1 : 0;
                  var6 += class_(var1, var4 - 1, var3 - 1) ? 1 : 0;
                  if (var6 <= 1) {
                     var1.class_(var4, var3, 2);
                     var2 = true;
                  }
               }
            }
         }
      }

      return var2;
   }

   private void class_() {
      ArrayList var1 = Lists.newArrayList();
      rrre_1 var2 = this.protected_[1];

      for (int var3 = 0; var3 < this.byte_.byte_; var3++) {
         for (int var4 = 0; var4 < this.byte_.break_; var4++) {
            int var5 = var2.class_(var4, var3);
            int var6 = var5 & 983040;
            if (var6 == 131072 && (var5 & 2097152) == 2097152) {
               var1.add(new rqj_3<>(var4, var3));
            }
         }
      }

      if (var1.isEmpty()) {
         this.byte_.class_(0, 0, this.byte_.break_, this.byte_.byte_, 5);
      } else {
         rqj_3 var11 = (rqj_3)var1.get(this.class_.nextInt(var1.size()));
         int var12 = var2.class_((Integer)var11.class_(), (Integer)var11.break_());
         var2.class_((Integer)var11.class_(), (Integer)var11.break_(), var12 | 4194304);
         rpr_3 var13 = this.break_(this.break_, (Integer)var11.class_(), (Integer)var11.break_(), 1, var12 & 65535);
         int var14 = (Integer)var11.class_() + var13.implements_();
         int var7 = (Integer)var11.break_() + var13.extends_();

         for (int var8 = 0; var8 < this.byte_.byte_; var8++) {
            for (int var9 = 0; var9 < this.byte_.break_; var9++) {
               if (!class_(this.break_, var9, var8)) {
                  this.byte_.class_(var9, var8, 5);
               } else if (var9 == (Integer)var11.class_() && var8 == (Integer)var11.break_()) {
                  this.byte_.class_(var9, var8, 3);
               } else if (var9 == var14 && var8 == var7) {
                  this.byte_.class_(var9, var8, 3);
                  this.protected_[2].class_(var9, var8, 8388608);
               }
            }
         }

         ArrayList var15 = Lists.newArrayList();

         for (rpr_3 var10 : rpb_3.HORIZONTAL) {
            if (this.byte_.class_(var14 + var10.implements_(), var7 + var10.extends_()) == 0) {
               var15.add(var10);
            }
         }

         if (var15.isEmpty()) {
            this.byte_.class_(0, 0, this.byte_.break_, this.byte_.byte_, 5);
            var2.class_((Integer)var11.class_(), (Integer)var11.break_(), var12);
         } else {
            rpr_3 var17 = (rpr_3)var15.get(this.class_.nextInt(var15.size()));
            this.class_(this.byte_, var14 + var17.implements_(), var7 + var17.extends_(), var17, 4);

            while (this.class_(this.byte_)) {
            }
         }
      }
   }

   private void class_(rrre_1 var1, rrre_1 var2) {
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < var1.byte_; var4++) {
         for (int var5 = 0; var5 < var1.break_; var5++) {
            if (var1.class_(var5, var4) == 2) {
               var3.add(new rqj_3<>(var5, var4));
            }
         }
      }

      Collections.shuffle(var3, this.class_);
      int var19 = 10;

      for (rqj_3 var6 : var3) {
         int var7 = (Integer)var6.class_();
         int var8 = (Integer)var6.break_();
         if (var2.class_(var7, var8) == 0) {
            int var9 = var7;
            int var10 = var7;
            int var11 = var8;
            int var12 = var8;
            int var13 = 65536;
            if (var2.class_(var7 + 1, var8) == 0
               && var2.class_(var7, var8 + 1) == 0
               && var2.class_(var7 + 1, var8 + 1) == 0
               && var1.class_(var7 + 1, var8) == 2
               && var1.class_(var7, var8 + 1) == 2
               && var1.class_(var7 + 1, var8 + 1) == 2) {
               var10 = var7 + 1;
               var12 = var8 + 1;
               var13 = 262144;
            } else if (var2.class_(var7 - 1, var8) == 0
               && var2.class_(var7, var8 + 1) == 0
               && var2.class_(var7 - 1, var8 + 1) == 0
               && var1.class_(var7 - 1, var8) == 2
               && var1.class_(var7, var8 + 1) == 2
               && var1.class_(var7 - 1, var8 + 1) == 2) {
               var9 = var7 - 1;
               var12 = var8 + 1;
               var13 = 262144;
            } else if (var2.class_(var7 - 1, var8) == 0
               && var2.class_(var7, var8 - 1) == 0
               && var2.class_(var7 - 1, var8 - 1) == 0
               && var1.class_(var7 - 1, var8) == 2
               && var1.class_(var7, var8 - 1) == 2
               && var1.class_(var7 - 1, var8 - 1) == 2) {
               var9 = var7 - 1;
               var11 = var8 - 1;
               var13 = 262144;
            } else if (var2.class_(var7 + 1, var8) == 0 && var1.class_(var7 + 1, var8) == 2) {
               var10 = var7 + 1;
               var13 = 131072;
            } else if (var2.class_(var7, var8 + 1) == 0 && var1.class_(var7, var8 + 1) == 2) {
               var12 = var8 + 1;
               var13 = 131072;
            } else if (var2.class_(var7 - 1, var8) == 0 && var1.class_(var7 - 1, var8) == 2) {
               var9 = var7 - 1;
               var13 = 131072;
            } else if (var2.class_(var7, var8 - 1) == 0 && var1.class_(var7, var8 - 1) == 2) {
               var11 = var8 - 1;
               var13 = 131072;
            }

            int var14 = this.class_.nextBoolean() ? var9 : var10;
            int var15 = this.class_.nextBoolean() ? var11 : var12;
            int var16 = 2097152;
            if (!var1.break_(var14, var15, 1)) {
               var14 = var14 == var9 ? var10 : var9;
               var15 = var15 == var11 ? var12 : var11;
               if (!var1.break_(var14, var15, 1)) {
                  var15 = var15 == var11 ? var12 : var11;
                  if (!var1.break_(var14, var15, 1)) {
                     var14 = var14 == var9 ? var10 : var9;
                     var15 = var15 == var11 ? var12 : var11;
                     if (!var1.break_(var14, var15, 1)) {
                        var16 = 0;
                        var14 = var9;
                        var15 = var11;
                     }
                  }
               }
            }

            for (int var17 = var11; var17 <= var12; var17++) {
               for (int var18 = var9; var18 <= var10; var18++) {
                  if (var18 == var14 && var17 == var15) {
                     var2.class_(var18, var17, 1048576 | var16 | var13 | var19);
                  } else {
                     var2.class_(var18, var17, var13 | var19);
                  }
               }
            }

            var19++;
         }
      }
   }

   public boolean class_(rrre_1 var1, int var2, int var3, int var4, int var5) {
      return (this.protected_[var4].class_(var2, var3) & 65535) == var5;
   }

   public static boolean class_(rrre_1 var0, int var1, int var2) {
      int var3 = var0.class_(var1, var2);
      return var3 == 1 || var3 == 2 || var3 == 3 || var3 == 4;
   }

   public rpr_3 break_(rrre_1 var1, int var2, int var3, int var4, int var5) {
      for (rpr_3 var7 : rpb_3.HORIZONTAL) {
         if (this.class_(var1, var2 + var7.implements_(), var3 + var7.extends_(), var4, var5)) {
            return var7;
         }
      }

      return null;
   }
}
