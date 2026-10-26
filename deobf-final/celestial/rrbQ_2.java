package celestial;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrbQ_2 implements rrbF_2 {
   public String class_ = null;
   public String break_ = null;
   private int volatile_ = -1;
   private rrMn_1[] final_ = null;
   private String package_ = null;
   private int int_ = -1;
   private int new_ = 0;
   private int continue_ = 0;
   private int super_ = 0;
   private int this_ = 0;
   private int[] else_ = null;
   private float[][] synchronized_ = (float[][])null;
   private static final int return_ = -1;
   private static final int public_ = 0;
   private static final int goto_ = 1;
   private static final int while_ = 2;
   public static final String byte_ = "vanilla";
   public static final String protected_ = "grid";
   public static final String throws_ = "fixed";
   public static final String[] case_ = new String[]{"vanilla", "grid", "fixed"};
   public static final String catch_ = "format";
   public static final String private_ = "blocks";
   public static final String implements_ = "source";
   public static final String finally_ = "color";
   public static final String extends_ = "yVariance";
   public static final String native_ = "yOffset";

   private int byte_(rYG var1, rfH_2 var2) {
      int var3 = rrWr_1.break_(var1);
      int var4 = var2.c_() - this.continue_;
      if (this.new_ > 0) {
         int var5 = var2.b_() << 16 + var2.d_();
         int var6 = rrbb_3.class_(var5);
         int var7 = this.new_ * 2 + 1;
         int var8 = (var6 & 0xFF) % var7 - this.new_;
         var4 += var8;
      }

      return this.class_(var3, var4);
   }

   private int byte_(String var1) {
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
            throws_("Unknown format: " + var1);
            return -1;
         }
      }
   }

   @Override
   public boolean byte_() {
      return this.volatile_ == 2;
   }

   public rrbQ_2(Properties var1, String var2, int var3, int var4, String var5) {
      rrMz_1 var6 = new rrMz_1("Colormap");
      this.class_ = var6.class_(var2);
      this.break_ = var6.break_(var2);
      this.volatile_ = this.byte_(var1.getProperty("format", var5));
      this.final_ = var6.byte_(var1.getProperty("blocks"));
      this.package_ = class_(var1.getProperty("source"), var2, this.break_);
      this.int_ = rrMz_1.break_(var1.getProperty("color"), -1);
      this.new_ = var6.class_(var1.getProperty("yVariance"), 0);
      this.continue_ = var6.class_(var1.getProperty("yOffset"), 0);
      this.super_ = var3;
      this.this_ = var4;
   }

   @Override
   public String toString() {
      return this.break_ + "/" + this.class_ + ", blocks: " + rrbb_3.class_(this.final_) + ", source: " + this.package_;
   }

   public int class_(rRp_1 var1, double var2, double var4, double var6, int var8) {
      if (this.volatile_ == 2) {
         return this.int_;
      } else {
         int var9 = rfU_2.byte_(var2);
         int var10 = rfU_2.byte_(var4);
         int var11 = rfU_2.byte_(var6);
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         rrGi_1 var16 = new rrGi_1(0, 0, 0);

         for (int var17 = var9 - var8; var17 <= var9 + var8; var17++) {
            for (int var18 = var11 - var8; var18 <= var11 + var8; var18++) {
               var16.class_(var17, var10, var18);
               int var19 = this.class_(var1, var16);
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

   public int class_(rRp_1 var1, rfH_2 var2) {
      rYG var3 = rrbN_2.class_(var1, var2);
      return this.class_(var3, var2);
   }

   @Override
   public int class_(xc_3 var1, rRp_1 var2, rfH_2 var3) {
      return this.class_(var2, var3);
   }

   public int class_(int var1, int var2) {
      var1 = rrbb_3.class_(var1, 0, this.super_ - 1);
      var2 = rrbb_3.class_(var2, 0, this.this_ - 1);
      return this.else_[var2 * this.super_ + var1] & 16777215;
   }

   public boolean class_(String var1) {
      if (this.volatile_ != 0 && this.volatile_ != 1) {
         if (this.volatile_ != 2) {
            return false;
         }

         if (this.int_ < 0) {
            this.int_ = 16777215;
         }
      } else {
         if (this.package_ == null) {
            throws_("Source not defined: " + var1);
            return false;
         }

         this.implements_();
         if (this.else_ == null) {
            return false;
         }

         if (this.int_ < 0) {
            if (this.volatile_ == 0) {
               this.int_ = this.class_(127, 127);
            }

            if (this.volatile_ == 1) {
               this.int_ = this.byte_(rrWr_1.class_, new rfH_2(0, 64, 0));
            }
         }
      }

      return true;
   }

   private static float[][] class_(int[] var0) {
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

   public void class_(rrMn_1 var1) {
      if (this.final_ == null) {
         this.final_ = new rrMn_1[0];
      }

      this.final_ = (rrMn_1[])rrbb_3.class_(this.final_, var1);
   }

   public int class_(rYG var1, rfH_2 var2) {
      if (this.volatile_ == 0) {
         return this.break_(var1, var2);
      } else {
         return this.volatile_ == 1 ? this.byte_(var1, var2) : this.int_;
      }
   }

   private static String class_(String var0, String var1, String var2) {
      if (var0 != null) {
         var0 = var0.trim();
         String var7 = ".png";
         if (var0.endsWith(var7)) {
            var0 = var0.substring(0, var0.length() - var7.length());
         }

         return class_(var0, var2);
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

         return class_(var3, var2);
      }
   }

   public boolean class_(xc_3 var1) {
      return rrMl_1.class_(var1, this.final_);
   }

   private static String class_(String var0, String var1) {
      var0 = rrzJ_2.class_(var0, var1);
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

   public int class_(int var1) {
      var1 = rrbb_3.class_(var1, 0, this.else_.length - 1);
      return this.else_[var1] & 16777215;
   }

   public int class_() {
      if (this.volatile_ == 2) {
         return this.int_;
      } else {
         int var1 = rrbN_2.class_.nextInt(this.else_.length);
         return this.else_[var1];
      }
   }

   public void break_(int var1, int var2) {
      rrMn_1 var3 = this.break_(var1);
      if (var3 != null) {
         if (var2 >= 0) {
            var3.class_(var2);
         }
      } else {
         this.class_(new rrMn_1(var1, var2));
      }
   }

   private rrMn_1 break_(int var1) {
      if (this.final_ == null) {
         return null;
      } else {
         for (int var2 = 0; var2 < this.final_.length; var2++) {
            rrMn_1 var3 = this.final_[var2];
            if (var3.class_() == var1) {
               return var3;
            }
         }

         return null;
      }
   }

   public boolean break_(String var1) {
      if (this.final_ == null) {
         this.final_ = this.private_();
         if (this.final_ == null) {
            throws_("Match blocks not defined: " + var1);
            return false;
         }
      }

      return true;
   }

   public float[][] break_() {
      if (this.synchronized_ == null) {
         this.synchronized_ = class_(this.else_);
      }

      return this.synchronized_;
   }

   private int break_(rYG var1, rfH_2 var2) {
      double var3 = (double)rfU_2.class_(var1.class_(var2), 0.0F, 1.0F);
      double var5 = (double)rfU_2.class_(var1.implements_(), 0.0F, 1.0F);
      var5 *= var3;
      int var7 = (int)((1.0 - var3) * (double)(this.super_ - 1));
      int var8 = (int)((1.0 - var5) * (double)(this.this_ - 1));
      return this.class_(var7, var8);
   }

   private static void throws_(String var0) {
      rrbb_3.protected_("CustomColors: " + var0);
   }

   public int throws_() {
      return this.super_;
   }

   public int[] catch_() {
      if (this.final_ == null) {
         return null;
      } else {
         HashSet var1 = new HashSet();

         for (int var2 = 0; var2 < this.final_.length; var2++) {
            rrMn_1 var3 = this.final_[var2];
            if (var3.class_() >= 0) {
               var1.add(var3.class_());
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

   public int case_() {
      return this.this_;
   }

   private void implements_() {
      try {
         this.else_ = null;
         if (this.package_ == null) {
            return;
         }

         String var1 = this.package_ + ".png";
         rqO_2 var2 = new rqO_2(var1);
         InputStream var3 = rrbb_3.class_(var2);
         if (var3 == null) {
            return;
         }

         BufferedImage var4 = rrzJ_2.class_(var3);
         if (var4 == null) {
            return;
         }

         int var5 = var4.getWidth();
         int var6 = var4.getHeight();
         boolean var7 = this.super_ < 0 || this.super_ == var5;
         boolean var8 = this.this_ < 0 || this.this_ == var6;
         if (!var7 || !var8) {
            protected_("Non-standard palette size: " + var5 + "x" + var6 + ", should be: " + this.super_ + "x" + this.this_ + ", path: " + var1);
         }

         this.super_ = var5;
         this.this_ = var6;
         if (this.super_ <= 0 || this.this_ <= 0) {
            throws_("Invalid palette size: " + var5 + "x" + var6 + ", path: " + var1);
            return;
         }

         this.else_ = new int[var5 * var6];
         var4.getRGB(0, 0, var5, var6, this.else_, 0, var5);
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   public int protected_() {
      return this.volatile_ == 2 ? 1 : this.else_.length;
   }

   private static void protected_(String var0) {
      rrbb_3.byte_("CustomColors: " + var0);
   }

   private rrMn_1[] private_() {
      rqO_2 var1 = new rqO_2(this.class_);
      if (rVL.strictfp_.byte_(var1)) {
         xd_3 var6 = rVL.strictfp_.class_(var1);
         return new rrMn_1[]{new rrMn_1(rrWP.class_(var6))};
      } else {
         Pattern var2 = Pattern.compile("^block([0-9]+).*$");
         Matcher var3 = var2.matcher(this.class_);
         if (var3.matches()) {
            String var4 = var3.group(1);
            int var5 = rrbb_3.class_(var4, -1);
            if (var5 >= 0) {
               return new rrMn_1[]{new rrMn_1(var5)};
            }
         }

         rrMz_1 var7 = new rrMz_1("Colormap");
         rrMn_1[] var8 = var7.protected_(this.class_);
         return var8 != null ? var8 : null;
      }
   }
}
