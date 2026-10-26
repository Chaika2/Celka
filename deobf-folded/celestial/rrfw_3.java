package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfw_3 {
   private static double[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   private static long[] id_throws;

   public void id_byte() {
      Long var5 = id_throws[0];
      this.id_class[id_byte[3]] = var5;
   }

   public rrfw_3() {
      this.id_private();
      Long var5 = this.id_case();
      this.id_class[id_byte[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6156807766121165946L;
   }

   public boolean id_class(double var1) {
      if (var1 <= id_break[0]) {
         return true;
      } else {
         return (double)(this.id_case() - this.id_class[id_byte[1]]) > var1 ? true : id_protected[2];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, 14, 25, 48, -84, -20, 120, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 197447281;
   }

   public void id_class() {
      Long var5 = this.id_case();
      this.id_class[id_byte[2]] = var5;
   }

   public long id_break() {
      return this.id_case() - (Long)this.id_class[id_byte[4]];
   }

   private static void id_throws() {
      id_break = new double[1];
   }

   private static void id_catch() {
      id_byte = new short[5];
   }

   private long id_case() {
      return System.currentTimeMillis();
   }

   private static void id_implements() {
      id_throws = new long[2];
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, true, false, true, false};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         this.id_class[0] = 0L;
      }
   }
}
