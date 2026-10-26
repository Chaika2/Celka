package celestial;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrzJ_2 {
   private static final String try_ = "grass_block_top";
   private static final String instanceof_ = "grass_block_side";
   private static final String throw_ = "grass_block_side_overlay";
   private static final String interface_ = "snow";
   private static final String char_ = "grass_block_snow";
   private static final String abstract_ = "mycelium_side";
   private static final String long_ = "mycelium_top";
   private static final String float_ = "water_still";
   private static final String void_ = "water_flow";
   private static final String static_ = "lava_still";
   private static final String import_ = "lava_flow";
   private static final String short_ = "fire_0";
   private static final String default_ = "fire_1";
   private static final String const_ = "soul_fire_0";
   private static final String strictfp_ = "soul_fire_1";
   private static final String boolean_ = "campfire_fire";
   private static final String transient_ = "campfire_log_lit";
   private static final String for_ = "soul_campfire_fire";
   private static final String double_ = "soul_campfire_log_lit";
   private static final String switch_ = "nether_portal";
   private static final String r = "glass";
   private static final String P = "glass_pane_top";
   public static fj_3 class_;
   public static fj_3 break_;
   public static fj_3 byte_;
   public static fj_3 protected_;
   public static fj_3 throws_;
   public static fj_3 case_;
   public static fj_3 catch_;
   public static fj_3 private_;
   public static fj_3 implements_;
   public static fj_3 finally_;
   public static fj_3 extends_;
   public static fj_3 native_;
   public static fj_3 volatile_;
   public static fj_3 final_;
   public static fj_3 package_;
   public static fj_3 int_;
   public static fj_3 new_;
   public static fj_3 continue_;
   public static fj_3 super_;
   public static fj_3 this_;
   public static fj_3 else_;
   public static fj_3 synchronized_;
   public static final String return_ = "minecraft:block/";
   public static final String public_ = "minecraft:item/";
   public static final rqO_2 goto_ = new rqO_2("optifine/ctm/default/empty");
   public static final rqO_2 while_ = new rqO_2("optifine/ctm/default/empty.png");
   private static IntBuffer B = rrbb_3.break_(256);
   private static int S = -1;
   private static Map<Integer, String> s = new HashMap<>();

   public static int byte_(int var0) {
      byte var1 = 1;

      for (int var2 = 0; var2 < var0; var2++) {
         var1 *= 2;
      }

      return var1;
   }

   public static void byte_() {
      if (rrbb_3.x() instanceof rAv_1 var1) {
         rrzx_3 var2 = new rrzx_3();
         var1.class_(var2);
         rrzd_3 var3 = new rrzd_3();
         var1.class_(var3);
      }
   }

   public static fN_2 class_(fN_2 var0, int var1) {
      BufferedImage var2 = class_(var0);
      BufferedImage var3 = class_(var2, var1);
      return class_(var3);
   }

   public static BufferedImage class_(fN_2 var0) {
      int var1 = var0.class_();
      int var2 = var0.break_();
      int[] var3 = new int[var1 * var2];
      var0.private_().get(var3);
      BufferedImage var4 = new BufferedImage(var1, var2, 2);
      var4.setRGB(0, 0, var1, var2, var3, 0, var1);
      return var4;
   }

   private static fN_2 class_(BufferedImage var0) {
      int var1 = var0.getWidth();
      int var2 = var0.getHeight();
      int[] var3 = new int[var1 * var2];
      var0.getRGB(0, 0, var1, var2, var3, 0, var1);
      fN_2 var4 = new fN_2(var1, var2, false);
      var4.private_().put(var3);
      return var4;
   }

   public static BufferedImage class_(BufferedImage var0, int var1) {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int var4 = var3 * var1 / var2;
      BufferedImage var5 = new BufferedImage(var1, var4, 2);
      Graphics2D var6 = var5.createGraphics();
      Object var7 = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
      if (var1 < var2 || var1 % var2 != 0) {
         var7 = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
      }

      var6.setRenderingHint(RenderingHints.KEY_INTERPOLATION, var7);
      var6.drawImage(var0, 0, 0, var1, var4, (ImageObserver)null);
      return var5;
   }

   public static void class_() {
      fJ_2 var0 = break_();
      if (var0 != null) {
         String var1 = "minecraft:block/";
         class_ = class_(var0, var1 + "grass_block_top");
         break_ = class_(var0, var1 + "grass_block_side");
         byte_ = class_(var0, var1 + "grass_block_side_overlay");
         protected_ = class_(var0, var1 + "snow");
         throws_ = class_(var0, var1 + "grass_block_snow");
         case_ = class_(var0, var1 + "mycelium_side");
         catch_ = class_(var0, var1 + "mycelium_top");
         private_ = class_(var0, var1 + "water_still");
         implements_ = class_(var0, var1 + "water_flow");
         finally_ = class_(var0, var1 + "lava_still");
         extends_ = class_(var0, var1 + "lava_flow");
         native_ = class_(var0, var1 + "fire_0");
         volatile_ = class_(var0, var1 + "fire_1");
         final_ = class_(var0, var1 + "soul_fire_0");
         package_ = class_(var0, var1 + "soul_fire_1");
         int_ = class_(var0, var1 + "campfire_fire");
         new_ = class_(var0, var1 + "campfire_log_lit");
         continue_ = class_(var0, var1 + "soul_campfire_fire");
         super_ = class_(var0, var1 + "soul_campfire_log_lit");
         this_ = class_(var0, var1 + "nether_portal");
         else_ = class_(var0, var1 + "glass");
         synchronized_ = class_(var0, var1 + "glass_pane_top");
         String var2 = "minecraft:item/";
      }
   }

   public static String class_(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0 ? "" : var0.substring(0, var1);
   }

   public static String class_(String var0, String var1) {
      String var2 = "assets/minecraft/";
      if (var0.startsWith(var2)) {
         return var0.substring(var2.length());
      } else if (var0.startsWith("./")) {
         var0 = var0.substring(2);
         if (!var1.endsWith("/")) {
            var1 = var1 + "/";
         }

         return var1 + var0;
      } else {
         if (var0.startsWith("/~")) {
            var0 = var0.substring(1);
         }

         String var3 = "optifine/";
         if (var0.startsWith("~/")) {
            var0 = var0.substring(2);
            return var3 + var0;
         } else {
            return var0.startsWith("/") ? var3 + var0.substring(1) : var0;
         }
      }
   }

   public static String class_(Throwable var0) {
      CharArrayWriter var1 = new CharArrayWriter();
      var0.printStackTrace(new PrintWriter(var1));
      return var1.toString();
   }

   public static BufferedImage class_(InputStream var0) throws IOException {
      if (var0 == null) {
         return null;
      } else {
         BufferedImage var1;
         try {
            BufferedImage var2 = ImageIO.read(var0);
            var1 = var2;
         } finally {
            IOUtils.closeQuietly(var0);
         }

         return var1;
      }
   }

   public static void class_(String var0, int var1, int var2, int var3, int var4) {
      protected_(var1);
      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3317, 1);
      var0 = rrzX_2.throws_(var0, ".png");
      File var5 = new File(var0);
      File var6 = var5.getParentFile();
      if (var6 != null) {
         var6.mkdirs();
      }

      for (int var7 = 0; var7 < 16; var7++) {
         String var8 = var0 + "_" + var7 + ".png";
         File var9 = new File(var8);
         var9.delete();
      }

      for (int var18 = 0; var18 <= var2; var18++) {
         File var19 = new File(var0 + "_" + var18 + ".png");
         int var20 = var3 >> var18;
         int var10 = var4 >> var18;
         int var11 = var20 * var10;
         IntBuffer var12 = BufferUtils.createIntBuffer(var11);
         int[] var13 = new int[var11];
         GL11.glGetTexImage(3553, var18, 32993, 33639, var12);
         var12.get(var13);
         BufferedImage var14 = new BufferedImage(var20, var10, 2);
         var14.setRGB(0, 0, var20, var10, var13, 0, var20);

         try {
            ImageIO.write(var14, "png", var19);
            rrbb_3.byte_("Exported: " + var19);
         } catch (Exception var16) {
            rrbb_3.protected_("Error writing: " + var19);
            rrbb_3.protected_(var16.getClass().getName() + ": " + var16.getMessage());
         }
      }
   }

   public static void class_(fj_3 var0) {
      fN_2[] var1 = var0.synchronized_();

      for (int var2 = 0; var2 < var1.length; var2++) {
         fN_2 var3 = var1[var2];
         if (var3 == null) {
            rrbb_3.byte_(var2 + ": " + var3);
         } else {
            rrbb_3.byte_(var2 + ": " + var3.class_() * var3.break_());
         }
      }
   }

   public static Dimension class_(InputStream var0, String var1) {
      Iterator var2 = ImageIO.getImageReadersBySuffix(var1);

      while (var2.hasNext()) {
         ImageReader var3 = (ImageReader)var2.next();

         Dimension var4;
         try {
            ImageInputStream var5 = ImageIO.createImageInputStream(var0);
            var3.setInput(var5);
            int var6 = var3.getWidth(var3.getMinIndex());
            int var7 = var3.getHeight(var3.getMinIndex());
            var4 = new Dimension(var6, var7);
         } catch (IOException var11) {
            continue;
         } finally {
            var3.dispose();
         }

         return var4;
      }

      return null;
   }

   public static int class_(int var0, int var1) {
      if (var0 == var1) {
         return var0;
      } else {
         int var2 = var0 / var1 * var1;

         while (var2 < var0) {
            var2 += var1;
         }

         return var2;
      }
   }

   public static void class_(IC var0) {
      rrby_3.class_();
      rrby_3.class_(var0);
   }

   public static fj_3 class_(fJ_2 var0, String var1) {
      fj_3 var2 = var0.break_(var1);
      if (var2 == null || var2 instanceof fQ_2) {
         rrbb_3.protected_("Sprite not found: " + var1);
      }

      return var2;
   }

   public static void class_(rAL var0) {
      if (break_() != null) {
         rrbb_3.byte_("*** Reloading custom textures ***");
         rrbf_3.class_();
         rrMd_1.class_();
         class_();
         rrMs_1.class_();
         rrGU.class_();
         rrGe_1.class_();
         rrMd_1.break_();
         rrbN_2.class_();
         rrbf_3.break_();
         rrME.break_();
         rrby_3.break_();
         rrMo_1.class_();
         rrdZ.q();
         rrba_3.class_();
         rrbb_3.long_();
         rrMX.class_();
         rrbw_3.break_();
         rrbl_3.class_();
         Tg_1.class_();
         rrbt_3.break_();
         rrbW_2.class_();
         rrbb_3.J().break_();
         rrbb_3.byte_("Disable Forge light pipeline");
      }
   }

   public static ff_3 class_(rqO_2 var0) {
      ff_3 var1 = rrbb_3.J().break_(var0);
      if (var1 != null) {
         return var1;
      } else if (!rrbb_3.byte_(var0)) {
         return null;
      } else {
         fH_2 var2 = new fH_2(var0);
         rrbb_3.J().class_(var0, var2);
         return var2;
      }
   }

   public static BufferedImage class_(String var0, BufferedImage var1) {
      if (var0.startsWith("/mob/zombie") || var0.startsWith("/mob/pigzombie")) {
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         if (var2 == var3 * 2) {
            BufferedImage var4 = new BufferedImage(var2, var3 * 2, 2);
            Graphics2D var5 = var4.createGraphics();
            var5.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            var5.drawImage(var1, 0, 0, var2, var3, (ImageObserver)null);
            return var4;
         }
      }

      return var1;
   }

   public static int class_(int var0) {
      byte var1 = 1;

      while (var1 < var0) {
         var1 *= 2;
      }

      return var1;
   }

   public static rqO_2 class_(rqO_2 var0, String var1) {
      if (!var0.byte_().equals("minecraft")) {
         return var0;
      } else {
         String var2 = var0.break_();
         String var3 = class_(var2, var1);
         if (var3 != var2) {
            var0 = new rqO_2(var0.byte_(), var3);
         }

         return var0;
      }
   }

   public static void class_(fJ_2 var0) {
      if (var0.protected_().equals(fJ_2.class_)) {
         rrbO_2.class_(var0);
         rrby_3.class_(var0);
         rrGU.class_(var0);
      }
   }

   public static void break_(fJ_2 var0) {
      if (var0.protected_().equals(fJ_2.class_)) {
         rrbO_2.break_(var0);
         rrby_3.break_(var0);
         rrGU.break_(var0);
      }

      rrbY_2.class_(var0);
   }

   public static int break_(int var0) {
      byte var1 = 1;

      int var2;
      for (var2 = 0; var1 < var0; var2++) {
         var1 *= 2;
      }

      return var2;
   }

   public static int break_(int var0, int var1) {
      if (var0 >= var1) {
         return var0;
      } else {
         int var2 = var1 / var0 * var0;

         while (var2 < var1) {
            var2 += var0;
         }

         return var2;
      }
   }

   public static fJ_2 break_() {
      return rrbb_3.rF();
   }

   public static void throws_() {
      if (org.lwjgl.opengl.GL.getCapabilities().GL_EXT_texture_filter_anisotropic) {
         float var0 = GL11.glGetFloat(34047);
         float var1 = (float)rrbb_3.y();
         var1 = Math.min(var1, var0);
         GL11.glTexParameterf(3553, 34046, var1);
      }
   }

   public static boolean throws_(int var0) {
      int var1 = rfU_2.byte_(var0);
      return var1 == var0;
   }

   public static void catch_() {
      MT.final_(3314, 0);
      MT.final_(3316, 0);
      MT.final_(3315, 0);
      MT.final_(3317, 4);
   }

   public static void catch_(int var0) {
      s.put(var0, class_(new Throwable("StackTrace")));
      rrbb_3.byte_("Textures: " + s.size());
   }

   public static int case_(int var0) {
      int var1 = var0 >> 24 & 0xFF;
      int var2 = var0 >> 16 & 0xFF;
      int var3 = var0 >> 8 & 0xFF;
      int var4 = var0 >> 0 & 0xFF;
      return var1 << 24 | var4 << 16 | var3 << 8 | var2;
   }

   public static int case_() {
      if (S < 0) {
         S = private_();
      }

      return S;
   }

   public static void protected_(int var0) {
      MT.super_(var0);
   }

   public static void protected_() {
      rrzk_3 var0 = new rrzk_3();
      rqO_2 var1 = new rqO_2("optifine/tickable_textures");
      rrbb_3.J().class_(var1, var0);
   }

   private static int private_() {
      for (int var0 = 65536; var0 > 0; var0 >>= 1) {
         MT.class_(32868, 0, 6408, var0, var0, 0, 6408, 5121, (IntBuffer)null);
         int var1 = GL11.glGetError();
         int var2 = MT.byte_(32868, 0, 4096);
         if (var2 != 0) {
            return var0;
         }
      }

      return 0;
   }

   public static void private_(int var0) {
      s.remove(var0);
      rrbb_3.byte_("Textures: " + s.size());
   }
}
