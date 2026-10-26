package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIs_1 extends rrwU_2 {
   private static short[] break_;
   private static boolean[] byte_;
   private static String[] protected_;

   private static void byte_() {
      byte_ = new boolean[1];
   }

   public rrIs_1() {
      super("friend");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -364200742167892144L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 862901407;
   }

   @Override
   public void class_(JsonObject var1) {
      super.class_(var1);
      if (var1.has("friend")) {
         JsonObject var2 = var1.getAsJsonObject("friend");

         for (JsonElement var5 : var2.getAsJsonArray("friend")) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get("name").getAsString();
            ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(new rrZk_1(var7), false);
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-45, -89, 97, -37, -112, -125, -69, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(JsonObject var1) {
      super.break_(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrZk_1 var5 : ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_().values()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("name", var5.class_());
         var3.add(var6);
      }

      var2.add("friend", var3);
      var1.add("friend", var2);
   }

   private static void throws_() {
      break_ = new short[2];
   }

   private static void protected_() {
      protected_ = new String[]{
         new String("friend"),
         new String("name"),
         new String("friend"),
         new String("friend"),
         new String("friend"),
         new String("friend"),
         new String("friend"),
         new String("name")
      };
   }
}
