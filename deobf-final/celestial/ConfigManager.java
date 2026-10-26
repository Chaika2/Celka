package celestial;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FilenameUtils;

public class ConfigManager implements rrZs_1 {
   public static Object[] class_;
   private static short[] byte_;
   public Object[] break_;
   private static String[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;

   private static void byte_() {
      case_ = new boolean[]{false, false, false, false, false, true};
   }

   public ConfigManager() {
      this.throws_();
      HashMap var5 = new HashMap();
      this.break_[0] = var5;
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 927306380;
   }

   @Override
   public File class_() {
      if ((File)this.break_[1] == null) {
         File var5 = new File((File)QY.instanceof_().class_[24], "Celestial");
         this.break_[1] = var5;
         ((File)this.break_[1]).mkdir();
      }

      return (File)this.break_[1];
   }

   @Override
   public void class_(File var1, JsonElement var2) {
      Thread var3 = new Thread(() -> {
         try {
            String var2x = ((Gson)class_[byte_[11]]).toJson(var2);
            byte[] var3x = var2x.getBytes(StandardCharsets.UTF_8);
            byte[] var4 = class_(var3x);
            Files.write(var1.toPath(), var4);
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      });
      var3.start();
   }

   @Override
   public boolean class_(File var1) {
      return var1.exists();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1330590524855320966L;
   }

   @Override
   public File class_(String var1) {
      return (File)((Map)this.break_[0]).get(var1);
   }

   @Override
   public void class_(String var1, File var2) {
      try {
         if (FilenameUtils.getExtension(var2.getName()).equals(protected_[8])) {
            var2.mkdirs();
         } else {
            var2.createNewFile();
         }

         ((Map)this.break_[byte_[5]]).put(var1, var2);
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   private static byte[] class_(byte[] var0) throws IOException {
      if (var0.length == 0) {
         return var0;
      } else {
         Deflater var1 = new Deflater();
         var1.setLevel(9);
         var1.setInput(var0);
         var1.finish();
         ByteArrayOutputStream var2 = new ByteArrayOutputStream(var0.length);
         byte[] var3 = new byte[1024];

         while (!var1.finished()) {
            int var4 = var1.deflate(var3);
            var2.write(var3, 0, var4);
         }

         var2.close();
         var1.end();
         return var2.toByteArray();
      }
   }

   private static byte[] break_(byte[] var0) throws DataFormatException, IOException {
      if (var0.length == 0) {
         return var0;
      } else {
         Inflater var1 = new Inflater();
         var1.setInput(var0);
         ByteArrayOutputStream var2 = new ByteArrayOutputStream(var0.length);
         byte[] var3 = new byte[1024];

         while (!var1.finished()) {
            int var4 = var1.inflate(var3);
            var2.write(var3, 0, var4);
         }

         var2.close();
         var1.end();
         return var2.toByteArray();
      }
   }

   private static void break_() {
      Object[] var0 = new Object[]{new Gson(), new JsonParser()};
      class_ = var0;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{64, 37, 106, 9, -65, -25, 99, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public JsonElement break_(File var1) {
      try {
         if (!var1.exists()) {
            return null;
         } else {
            byte[] var2 = Files.readAllBytes(var1.toPath());
            byte[] var3 = break_(var2);
            String var4 = new String(var3, case_[2], var3.length, StandardCharsets.UTF_8);
            return ((JsonParser)class_[byte_[3]]).parse(var4);
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      byte_ = new short[]{0, 1024, 1024, 1, 0, 0, 1, 24, 1, 1, 1, 0};
   }

   private void case_() {
      File var1 = this.class_();
      this.class_("configs", new File(var1, "configs"));
      this.class_("creeperfarm", new File(var1, "creeperfarm"));
      this.class_("misc", new File(var1, "misc"));
      this.class_("proxy", new File(var1, "proxy"));
   }

   private static void protected_() {
      protected_ = new String[]{
         new String("configs"),
         new String("configs"),
         new String("creeperfarm"),
         new String("creeperfarm"),
         new String("misc"),
         new String("misc"),
         new String("proxy"),
         new String("proxy"),
         new String(""),
         new String("Celestial")
      };
   }

   private static void private_() {
      throws_ = new byte[]{9, 2, 2};
   }
}
