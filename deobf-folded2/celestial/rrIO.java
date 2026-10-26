package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIO extends rrwU_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static String[] id_protected;

   private static void id_byte() {
      id_break = new short[2];
   }

   public rrIO() {
      super("waypoint");
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 268055275;
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has("waypoint")) {
         JsonObject var2 = var1.getAsJsonObject("waypoint");

         for (JsonElement var5 : var2.getAsJsonArray("waypoint")) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get("name").getAsString();
            double var8 = var6.get("x").getAsDouble();
            double var10 = var6.get("y").getAsDouble();
            double var12 = var6.get("z").getAsDouble();
            String var14 = var6.get("serverIP").getAsString();
            ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_class(new rrjD_2(var7, new rjU_2(var8, var10, var12), var14), false);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6017141407243444013L;
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrjD_2 var5 : ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_byte()) {
         JsonObject var6 = new JsonObject();
         String var7 = var5.id_byte();
         eX_2 var8 = var5.id_break();
         String var9 = var5.id_protected();
         var6.addProperty("name", var7);
         var6.addProperty("x", var8.id_class());
         var6.addProperty("y", var8.id_break());
         var6.addProperty("z", var8.id_byte());
         var6.addProperty("serverIP", var9);
         var3.add(var6);
      }

      var2.add("waypoint", var3);
      var1.add("waypoint", var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, 47, -53, 114, 1, -126, 5, -73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_protected = new String[]{
         new String("waypoint"),
         new String("name"),
         new String("x"),
         new String("y"),
         new String("z"),
         new String("serverIP"),
         new String("waypoint"),
         new String("waypoint"),
         new String("waypoint"),
         new String("waypoint"),
         new String("waypoint"),
         new String("name"),
         new String("x"),
         new String("y"),
         new String("z"),
         new String("serverIP")
      };
   }

   private static void id_protected() {
      id_byte = new boolean[1];
   }
}
