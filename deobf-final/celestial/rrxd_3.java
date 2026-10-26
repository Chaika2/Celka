package celestial;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class rrxd_3 {
   public static final int class_ = 63;
   public static final rpr_3[][] break_ = class_(false);
   public static final rpr_3[][] byte_ = class_(true);
   private static int protected_ = 0;
   private static int throws_ = -1;
   private static int case_ = 16;
   private static rYB catch_ = null;
   private static int private_ = Integer.MIN_VALUE;
   private static int implements_ = Integer.MIN_VALUE;

   private static rpr_3[][] class_(boolean var0) {
      byte var1 = 64;
      rpr_3[][] var2 = new rpr_3[var1][];

      for (int var3 = 0; var3 < var1; var3++) {
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < rpr_3.VALUES.length; var5++) {
            rpr_3 var6 = rpr_3.VALUES[var5];
            rpr_3 var7 = var0 ? var6.case_() : var6;
            int var8 = 1 << var7.ordinal();
            if ((var3 & var8) != 0) {
               var4.add(var6);
            }
         }

         rpr_3[] var9 = var4.toArray(new rpr_3[var4.size()]);
         var2[var3] = var9;
      }

      return var2;
   }

   public static rpr_3[] class_(int var0) {
      int var1 = ~var0 & 63;
      return byte_[var1];
   }

   public static int class_(rYB var0, an_3 var1, int var2) {
      int var3 = rfU_2.byte_(var1.rx()) >> 4;
      int var4 = rfU_2.byte_(var1.re()) >> 4;
      int var5 = rfU_2.byte_(var1.BO()) >> 4;
      var4 = rrbb_3.class_(var4, 0, 15);
      roJ_2 var6 = var0.throws_(var3, var5);
      int var7 = var3 - var2;
      int var8 = var3 + var2;
      int var9 = var5 - var2;
      int var10 = var5 + var2;
      if (var0 != catch_ || var3 != private_ || var5 != implements_) {
         protected_ = 0;
         case_ = 16;
         catch_ = var0;
         private_ = var3;
         implements_ = var5;
      }

      if (protected_ == 0) {
         throws_ = -1;
      }

      int var11 = throws_;
      switch (protected_) {
         case 0:
            var8 = var3;
            var10 = var5;
            break;
         case 1:
            var7 = var3;
            var10 = var5;
            break;
         case 2:
            var8 = var3;
            var9 = var5;
            break;
         case 3:
            var7 = var3;
            var9 = var5;
      }

      for (int var12 = var7; var12 < var8; var12++) {
         for (int var13 = var9; var13 < var10; var13++) {
            roJ_2 var14 = var0.throws_(var12, var13);
            if (!var14.catch_()) {
               roQ_2[] var15 = var14.byte_();

               for (int var16 = var15.length - 1; var16 > var11; var16--) {
                  roQ_2 var17 = var15[var16];
                  if (var17 != null && !var17.byte_()) {
                     if (var16 > var11) {
                        var11 = var16;
                     }
                     break;
                  }
               }

               try {
                  Map var22 = var14.volatile_();
                  if (!var22.isEmpty()) {
                     for (rfH_2 var18 : var22.keySet()) {
                        int var19 = var18.c_() >> 4;
                        if (var19 > var11) {
                           var11 = var19;
                        }
                     }
                  }
               } catch (ConcurrentModificationException var20) {
               }

               ryI_2[] var23 = var14.final_();

               for (int var25 = var23.length - 1; var25 > var11; var25--) {
                  ryI_2 var26 = var23[var25];
                  if (!var26.isEmpty() && (var14 != var6 || var25 != var4 || var26.size() != 1)) {
                     if (var25 > var11) {
                        var11 = var25;
                     }
                     break;
                  }
               }
            }
         }
      }

      if (protected_ < 3) {
         throws_ = var11;
         var11 = case_;
      } else {
         case_ = var11;
         throws_ = -1;
      }

      protected_ = (protected_ + 1) % 4;
      return var11 << 4;
   }

   public static boolean class_() {
      return protected_ == 0;
   }

   public static void break_() {
      catch_ = null;
   }
}
