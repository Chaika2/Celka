package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIh_1 extends rrwU_2 {
   private static String[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   private static void byte_() {
      break_ = new String[]{
         new String("xray"),
         new String("name"),
         new String("color"),
         new String("xray"),
         new String("xray"),
         new String("xray"),
         new String("xray"),
         new String("xray"),
         new String("name"),
         new String("color")
      };
   }

   public rrIh_1() {
      super("xray");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(JsonObject var1) {
      super.class_(var1);
      if (var1.has("xray")) {
         JsonObject var2 = var1.getAsJsonObject("xray");

         for (JsonElement var5 : var2.getAsJsonArray("xray")) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get("name").getAsString();
            int var8 = var6.get("color").getAsInt();
            ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).class_(new rrqz_3(ri_3.class_(var7), var8), var7, false);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1732752362;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 546868473389293204L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-34, -25, -67, 97, 109, -109, 95, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(JsonObject var1) {
      super.break_(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrqz_3 var5 : ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).break_()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("name", var5.break_());
         var6.addProperty("color", var5.class_());
         var3.add(var6);
      }

      var2.add("xray", var3);
      var1.add("xray", var2);
   }

   private static void throws_() {
      byte_ = new boolean[1];
   }

   private static void protected_() {
      protected_ = new short[2];
   }
}
