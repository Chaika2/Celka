package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class rrSV extends rrsE_2<rrsG_2> {
   private static final xc_3 import_ = xu_3.sw.continue_();
   private static final xc_3 short_ = xu_3.sI.continue_();
   private static final xc_3 default_ = xu_3.Ee.continue_();
   private static final xc_3 const_ = xu_3.sV.continue_();
   private static final xc_3 strictfp_ = xu_3.se.continue_();
   private static final xc_3 boolean_ = xu_3.si.continue_();
   private static final xc_3 transient_ = xu_3.so.continue_();
   protected xc_3[] class_;
   protected long break_;
   protected rKw_1 byte_;
   protected rKw_1 protected_;
   protected rKw_1 throws_;

   public rrSV(Codec<rrsG_2> var1) {
      super(var1);
   }

   protected xc_3 class_(int var1, int var2, int var3) {
      int var4 = (int)Math.round(this.throws_.class_((double)var1 / 512.0, (double)var3 / 512.0, false) * 2.0);
      return this.class_[(var2 + var4 + 64) % 64];
   }

   public void class_(Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14) {
      int var15 = var4 & 15;
      int var16 = var5 & 15;
      xc_3 var17 = import_;
      rrSa_1 var18 = var3.throws_().throws_();
      xc_3 var19 = var18.break_();
      xc_3 var20 = var18.class_();
      xc_3 var21 = var19;
      int var22 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      boolean var23 = Math.cos(var7 / 3.0 * Math.PI) > 0.0;
      int var24 = -1;
      boolean var25 = false;
      int var26 = 0;
      rfw_3 var27 = new rfw_3();

      for (int var28 = var6; var28 >= 0; var28--) {
         if (var26 < 15) {
            var27.class_(var15, var28, var16);
            xc_3 var29 = var2.byte_(var27);
            if (var29.catch_()) {
               var24 = -1;
            } else if (var29.class_(var9.break_())) {
               if (var24 == -1) {
                  var25 = false;
                  if (var22 <= 0) {
                     var17 = xu_3.class_.continue_();
                     var21 = var9;
                  } else if (var28 >= var11 - 4 && var28 <= var11 + 1) {
                     var17 = import_;
                     var21 = var19;
                  }

                  if (var28 < var11 && (var17 == null || var17.catch_())) {
                     var17 = var10;
                  }

                  var24 = var22 + Math.max(0, var28 - var11);
                  if (var28 >= var11 - 1) {
                     if (var28 <= var11 + 3 + var22) {
                        var2.class_(var27, var20, false);
                        var25 = true;
                     } else {
                        xc_3 var31;
                        if (var28 < 64 || var28 > 127) {
                           var31 = short_;
                        } else if (var23) {
                           var31 = default_;
                        } else {
                           var31 = this.class_(var4, var28, var5);
                        }

                        var2.class_(var27, var31, false);
                     }
                  } else {
                     var2.class_(var27, var21, false);
                     xd_3 var30 = var21.break_();
                     if (var30 == xu_3.sw
                        || var30 == xu_3.sI
                        || var30 == xu_3.sf
                        || var30 == xu_3.sj
                        || var30 == xu_3.sV
                        || var30 == xu_3.sg
                        || var30 == xu_3.sR
                        || var30 == xu_3.sY
                        || var30 == xu_3.so
                        || var30 == xu_3.sK
                        || var30 == xu_3.sD
                        || var30 == xu_3.sU
                        || var30 == xu_3.se
                        || var30 == xu_3.sa
                        || var30 == xu_3.si
                        || var30 == xu_3.Er) {
                        var2.class_(var27, short_, false);
                     }
                  }
               } else if (var24 > 0) {
                  var24--;
                  if (var25) {
                     var2.class_(var27, short_, false);
                  } else {
                     var2.class_(var27, this.class_(var4, var28, var5), false);
                  }
               }

               var26++;
            }
         }
      }
   }

   @Override
   public void class_(long var1) {
      if (this.break_ != var1 || this.class_ == null) {
         this.break_(var1);
      }

      if (this.break_ != var1 || this.byte_ == null || this.protected_ == null) {
         rqm_3 var3 = new rqm_3(var1);
         this.byte_ = new rKw_1(var3, IntStream.rangeClosed(-3, 0));
         this.protected_ = new rKw_1(var3, ImmutableList.of(0));
      }

      this.break_ = var1;
   }

   protected void break_(long var1) {
      this.class_ = new xc_3[64];
      Arrays.fill(this.class_, default_);
      rqm_3 var3 = new rqm_3(var1);
      this.throws_ = new rKw_1(var3, ImmutableList.of(0));

      for (int var12 = 0; var12 < 64; var12++) {
         var12 += var3.nextInt(5) + 1;
         if (var12 < 64) {
            this.class_[var12] = short_;
         }
      }

      int var13 = var3.nextInt(4) + 2;

      for (int var5 = 0; var5 < var13; var5++) {
         int var6 = var3.nextInt(3) + 1;
         int var7 = var3.nextInt(64);

         for (int var8 = 0; var7 + var8 < 64 && var8 < var6; var8++) {
            this.class_[var7 + var8] = const_;
         }
      }

      int var14 = var3.nextInt(4) + 2;

      for (int var15 = 0; var15 < var14; var15++) {
         int var17 = var3.nextInt(3) + 2;
         int var20 = var3.nextInt(64);

         for (int var9 = 0; var20 + var9 < 64 && var9 < var17; var9++) {
            this.class_[var20 + var9] = strictfp_;
         }
      }

      int var16 = var3.nextInt(4) + 2;

      for (int var18 = 0; var18 < var16; var18++) {
         int var21 = var3.nextInt(3) + 1;
         int var23 = var3.nextInt(64);

         for (int var10 = 0; var23 + var10 < 64 && var10 < var21; var10++) {
            this.class_[var23 + var10] = boolean_;
         }
      }

      int var19 = var3.nextInt(3) + 3;
      int var22 = 0;

      for (int var24 = 0; var24 < var19; var24++) {
         boolean var25 = true;
         var22 += var3.nextInt(16) + 4;

         for (int var11 = 0; var22 + var11 < 64 && var11 < 1; var11++) {
            this.class_[var22 + var11] = import_;
            if (var22 + var11 > 1 && var3.nextBoolean()) {
               this.class_[var22 + var11 - 1] = transient_;
            }

            if (var22 + var11 < 63 && var3.nextBoolean()) {
               this.class_[var22 + var11 + 1] = transient_;
            }
         }
      }
   }
}
