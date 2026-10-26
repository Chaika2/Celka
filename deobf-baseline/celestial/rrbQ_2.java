package celestial;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrbQ_2 implements rrbF_2 {
   public String id_class = null;
   public String id_break = null;
   private int id_volatile = -1;
   private rrMn_1[] id_final = null;
   private String id_package = null;
   private int id_int = -1;
   private int id_new = 0;
   private int id_continue = 0;
   private int id_super = 0;
   private int id_this = 0;
   private int[] id_else = null;
   private float[][] id_synchronized = (float[][])null;
   private static final int id_return = -1;
   private static final int id_public = 0;
   private static final int id_goto = 1;
   private static final int id_while = 2;
   public static final String id_byte = "vanilla";
   public static final String id_protected = "grid";
   public static final String id_throws = "fixed";
   public static final String[] id_case = new String[]{"vanilla", "grid", "fixed"};
   public static final String id_catch = "format";
   public static final String id_private = "blocks";
   public static final String id_implements = "source";
   public static final String id_finally = "color";
   public static final String id_extends = "yVariance";
   public static final String id_native = "yOffset";

   private int id_byte(rYG var1, rfH_2 var2) {
      int var3 = rrWr_1.id_break(var1);
      int var4 = var2.c_() - this.id_continue;
      if (this.id_new > 0) {
         int var5 = var2.b_() << 16 + var2.d_();
         int var6 = rrbb_3.id_class(var5);
         int var7 = this.id_new * 2 + 1;
         int var8 = (var6 & 0xFF) % var7 - this.id_new;
         var4 += var8;
      }

      return this.id_class(var3, var4);
   }

   private int id_byte(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         var1 = var1.trim();
         if (var1.equals("vanilla")) {
            return 0;
         } else if (var1.equals("grid")) {
            return 1;
         } else if (var1.equals("fixed")) {
            return 2;
         } else {
            id_throws("Unknown format: " + var1);
            return -1;
         }
      }
   }

   @Override
   public boolean id_byte() {
      return this.id_volatile == 2;
   }

   public rrbQ_2(Properties var1, String var2, int var3, int var4, String var5) {
      rrMz_1 var6 = new rrMz_1("Colormap");
      this.id_class = var6.id_class(var2);
      this.id_break = var6.id_break(var2);
      this.id_volatile = this.id_byte(var1.getProperty("format", var5));
      this.id_final = var6.id_byte(var1.getProperty("blocks"));
      this.id_package = id_class(var1.getProperty("source"), var2, this.id_break);
      this.id_int = rrMz_1.id_break(var1.getProperty("color"), -1);
      this.id_new = var6.id_class(var1.getProperty("yVariance"), 0);
      this.id_continue = var6.id_class(var1.getProperty("yOffset"), 0);
      this.id_super = var3;
      this.id_this = var4;
   }

   @Override
   public String toString() {
      return this.id_break + "/" + this.id_class + ", blocks: " + rrbb_3.id_class(this.id_final) + ", source: " + this.id_package;
   }

   public int id_class(rRp_1 var1, double var2, double var4, double var6, int var8) {
      if (this.id_volatile == 2) {
         return this.id_int;
      } else {
         int var9 = rfU_2.id_byte(var2);
         int var10 = rfU_2.id_byte(var4);
         int var11 = rfU_2.id_byte(var6);
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         rrGi_1 var16 = new rrGi_1(0, 0, 0);

         for (int var17 = var9 - var8; var17 <= var9 + var8; var17++) {
            for (int var18 = var11 - var8; var18 <= var11 + var8; var18++) {
               var16.id_class(var17, var10, var18);
               int var19 = this.id_class(var1, var16);
               var12 += var19 >> 16 & 0xFF;
               var13 += var19 >> 8 & 0xFF;
               var14 += var19 & 0xFF;
               var15++;
            }
         }

         int var20 = var12 / var15;
         int var21 = var13 / var15;
         int var22 = var14 / var15;
         return var20 << 16 | var21 << 8 | var22;
      }
   }

   public int id_class(rRp_1 var1, rfH_2 var2) {
      rYG var3 = rrbN_2.id_class(var1, var2);
      return this.id_class(var3, var2);
   }

   @Override
   public int id_class(xc_3 var1, rRp_1 var2, rfH_2 var3) {
      return this.id_class(var2, var3);
   }

   public int id_class(int var1, int var2) {
      var1 = rrbb_3.id_class(var1, 0, this.id_super - 1);
      var2 = rrbb_3.id_class(var2, 0, this.id_this - 1);
      return this.id_else[var2 * this.id_super + var1] & 16777215;
   }

   public boolean id_class(String var1) {
      if (this.id_volatile != 0 && this.id_volatile != 1) {
         if (this.id_volatile != 2) {
            return false;
         }

         if (this.id_int < 0) {
            this.id_int = 16777215;
         }
      } else {
         if (this.id_package == null) {
            id_throws("Source not defined: " + var1);
            return false;
         }

         this.id_implements();
         if (this.id_else == null) {
            return false;
         }

         if (this.id_int < 0) {
            if (this.id_volatile == 0) {
               this.id_int = this.id_class(127, 127);
            }

            if (this.id_volatile == 1) {
               this.id_int = this.id_byte(rrWr_1.id_class, new rfH_2(0, 64, 0));
            }
         }
      }

      return true;
   }

   private static float[][] id_class(int[] var0) {
      float[][] var1 = new float[var0.length][3];

      for (int var2 = 0; var2 < var0.length; var2++) {
         int var3 = var0[var2];
         float var4 = (float)(var3 >> 16 & 0xFF) / 255.0F;
         float var5 = (float)(var3 >> 8 & 0xFF) / 255.0F;
         float var6 = (float)(var3 & 0xFF) / 255.0F;
         float[] var7 = var1[var2];
         var7[0] = var4;
         var7[1] = var5;
         var7[2] = var6;
      }

      return var1;
   }

   public void id_class(rrMn_1 var1) {
      if (this.id_final == null) {
         this.id_final = new rrMn_1[0];
      }

      this.id_final = (rrMn_1[])rrbb_3.id_class(this.id_final, var1);
   }

   public int id_class(rYG var1, rfH_2 var2) {
      if (this.id_volatile == 0) {
         return this.id_break(var1, var2);
      } else {
         return this.id_volatile == 1 ? this.id_byte(var1, var2) : this.id_int;
      }
   }

   private static String id_class(String var0, String var1, String var2) {
      if (var0 != null) {
         var0 = var0.trim();
         String var7 = ".png";
         if (var0.endsWith(var7)) {
            var0 = var0.substring(0, var0.length() - var7.length());
         }

         return id_class(var0, var2);
      } else {
         String var3 = var1;
         int var4 = var1.lastIndexOf(47);
         if (var4 >= 0) {
            var3 = var1.substring(var4 + 1);
         }

         int var5 = var3.lastIndexOf(46);
         if (var5 >= 0) {
            var3 = var3.substring(0, var5);
         }

         return id_class(var3, var2);
      }
   }

   public boolean id_class(xc_3 var1) {
      return rrMl_1.id_class(var1, this.id_final);
   }

   private static String id_class(String var0, String var1) {
      var0 = rrzJ_2.id_class(var0, var1);
      if (!var0.startsWith(var1) && !var0.startsWith("textures/") && !var0.startsWith("optifine/")) {
         var0 = var1 + "/" + var0;
      }

      if (var0.endsWith(".png")) {
         var0 = var0.substring(0, var0.length() - 4);
      }

      String var2 = "textures/block/";
      if (var0.startsWith(var2)) {
         var0 = var0.substring(var2.length());
      }

      if (var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   public int id_class(int var1) {
      var1 = rrbb_3.id_class(var1, 0, this.id_else.length - 1);
      return this.id_else[var1] & 16777215;
   }

   public int id_class() {
      if (this.id_volatile == 2) {
         return this.id_int;
      } else {
         int var1 = rrbN_2.id_class.nextInt(this.id_else.length);
         return this.id_else[var1];
      }
   }

   public void id_break(int var1, int var2) {
      rrMn_1 var3 = this.id_break(var1);
      if (var3 != null) {
         if (var2 >= 0) {
            var3.id_class(var2);
         }
      } else {
         this.id_class(new rrMn_1(var1, var2));
      }
   }

   private rrMn_1 id_break(int var1) {
      if (this.id_final == null) {
         return null;
      } else {
         for (int var2 = 0; var2 < this.id_final.length; var2++) {
            rrMn_1 var3 = this.id_final[var2];
            if (var3.id_class() == var1) {
               return var3;
            }
         }

         return null;
      }
   }

   public boolean id_break(String var1) {
      if (this.id_final == null) {
         this.id_final = this.id_private();
         if (this.id_final == null) {
            id_throws("Match blocks not defined: " + var1);
            return false;
         }
      }

      return true;
   }

   public float[][] id_break() {
      if (this.id_synchronized == null) {
         this.id_synchronized = id_class(this.id_else);
      }

      return this.id_synchronized;
   }

   private int id_break(rYG var1, rfH_2 var2) {
      double var3 = (double)rfU_2.id_class(var1.id_class(var2), 0.0F, 1.0F);
      double var5 = (double)rfU_2.id_class(var1.id_implements(), 0.0F, 1.0F);
      var5 *= var3;
      int var7 = (int)((1.0 - var3) * (double)(this.id_super - 1));
      int var8 = (int)((1.0 - var5) * (double)(this.id_this - 1));
      return this.id_class(var7, var8);
   }

   private static void id_throws(String var0) {
      rrbb_3.id_protected("CustomColors: " + var0);
   }

   public int id_throws() {
      return this.id_super;
   }

   public int[] id_catch() {
      if (this.id_final == null) {
         return null;
      } else {
         HashSet var1 = new HashSet();

         for (int var2 = 0; var2 < this.id_final.length; var2++) {
            rrMn_1 var3 = this.id_final[var2];
            if (var3.id_class() >= 0) {
               var1.add(var3.id_class());
            }
         }

         Integer[] var5 = var1.toArray(new Integer[var1.size()]);
         int[] var6 = new int[var5.length];

         for (int var4 = 0; var4 < var5.length; var4++) {
            var6[var4] = var5[var4];
         }

         return var6;
      }
   }

   public int id_case() {
      return this.id_this;
   }

   private void id_implements() {
      try {
         this.id_else = null;
         if (this.id_package == null) {
            return;
         }

         String var1 = this.id_package + ".png";
         rqO_2 var2 = new rqO_2(var1);
         InputStream var3 = rrbb_3.id_class(var2);
         if (var3 == null) {
            return;
         }

         BufferedImage var4 = rrzJ_2.id_class(var3);
         if (var4 == null) {
            return;
         }

         int var5 = var4.getWidth();
         int var6 = var4.getHeight();
         boolean var7 = this.id_super < 0 || this.id_super == var5;
         boolean var8 = this.id_this < 0 || this.id_this == var6;
         if (!var7 || !var8) {
            id_protected("Non-standard palette size: " + var5 + "x" + var6 + ", should be: " + this.id_super + "x" + this.id_this + ", path: " + var1);
         }

         this.id_super = var5;
         this.id_this = var6;
         if (this.id_super <= 0 || this.id_this <= 0) {
            id_throws("Invalid palette size: " + var5 + "x" + var6 + ", path: " + var1);
            return;
         }

         this.id_else = new int[var5 * var6];
         var4.getRGB(0, 0, var5, var6, this.id_else, 0, var5);
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   public int id_protected() {
      return this.id_volatile == 2 ? 1 : this.id_else.length;
   }

   private static void id_protected(String var0) {
      rrbb_3.id_byte("CustomColors: " + var0);
   }

   private rrMn_1[] id_private() {
      rqO_2 var1 = new rqO_2(this.id_class);
      if (rVL.id_strictfp.id_byte(var1)) {
         xd_3 var6 = rVL.id_strictfp.id_class(var1);
         return new rrMn_1[]{new rrMn_1(rrWP.id_class(var6))};
      } else {
         Pattern var2 = Pattern.compile("^block([0-9]+).*$");
         Matcher var3 = var2.matcher(this.id_class);
         if (var3.matches()) {
            String var4 = var3.group(1);
            int var5 = rrbb_3.id_class(var4, -1);
            if (var5 >= 0) {
               return new rrMn_1[]{new rrMn_1(var5)};
            }
         }

         rrMz_1 var7 = new rrMz_1("Colormap");
         rrMn_1[] var8 = var7.id_protected(this.id_class);
         return var8 != null ? var8 : null;
      }
   }
}
