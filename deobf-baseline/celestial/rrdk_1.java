package celestial;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;

public class rrdk_1 {
   int id_class;
   int id_break;
   int id_byte;
   int id_protected;
   boolean id_throws;
   boolean id_case;
   boolean id_catch;
   boolean id_private;
   long[] id_implements = new long[10];
   int id_finally = 0;

   public static void id_byte(lD_2 var0) {
      if (var0.id_int() == 0) {
         id_break(var0);
      }
   }

   public rrdk_1() {
      this.id_implements[this.id_finally] = 0L;
   }

   public static boolean id_class(jZ_2 var0, ByteBuffer var1) {
      int var2 = var0.id_break();
      if (var2 != 72) {
         return false;
      } else {
         ((Buffer)var1).position(36);
         GL20.glVertexAttribPointer(rrdZ.L, 2, 5126, false, var2, var1);
         ((Buffer)var1).position(44);
         GL20.glVertexAttribPointer(rrdZ.A, 4, 5122, false, var2, var1);
         ((Buffer)var1).position(52);
         GL20.glVertexAttribPointer(rrdZ.F, 3, 5122, false, var2, var1);
         ((Buffer)var1).position(60);
         GL20.glVertexAttribPointer(rrdZ.n, 3, 5126, false, var2, var1);
         ((Buffer)var1).position(0);
         GL20.glEnableVertexAttribArray(rrdZ.L);
         GL20.glEnableVertexAttribArray(rrdZ.A);
         GL20.glEnableVertexAttribArray(rrdZ.F);
         GL20.glEnableVertexAttribArray(rrdZ.n);
         return true;
      }
   }

   public void id_class(FloatBuffer var1, int var2, int var3, rrxq_3[] var4, int var5, float var6, float var7, float var8) {
      float var9 = 0.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      if (var4 != null && var4.length == 4) {
         rrxq_3 var12 = var4[var3];
         var12.id_class(var5, var6, var7, var8);
         if (var12.id_class()) {
            var9 = var12.id_break();
            var10 = var12.id_byte();
            var11 = var12.id_protected();
         }
      }

      int var13 = var2 + var3 * this.id_class + 15;
      var1.put(var13 + 0, var9);
      var1.put(var13 + 1, var10);
      var1.put(var13 + 2, var11);
   }

   public static void id_class(lD_2 var0, int[] var1) {
      if (var0.id_int() == 0) {
         id_break(var0);
      }

      rrdk_1 var2 = var0.id_private;
      if (var2.id_class == 18) {
         long var3 = var2.id_implements[var2.id_finally];

         for (byte var5 = 13; var5 + 1 < var1.length; var5 += 18) {
            var1[var5] = (int)var3;
            var1[var5 + 1] = (int)(var3 >> 32);
         }
      }
   }

   public static void id_class(lD_2 var0, ByteBuffer var1) {
      if (var0.id_int() == 0) {
         id_break(var0);
      }

      rrdk_1 var2 = var0.id_private;
      if (var2.id_class == 18) {
         long var3 = var2.id_implements[var2.id_finally];
         int var5 = var1.limit() / 4;

         for (byte var6 = 13; var6 + 1 < var5; var6 += 18) {
            int var7 = (int)var3;
            int var8 = (int)(var3 >> 32);
            var1.putInt(var6 * 4, var7);
            var1.putInt((var6 + 1) * 4, var8);
         }
      }
   }

   public void id_class(IntBuffer var1, int var2, int var3, float var4, float var5, float var6) {
      int var7 = (int)(var4 * 64.0F) & 0xFF;
      int var8 = (int)(var5 * 64.0F) & 0xFF;
      int var9 = (int)(var6 * 64.0F) & 0xFF;
      int var10 = (var9 << 16) + (var8 << 8) + var7;
      var1.put(var2 + var3 * this.id_class + 8, var10);
   }

