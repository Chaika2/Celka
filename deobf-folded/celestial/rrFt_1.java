package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFt_1 extends Om_1 {
   private static byte[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static boolean[] id_protected;
   private static short[] id_throws;
   private static double[] id_case;

   public rrFt_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-22, -99, 3, -78, -61, 19, -107, 52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(double var1) {
      this.id_throws();
      Double var7 = var1;
      this.id_class[id_throws[8]] = var7;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1400562983;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8901110558197226458L;
   }

   public double id_class() {
      this.id_throws();
      return (Double)this.id_class[id_throws[6]];
   }

   public static rrFt_1 id_class(double var0, boolean var2) {
      rrFt_1 var10000 = (rrFt_1)id_break[id_throws[0]];
      Double var7 = var0;
      var10000.id_class[id_throws[1]] = var7;
      var10000 = (rrFt_1)id_break[id_throws[2]];
      Boolean var8 = var2;
      var10000.id_class[1] = var8;
      ((rrFt_1)id_break[id_throws[4]]).id_class(id_protected[0]);
      return (rrFt_1)id_break[id_throws[5]];
   }

   public void id_break(boolean var1) {
      this.id_throws();
      Boolean var6 = var1;
      this.id_class[1] = var6;
   }

   public boolean id_break() {
      this.id_throws();
      return (Boolean)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[id_protected[2]] = id_case[0];
         var1[1] = id_protected[4];
      }
   }

   private static void id_catch() {
      id_byte = new byte[]{2};
   }

   private static void id_case() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 1};
   }

   private static void id_implements() {
      id_case = new double[1];
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, false, false, true, false, true};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrFt_1()};
      id_break = var0;
   }
}
