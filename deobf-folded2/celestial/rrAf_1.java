package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAf_1 {
   private static short[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;

   public ryZ_2 id_byte() {
      return (ryZ_2)this.id_break[0];
   }

   public rrAf_1() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   public static rrAf_1 id_class(ryZ_2 var0, rdn_3 var1, rpm_3 var2) {
      ((rrAf_1)id_class[0]).id_break[0] = var0;
      ((rrAf_1)id_class[0]).id_break[1] = var1;
      ((rrAf_1)id_class[0]).id_break[2] = var2;
      return (rrAf_1)id_class[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 324437536;
   }

   public rpm_3 id_class() {
      return (rpm_3)this.id_break[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -764743288137495460L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{102, 7, 97, 103, 4, 16, 3, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rdn_3 id_break() {
      return (rdn_3)this.id_break[1];
   }

   private static void id_throws() {
      id_protected = new boolean[]{false, true};
   }

   private static void id_catch() {
      id_throws = new byte[]{3};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrAf_1()};
      id_class = var0;
   }

   private static void id_protected() {
      id_byte = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2};
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
      }
   }
}
