package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FileUtils;

public class rrwN_2 implements MinecraftAccessor {
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;
   public static Object[] break_;
   private static String[] throws_;
   private static byte[] case_;

   private static void byte_() {
      protected_ = new boolean[]{false, true, true};
   }

   public rrwN_2() {
      this.protected_();
      String var5 = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_("proxy"), "proxies.json").getAbsolutePath();
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2104023396;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5863909278988314114L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{127, -85, 61, 32, 60, -24, -32, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_() {
      try {
         JsonElement var1 = new Gson().toJsonTree((HashMap)break_[byte_[8]]);
         JsonObject var2 = new JsonObject();
         var2.addProperty(throws_[8], (Boolean)rrwZ_2.class_[byte_[9]]);
         var2.add(throws_[9], var1);
         Gson var3 = new GsonBuilder().setPrettyPrinting().create();
         FileUtils.write(new File((String)this.class_[byte_[10]]), var3.toJson(var2), StandardCharsets.UTF_8);
      } catch (IOException var4) {
         System.out.println("Error writing proxies.json file");
         var4.printStackTrace();
      }
   }

   public static void class_(rrwu_3 var0) {
      ((HashMap)break_[0]).put("", var0);
   }

   public void break_() {
      File var1 = new File((String)this.class_[0]);

      try {
         if (!var1.exists()) {
            if (!var1.createNewFile()) {
               System.out.println(throws_[2]);
            }

            return;
         }

         String var2 = FileUtils.readFileToString(var1, throws_[3]);
         if (!var2.isEmpty()) {
            JsonObject var3 = new JsonParser().parse(var2).getAsJsonObject();
            Boolean var9 = var3.get(throws_[4]).getAsBoolean();
            rrwZ_2.class_[byte_[3]] = var9;
            Type var4 = new rrwc_3(this).getType();
            HashMap var10 = (HashMap)new Gson().fromJson(var3.get(throws_[5]), var4);
            break_[byte_[4]] = var10;
            if ((HashMap)break_[byte_[5]] == null) {
               HashMap var11 = new HashMap();
               break_[byte_[6]] = var11;
            }
         }
      } catch (Exception var12) {
         System.out.println("Error reading proxies.json file");
         var12.printStackTrace();
      }
   }

   private static void throws_() {
      throws_ = new String[]{
         new String("proxy"),
         new String("proxies.json"),
         new String("Error creating proxies.json file"),
         new String("UTF-8"),
         new String("proxy-enabled"),
         new String("accounts"),
         new String("Error reading proxies.json file"),
         new String(""),
         new String("proxy-enabled"),
         new String("accounts"),
         new String("Error writing proxies.json file"),
         new String("")
      };
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new HashMap(), ""};
      break_ = var0;
   }

   private static void case_() {
      byte_ = new short[11];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void private_() {
      case_ = new byte[]{2};
   }
}
