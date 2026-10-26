package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvQ {
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;

   String id_byte() {
      return (String)this.id_class[id_byte[4]];
   }

   public rrvQ(String var1, String var2, boolean var3) {
      this.id_protected();
      this.id_class[id_byte[0]] = var1;
      this.id_class[id_byte[1]] = var2;
      Boolean var10 = var3;
      this.id_class[id_byte[2]] = var10;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1567012384;
   }

   private static void id_class() {
      id_protected = new boolean[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{18, 71, 112, 109, -22, 72, 21, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2559276905479784104L;
   }

   private static void id_break() {
      id_break = new byte[]{3, 2};
   }

   private static void id_throws() {
      id_byte = new short[]{0, 1, 2, 0, 1, 2};
   }

   boolean id_catch() {
      return (Boolean)this.id_class[id_byte[5]];
   }

   String id_case() {
      return (String)this.id_class[id_byte[3]];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
         var1[id_break[1]] = id_protected[0];
      }
   }
}
