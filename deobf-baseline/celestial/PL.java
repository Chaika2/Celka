package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PL extends Pv_1 {
   private static boolean[] id_protected;
   private static short[] id_throws;
   private static byte[] id_case;
   private static String[] id_catch;
   public static Object[] id_break;
   public Object[] id_byte;

   private boolean id_byte() {
      rgP_2 var1 = ((cq_3)((Ps_1)this.id_class[id_throws[36]]).id_throws().id_class[id_throws[37]]).id_implements().id_protected();
      return var1 == null ? id_protected[5] : var1.id_byte().contains(id_catch[8]);
   }

   public PL(C_class var1) {
      super(var1);
      this.id_catch();
      HashSet var6 = new HashSet();
      this.id_byte[id_throws[0]] = var6;
      ArrayList var7 = new ArrayList();
      this.id_byte[id_throws[1]] = var7;
      Boolean var8 = id_protected[0];
      this.id_byte[id_throws[2]] = var8;
      Boolean var9 = id_protected[1];
      this.id_byte[id_throws[3]] = var9;
      ((Set)this.id_byte[id_throws[4]]).add(id_catch[0]);
      ((List)this.id_byte[id_throws[5]]).add(id_catch[1]);
      this.id_class();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5876112568877170132L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1549939870;
   }

   @Override
   public void id_class(C var1) {
      this.id_catch();
      super.id_class(var1);
      String var2 = var1.id_class();
      if ((Boolean)this.id_byte[id_throws[29]]
         && (rrfq_3)rrfp_3.id_class[id_throws[30]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[31]]
         && ((Set)this.id_byte[id_throws[32]]).contains(((rrZr_1)rrQJ.id_class[id_throws[33]]).id_break())
         && !var2.startsWith((String)C_class.id_instanceof().id_protected.id_class[id_throws[34]])
         && !var2.startsWith(id_catch[7])
         && this.id_byte()) {
         var1.id_break();
      }
   }

   @Override
   public void id_class(rrAM var1) {
      this.id_catch();
      super.id_class(var1);
      Boolean var6 = id_protected[4];
      this.id_byte[id_throws[35]] = var6;
   }

   @Override
   public void id_class(rrLO var1) {
      this.id_catch();
      super.id_class(var1);
      String var2 = var1.id_protected().toLowerCase();
      if ((rrfq_3)rrfp_3.id_class[id_throws[19]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[20]]
         && var2.contains(id_catch[5])
         && var2.contains(id_catch[6])
         && (Boolean)this.id_byte[id_throws[21]]
         && ((Set)this.id_byte[id_throws[22]]).contains(((rrZr_1)rrQJ.id_class[id_throws[23]]).id_break())
         && this.id_byte()) {
         String var3 = (String)((List)this.id_byte[id_throws[24]]).get(ThreadLocalRandom.current().nextInt(((List)this.id_byte[id_throws[25]]).size()));
         Boolean var8 = id_protected[3];
         this.id_byte[id_throws[26]] = var8;
         ((cb_3)((Ps_1)this.id_class[id_throws[27]]).id_throws().id_class[id_throws[28]]).id_case(var3);
      }
   }

   public void id_class() {
      this.id_catch();
      if (!(Boolean)this.id_byte[id_throws[6]]) {
         CompletableFuture.runAsync(() -> {
            this.id_catch();

            try {
               String var1 = this.id_protected();
               if (var1 != null && !var1.isEmpty()) {
                  ((Set)this.id_byte[id_throws[38]]).clear();
                  ((List)this.id_byte[id_throws[39]]).clear();
                  JsonObject var2 = new JsonParser().parse(var1).getAsJsonObject();
                  JsonArray var3 = var2.getAsJsonArray(id_catch[9]);
                  JsonArray var4 = var2.getAsJsonArray(id_catch[10]);
                  Boolean var11 = var2.get(id_catch[11]).getAsBoolean();
                  this.id_byte[id_throws[40]] = var11;
                  Boolean var12 = var2.get(id_catch[12]).getAsBoolean();
                  this.id_byte[id_throws[41]] = var12;

                  for (JsonElement var6 : var3) {
                     ((Set)this.id_byte[id_throws[42]]).add(var6.getAsString());
                  }

                  for (JsonElement var16 : var4) {
                     ((List)this.id_byte[id_throws[43]]).add(var16.getAsString());
                  }
               }

               Boolean var13 = id_protected[6];
               this.id_byte[id_throws[44]] = var13;
            } catch (Exception var14) {
               System.err.println("Failed to load servers: " + var14.getMessage());
               var14.printStackTrace();
            }
         });
      }
   }

   private static void id_break() {
      id_throws = new short[]{
         0, 1, 2, 3, 0, 1, 5, 5000, 5000, 0, 4, 1, 2, 0, 5, 4, 0, 1, 1, 1, 2, 2, 0, 5, 1, 1, 4, 1, 57, 3, 1, 2, 0, 5, 0, 4, 1, 19, 0, 1, 3, 2, 0, 1, 5
      };
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, 117, -34, -29, 51, 114, -28, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(y_1 var1) {
      this.id_catch();
      super.id_break(var1);
      if (var1.id_byte() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[9]] && var1.id_protected() instanceof rmT_2 var3) {
         String var4 = var3.id_break();
         if ((Boolean)this.id_byte[id_throws[10]]
            || (rrfq_3)rrfp_3.id_class[id_throws[11]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[12]]
            || !((Set)this.id_byte[id_throws[13]]).contains(((rrZr_1)rrQJ.id_class[id_throws[14]]).id_break())
            || !this.id_byte()) {
            Boolean var10 = id_protected[2];
            this.id_byte[id_throws[15]] = var10;
            return;
         }

         if (!var4.startsWith((String)C_class.id_instanceof().id_protected.id_class[id_throws[16]]) && !var4.startsWith(id_catch[4])) {
            String var5 = (String)((List)this.id_byte[id_throws[17]]).get(ThreadLocalRandom.current().nextInt(((List)this.id_byte[id_throws[18]]).size()));
            var3.id_class(var4 + " " + var5);
         }
      }
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, true, false, true, false, false, true, false, false, false, false, true, false};
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{id_catch[13]};
      id_break = var0;
   }

   private void id_catch() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_case[0]];
         Object[] var1 = this.id_byte;
         var1[id_case[1]] = id_protected[7];
         var1[id_case[2]] = id_protected[8];
         var1[id_case[3]] = id_protected[9];
         var1[id_case[4]] = id_protected[10];
      }
   }

   private static void id_case() {
      id_catch = new String[]{
         new String("makavtoJJ"),
         new String("я ебаный лох с говно читом, лучше купите целестиал"),
         new String("https://pastebin.com/raw/YB4sGv7n"),
         new String("GET"),
         new String("/"),
         new String("[⚔]"),
         new String("победу"),
         new String("/"),
         new String("Режим: Дуэли"),
         new String("names"),
         new String("messages"),
         new String("cancelOwnMessages"),
         new String("sendAfterWin"),
         new String("https://pastebin.com/raw/YB4sGv7n")
      };
   }

   private static void id_implements() {
      id_case = new byte[]{6, 2, 3, 4, 5};
   }

   private String id_protected() {
      try {
         URL var1 = new URL(id_catch[2]);
         HttpURLConnection var2 = (HttpURLConnection)var1.openConnection();
         var2.setRequestMethod(id_catch[3]);
         var2.setConnectTimeout(id_throws[7]);
         var2.setReadTimeout(id_throws[8]);

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
}
