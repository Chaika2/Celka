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
   public static final String id_class = "OptiFine";
   public static final String id_break = "1.16.5";
   public static final String id_byte = "HD_U";
   public static final String id_protected = "G8";
   public static final String id_throws = "OptiFine_1.16.5_HD_U_G8";
   private static String id_super = null;
   private static boolean id_this = false;
   public static String id_case = null;
   public static String id_catch = null;
   public static String id_private = null;
   public static String[] id_implements = null;
   public static rrMm_1 id_finally = null;
   public static rrMm_1 id_extends = null;
   public static int id_native = -1;
   public static boolean id_volatile = false;
   public static boolean id_final = false;
   private static Qw_1 id_else = null;
   private static QY id_synchronized = QY.id_instanceof();
   private static boolean id_return = false;
   private static Thread id_public = null;
   private static int id_goto = 0;
   private static int id_while = 0;
   public static boolean id_package = false;
   public static boolean id_int = false;
   private static int id_try = 0;
   private static boolean id_instanceof = false;
   private static boolean id_throw = false;
   public static final Float id_new = 0.1F;
   private static final Logger id_interface = LogManager.getLogger();
   public static final boolean id_continue = System.getProperty("log.detail", "false").equals("true");
   private static String id_char = null;
   private static int id_abstract = 0;
   private static int id_long = 0;
   private static fJ_2 id_float;
   private static long id_void;
   private static long id_static;
   private static boolean id_import = Boolean.getBoolean("frame.time");

   public static boolean id_boolean() {
      return id_else.Ph != 2;
   }

   public static boolean id_char() {
      if (id_else.rc != 0) {
         return id_else.rc == 2;
      } else if (rs() && !rrdZ.sJ.id_catch()) {
         return rrdZ.sJ.id_implements();
      } else {
         return id_try != 0 ? id_try == 2 : id_try();
      }
   }

   private static void id_byte(String var0, int var1) {
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
         id_protected(var7.getClass().getName() + ": " + var7.getMessage());
      }
   }

   public static void id_byte(String var0) {
   }

   public static boolean id_byte(rqO_2 var0) {
      if (var0 == null) {
         return false;
      } else {
         rAC var1 = id_throws(var0);
         return var1 != null;
      }
   }

   public static String id_byte(int var0) {
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

   public static byte[] id_byte(InputStream var0) throws IOException {
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

   public static void id_byte() {
      id_protected();
      id_public = Thread.currentThread();
      id_volatile();
      rrdZ.id_class(QY.id_instanceof());
   }

   public static void id_byte(String var0, String var1) {
      rrJB var2 = new rrJB((vm_3)id_synchronized.id_class[73], var0, var1);
      id_synchronized.id_break(var2);
   }

   public static int id_int() {
      return id_else.id_instanceof;
   }

   public static void id_long() {
      id_try = 0;
      rAL var0 = x();
      if (var0 != null) {
         try {
            InputStream var1 = var0.id_class(new rqO_2("optifine/color.properties")).id_break();
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

            id_byte("Texture pack clouds: " + var3);
            var3 = var3.toLowerCase();
            if (var3.equals("fast")) {
               id_try = 1;
            }

            if (var3.equals("fancy")) {
               id_try = 2;
            }

            if (var3.equals("off")) {
               id_try = 3;
            }
         } catch (Exception var4) {
         }
      }
   }

   public static Ip_1 id_float() {
      return id_synchronized.id_float().id_byte;
   }

   public static boolean id_double() {
      return id_else.Px;
   }

   private rrbb_3() {
   }

   public static boolean B() {
      return id_else.Pz;
   }

   public static boolean C() {
      return id_else.rw == 1;
   }

   public static boolean D() {
      return id_else.rR;
   }

   public static boolean F() {
      return !v() ? false : !rs() || rrdZ.id_new();
   }

   public static boolean I() {
      return id_else.PF;
   }

   public static fY_2 J() {
      return id_synchronized.A();
   }

   public static boolean S() {
      return id_else.PQ;
   }

   public static boolean Z() {
      return id_else.rH;
   }

   public static boolean V() {
      return id_else.PA;
   }

   public static boolean id_this() {
      return !id_case() ? false : id_else.rM == 2;
   }

   public static boolean e() {
      return id_else.rY;
   }

   public static boolean i() {
      return id_else.rD;
   }

   public static boolean b() {
      return id_else.Pm;
   }

   public static rAL x() {
      return id_synchronized.F();
   }

   public static boolean s() {
      return id_else.PN;
   }

   public static boolean c() {
      return id_else.rF != 3;
   }

   public static boolean n() {
      return id_else.ry;
   }

   public static float h() {
      return rs() && rrdZ.st >= 0.0F ? rrdZ.st : (float)id_else.rz;
   }

   public static boolean f() {
      return id_else.rI;
   }

   public static boolean l() {
      return id_else.rw == 0;
   }

   public static rAC[] d() {
      rAt_1 var0 = id_synchronized.id_char();
      Collection var1 = var0.id_throws();
      ArrayList var2 = new ArrayList();

      for (rAp_1 var4 : var1) {
         rAC var5 = var4.id_protected();
         if (var5 != W()) {
            var2.add(var5);
         }
      }

      return var2.toArray(new rAC[var2.size()]);
   }

   public static boolean a() {
      return id_else.ro != 3;
   }

   public static boolean id_interface() {
      return id_else.rZ == 3;
   }

   public static String id_class(List var0) {
      return id_class(var0, ", ");
   }

   public static int[] id_class(int[] var0, int var1) {
      return id_class(var0, new int[]{var1});
   }

   public static void id_class(boolean var0) {
      id_this = var0;
   }

   public static int id_class(String var0, int var1) {
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

   public static String id_class(Object[] var0, String var1) {
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

   public static String id_class(List var0, String var1) {
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

   public static String id_class(Object[] var0) {
      return id_class(var0, ", ");
   }

   public static int[] id_class(Integer[] var0) {
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

   public static String id_class() {
      return "OptiFine_1.16.5_HD_U_G8";
   }

   public static String id_class(boolean[] var0, String var1) {
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

   public static Boolean id_class(String var0, Boolean var1) {
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

   public static String[] id_class(String var0, String var1) {
      StringTokenizer var2 = new StringTokenizer(var0, var1);
      ArrayList var3 = new ArrayList();

      while (var2.hasMoreTokens()) {
         String var4 = var2.nextToken();
         var3.add(var4);
      }

      return var3.toArray(new String[var3.size()]);
   }

   public static void id_class(Ml_1 var0) {
      int var1 = rN();
      int var2 = ((yX_2)id_synchronized.id_class[8]).id_package();
      int var3 = ((yX_2)id_synchronized.id_class[8]).id_int();
      int var4 = ((yX_2)id_synchronized.id_class[8]).id_new();
      String var5 = rk() + ", C: " + var2 + ", E: " + var3 + "+" + var4 + ", U: " + var1;
      ((cm_3)id_synchronized.id_class[15]).id_break(var0, var5, 2.0F, 2.0F, -2039584);
   }

   public static float id_class(String var0, float var1) {
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

   public static boolean id_class(String var0, boolean var1) {
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

   public static void id_class(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         id_break("", var3);
      }
   }

   public static void id_class(Object var0, String var1) throws NullPointerException {
      if (var0 == null) {
         throw new NullPointerException(var1);
      }
   }

   public static boolean id_class(rAC var0, rqO_2 var1) {
      return var0 != null && var1 != null ? var0.id_break(rAI.CLIENT_RESOURCES, var1) : false;
   }

   public static InputStream id_class(rAL var0, rqO_2 var1) throws IOException {
      rAF var2 = var0.id_class(var1);
      return var2 == null ? null : var2.id_break();
   }

   public static void id_class(File var0, String var1) throws IOException {
      FileOutputStream var2 = new FileOutputStream(var0);
      byte[] var3 = var1.getBytes("ASCII");
      var2.write(var3);
      var2.close();
   }

   public static rrMm_1 id_class(String var0, rrMm_1 var1) {
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
         id_break("", var8);
         return var1;
      }
   }

   public static void id_class(fJ_2 var0) {
      id_float = var0;
   }

   public static String id_class(float[] var0, String var1) {
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

   public static String id_class(float[] var0) {
      return id_class(var0, ", ");
   }

   public static String id_class(int[] var0, String var1) {
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

   public static String id_class(int[] var0) {
      return id_class(var0, ", ");
   }

   public static boolean id_class(Boolean var0) {
      return var0 != null && var0;
   }

   public static int[] id_class(int[] var0, int[] var1) {
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

   public static InputStream id_class(rqO_2 var0) throws IOException {
      return id_class(id_synchronized.F(), var0);
   }

   public static Object[] id_class(Object[] var0, Object var1, int var2) {
      ArrayList var3 = new ArrayList<>(Arrays.asList(var0));
      var3.add(var2, var1);
      Object[] var4 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var3.size());
      return var3.toArray(var4);
   }

   public static String[] id_class(File var0) throws IOException {
      FileInputStream var1 = new FileInputStream(var0);
      return id_class(var1);
   }

   public static String[] id_class(InputStream var0) throws IOException {
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

   public static Object[] id_class(Object[] var0, Object var1) {
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

   public static boolean id_class(Object var0, Object var1) {
      if (var0 == var1) {
         return true;
      } else {
         return var0 == null ? false : var0.equals(var1);
      }
   }

   public static Object[] id_class(Object[] var0, Object[] var1) {
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

   public static int id_class(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static int id_class(rfH_2 var0, int var1) {
      int var2 = id_class(var1 + 37);
      var2 = id_class(var2 + var0.b_());
      var2 = id_class(var2 + var0.d_());
      return id_class(var2 + var0.c_());
   }

   public static boolean id_class(Object var0, Object[] var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            Object var3 = var1[var2];
            if (id_class(var0, var3)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean id_class(int var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == var0) {
            return true;
         }
      }

      return false;
   }

   public static int id_class(int var0) {
      var0 = var0 ^ 61 ^ var0 >> 16;
      var0 += var0 << 3;
      var0 ^= var0 >> 4;
      var0 *= 668265261;
      return var0 ^ var0 >> 15;
   }

   public static void id_class(Qw_1 var0) {
      if (id_else == null) {
         id_else = var0;
         rb();
         id_goto = id_else.rQ;
      }
   }

   public static String id_class(InputStream var0, String var1) throws IOException {
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

   public static float id_class(float var0) {
      if (var0 < 0.0F) {
         return 0.0F;
      } else {
         return var0 > 1.0F ? 1.0F : var0;
      }
   }

   public static Object[] id_class(Collection var0, Class var1) {
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

   public static boolean id_class(URI var0) {
      rqR_2.id_class((Exception)null);
      rqR_2.id_implements().id_class(var0);
      Exception var1 = rqR_2.id_native();
      return var1 == null;
   }

   public static InputStream id_class(String var0) {
      return rrbb_3.class.getResourceAsStream(var0);
   }

   public static void id_class(String var0, Throwable var1) {
      id_interface.warn("[OptiFine] " + var0, var1);
   }

   public static long id_class(long var0, long var2, long var4) {
      if (var0 < var2) {
         return var2;
      } else {
         return var0 > var4 ? var4 : var0;
      }
   }

   public static double id_class(double var0, double var2, double var4) {
      if (var0 < var2) {
         return var2;
      } else {
         return var0 > var4 ? var4 : var0;
      }
   }

   public static float id_class(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static boolean rd() {
      return id_else.rK;
   }

   public static boolean m() {
      return id_else.rl;
   }

   public static int o() {
      return id_else.id_abstract;
   }

   public static boolean p() {
      return y() > 1;
   }

   public static String k() {
      if (id_synchronized.F() == null) {
         return "";
      } else {
         rAC[] var0 = d();
         if (var0.length <= 0) {
            return W().id_class();
         } else {
            String[] var1 = new String[var0.length];

            for (int var2 = 0; var2 < var0.length; var2++) {
               var1[var2] = var0[var2].id_class();
            }

            return id_class(var1);
         }
      }
   }

   public static boolean id_default() {
      return id_else.PO != 2;
   }

   public static void rb() {
      id_while = Runtime.getRuntime().availableProcessors();
   }

   public static boolean t() {
      return rE().rQ > 0;
   }

   public static boolean g() {
      return id_else.rf;
   }

   public static boolean v() {
      return id_else.rp;
   }

   public static boolean j() {
      return id_else.PL;
   }

   public static int q() {
      return id_goto;
   }

   public static boolean U() {
      return id_else.rV;
   }

   public static boolean id_short() {
      return id_else.rv == 0 ? id_try() : id_else.rv == 2;
   }

   public static yX_2 z() {
      return (yX_2)id_synchronized.id_class[8];
   }

   public static void rf() {
      long var0 = System.currentTimeMillis();
      long var2 = var0 - id_void;
      id_void = var0;
      var2 = id_class(var2, 1L, 1000L);
      id_static = (id_static + var2) / 2L;
      id_static = id_class(id_static, 1L, 1000L);
      if ((String)id_synchronized.id_class[79] != id_char) {
         id_char = (String)id_synchronized.id_class[79];
         rc();
         rK();
      }
   }

   public static boolean id_void() {
      return id_else.rm == 0 ? id_try() : id_else.rm != 1;
   }

   public static boolean w() {
      return y() > 1 ? true : q() > 0;
   }

   public static boolean rv() {
      return false;
   }

   public static boolean u() {
      return id_else.rF == 2;
   }

   public static boolean r() {
      return id_else.Pk;
   }

   public static boolean rn() {
      if (!rL()) {
         return false;
      } else {
         return rs() ? rrdZ.id_finally() : true;
      }
   }

   public static int y() {
      return id_else.rN;
   }

   public static Hh_1 N() {
      return (Hh_1)id_synchronized.id_class[16];
   }

   public static boolean rh() {
      return id_else.rd;
   }

   public static void id_break(String var0) {
      if (id_continue) {
         id_interface.info("[OptiFine] " + var0);
      }
   }

   public static boolean id_break(double var0, double var2, double var4) {
      return var0 >= var2 && var0 <= var4;
   }

   public static boolean id_break(Object var0, Object[] var1) {
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

   public static boolean id_break(int var0, int var1, int var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static Object[] id_break(Object[] var0, Object var1) {
      ArrayList var2 = new ArrayList<>(Arrays.asList(var0));
      var2.remove(var1);
      return id_class(var2, var0.getClass().getComponentType());
   }

   public static String id_break(InputStream var0) throws IOException {
      return id_class(var0, "ASCII");
   }

   public static int id_break(String var0, int var1) {
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

   public static String id_break(File var0) throws IOException {
      FileInputStream var1 = new FileInputStream(var0);
      return id_class((InputStream)var1, "ASCII");
   }

   public static boolean id_break(rAL var0, rqO_2 var1) {
      try {
         rAF var2 = var0.id_class(var1);
         return var2 != null;
      } catch (IOException var3) {
         return false;
      }
   }

   public static int id_break(String var0, String var1) {
      String[] var2 = id_implements(var0);
      String[] var3 = id_implements(var1);
      String var4 = var2[0];
      String var5 = var3[0];
      if (!var4.equals(var5)) {
         return var4.compareTo(var5);
      } else {
         int var6 = id_class(var2[1], -1);
         int var7 = id_class(var3[1], -1);
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

   public static boolean id_break(float var0, float var1, float var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static void id_break(String var0, Throwable var1) {
      id_interface.error("[OptiFine] " + var0, var1);
   }

   public static rAF id_break(rqO_2 var0) throws IOException {
      return id_synchronized.F().id_class(var0);
   }

   public static IntBuffer id_break(int var0) {
      return Hb_1.id_class(var0 << 2).asIntBuffer();
   }

   public static String id_break() {
      StringBuffer var0 = new StringBuffer(32);
      if (rL()) {
         var0.append("DL: ");
         var0.append(String.valueOf(rrbg_3.id_break()));
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

   public static void id_throws(String var0) {
      id_interface.error("[OptiFine] " + var0);
   }

   public static rAC id_throws(rqO_2 var0) {
      rAt_1 var1 = id_synchronized.id_char();
      Collection var2 = var1.id_throws();
      List var3 = (List)var2;

      for (int var4 = var3.size() - 1; var4 >= 0; var4--) {
         rAp_1 var5 = (rAp_1)var3.get(var4);
         rAC var6 = var5.id_protected();
         if (var6.id_break(rAI.CLIENT_RESOURCES, var0)) {
            return var6;
         }
      }

      return null;
   }

   public static String id_throws() {
      if (id_super == null) {
         try {
            InputStream var0 = id_class("/buildof.txt");
            if (var0 == null) {
               return null;
            }

            id_super = id_class(var0)[0];
         } catch (Exception var1) {
            id_protected(var1.getClass().getName() + ": " + var1.getMessage());
            id_super = "";
         }
      }

      return id_super;
   }

   public static boolean L() {
      return !v() ? false : !rs() || rrdZ.id_continue();
   }

   public static boolean rt() {
      return id_synchronized.id_this() == null ? false : id_synchronized.id_switch();
   }

   public static boolean M() {
      return id_else.PZ;
   }

   public static rAY W() {
      return id_synchronized.Z().id_class();
   }

   public static boolean H() {
      return id_else.rw == 2;
   }

   public static boolean R() {
      return id_else.rj;
   }

   public static boolean P() {
      return id_else.PW;
   }

   public static rrMm_1 id_finally() {
      if (id_finally == null) {
         String var0 = GL11.glGetString(7938);
         id_finally = id_class(var0, (rrMm_1)null);
         if (id_finally == null) {
            id_finally = rY();
         }

         if (id_finally == null) {
            id_finally = new rrMm_1(1, 0);
         }
      }

      return id_finally;
   }

   public static void id_catch(String var0) {
      int var1 = MT.id_switch();
      if (var1 != 0 && rrbo_3.id_class(var1)) {
         String var2 = id_byte(var1);
         String var3 = String.format("OpenGL error: %s (%s), at: %s", var1, var2, var0);
         id_throws(var3);
         if (rT() && rrzQ_2.id_class("ShowGlError", 10000L)) {
            String var4 = jI_2.id_class("of.message.openglError", var1, var2);
            ((cq_3)id_synchronized.id_class[19]).id_throws().id_class(new rgN_2(var4));
         }
      }
   }

   public static boolean id_catch() {
      return id_final;
   }

   public static boolean G() {
      return id_else.Pu;
   }

   public static boolean O() {
      return id_else.Pv;
   }

   public static rrMm_1 id_extends() {
      if (id_extends == null) {
         String var0 = GL11.glGetString(35724);
         id_extends = id_class(var0, (rrMm_1)null);
         if (id_extends == null) {
            id_extends = new rrMm_1(1, 10);
         }
      }

      return id_extends;
   }

   public static int id_goto() {
      return id_else.rT;
   }

   public static boolean K() {
      return id_else.rg;
   }

   public static boolean id_case() {
      return id_volatile;
   }

   public static void id_case(String var0) {
   }

   public static boolean id_const() {
      return id_else.PO == 1;
   }

   public static boolean id_continue() {
      float var0 = id_super();
      return var0 > id_new + 1.0E-5F;
   }

   public static boolean id_else() {
      return id_else.rM == 1;
   }

   public static boolean id_for() {
      return id_else.PX;
   }

   public static String id_implements() {
      rrMm_1 var0 = id_finally();
      return var0.id_class() + "." + var0.id_break() + "." + var0.id_byte();
   }

   private static String[] id_implements(String var0) {
      if (var0 != null && var0.length() > 0) {
         Pattern var1 = Pattern.compile("([A-Z])([0-9]+)(.*)");
         Matcher var2 = var1.matcher(var0);
         if (!var2.matches()) {
            return new String[]{"", "", ""};
         } else {
            String var3 = id_private(var2.group(1));
            String var4 = id_private(var2.group(2));
            String var5 = id_private(var2.group(3));
            return new String[]{var3, var4, var5};
         }
      } else {
         return new String[]{"", "", ""};
      }
   }

   public static boolean id_import() {
      return id_else.rm == 0 ? !id_try() : id_else.rm == 4;
   }

   public static boolean id_instanceof() {
      return id_else.id_case == VW.FABULOUS;
   }

   public static int id_new() {
      switch (id_else.rh) {
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

   public static boolean id_package() {
      return id_else.id_instanceof > 0;
   }

   public static boolean id_return() {
      return id_else.rM != 3;
   }

   public static float id_super() {
      return id_new;
   }

   public static boolean id_switch() {
      return id_else.Pd;
   }

   public static boolean id_throw() {
      return id_else.rZ == 0 ? id_try() : id_else.rZ == 2;
   }

   public static boolean id_try() {
      return id_else.id_case != VW.FAST;
   }

   public static boolean id_while() {
      return id_else.rt;
   }

   public static boolean rs() {
      return rrdZ.sr;
   }

   public static boolean id_static() {
      return id_else.rm == 4;
   }

   public static float id_public() {
      return id_else.rO;
   }

   public static boolean id_protected(rqO_2 var0) {
      return id_throws(var0) == W();
   }

   private static ByteBuffer id_protected(InputStream var0) throws IOException {
      BufferedImage var1 = ImageIO.read(var0);
      int[] var2 = var1.getRGB(0, 0, var1.getWidth(), var1.getHeight(), (int[])null, 0, var1.getWidth());
      ByteBuffer var3 = ByteBuffer.allocate(4 * var2.length);

      for (int var7 : var2) {
         var3.putInt(var7 << 8 | var7 >> 24 & 0xFF);
      }

      ((Buffer)var3).flip();
      return var3;
   }

   public static void id_protected() {
      if (!id_return && QY.id_instanceof().id_else() != null) {
         id_return = true;
         rR();
      }
   }

   public static void id_protected(String var0) {
      id_interface.warn("[OptiFine] " + var0);
   }

   public static boolean id_protected(int var0) {
      return GLFW.glfwGetKey(id_synchronized.id_else().id_implements(), var0) == 1;
   }

   public static String id_private(String var0) {
      return var0 == null ? "" : var0;
   }

   public static int id_private() {
      if (id_native < 0) {
         String[] var0 = id_class("1.16.5", ".");
         int var1 = 0;
         if (var0.length > 0) {
            var1 += 10000 * id_class(var0[0], 0);
         }

         if (var0.length > 1) {
            var1 += 100 * id_class(var0[1], 0);
         }

         if (var0.length > 2) {
            var1 += 1 * id_class(var0[2], 0);
         }

         id_native = var1;
      }

      return id_native;
   }

   public static boolean id_abstract() {
      if (id_else.rc != 0) {
         return id_else.rc == 3;
      } else if (rs() && !rrdZ.sJ.id_catch()) {
         return rrdZ.sJ.id_finally();
      } else {
         return id_try != 0 ? id_try == 3 : false;
      }
   }

   public static boolean id_final() {
      return Thread.currentThread() == id_public;
   }

   public static boolean id_transient() {
      return id_else.Ph == 1;
   }

   public static void id_volatile() {
      rb();
      byte var0 = 8;
      if (rM()) {
         if (rO()) {
            id_public.setPriority(10);
            id_byte("Server thread", 1);
         } else {
            id_public.setPriority(5);
            id_byte("Server thread", 5);
         }
      } else {
         id_public.setPriority(10);
         id_byte("Server thread", 5);
      }
   }

   public static boolean id_synchronized() {
      return id_else.rM == 3 || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_();
   }

   public static String[] id_native() {
      if (id_implements == null) {
         id_implements = ro();
      }

      return id_implements;
   }

   public static boolean id_strictfp() {
      return id_else.PJ;
   }

   public static boolean E() {
      return id_else.Pc;
   }

   public static boolean rp() {
      return GLX.useVbo();
   }

   public static boolean rl() {
      return id_else.Ps;
   }

   public static boolean A() {
      if (rs() && !rrdZ.id_super()) {
         return false;
      } else {
         return id_else.rq == 0 ? id_try() : id_else.rq == 2;
      }
   }

   public static boolean rw() {
      if ((cT_2)id_synchronized.id_class[75] == null) {
         return false;
      } else {
         if ((cT_2)id_synchronized.id_class[75] instanceof cj_3 var0 && var0.id_throws()) {
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
      return id_synchronized;
   }

   private static String[] ro() {
      try {
         rrMm_1 var0 = id_finally();
         if (var0.id_class() >= 3) {
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
         id_break("", var5);
      }

      try {
         String var6 = GL11.glGetString(7939);
         return var6.split(" ");
      } catch (Exception var4) {
         id_break("", var4);
         return new String[0];
      }
   }

   public static yX_2 Q() {
      return (yX_2)id_synchronized.id_class[8];
   }

   public static boolean rr() {
      return id_else.rU;
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
      return id_else.rJ;
   }

   public static void rc() {
      rpN_2 var0 = id_synchronized.k();
      long[] var1 = var0.id_byte();
      int var2 = var0.id_break();
      int var3 = var0.id_class();
      if (var2 != var3) {
         int var4 = (Integer)QY.id_break[9];
         if (var4 <= 0) {
            var4 = 1;
         }

         long var5 = (long)(1.0 / (double)var4 * 1.0E9);
         long var7 = var5;
         long var9 = 0L;

         for (int var11 = rfU_2.id_break(var2 - 1, var1.length); var11 != var3 && (double)var9 < 1.0E9; var11 = rfU_2.id_break(var11 - 1, var1.length)) {
            long var12 = var1[var11];
            if (var12 > var7) {
               var7 = var12;
            }

            var9 += var12;
         }

         double var14 = (double)var7 / 1.0E9;
         id_abstract = (int)(1.0 / var14);
      }
   }

   public static boolean ry() {
      return w() ? false : id_else.rk && MT.id_protected;
   }

   public static boolean rO() {
      return id_else.rx;
   }

   public static int rQ() {
      return id_abstract;
   }

   public static boolean rJ() {
      return id_else.PP;
   }

   public static boolean rA() {
      return id_else.PB == 1;
   }

   public static boolean rM() {
      return rG() <= 1;
   }

   public static boolean rC() {
      return id_else.PS;
   }

   public static boolean rB() {
      return id_else.ra;
   }

   public static int rG() {
      return id_while;
   }

   public static boolean rL() {
      return id_else.PB != 3;
   }

   public static String rk() {
      int var0 = rz();
      int var1 = rQ();
      if (id_import) {
         String var2 = String.format("%.1f", 1000.0 / (double)id_class(var0, 1, Integer.MAX_VALUE));
         String var3 = String.format("%.1f", 1000.0 / (double)id_class(var1, 1, Integer.MAX_VALUE));
         return var2 + "/" + var3 + " ms";
      } else {
         return var0 + "/" + var1 + " fps";
      }
   }

   public static boolean rX() {
      return id_else.Pr;
   }

   public static int rH() {
      return id_else.PG;
   }

   public static boolean rZ() {
      return id_this;
   }

   public static long rj() {
      return id_static;
   }

   public static float rV() {
      return (float)rj() / 1000.0F;
   }

   public static Qw_1 rE() {
      return id_else;
   }

   public static boolean rP() {
      return id_else.ro == 2;
   }

   public static int rz() {
      return (Integer)QY.id_break[9];
   }

   public static boolean rW() {
      return id_import;
   }

   public static boolean rI() {
      return !rs() ? false : !rrdZ.e();
   }

   private static void rR() {
      id_case("");
      id_case(id_class());
      id_case("Build: " + id_throws());
      id_case("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
      id_case("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      id_case("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
      id_case("LWJGL: " + GLFW.glfwGetVersionString());
      id_case = GL11.glGetString(7938);
      id_catch = GL11.glGetString(7937);
      id_private = GL11.glGetString(7936);
      id_case("OpenGL: " + id_catch + ", version " + id_case + ", " + id_private);
      id_case("OpenGL Version: " + id_implements());
      GLCapabilities var0 = org.lwjgl.opengl.GL.getCapabilities();
      if (!var0.OpenGL12) {
         id_case("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
      }

      id_volatile = var0.GL_NV_fog_distance;
      if (!id_volatile) {
         id_case("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
      }

      id_final = var0.GL_ARB_occlusion_query;
      if (!id_final) {
         id_case("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
      }

      int var1 = rrzJ_2.id_case();
      id_byte("Maximum texture size: " + var1 + "x" + var1);
   }

   public static int rN() {
      return id_long;
   }

   public static fJ_2 rF() {
      return id_float;
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
      return id_else == null ? 10 : id_else.id_break;
   }

   public static boolean rT() {
      return id_else.PE;
   }

   public static boolean rS() {
      return id_else.ri == 0 ? id_try() : id_else.ri == 2;
   }

   private static void rK() {
      id_long = yz_3.id_break;
      yz_3.id_break = 0;
   }

   public static boolean Y() {
      return id_else.id_abstract > 0;
   }
}
