package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class rrSV extends rrsE_2<rrsG_2> {
   private static final xc_3 id_import = xu_3.sw.id_continue();
   private static final xc_3 id_short = xu_3.sI.id_continue();
   private static final xc_3 id_default = xu_3.Ee.id_continue();
   private static final xc_3 id_const = xu_3.sV.id_continue();
   private static final xc_3 id_strictfp = xu_3.se.id_continue();
   private static final xc_3 id_boolean = xu_3.si.id_continue();
   private static final xc_3 id_transient = xu_3.so.id_continue();
   protected xc_3[] id_class;
   protected long id_break;
   protected rKw_1 id_byte;
   protected rKw_1 id_protected;
   protected rKw_1 id_throws;

   public rrSV(Codec<rrsG_2> var1) {
      super(var1);
   }

   protected xc_3 id_class(int var1, int var2, int var3) {
      int var4 = (int)Math.round(this.id_throws.id_class((double)var1 / 512.0, (double)var3 / 512.0, false) * 2.0);
      return this.id_class[(var2 + var4 + 64) % 64];
   }

   public void id_class(
      Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14
   ) {
      int var15 = var4 & 15;
      int var16 = var5 & 15;
      xc_3 var17 = id_import;
      rrSa_1 var18 = var3.id_throws().id_throws();
      xc_3 var19 = var18.id_break();
      xc_3 var20 = var18.id_class();
      xc_3 var21 = var19;
      int var22 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      boolean var23 = Math.cos(var7 / 3.0 * Math.PI) > 0.0;
      int var24 = -1;
      boolean var25 = false;
      int var26 = 0;
      rfw_3 var27 = new rfw_3();

      for (int var28 = var6; var28 >= 0; var28--) {
         if (var26 < 15) {
            var27.id_class(var15, var28, var16);
            xc_3 var29 = var2.id_byte(var27);
            if (var29.id_catch()) {
               var24 = -1;
            } else if (var29.id_class(var9.id_break())) {
               if (var24 == -1) {
                  var25 = false;
                  if (var22 <= 0) {
                     var17 = xu_3.id_class.id_continue();
                     var21 = var9;
                  } else if (var28 >= var11 - 4 && var28 <= var11 + 1) {
                     var17 = id_import;
                     var21 = var19;
                  }

                  if (var28 < var11 && (var17 == null || var17.id_catch())) {
                     var17 = var10;
                  }

                  var24 = var22 + Math.max(0, var28 - var11);
                  if (var28 >= var11 - 1) {
                     if (var28 <= var11 + 3 + var22) {
                        var2.id_class(var27, var20, false);
                        var25 = true;
                     } else {
                        xc_3 var31;
                        if (var28 < 64 || var28 > 127) {
                           var31 = id_short;
                        } else if (var23) {
                           var31 = id_default;
                        } else {
                           var31 = this.id_class(var4, var28, var5);
                        }

                        var2.id_class(var27, var31, false);
                     }
                  } else {
                     var2.id_class(var27, var21, false);
                     xd_3 var30 = var21.id_break();
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
                        var2.id_class(var27, id_short, false);
                     }
                  }
               } else if (var24 > 0) {
                  var24--;
                  if (var25) {
                     var2.id_class(var27, id_short, false);
                  } else {
                     var2.id_class(var27, this.id_class(var4, var28, var5), false);
                  }
               }

               var26++;
            }
         }
      }
   }

   @Override
   public void id_class(long var1) {
      if (this.id_break != var1 || this.id_class == null) {
         this.id_break(var1);
      }

      if (this.id_break != var1 || this.id_byte == null || this.id_protected == null) {
         rqm_3 var3 = new rqm_3(var1);
         this.id_byte = new rKw_1(var3, IntStream.rangeClosed(-3, 0));
         this.id_protected = new rKw_1(var3, ImmutableList.of(0));
      }

      this.id_break = var1;
   }

   protected void id_break(long var1) {
      this.id_class = new xc_3[64];
      Arrays.fill(this.id_class, id_default);
      rqm_3 var3 = new rqm_3(var1);
      this.id_throws = new rKw_1(var3, ImmutableList.of(0));

      for (int var12 = 0; var12 < 64; var12++) {
         var12 += var3.nextInt(5) + 1;
         if (var12 < 64) {
            this.id_class[var12] = id_short;
         }
      }

      int var13 = var3.nextInt(4) + 2;

      for (int var5 = 0; var5 < var13; var5++) {
         int var6 = var3.nextInt(3) + 1;
         int var7 = var3.nextInt(64);

         for (int var8 = 0; var7 + var8 < 64 && var8 < var6; var8++) {
            this.id_class[var7 + var8] = id_const;
         }
      }

      int var14 = var3.nextInt(4) + 2;

      for (int var15 = 0; var15 < var14; var15++) {
         int var17 = var3.nextInt(3) + 2;
         int var20 = var3.nextInt(64);

         for (int var9 = 0; var20 + var9 < 64 && var9 < var17; var9++) {
            this.id_class[var20 + var9] = id_strictfp;
         }
      }

      int var16 = var3.nextInt(4) + 2;

      for (int var18 = 0; var18 < var16; var18++) {
         int var21 = var3.nextInt(3) + 1;
         int var23 = var3.nextInt(64);

         for (int var10 = 0; var23 + var10 < 64 && var10 < var21; var10++) {
            this.id_class[var23 + var10] = id_boolean;
         }
      }

      int var19 = var3.nextInt(3) + 3;
      int var22 = 0;

      for (int var24 = 0; var24 < var19; var24++) {
         boolean var25 = true;
         var22 += var3.nextInt(16) + 4;

         for (int var11 = 0; var22 + var11 < 64 && var11 < 1; var11++) {
            this.id_class[var22 + var11] = id_import;
            if (var22 + var11 > 1 && var3.nextBoolean()) {
               this.id_class[var22 + var11 - 1] = id_transient;
            }

            if (var22 + var11 < 63 && var3.nextBoolean()) {
               this.id_class[var22 + var11 + 1] = id_transient;
            }
         }
      }
   }
}
