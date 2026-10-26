package celestial;

import java.util.IdentityHashMap;
import java.util.Map;

public class rrbX_2 {
   private static final int class_ = 0;
   private static final int break_ = 1;
   private static final int byte_ = 2;
   private static final int protected_ = 3;
   private static final int throws_ = 4;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static wK_2 class_(fj_3 var0, rrbx_3 var1, int var2, wK_2 var3, rrxF_2 var4) {
      switch (var1) {
         case UP:
            return class_(var0, var1, 0, 0, 16, 8, var2, var3, var4);
         case UP_RIGHT:
            return class_(var0, var1, 8, 0, 16, 8, var2, var3, var4);
         case RIGHT:
            return class_(var0, var1, 8, 0, 16, 16, var2, var3, var4);
         case DOWN_RIGHT:
            return class_(var0, var1, 8, 8, 16, 16, var2, var3, var4);
         case DOWN:
            return class_(var0, var1, 0, 8, 16, 16, var2, var3, var4);
         case DOWN_LEFT:
            return class_(var0, var1, 0, 8, 8, 16, var2, var3, var4);
         case LEFT:
            return class_(var0, var1, 0, 0, 8, 16, var2, var3, var4);
         case UP_LEFT:
            return class_(var0, var1, 0, 0, 8, 8, var2, var3, var4);
         default:
            return var3;
      }
   }

   private static wK_2[] class_(
      rrbx_3 var0, int var1, rrbx_3 var2, int var3, rrbx_3 var4, int var5, rrbx_3 var6, int var7, fj_3[] var8, int var9, wK_2 var10, rrxF_2 var11
   ) {
      wK_2 var12 = class_(var8[var1], var0, var9, var10, var11);
      wK_2 var13 = class_(var8[var3], var2, var9, var10, var11);
      wK_2 var14 = class_(var8[var5], var4, var9, var10, var11);
      wK_2 var15 = class_(var8[var7], var6, var9, var10, var11);
      return var11.class_(var12, var13, var14, var15);
   }

   private static wK_2[] class_(rrbx_3 var0, int var1, rrbx_3 var2, int var3, rrbx_3 var4, int var5, fj_3[] var6, int var7, wK_2 var8, rrxF_2 var9) {
      wK_2 var10 = class_(var6[var1], var0, var7, var8, var9);
      wK_2 var11 = class_(var6[var3], var2, var7, var8, var9);
      wK_2 var12 = class_(var6[var5], var4, var7, var8, var9);
      return var9.class_(var10, var11, var12);
   }

   private static wK_2 class_(fj_3 var0, rrbx_3 var1, int var2, int var3, int var4, int var5, int var6, wK_2 var7, rrxF_2 var8) {
      Map[][] var9 = rrbO_2.class_();
      if (var9 == null) {
         return var7;
      } else {
         int var10 = var0.new_();
         if (var10 >= 0 && var10 < var9.length) {
            Map[] var11 = var9[var10];
            if (var11 == null) {
               var11 = new Map[rrbx_3.VALUES.length];
               var9[var10] = var11;
            }

            Object var12 = var11[var1.ordinal()];
            if (var12 == null) {
               var12 = new IdentityHashMap(1);
               var11[var1.ordinal()] = (Map)var12;
            }

            wK_2 var13 = (wK_2)var12.get(var7);
            if (var13 == null) {
               var13 = class_(var7, var0, var6, var2, var3, var4, var5);
               var12.put(var7, var13);
            }

            return var13;
         } else {
            return var7;
         }
      }
   }

   private static wK_2 class_(wK_2 var0, fj_3 var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = (int[])var0.class_().clone();
      fj_3 var8 = var0.case_();

      for (int var9 = 0; var9 < 4; var9++) {
         class_(var7, var9, var8, var1, var2, var3, var4, var5, var6);
      }

      return new wK_2(var7, var0.byte_(), var0.protected_(), var1, var0.throws_());
   }

