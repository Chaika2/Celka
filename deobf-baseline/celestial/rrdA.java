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
   public static final int id_class = 1048576;
   public static ByteBuffer id_break = BufferUtils.createByteBuffer(4194304);
   public static IntBuffer id_byte = id_break.asIntBuffer();
   public static int[] id_protected = new int[1048576];
   public static final int id_throws = 0;
   public static final int id_case = -8421377;
   public static final int id_catch = 0;
   public static Map<Integer, rrdE> id_private = new HashMap<>();

   private static fN_2 id_byte(int var0, int var1, int var2) {
      fN_2 var3 = new fN_2(var0, var1, false);
      int var4 = rrzJ_2.id_case(var2);
      var3.id_throws(var4);
      return var3;
   }

   public static void id_byte(int[] var0, int var1, int var2, int var3) {
   }

   public static int id_byte(int var0) {
      int var1 = var0 - 1;
      var1 |= var1 >> 1;
      var1 |= var1 >> 2;
      var1 |= var1 >> 4;
      var1 |= var1 >> 8;
      var1 |= var1 >> 16;
      return var1 + 1;
   }

   public static boolean id_class(int[] var0, int var1, int var2) {
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

   public static void id_class(int[] var0, int var1, int var2, int var3, int var4) {
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

   public static void id_class(rrdE var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      int var8 = var2 * var3;
      IntBuffer var9 = id_class(var8);
      rrzJ_2.id_catch();
      ((Buffer)var9).clear();
      var9.put(var1, 0, var8);
      ((Buffer)var9).position(0).limit(var8);
      MT.id_super(var0.id_class);
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

      MT.id_super(var0.id_break);
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

      MT.id_super(var0.id_byte);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, 32993, 33639, var9);
      MT.id_new(33984);
   }

   public static rqO_2 id_class(rqO_2 var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         String var2 = var0.id_break();
         String[] var3 = var2.split(".png");
         String var4 = var3[0];
         return new rqO_2(var0.id_byte(), var4 + "_" + var1 + ".png");
      }
   }

   public static int[][] id_class(int var0, int var1, int[][] var2) {
      for (int var3 = 1; var3 <= var0; var3++) {
         if (var2[var3] == null) {
            int var4 = var1 >> var3;
            int var5 = var4 * 2;
            int[] var6 = var2[var3 - 1];
            int[] var7 = var2[var3] = new int[var4 * var4];

            for (int var8 = 0; var8 < var4; var8++) {
               for (int var9 = 0; var9 < var4; var9++) {
                  int var10 = var8 * 2 * var5 + var9 * 2;
                  var7[var8 * var4 + var9] = id_break(var6[var10], var6[var10 + 1], var6[var10 + var5], var6[var10 + var5 + 1]);
               }
            }
         }
      }

      return var2;
   }

   public static void id_class(int[][] var0, int var1, int var2, int var3, int var4, int var5) {
      rrzJ_2.id_catch();
      int var6 = var1 * var2;
      IntBuffer var7 = id_class(var6);
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

   public static int id_class(int var0, int var1, int var2, int var3) {
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

   public static void id_class(int[] var0, int var1, int var2, int var3) {
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
               var0[var12 + var14] = id_class(
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

   public static int[][] id_class(int[][] var0, int var1, int var2, int var3) {
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

   public static int[][] id_class(fj_3 var0, int[][] var1, int var2, int var3) {
      boolean var4 = true;
      return var1;
   }

   public static void id_class(fj_3 var0, int[] var1) {
   }

   public static BufferedImage id_class(rqO_2 var0) {
      try {
         if (!rrbb_3.id_byte(var0)) {
            return null;
         } else {
            InputStream var1 = rrbb_3.id_class(var0);
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

   private static fN_2 id_class(rAL var0, rqO_2 var1, int var2, int var3, int var4) {
      fN_2 var5 = id_class(var0, var1, var2, var3);
      if (var5 == null) {
         var5 = new fN_2(var2, var3, false);
         int var6 = rrzJ_2.id_case(var4);
         var5.id_class(0, 0, var2, var3, var6);
      }

      return var5;
   }

   private static fN_2 id_class(rAL var0, rqO_2 var1, int var2, int var3) {
      if (var1 == null) {
         return null;
      } else {
         try {
            rAF var4 = var0.id_class(var1);
            fN_2 var5 = fN_2.id_class(var4.id_break());
            if (var5 == null) {
               return null;
            } else if (var5.id_class() == var2 && var5.id_break() == var3) {
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

   public static void id_class(int var0, fN_2 var1, boolean var2, boolean var3, rAL var4, rqO_2 var5, rrdE var6) {
      int var7 = var1.id_class();
      int var8 = var1.id_break();
      rqO_2 var9 = id_class(var5, "n");
      fN_2 var10 = id_class(var4, var9, var7, var8, -8421377);
      fo_3.id_class(var6.id_break, 0, var7, var8);
      var10.id_class(0, 0, 0, 0, 0, var7, var8, var2, var3, false, true);
      rqO_2 var11 = id_class(var5, "s");
      fN_2 var12 = id_class(var4, var11, var7, var8, 0);
      fo_3.id_class(var6.id_byte, 0, var7, var8);
      var12.id_class(0, 0, 0, 0, 0, var7, var8, var2, var3, false, true);
      MT.id_super(var6.id_class);
   }

   public static IntBuffer id_class(int var0) {
      if (id_byte.capacity() < var0) {
         int var1 = id_byte(var0);
         id_break = BufferUtils.createByteBuffer(var1 * 4);
         id_byte = id_break.asIntBuffer();
      }

      return id_byte;
   }

   public static void id_class(rrdE var0) {
      id_class(var0.id_break, var0.id_byte, true, true, false);
   }

   public static IntBuffer id_class(int var0, int var1) {
      int[] var2 = id_break(var0);
      IntBuffer var3 = id_class(var0);
      Arrays.fill(id_protected, 0, var0, var1);
      id_byte.put(id_protected, 0, var0);
      return id_byte;
   }

   public static void id_class(rrdE var0, boolean var1, boolean var2, boolean var3) {
      if (rrdZ.id_volatile && MT.P() == 33984) {
         if (rrdZ.SV) {
            MT.id_new(33985);
            MT.id_super(var0.id_break);
            if (!var1) {
               int var4 = var3 ? 9984 : 9728;
               MT.id_break(3553, 10241, var4);
               MT.id_break(3553, 10240, 9728);
            }
         }

         if (rrdZ.Sg) {
            MT.id_new(33987);
            MT.id_super(var0.id_byte);
            if (!var2) {
               int var5 = var3 ? 9984 : 9728;
               MT.id_break(3553, 10241, var5);
               MT.id_break(3553, 10240, 9728);
            }
         }

         MT.id_new(33984);
      }

      MT.id_super(var0.id_class);
   }

   public static void id_class(fk_3 var0) {
      rrdE var1 = var0.id_this();
      fN_2 var2 = var0.id_break();
      int var3 = var2.id_class();
      int var4 = var2.id_break();
      fN_2 var5 = id_byte(var3, var4, -8421377);
      fo_3.id_class(var1.id_break, var3, var4);
      var5.id_class(0, 0, 0, 0, 0, var3, var4, false, false, false, true);
      fN_2 var6 = id_byte(var3, var4, 0);
      fo_3.id_class(var1.id_byte, var3, var4);
      var6.id_class(0, 0, 0, 0, 0, var3, var4, false, false, false, true);
      MT.id_super(var1.id_class);
   }

   public static void id_class(int var0, int var1, boolean var2, boolean var3, boolean var4) {
      if (rrdZ.id_volatile && MT.P() == 33984) {
         if (rrdZ.SV) {
            MT.id_new(33985);
            MT.id_super(var0);
            if (!var2) {
               int var5 = var4 ? 9984 : 9728;
               MT.id_break(3553, 10241, var5);
               MT.id_break(3553, 10240, 9728);
            }
         }

         if (rrdZ.Sg) {
            MT.id_new(33987);
            MT.id_super(var1);
            if (!var3) {
               int var6 = var4 ? 9984 : 9728;
               MT.id_break(3553, 10241, var6);
               MT.id_break(3553, 10240, 9728);
            }
         }

         MT.id_new(33984);
      }
   }

   public static void id_class(ff_3 var0, int var1) {
      rrdE var2 = var0.id_implements;
      if (var2 != null) {
         var0.id_implements = null;
         id_private.remove(var2.id_class);
         MT.id_continue(var2.id_break);
         MT.id_continue(var2.id_byte);
         if (var2.id_class != var1) {
            rrdJ.id_break("Error : MultiTexID.base mismatch: " + var2.id_class + ", texid: " + var1);
            MT.id_continue(var2.id_class);
         }
      }
   }

   public static rrdE id_class(ff_3 var0) {
      rrdE var1 = var0.id_implements;
      if (var1 == null) {
         int var2 = var0.id_new();
         var1 = id_private.get(var2);
         if (var1 == null) {
            var1 = new rrdE(var2, GL11.glGenTextures(), GL11.glGenTextures());
            id_private.put(var2, var1);
         }

         var0.id_implements = var1;
      }

      return var1;
   }

   public static ff_3 id_class() {
      fk_3 var0 = new fk_3(1, 1, true);
      var0.id_break().id_class(0, 0, -1);
      var0.id_class();
      return var0;
   }

   private static fN_2[] id_class(fN_2 var0, int var1) {
      if (var1 < 0) {
         var1 = 0;
      }

      fN_2[] var2 = new fN_2[var1 + 1];
      var2[0] = var0;
      if (var1 > 0) {
         for (int var3 = 1; var3 <= var1; var3++) {
            fN_2 var4 = var2[var3 - 1];
            fN_2 var5 = new fN_2(var4.id_class() >> 1, var4.id_break() >> 1, false);
            int var6 = var5.id_class();
            int var7 = var5.id_break();

            for (int var8 = 0; var8 < var6; var8++) {
               for (int var9 = 0; var9 < var7; var9++) {
                  var5.id_class(
                     var8,
                     var9,
                     id_break(
                        var4.id_class(var8 * 2 + 0, var9 * 2 + 0),
                        var4.id_class(var8 * 2 + 1, var9 * 2 + 0),
                        var4.id_class(var8 * 2 + 0, var9 * 2 + 1),
                        var4.id_class(var8 * 2 + 1, var9 * 2 + 1)
                     )
                  );
               }
            }

            var2[var3] = var5;
         }
      }

      return var2;
   }

   public static void id_class(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 * var2;
      IntBuffer var7 = id_class(var6);
      ((Buffer)var7).clear();
      int var8 = var5 * var6;
      if (var0.length >= var8 + var6) {
         ((Buffer)var7.put(var0, var8, var6)).position(0).limit(var6);
         rrzJ_2.id_catch();
         GL11.glTexSubImage2D(3553, 0, var3, var4, var1, var2, 32993, 33639, var7);
         ((Buffer)var7).clear();
      }
   }

   public static void id_class(int var0, int var1, int var2) {
      if (rrdZ.id_volatile && MT.P() == 33984) {
         MT.id_new(33985);
         MT.id_super(var1);
         MT.id_new(33987);
         MT.id_super(var2);
         MT.id_new(33984);
      }

      MT.id_super(var0);
   }

   public static void id_class(int var0, int var1, int var2, fJ_2 var3) {
      rrdE var4 = id_class(var3);
      if (rrdZ.SV) {
         rrdJ.id_byte("Allocate texture map normal: " + var1 + "x" + var2 + ", mipmaps: " + var0);
         fo_3.id_class(var4.id_break, var0, var1, var2);
      }

      if (rrdZ.Sg) {
         rrdJ.id_byte("Allocate texture map specular: " + var1 + "x" + var2 + ", mipmaps: " + var0);
         fo_3.id_class(var4.id_byte, var0, var1, var2);
      }

      MT.id_super(var4.id_class);
   }

   public static void id_break() {
      fY_2 var0 = QY.id_instanceof().A();
      ff_3 var1 = var0.id_break(fJ_2.id_class);
      if (var1 != null) {
         rrdE var2 = var1.id_this();
         MT.id_super(var2.id_class);
         GL11.glTexParameteri(3553, 10241, rrdZ.Sa[rrdZ.Sq]);
         GL11.glTexParameteri(3553, 10240, rrdZ.Si[rrdZ.Sw]);
         MT.id_super(var2.id_break);
         GL11.glTexParameteri(3553, 10241, rrdZ.Sa[rrdZ.ST]);
         GL11.glTexParameteri(3553, 10240, rrdZ.Si[rrdZ.SI]);
         MT.id_super(var2.id_byte);
         GL11.glTexParameteri(3553, 10241, rrdZ.Sa[rrdZ.St]);
         GL11.glTexParameteri(3553, 10240, rrdZ.Si[rrdZ.Sf]);
         MT.id_super(0);
      }
   }

   public static int id_break(int var0, int var1, int var2) {
      int var3 = 255 - var2;
      return ((var0 >>> 24 & 0xFF) * var2 + (var1 >>> 24 & 0xFF) * var3) / 255 << 24
         | ((var0 >>> 16 & 0xFF) * var2 + (var1 >>> 16 & 0xFF) * var3) / 255 << 16
         | ((var0 >>> 8 & 0xFF) * var2 + (var1 >>> 8 & 0xFF) * var3) / 255 << 8
         | ((var0 >>> 0 & 0xFF) * var2 + (var1 >>> 0 & 0xFF) * var3) / 255 << 0;
   }

   public static int[] id_break(int var0, int var1) {
      int[] var2 = new int[var0 * 3];
      Arrays.fill(var2, 0, var0, var1);
      Arrays.fill(var2, var0, var0 * 2, -8421377);
      Arrays.fill(var2, var0 * 2, var0 * 3, 0);
      return var2;
   }

   public static void id_break(ff_3 var0) {
      int var1 = var0.id_new();
      boolean var2 = true;
      boolean var3 = true;
      boolean var4 = false;
      if (var0 instanceof fJ_2 var5) {
         var2 = var5.id_package();
         var3 = var5.id_int();
         var4 = var5.id_volatile();
      }

      id_class(var0.id_this(), var2, var3, var4);
      if (MT.P() == 33984) {
         int var8 = rrdZ.j;
         int var6 = rrdZ.V;
         if (var0 instanceof fJ_2) {
            rrdZ.j = ((fJ_2)var0).id_byte;
            rrdZ.V = ((fJ_2)var0).id_protected;
         } else {
            rrdZ.j = 0;
            rrdZ.V = 0;
         }

         if (rrdZ.j != var8 || rrdZ.V != var6) {
            boolean var7 = rrxn_3.id_class(false);
            rrdZ.Pj.id_class(rrdZ.j, rrdZ.V);
            rrxn_3.id_class(var7);
         }
      }
   }

   public static int id_break(int var0, int var1, int var2, int var3) {
      return ((var0 >>> 24 & 0xFF) + (var1 >>> 24 & 0xFF) + (var2 >>> 24 & 0xFF) + (var3 >>> 24 & 0xFF) + 2) / 4 << 24
         | ((var0 >>> 16 & 0xFF) + (var1 >>> 16 & 0xFF) + (var2 >>> 16 & 0xFF) + (var3 >>> 16 & 0xFF) + 2) / 4 << 16
         | ((var0 >>> 8 & 0xFF) + (var1 >>> 8 & 0xFF) + (var2 >>> 8 & 0xFF) + (var3 >>> 8 & 0xFF) + 2) / 4 << 8
         | ((var0 >>> 0 & 0xFF) + (var1 >>> 0 & 0xFF) + (var2 >>> 0 & 0xFF) + (var3 >>> 0 & 0xFF) + 2) / 4 << 0;
   }

   public static int[] id_break(int var0) {
      if (id_protected == null) {
         id_protected = new int[1048576];
      }

      if (id_protected.length < var0) {
         id_protected = new int[id_byte(var0)];
      }

      return id_protected;
   }

   public static void id_break(int[] var0, int var1, int var2, int var3) {
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
               var0[var12 + var14] = id_break(
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

   public static int[] id_throws(int var0) {
      int[] var1 = new int[var0 * 3];
      Arrays.fill(var1, 0, var0, 0);
      Arrays.fill(var1, var0, var0 * 2, -8421377);
      Arrays.fill(var1, var0 * 2, var0 * 3, 0);
      return var1;
   }

   public static void id_case(int var0) {
      rrdE var1 = id_private.get(var0);
      id_class(var1, true, true, false);
   }

   public static int id_protected(int var0) {
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
