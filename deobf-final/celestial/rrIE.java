package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIE extends rrwU_2 {
   private static short[] break_;
   private static String[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      byte_ = new String[]{
         new String("macro"),
         new String("name"),
         new String("content"),
         new String("key"),
         new String("macro"),
         new String("macro"),
         new String("macro"),
         new String("macro"),
         new String("macro"),
         new String("name"),
         new String("content"),
         new String("key")
      };
   }

   public rrIE() {
      super("macro");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 741850230;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8359213979201571034L;
   }

   @Override
   public void class_(JsonObject var1) {
      super.class_(var1);
      if (var1.has("macro")) {
         JsonObject var2 = var1.getAsJsonObject("macro");

         for (JsonElement var5 : var2.getAsJsonArray("macro")) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get("name").getAsString();
            String var8 = var6.get("content").getAsString();
            int var9 = var6.get("key").getAsInt();
            ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).class_(new rrvm_1(var7, var8, rrfC_2.class_(var9)), false);
         }
      }
   }

   @Override
   public void break_(JsonObject var1) {
      super.break_(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrvm_1 var5 : ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).byte_()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("name", var5.byte_());
         var6.addProperty("content", var5.break_());
         var6.addProperty("key", var5.class_().byte_());
         var3.add(var6);
      }

      var2.add("macro", var3);
      var1.add("macro", var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, 34, 66, 82, 63, -103, 21, -55}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      protected_ = new boolean[1];
   }

   private static void protected_() {
      break_ = new short[2];
   }
}
