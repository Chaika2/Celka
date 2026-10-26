package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAs_1 {
   public Object[] id_class;
   private static byte[] id_byte;
   public static Object[] id_break;
   private static boolean[] id_protected;
   private static short[] id_throws;
   private static double[] id_case;

   private static void id_byte() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 1, 0, 1};
   }

   public rrAs_1() {
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7298857769212079789L;
   }

   public static rrAs_1 id_class(rLY var0, double var1) {
      ((rrAs_1)id_break[id_throws[0]]).id_class[id_throws[1]] = var0;
      rrAs_1 var10000 = (rrAs_1)id_break[id_throws[2]];
      Double var8 = var1;
      var10000.id_class[id_throws[3]] = var8;
      return (rrAs_1)id_break[id_throws[4]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{102, -35, -26, -116, 97, -43, 49, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rLY var1) {
      this.id_class[id_throws[7]] = var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2101272974;
   }

   public void id_class(double var1) {
      Double var7 = var1;
      this.id_class[id_throws[8]] = var7;
   }

   public rLY id_class() {
      return (rLY)this.id_class[id_throws[5]];
   }

   public double id_break() {
      return (Double)this.id_class[id_throws[6]];
   }

   private static void id_throws() {
      id_byte = new byte[]{2};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[1]] = id_case[0];
      }
   }

   private static void id_case() {
      id_case = new double[1];
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, true, true};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrAs_1()};
      id_break = var0;
   }
}
