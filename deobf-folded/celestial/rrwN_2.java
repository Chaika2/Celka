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
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_break;
   private static String[] id_throws;
   private static byte[] id_case;

   private static void id_byte() {
      id_protected = new boolean[]{false, true, true};
   }

   public rrwN_2() {
      this.id_protected();
      String var5 = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[0]]).id_break().id_class(id_throws[0]), id_throws[1])
         .getAbsolutePath();
      this.id_class[id_byte[1]] = var5;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2104023396;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5863909278988314114L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{127, -85, 61, 32, 60, -24, -32, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class() {
      try {
         JsonElement var1 = new Gson().toJsonTree((HashMap)id_break[id_byte[8]]);
         JsonObject var2 = new JsonObject();
         var2.addProperty(id_throws[8], (Boolean)rrwZ_2.id_class[id_byte[9]]);
         var2.add(id_throws[9], var1);
         Gson var3 = new GsonBuilder().setPrettyPrinting().create();
         FileUtils.write(new File((String)this.id_class[id_byte[10]]), var3.toJson(var2), StandardCharsets.UTF_8);
      } catch (IOException var4) {
         System.out.println(id_throws[10]);
         var4.printStackTrace();
      }
   }

   public static void id_class(rrwu_3 var0) {
      ((HashMap)id_break[id_byte[7]]).put(id_throws[7], var0);
   }

   public void id_break() {
      File var1 = new File((String)this.id_class[id_byte[2]]);

      try {
         if (!var1.exists()) {
            if (!var1.createNewFile()) {
               System.out.println(id_throws[2]);
            }

            return;
         }

         String var2 = FileUtils.readFileToString(var1, id_throws[3]);
         if (!var2.isEmpty()) {
            JsonObject var3 = new JsonParser().parse(var2).getAsJsonObject();
            Boolean var9 = var3.get(id_throws[4]).getAsBoolean();
            rrwZ_2.id_class[id_byte[3]] = var9;
            Type var4 = new rrwc_3(this).getType();
            HashMap var10 = (HashMap)new Gson().fromJson(var3.get(id_throws[5]), var4);
            id_break[id_byte[4]] = var10;
            if ((HashMap)id_break[id_byte[5]] == null) {
               HashMap var11 = new HashMap();
               id_break[id_byte[6]] = var11;
            }
         }
      } catch (Exception var12) {
         System.out.println(id_throws[6]);
         var12.printStackTrace();
      }
   }

   private static void id_throws() {
      id_throws = new String[]{
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

   private static void id_catch() {
      Object[] var0 = new Object[]{new HashMap(), id_throws[11]};
      id_break = var0;
   }

   private static void id_case() {
      id_byte = new short[11];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_private() {
      id_case = new byte[]{2};
   }
}
