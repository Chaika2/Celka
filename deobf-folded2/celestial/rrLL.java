package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLL {
   private static short[] id_byte;
   public static Object[] id_class;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_break;

   private static void id_byte() {
      id_byte = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   public rrLL() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, -123, -90, -57, 2, -6, 22, 26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -322513066263520100L;
   }

   public static rrLL id_class(Aw_1 var0, rgP_2 var1) {
      ((rrLL)id_class[0]).id_break[0] = var0;
      ((rrLL)id_class[0]).id_break[1] = var1;
      return (rrLL)id_class[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1065026619;
   }

   public rgP_2 id_class() {
      return (rgP_2)this.id_break[1];
   }

   public Aw_1 id_break() {
      return (Aw_1)this.id_break[0];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLL()};
      id_class = var0;
   }

   private static void id_catch() {
      id_protected = new byte[]{2};
   }

   private static void id_case() {
      id_throws = new boolean[]{false, true};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }
}
