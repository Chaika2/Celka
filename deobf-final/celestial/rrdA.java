package celestial;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrdA {
   public static final int class_ = 1048576;
   public static ByteBuffer break_ = BufferUtils.createByteBuffer(4194304);
   public static IntBuffer byte_ = break_.asIntBuffer();
   public static int[] protected_ = new int[1048576];
   public static final int throws_ = 0;
   public static final int case_ = -8421377;
   public static final int catch_ = 0;
   public static Map<Integer, rrdE> private_ = new HashMap<>();

   private static fN_2 byte_(int var0, int var1, int var2) {
      fN_2 var3 = new fN_2(var0, var1, false);
      int var4 = rrzJ_2.case_(var2);
      var3.throws_(var4);
      return var3;
   }

   public static void byte_(int[] var0, int var1, int var2, int var3) {
   }

   public static int byte_(int var0) {
      int var1 = var0 - 1;
      var1 |= var1 >> 1;
      var1 |= var1 >> 2;
      var1 |= var1 >> 4;
      var1 |= var1 >> 8;
      var1 |= var1 >> 16;
      return var1 + 1;
   }

   public static boolean class_(int[] var0, int var1, int var2) {
      int var3 = var1 * var2;
      if (var0[0] >>> 24 == 255 && var0[var3 - 1] == 0) {
         return true;
      } else {
         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = var0[var4] >>> 24;
            if (var5 != 0 && var5 != 255) {
               return true;
            }
         }

         return false;
      }
   }

   public static void class_(int[] var0, int var1, int var2, int var3, int var4) {
      int var5 = 0;
      int var6 = var1;
      int var7 = var2;
      int var8 = var3;

      for (int var9 = var4; var6 > 0 && var7 > 0; var9 /= 2) {
         GL11.glCopyTexSubImage2D(3553, var5, var8, var9, 0, 0, var6, var7);
         var5++;
         var6 /= 2;
         var7 /= 2;
         var8 /= 2;
      }
   }

   public static void class_(rrdE var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      int var8 = var2 * var3;
      IntBuffer var9 = class_(var8);
      rrzJ_2.catch_();
      ((Buffer)var9).clear();
      var9.put(var1, 0, var8);
      ((Buffer)var9).position(0).limit(var8);
      MT.super_(var0.class_);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var9);
      if (var1.length == var8 * 3) {
         ((Buffer)var9).clear();
         ((Buffer)var9.put(var1, var8, var8)).position(0);
         ((Buffer)var9).position(0).limit(var8);
      }

      MT.super_(var0.break_);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var9);
      if (var1.length == var8 * 3) {
         ((Buffer)var9).clear();
         var9.put(var1, var8 * 2, var8);
         ((Buffer)var9).position(0).limit(var8);
      }

      MT.super_(var0.byte_);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var9);
      MT.new_(33984);
   }

   public static rqO_2 class_(rqO_2 var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         String var2 = var0.break_();
         String[] var3 = var2.split(".png");
         String var4 = var3[0];
         return new rqO_2(var0.byte_(), var4 + "_" + var1 + ".png");
      }
   }

   public static int[][] class_(int var0, int var1, int[][] var2) {
      for (int var3 = 1; var3 <= var0; var3++) {
         if (var2[var3] == null) {
            int var4 = var1 >> var3;
            int var5 = var4 * 2;
            int[] var6 = var2[var3 - 1];
            int[] var7 = var2[var3] = new int[var4 * var4];

            for (int var8 = 0; var8 < var4; var8++) {
               for (int var9 = 0; var9 < var4; var9++) {
                  int var10 = var8 * 2 * var5 + var9 * 2;
                  var7[var8 * var4 + var9] = break_(var6[var10], var6[var10 + 1], var6[var10 + var5], var6[var10 + var5 + 1]);
               }
            }
         }
      }

      return var2;
   }

   public static void class_(int[][] var0, int var1, int var2, int var3, int var4, int var5) {
      rrzJ_2.catch_();
      int var6 = var1 * var2;
      IntBuffer var7 = class_(var6);
      int var8 = var0.length;
      int var9 = 0;
      int var10 = var1;
      int var11 = var2;
      int var12 = var3;

      for (int var13 = var4; var10 > 0 && var11 > 0 && var9 < var8; var9++) {
         int var14 = var10 * var11;
         int[] var15 = var0[var9];
         ((Buffer)var7).clear();
         if (var15.length >= var14 * (var5 + 1)) {
            ((Buffer)var7.put(var15, var14 * var5, var14)).position(0).limit(var14);
            GL11.glTexSubImage2D(3553, var9, var12, var13, var10, var11, 32993, 33639, var7);
         }

         var10 >>= 1;
         var11 >>= 1;
         var12 >>= 1;
         var13 >>= 1;
      }

      ((Buffer)var7).clear();
   }

   public static int class_(int var0, int var1, int var2, int var3) {
      int var4 = var0 >>> 24 & 0xFF;
      int var5 = var1 >>> 24 & 0xFF;
      int var6 = var2 >>> 24 & 0xFF;
      int var7 = var3 >>> 24 & 0xFF;
      int var8 = var4 + var5 + var6 + var7;
      int var9 = (var8 + 2) / 4;
      int var10;
      if (var8 != 0) {
         var10 = var8;
      } else {
         var10 = 4;
         var4 = 1;
         var5 = 1;
         var6 = 1;
         var7 = 1;
      }

      int var11 = (var10 + 1) / 2;
      return var9 << 24
         | ((var0 >>> 16 & 0xFF) * var4 + (var1 >>> 16 & 0xFF) * var5 + (var2 >>> 16 & 0xFF) * var6 + (var3 >>> 16 & 0xFF) * var7 + var11) / var10 << 16
         | ((var0 >>> 8 & 0xFF) * var4 + (var1 >>> 8 & 0xFF) * var5 + (var2 >>> 8 & 0xFF) * var6 + (var3 >>> 8 & 0xFF) * var7 + var11) / var10 << 8
         | ((var0 >>> 0 & 0xFF) * var4 + (var1 >>> 0 & 0xFF) * var5 + (var2 >>> 0 & 0xFF) * var6 + (var3 >>> 0 & 0xFF) * var7 + var11) / var10 << 0;
   }

   public static void class_(int[] var0, int var1, int var2, int var3) {
      Math.min(var2, var3);
      int var4 = var1;
      int var5 = var2;
      int var6 = var3;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      int var10;
      for (var10 = 0; var5 > 1 && var6 > 1; var4 = var7) {
         var7 = var4 + var5 * var6;
         var8 = var5 / 2;
         var9 = var6 / 2;

         for (int var11 = 0; var11 < var9; var11++) {
            int var12 = var7 + var11 * var8;
            int var13 = var4 + var11 * 2 * var5;

            for (int var14 = 0; var14 < var8; var14++) {
               var0[var12 + var14] = class_(
                  var0[var13 + var14 * 2], var0[var13 + var14 * 2 + 1], var0[var13 + var5 + var14 * 2], var0[var13 + var5 + var14 * 2 + 1]
               );
            }
         }

         var10++;
         var5 = var8;
         var6 = var9;
      }

      while (var10 > 0) {
         var5 = var2 >> --var10;
         var6 = var3 >> var10;
         var4 = var7 - var5 * var6;
         int var19 = var4;

         for (int var20 = 0; var20 < var6; var20++) {
            for (int var21 = 0; var21 < var5; var21++) {
               if (var0[var19] == 0) {
                  var0[var19] = var0[var7 + var20 / 2 * var8 + var21 / 2] & 16777215;
               }

               var19++;
            }
         }

         var7 = var4;
         var8 = var5;
      }
   }

   public static int[][] class_(int[][] var0, int var1, int var2, int var3) {
      int var4 = var0.length;
      int[][] var5 = new int[var4][];

      for (int var6 = 0; var6 < var4; var6++) {
         int[] var7 = var0[var6];
         if (var7 != null) {
            int var8 = (var1 >> var6) * (var2 >> var6);
            int[] var9 = new int[var8 * 3];
            var5[var6] = var9;
            int var10 = var7.length / 3;
            int var11 = var8 * var3;
            int var12 = 0;
            System.arraycopy(var7, var11, var9, var12, var8);
            var11 += var10;
            var12 += var8;
            System.arraycopy(var7, var11, var9, var12, var8);
            var11 += var10;
            var12 += var8;
            System.arraycopy(var7, var11, var9, var12, var8);
         }
      }

      return var5;
   }

   public static int[][] class_(fj_3 var0, int[][] var1, int var2, int var3) {
      boolean var4 = true;
      return var1;
   }

   public static void class_(fj_3 var0, int[] var1) {
   }

   public static BufferedImage class_(rqO_2 var0) {
      try {
         if (!rrbb_3.byte_(var0)) {
            return null;
         } else {
            InputStream var1 = rrbb_3.class_(var0);
            if (var1 == null) {
               return null;
            } else {
               BufferedImage var2 = ImageIO.read(var1);
               var1.close();
               return var2;
            }
         }
      } catch (IOException var3) {
         return null;
      }
   }

   private static fN_2 class_(rAL var0, rqO_2 var1, int var2, int var3, int var4) {
      fN_2 var5 = class_(var0, var1, var2, var3);
      if (var5 == null) {
         var5 = new fN_2(var2, var3, false);
         int var6 = rrzJ_2.case_(var4);
         var5.class_(0, 0, var2, var3, var6);
      }

      return var5;
   }

   private static fN_2 class_(rAL var0, rqO_2 var1, int var2, int var3) {
      if (var1 == null) {
         return null;
      } else {
         try {
            rAF var4 = var0.class_(var1);
            fN_2 var5 = fN_2.class_(var4.break_());
            if (var5 == null) {
               return null;
            } else if (var5.class_() == var2 && var5.break_() == var3) {
               return var5;
            } else {
               var5.close();
               return null;
            }
         } catch (IOException var6) {
            return null;
         }
      }
   }

   public static void class_(int var0, fN_2 var1, boolean var2, boolean var3, rAL var4, rqO_2 var5, rrdE var6) {
      int var7 = var1.class_();
      int var8 = var1.break_();
      rqO_2 var9 = class_(var5, "n");
      fN_2 var10 = class_(var4, var9, var7, var8, -8421377);
      fo_3.class_(var6.break_, 0, var7, var8);
      var10.class_(0, 0, 0, 0, 0, var7, var8, var2, var3, false, true);
      rqO_2 var11 = class_(var5, "s");
      fN_2 var12 = class_(var4, var11, var7, var8, 0);
      fo_3.class_(var6.byte_, 0, var7, var8);
      var12.class_(0, 0, 0, 0, 0, var7, var8, var2, var3, false, true);
      MT.super_(var6.class_);
   }

   public static IntBuffer class_(int var0) {
      if (byte_.capacity() < var0) {
         int var1 = byte_(var0);
         break_ = BufferUtils.createByteBuffer(var1 * 4);
         byte_ = break_.asIntBuffer();
      }

      return byte_;
   }

   public static void class_(rrdE var0) {
      class_(var0.break_, var0.byte_, true, true, false);
   }

   public static IntBuffer class_(int var0, int var1) {
      int[] var2 = break_(var0);
      IntBuffer var3 = class_(var0);
      Arrays.fill(protected_, 0, var0, var1);
      byte_.put(protected_, 0, var0);
      return byte_;
   }

   public static void class_(rrdE var0, boolean var1, boolean var2, boolean var3) {
      if (rrdZ.volatile_ && MT.P() == 33984) {
         if (rrdZ.SV) {
            MT.new_(33985);
            MT.super_(var0.break_);
            if (!var1) {
               int var4 = var3 ? 9984 : 9728;
               MT.break_(3553, 10241, var4);
               MT.break_(3553, 10240, 9728);
            }
         }

         if (rrdZ.Sg) {
            MT.new_(33987);
            MT.super_(var0.byte_);
            if (!var2) {
               int var5 = var3 ? 9984 : 9728;
               MT.break_(3553, 10241, var5);
               MT.break_(3553, 10240, 9728);
            }
         }

         MT.new_(33984);
      }

      MT.super_(var0.class_);
   }

   public static void class_(fk_3 var0) {
      rrdE var1 = var0.this_();
      fN_2 var2 = var0.break_();
      int var3 = var2.class_();
      int var4 = var2.break_();
      fN_2 var5 = byte_(var3, var4, -8421377);
      fo_3.class_(var1.break_, var3, var4);
      var5.class_(0, 0, 0, 0, 0, var3, var4, false, false, false, true);
      fN_2 var6 = byte_(var3, var4, 0);
      fo_3.class_(var1.byte_, var3, var4);
      var6.class_(0, 0, 0, 0, 0, var3, var4, false, false, false, true);
      MT.super_(var1.class_);
   }

   public static void class_(int var0, int var1, boolean var2, boolean var3, boolean var4) {
      if (rrdZ.volatile_ && MT.P() == 33984) {
         if (rrdZ.SV) {
            MT.new_(33985);
            MT.super_(var0);
            if (!var2) {
               int var5 = var4 ? 9984 : 9728;
               MT.break_(3553, 10241, var5);
               MT.break_(3553, 10240, 9728);
            }
         }

         if (rrdZ.Sg) {
            MT.new_(33987);
            MT.super_(var1);
            if (!var3) {
               int var6 = var4 ? 9984 : 9728;
               MT.break_(3553, 10241, var6);
               MT.break_(3553, 10240, 9728);
            }
         }

         MT.new_(33984);
      }
   }

   public static void class_(ff_3 var0, int var1) {
      rrdE var2 = var0.implements_;
      if (var2 != null) {
         var0.implements_ = null;
         private_.remove(var2.class_);
         MT.continue_(var2.break_);
         MT.continue_(var2.byte_);
         if (var2.class_ != var1) {
            rrdJ.break_("Error : MultiTexID.base mismatch: " + var2.class_ + ", texid: " + var1);
            MT.continue_(var2.class_);
         }
      }
   }

   public static rrdE class_(ff_3 var0) {
      rrdE var1 = var0.implements_;
      if (var1 == null) {
         int var2 = var0.new_();
         var1 = private_.get(var2);
         if (var1 == null) {
            var1 = new rrdE(var2, GL11.glGenTextures(), GL11.glGenTextures());
            private_.put(var2, var1);
         }

         var0.implements_ = var1;
      }

      return var1;
   }

   public static ff_3 class_() {
      fk_3 var0 = new fk_3(1, 1, true);
      var0.break_().class_(0, 0, -1);
      var0.class_();
      return var0;
   }

   private static fN_2[] class_(fN_2 var0, int var1) {
      if (var1 < 0) {
         var1 = 0;
      }

      fN_2[] var2 = new fN_2[var1 + 1];
      var2[0] = var0;
      if (var1 > 0) {
         for (int var3 = 1; var3 <= var1; var3++) {
            fN_2 var4 = var2[var3 - 1];
            fN_2 var5 = new fN_2(var4.class_() >> 1, var4.break_() >> 1, false);
            int var6 = var5.class_();
            int var7 = var5.break_();

            for (int var8 = 0; var8 < var6; var8++) {
               for (int var9 = 0; var9 < var7; var9++) {
                  var5.class_(
                     var8,
                     var9,
                     break_(
                        var4.class_(var8 * 2 + 0, var9 * 2 + 0),
                        var4.class_(var8 * 2 + 1, var9 * 2 + 0),
                        var4.class_(var8 * 2 + 0, var9 * 2 + 1),
                        var4.class_(var8 * 2 + 1, var9 * 2 + 1)
                     )
                  );
               }
            }

            var2[var3] = var5;
         }
      }

      return var2;
   }

   public static void class_(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 * var2;
      IntBuffer var7 = class_(var6);
      ((Buffer)var7).clear();
      int var8 = var5 * var6;
      if (var0.length >= var8 + var6) {
         ((Buffer)var7.put(var0, var8, var6)).position(0).limit(var6);
         rrzJ_2.catch_();
         GL11.glTexSubImage2D(3553, 0, var3, var4, var1, var2, 32993, 33639, var7);
         ((Buffer)var7).clear();
      }
   }

   public static void class_(int var0, int var1, int var2) {
      if (rrdZ.volatile_ && MT.P() == 33984) {
         MT.new_(33985);
         MT.super_(var1);
         MT.new_(33987);
         MT.super_(var2);
         MT.new_(33984);
      }

      MT.super_(var0);
   }

   public static void class_(int var0, int var1, int var2, fJ_2 var3) {
      rrdE var4 = class_(var3);
      if (rrdZ.SV) {
         rrdJ.byte_("Allocate texture map normal: " + var1 + "x" + var2 + ", mipmaps: " + var0);
         fo_3.class_(var4.break_, var0, var1, var2);
      }

      if (rrdZ.Sg) {
         rrdJ.byte_("Allocate texture map specular: " + var1 + "x" + var2 + ", mipmaps: " + var0);
         fo_3.class_(var4.byte_, var0, var1, var2);
      }

      MT.super_(var4.class_);
   }

   public static void break_() {
      fY_2 var0 = QY.instanceof_().A();
      ff_3 var1 = var0.break_(fJ_2.class_);
      if (var1 != null) {
         rrdE var2 = var1.this_();
         MT.super_(var2.class_);
         GL11.glTexParameteri(3553, 10241, rrdZ.Sa[rrdZ.Sq]);
         GL11.glTexParameteri(3553, 10240, rrdZ.Si[rrdZ.Sw]);
         MT.super_(var2.break_);
         GL11.glTexParameteri(3553, 10241, rrdZ.Sa[rrdZ.ST]);
         GL11.glTexParameteri(3553, 10240, rrdZ.Si[rrdZ.SI]);
         MT.super_(var2.byte_);
         GL11.glTexParameteri(3553, 10241, rrdZ.Sa[rrdZ.St]);
         GL11.glTexParameteri(3553, 10240, rrdZ.Si[rrdZ.Sf]);
         MT.super_(0);
      }
   }

   public static int break_(int var0, int var1, int var2) {
      int var3 = 255 - var2;
      return ((var0 >>> 24 & 0xFF) * var2 + (var1 >>> 24 & 0xFF) * var3) / 255 << 24
         | ((var0 >>> 16 & 0xFF) * var2 + (var1 >>> 16 & 0xFF) * var3) / 255 << 16
         | ((var0 >>> 8 & 0xFF) * var2 + (var1 >>> 8 & 0xFF) * var3) / 255 << 8
         | ((var0 >>> 0 & 0xFF) * var2 + (var1 >>> 0 & 0xFF) * var3) / 255 << 0;
   }

   public static int[] break_(int var0, int var1) {
      int[] var2 = new int[var0 * 3];
      Arrays.fill(var2, 0, var0, var1);
      Arrays.fill(var2, var0, var0 * 2, -8421377);
      Arrays.fill(var2, var0 * 2, var0 * 3, 0);
      return var2;
   }

   public static void break_(ff_3 var0) {
      int var1 = var0.new_();
      boolean var2 = true;
      boolean var3 = true;
      boolean var4 = false;
      if (var0 instanceof fJ_2 var5) {
         var2 = var5.package_();
         var3 = var5.int_();
         var4 = var5.volatile_();
      }

      class_(var0.this_(), var2, var3, var4);
      if (MT.P() == 33984) {
         int var8 = rrdZ.j;
         int var6 = rrdZ.V;
         if (var0 instanceof fJ_2) {
            rrdZ.j = ((fJ_2)var0).byte_;
            rrdZ.V = ((fJ_2)var0).protected_;
         } else {
            rrdZ.j = 0;
            rrdZ.V = 0;
         }

         if (rrdZ.j != var8 || rrdZ.V != var6) {
            boolean var7 = rrxn_3.class_(false);
            rrdZ.Pj.class_(rrdZ.j, rrdZ.V);
            rrxn_3.class_(var7);
         }
      }
   }

   public static int break_(int var0, int var1, int var2, int var3) {
      return ((var0 >>> 24 & 0xFF) + (var1 >>> 24 & 0xFF) + (var2 >>> 24 & 0xFF) + (var3 >>> 24 & 0xFF) + 2) / 4 << 24
         | ((var0 >>> 16 & 0xFF) + (var1 >>> 16 & 0xFF) + (var2 >>> 16 & 0xFF) + (var3 >>> 16 & 0xFF) + 2) / 4 << 16
         | ((var0 >>> 8 & 0xFF) + (var1 >>> 8 & 0xFF) + (var2 >>> 8 & 0xFF) + (var3 >>> 8 & 0xFF) + 2) / 4 << 8
         | ((var0 >>> 0 & 0xFF) + (var1 >>> 0 & 0xFF) + (var2 >>> 0 & 0xFF) + (var3 >>> 0 & 0xFF) + 2) / 4 << 0;
   }

   public static int[] break_(int var0) {
      if (protected_ == null) {
         protected_ = new int[1048576];
      }

      if (protected_.length < var0) {
         protected_ = new int[byte_(var0)];
      }

      return protected_;
   }

   public static void break_(int[] var0, int var1, int var2, int var3) {
      Math.min(var2, var3);
      int var4 = var1;
      int var5 = var2;
      int var6 = var3;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      int var10;
      for (var10 = 0; var5 > 1 && var6 > 1; var4 = var7) {
         var7 = var4 + var5 * var6;
         var8 = var5 / 2;
         var9 = var6 / 2;

         for (int var11 = 0; var11 < var9; var11++) {
            int var12 = var7 + var11 * var8;
            int var13 = var4 + var11 * 2 * var5;

            for (int var14 = 0; var14 < var8; var14++) {
               var0[var12 + var14] = break_(
                  var0[var13 + var14 * 2], var0[var13 + var14 * 2 + 1], var0[var13 + var5 + var14 * 2], var0[var13 + var5 + var14 * 2 + 1]
               );
            }
         }

         var10++;
         var5 = var8;
         var6 = var9;
      }

      while (var10 > 0) {
         var5 = var2 >> --var10;
         var6 = var3 >> var10;
         var4 = var7 - var5 * var6;
         int var19 = var4;

         for (int var20 = 0; var20 < var6; var20++) {
            for (int var21 = 0; var21 < var5; var21++) {
               if (var0[var19] == 0) {
                  var0[var19] = var0[var7 + var20 / 2 * var8 + var21 / 2] & 16777215;
               }

               var19++;
            }
         }

         var7 = var4;
         var8 = var5;
      }
   }

   public static int[] throws_(int var0) {
      int[] var1 = new int[var0 * 3];
      Arrays.fill(var1, 0, var0, 0);
      Arrays.fill(var1, var0, var0 * 2, -8421377);
      Arrays.fill(var1, var0 * 2, var0 * 3, 0);
      return var1;
   }

   public static void case_(int var0) {
      rrdE var1 = private_.get(var0);
      class_(var1, true, true, false);
   }

   public static int protected_(int var0) {
      int var1 = 0;
      if ((var0 & -65536) != 0) {
         var1 += 16;
         var0 >>= 16;
      }

      if ((var0 & 0xFF00) != 0) {
         var1 += 8;
         var0 >>= 8;
      }

      if ((var0 & 240) != 0) {
         var1 += 4;
         var0 >>= 4;
      }

      if ((var0 & 6) != 0) {
         var1 += 2;
         var0 >>= 2;
      }

      if ((var0 & 2) != 0) {
         var1++;
      }

      return var1;
   }
}