   public void id_class(lD_2 var1, int var2) {
      var2 += var1.id_goto();
      FloatBuffer var3 = var1.id_continue();
      IntBuffer var4 = var1.id_super();
      float var5 = var3.get(var2 + 0 * this.id_class);
      float var6 = var3.get(var2 + 0 * this.id_class + 1);
      float var7 = var3.get(var2 + 0 * this.id_class + 2);
      float var8 = var3.get(var2 + 0 * this.id_class + this.id_byte);
      float var9 = var3.get(var2 + 0 * this.id_class + this.id_byte + 1);
      float var10 = var3.get(var2 + 1 * this.id_class);
      float var11 = var3.get(var2 + 1 * this.id_class + 1);
      float var12 = var3.get(var2 + 1 * this.id_class + 2);
      float var13 = var3.get(var2 + 1 * this.id_class + this.id_byte);
      float var14 = var3.get(var2 + 1 * this.id_class + this.id_byte + 1);
      float var15 = var3.get(var2 + 2 * this.id_class);
      float var16 = var3.get(var2 + 2 * this.id_class + 1);
      float var17 = var3.get(var2 + 2 * this.id_class + 2);
      float var18 = var3.get(var2 + 2 * this.id_class + this.id_byte);
      float var19 = var3.get(var2 + 2 * this.id_class + this.id_byte + 1);
      float var20 = var3.get(var2 + 3 * this.id_class);
      float var21 = var3.get(var2 + 3 * this.id_class + 1);
      float var22 = var3.get(var2 + 3 * this.id_class + 2);
      float var23 = var3.get(var2 + 3 * this.id_class + this.id_byte);
      float var24 = var3.get(var2 + 3 * this.id_class + this.id_byte + 1);
      float var25 = var15 - var5;
      float var26 = var16 - var6;
      float var27 = var17 - var7;
      float var28 = var20 - var10;
      float var29 = var21 - var11;
      float var30 = var22 - var12;
      float var31 = var26 * var30 - var29 * var27;
      float var32 = var27 * var28 - var30 * var25;
      float var33 = var25 * var29 - var28 * var26;
      float var34 = var31 * var31 + var32 * var32 + var33 * var33;
      float var35 = (double)var34 != 0.0 ? (float)(1.0 / Math.sqrt((double)var34)) : 1.0F;
      var31 *= var35;
      var32 *= var35;
      var33 *= var35;
      var25 = var10 - var5;
      var26 = var11 - var6;
      var27 = var12 - var7;
      float var36 = var13 - var8;
      float var37 = var14 - var9;
      var28 = var15 - var5;
      var29 = var16 - var6;
      var30 = var17 - var7;
      float var38 = var18 - var8;
      float var39 = var19 - var9;
      float var40 = var36 * var39 - var38 * var37;
      float var41 = var40 != 0.0F ? 1.0F / var40 : 1.0F;
      float var42 = (var39 * var25 - var37 * var28) * var41;
      float var43 = (var39 * var26 - var37 * var29) * var41;
      float var44 = (var39 * var27 - var37 * var30) * var41;
      float var45 = (var36 * var28 - var38 * var25) * var41;
      float var46 = (var36 * var29 - var38 * var26) * var41;
      float var47 = (var36 * var30 - var38 * var27) * var41;
      var34 = var42 * var42 + var43 * var43 + var44 * var44;
      var35 = (double)var34 != 0.0 ? (float)(1.0 / Math.sqrt((double)var34)) : 1.0F;
      var42 *= var35;
      var43 *= var35;
      var44 *= var35;
      var34 = var45 * var45 + var46 * var46 + var47 * var47;
      var35 = (double)var34 != 0.0 ? (float)(1.0 / Math.sqrt((double)var34)) : 1.0F;
      var45 *= var35;
      var46 *= var35;
      var47 *= var35;
      float var48 = var33 * var43 - var32 * var44;
      float var49 = var31 * var44 - var33 * var42;
      float var50 = var32 * var42 - var31 * var43;
      float var51 = var45 * var48 + var46 * var49 + var47 * var50 < 0.0F ? -1.0F : 1.0F;
      int var52 = (int)(var31 * 127.0F) & 0xFF;
      int var53 = (int)(var32 * 127.0F) & 0xFF;
      int var54 = (int)(var33 * 127.0F) & 0xFF;
      int var55 = (var54 << 16) + (var53 << 8) + var52;
      var4.put(var2 + 0 * this.id_class + this.id_break, var55);
      var4.put(var2 + 1 * this.id_class + this.id_break, var55);
      var4.put(var2 + 2 * this.id_class + this.id_break, var55);
      var4.put(var2 + 3 * this.id_class + this.id_break, var55);
      int var56 = ((int)(var42 * 32767.0F) & 65535) + (((int)(var43 * 32767.0F) & 65535) << 16);
      int var57 = ((int)(var44 * 32767.0F) & 65535) + (((int)(var51 * 32767.0F) & 65535) << 16);
      var4.put(var2 + 0 * this.id_class + 11, var56);
      var4.put(var2 + 0 * this.id_class + 11 + 1, var57);
      var4.put(var2 + 1 * this.id_class + 11, var56);
      var4.put(var2 + 1 * this.id_class + 11 + 1, var57);
      var4.put(var2 + 2 * this.id_class + 11, var56);
      var4.put(var2 + 2 * this.id_class + 11 + 1, var57);
      var4.put(var2 + 3 * this.id_class + 11, var56);
      var4.put(var2 + 3 * this.id_class + 11 + 1, var57);
      float var58 = (var8 + var13 + var18 + var23) / 4.0F;
      float var59 = (var9 + var14 + var19 + var24) / 4.0F;
      var3.put(var2 + 0 * this.id_class + 9, var58);
      var3.put(var2 + 0 * this.id_class + 9 + 1, var59);
      var3.put(var2 + 1 * this.id_class + 9, var58);
      var3.put(var2 + 1 * this.id_class + 9 + 1, var59);
      var3.put(var2 + 2 * this.id_class + 9, var58);
      var3.put(var2 + 2 * this.id_class + 9 + 1, var59);
      var3.put(var2 + 3 * this.id_class + 9, var58);
      var3.put(var2 + 3 * this.id_class + 9 + 1, var59);
      if (rrdZ.p) {
         rrxq_3[] var60 = var1.id_else();
         int var61 = rrbb_3.Q().id_public();
         this.id_class(var3, var2, 0, var60, var61, var5, var6, var7);
         this.id_class(var3, var2, 1, var60, var61, var10, var11, var12);
         this.id_class(var3, var2, 2, var60, var61, var15, var16, var17);
         this.id_class(var3, var2, 3, var60, var61, var20, var21, var22);
         var1.id_class((rrxq_3[])null);
      }

      if (var1.id_return() == ju_3.id_private) {
         rje_3 var84 = var1.id_synchronized();
         float var85 = var84.id_class();
         float var62 = var84.id_break();
         float var63 = var84.id_byte();
         this.id_class(var4, var2, 0, var85 - var5, var62 - var6, var63 - var7);
         this.id_class(var4, var2, 1, var85 - var10, var62 - var11, var63 - var12);
         this.id_class(var4, var2, 2, var85 - var15, var62 - var16, var63 - var17);
         this.id_class(var4, var2, 3, var85 - var20, var62 - var21, var63 - var22);
      }
   }

