package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfT_2 {
   private static String[] id_class;
   private static short[] id_break;

   private static void id_byte() {
      id_class = new String[]{
         new String("hh:mm a"),
         new String("http://ip-api.com/json/"),
         new String("GET"),
         new String("User-Agent"),
         new String("Mozilla/5.0"),
         new String("dd.MM.yyyy HH:mm:ss")
      };
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -736663800;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4987933908095794455L;
   }

   public static String id_class(String var0) {
      Date var1 = new Date();
      SimpleDateFormat var2 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
      var2.setTimeZone(TimeZone.getTimeZone(var0));
      return var2.format(var1);
   }

   public static String id_class() {
      DateTimeFormatter var0 = DateTimeFormatter.ofPattern("hh:mm a");
      LocalTime var1 = LocalTime.now();
      return var0.format(var1);
   }

   public static JsonObject id_break() {
      String var0 = "http://ip-api.com/json/";

      try {
         URL var1 = new URL(var0);
         HttpURLConnection var2 = (HttpURLConnection)var1.openConnection();
         var2.setRequestMethod(id_class[2]);
         var2.setRequestProperty(id_class[3], id_class[4]);
         int var3 = var2.getResponseCode();
         if (var3 == id_break[0]) {
            BufferedReader var4 = new BufferedReader(new InputStreamReader(var2.getInputStream()));
            StringBuilder var6 = new StringBuilder();

            String var5;
            while ((var5 = var4.readLine()) != null) {
               var6.append(var5);
            }

            var4.close();
            return new JsonParser().parse(var6.toString()).getAsJsonObject();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      return null;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{111, 51, -66, 70, 19, 115, 65, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_protected() {
      id_break = new short[]{200};
   }
}
