package celestial;

import com.mojang.blaze3d.platform.GLX;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLCapabilities;

public class rrbb_3 {
   public static final String class_ = "OptiFine";
   public static final String break_ = "1.16.5";
   public static final String byte_ = "HD_U";
   public static final String protected_ = "G8";
   public static final String throws_ = "OptiFine_1.16.5_HD_U_G8";
   private static String super_ = null;
   private static boolean this_ = false;
   public static String case_ = null;
   public static String catch_ = null;
   public static String private_ = null;
   public static String[] implements_ = null;
   public static rrMm_1 finally_ = null;
   public static rrMm_1 extends_ = null;
   public static int native_ = -1;
   public static boolean volatile_ = false;
   public static boolean final_ = false;
   private static Qw_1 else_ = null;
   private static QY synchronized_ = QY.instanceof_();
   private static boolean return_ = false;
   private static Thread public_ = null;
   private static int goto_ = 0;
   private static int while_ = 0;
   public static boolean package_ = false;
   public static boolean int_ = false;
   private static int try_ = 0;
   private static boolean instanceof_ = false;
   private static boolean throw_ = false;
   public static final Float new_ = 0.1F;
   private static final Logger interface_ = LogManager.getLogger();
   public static final boolean continue_ = System.getProperty("log.detail", "false").equals("true");
   private static String char_ = null;
   private static int abstract_ = 0;
   private static int long_ = 0;
   private static fJ_2 float_;
   private static long void_;
   private static long static_;
   private static boolean import_ = Boolean.getBoolean("frame.time");

   public static boolean boolean_() {
      return else_.Ph != 2;
   }

   public static boolean char_() {
      if (else_.rc != 0) {
         return else_.rc == 2;
      } else if (rs() && !rrdZ.sJ.catch_()) {
         return rrdZ.sJ.implements_();
      } else {
         return try_ != 0 ? try_ == 2 : try_();
      }
   }

   private static void byte_(String var0, int var1) {
      try {
         ThreadGroup var2 = Thread.currentThread().getThreadGroup();
         if (var2 == null) {
            return;
         }

         int var3 = (var2.activeCount() + 10) * 2;
         Thread[] var4 = new Thread[var3];
         var2.enumerate(var4, false);

         for (int var5 = 0; var5 < var4.length; var5++) {
            Thread var6 = var4[var5];
            if (var6 != null && var6.getName().startsWith(var0)) {
               var6.setPriority(var1);
            }
         }
      } catch (Throwable var7) {
         protected_(var7.getClass().getName() + ": " + var7.getMessage());
      }
   }

   public static void byte_(String var0) {
   }

   public static boolean byte_(rqO_2 var0) {
      if (var0 == null) {
         return false;
      } else {
         rAC var1 = throws_(var0);
         return var1 != null;
      }
   }

   public static String byte_(int var0) {
      switch (var0) {
         case 0:
            return "No error";
         case 1280:
            return "Invalid enum";
         case 1281:
            return "Invalid value";
         case 1282:
            return "Invalid operation";
         case 1283:
            return "Stack overflow";
         case 1284:
            return "Stack underflow";
         case 1285:
            return "Out of memory";
         case 1286:
            return "Invalid framebuffer operation";
         default:
            return "Unknown";
      }
   }

   public static byte[] byte_(InputStream var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[1024];

      while (true) {
         int var3 = var0.read(var2);
         if (var3 < 0) {
            var0.close();
            return var1.toByteArray();
         }

         var1.write(var2, 0, var3);
      }
   }

   public static void byte_() {
      protected_();
      public_ = Thread.currentThread();
      volatile_();
      rrdZ.class_(QY.instanceof_());
   }

   public static void byte_(String var0, String var1) {
      rrJB var2 = new rrJB((vm_3)synchronized_.class_[73], var0, var1);
      synchronized_.break_(var2);
   }

   public static int int_() {
      return else_.instanceof_;
   }

   public static void long_() {
      try_ = 0;
      rAL var0 = x();
      if (var0 != null) {
         try {
            InputStream var1 = var0.class_(new rqO_2("optifine/color.properties")).break_();
            if (var1 == null) {
               return;
            }

            rrzE_2 var2 = new rrzE_2();
            var2.load(var1);
            var1.close();
            String var3 = var2.getProperty("clouds");
            if (var3 == null) {
               return;
            }

            byte_("Texture pack clouds: " + var3);
            var3 = var3.toLowerCase();
            if (var3.equals("fast")) {
               try_ = 1;
            }

            if (var3.equals("fancy")) {
               try_ = 2;
            }

            if (var3.equals("off")) {
               try_ = 3;
            }
         } catch (Exception var4) {
         }
      }
   }