   private static void class_(int[] var0, int var1, fj_3 var2, fj_3 var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var0.length / 4;
      int var10 = var9 * var1;
      float var11 = Float.intBitsToFloat(var0[var10 + 4]);
      float var12 = Float.intBitsToFloat(var0[var10 + 4 + 1]);
      double var13 = var2.class_(var11);
      double var15 = var2.break_(var12);
      float var17 = Float.intBitsToFloat(var0[var10 + 0]);
      float var18 = Float.intBitsToFloat(var0[var10 + 1]);
      float var19 = Float.intBitsToFloat(var0[var10 + 2]);
      float var20;
      float var21;
      switch (var4) {
         case 0:
            var20 = var17;
            var21 = 1.0F - var19;
            break;
         case 1:
            var20 = var17;
            var21 = var19;
            break;
         case 2:
            var20 = 1.0F - var17;
            var21 = 1.0F - var18;
            break;
         case 3:
            var20 = var17;
            var21 = 1.0F - var18;
            break;
         case 4:
            var20 = var19;
            var21 = 1.0F - var18;
            break;
         case 5:
            var20 = 1.0F - var19;
            var21 = 1.0F - var18;
            break;
         default:
            return;
      }

      float var22 = (float)var2.protected_() / (var2.catch_() - var2.case_());
      float var23 = (float)var2.throws_() / (var2.implements_() - var2.private_());
      float var24 = 4.0F / Math.max(var23, var22);
      float var25 = 16.0F * (1.0F - var24);
      float var26 = 16.0F * (1.0F - var24);
      if (var13 < (double)var5) {
         var20 = (float)((double)var20 + ((double)var5 - var13) / (double)var25);
         var13 = (double)var5;
      }

      if (var13 > (double)var7) {
         var20 = (float)((double)var20 - (var13 - (double)var7) / (double)var25);
         var13 = (double)var7;
      }

      if (var15 < (double)var6) {
         var21 = (float)((double)var21 + ((double)var6 - var15) / (double)var26);
         var15 = (double)var6;
      }

      if (var15 > (double)var8) {
         var21 = (float)((double)var21 - (var15 - (double)var8) / (double)var26);
         var15 = (double)var8;
      }

      switch (var4) {
         case 0:
            var17 = var20;
            var19 = 1.0F - var21;
            break;
         case 1:
            var17 = var20;
            var19 = var21;
            break;
         case 2:
            var17 = 1.0F - var20;
            var18 = 1.0F - var21;
            break;
         case 3:
            var17 = var20;
            var18 = 1.0F - var21;
            break;
         case 4:
            var19 = var20;
            var18 = 1.0F - var21;
            break;
         case 5:
            var19 = 1.0F - var20;
            var18 = 1.0F - var21;
            break;
         default:
            return;
      }

      var0[var10 + 4] = Float.floatToRawIntBits(var3.class_(var13));
      var0[var10 + 4 + 1] = Float.floatToRawIntBits(var3.break_(var15));
      var0[var10 + 0] = Float.floatToRawIntBits(var17);
      var0[var10 + 1] = Float.floatToRawIntBits(var18);
      var0[var10 + 2] = Float.floatToRawIntBits(var19);
   }

   private static wK_2[] class_(int var0, int var1, fj_3[] var2, int var3, wK_2 var4, rrxF_2 var5) {
      return class_(rrbx_3.LEFT, var0, rrbx_3.RIGHT, var1, var2, var3, var4, var5);
   }

