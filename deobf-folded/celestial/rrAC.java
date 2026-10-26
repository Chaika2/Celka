package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAC extends Om_1 {
   public Object[] id_class;
   public static Object[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   public rrAC() {
      this.id_implements();
   }

   static {
      ntfClinit();
   }

   public rpm_3 id_class() {
      this.id_implements();
      return (rpm_3)this.id_class[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1034713731;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 41, 84, 24, 18, -114, -115, -53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAC id_class(Y var0, rdn_3 var1, rpm_3 var2) {
      ((rrAC)id_break[id_byte[0]]).id_class[2] = var0;
      ((rrAC)id_break[id_byte[2]]).id_class[id_byte[3]] = var1;
      ((rrAC)id_break[id_byte[4]]).id_class[1] = var2;
      ((rrAC)id_break[id_byte[6]]).id_class(id_protected[0]);
      return (rrAC)id_break[id_byte[7]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2699621281110626791L;
   }

   public Y id_break() {
      this.id_implements();
      return (Y)this.id_class[2];
   }

   private static void id_throws() {
      id_protected = new boolean[]{false, false, true};
   }

   private static void id_catch() {
      id_byte = new short[]{0, 2, 0, 0, 0, 1, 0, 0, 0, 1, 2};
   }

   private static void id_case() {
      id_throws = new byte[]{3};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   public rdn_3 id_protected() {
      this.id_implements();
      return (rdn_3)this.id_class[id_byte[8]];
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrAC()};
      id_break = var0;
   }
}
