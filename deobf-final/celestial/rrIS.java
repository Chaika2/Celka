package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIS extends rrwU_2 {
   private static short[] break_;
   private static boolean[] byte_;
   private static String[] protected_;

   private static void byte_() {
      byte_ = new boolean[4];
   }

   public rrIS() {
      super("duel_blacklist");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3023292031813843247L;
   }

   @Override
   public void class_(JsonObject var1) {
      super.class_(var1);
      if (var1.has("names")) {
         JsonObject var2 = var1.getAsJsonObject("names");
         JsonArray var3 = var2.getAsJsonArray("names");
         ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).class_(false);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            JsonObject var5 = var3.get(var4).getAsJsonObject();
            String var6 = var5.get("name").getAsString();
            String var7 = var5.has("note") ? var5.get("note").getAsString() : null;
            ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).class_(var6, var7, false, false);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1389696346;
   }

   @Override
   public void break_(JsonObject var1) {
      super.break_(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rryk_1 var5 : ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).break_()) {
         String var6 = var5.break_();
         String var7 = var5.class_();
         JsonObject var8 = new JsonObject();
         var8.addProperty("name", var6);
         if (var7 != null) {
            var8.addProperty("note", var7);
         }

         var3.add(var8);
      }

      var2.add("names", var3);
      var1.add("names", var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 19, 110, -59, 28, 70, -103, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      break_ = new short[3];
   }

   private static void protected_() {
      protected_ = new String[]{
         new String("duel_blacklist"),
         new String("name"),
         new String("note"),
         new String("names"),
         new String("names"),
         new String("names"),
         new String("names"),
         new String("names"),
         new String("name"),
         new String("note"),
         new String("note")
      };
   }
}
