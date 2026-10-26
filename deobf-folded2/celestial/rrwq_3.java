package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrwq_3 {
   private static boolean[] booleansd739829cf0613d349fc0bda49435f7f4;
   private static short[] shortsd739829cf0613d349fc0bda49435f7f4;
   public static Object[] staticFieldsd739829cf0613d349fc0bda49435f7f4;
   private static String[] stringsd739829cf0613d349fc0bda49435f7f4;
   public Object[] fieldsd739829cf0613d349fc0bda49435f7f4;
   private static byte[] bytesd739829cf0613d349fc0bda49435f7f4;

   public void id_byte() {
      if (!(Boolean)this.fieldsd739829cf0613d349fc0bda49435f7f4[1]) {
         CompletableFuture.runAsync(() -> {
            try {
               String var1 = this.id_extends();
               if (var1 != null && !var1.isEmpty()) {
                  List var2 = this.id_break(var1);
                  this.id_break(var2);
               }

               Boolean var7 = booleansd739829cf0613d349fc0bda49435f7f4[0];
               this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[12]] = var7;
            } catch (Exception var8) {
               System.err.println("Failed to load servers: " + var8.getMessage());
               var8.printStackTrace();
            }
         });
      }
   }

   private rrwq_3() {
      this.id_throws();
      ArrayList var7 = new ArrayList();
      this.fieldsd739829cf0613d349fc0bda49435f7f4[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -77394604;
   }

   public void id_class(rrwp_3 var1) {
      LocalDateTime var2 = var1.id_finally();
      if (var2 == null || !var2.isBefore(LocalDateTime.now())) {
         ((List)this.fieldsd739829cf0613d349fc0bda49435f7f4[0]).add(var1);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-26, 125, -56, 122, 5, 69, -123, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(List<Ak_1> var1) {
      synchronized ((List)this.fieldsd739829cf0613d349fc0bda49435f7f4[0]) {
         for (rrwp_3 var4 : (List)this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[9]]) {
            var1.add(var4.id_catch());
         }
      }
   }

   public List<rrwp_3> id_class() {
      return (List<rrwp_3>)this.fieldsd739829cf0613d349fc0bda49435f7f4[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5037327232765159770L;
   }

   private List<rrwt_3> id_break(String var1) {
      try {
         Gson var2 = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new rrwT_2()).create();
         JsonParser var3 = new JsonParser();
         JsonArray var4 = var3.parse(var1).getAsJsonArray();
         ArrayList var5 = new ArrayList();

         for (JsonElement var7 : var4) {
            rrwt_3 var8 = (rrwt_3)var2.fromJson(var7, rrwt_3.class);
            var5.add(var8);
         }

         return var5;
      } catch (Exception var9) {
         System.err.println("Error parsing JSON data: " + var9.getMessage());
         return new ArrayList<>();
      }
   }

   public boolean id_break() {
      return (Boolean)this.fieldsd739829cf0613d349fc0bda49435f7f4[1];
   }

   private void id_break(List<rrwt_3> var1) {
      synchronized ((List)this.fieldsd739829cf0613d349fc0bda49435f7f4[0]) {
         ((List)this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[6]]).clear();

         for (rrwt_3 var4 : var1) {
            try {
               rrwp_3 var5 = new rrwp_3(var4.id_throws, var4.id_byte, var4.id_class, var4.id_protected, var4.id_break);
               this.id_class(var5);
            } catch (Exception var7) {
               System.err
                  .println(
                     "Error adding server " + (var4.id_throws != null ? var4.id_throws : stringsd739829cf0613d349fc0bda49435f7f4[2]) + ": " + var7.getMessage()
                  );
            }
         }
      }
   }

   private void id_throws() {
      if (this.fieldsd739829cf0613d349fc0bda49435f7f4 == null) {
         this.fieldsd739829cf0613d349fc0bda49435f7f4 = new Object[2];
         Object[] var1 = this.fieldsd739829cf0613d349fc0bda49435f7f4;
         var1[1] = false;
      }
   }

   private static void id_finally() {
      booleansd739829cf0613d349fc0bda49435f7f4 = new boolean[]{true, true, false, false, false, true, false, true};
   }

   private String id_extends() {
      try {
         URL var1 = new URL(stringsd739829cf0613d349fc0bda49435f7f4[0]);
         HttpURLConnection var2 = (HttpURLConnection)var1.openConnection();
         var2.setRequestMethod(stringsd739829cf0613d349fc0bda49435f7f4[1]);
         var2.setConnectTimeout(shortsd739829cf0613d349fc0bda49435f7f4[3]);
         var2.setReadTimeout(shortsd739829cf0613d349fc0bda49435f7f4[4]);

         String var6;
         try (BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.getInputStream()))) {
            StringBuilder var4 = new StringBuilder();

            String var5;
            while ((var5 = var3.readLine()) != null) {
               var4.append(var5);
            }

            var6 = var4.toString();
         }

         return var6;
      } catch (Exception var9) {
         System.err.println("Error fetching data: " + var9.getMessage());
         return null;
      }
   }

   private static void id_case() {
      shortsd739829cf0613d349fc0bda49435f7f4 = new short[]{2, 0, 1, 5000, 5000, 0, 0, 0, 0, 0, 0, 1, 1, 0};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrwq_3(), "https://pastebin.com/raw/wGRRZUVV", null};
      var0[2] = new rrwq_3[]{(rrwq_3)var0[0]};
      staticFieldsd739829cf0613d349fc0bda49435f7f4 = var0;
   }

   private static void id_private() {
      bytesd739829cf0613d349fc0bda49435f7f4 = new byte[]{2, 2, 3};
   }

   private static void id_native() {
      stringsd739829cf0613d349fc0bda49435f7f4 = new String[]{
         new String("https://pastebin.com/raw/wGRRZUVV"),
         new String("GET"),
         new String("unknown"),
         new String("INSTANCE"),
         new String("https://pastebin.com/raw/wGRRZUVV")
      };
   }
}
