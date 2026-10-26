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
   public static Object[] id_class;
   private static short[] id_byte;
   public Object[] id_break;
   private static String[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;

   private static void id_byte() {
      id_case = new boolean[]{false, false, false, false, false, true};
   }

   public ConfigManager() {
      this.id_throws();
      HashMap var5 = new HashMap();
      this.id_break[id_byte[0]] = var5;
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 927306380;
   }

   @Override
   public File id_class() {
      if ((File)this.id_break[1] == null) {
         File var5 = new File((File)QY.id_instanceof().id_class[24], id_protected[9]);
         this.id_break[1] = var5;
         ((File)this.id_break[1]).mkdir();
      }

      return (File)this.id_break[1];
   }

   @Override
   public void id_class(File var1, JsonElement var2) {
      Thread var3 = new Thread(() -> {
         try {
            String var2x = ((Gson)id_class[id_byte[11]]).toJson(var2);
            byte[] var3x = var2x.getBytes(StandardCharsets.UTF_8);
            byte[] var4 = id_class(var3x);
            Files.write(var1.toPath(), var4);
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      });
      var3.start();
   }

   @Override
   public boolean id_class(File var1) {
      return var1.exists();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1330590524855320966L;
   }

   @Override
   public File id_class(String var1) {
      return (File)((Map)this.id_break[id_byte[4]]).get(var1);
   }

   @Override
   public void id_class(String var1, File var2) {
      try {
         if (FilenameUtils.getExtension(var2.getName()).equals(id_protected[8])) {
            var2.mkdirs();
         } else {
            var2.createNewFile();
         }

         ((Map)this.id_break[id_byte[5]]).put(var1, var2);
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   private static byte[] id_class(byte[] var0) throws IOException {
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
            var2.write(var3, id_case[0], var4);
         }

         var2.close();
         var1.end();
         return var2.toByteArray();
      }
   }

   private static byte[] id_break(byte[] var0) throws DataFormatException, IOException {
      if (var0.length == 0) {
         return var0;
      } else {
         Inflater var1 = new Inflater();
         var1.setInput(var0);
         ByteArrayOutputStream var2 = new ByteArrayOutputStream(var0.length);
         byte[] var3 = new byte[1024];

         while (!var1.finished()) {
            int var4 = var1.inflate(var3);
            var2.write(var3, id_case[1], var4);
         }

         var2.close();
         var1.end();
         return var2.toByteArray();
      }
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new Gson(), new JsonParser()};
      id_class = var0;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{64, 37, 106, 9, -65, -25, 99, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public JsonElement id_break(File var1) {
      try {
         if (!var1.exists()) {
            return null;
         } else {
            byte[] var2 = Files.readAllBytes(var1.toPath());
            byte[] var3 = id_break(var2);
            String var4 = new String(var3, id_case[2], var3.length, StandardCharsets.UTF_8);
            return ((JsonParser)id_class[1]).parse(var4);
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      id_byte = new short[]{0, 1024, 1024, 1, 0, 0, 1, 24, 1, 1, 1, 0};
   }

   private void id_case() {
      File var1 = this.id_class();
      this.id_class(id_protected[0], new File(var1, id_protected[1]));
      this.id_class(id_protected[2], new File(var1, id_protected[3]));
      this.id_class(id_protected[4], new File(var1, id_protected[5]));
      this.id_class(id_protected[6], new File(var1, id_protected[7]));
   }

   private static void id_protected() {
      id_protected = new String[]{
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

   private static void id_private() {
      id_throws = new byte[]{9, 2, 2};
   }
}
