package celestial;

import java.util.IdentityHashMap;
import java.util.Map;

public class rrbX_2 {
   private static final int id_class = 0;
   private static final int id_break = 1;
   private static final int id_byte = 2;
   private static final int id_protected = 3;
   private static final int id_throws = 4;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static wK_2 id_class(fj_3 var0, rrbx_3 var1, int var2, wK_2 var3, rrxF_2 var4) {
      switch (var1) {
         case UP:
            return id_class(var0, var1, 0, 0, 16, 8, var2, var3, var4);
         case UP_RIGHT:
            return id_class(var0, var1, 8, 0, 16, 8, var2, var3, var4);
         case RIGHT:
            return id_class(var0, var1, 8, 0, 16, 16, var2, var3, var4);
         case DOWN_RIGHT:
            return id_class(var0, var1, 8, 8, 16, 16, var2, var3, var4);
         case DOWN:
            return id_class(var0, var1, 0, 8, 16, 16, var2, var3, var4);
         case DOWN_LEFT:
            return id_class(var0, var1, 0, 8, 8, 16, var2, var3, var4);
         case LEFT:
            return id_class(var0, var1, 0, 0, 8, 16, var2, var3, var4);
         case UP_LEFT:
            return id_class(var0, var1, 0, 0, 8, 8, var2, var3, var4);
         default:
            return var3;
      }
   }

   private static wK_2[] id_class(
      rrbx_3 var0, int var1, rrbx_3 var2, int var3, rrbx_3 var4, int var5, rrbx_3 var6, int var7, fj_3[] var8, int var9, wK_2 var10, rrxF_2 var11
   ) {
      wK_2 var12 = id_class(var8[var1], var0, var9, var10, var11);
      wK_2 var13 = id_class(var8[var3], var2, var9, var10, var11);
      wK_2 var14 = id_class(var8[var5], var4, var9, var10, var11);
      wK_2 var15 = id_class(var8[var7], var6, var9, var10, var11);
      return var11.id_class(var12, var13, var14, var15);
   }

   private static wK_2[] id_class(rrbx_3 var0, int var1, rrbx_3 var2, int var3, rrbx_3 var4, int var5, fj_3[] var6, int var7, wK_2 var8, rrxF_2 var9) {
      wK_2 var10 = id_class(var6[var1], var0, var7, var8, var9);
      wK_2 var11 = id_class(var6[var3], var2, var7, var8, var9);
      wK_2 var12 = id_class(var6[var5], var4, var7, var8, var9);
      return var9.id_class(var10, var11, var12);
   }

