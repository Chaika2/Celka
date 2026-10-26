package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIb_1 extends rrwU_2 {
   private static String[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new String[]{
         new String("staff_prefixes"),
         new String("prefix"),
         new String("prefixes"),
         new String("prefixes"),
         new String("prefixes"),
         new String("prefixes"),
         new String("prefixes"),
         new String("prefix")
      };
   }

   public rrIb_1() {
      super("staff_prefixes");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(JsonObject var1) {
      super.class_(var1);
      if (var1.has("prefixes")) {
         JsonObject var2 = var1.getAsJsonObject("prefixes");
         JsonArray var3 = var2.getAsJsonArray("prefixes");
         ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).class_(false);

         for (JsonElement var5 : var3) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get("prefix").getAsString();
            ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).class_(var7, false, false);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1755579648141791437L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -852247296;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, -52, 122, -97, 40, -42, 82, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(JsonObject var1) {
      super.break_(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (String var5 : ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).byte_()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("prefix", var5);
         var3.add(var6);
      }

      var2.add("prefixes", var3);
      var1.add("prefixes", var2);
   }

   private static void throws_() {
      protected_ = new boolean[3];
   }

   private static void protected_() {
      byte_ = new short[3];
   }
}
