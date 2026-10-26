package celestial;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;

public class rrdk_1 {
   int class_;
   int break_;
   int byte_;
   int protected_;
   boolean throws_;
   boolean case_;
   boolean catch_;
   boolean private_;
   long[] implements_ = new long[10];
   int finally_ = 0;

   public static void byte_(lD_2 var0) {
      if (var0.int_() == 0) {
         break_(var0);
      }
   }

   public rrdk_1() {
      this.implements_[this.finally_] = 0L;
   }

   public static boolean class_(jZ_2 var0, ByteBuffer var1) {
      int var2 = var0.break_();
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

   public void class_(FloatBuffer var1, int var2, int var3, rrxq_3[] var4, int var5, float var6, float var7, float var8) {
      float var9 = 0.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      if (var4 != null && var4.length == 4) {
         rrxq_3 var12 = var4[var3];
         var12.class_(var5, var6, var7, var8);
         if (var12.class_()) {
            var9 = var12.break_();
            var10 = var12.byte_();
            var11 = var12.protected_();
         }
      }

      int var13 = var2 + var3 * this.class_ + 15;
      var1.put(var13 + 0, var9);
      var1.put(var13 + 1, var10);
      var1.put(var13 + 2, var11);
   }

   public static void class_(lD_2 var0, int[] var1) {
      if (var0.int_() == 0) {
         break_(var0);
      }

      rrdk_1 var2 = var0.private_;
      if (var2.class_ == 18) {
         long var3 = var2.implements_[var2.finally_];

         for (byte var5 = 13; var5 + 1 < var1.length; var5 += 18) {
            var1[var5] = (int)var3;
            var1[var5 + 1] = (int)(var3 >> 32);
         }
      }
   }

   public static void class_(lD_2 var0, ByteBuffer var1) {
      if (var0.int_() == 0) {
         break_(var0);
      }

      rrdk_1 var2 = var0.private_;
      if (var2.class_ == 18) {
         long var3 = var2.implements_[var2.finally_];
         int var5 = var1.limit() / 4;

         for (byte var6 = 13; var6 + 1 < var5; var6 += 18) {
            int var7 = (int)var3;
            int var8 = (int)(var3 >> 32);
            var1.putInt(var6 * 4, var7);
            var1.putInt((var6 + 1) * 4, var8);
         }
      }
   }

   public void class_(IntBuffer var1, int var2, int var3, float var4, float var5, float var6) {
      int var7 = (int)(var4 * 64.0F) & 0xFF;
      int var8 = (int)(var5 * 64.0F) & 0xFF;
      int var9 = (int)(var6 * 64.0F) & 0xFF;
      int var10 = (var9 << 16) + (var8 << 8) + var7;
      var1.put(var2 + var3 * this.class_ + 8, var10);
   }

   public void class_(lD_2 var1, int var2) {
      var2 += var1.goto_();
      FloatBuffer var3 = var1.continue_();
      IntBuffer var4 = var1.super_();
      float var5 = var3.get(var2 + 0 * this.class_);
      float var6 = var3.get(var2 + 0 * this.class_ + 1);
      float var7 = var3.get(var2 + 0 * this.class_ + 2);
      float var8 = var3.get(var2 + 0 * this.class_ + this.byte_);
      float var9 = var3.get(var2 + 0 * this.class_ + this.byte_ + 1);
      float var10 = var3.get(var2 + 1 * this.class_);
      float var11 = var3.get(var2 + 1 * this.class_ + 1);
      float var12 = var3.get(var2 + 1 * this.class_ + 2);
      float var13 = var3.get(var2 + 1 * this.class_ + this.byte_);
      float var14 = var3.get(var2 + 1 * this.class_ + this.byte_ + 1);
      float var15 = var3.get(var2 + 2 * this.class_);
      float var16 = var3.get(var2 + 2 * this.class_ + 1);
      float var17 = var3.get(var2 + 2 * this.class_ + 2);
      float var18 = var3.get(var2 + 2 * this.class_ + this.byte_);
      float var19 = var3.get(var2 + 2 * this.class_ + this.byte_ + 1);
      float var20 = var3.get(var2 + 3 * this.class_);
      float var21 = var3.get(var2 + 3 * this.class_ + 1);
      float var22 = var3.get(var2 + 3 * this.class_ + 2);
      float var23 = var3.get(var2 + 3 * this.class_ + this.byte_);
      float var24 = var3.get(var2 + 3 * this.class_ + this.byte_ + 1);
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
      var4.put(var2 + 0 * this.class_ + this.break_, var55);
      var4.put(var2 + 1 * this.class_ + this.break_, var55);
      var4.put(var2 + 2 * this.class_ + this.break_, var55);
      var4.put(var2 + 3 * this.class_ + this.break_, var55);
      int var56 = ((int)(var42 * 32767.0F) & 65535) + (((int)(var43 * 32767.0F) & 65535) << 16);
      int var57 = ((int)(var44 * 32767.0F) & 65535) + (((int)(var51 * 32767.0F) & 65535) << 16);
      var4.put(var2 + 0 * this.class_ + 11, var56);
      var4.put(var2 + 0 * this.class_ + 11 + 1, var57);
      var4.put(var2 + 1 * this.class_ + 11, var56);
      var4.put(var2 + 1 * this.class_ + 11 + 1, var57);
      var4.put(var2 + 2 * this.class_ + 11, var56);
      var4.put(var2 + 2 * this.class_ + 11 + 1, var57);
      var4.put(var2 + 3 * this.class_ + 11, var56);
      var4.put(var2 + 3 * this.class_ + 11 + 1, var57);
      float var58 = (var8 + var13 + var18 + var23) / 4.0F;
      float var59 = (var9 + var14 + var19 + var24) / 4.0F;
      var3.put(var2 + 0 * this.class_ + 9, var58);
      var3.put(var2 + 0 * this.class_ + 9 + 1, var59);
      var3.put(var2 + 1 * this.class_ + 9, var58);
      var3.put(var2 + 1 * this.class_ + 9 + 1, var59);
      var3.put(var2 + 2 * this.class_ + 9, var58);
      var3.put(var2 + 2 * this.class_ + 9 + 1, var59);
      var3.put(var2 + 3 * this.class_ + 9, var58);
      var3.put(var2 + 3 * this.class_ + 9 + 1, var59);
      if (rrdZ.p) {
         rrxq_3[] var60 = var1.else_();
         int var61 = rrbb_3.Q().public_();
         this.class_(var3, var2, 0, var60, var61, var5, var6, var7);
         this.class_(var3, var2, 1, var60, var61, var10, var11, var12);
         this.class_(var3, var2, 2, var60, var61, var15, var16, var17);
         this.class_(var3, var2, 3, var60, var61, var20, var21, var22);
         var1.class_((rrxq_3[])null);
      }

      if (var1.return_() == ju_3.private_) {
         rje_3 var84 = var1.synchronized_();
         float var85 = var84.class_();
         float var62 = var84.break_();
         float var63 = var84.byte_();
         this.class_(var4, var2, 0, var85 - var5, var62 - var6, var63 - var7);
         this.class_(var4, var2, 1, var85 - var10, var62 - var11, var63 - var12);
         this.class_(var4, var2, 2, var85 - var15, var62 - var16, var63 - var17);
         this.class_(var4, var2, 3, var85 - var20, var62 - var21, var63 - var22);
      }
   }

   public static void class_(lD_2 var0) {
      var0.private_ = new rrdk_1();
   }

   public void class_(long var1) {
      this.finally_++;
      this.implements_[this.finally_] = var1;
   }

   public void class_() {
      this.implements_[this.finally_] = 0L;
      this.finally_--;
   }

   public static void class_(xc_3 var0, Ok_1 var1) {
      if (var1 instanceof lD_2 var2) {
         int var3 = rrxt_3.class_(var0);
         int var4 = rrxt_3.break_(var0);
         int var5 = rrxt_3.byte_(var0);
         int var6 = ((var5 & 65535) << 16) + (var3 & 65535);
         int var7 = var4 & 65535;
         var2.private_.class_(((long)var7 << 32) + (long)var6);
      }
   }

   public static void class_(Ok_1 var0) {
      if (var0 instanceof lD_2 var1) {
         var1.private_.class_();
      }
   }

   public static boolean class_(boolean var0, lD_2 var1) {
      var1.private_.class_();
      return var0;
   }

   public static void break_() {
      GL20.glDisableVertexAttribArray(rrdZ.L);
      GL20.glDisableVertexAttribArray(rrdZ.A);
      GL20.glDisableVertexAttribArray(rrdZ.F);
      GL20.glDisableVertexAttribArray(rrdZ.n);
   }

   public static void break_(lD_2 var0) {
      rrdk_1 var1 = var0.private_;
      jZ_2 var2 = var0.return_();
      var1.class_ = var2.break_() / 4;
      var1.throws_ = var2.catch_();
      var1.case_ = var1.throws_;
      var1.catch_ = var2.break_(0);
      var1.break_ = var1.throws_ ? var2.private_() / 4 : 0;
      var1.byte_ = var1.catch_ ? var2.byte_(0) / 4 : 0;
      var1.protected_ = 8;
   }

   public static void throws_(lD_2 var0) {
      rrdk_1 var1 = var0.private_;
      if (var1.class_ == 18 && var0.package_() == 7 && var0.int_() % 4 == 0) {
         var1.class_(var0, var0.this_() - 4 * var1.class_);
      }
   }

   public static void case_(lD_2 var0) {
      if (var0.return_().catch_() && var0.package_() == 7 && var0.int_() % 4 == 0) {
         rrdk_1 var1 = var0.private_;
         break_(var0);
         int var2 = var0.int_() * var1.class_;

         for (int var3 = 0; var3 < var2; var3 += var1.class_ * 4) {
            var1.class_(var0, var3);
         }
      }
   }

   public static void protected_(lD_2 var0) {
      rrdk_1 var1 = var0.private_;
      if (var1.class_ == 18) {
         if (var0.package_() == 7 && var0.int_() % 4 == 0) {
            var1.class_(var0, var0.this_() - 4 * var1.class_);
         }

         long var2 = var1.implements_[var1.finally_];
         int var4 = var0.this_() - 18 + 13;
         var4 += var0.goto_();
         var0.super_().put(var4, (int)var2);
         var0.super_().put(var4 + 1, (int)(var2 >> 32));
      }
   }
}
