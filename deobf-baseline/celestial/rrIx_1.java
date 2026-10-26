package celestial;

import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIx_1 implements rrwj_3 {
   private static String[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_break = new boolean[4];
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, -1, -16, -52, 9, -90, 51, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(JsonObject var1) {
      if (var1.has(id_class[3])) {
         JsonObject var2 = var1.getAsJsonObject(id_class[4]);

         for (Module var4 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[2]]).id_private().g()) {
            String var5 = var4.id_synchronized();
            if (var2.has(var5)) {
               JsonObject var6 = var2.getAsJsonObject(var5);
               JsonObject var7 = var6.getAsJsonObject(id_class[5]);
               id_class(var6, var4);
               rrww_3.id_class(var4, var7);
               var4.id_byte();
            }
         }
      }

      if (var1.has(id_class[6])) {
         ((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[id_byte[3]]).id_break(var1.get(id_class[7]).getAsString());
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1587434079755953549L;
   }

   private static void id_class() {
      id_class = new String[]{
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

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -801956359;
   }

   private static void id_class(JsonObject var0, Module var1) {
      if (var0.has(id_class[11])) {
         boolean var2 = var0.get(id_class[12]).getAsBoolean();

         try {
            if (var2) {
               var1.id_break(id_break[0]);
            } else if (var1.aJ_()) {
               var1.id_byte(id_break[1]);
            }
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      if (var0.has(id_class[13])) {
         var1.id_class(rrfC_2.id_class(var0.get(id_class[14]).getAsInt()), id_break[2]);
      }

      if (var0.has(id_class[15])) {
         var1.id_class(var0.get(id_class[16]).getAsBoolean(), id_break[3]);
      }
   }

   @Override
   public void id_break(JsonObject var1) {
      JsonObject var2 = new JsonObject();

      for (Module var4 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[0]]).id_private().g()) {
         JsonObject var5 = new JsonObject();
         JsonObject var6 = new JsonObject();
         rrww_3.id_break(var4, var6);
         id_break(var5, var4);
         var5.add(id_class[0], var6);
         var2.add(var4.id_synchronized(), var5);
         var4.id_finally();
      }

      var1.add(id_class[1], var2);
      var1.addProperty(id_class[2], ((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[id_byte[1]]).id_break().id_byte());
   }

   private static void id_break(JsonObject var0, Module var1) {
      var0.addProperty(id_class[8], var1.aJ_());
      var0.addProperty(id_class[9], var1.id_package().id_byte());
      if (var1 instanceof rrnZ_2) {
         var0.addProperty(id_class[10], var1.id_implements());
      }
   }

   private static void id_break() {
      id_byte = new short[4];
   }
}
