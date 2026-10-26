package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pq_1 extends Pv_1 {
   private static long[] protected_;
   public Object[] break_;
   private static boolean[] throws_;
   private static short[] case_;
   private static double[] catch_;
   private static byte[] private_;
   public static Object[] byte_;

   private static void byte_() {
      Object[] var0 = new Object[]{20};
      byte_ = var0;
   }

   public Pq_1(C_class var1) {
      super(var1);
      this.private_();
      rrfw_3 var6 = new rrfw_3();
      this.break_[0] = var6;
      Long var7 = TimeUnit.MINUTES.toMillis(2L);
      this.break_[1] = var7;
      ArrayDeque var8 = new ArrayDeque();
      this.break_[2] = var8;
      Long var9 = -1L;
      this.break_[3] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrLU var1) {
      this.private_();
      super.class_(var1);
      if ((Long)this.break_[3] != -1L) {
         ((Queue)this.break_[2]).add(rqR_2.break_() - (Long)this.break_[3]);
         Long var6 = -1L;
         this.break_[3] = var6;
      }
   }

   @Override
   public void class_(rrAM var1) {
      this.private_();
      super.class_(var1);
      ((rrfw_3)this.break_[0]).class_();
      ((Queue)this.break_[2]).clear();
      Long var6 = -1L;
      this.break_[3] = var6;
   }

   @Override
   public void class_(j_1 var1) {
      this.private_();
      super.class_(var1);
      if (!((Queue)this.break_[2]).isEmpty()) {
         if (((rrfw_3)this.break_[0]).class_((double)((Long)this.break_[1]).longValue())) {
            ((Queue)this.break_[2]).clear();
            ((rrfw_3)this.break_[0]).class_();
         }

         if (((Queue)this.break_[2]).size() > 20) {
            ((Queue)this.break_[2]).poll();
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7707361345434514669L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1584471315;
   }

   public long class_() {
      this.private_();
      return ((Queue)this.break_[2]).size() < 20 ? 0L : (long)((Queue)this.break_[2]).stream().mapToLong(Long::longValue).average().orElse(0.0);
   }

   @Override
   public void class_(rrFe_1 var1) {
      this.private_();
      super.class_(var1);
      rrFa_1 var2 = var1.break_();
      if (var2 == (rrFa_1)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[0] && (Long)this.break_[3] == -1L) {
         Long var7 = rqR_2.break_();
         this.break_[3] = var7;
         ((rrfw_3)this.break_[0]).class_();
      }
   }

   private static void break_() {
      throws_ = new boolean[]{true, true, false};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{80, -112, -50, 110, -28, -66, -97, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      private_ = new byte[]{20, 20, 4, 3, 20};
   }

   private static void catch_() {
      case_ = new short[]{0, 1, 2, 3, 2, 0, 1, 2, 0, 2, 2, 0, 3, 3, 0, 3, 2, 3, 3, 0, 2, 3, 2, 2};
   }

   private static void case_() {
      protected_ = new long[]{2L, -1L, -1L, -1L, -1L, -1L, 0L, 0L, 0L};
   }

   private static void protected_() {
      catch_ = new double[1];
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
         var1[1] = 0L;
         var1[3] = 0L;
      }
   }
}
