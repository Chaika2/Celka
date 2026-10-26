package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIE extends rrwU_2 {
   private static short[] id_break;
   private static String[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_byte = new String[]{
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

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 741850230;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8359213979201571034L;
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has("macro")) {
         JsonObject var2 = var1.getAsJsonObject("macro");

         for (JsonElement var5 : var2.getAsJsonArray("macro")) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get("name").getAsString();
            String var8 = var6.get("content").getAsString();
            int var9 = var6.get("key").getAsInt();
            ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).id_class(new rrvm_1(var7, var8, rrfC_2.id_class(var9)), false);
         }
      }
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrvm_1 var5 : ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).id_byte()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("name", var5.id_byte());
         var6.addProperty("content", var5.id_break());
         var6.addProperty("key", var5.id_class().id_byte());
         var3.add(var6);
      }

      var2.add("macro", var3);
      var1.add("macro", var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, 34, 66, 82, 63, -103, 21, -55}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_protected = new boolean[1];
   }

   private static void id_protected() {
      id_break = new short[2];
   }
}
