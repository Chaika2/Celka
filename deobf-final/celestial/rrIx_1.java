package celestial;

import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIx_1 implements rrwj_3 {
   private static String[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      break_ = new boolean[4];
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, -1, -16, -52, 9, -90, 51, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(JsonObject var1) {
      if (var1.has("modules")) {
         JsonObject var2 = var1.getAsJsonObject("modules");

         for (Module var4 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().g()) {
            String var5 = var4.synchronized_();
            if (var2.has(var5)) {
               JsonObject var6 = var2.getAsJsonObject(var5);
               JsonObject var7 = var6.getAsJsonObject("modulesettings");
               class_(var6, var4);
               rrww_3.class_(var4, var7);
               var4.byte_();
            }
         }
      }

      if (var1.has("Theme")) {
         ((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[0]).break_(var1.get("Theme").getAsString());
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1587434079755953549L;
   }

   private static void class_() {
      class_ = new String[]{
         new String("modulesettings"),
         new String("modules"),
         new String("Theme"),
         new String("modules"),
         new String("modules"),
         new String("modulesettings"),
         new String("Theme"),
         new String("Theme"),
         new String("enabled"),
         new String("key"),
         new String("flag"),
         new String("enabled"),
         new String("enabled"),
         new String("key"),
         new String("key"),
         new String("flag"),
         new String("flag")
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -801956359;
   }

   private static void class_(JsonObject var0, Module var1) {
      if (var0.has("enabled")) {
         boolean var2 = var0.get("enabled").getAsBoolean();

         try {
            if (var2) {
               var1.break_(break_[0]);
            } else if (var1.aJ_()) {
               var1.byte_(break_[1]);
            }
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      if (var0.has("key")) {
         var1.class_(rrfC_2.class_(var0.get("key").getAsInt()), false);
      }

      if (var0.has("flag")) {
         var1.class_(var0.get("flag").getAsBoolean(), false);
      }
   }

   @Override
   public void break_(JsonObject var1) {
      JsonObject var2 = new JsonObject();

      for (Module var4 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().g()) {
         JsonObject var5 = new JsonObject();
         JsonObject var6 = new JsonObject();
         rrww_3.break_(var4, var6);
         break_(var5, var4);
         var5.add("modulesettings", var6);
         var2.add(var4.synchronized_(), var5);
         var4.finally_();
      }

      var1.add("modules", var2);
      var1.addProperty("Theme", ((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[0]).break_().byte_());
   }

   private static void break_(JsonObject var0, Module var1) {
      var0.addProperty("enabled", var1.aJ_());
      var0.addProperty("key", var1.package_().byte_());
      if (var1 instanceof rrnZ_2) {
         var0.addProperty("flag", var1.implements_());
      }
   }

   private static void break_() {
      byte_ = new short[4];
   }
}
