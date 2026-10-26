package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIS extends rrwU_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static String[] id_protected;

   private static void id_byte() {
      id_byte = new boolean[4];
   }

   public rrIS() {
      super(id_protected[0]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3023292031813843247L;
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has(id_protected[5])) {
         JsonObject var2 = var1.getAsJsonObject(id_protected[6]);
         JsonArray var3 = var2.getAsJsonArray(id_protected[7]);
         ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_break[1]]).id_class(id_byte[0]);

         for (int var4 = id_byte[1]; var4 < var3.size(); var4++) {
            JsonObject var5 = var3.get(var4).getAsJsonObject();
            String var6 = var5.get(id_protected[8]).getAsString();
            String var7 = var5.has(id_protected[9]) ? var5.get(id_protected[10]).getAsString() : null;
            ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_break[2]]).id_class(var6, var7, id_byte[2], id_byte[3]);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1389696346;
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rryk_1 var5 : ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_break[0]]).id_break()) {
         String var6 = var5.id_break();
         String var7 = var5.id_class();
         JsonObject var8 = new JsonObject();
         var8.addProperty(id_protected[1], var6);
         if (var7 != null) {
            var8.addProperty(id_protected[2], var7);
         }

         var3.add(var8);
      }

      var2.add(id_protected[3], var3);
      var1.add(id_protected[4], var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 19, 110, -59, 28, 70, -103, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_break = new short[3];
   }

   private static void id_protected() {
      id_protected = new String[]{
         new String("duel_blacklist"),
         new String("name"),
         new String("note"),
         new String("names"),
         new String("names"),
         new String("names"),
         new String("names"),
         new String("names"),
         new String("name"),
         new String("note"),
         new String("note")
      };
   }
}
