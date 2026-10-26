package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAY extends Om_1 {
   private static boolean[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   private static byte[] id_throws;
   public static Object[] id_break;

   public rrAY() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, -114, -115, 60, 76, -58, 31, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rpm_3 id_class() {
      this.id_throws();
      return (rpm_3)this.id_class[id_protected[7]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5563997492241358330L;
   }

   public static rrAY id_class(rdn_3 var0, rpm_3 var1) {
      ((rrAY)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      ((rrAY)id_break[id_protected[2]]).id_class[id_protected[3]] = var1;
      ((rrAY)id_break[id_protected[4]]).id_class(id_byte[0]);
      return (rrAY)id_break[id_protected[5]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1780085815;
   }

   public rdn_3 id_break() {
      this.id_throws();
      return (rdn_3)this.id_class[id_protected[6]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_throws = new byte[]{2};
   }

   private static void id_case() {
      id_byte = new boolean[]{false, false, true};
   }

   private static void id_protected() {
      id_protected = new short[]{0, 0, 0, 1, 0, 0, 0, 1};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrAY()};
      id_break = var0;
   }
}
