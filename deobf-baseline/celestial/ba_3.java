package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ba_3 {
   private static double[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_break = new double[4];
   }

   public ba_3(roE_2 var1) {
      this.id_break();
      Double var6 = var1.id_throws();
      this.id_class[id_protected[0]] = var6;
      Double var7 = var1.id_catch();
      this.id_class[id_protected[1]] = var7;
      Double var8 = var1.id_case();
      this.id_class[id_protected[2]] = var8;
      Double var9 = var1.id_private();
      this.id_class[id_protected[3]] = var9;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2022537167;
   }

   public boolean id_class(int var1, int var2) {
      return (double)var1 > this.id_class[id_protected[8]]
            && (double)(var1 + id_throws[4]) < this.id_class[id_protected[9]]
            && (double)var2 > this.id_class[id_protected[10]]
            && (double)(var2 + id_throws[5]) < this.id_class[id_protected[11]]
         ? id_throws[6]
         : id_throws[7];
   }

   private static void id_class() {
      id_protected = new short[]{0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -322604063719551415L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{64, 21, -101, -6, -29, -117, -113, 31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_break(int var1, int var2) {
      return (double)(var1 + id_throws[0]) > this.id_class[id_protected[4]]
            && (double)var1 < this.id_class[id_protected[5]]
            && (double)(var2 + id_throws[1]) > this.id_class[id_protected[6]]
            && (double)var2 < this.id_class[id_protected[7]]
         ? id_throws[2]
         : id_throws[3];
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
         var1[id_throws[8]] = id_break[0];
         var1[id_throws[9]] = id_break[1];
         var1[id_byte[1]] = id_break[2];
         var1[id_byte[2]] = id_break[3];
      }
   }

   private static void id_throws() {
      id_byte = new byte[]{4, 2, 3};
   }

   private static void id_protected() {
      id_throws = new boolean[]{true, true, true, false, true, true, true, false, false, true};
   }
}
