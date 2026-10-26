package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIG extends rrwU_2 {
   private static boolean[] break_;
   private static String[] byte_;
   private static short[] protected_;

   private static void byte_() {
      protected_ = new short[3];
   }

   public rrIG() {
      super("staff");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -646138824;
   }

   @Override
   public void class_(JsonObject var1) {
      super.class_(var1);
      if (var1.has("staff")) {
         JsonObject var2 = var1.getAsJsonObject("staff");
         JsonArray var3 = var2.getAsJsonArray("staff");
         ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).class_(false);

         for (JsonElement var5 : var3) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get("name").getAsString();
            ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).class_(var7, false, false);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7419280561900966434L;
   }

   @Override
   public void break_(JsonObject var1) {
      super.break_(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (String var5 : ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).byte_()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("name", var5);
         var3.add(var6);
      }

      var2.add("staff", var3);
      var1.add("staff", var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{78, -10, 96, 66, -85, -30, 126, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      break_ = new boolean[3];
   }

   private static void protected_() {
      byte_ = new String[]{
         new String("staff"),
         new String("name"),
         new String("staff"),
         new String("staff"),
         new String("staff"),
         new String("staff"),
         new String("staff"),
         new String("name")
      };
   }
}
