package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIs_1 extends rrwU_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static String[] id_protected;

   private static void id_byte() {
      id_byte = new boolean[1];
   }

   public rrIs_1() {
      super(id_protected[0]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -364200742167892144L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 862901407;
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has(id_protected[4])) {
         JsonObject var2 = var1.getAsJsonObject(id_protected[5]);

         for (JsonElement var5 : var2.getAsJsonArray(id_protected[6])) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get(id_protected[7]).getAsString();
            ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[1]]).id_class(new rrZk_1(var7), id_byte[0]);
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-45, -89, 97, -37, -112, -125, -69, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrZk_1 var5 : ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[0]]).id_class().values()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty(id_protected[1], var5.id_class());
         var3.add(var6);
      }

      var2.add(id_protected[2], var3);
      var1.add(id_protected[3], var2);
   }

   private static void id_throws() {
      id_break = new short[2];
   }

   private static void id_protected() {
      id_protected = new String[]{
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
