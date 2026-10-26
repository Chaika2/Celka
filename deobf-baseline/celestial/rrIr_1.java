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
   private static short[] id_break;
   private static String[] id_byte;

   private static void id_byte() {
      id_byte = new String[]{
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
      super(id_byte[0]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 746536143;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3659899809273946340L;
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has(id_byte[6])) {
         JsonObject var2 = var1.getAsJsonObject(id_byte[7]);

         for (JsonElement var5 : var2.getAsJsonArray(id_byte[8])) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get(id_byte[9]).getAsString();
            String var8 = var6.get(id_byte[10]).getAsString();
            String var9 = var6.get(id_byte[11]).getAsString();
            ((Set)AutoAuth.id_break[id_break[1]]).add(new rrHc_1(var7, var8, var9));
         }
      }
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrHc_1 var5 : (Set)AutoAuth.id_break[id_break[0]]) {
         JsonObject var6 = new JsonObject();
         var6.addProperty(id_byte[1], var5.id_byte());
         var6.addProperty(id_byte[2], var5.id_break());
         var6.addProperty(id_byte[3], var5.id_class());
         var3.add(var6);
      }

      var2.add(id_byte[4], var3);
      var1.add(id_byte[5], var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{127, -124, 120, -117, 48, -65, 60, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_protected() {
      id_break = new short[2];
   }
}
