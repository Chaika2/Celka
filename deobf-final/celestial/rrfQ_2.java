package celestial;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfQ_2 implements MinecraftAccessor {
   private static boolean[] break_;
   private static double[] byte_;
   private static String[] protected_;
   private static byte[] throws_;
   public static Object[] class_;
   private static float[] case_;
   private static short[] catch_;

   private static void byte_() {
      Object[] var0 = new Object[]{new Random(), -1.0842022E-19F, 1.0842022E-19F, 1.0842022E-19F};
      class_ = var0;
   }

   public static float byte_(float var0) {
      return (float)(Math.random() / (double)var0);
   }

   public static float byte_(float var0, float var1) {
      return var0 + (var1 - var0) * ((Random)class_[0]).nextFloat();
   }

   public static double byte_(double var0, double var2) {
      return Math.sqrt(Math.pow(var0, 2.0) + Math.pow(var2, 2.0));
   }

   static {
      ntfClinit();
   }

   public static double class_(Pr_1 var0, double var1, double var3) {
      return var1 + (var3 - var1) * var0.byte_();
   }

   public static int class_(int var0) {
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

   public static double class_(double var0, double var2, float var4) {
      return var2 + (var0 - var2) * (double)var4;
   }

   public static boolean class_(float var0, float var1, float var2) {
      return Math.abs(var0 - var1) <= var2 ? true : break_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, 76, 50, 87, 123, 52, 88, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static int class_(double var0, double var2) {
      double var4 = Math.acos(1.0 - var2 / var0);
      int var6 = (int)Math.ceil((Math.PI * 2) / var4);
      return Math.max(var6, 3);
   }

   public static double class_(Random var0, double var1, double var3) {
      return var1 + (var3 - var1) * var0.nextDouble();
   }

   public static int class_(Random var0, int var1, int var2) {
      return var0.nextInt(var2 - var1) + var1;
   }

   public static float class_(float var0) {
      return var0 * (float) (Math.PI / 180.0);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -274797370725067997L;
   }

   public static rfl_3 class_(rfl_3 var0, rfl_3 var1, float var2) {
      return new rfl_3(
         class_(var0.class_, var1.class_, var2),
         class_(var0.break_, var1.break_, var2),
         class_(var0.byte_, var1.byte_, var2),
         class_(var0.protected_, var1.protected_, var2),
         class_(var0.throws_, var1.throws_, var2),
         class_(var0.case_, var1.case_, var2)
      );
   }

   private static void class_() {
      catch_ = new short[2];
   }

   public static boolean class_(double var0, double var2, double var4) {
      return Math.abs(var0 - var2) <= var4 ? true : break_[3];
   }

   public static float class_(Random var0, float var1, float var2) {
      return var1 + (var2 - var1) * var0.nextFloat();
   }

   public static float class_(float var0, float var1) {
      double var2 = (double)Math.round(var0 / var1) * (double)var1;
      BigDecimal var4 = new BigDecimal(var2);
      var4 = var4.setScale(3, RoundingMode.HALF_UP);
      return var4.floatValue();
   }

   public static double class_(double var0, int var2) {
      return (double)Math.round(var0 * Math.pow(10.0, (double)var2)) / Math.pow(10.0, (double)var2);
   }

   public static rjU_2 class_(rjU_2 var0, rjU_2 var1, float var2) {
      return new rjU_2(class_(var0.break_, var1.break_, var2), class_(var0.byte_, var1.byte_, var2), class_(var0.protected_, var1.protected_, var2));
   }

   public static float break_(float var0, float var1, float var2) {
      return var1 + (var0 - var1) * var2;
   }

   public static int break_(Random var0, double var1, double var3) {
      if (var1 > var3) {
         throw new IllegalArgumentException("minX must be less than or equal to maxX");
      } else {
         return var0.nextInt((int)(var3 - var1 + 1.0)) + (int)var1;
      }
   }

   public static float break_(float var0) {
      return var0 * (float) (180.0 / Math.PI);
   }

   private static void break_() {
      protected_ = new String[]{new String("minX must be less than or equal to maxX")};
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -831225153;
   }

   public static double break_(double var0, double var2) {
      double var4 = (double)Math.round(var0 / var2) * var2;
      BigDecimal var6 = new BigDecimal(var4);
      var6 = var6.setScale(3, RoundingMode.HALF_UP);
      return var6.doubleValue();
   }

   public static float break_(float var0, float var1) {
      return Math.abs(var0 - var1);
   }

   public static int throws_(double var0, double var2) {
      return break_((Random)class_[0], var0, var2);
   }

   private static void throws_() {
      break_ = new boolean[]{true, false, true, false, true, true, true, false, true};
   }

   private static void catch_() {
      case_ = new float[]{
         (float) (180.0 / Math.PI), (float) (Math.PI / 180.0), (float) (Math.PI / 180.0), (float) (180.0 / Math.PI), (float) (180.0 / Math.PI)
      };
   }

   private static void case_() {
      byte_ = new double[]{2.0, 2.0, 10.0, 10.0, 1.0, 1.0, Math.PI * 2};
   }

   public static double protected_(double var0, double var2) {
      return var0 + Math.random() * (var2 - var0);
   }

   private static void protected_() {
      throws_ = new byte[]{3, 3, 2, 4, 8, 16, 3, 4, 2, 3};
   }
}