   public static wK_2[] class_(int var0, rrbM_2 var1, int var2, wK_2 var3, rrxF_2 var4) {
      if (var1.final_ != null && var0 >= 0 && var0 < var1.final_.length) {
         int var5 = var1.final_[var0];
         if (var5 >= 0 && var5 <= var1.goto_.length) {
            return class_(var5, var1.goto_, var3, var4);
         }
      }

      switch (var0) {
         case 1:
            return class_(0, 3, var1.goto_, var2, var3, var4);
         case 2:
            return class_(3, var1.goto_, var3, var4);
         case 3:
            return class_(3, 0, var1.goto_, var2, var3, var4);
         case 4:
            return class_(0, 3, 2, 4, var1.goto_, var2, var3, var4);
         case 5:
            return class_(3, 0, 4, 2, var1.goto_, var2, var3, var4);
         case 6:
            return class_(2, 4, 2, 4, var1.goto_, var2, var3, var4);
         case 7:
            return class_(3, 3, 4, 4, var1.goto_, var2, var3, var4);
         case 8:
            return class_(4, 1, 4, 4, var1.goto_, var2, var3, var4);
         case 9:
            return class_(4, 4, 4, 1, var1.goto_, var2, var3, var4);
         case 10:
            return class_(1, 4, 1, 4, var1.goto_, var2, var3, var4);
         case 11:
            return class_(1, 1, 4, 4, var1.goto_, var2, var3, var4);
         case 12:
            return break_(0, 2, var1.goto_, var2, var3, var4);
         case 13:
            return class_(0, 3, 2, 1, var1.goto_, var2, var3, var4);
         case 14:
            return break_(3, 1, var1.goto_, var2, var3, var4);
         case 15:
            return class_(3, 0, 1, 2, var1.goto_, var2, var3, var4);
         case 16:
            return class_(2, 4, 0, 3, var1.goto_, var2, var3, var4);
         case 17:
            return class_(4, 2, 3, 0, var1.goto_, var2, var3, var4);
         case 18:
            return class_(4, 4, 3, 3, var1.goto_, var2, var3, var4);
         case 19:
            return class_(4, 2, 4, 2, var1.goto_, var2, var3, var4);
         case 20:
            return class_(1, 4, 4, 4, var1.goto_, var2, var3, var4);
         case 21:
            return class_(4, 4, 1, 4, var1.goto_, var2, var3, var4);
         case 22:
            return class_(4, 4, 1, 1, var1.goto_, var2, var3, var4);
         case 23:
            return class_(4, 1, 4, 1, var1.goto_, var2, var3, var4);
         case 24:
            return class_(2, var1.goto_, var3, var4);
         case 25:
            return class_(2, 1, var1.goto_, var2, var3, var4);
         case 26:
            return class_(1, var1.goto_, var3, var4);
         case 27:
            return class_(1, 2, var1.goto_, var2, var3, var4);
         case 28:
            return class_(2, 4, 2, 1, var1.goto_, var2, var3, var4);
         case 29:
            return class_(3, 3, 1, 4, var1.goto_, var2, var3, var4);
         case 30:
            return class_(2, 1, 2, 4, var1.goto_, var2, var3, var4);
         case 31:
            return class_(3, 3, 4, 1, var1.goto_, var2, var3, var4);
         case 32:
            return class_(1, 1, 1, 4, var1.goto_, var2, var3, var4);
         case 33:
            return class_(1, 1, 4, 1, var1.goto_, var2, var3, var4);
         case 34:
            return class_(4, 1, 1, 4, var1.goto_, var2, var3, var4);
         case 35:
            return class_(1, 4, 4, 1, var1.goto_, var2, var3, var4);
         case 36:
            return break_(2, 0, var1.goto_, var2, var3, var4);
         case 37:
            return class_(2, 1, 0, 3, var1.goto_, var2, var3, var4);
         case 38:
            return break_(1, 3, var1.goto_, var2, var3, var4);
         case 39:
            return class_(1, 2, 3, 0, var1.goto_, var2, var3, var4);
         case 40:
            return class_(4, 1, 3, 3, var1.goto_, var2, var3, var4);
         case 41:
            return class_(1, 2, 4, 2, var1.goto_, var2, var3, var4);
         case 42:
            return class_(1, 4, 3, 3, var1.goto_, var2, var3, var4);
         case 43:
            return class_(4, 2, 1, 2, var1.goto_, var2, var3, var4);
         case 44:
            return class_(1, 4, 1, 1, var1.goto_, var2, var3, var4);
         case 45:
            return class_(4, 1, 1, 1, var1.goto_, var2, var3, var4);
         case 46:
            return class_(4, var1.goto_, var3, var4);
         default:
            return class_(0, var1.goto_, var3, var4);
      }
   }

   private static wK_2[] class_(int var0, int var1, int var2, int var3, fj_3[] var4, int var5, wK_2 var6, rrxF_2 var7) {
      if (var0 == var1) {
         return var2 == var3
            ? class_(rrbx_3.UP, var0, rrbx_3.DOWN, var2, var4, var5, var6, var7)
            : class_(rrbx_3.UP, var0, rrbx_3.DOWN_LEFT, var2, rrbx_3.DOWN_RIGHT, var3, var4, var5, var6, var7);
      } else if (var2 == var3) {
         return class_(rrbx_3.UP_LEFT, var0, rrbx_3.UP_RIGHT, var1, rrbx_3.DOWN, var2, var4, var5, var6, var7);
      } else if (var0 == var2) {
         return var1 == var3
            ? class_(rrbx_3.LEFT, var0, rrbx_3.RIGHT, var1, var4, var5, var6, var7)
            : class_(rrbx_3.LEFT, var0, rrbx_3.UP_RIGHT, var1, rrbx_3.DOWN_RIGHT, var3, var4, var5, var6, var7);
      } else {
         return var1 == var3
            ? class_(rrbx_3.UP_LEFT, var0, rrbx_3.DOWN_LEFT, var2, rrbx_3.RIGHT, var1, var4, var5, var6, var7)
            : class_(rrbx_3.UP_LEFT, var0, rrbx_3.UP_RIGHT, var1, rrbx_3.DOWN_LEFT, var2, rrbx_3.DOWN_RIGHT, var3, var4, var5, var6, var7);
      }
   }

   private static wK_2[] class_(int var0, fj_3[] var1, wK_2 var2, rrxF_2 var3) {
      fj_3 var4 = var1[var0];
      return rrbO_2.class_(var4, var2, var3);
   }

   private static wK_2[] class_(rrbx_3 var0, int var1, rrbx_3 var2, int var3, fj_3[] var4, int var5, wK_2 var6, rrxF_2 var7) {
      wK_2 var8 = class_(var4[var1], var0, var5, var6, var7);
      wK_2 var9 = class_(var4[var3], var2, var5, var6, var7);
      return var7.class_(var8, var9);
   }

   private static wK_2[] break_(int var0, int var1, fj_3[] var2, int var3, wK_2 var4, rrxF_2 var5) {
      return class_(rrbx_3.UP, var0, rrbx_3.DOWN, var1, var2, var3, var4, var5);
   }
}