   private static wK_2 id_class(fj_3 var0, rrbx_3 var1, int var2, int var3, int var4, int var5, int var6, wK_2 var7, rrxF_2 var8) {
      Map[][] var9 = rrbO_2.id_class();
      if (var9 == null) {
         return var7;
      } else {
         int var10 = var0.id_new();
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
               var13 = id_class(var7, var0, var6, var2, var3, var4, var5);
               var12.put(var7, var13);
            }

            return var13;
         } else {
            return var7;
         }
      }
   }

   private static wK_2 id_class(wK_2 var0, fj_3 var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = (int[])var0.id_class().clone();
      fj_3 var8 = var0.id_case();

      for (int var9 = 0; var9 < 4; var9++) {
         id_class(var7, var9, var8, var1, var2, var3, var4, var5, var6);
      }

      return new wK_2(var7, var0.id_byte(), var0.id_protected(), var1, var0.id_throws());
   }

   private static void id_class(int[] var0, int var1, fj_3 var2, fj_3 var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var0.length / 4;
      int var10 = var9 * var1;
      float var11 = Float.intBitsToFloat(var0[var10 + 4]);
      float var12 = Float.intBitsToFloat(var0[var10 + 4 + 1]);
      double var13 = var2.id_class(var11);
      double var15 = var2.id_break(var12);
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

      float var22 = (float)var2.id_protected() / (var2.id_catch() - var2.id_case());
      float var23 = (float)var2.id_throws() / (var2.id_implements() - var2.id_private());
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

      var0[var10 + 4] = Float.floatToRawIntBits(var3.id_class(var13));
      var0[var10 + 4 + 1] = Float.floatToRawIntBits(var3.id_break(var15));
      var0[var10 + 0] = Float.floatToRawIntBits(var17);
      var0[var10 + 1] = Float.floatToRawIntBits(var18);
      var0[var10 + 2] = Float.floatToRawIntBits(var19);
   }

   private static wK_2[] id_class(int var0, int var1, fj_3[] var2, int var3, wK_2 var4, rrxF_2 var5) {
      return id_class(rrbx_3.LEFT, var0, rrbx_3.RIGHT, var1, var2, var3, var4, var5);
   }

   public static wK_2[] id_class(int var0, rrbM_2 var1, int var2, wK_2 var3, rrxF_2 var4) {
      if (var1.id_final != null && var0 >= 0 && var0 < var1.id_final.length) {
         int var5 = var1.id_final[var0];
         if (var5 >= 0 && var5 <= var1.id_goto.length) {
            return id_class(var5, var1.id_goto, var3, var4);
         }
      }

      switch (var0) {
         case 1:
            return id_class(0, 3, var1.id_goto, var2, var3, var4);
         case 2:
            return id_class(3, var1.id_goto, var3, var4);
         case 3:
            return id_class(3, 0, var1.id_goto, var2, var3, var4);
         case 4:
            return id_class(0, 3, 2, 4, var1.id_goto, var2, var3, var4);
         case 5:
            return id_class(3, 0, 4, 2, var1.id_goto, var2, var3, var4);
         case 6:
            return id_class(2, 4, 2, 4, var1.id_goto, var2, var3, var4);
         case 7:
            return id_class(3, 3, 4, 4, var1.id_goto, var2, var3, var4);
         case 8:
            return id_class(4, 1, 4, 4, var1.id_goto, var2, var3, var4);
         case 9:
            return id_class(4, 4, 4, 1, var1.id_goto, var2, var3, var4);
         case 10:
            return id_class(1, 4, 1, 4, var1.id_goto, var2, var3, var4);
         case 11:
            return id_class(1, 1, 4, 4, var1.id_goto, var2, var3, var4);
         case 12:
            return id_break(0, 2, var1.id_goto, var2, var3, var4);
         case 13:
            return id_class(0, 3, 2, 1, var1.id_goto, var2, var3, var4);
         case 14:
            return id_break(3, 1, var1.id_goto, var2, var3, var4);
         case 15:
            return id_class(3, 0, 1, 2, var1.id_goto, var2, var3, var4);
         case 16:
            return id_class(2, 4, 0, 3, var1.id_goto, var2, var3, var4);
         case 17:
            return id_class(4, 2, 3, 0, var1.id_goto, var2, var3, var4);
         case 18:
            return id_class(4, 4, 3, 3, var1.id_goto, var2, var3, var4);
         case 19:
            return id_class(4, 2, 4, 2, var1.id_goto, var2, var3, var4);
         case 20:
            return id_class(1, 4, 4, 4, var1.id_goto, var2, var3, var4);
         case 21:
            return id_class(4, 4, 1, 4, var1.id_goto, var2, var3, var4);
         case 22:
            return id_class(4, 4, 1, 1, var1.id_goto, var2, var3, var4);
         case 23:
            return id_class(4, 1, 4, 1, var1.id_goto, var2, var3, var4);
         case 24:
            return id_class(2, var1.id_goto, var3, var4);
         case 25:
            return id_class(2, 1, var1.id_goto, var2, var3, var4);
         case 26:
            return id_class(1, var1.id_goto, var3, var4);
         case 27:
            return id_class(1, 2, var1.id_goto, var2, var3, var4);
         case 28:
            return id_class(2, 4, 2, 1, var1.id_goto, var2, var3, var4);
         case 29:
            return id_class(3, 3, 1, 4, var1.id_goto, var2, var3, var4);
         case 30:
            return id_class(2, 1, 2, 4, var1.id_goto, var2, var3, var4);
         case 31:
            return id_class(3, 3, 4, 1, var1.id_goto, var2, var3, var4);
         case 32:
            return id_class(1, 1, 1, 4, var1.id_goto, var2, var3, var4);
         case 33:
            return id_class(1, 1, 4, 1, var1.id_goto, var2, var3, var4);
         case 34:
            return id_class(4, 1, 1, 4, var1.id_goto, var2, var3, var4);
         case 35:
            return id_class(1, 4, 4, 1, var1.id_goto, var2, var3, var4);
         case 36:
            return id_break(2, 0, var1.id_goto, var2, var3, var4);
         case 37:
            return id_class(2, 1, 0, 3, var1.id_goto, var2, var3, var4);
         case 38:
            return id_break(1, 3, var1.id_goto, var2, var3, var4);
         case 39:
            return id_class(1, 2, 3, 0, var1.id_goto, var2, var3, var4);
         case 40:
            return id_class(4, 1, 3, 3, var1.id_goto, var2, var3, var4);
         case 41:
            return id_class(1, 2, 4, 2, var1.id_goto, var2, var3, var4);
         case 42:
            return id_class(1, 4, 3, 3, var1.id_goto, var2, var3, var4);
         case 43:
            return id_class(4, 2, 1, 2, var1.id_goto, var2, var3, var4);
         case 44:
            return id_class(1, 4, 1, 1, var1.id_goto, var2, var3, var4);
         case 45:
            return id_class(4, 1, 1, 1, var1.id_goto, var2, var3, var4);
         case 46:
            return id_class(4, var1.id_goto, var3, var4);
         default:
            return id_class(0, var1.id_goto, var3, var4);
      }
   }

   private static wK_2[] id_class(int var0, int var1, int var2, int var3, fj_3[] var4, int var5, wK_2 var6, rrxF_2 var7) {
      if (var0 == var1) {
         return var2 == var3
            ? id_class(rrbx_3.UP, var0, rrbx_3.DOWN, var2, var4, var5, var6, var7)
            : id_class(rrbx_3.UP, var0, rrbx_3.DOWN_LEFT, var2, rrbx_3.DOWN_RIGHT, var3, var4, var5, var6, var7);
      } else if (var2 == var3) {
         return id_class(rrbx_3.UP_LEFT, var0, rrbx_3.UP_RIGHT, var1, rrbx_3.DOWN, var2, var4, var5, var6, var7);
      } else if (var0 == var2) {
         return var1 == var3
            ? id_class(rrbx_3.LEFT, var0, rrbx_3.RIGHT, var1, var4, var5, var6, var7)
            : id_class(rrbx_3.LEFT, var0, rrbx_3.UP_RIGHT, var1, rrbx_3.DOWN_RIGHT, var3, var4, var5, var6, var7);
      } else {
         return var1 == var3
            ? id_class(rrbx_3.UP_LEFT, var0, rrbx_3.DOWN_LEFT, var2, rrbx_3.RIGHT, var1, var4, var5, var6, var7)
            : id_class(rrbx_3.UP_LEFT, var0, rrbx_3.UP_RIGHT, var1, rrbx_3.DOWN_LEFT, var2, rrbx_3.DOWN_RIGHT, var3, var4, var5, var6, var7);
      }
   }

   private static wK_2[] id_class(int var0, fj_3[] var1, wK_2 var2, rrxF_2 var3) {
      fj_3 var4 = var1[var0];
      return rrbO_2.id_class(var4, var2, var3);
   }

   private static wK_2[] id_class(rrbx_3 var0, int var1, rrbx_3 var2, int var3, fj_3[] var4, int var5, wK_2 var6, rrxF_2 var7) {
      wK_2 var8 = id_class(var4[var1], var0, var5, var6, var7);
      wK_2 var9 = id_class(var4[var3], var2, var5, var6, var7);
      return var7.id_class(var8, var9);
   }

   private static wK_2[] id_break(int var0, int var1, fj_3[] var2, int var3, wK_2 var4, rrxF_2 var5) {
      return id_class(rrbx_3.UP, var0, rrbx_3.DOWN, var1, var2, var3, var4, var5);
   }
}
