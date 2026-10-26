package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIb_1 extends rrwU_2 {
   private static String[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new String[]{
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
      super(id_break[0]);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has(id_break[4])) {
         JsonObject var2 = var1.getAsJsonObject(id_break[5]);
         JsonArray var3 = var2.getAsJsonArray(id_break[6]);
         ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_byte[1]]).id_class(id_protected[0]);

         for (JsonElement var5 : var3) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get(id_break[7]).getAsString();
            ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_byte[2]]).id_class(var7, id_protected[1], id_protected[2]);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1755579648141791437L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -852247296;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, -52, 122, -97, 40, -42, 82, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (String var5 : ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_byte[0]]).id_byte()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty(id_break[1], var5);
         var3.add(var6);
      }

      var2.add(id_break[2], var3);
      var1.add(id_break[3], var2);
   }

   private static void id_throws() {
      id_protected = new boolean[3];
   }

   private static void id_protected() {
      id_byte = new short[3];
   }
}
