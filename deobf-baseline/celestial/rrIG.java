package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIG extends rrwU_2 {
   private static boolean[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_protected = new short[3];
   }

   public rrIG() {
      super(id_byte[0]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -646138824;
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has(id_byte[4])) {
         JsonObject var2 = var1.getAsJsonObject(id_byte[5]);
         JsonArray var3 = var2.getAsJsonArray(id_byte[6]);
         ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_protected[1]]).id_class(id_break[0]);

         for (JsonElement var5 : var3) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get(id_byte[7]).getAsString();
            ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_protected[2]]).id_class(var7, id_break[1], id_break[2]);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7419280561900966434L;
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (String var5 : ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_protected[0]]).id_byte()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty(id_byte[1], var5);
         var3.add(var6);
      }

      var2.add(id_byte[2], var3);
      var1.add(id_byte[3], var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{78, -10, 96, 66, -85, -30, 126, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_break = new boolean[3];
   }

   private static void id_protected() {
      id_byte = new String[]{
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
