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
   private static boolean[] protected_;
   private static short[] throws_;
   private static byte[] case_;
   private static String[] catch_;
   public static Object[] break_;
   public Object[] byte_;

   private boolean byte_() {
      rgP_2 var1 = ((cq_3)((Ps_1)this.class_[1]).throws_().class_[19]).implements_().protected_();
      return var1 == null ? false : var1.byte_().contains("Режим: Дуэли");
   }

   public PL(C_class var1) {
      super(var1);
      this.catch_();
      HashSet var6 = new HashSet();
      this.byte_[0] = var6;
      ArrayList var7 = new ArrayList();
      this.byte_[1] = var7;
      Boolean var8 = true;
      this.byte_[2] = var8;
      Boolean var9 = true;
      this.byte_[3] = var9;
      ((Set)this.byte_[0]).add("makavtoJJ");
      ((List)this.byte_[1]).add("я ебаный лох с говно читом, лучше купите целестиал");
      this.class_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5876112568877170132L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1549939870;
   }

   @Override
   public void class_(C var1) {
      this.catch_();
      super.class_(var1);
      String var2 = var1.class_();
      if ((Boolean)this.byte_[3]
         && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         && ((Set)this.byte_[0]).contains(((rrZr_1)rrQJ.class_[5]).break_())
         && !var2.startsWith((String)C_class.instanceof_().protected_.class_[0])
         && !var2.startsWith("/")
         && this.byte_()) {
         var1.break_();
      }
   }

   @Override
   public void class_(rrAM var1) {
      this.catch_();
      super.class_(var1);
      Boolean var6 = false;
      this.byte_[4] = var6;
   }

   @Override
   public void class_(rrLO var1) {
      this.catch_();
      super.class_(var1);
      String var2 = var1.protected_().toLowerCase();
      if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         && var2.contains("[⚔]")
         && var2.contains("победу")
         && (Boolean)this.byte_[2]
         && ((Set)this.byte_[0]).contains(((rrZr_1)rrQJ.class_[5]).break_())
         && this.byte_()) {
         String var3 = (String)((List)this.byte_[1]).get(ThreadLocalRandom.current().nextInt(((List)this.byte_[1]).size()));
         Boolean var8 = true;
         this.byte_[4] = var8;
         ((cb_3)((Ps_1)this.class_[1]).throws_().class_[57]).case_(var3);
      }
   }

   public void class_() {
      this.catch_();
      if (!(Boolean)this.byte_[5]) {
         CompletableFuture.runAsync(() -> {
            this.catch_();

            try {
               String var1 = this.protected_();
               if (var1 != null && !var1.isEmpty()) {
                  ((Set)this.byte_[throws_[38]]).clear();
                  ((List)this.byte_[throws_[39]]).clear();
                  JsonObject var2 = new JsonParser().parse(var1).getAsJsonObject();
                  JsonArray var3 = var2.getAsJsonArray(catch_[9]);
                  JsonArray var4 = var2.getAsJsonArray(catch_[10]);
                  Boolean var11 = var2.get(catch_[11]).getAsBoolean();
                  this.byte_[throws_[40]] = var11;
                  Boolean var12 = var2.get(catch_[12]).getAsBoolean();
                  this.byte_[throws_[41]] = var12;

                  for (JsonElement var6 : var3) {
                     ((Set)this.byte_[throws_[42]]).add(var6.getAsString());
                  }

                  for (JsonElement var16 : var4) {
                     ((List)this.byte_[throws_[43]]).add(var16.getAsString());
                  }
               }

               Boolean var13 = protected_[6];
               this.byte_[throws_[44]] = var13;
            } catch (Exception var14) {
               System.err.println("Failed to load servers: " + var14.getMessage());
               var14.printStackTrace();
            }
         });
      }
   }

   private static void break_() {
      throws_ = new short[]{
         0, 1, 2, 3, 0, 1, 5, 5000, 5000, 0, 4, 1, 2, 0, 5, 4, 0, 1, 1, 1, 2, 2, 0, 5, 1, 1, 4, 1, 57, 3, 1, 2, 0, 5, 0, 4, 1, 19, 0, 1, 3, 2, 0, 1, 5
      };
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, 117, -34, -29, 51, 114, -28, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(y_1 var1) {
      this.catch_();
      super.break_(var1);
      if (var1.byte_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && var1.protected_() instanceof rmT_2 var3) {
         String var4 = var3.break_();
         if ((Boolean)this.byte_[4]
            || (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            || !((Set)this.byte_[0]).contains(((rrZr_1)rrQJ.class_[5]).break_())
            || !this.byte_()) {
            Boolean var10 = false;
            this.byte_[4] = var10;
            return;
         }

         if (!var4.startsWith((String)C_class.instanceof_().protected_.class_[0]) && !var4.startsWith("/")) {
            String var5 = (String)((List)this.byte_[1]).get(ThreadLocalRandom.current().nextInt(((List)this.byte_[1]).size()));
            var3.class_(var4 + " " + var5);
         }
      }
   }

   private static void throws_() {
      protected_ = new boolean[]{true, true, false, true, false, false, true, false, false, false, false, true, false};
   }

   private static void finally_() {
      Object[] var0 = new Object[]{"https://pastebin.com/raw/YB4sGv7n"};
      break_ = var0;
   }

   private void catch_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[6];
         Object[] var1 = this.byte_;
         var1[2] = false;
         var1[3] = false;
         var1[4] = false;
         var1[5] = false;
      }
   }

   private static void case_() {
      catch_ = new String[]{
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

   private static void implements_() {
      case_ = new byte[]{6, 2, 3, 4, 5};
   }

   private String protected_() {
      try {
         URL var1 = new URL(catch_[2]);
         HttpURLConnection var2 = (HttpURLConnection)var1.openConnection();
         var2.setRequestMethod(catch_[3]);
         var2.setConnectTimeout(throws_[7]);
         var2.setReadTimeout(throws_[8]);

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
