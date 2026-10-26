package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIO extends rrwU_2 {
   private static short[] break_;
   private static boolean[] byte_;
   private static String[] protected_;

   private static void byte_() {
      break_ = new short[2];
   }

   public rrIO() {
      super("waypoint");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 268055275;
   }

   @Override
   public void class_(JsonObject var1) {
      super.class_(var1);
      if (var1.has("waypoint")) {
         JsonObject var2 = var1.getAsJsonObject("waypoint");

         for (JsonElement var5 : var2.getAsJsonArray("waypoint")) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get("name").getAsString();
            double var8 = var6.get("x").getAsDouble();
            double var10 = var6.get("y").getAsDouble();
            double var12 = var6.get("z").getAsDouble();
            String var14 = var6.get("serverIP").getAsString();
            ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_(new rrjD_2(var7, new rjU_2(var8, var10, var12), var14), false);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6017141407243444013L;
   }

   @Override
   public void break_(JsonObject var1) {
      super.break_(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrjD_2 var5 : ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).byte_()) {
         JsonObject var6 = new JsonObject();
         String var7 = var5.byte_();
         eX_2 var8 = var5.break_();
         String var9 = var5.protected_();
         var6.addProperty("name", var7);
         var6.addProperty("x", var8.class_());
         var6.addProperty("y", var8.break_());
         var6.addProperty("z", var8.byte_());
         var6.addProperty("serverIP", var9);
         var3.add(var6);
      }

      var2.add("waypoint", var3);
      var1.add("waypoint", var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, 47, -53, 114, 1, -126, 5, -73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      protected_ = new String[]{
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

   private static void protected_() {
      byte_ = new boolean[1];
   }
}