   public static void id_class(lD_2 var0) {
      var0.id_private = new rrdk_1();
   }

   public void id_class(long var1) {
      this.id_finally++;
      this.id_implements[this.id_finally] = var1;
   }

   public void id_class() {
      this.id_implements[this.id_finally] = 0L;
      this.id_finally--;
   }

   public static void id_class(xc_3 var0, Ok_1 var1) {
      if (var1 instanceof lD_2 var2) {
         int var3 = rrxt_3.id_class(var0);
         int var4 = rrxt_3.id_break(var0);
         int var5 = rrxt_3.id_byte(var0);
         int var6 = ((var5 & 65535) << 16) + (var3 & 65535);
         int var7 = var4 & 65535;
         var2.id_private.id_class(((long)var7 << 32) + (long)var6);
      }
   }

   public static void id_class(Ok_1 var0) {
      if (var0 instanceof lD_2 var1) {
         var1.id_private.id_class();
      }
   }

   public static boolean id_class(boolean var0, lD_2 var1) {
      var1.id_private.id_class();
      return var0;
   }

   public static void id_break() {
      GL20.glDisableVertexAttribArray(rrdZ.L);
      GL20.glDisableVertexAttribArray(rrdZ.A);
      GL20.glDisableVertexAttribArray(rrdZ.F);
      GL20.glDisableVertexAttribArray(rrdZ.n);
   }

   public static void id_break(lD_2 var0) {
      rrdk_1 var1 = var0.id_private;
      jZ_2 var2 = var0.id_return();
      var1.id_class = var2.id_break() / 4;
      var1.id_throws = var2.id_catch();
      var1.id_case = var1.id_throws;
      var1.id_catch = var2.id_break(0);
      var1.id_break = var1.id_throws ? var2.id_private() / 4 : 0;
      var1.id_byte = var1.id_catch ? var2.id_byte(0) / 4 : 0;
      var1.id_protected = 8;
   }

   public static void id_throws(lD_2 var0) {
      rrdk_1 var1 = var0.id_private;
      if (var1.id_class == 18 && var0.id_package() == 7 && var0.id_int() % 4 == 0) {
         var1.id_class(var0, var0.id_this() - 4 * var1.id_class);
      }
   }

   public static void id_case(lD_2 var0) {
      if (var0.id_return().id_catch() && var0.id_package() == 7 && var0.id_int() % 4 == 0) {
         rrdk_1 var1 = var0.id_private;
         id_break(var0);
         int var2 = var0.id_int() * var1.id_class;

         for (int var3 = 0; var3 < var2; var3 += var1.id_class * 4) {
            var1.id_class(var0, var3);
         }
      }
   }

   public static void id_protected(lD_2 var0) {
      rrdk_1 var1 = var0.id_private;
      if (var1.id_class == 18) {
         if (var0.id_package() == 7 && var0.id_int() % 4 == 0) {
            var1.id_class(var0, var0.id_this() - 4 * var1.id_class);
         }

         long var2 = var1.id_implements[var1.id_finally];
         int var4 = var0.id_this() - 18 + 13;
         var4 += var0.id_goto();
         var0.id_super().put(var4, (int)var2);
         var0.id_super().put(var4 + 1, (int)(var2 >> 32));
      }
   }
}
