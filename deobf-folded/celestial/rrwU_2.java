package celestial;

import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrwU_2 implements rrwj_3 {
   public Object[] id_class;
   private static String[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_break = new String[]{new String("misc")};
   }

   public rrwU_2(String var1) {
      this.id_case();
      this.id_class[id_byte[0]] = var1;
      File var8 = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[1]]).id_break().id_class(id_break[0]), var1 + ".celka");
      this.id_class[1] = var8;
      if (!((File)this.id_class[1]).exists()) {
         try {
            ((File)this.id_class[1]).createNewFile();
         } catch (IOException var9) {
            var9.printStackTrace();
         }
      }
   }

   static {
      ntfClinit();
   }

   public String id_class() {
      return (String)this.id_class[id_byte[5]];
   }

   @Override
   public void id_class(JsonObject var1) {
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 613648274;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3079748517801737363L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 120, -75, 89, 63, 119, -13, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public File id_break() {
      return (File)this.id_class[1];
   }

   @Override
   public void id_break(JsonObject var1) {
   }

   private static void id_throws() {
      id_byte = new short[]{0, 0, 1, 1, 1, 0, 1};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_protected = new byte[]{2};
   }
}
