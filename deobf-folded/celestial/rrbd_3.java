package celestial;

import java.lang.invoke.StringConcatFactory;
import java.util.HashMap;

public class rrbd_3 {
   public static void id_class(Ko_1 var0) {
      var0.id_class("OptiFine Version", rrbb_3.id_class());
      var0.id_class("OptiFine Build", rrbb_3.id_throws());
      if (rrbb_3.rE() != null) {
         var0.id_class("Render Distance Chunks", rrbb_3.rx() + "");
         var0.id_class("Mipmaps", rrbb_3.id_int() + "");
         var0.id_class("Anisotropic Filtering", rrbb_3.y() + "");
         var0.id_class("Antialiasing", rrbb_3.q() + "");
         var0.id_class("Multitexture", rrbb_3.w() + "");
      }

      var0.id_class("Shaders", StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(rrdZ.y()));
      var0.id_class("OpenGlVersion", StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(rrbb_3.id_case));
      var0.id_class("OpenGlRenderer", StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(rrbb_3.id_catch));
      var0.id_class("OpenGlVendor", StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(rrbb_3.id_private));
      var0.id_class("CpuCount", rrbb_3.rG() + "");
   }

   private static String id_class(KY var0) {
      StringBuffer var1 = new StringBuffer();
      var1.append("OptiFineVersion: " + rrbb_3.id_class() + "\n");
      var1.append("Summary: " + id_break(var0) + "\n");
      var1.append("\n");
      var1.append(var0.id_protected());
      var1.append("\n");
      return var1.toString();
   }

   public static void id_class(KY var0, Ko_1 var1) {
      try {
         Throwable var2 = var0.id_break();
         if (var2 == null) {
            return;
         }

         if (var2.getClass().getName().contains(".fml.client.SplashProgress")) {
            return;
         }

         if (var2.getClass() == Throwable.class) {
            return;
         }

         id_class(var1);
         Qw_1 var3 = rrbb_3.rE();
         if (var3 == null) {
            return;
         }

         if (!var3.r) {
            return;
         }

         String var4 = "http://optifine.net/crashReport";
         String var5 = id_class(var0);
         byte[] var6 = var5.getBytes("ASCII");
         rrbk_3 var7 = new rrbk_3();
         HashMap var8 = new HashMap();
         var8.put("OF-Version", rrbb_3.id_class());
         var8.put("OF-Summary", id_break(var0));
         rrJz_1 var9 = new rrJz_1(var4, var8, var6, var7);
         var9.setPriority(10);
         var9.start();
         Thread.sleep(1000L);
      } catch (Exception var10) {
         rrbb_3.id_byte(var10.getClass().getName() + ": " + var10.getMessage());
      }
   }

   private static String id_break(KY var0) {
      Throwable var1 = var0.id_break();
      if (var1 == null) {
         return "Unknown";
      } else {
         StackTraceElement[] var2 = var1.getStackTrace();
         String var3 = "unknown";
         if (var2.length > 0) {
            var3 = var2[0].toString().trim();
         }

         return var1.getClass().getName() + ": " + var1.getMessage() + " (" + var0.id_class() + ") [" + var3 + "]";
      }
   }
}
