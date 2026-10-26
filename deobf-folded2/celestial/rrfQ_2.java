package celestial;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfQ_2 implements MinecraftAccessor {
   private static boolean[] id_break;
   private static double[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;
   public static Object[] id_class;
   private static float[] id_case;
   private static short[] id_catch;

   private static void id_byte() {
      Object[] var0 = new Object[]{new Random(), -1.0842022E-19F, 1.0842022E-19F, 1.0842022E-19F};
      id_class = var0;
   }

   public static float id_byte(float var0) {
      return (float)(Math.random() / (double)var0);
   }

   public static float id_byte(float var0, float var1) {
      return var0 + (var1 - var0) * ((Random)id_class[0]).nextFloat();
   }

   public static double id_byte(double var0, double var2) {
      return Math.sqrt(Math.pow(var0, 2.0) + Math.pow(var2, 2.0));
   }

   static {
      ntfClinit();
   }

   public static double id_class(Pr_1 var0, double var1, double var3) {
      return var1 + (var3 - var1) * var0.id_byte();
   }

   public static int id_class(int var0) {
      if (var0 == 0) {
         return 1;
      } else {
         var0 = --var0 | var0 >> 1;
         var0 |= var0 >> 2;
         var0 |= var0 >> 4;
         var0 |= var0 >> 8;
         var0 |= var0 >> 16;
         return var0 + 1;
      }
   }

   public static double id_class(double var0, double var2, float var4) {
      return var2 + (var0 - var2) * (double)var4;
   }

   public static boolean id_class(float var0, float var1, float var2) {
      return Math.abs(var0 - var1) <= var2 ? true : id_break[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, 76, 50, 87, 123, 52, 88, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static int id_class(double var0, double var2) {
      double var4 = Math.acos(1.0 - var2 / var0);
      int var6 = (int)Math.ceil((Math.PI * 2) / var4);
      return Math.max(var6, 3);
   }

   public static double id_class(Random var0, double var1, double var3) {
      return var1 + (var3 - var1) * var0.nextDouble();
   }

   public static int id_class(Random var0, int var1, int var2) {
      return var0.nextInt(var2 - var1) + var1;
   }

   public static float id_class(float var0) {
      return var0 * (float) (Math.PI / 180.0);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -274797370725067997L;
   }

   public static rfl_3 id_class(rfl_3 var0, rfl_3 var1, float var2) {
      return new rfl_3(
         id_class(var0.id_class, var1.id_class, var2),
         id_class(var0.id_break, var1.id_break, var2),
         id_class(var0.id_byte, var1.id_byte, var2),
         id_class(var0.id_protected, var1.id_protected, var2),
         id_class(var0.id_throws, var1.id_throws, var2),
         id_class(var0.id_case, var1.id_case, var2)
      );
   }

   private static void id_class() {
      id_catch = new short[2];
   }

   public static boolean id_class(double var0, double var2, double var4) {
      return Math.abs(var0 - var2) <= var4 ? true : id_break[3];
   }

   public static float id_class(Random var0, float var1, float var2) {
      return var1 + (var2 - var1) * var0.nextFloat();
   }

   public static float id_class(float var0, float var1) {
      double var2 = (double)Math.round(var0 / var1) * (double)var1;
      BigDecimal var4 = new BigDecimal(var2);
      var4 = var4.setScale(3, RoundingMode.HALF_UP);
      return var4.floatValue();
   }

   public static double id_class(double var0, int var2) {
      return (double)Math.round(var0 * Math.pow(10.0, (double)var2)) / Math.pow(10.0, (double)var2);
   }

   public static rjU_2 id_class(rjU_2 var0, rjU_2 var1, float var2) {
      return new rjU_2(
         id_class(var0.id_break, var1.id_break, var2), id_class(var0.id_byte, var1.id_byte, var2), id_class(var0.id_protected, var1.id_protected, var2)
      );
   }

   public static float id_break(float var0, float var1, float var2) {
      return var1 + (var0 - var1) * var2;
   }

   public static int id_break(Random var0, double var1, double var3) {
      if (var1 > var3) {
         throw new IllegalArgumentException("minX must be less than or equal to maxX");
      } else {
         return var0.nextInt((int)(var3 - var1 + 1.0)) + (int)var1;
      }
   }

   public static float id_break(float var0) {
      return var0 * (float) (180.0 / Math.PI);
   }

   private static void id_break() {
      id_protected = new String[]{new String("minX must be less than or equal to maxX")};
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -831225153;
   }

   public static double id_break(double var0, double var2) {
      double var4 = (double)Math.round(var0 / var2) * var2;
      BigDecimal var6 = new BigDecimal(var4);
      var6 = var6.setScale(3, RoundingMode.HALF_UP);
      return var6.doubleValue();
   }

   public static float id_break(float var0, float var1) {
      return Math.abs(var0 - var1);
   }

   public static int id_throws(double var0, double var2) {
      return id_break((Random)id_class[0], var0, var2);
   }

   private static void id_throws() {
      id_break = new boolean[]{true, false, true, false, true, true, true, false, true};
   }

   private static void id_catch() {
      id_case = new float[]{
         (float) (180.0 / Math.PI), (float) (Math.PI / 180.0), (float) (Math.PI / 180.0), (float) (180.0 / Math.PI), (float) (180.0 / Math.PI)
      };
   }

   private static void id_case() {
      id_byte = new double[]{2.0, 2.0, 10.0, 10.0, 1.0, 1.0, Math.PI * 2};
   }

   public static double id_protected(double var0, double var2) {
      return var0 + Math.random() * (var2 - var0);
   }

   private static void id_protected() {
      id_throws = new byte[]{3, 3, 2, 4, 8, 16, 3, 4, 2, 3};
   }
}
