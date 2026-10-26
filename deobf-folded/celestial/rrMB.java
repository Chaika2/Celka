package celestial;

import java.awt.Dimension;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;

public class rrMB {
   private final String id_class;
   private final int id_break;
   private final int id_byte;
   private final int[] id_protected;
   private final boolean id_throws;
   private int[][] id_case;
   private IntBuffer[] id_catch;
   private Dimension[] id_private;

   public rrMB(String var1, int var2, int var3, int[] var4, boolean var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_private = id_class(var2, var3, var1);
      this.id_case = id_class(var4, var2, var3, this.id_private);
      if (var5) {
         this.id_catch = id_class(this.id_private, this.id_case);
      }
   }

   public static int id_class(int var0, int var1, int var2, int var3) {
      int var4 = id_class(var0, var1);
      int var5 = id_class(var2, var3);
      return id_class(var4, var5);
   }

   private static int id_class(int var0, int var1) {
      int var2 = (var0 & 0xFF000000) >> 24 & 0xFF;
      int var3 = (var1 & 0xFF000000) >> 24 & 0xFF;
      int var4 = (var2 + var3) / 2;
      if (var2 == 0 && var3 == 0) {
         var2 = 1;
         var3 = 1;
      } else {
         if (var2 == 0) {
            var0 = var1;
            var4 /= 2;
         }

         if (var3 == 0) {
            var1 = var0;
            var4 /= 2;
         }
      }

      int var5 = (var0 >> 16 & 0xFF) * var2;
      int var6 = (var0 >> 8 & 0xFF) * var2;
      int var7 = (var0 & 0xFF) * var2;
      int var8 = (var1 >> 16 & 0xFF) * var3;
      int var9 = (var1 >> 8 & 0xFF) * var3;
      int var10 = (var1 & 0xFF) * var3;
      int var11 = (var5 + var8) / (var2 + var3);
      int var12 = (var6 + var9) / (var2 + var3);
      int var13 = (var7 + var10) / (var2 + var3);
      return var4 << 24 | var11 << 16 | var12 << 8 | var13;
   }

   public static IntBuffer[] id_class(Dimension[] var0, int[][] var1) {
      if (var0 == null) {
         return null;
      } else {
         IntBuffer[] var2 = new IntBuffer[var0.length];

         for (int var3 = 0; var3 < var0.length; var3++) {
            Dimension var4 = var0[var3];
            int var5 = var4.width * var4.height;
            IntBuffer var6 = rrbb_3.id_break(var5);
            int[] var7 = var1[var3];
            ((Buffer)var6).clear();
            var6.put(var7);
            ((Buffer)var6).clear();
            var2[var3] = var6;
         }

         return var2;
      }
   }

   public static Dimension[] id_class(int var0, int var1, String var2) {
      int var3 = rrzJ_2.id_class(var0);
      int var4 = rrzJ_2.id_class(var1);
      if (var3 == var0 && var4 == var1) {
         ArrayList var5 = new ArrayList();
         int var6 = var3;
         int var7 = var4;

         while (true) {
            var6 /= 2;
            var7 /= 2;
            if (var6 <= 0 && var7 <= 0) {
               return var5.toArray(new Dimension[var5.size()]);
            }

            if (var6 <= 0) {
               var6 = 1;
            }

            if (var7 <= 0) {
               var7 = 1;
            }

            int var8 = var6 * var7 * 4;
            Dimension var9 = new Dimension(var6, var7);
            var5.add(var9);
         }
      } else {
         rrbb_3.id_protected("Mipmaps not possible (power of 2 dimensions needed), texture: " + var2 + ", dim: " + var0 + "x" + var1);
         return new Dimension[0];
      }
   }

   public static int[][] id_class(int[] var0, int var1, int var2, Dimension[] var3) {
      int[] var4 = var0;
      int var5 = var1;
      boolean var6 = true;
      int[][] var7 = new int[var3.length][];

      for (int var8 = 0; var8 < var3.length; var8++) {
         Dimension var9 = var3[var8];
         int var10 = var9.width;
         int var11 = var9.height;
         int[] var12 = new int[var10 * var11];
         var7[var8] = var12;
         int var13 = var8 + 1;
         if (var6) {
            for (int var14 = 0; var14 < var10; var14++) {
               for (int var15 = 0; var15 < var11; var15++) {
                  int var16 = var4[var14 * 2 + 0 + (var15 * 2 + 0) * var5];
                  int var17 = var4[var14 * 2 + 1 + (var15 * 2 + 0) * var5];
                  int var18 = var4[var14 * 2 + 1 + (var15 * 2 + 1) * var5];
                  int var19 = var4[var14 * 2 + 0 + (var15 * 2 + 1) * var5];
                  int var20 = id_class(var16, var17, var18, var19);
                  var12[var14 + var15 * var10] = var20;
               }
            }
         }

         var4 = var12;
         var5 = var10;
         if (var10 <= 1 || var11 <= 1) {
            var6 = false;
         }
      }

      return var7;
   }

   private int id_break(int var1, int var2) {
      int var3 = (var1 & 0xFF000000) >> 24 & 0xFF;
      int var4 = (var2 & 0xFF000000) >> 24 & 0xFF;
      return (var3 + var4 >> 1 << 24) + ((var3 & 16711422) + (var4 & 16711422) >> 1);
   }

   public static void id_break(int var0, int var1, String var2) {
      Dimension[] var3 = id_class(var0, var1, var2);

      for (int var4 = 0; var4 < var3.length; var4++) {
         Dimension var5 = var3[var4];
         int var6 = var5.width;
         int var7 = var5.height;
         int var8 = var4 + 1;
         GL11.glTexImage2D(3553, var8, 6408, var6, var7, 0, 32993, 33639, (IntBuffer)null);
      }
   }
}
