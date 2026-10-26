package celestial;

import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwR_2 implements rrwj_3 {
   public Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;
   private static String[] id_protected;

   private static void id_byte() {
      id_protected = new String[]{new String("creeperfarm")};
   }

   public rrwR_2(String var1) {
      this.id_case();
      this.id_class[id_break[0]] = var1;
      File var8 = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[1]]).id_break().id_class(id_protected[0]), var1 + ".celka");
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

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -873573606;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, 111, -66, 22, 87, 38, 111, -46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(JsonObject var1) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[6]]).id_implements().id_protected().forEach(var1x -> var1x.id_class(var1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7197434334850178733L;
   }

   public File id_class() {
      return (File)this.id_class[1];
   }

   public String id_break() {
      return (String)this.id_class[id_break[7]];
   }

   @Override
   public void id_break(JsonObject var1) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[5]]).id_implements().id_protected().forEach(var1x -> var1x.id_break(var1));
   }

   private static void id_throws() {
      id_break = new short[]{0, 0, 1, 1, 1, 0, 0, 0, 1};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_byte = new byte[]{2};
   }
}
