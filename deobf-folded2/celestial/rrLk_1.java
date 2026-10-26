package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLk_1 {
   private static boolean[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static short[] id_protected;
   private static double[] id_throws;

   private static void id_byte() {
      id_protected = new short[5];
   }

   public rrLk_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -8, 51, -13, -57, -105, 100, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6109696586066393299L;
   }

   public double id_class() {
      return (Double)this.id_class[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2062757537;
   }

   public void id_class(double var1) {
      Double var7 = var1;
      this.id_class[0] = var7;
   }

   public static rrLk_1 id_break(double var0) {
      rrLk_1 var10000 = (rrLk_1)id_break[0];
      Double var6 = var0;
      var10000.id_class[0] = var6;
      return (rrLk_1)id_break[0];
   }

   private static void id_break() {
      id_throws = new double[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[0] = 0.0;
      }
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrLk_1()};
      id_break = var0;
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, true, false, true};
   }
}
