package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongSupplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pr_1 {
   private static double[] byte_;
   public static Object[] class_;
   private static long[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;
   private static short[] catch_;
   public Object[] break_;

   public double byte_() {
      return (double)(this.break_() >>> 11) * 1.110223E-16F;
   }

   public Pr_1() {
      this(System.nanoTime() ^ System.currentTimeMillis());
   }

   private Pr_1(long[] var1) {
      this.throws_();
      this.break_[0] = var1;
   }

   public Pr_1(long var1) {
      this.throws_();
      AtomicLong var3 = new AtomicLong(var1);
      LongSupplier var4 = () -> {
         long var1x = var3.addAndGet(-7046029254386353131L);
         var1x = (var1x ^ var1x >>> 30) * -4658895280553007687L;
         var1x = (var1x ^ var1x >>> 27) * -7723592293110705685L;
         return var1x ^ var1x >>> 31;
      };
      long[] var9 = new long[]{var4.getAsLong(), var4.getAsLong(), var4.getAsLong(), var4.getAsLong()};
      this.break_[0] = var9;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0, int var2) {
      return var0 << var2 | var0 >>> 64 - var2;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1430502370;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7695174906451172496L;
   }

   public Pr_1 class_() {
      return new Pr_1(Arrays.copyOf((long[])this.break_[0], 4));
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-33, -47, -49, -44, 126, 83, -10, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public long break_() {
      long var1 = class_(((long[])this.break_[0])[0] + ((long[])this.break_[0])[3], 23) + ((long[])this.break_[0])[0];
      long var3 = ((long[])this.break_[0])[1] << 17;
      ((long[])this.break_[0])[2] = ((long[])this.break_[0])[2] ^ ((long[])this.break_[0])[0];
      ((long[])this.break_[0])[3] = ((long[])this.break_[0])[3] ^ ((long[])this.break_[0])[1];
      ((long[])this.break_[0])[1] = ((long[])this.break_[0])[1] ^ ((long[])this.break_[0])[2];
      ((long[])this.break_[0])[0] = ((long[])this.break_[0])[0] ^ ((long[])this.break_[0])[3];
      ((long[])this.break_[0])[2] = ((long[])this.break_[0])[2] ^ var3;
      ((long[])this.break_[0])[3] = class_(((long[])this.break_[0])[3], 45);
      return var1;
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void finally_() {
      Object[] var0 = new Object[]{1.110223E-16F};
      class_ = var0;
   }

   private static void catch_() {
      protected_ = new long[]{-7046029254386353131L, -4658895280553007687L, -7723592293110705685L};
   }

   private static void case_() {
      case_ = new boolean[]{false, true, false, false, true, false, true, true, false, true, true, false};
   }

   private static void implements_() {
      byte_ = new double[]{1.110223E-16F, 1.110223E-16F};
   }

   private static void protected_() {
      throws_ = new byte[]{4, 2, 3, 11, 3, 23, 17, 2, 3, 2, 3, 2, 3, 3, 45, 4, 64, 30, 27, 31};
   }

   private static void private_() {
      catch_ = new short[18];
   }
}
