package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIr_1 extends rrwU_2 {
   private static short[] break_;
   private static String[] byte_;

   private static void byte_() {
      byte_ = new String[]{
         new String("autoauth"),
         new String("username"),
         new String("server"),
         new String("password"),
         new String("account"),
         new String("account"),
         new String("account"),
         new String("account"),
         new String("account"),
         new String("username"),
         new String("server"),
         new String("password")
      };
   }

   public rrIr_1() {
      super("autoauth");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 746536143;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3659899809273946340L;
   }

   @Override
   public void class_(JsonObject var1) {
      super.class_(var1);
      if (var1.has("account")) {
         JsonObject var2 = var1.getAsJsonObject("account");

         for (JsonElement var5 : var2.getAsJsonArray("account")) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get("username").getAsString();
            String var8 = var6.get("server").getAsString();
            String var9 = var6.get("password").getAsString();
            ((Set)AutoAuth.break_[0]).add(new rrHc_1(var7, var8, var9));
         }
      }
   }

   @Override
   public void break_(JsonObject var1) {
      super.break_(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrHc_1 var5 : (Set)AutoAuth.break_[0]) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("username", var5.byte_());
         var6.addProperty("server", var5.break_());
         var6.addProperty("password", var5.class_());
         var3.add(var6);
      }

      var2.add("account", var3);
      var1.add("account", var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{127, -124, 120, -117, 48, -65, 60, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void protected_() {
      break_ = new short[2];
   }
}
