package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLW {
   private static short[] id_byte;
   private static double[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_protected = new double[1];
   }

   public rrLW() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, -86, 5, -23, -95, -3, -95, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double id_class() {
      return (Double)this.id_class[id_byte[3]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -21183504;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2142014078659078932L;
   }

   public static rrLW id_class(double var0) {
      rrLW var10000 = (rrLW)id_break[id_byte[0]];
      Double var6 = var0;
      var10000.id_class[id_byte[1]] = var6;
      return (rrLW)id_break[id_byte[2]];
   }

   public void id_break(double var1) {
      Double var7 = var1;
      this.id_class[id_byte[4]] = var7;
   }

   private static void id_break() {
      id_throws = new boolean[]{false, true, false, true};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLW()};
      id_break = var0;
   }

   private static void id_case() {
      id_byte = new short[5];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[1]];
         Object[] var1 = this.id_class;
         var1[id_throws[2]] = id_protected[0];
      }
   }
}