   public static Ip_1 float_() {
      return synchronized_.float_().byte_;
   }

   public static boolean double_() {
      return else_.Px;
   }

   private rrbb_3() {
   }

   public static boolean B() {
      return else_.Pz;
   }

   public static boolean C() {
      return else_.rw == 1;
   }

   public static boolean D() {
      return else_.rR;
   }

   public static boolean F() {
      return !v() ? false : !rs() || rrdZ.new_();
   }

   public static boolean I() {
      return else_.PF;
   }

   public static fY_2 J() {
      return synchronized_.A();
   }

   public static boolean S() {
      return else_.PQ;
   }

   public static boolean Z() {
      return else_.rH;
   }

   public static boolean V() {
      return else_.PA;
   }

   public static boolean this_() {
      return !case_() ? false : else_.rM == 2;
   }

   public static boolean e() {
      return else_.rY;
   }

   public static boolean i() {
      return else_.rD;
   }

   public static boolean b() {
      return else_.Pm;
   }

   public static rAL x() {
      return synchronized_.F();
   }

   public static boolean s() {
      return else_.PN;
   }

   public static boolean c() {
      return else_.rF != 3;
   }

   public static boolean n() {
      return else_.ry;
   }

   public static float h() {
      return rs() && rrdZ.st >= 0.0F ? rrdZ.st : (float)else_.rz;
   }

   public static boolean f() {
      return else_.rI;
   }

   public static boolean l() {
      return else_.rw == 0;
   }

   public static rAC[] d() {
      rAt_1 var0 = synchronized_.char_();
      Collection var1 = var0.throws_();
      ArrayList var2 = new ArrayList();

      for (rAp_1 var4 : var1) {
         rAC var5 = var4.protected_();
         if (var5 != W()) {
            var2.add(var5);
         }
      }

      return var2.toArray(new rAC[var2.size()]);
   }

   public static boolean a() {
      return else_.ro != 3;
   }

   public static boolean interface_() {
      return else_.rZ == 3;
   }

   public static String class_(List var0) {
      return class_(var0, ", ");
   }

   public static int[] class_(int[] var0, int var1) {
      return class_(var0, new int[]{var1});
   }

   public static void class_(boolean var0) {
      this_ = var0;
   }

