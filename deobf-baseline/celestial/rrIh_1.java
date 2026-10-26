package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIh_1 extends rrwU_2 {
   private static String[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_break = new String[]{
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
      super(id_break[0]);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has(id_break[5])) {
         JsonObject var2 = var1.getAsJsonObject(id_break[6]);

         for (JsonElement var5 : var2.getAsJsonArray(id_break[7])) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get(id_break[8]).getAsString();
            int var8 = var6.get(id_break[9]).getAsInt();
            ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_protected[1]]).id_class(new rrqz_3(ri_3.id_class(var7), var8), var7, id_byte[0]);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1732752362;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 546868473389293204L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-34, -25, -67, 97, 109, -109, 95, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrqz_3 var5 : ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_protected[0]]).id_break()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty(id_break[1], var5.id_break());
         var6.addProperty(id_break[2], var5.id_class());
         var3.add(var6);
      }

      var2.add(id_break[3], var3);
      var1.add(id_break[4], var2);
   }

   private static void id_throws() {
      id_byte = new boolean[1];
   }

   private static void id_protected() {
      id_protected = new short[2];
   }
}
