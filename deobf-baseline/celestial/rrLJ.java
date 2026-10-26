package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLJ extends Om_1 {
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static double[] id_throws;
   private static short[] id_case;
   public static Object[] id_break;

   public void id_byte(double var1) {
      this.id_private();
      Double var7 = var1;
      this.id_class[id_case[16]] = var7;
   }

   public rrLJ() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{107, -44, 119, -124, 52, 69, -100, 21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrLJ id_class(iB_2 var0, double var1, double var3, double var5) {
      ((rrLJ)id_break[id_case[0]]).id_class[id_case[1]] = var0;
      rrLJ var10000 = (rrLJ)id_break[id_case[2]];
      Double var12 = var1;
      var10000.id_class[id_case[3]] = var12;
      var10000 = (rrLJ)id_break[id_case[4]];
      Double var13 = var3;
      var10000.id_class[id_case[5]] = var13;
      var10000 = (rrLJ)id_break[id_case[6]];
      Double var14 = var5;
      var10000.id_class[id_case[7]] = var14;
      ((rrLJ)id_break[id_case[8]]).id_class(id_byte[0]);
      return (rrLJ)id_break[id_case[9]];
   }

   public iB_2 id_class() {
      this.id_private();
      return (iB_2)this.id_class[id_case[10]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5012982579143993206L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1037183455;
   }

   public void id_class(double var1) {
      this.id_private();
      Double var7 = var1;
      this.id_class[id_case[15]] = var7;
   }

   public void id_break(double var1) {
      this.id_private();
      Double var7 = var1;
      this.id_class[id_case[14]] = var7;
   }

   public double id_break() {
      this.id_private();
      return (Double)this.id_class[id_case[12]];
   }

   public double id_throws() {
      this.id_private();
      return (Double)this.id_class[id_case[13]];
   }

   private static void id_finally() {
      id_protected = new byte[]{4, 2, 3};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrLJ()};
      id_break = var0;
   }

   private static void id_extends() {
      id_byte = new boolean[]{false, false, true, true};
   }

   private static void id_case() {
      id_throws = new double[3];
   }

   private static void id_implements() {
      id_case = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 0, 1, 2, 3, 1, 2, 3};
   }

   public double id_protected() {
      this.id_private();
      return (Double)this.id_class[id_case[11]];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
         var1[id_byte[2]] = id_throws[0];
         var1[id_protected[1]] = id_throws[1];
         var1[id_protected[2]] = id_throws[2];
      }
   }
}
