package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIP extends rrwU_2 {
   private static short[] break_;
   private static boolean[] byte_;
   private static String[] protected_;

   private static void byte_() {
      byte_ = new boolean[]{true};
   }

   public rrIP() {
      super("autobuy");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7532378708904117905L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -846581305;
   }

   @Override
   public void class_(JsonObject var1) {
      super.class_(var1);
      if (var1.has("items")) {
         JsonObject var2 = var1.getAsJsonObject("items");

         for (JsonElement var5 : var2.getAsJsonArray("items")) {
            JsonObject var6 = var5.getAsJsonObject();
            if (var6.has("custom_name")) {
               ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).break_(var6.get("custom_name").getAsString()).ifPresent(var1x -> {
                  if (var6.has("enabled")) {
                     var1x.break_(var6.get("enabled").getAsBoolean());
                  }

                  if (var6.has("max_price")) {
                     var1x.break_(var6.get("max_price").getAsInt());
                  }

                  if (var6.has("can_be_parsed")) {
                     var1x.class_(var6.get("can_be_parsed").getAsBoolean());
                  }

                  if (var6.has("check_durability")) {
                     var1x.byte_(var6.get("check_durability").getAsBoolean());
                  }

                  if (var6.has("min_durability")) {
                     var1x.byte_(var6.get("min_durability").getAsInt());
                  }

                  if (var6.has("min_count")) {
                     var1x.class_(var6.get("min_count").getAsInt());
                  }

                  rrww_3.class_(var1x, var6);
               });
            }
         }
      }
   }

   @Override
   public void break_(JsonObject var1) {
      super.break_(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrNd_1 var5 : ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).extends_()) {
         JsonObject var6 = new JsonObject();
         rdb_3 var7 = var5.catch_();
         var6.addProperty("custom_name", var5.volatile_());
         var6.addProperty("enabled", var5.while_());
         var6.addProperty("max_price", var5.else_());
         var6.addProperty("can_be_parsed", var5.class_());
         if (var7.extends_()) {
            var6.addProperty("check_durability", var5.return_());
            var6.addProperty("min_durability", var5.public_());
         }

         if (var7.implements_() > 1) {
            var6.addProperty("min_count", var5.native_());
         }

         rrww_3.break_(var5, var6);
         var3.add(var6);
      }

      var2.add("items", var3);
      var1.add("items", var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{0, 117, 11, 46, 0, 69, -35, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      break_ = new short[2];
   }

   private static void protected_() {
      protected_ = new String[]{
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
