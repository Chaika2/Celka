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
   private static final String id_try = "grass_block_top";
   private static final String id_instanceof = "grass_block_side";
   private static final String id_throw = "grass_block_side_overlay";
   private static final String id_interface = "snow";
   private static final String id_char = "grass_block_snow";
   private static final String id_abstract = "mycelium_side";
   private static final String id_long = "mycelium_top";
   private static final String id_float = "water_still";
   private static final String id_void = "water_flow";
   private static final String id_static = "lava_still";
   private static final String id_import = "lava_flow";
   private static final String id_short = "fire_0";
   private static final String id_default = "fire_1";
   private static final String id_const = "soul_fire_0";
   private static final String id_strictfp = "soul_fire_1";
   private static final String id_boolean = "campfire_fire";
   private static final String id_transient = "campfire_log_lit";
   private static final String id_for = "soul_campfire_fire";
   private static final String id_double = "soul_campfire_log_lit";
   private static final String id_switch = "nether_portal";
   private static final String r = "glass";
   private static final String P = "glass_pane_top";
   public static fj_3 id_class;
   public static fj_3 id_break;
   public static fj_3 id_byte;
   public static fj_3 id_protected;
   public static fj_3 id_throws;
   public static fj_3 id_case;
   public static fj_3 id_catch;
   public static fj_3 id_private;
   public static fj_3 id_implements;
   public static fj_3 id_finally;
   public static fj_3 id_extends;
   public static fj_3 id_native;
   public static fj_3 id_volatile;
   public static fj_3 id_final;
   public static fj_3 id_package;
   public static fj_3 id_int;
   public static fj_3 id_new;
   public static fj_3 id_continue;
   public static fj_3 id_super;
   public static fj_3 id_this;
   public static fj_3 id_else;
   public static fj_3 id_synchronized;
   public static final String id_return = "minecraft:block/";
   public static final String id_public = "minecraft:item/";
   public static final rqO_2 id_goto = new rqO_2("optifine/ctm/default/empty");
   public static final rqO_2 id_while = new rqO_2("optifine/ctm/default/empty.png");
   private static IntBuffer B = rrbb_3.id_break(256);
   private static int S = -1;
   private static Map<Integer, String> s = new HashMap<>();

   public static int id_byte(int var0) {
      byte var1 = 1;

      for (int var2 = 0; var2 < var0; var2++) {
         var1 *= 2;
      }

      return var1;
   }

   public static void id_byte() {
      if (rrbb_3.x() instanceof rAv_1 var1) {
         rrzx_3 var2 = new rrzx_3();
         var1.id_class(var2);
         rrzd_3 var3 = new rrzd_3();
         var1.id_class(var3);
      }
   }

   public static fN_2 id_class(fN_2 var0, int var1) {
      BufferedImage var2 = id_class(var0);
      BufferedImage var3 = id_class(var2, var1);
      return id_class(var3);
   }

   public static BufferedImage id_class(fN_2 var0) {
      int var1 = var0.id_class();
      int var2 = var0.id_break();
      int[] var3 = new int[var1 * var2];
      var0.id_private().get(var3);
      BufferedImage var4 = new BufferedImage(var1, var2, 2);
      var4.setRGB(0, 0, var1, var2, var3, 0, var1);
      return var4;
   }

   private static fN_2 id_class(BufferedImage var0) {
      int var1 = var0.getWidth();
      int var2 = var0.getHeight();
      int[] var3 = new int[var1 * var2];
      var0.getRGB(0, 0, var1, var2, var3, 0, var1);
      fN_2 var4 = new fN_2(var1, var2, false);
      var4.id_private().put(var3);
      return var4;
   }

   public static BufferedImage id_class(BufferedImage var0, int var1) {
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

   public static void id_class() {
      fJ_2 var0 = id_break();
      if (var0 != null) {
         String var1 = "minecraft:block/";
         id_class = id_class(var0, var1 + "grass_block_top");
         id_break = id_class(var0, var1 + "grass_block_side");
         id_byte = id_class(var0, var1 + "grass_block_side_overlay");
         id_protected = id_class(var0, var1 + "snow");
         id_throws = id_class(var0, var1 + "grass_block_snow");
         id_case = id_class(var0, var1 + "mycelium_side");
         id_catch = id_class(var0, var1 + "mycelium_top");
         id_private = id_class(var0, var1 + "water_still");
         id_implements = id_class(var0, var1 + "water_flow");
         id_finally = id_class(var0, var1 + "lava_still");
         id_extends = id_class(var0, var1 + "lava_flow");
         id_native = id_class(var0, var1 + "fire_0");
         id_volatile = id_class(var0, var1 + "fire_1");
         id_final = id_class(var0, var1 + "soul_fire_0");
         id_package = id_class(var0, var1 + "soul_fire_1");
         id_int = id_class(var0, var1 + "campfire_fire");
         id_new = id_class(var0, var1 + "campfire_log_lit");
         id_continue = id_class(var0, var1 + "soul_campfire_fire");
         id_super = id_class(var0, var1 + "soul_campfire_log_lit");
         id_this = id_class(var0, var1 + "nether_portal");
         id_else = id_class(var0, var1 + "glass");
         id_synchronized = id_class(var0, var1 + "glass_pane_top");
         String var2 = "minecraft:item/";
      }
   }

   public static String id_class(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0 ? "" : var0.substring(0, var1);
   }

   public static String id_class(String var0, String var1) {
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

   public static String id_class(Throwable var0) {
      CharArrayWriter var1 = new CharArrayWriter();
      var0.printStackTrace(new PrintWriter(var1));
      return var1.toString();
   }

   public static BufferedImage id_class(InputStream var0) throws IOException {
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

   public static void id_class(String var0, int var1, int var2, int var3, int var4) {
      id_protected(var1);
      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3317, 1);
      var0 = rrzX_2.id_throws(var0, ".png");
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
            rrbb_3.id_byte("Exported: " + var19);
         } catch (Exception var16) {
            rrbb_3.id_protected("Error writing: " + var19);
            rrbb_3.id_protected(var16.getClass().getName() + ": " + var16.getMessage());
         }
      }
   }

   public static void id_class(fj_3 var0) {
      fN_2[] var1 = var0.id_synchronized();

      for (int var2 = 0; var2 < var1.length; var2++) {
         fN_2 var3 = var1[var2];
         if (var3 == null) {
            rrbb_3.id_byte(var2 + ": " + var3);
         } else {
            rrbb_3.id_byte(var2 + ": " + var3.id_class() * var3.id_break());
         }
      }
   }

   public static Dimension id_class(InputStream var0, String var1) {
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

   public static int id_class(int var0, int var1) {
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

   public static void id_class(IC var0) {
      rrby_3.id_class();
      rrby_3.id_class(var0);
   }

   public static fj_3 id_class(fJ_2 var0, String var1) {
      fj_3 var2 = var0.id_break(var1);
      if (var2 == null || var2 instanceof fQ_2) {
         rrbb_3.id_protected("Sprite not found: " + var1);
      }

      return var2;
   }

   public static void id_class(rAL var0) {
      if (id_break() != null) {
         rrbb_3.id_byte("*** Reloading custom textures ***");
         rrbf_3.id_class();
         rrMd_1.id_class();
         id_class();
         rrMs_1.id_class();
         rrGU.id_class();
         rrGe_1.id_class();
         rrMd_1.id_break();
         rrbN_2.id_class();
         rrbf_3.id_break();
         rrME.id_break();
         rrby_3.id_break();
         rrMo_1.id_class();
         rrdZ.q();
         rrba_3.id_class();
         rrbb_3.id_long();
         rrMX.id_class();
         rrbw_3.id_break();
         rrbl_3.id_class();
         Tg_1.id_class();
         rrbt_3.id_break();
         rrbW_2.id_class();
         rrbb_3.J().id_break();
         rrbb_3.id_byte("Disable Forge light pipeline");
      }
   }

   public static ff_3 id_class(rqO_2 var0) {
      ff_3 var1 = rrbb_3.J().id_break(var0);
      if (var1 != null) {
         return var1;
      } else if (!rrbb_3.id_byte(var0)) {
         return null;
      } else {
         fH_2 var2 = new fH_2(var0);
         rrbb_3.J().id_class(var0, var2);
         return var2;
      }
   }

   public static BufferedImage id_class(String var0, BufferedImage var1) {
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

   public static int id_class(int var0) {
      byte var1 = 1;

      while (var1 < var0) {
         var1 *= 2;
      }

      return var1;
   }

   public static rqO_2 id_class(rqO_2 var0, String var1) {
      if (!var0.id_byte().equals("minecraft")) {
         return var0;
      } else {
         String var2 = var0.id_break();
         String var3 = id_class(var2, var1);
         if (var3 != var2) {
            var0 = new rqO_2(var0.id_byte(), var3);
         }

         return var0;
      }
   }

   public static void id_class(fJ_2 var0) {
      if (var0.id_protected().equals(fJ_2.id_class)) {
         rrbO_2.id_class(var0);
         rrby_3.id_class(var0);
         rrGU.id_class(var0);
      }
   }

   public static void id_break(fJ_2 var0) {
      if (var0.id_protected().equals(fJ_2.id_class)) {
         rrbO_2.id_break(var0);
         rrby_3.id_break(var0);
         rrGU.id_break(var0);
      }

      rrbY_2.id_class(var0);
   }

   public static int id_break(int var0) {
      byte var1 = 1;

      int var2;
      for (var2 = 0; var1 < var0; var2++) {
         var1 *= 2;
      }

      return var2;
   }

   public static int id_break(int var0, int var1) {
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

   public static fJ_2 id_break() {
      return rrbb_3.rF();
   }

   public static void id_throws() {
      if (org.lwjgl.opengl.GL.getCapabilities().GL_EXT_texture_filter_anisotropic) {
         float var0 = GL11.glGetFloat(34047);
         float var1 = (float)rrbb_3.y();
         var1 = Math.min(var1, var0);
         GL11.glTexParameterf(3553, 34046, var1);
      }
   }

   public static boolean id_throws(int var0) {
      int var1 = rfU_2.id_byte(var0);
      return var1 == var0;
   }

   public static void id_catch() {
      MT.id_final(3314, 0);
      MT.id_final(3316, 0);
      MT.id_final(3315, 0);
      MT.id_final(3317, 4);
   }

   public static void id_catch(int var0) {
      s.put(var0, id_class(new Throwable("StackTrace")));
      rrbb_3.id_byte("Textures: " + s.size());
   }

   public static int id_case(int var0) {
      int var1 = var0 >> 24 & 0xFF;
      int var2 = var0 >> 16 & 0xFF;
      int var3 = var0 >> 8 & 0xFF;
      int var4 = var0 >> 0 & 0xFF;
      return var1 << 24 | var4 << 16 | var3 << 8 | var2;
   }

   public static int id_case() {
      if (S < 0) {
         S = id_private();
      }

      return S;
   }

   public static void id_protected(int var0) {
      MT.id_super(var0);
   }

   public static void id_protected() {
      rrzk_3 var0 = new rrzk_3();
      rqO_2 var1 = new rqO_2("optifine/tickable_textures");
      rrbb_3.J().id_class(var1, var0);
   }

   private static int id_private() {
      for (int var0 = 65536; var0 > 0; var0 >>= 1) {
         MT.id_class(32868, 0, 6408, var0, var0, 0, 6408, 5121, (IntBuffer)null);
         int var1 = GL11.glGetError();
         int var2 = MT.id_byte(32868, 0, 4096);
         if (var2 != 0) {
            return var0;
         }
      }

      return 0;
   }

   public static void id_private(int var0) {
      s.remove(var0);
      rrbb_3.id_byte("Textures: " + s.size());
   }
}
