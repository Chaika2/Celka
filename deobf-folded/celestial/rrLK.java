package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLK {
   private static short[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   public rrLK() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1443817322369526160L;
   }

   public static rrLK id_class(rdn_3 var0, rpm_3 var1) {
      ((rrLK)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((rrLK)id_break[id_byte[2]]).id_class[1] = var1;
      return (rrLK)id_break[id_byte[4]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, -128, -36, -54, 9, 115, -76, 4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2062921975;
   }

   public rdn_3 id_class() {
      return (rdn_3)this.id_class[id_byte[5]];
   }

   public rpm_3 id_break() {
      return (rpm_3)this.id_class[1];
   }

   private static void id_throws() {
      id_throws = new byte[]{2};
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, true};
   }

   private static void id_case() {
      id_byte = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrLK()};
      id_break = var0;
   }
}
