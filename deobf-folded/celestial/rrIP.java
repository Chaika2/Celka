package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIP extends rrwU_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static String[] id_protected;

   private static void id_byte() {
      id_byte = new boolean[]{true};
   }

   public rrIP() {
      super(id_protected[0]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7532378708904117905L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -846581305;
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has(id_protected[10])) {
         JsonObject var2 = var1.getAsJsonObject(id_protected[11]);

         for (JsonElement var5 : var2.getAsJsonArray(id_protected[12])) {
            JsonObject var6 = var5.getAsJsonObject();
            if (var6.has(id_protected[13])) {
               ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_break[1]])
                  .id_break(var6.get(id_protected[14]).getAsString())
                  .ifPresent(var1x -> {
                     if (var6.has(id_protected[15])) {
                        var1x.id_break(var6.get(id_protected[16]).getAsBoolean());
                     }

                     if (var6.has(id_protected[17])) {
                        var1x.id_break(var6.get(id_protected[18]).getAsInt());
                     }

                     if (var6.has(id_protected[19])) {
                        var1x.id_class(var6.get(id_protected[20]).getAsBoolean());
                     }

                     if (var6.has(id_protected[21])) {
                        var1x.id_byte(var6.get(id_protected[22]).getAsBoolean());
                     }

                     if (var6.has(id_protected[23])) {
                        var1x.id_byte(var6.get(id_protected[24]).getAsInt());
                     }

                     if (var6.has(id_protected[25])) {
                        var1x.id_class(var6.get(id_protected[26]).getAsInt());
                     }

                     rrww_3.id_class(var1x, var6);
                  });
            }
         }
      }
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrNd_1 var5 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_break[0]]).id_extends()) {
         JsonObject var6 = new JsonObject();
         rdb_3 var7 = var5.id_catch();
         var6.addProperty(id_protected[1], var5.id_volatile());
         var6.addProperty(id_protected[2], var5.id_while());
         var6.addProperty(id_protected[3], var5.id_else());
         var6.addProperty(id_protected[4], var5.id_class());
         if (var7.id_extends()) {
            var6.addProperty(id_protected[5], var5.id_return());
            var6.addProperty(id_protected[6], var5.id_public());
         }

         if (var7.id_implements() > 1) {
            var6.addProperty(id_protected[7], var5.id_native());
         }

         rrww_3.id_break(var5, var6);
         var3.add(var6);
      }

      var2.add(id_protected[8], var3);
      var1.add(id_protected[9], var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{0, 117, 11, 46, 0, 69, -35, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_break = new short[2];
   }

   private static void id_protected() {
      id_protected = new String[]{
         new String("autobuy"),
         new String("custom_name"),
         new String("enabled"),
         new String("max_price"),
         new String("can_be_parsed"),
         new String("check_durability"),
         new String("min_durability"),
         new String("min_count"),
         new String("items"),
         new String("items"),
         new String("items"),
         new String("items"),
         new String("items"),
         new String("custom_name"),
         new String("custom_name"),
         new String("enabled"),
         new String("enabled"),
         new String("max_price"),
         new String("max_price"),
         new String("can_be_parsed"),
         new String("can_be_parsed"),
         new String("check_durability"),
         new String("check_durability"),
         new String("min_durability"),
         new String("min_durability"),
         new String("min_count"),
         new String("min_count")
      };
   }
}