   public static int class_(String var0, int var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim();
            return Integer.parseInt(var0);
         }
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public static String class_(Object[] var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for (int var3 = 0; var3 < var0.length; var3++) {
            Object var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(String.valueOf(var4));
         }

         return var2.toString();
      }
   }

   public static String class_(List var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var2 = new StringBuffer(var0.size() * 5);

         for (int var3 = 0; var3 < var0.size(); var3++) {
            Object var4 = var0.get(var3);
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(String.valueOf(var4));
         }

         return var2.toString();
      }
   }

   public static String class_(Object[] var0) {
      return class_(var0, ", ");
   }

   public static int[] class_(Integer[] var0) {
      if (var0 == null) {
         return null;
      } else if (var0.length == 0) {
         return new int[0];
      } else {
         int[] var1 = new int[var0.length];

         for (int var2 = 0; var2 < var1.length; var2++) {
            var1[var2] = var0[var2];
         }

         return var1;
      }
   }

   public static String class_() {
      return "OptiFine_1.16.5_HD_U_G8";
   }

   public static String class_(boolean[] var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for (int var3 = 0; var3 < var0.length; var3++) {
            boolean var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(String.valueOf(var4));
         }

         return var2.toString();
      }
   }

   public static Boolean class_(String var0, Boolean var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim().toLowerCase();
            if (var0.equals("true")) {
               return Boolean.TRUE;
            } else {
               return var0.equals("false") ? Boolean.FALSE : var1;
            }
         }
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public static String[] class_(String var0, String var1) {
      StringTokenizer var2 = new StringTokenizer(var0, var1);
      ArrayList var3 = new ArrayList();

      while (var2.hasMoreTokens()) {
         String var4 = var2.nextToken();
         var3.add(var4);
      }

      return var3.toArray(new String[var3.size()]);
   }

   public static void class_(Ml_1 var0) {
      int var1 = rN();
      int var2 = ((yX_2)synchronized_.class_[8]).package_();
      int var3 = ((yX_2)synchronized_.class_[8]).int_();
      int var4 = ((yX_2)synchronized_.class_[8]).new_();
      String var5 = rk() + ", C: " + var2 + ", E: " + var3 + "+" + var4 + ", U: " + var1;
      ((cm_3)synchronized_.class_[15]).break_(var0, var5, 2.0F, 2.0F, -2039584);
   }

   public static float class_(String var0, float var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim();
            return Float.parseFloat(var0);
         }
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public static boolean class_(String var0, boolean var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim();
            return Boolean.parseBoolean(var0);
         }
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public static void class_(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         break_("", var3);
      }
   }

   public static void class_(Object var0, String var1) throws NullPointerException {
      if (var0 == null) {
         throw new NullPointerException(var1);
      }
   }

   public static boolean class_(rAC var0, rqO_2 var1) {
      return var0 != null && var1 != null ? var0.break_(rAI.CLIENT_RESOURCES, var1) : false;
   }

   public static InputStream class_(rAL var0, rqO_2 var1) throws IOException {
      rAF var2 = var0.class_(var1);
      return var2 == null ? null : var2.break_();
   }

   public static void class_(File var0, String var1) throws IOException {
      FileOutputStream var2 = new FileOutputStream(var0);
      byte[] var3 = var1.getBytes("ASCII");
      var2.write(var3);
      var2.close();
   }

   public static rrMm_1 class_(String var0, rrMm_1 var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            Pattern var2 = Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?");
            Matcher var3 = var2.matcher(var0);
            if (!var3.matches()) {
               return var1;
            } else {
               int var4 = Integer.parseInt(var3.group(1));
               int var5 = Integer.parseInt(var3.group(2));
               int var6 = var3.group(4) != null ? Integer.parseInt(var3.group(4)) : 0;
               String var7 = var3.group(5);
               return new rrMm_1(var4, var5, var6, var7);
            }
         }
      } catch (Exception var8) {
         break_("", var8);
         return var1;
      }
   }

   public static void class_(fJ_2 var0) {
      float_ = var0;
   }

   public static String class_(float[] var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for (int var3 = 0; var3 < var0.length; var3++) {
            float var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(String.valueOf(var4));
         }

         return var2.toString();
      }
   }

   public static String class_(float[] var0) {
      return class_(var0, ", ");
   }

   public static String class_(int[] var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringBuffer var2 = new StringBuffer(var0.length * 5);

         for (int var3 = 0; var3 < var0.length; var3++) {
            int var4 = var0[var3];
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(String.valueOf(var4));
         }

         return var2.toString();
      }
   }

   public static String class_(int[] var0) {
      return class_(var0, ", ");
   }

   public static boolean class_(Boolean var0) {
      return var0 != null && var0;
   }

   public static int[] class_(int[] var0, int[] var1) {
      if (var0 != null && var1 != null) {
         int var2 = var0.length;
         int var3 = var2 + var1.length;
         int[] var4 = new int[var3];
         System.arraycopy(var0, 0, var4, 0, var2);

         for (int var5 = 0; var5 < var1.length; var5++) {
            var4[var5 + var2] = var1[var5];
         }

         return var4;
      } else {
         throw new NullPointerException("The given array is NULL");
      }
   }

   public static InputStream class_(rqO_2 var0) throws IOException {
      return class_(synchronized_.F(), var0);
   }

   public static Object[] class_(Object[] var0, Object var1, int var2) {
      ArrayList var3 = new ArrayList<>(Arrays.asList(var0));
      var3.add(var2, var1);
      Object[] var4 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var3.size());
      return var3.toArray(var4);
   }

   public static String[] class_(File var0) throws IOException {
      FileInputStream var1 = new FileInputStream(var0);
      return class_(var1);
   }

   public static String[] class_(InputStream var0) throws IOException {
      ArrayList var1 = new ArrayList();
      InputStreamReader var2 = new InputStreamReader(var0, "ASCII");
      BufferedReader var3 = new BufferedReader(var2);

      while (true) {
         String var4 = var3.readLine();
         if (var4 == null) {
            return var1.toArray(new String[var1.size()]);
         }

         var1.add(var4);
      }
   }

   public static Object[] class_(Object[] var0, Object var1) {
      if (var0 == null) {
         throw new NullPointerException("The given array is NULL");
      } else {
         int var2 = var0.length;
         int var3 = var2 + 1;
         Object[] var4 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var3);
         System.arraycopy(var0, 0, var4, 0, var2);
         var4[var2] = var1;
         return var4;
      }
   }

   public static boolean class_(Object var0, Object var1) {
      if (var0 == var1) {
         return true;
      } else {
         return var0 == null ? false : var0.equals(var1);
      }
   }

   public static Object[] class_(Object[] var0, Object[] var1) {
      if (var0 == null) {
         throw new NullPointerException("The given array is NULL");
      } else if (var1.length == 0) {
         return var0;
      } else {
         int var2 = var0.length;
         int var3 = var2 + var1.length;
         Object[] var4 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var3);
         System.arraycopy(var0, 0, var4, 0, var2);
         System.arraycopy(var1, 0, var4, var2, var1.length);
         return var4;
      }
   }

   public static int class_(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static int class_(rfH_2 var0, int var1) {
      int var2 = class_(var1 + 37);
      var2 = class_(var2 + var0.b_());
      var2 = class_(var2 + var0.d_());
      return class_(var2 + var0.c_());
   }

   public static boolean class_(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            Object var3 = var1[var2];
            if (class_(var0, var3)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean class_(int var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == var0) {
            return true;
         }
      }

      return false;
   }

   public static int class_(int var0) {
      var0 = var0 ^ 61 ^ var0 >> 16;
      var0 += var0 << 3;
      var0 ^= var0 >> 4;
      var0 *= 668265261;
      return var0 ^ var0 >> 15;
   }

   public static void class_(Qw_1 var0) {
      if (else_ == null) {
         else_ = var0;
         rb();
         goto_ = else_.rQ;
      }
   }

   public static String class_(InputStream var0, String var1) throws IOException {
      InputStreamReader var2 = new InputStreamReader(var0, var1);
      BufferedReader var3 = new BufferedReader(var2);
      StringBuffer var4 = new StringBuffer();

      while (true) {
         String var5 = var3.readLine();
         if (var5 == null) {
            var0.close();
            return var4.toString();
         }

         var4.append(var5);
         var4.append("\n");
      }
   }

   public static float class_(float var0) {
      if (var0 < 0.0F) {
         return 0.0F;
      } else {
         return var0 > 1.0F ? 1.0F : var0;
      }
   }

   public static Object[] class_(Collection var0, Class var1) {
      if (var0 == null) {
         return null;
      } else if (var1 == null) {
         return null;
      } else if (var1.isPrimitive()) {
         throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + var1);
      } else {
         Object[] var2 = (Object[])Array.newInstance(var1, var0.size());
         return var0.toArray(var2);
      }
   }

   public static boolean class_(URI var0) {
      rqR_2.class_((Exception)null);
      rqR_2.implements_().class_(var0);
      Exception var1 = rqR_2.native_();
      return var1 == null;
   }

   public static InputStream class_(String var0) {
      return rrbb_3.class.getResourceAsStream(var0);
   }

   public static void class_(String var0, Throwable var1) {
      interface_.warn("[OptiFine] " + var0, var1);
   }

   public static long class_(long var0, long var2, long var4) {
      if (var0 < var2) {
         return var2;
      } else {
         return var0 > var4 ? var4 : var0;
      }
   }

   public static double class_(double var0, double var2, double var4) {
      if (var0 < var2) {
         return var2;
      } else {
         return var0 > var4 ? var4 : var0;
      }
   }

   public static float class_(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static boolean rd() {
      return else_.rK;
   }

   public static boolean m() {
      return else_.rl;
   }

   public static int o() {
      return else_.abstract_;
   }

   public static boolean p() {
      return y() > 1;
   }

   public static String k() {
      if (synchronized_.F() == null) {
         return "";
      } else {
         rAC[] var0 = d();
         if (var0.length <= 0) {
            return W().class_();
         } else {
            String[] var1 = new String[var0.length];

            for (int var2 = 0; var2 < var0.length; var2++) {
               var1[var2] = var0[var2].class_();
            }

            return class_(var1);
         }
      }
   }

   public static boolean default_() {
      return else_.PO != 2;
   }

   public static void rb() {
      while_ = Runtime.getRuntime().availableProcessors();
   }

   public static boolean t() {
      return rE().rQ > 0;
   }

   public static boolean g() {
      return else_.rf;
   }

   public static boolean v() {
      return else_.rp;
   }

   public static boolean j() {
      return else_.PL;
   }

   public static int q() {
      return goto_;
   }

   public static boolean U() {
      return else_.rV;
   }

   public static boolean short_() {
      return else_.rv == 0 ? try_() : else_.rv == 2;
   }

   public static yX_2 z() {
      return (yX_2)synchronized_.class_[8];
   }

   public static void rf() {
      long var0 = System.currentTimeMillis();
      long var2 = var0 - void_;
      void_ = var0;
      var2 = class_(var2, 1L, 1000L);
      static_ = (static_ + var2) / 2L;
      static_ = class_(static_, 1L, 1000L);
      if ((String)synchronized_.class_[79] != char_) {
         char_ = (String)synchronized_.class_[79];
         rc();
         rK();
      }
   }

   public static boolean void_() {
      return else_.rm == 0 ? try_() : else_.rm != 1;
   }

   public static boolean w() {
      return y() > 1 ? true : q() > 0;
   }

   public static boolean rv() {
      return false;
   }

   public static boolean u() {
      return else_.rF == 2;
   }

   public static boolean r() {
      return else_.Pk;
   }

   public static boolean rn() {
      if (!rL()) {
         return false;
      } else {
         return rs() ? rrdZ.finally_() : true;
      }
   }

   public static int y() {
      return else_.rN;
   }

   public static Hh_1 N() {
      return (Hh_1)synchronized_.class_[16];
   }

   public static boolean rh() {
      return else_.rd;
   }

   public static void break_(String var0) {
      if (continue_) {
         interface_.info("[OptiFine] " + var0);
      }
   }

   public static boolean break_(double var0, double var2, double var4) {
      return var0 >= var2 && var0 <= var4;
   }

   public static boolean break_(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            Object var3 = var1[var2];
            if (var0 == var3) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean break_(int var0, int var1, int var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static Object[] break_(Object[] var0, Object var1) {
      ArrayList var2 = new ArrayList<>(Arrays.asList(var0));
      var2.remove(var1);
      return class_(var2, var0.getClass().getComponentType());
   }

   public static String break_(InputStream var0) throws IOException {
      return class_(var0, "ASCII");
   }

   public static int break_(String var0, int var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim();
            if (var0.startsWith("0x")) {
               var0 = var0.substring(2);
            }

            return Integer.parseInt(var0, 16);
         }
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public static String break_(File var0) throws IOException {
      FileInputStream var1 = new FileInputStream(var0);
      return class_((InputStream)var1, "ASCII");
   }

   public static boolean break_(rAL var0, rqO_2 var1) {
      try {
         rAF var2 = var0.class_(var1);
         return var2 != null;
      } catch (IOException var3) {
         return false;
      }
   }

   public static int break_(String var0, String var1) {
      String[] var2 = implements_(var0);
      String[] var3 = implements_(var1);
      String var4 = var2[0];
      String var5 = var3[0];
      if (!var4.equals(var5)) {
         return var4.compareTo(var5);
      } else {
         int var6 = class_(var2[1], -1);
         int var7 = class_(var3[1], -1);
         if (var6 != var7) {
            return var6 - var7;
         } else {
            String var8 = var2[2];
            String var9 = var3[2];
            if (!var8.equals(var9)) {
               if (var8.isEmpty()) {
                  return 1;
               }

               if (var9.isEmpty()) {
                  return -1;
               }
            }

            return var8.compareTo(var9);
         }
      }
   }

   public static boolean break_(float var0, float var1, float var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static void break_(String var0, Throwable var1) {
      interface_.error("[OptiFine] " + var0, var1);
   }

   public static rAF break_(rqO_2 var0) throws IOException {
      return synchronized_.F().class_(var0);
   }

   public static IntBuffer break_(int var0) {
      return Hb_1.class_(var0 << 2).asIntBuffer();
   }

   public static String break_() {
      StringBuffer var0 = new StringBuffer(32);
      if (rL()) {
         var0.append("DL: ");
         var0.append(String.valueOf(rrbg_3.break_()));
         var0.append(", ");
      }

      var0.append("OptiFine_1.16.5_HD_U_G8");
      String var1 = rrdZ.y();
      if (var1 != null) {
         var0.append(", ");
         var0.append(var1);
      }

      return var0.toString();
   }

   public static void throws_(String var0) {
      interface_.error("[OptiFine] " + var0);
   }

   public static rAC throws_(rqO_2 var0) {
      rAt_1 var1 = synchronized_.char_();
      Collection var2 = var1.throws_();
      List var3 = (List)var2;

      for (int var4 = var3.size() - 1; var4 >= 0; var4--) {
         rAp_1 var5 = (rAp_1)var3.get(var4);
         rAC var6 = var5.protected_();
         if (var6.break_(rAI.CLIENT_RESOURCES, var0)) {
            return var6;
         }
      }

      return null;
   }

   public static String throws_() {
      if (super_ == null) {
         try {
            InputStream var0 = class_("/buildof.txt");
            if (var0 == null) {
               return null;
            }

            super_ = class_(var0)[0];
         } catch (Exception var1) {
            protected_(var1.getClass().getName() + ": " + var1.getMessage());
            super_ = "";
         }
      }

      return super_;
   }

   public static boolean L() {
      return !v() ? false : !rs() || rrdZ.continue_();
   }

   public static boolean rt() {
      return synchronized_.this_() == null ? false : synchronized_.switch_();
   }

   public static boolean M() {
      return else_.PZ;
   }

   public static rAY W() {
      return synchronized_.Z().class_();
   }

   public static boolean H() {
      return else_.rw == 2;
   }

   public static boolean R() {
      return else_.rj;
   }

   public static boolean P() {
      return else_.PW;
   }

   public static rrMm_1 finally_() {
      if (finally_ == null) {
         String var0 = GL11.glGetString(7938);
         finally_ = class_(var0, (rrMm_1)null);
         if (finally_ == null) {
            finally_ = rY();
         }

         if (finally_ == null) {
            finally_ = new rrMm_1(1, 0);
         }
      }

      return finally_;
   }

   public static void catch_(String var0) {
      int var1 = MT.switch_();
      if (var1 != 0 && rrbo_3.class_(var1)) {
         String var2 = byte_(var1);
         String var3 = String.format("OpenGL error: %s (%s), at: %s", var1, var2, var0);
         throws_(var3);
         if (rT() && rrzQ_2.class_("ShowGlError", 10000L)) {
            String var4 = jI_2.class_("of.message.openglError", var1, var2);
            ((cq_3)synchronized_.class_[19]).throws_().class_(new rgN_2(var4));
         }
      }
   }

   public static boolean catch_() {
      return final_;
   }

   public static boolean G() {
      return else_.Pu;
   }

   public static boolean O() {
      return else_.Pv;
   }

   public static rrMm_1 extends_() {
      if (extends_ == null) {
         String var0 = GL11.glGetString(35724);
         extends_ = class_(var0, (rrMm_1)null);
         if (extends_ == null) {
            extends_ = new rrMm_1(1, 10);
         }
      }

      return extends_;
   }

   public static int goto_() {
      return else_.rT;
   }

   public static boolean K() {
      return else_.rg;
   }

   public static boolean case_() {
      return volatile_;
   }

   public static void case_(String var0) {
   }

   public static boolean const_() {
      return else_.PO == 1;
   }

   public static boolean continue_() {
      float var0 = super_();
      return var0 > new_ + 1.0E-5F;
   }

   public static boolean else_() {
      return else_.rM == 1;
   }

   public static boolean for_() {
      return else_.PX;
   }

   public static String implements_() {
      rrMm_1 var0 = finally_();
      return var0.class_() + "." + var0.break_() + "." + var0.byte_();
   }

   private static String[] implements_(String var0) {
      if (var0 != null && var0.length() > 0) {
         Pattern var1 = Pattern.compile("([A-Z])([0-9]+)(.*)");
         Matcher var2 = var1.matcher(var0);
         if (!var2.matches()) {
            return new String[]{"", "", ""};
         } else {
            String var3 = private_(var2.group(1));
            String var4 = private_(var2.group(2));
            String var5 = private_(var2.group(3));
            return new String[]{var3, var4, var5};
         }
      } else {
         return new String[]{"", "", ""};
      }
   }

   public static boolean import_() {
      return else_.rm == 0 ? !try_() : else_.rm == 4;
   }

   public static boolean instanceof_() {
      return else_.case_ == VW.FABULOUS;
   }

   public static int new_() {
      switch (else_.rh) {
         case 0:
            return 9986;
         case 1:
            return 9986;
         case 2:
            if (w()) {
               return 9985;
            }

            return 9986;
         case 3:
            if (w()) {
               return 9987;
            }

            return 9986;
         default:
            return 9986;
      }
   }

   public static boolean package_() {
      return else_.instanceof_ > 0;
   }

   public static boolean return_() {
      return else_.rM != 3;
   }

   public static float super_() {
      return new_;
   }

   public static boolean switch_() {
      return else_.Pd;
   }

   public static boolean throw_() {
      return else_.rZ == 0 ? try_() : else_.rZ == 2;
   }

   public static boolean try_() {
      return else_.case_ != VW.FAST;
   }

   public static boolean while_() {
      return else_.rt;
   }

   public static boolean rs() {
      return rrdZ.sr;
   }

   public static boolean static_() {
      return else_.rm == 4;
   }

   public static float public_() {
      return else_.rO;
   }

   public static boolean protected_(rqO_2 var0) {
      return throws_(var0) == W();
   }

   private static ByteBuffer protected_(InputStream var0) throws IOException {
      BufferedImage var1 = ImageIO.read(var0);
      int[] var2 = var1.getRGB(0, 0, var1.getWidth(), var1.getHeight(), (int[])null, 0, var1.getWidth());
      ByteBuffer var3 = ByteBuffer.allocate(4 * var2.length);

      for (int var7 : var2) {
         var3.putInt(var7 << 8 | var7 >> 24 & 0xFF);
      }

      ((Buffer)var3).flip();
      return var3;
   }

   public static void protected_() {
      if (!return_ && QY.instanceof_().else_() != null) {
         return_ = true;
         rR();
      }
   }

   public static void protected_(String var0) {
      interface_.warn("[OptiFine] " + var0);
   }

   public static boolean protected_(int var0) {
      return GLFW.glfwGetKey(synchronized_.else_().implements_(), var0) == 1;
   }

   public static String private_(String var0) {
      return var0 == null ? "" : var0;
   }

   public static int private_() {
      if (native_ < 0) {
         String[] var0 = class_("1.16.5", ".");
         int var1 = 0;
         if (var0.length > 0) {
            var1 += 10000 * class_(var0[0], 0);
         }

         if (var0.length > 1) {
            var1 += 100 * class_(var0[1], 0);
         }

         if (var0.length > 2) {
            var1 += 1 * class_(var0[2], 0);
         }

         native_ = var1;
      }

      return native_;
   }

   public static boolean abstract_() {
      if (else_.rc != 0) {
         return else_.rc == 3;
      } else if (rs() && !rrdZ.sJ.catch_()) {
         return rrdZ.sJ.finally_();
      } else {
         return try_ != 0 ? try_ == 3 : false;
      }
   }

   public static boolean final_() {
      return Thread.currentThread() == public_;
   }

   public static boolean transient_() {
      return else_.Ph == 1;
   }

   public static void volatile_() {
      rb();
      byte var0 = 8;
      if (rM()) {
         if (rO()) {
            public_.setPriority(10);
            byte_("Server thread", 1);
         } else {
            public_.setPriority(5);
            byte_("Server thread", 5);
         }
      } else {
         public_.setPriority(10);
         byte_("Server thread", 5);
      }
   }

   public static boolean synchronized_() {
      return else_.rM == 3 || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K().aJ_();
   }

   public static String[] native_() {
      if (implements_ == null) {
         implements_ = ro();
      }

      return implements_;
   }

   public static boolean strictfp_() {
      return else_.PJ;
   }

   public static boolean E() {
      return else_.Pc;
   }

   public static boolean rp() {
      return GLX.useVbo();
   }

   public static boolean rl() {
      return else_.Ps;
   }

   public static boolean A() {
      if (rs() && !rrdZ.super_()) {
         return false;
      } else {
         return else_.rq == 0 ? try_() : else_.rq == 2;
      }
   }

   public static boolean rw() {
      if ((cT_2)synchronized_.class_[75] == null) {
         return false;
      } else {
         if ((cT_2)synchronized_.class_[75] instanceof cj_3 var0 && var0.throws_()) {
            return false;
         }

         return true;
      }
   }

   public static long rg() {
      return 1000L / rj();
   }

   public static int ru() {
      String var0 = System.getenv("ProgramFiles(X86)");
      return var0 != null ? 64 : 32;
   }

   public static boolean T() {
      return q() > 0;
   }

   public static QY X() {
      return synchronized_;
   }

   private static String[] ro() {
      try {
         rrMm_1 var0 = finally_();
         if (var0.class_() >= 3) {
            int var1 = GL11.glGetInteger(33309);
            if (var1 > 0) {
               String[] var2 = new String[var1];

               for (int var3 = 0; var3 < var1; var3++) {
                  var2[var3] = GL30.glGetStringi(7939, var3);
               }

               return var2;
            }
         }
      } catch (Exception var5) {
         break_("", var5);
      }

      try {
         String var6 = GL11.glGetString(7939);
         return var6.split(" ");
      } catch (Exception var4) {
         break_("", var4);
         return new String[0];
      }
   }

   public static yX_2 Q() {
      return (yX_2)synchronized_.class_[8];
   }

   public static boolean rr() {
      return else_.rU;
   }

   public static int rm() {
      String[] var0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (int var1 = 0; var1 < var0.length; var1++) {
         String var2 = var0[var1];
         String var3 = System.getProperty(var2);
         if (var3 != null && var3.contains("64")) {
            return 64;
         }
      }

      return 32;
   }

   public static boolean rq() {
      return else_.rJ;
   }

   public static void rc() {
      rpN_2 var0 = synchronized_.k();
      long[] var1 = var0.byte_();
      int var2 = var0.break_();
      int var3 = var0.class_();
      if (var2 != var3) {
         int var4 = (Integer)QY.break_[9];
         if (var4 <= 0) {
            var4 = 1;
         }

         long var5 = (long)(1.0 / (double)var4 * 1.0E9);
         long var7 = var5;
         long var9 = 0L;

         for (int var11 = rfU_2.break_(var2 - 1, var1.length); var11 != var3 && (double)var9 < 1.0E9; var11 = rfU_2.break_(var11 - 1, var1.length)) {
            long var12 = var1[var11];
            if (var12 > var7) {
               var7 = var12;
            }

            var9 += var12;
         }

         double var14 = (double)var7 / 1.0E9;
         abstract_ = (int)(1.0 / var14);
      }
   }

   public static boolean ry() {
      return w() ? false : else_.rk && MT.protected_;
   }

   public static boolean rO() {
      return else_.rx;
   }

   public static int rQ() {
      return abstract_;
   }

   public static boolean rJ() {
      return else_.PP;
   }

   public static boolean rA() {
      return else_.PB == 1;
   }

   public static boolean rM() {
      return rG() <= 1;
   }

   public static boolean rC() {
      return else_.PS;
   }

   public static boolean rB() {
      return else_.ra;
   }

   public static int rG() {
      return while_;
   }

   public static boolean rL() {
      return else_.PB != 3;
   }

   public static String rk() {
      int var0 = rz();
      int var1 = rQ();
      if (import_) {
         String var2 = String.format("%.1f", 1000.0 / (double)class_(var0, 1, Integer.MAX_VALUE));
         String var3 = String.format("%.1f", 1000.0 / (double)class_(var1, 1, Integer.MAX_VALUE));
         return var2 + "/" + var3 + " ms";
      } else {
         return var0 + "/" + var1 + " fps";
      }
   }

   public static boolean rX() {
      return else_.Pr;
   }

   public static int rH() {
      return else_.PG;
   }

   public static boolean rZ() {
      return this_;
   }

   public static long rj() {
      return static_;
   }

   public static float rV() {
      return (float)rj() / 1000.0F;
   }

   public static Qw_1 rE() {
      return else_;
   }

   public static boolean rP() {
      return else_.ro == 2;
   }

   public static int rz() {
      return (Integer)QY.break_[9];
   }

   public static boolean rW() {
      return import_;
   }

   public static boolean rI() {
      return !rs() ? false : !rrdZ.e();
   }

   private static void rR() {
      case_("");
      case_(class_());
      case_("Build: " + throws_());
      case_("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
      case_("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      case_("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
      case_("LWJGL: " + GLFW.glfwGetVersionString());
      case_ = GL11.glGetString(7938);
      catch_ = GL11.glGetString(7937);
      private_ = GL11.glGetString(7936);
      case_("OpenGL: " + catch_ + ", version " + case_ + ", " + private_);
      case_("OpenGL Version: " + implements_());
      GLCapabilities var0 = org.lwjgl.opengl.GL.getCapabilities();
      if (!var0.OpenGL12) {
         case_("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
      }

      volatile_ = var0.GL_NV_fog_distance;
      if (!volatile_) {
         case_("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
      }

      final_ = var0.GL_ARB_occlusion_query;
      if (!final_) {
         case_("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
      }

      int var1 = rrzJ_2.case_();
      byte_("Maximum texture size: " + var1 + "x" + var1);
   }

   public static int rN() {
      return long_;
   }

   public static fJ_2 rF() {
      return float_;
   }

   private static rrMm_1 rY() {
      GLCapabilities var0 = org.lwjgl.opengl.GL.getCapabilities();
      if (var0.OpenGL44) {
         return new rrMm_1(4, 4);
      } else if (var0.OpenGL43) {
         return new rrMm_1(4, 3);
      } else if (var0.OpenGL42) {
         return new rrMm_1(4, 2);
      } else if (var0.OpenGL41) {
         return new rrMm_1(4, 1);
      } else if (var0.OpenGL40) {
         return new rrMm_1(4, 0);
      } else if (var0.OpenGL33) {
         return new rrMm_1(3, 3);
      } else if (var0.OpenGL32) {
         return new rrMm_1(3, 2);
      } else if (var0.OpenGL31) {
         return new rrMm_1(3, 1);
      } else if (var0.OpenGL30) {
         return new rrMm_1(3, 0);
      } else if (var0.OpenGL21) {
         return new rrMm_1(2, 1);
      } else if (var0.OpenGL20) {
         return new rrMm_1(2, 0);
      } else if (var0.OpenGL15) {
         return new rrMm_1(1, 5);
      } else if (var0.OpenGL14) {
         return new rrMm_1(1, 4);
      } else if (var0.OpenGL13) {
         return new rrMm_1(1, 3);
      } else if (var0.OpenGL12) {
         return new rrMm_1(1, 2);
      } else {
         return var0.OpenGL11 ? new rrMm_1(1, 1) : new rrMm_1(1, 0);
      }
   }

   public static int rx() {
      return else_ == null ? 10 : else_.break_;
   }

   public static boolean rT() {
      return else_.PE;
   }

   public static boolean rS() {
      return else_.ri == 0 ? try_() : else_.ri == 2;
   }

   private static void rK() {
      long_ = yz_3.break_;
      yz_3.break_ = 0;
   }

   public static boolean Y() {
      return else_.abstract_ > 0;
   }
}
