package celestial;

import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrId_1 implements rrwj_3 {
   private static String[] class_;
   private static short[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      byte_ = new boolean[]{true, true, false};
   }

   static {
      ntfClinit();
   }

   private static void class_(JsonObject var0, rrtN_2 var1) {
      rrwM_2 var2 = var1.const_();
      if (var2 != null) {
         var0.addProperty("Anchor", var2.break_().name());
         var0.addProperty("OffsetX", var2.class_());
         var0.addProperty("OffsetY", var2.byte_());
      } else {
         var0.addProperty("PositionX", var1.default_());
         var0.addProperty("PositionY", var1.abstract_());
      }

      if (var1 instanceof rrvj_1 var3) {
         var0.addProperty("Pinned", var3.continue_());
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3781157685118974321L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, 24, 73, 75, 62, -102, -10, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      class_ = new String[]{
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
   public void class_(JsonObject var1) {
      if (var1.has("popups")) {
         JsonObject var2 = var1.getAsJsonObject("popups");

         for (rrtN_2 var4 : Arrays.stream(rrtu_3.byte_()).flatMap(var0 -> var0.class_().stream()).toList()) {
            String var5 = var4.synchronized_();
            if (var2.has(var5)) {
               var4.byte_(true);
               JsonObject var6 = var2.getAsJsonObject(var5);
               JsonObject var7 = var6.getAsJsonObject("popupsettings");
               break_(var6, var4);
               rrww_3.class_(var4, var7);
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2141087978;
   }

   private static void break_() {
      break_ = new short[1];
   }

   @Override
   public void break_(JsonObject var1) {
      JsonObject var2 = new JsonObject();

      for (rrtN_2 var4 : Arrays.stream(rrtu_3.byte_()).flatMap(var0 -> var0.class_().stream()).toList()) {
         JsonObject var5 = new JsonObject();
         JsonObject var6 = new JsonObject();
         rrww_3.break_(var4, var6);
         class_(var5, var4);
         var5.add("popupsettings", var6);
         var2.add(var4.synchronized_(), var5);
      }

      var1.add("popups", var2);
   }

   private static void break_(JsonObject var0, rrtN_2 var1) {
      if (var0.has("Anchor") && var0.has("OffsetX") && var0.has("OffsetY")) {
         try {
            rrwE_2 var2 = rrwE_2.valueOf(var0.get(class_[14]).getAsString());
            var1.class_(var2, var0.get(class_[15]).getAsFloat(), var0.get(class_[16]).getAsFloat());
         } catch (IllegalArgumentException var6) {
         }
      } else if (var0.has("PositionX") && var0.has("PositionY")) {
         var1.class_((float)var0.get("PositionX").getAsInt(), (float)var0.get("PositionY").getAsInt());
      }

      if (var1 instanceof rrvj_1 var7) {
         boolean var3 = var0.has("Pinned") && var0.get("Pinned").getAsBoolean() ? true : byte_[2];
         var7.class_(var3);
         if (!var3 && var1.const_() != null) {
            float var4 = var1.default_();
            float var5 = var1.abstract_();
            var1.class_((rrwE_2)rrwE_2.staticFields6648a4467c4f300f966c59969d37f426[0], var4, var5);
         }
      }
   }
}
