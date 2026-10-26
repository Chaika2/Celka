package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BN {
   private static short[] id_break;
   private static double[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_byte = new double[1];
   }

   public BN(iB_2 var1, double var2) {
      this.id_protected();
      this.id_class[0] = var1;
      Double var9 = var2;
      this.id_class[1] = var9;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 436312998;
   }

   public iB_2 id_class() {
      return (iB_2)this.id_class[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 23, -93, -128, 109, -6, -3, 48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3229858023384329774L;
   }

   public double id_break() {
      return (Double)this.id_class[1];
   }

   private static void id_throws() {
      id_protected = new byte[]{2};
   }

   private static void id_catch() {
      id_throws = new boolean[]{true};
   }

   private static void id_case() {
      id_break = new short[]{0, 1, 0, 1};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = 0.0;
      }
   }
}
