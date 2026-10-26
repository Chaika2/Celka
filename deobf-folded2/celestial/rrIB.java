package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIB extends rrwU_2 {
   private static boolean[] id_break;
   private static short[] id_byte;
   private static String[] id_protected;

   private static void id_byte() {
      id_protected = new String[]{
         new String("blockesp"),
         new String("name"),
         new String("color"),
         new String("blockesp"),
         new String("blockesp"),
         new String("blockesp"),
         new String("blockesp"),
         new String("blockesp"),
         new String("name"),
         new String("color")
      };
   }

   public rrIB() {
      super("blockesp");
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1179521904;
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has("blockesp")) {
         JsonObject var2 = var1.getAsJsonObject("blockesp");

         for (JsonElement var5 : var2.getAsJsonArray("blockesp")) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get("name").getAsString();
            int var8 = var6.get("color").getAsInt();
            ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).id_class(new rrqU_2(ri_3.id_class(var7), var8), var7, false);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -924351366392278542L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, -31, -69, 38, -56, -27, -121, 101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrqU_2 var5 : ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).id_byte()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("name", var5.id_byte());
         var6.addProperty("color", var5.id_class());
         var3.add(var6);
      }

      var2.add("blockesp", var3);
      var1.add("blockesp", var2);
   }

   private static void id_throws() {
      id_byte = new short[2];
   }

   private static void id_protected() {
      id_break = new boolean[1];
   }
}
