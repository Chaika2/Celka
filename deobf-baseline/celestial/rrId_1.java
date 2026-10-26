package celestial;

import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrId_1 implements rrwj_3 {
   private static String[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_byte = new boolean[]{true, true, false};
   }

   static {
      ntfClinit();
   }

   private static void id_class(JsonObject var0, rrtN_2 var1) {
      rrwM_2 var2 = var1.id_const();
      if (var2 != null) {
         var0.addProperty(id_class[5], var2.id_break().name());
         var0.addProperty(id_class[6], var2.id_class());
         var0.addProperty(id_class[7], var2.id_byte());
      } else {
         var0.addProperty(id_class[8], var1.id_default());
         var0.addProperty(id_class[9], var1.id_abstract());
      }

      if (var1 instanceof rrvj_1 var3) {
         var0.addProperty(id_class[10], var3.id_continue());
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3781157685118974321L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, 24, 73, 75, 62, -102, -10, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_class = new String[]{
         new String("popupsettings"),
         new String("popups"),
         new String("popups"),
         new String("popups"),
         new String("popupsettings"),
         new String("Anchor"),
         new String("OffsetX"),
         new String("OffsetY"),
         new String("PositionX"),
         new String("PositionY"),
         new String("Pinned"),
         new String("Anchor"),
         new String("OffsetX"),
         new String("OffsetY"),
         new String("Anchor"),
         new String("OffsetX"),
         new String("OffsetY"),
         new String("PositionX"),
         new String("PositionY"),
         new String("PositionX"),
         new String("PositionY"),
         new String("Pinned"),
         new String("Pinned")
      };
   }

   @Override
   public void id_class(JsonObject var1) {
      if (var1.has(id_class[2])) {
         JsonObject var2 = var1.getAsJsonObject(id_class[3]);

         for (rrtN_2 var4 : Arrays.stream(rrtu_3.id_byte()).flatMap(var0 -> var0.id_class().stream()).toList()) {
            String var5 = var4.id_synchronized();
            if (var2.has(var5)) {
               var4.id_byte(id_byte[0]);
               JsonObject var6 = var2.getAsJsonObject(var5);
               JsonObject var7 = var6.getAsJsonObject(id_class[4]);
               id_break(var6, var4);
               rrww_3.id_class(var4, var7);
            }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2141087978;
   }

   private static void id_break() {
      id_break = new short[1];
   }

   @Override
   public void id_break(JsonObject var1) {
      JsonObject var2 = new JsonObject();

      for (rrtN_2 var4 : Arrays.stream(rrtu_3.id_byte()).flatMap(var0 -> var0.id_class().stream()).toList()) {
         JsonObject var5 = new JsonObject();
         JsonObject var6 = new JsonObject();
         rrww_3.id_break(var4, var6);
         id_class(var5, var4);
         var5.add(id_class[0], var6);
         var2.add(var4.id_synchronized(), var5);
      }

      var1.add(id_class[1], var2);
   }

   private static void id_break(JsonObject var0, rrtN_2 var1) {
      if (var0.has(id_class[11]) && var0.has(id_class[12]) && var0.has(id_class[13])) {
         try {
            rrwE_2 var2 = rrwE_2.valueOf(var0.get(id_class[14]).getAsString());
            var1.id_class(var2, var0.get(id_class[15]).getAsFloat(), var0.get(id_class[16]).getAsFloat());
         } catch (IllegalArgumentException var6) {
         }
      } else if (var0.has(id_class[17]) && var0.has(id_class[18])) {
         var1.id_class((float)var0.get(id_class[19]).getAsInt(), (float)var0.get(id_class[20]).getAsInt());
      }

      if (var1 instanceof rrvj_1 var7) {
         boolean var3 = var0.has(id_class[21]) && var0.get(id_class[22]).getAsBoolean() ? id_byte[1] : id_byte[2];
         var7.id_class(var3);
         if (!var3 && var1.id_const() != null) {
            float var4 = var1.id_default();
            float var5 = var1.id_abstract();
            var1.id_class((rrwE_2)rrwE_2.staticFields6648a4467c4f300f966c59969d37f426[id_break[0]], var4, var5);
         }
      }
   }
}
