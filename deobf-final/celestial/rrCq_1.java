package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCq_1 {
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;
   public Object[] class_;
   public static Object[] break_;
   private static double[] case_;

   public Random byte_() {
      return (Random)this.class_[0];
   }

   public rrCq_1() {
      this.protected_();
      Random var5 = new Random();
      this.class_[0] = var5;
      Double var6 = 0.001;
      this.class_[2] = var6;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7105377690726990359L;
   }

   public rrTA class_() {
      return (rrTA)this.class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{39, -69, -33, 121, 114, 120, -95, 22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrCp_1 var1, List<rrTA> var2) {
      this.class_(0.01F);
      if ((rrTA)this.class_[1] == null) {
         this.class_(var2);
      }

      if ((rrTA)this.class_[1] != null) {
         if (var1.class_() == null) {
            var1.class_(rfl_3.catch_(0.1F, 0.1F, 0.1F).protected_(((rrTA)this.class_[1]).rr()));
         } else {
            rfl_3 var3 = var1.class_();
            rjU_2 var4 = var3.case_();
            rjU_2 var5 = ((rrTA)this.class_[1]).rr();
            rjU_2 var6 = var5.protected_(var4).protected_();
            rjU_2 var7 = var6.class_((Double)this.class_[2]);
            rfl_3 var8 = var3.protected_(var7.break_, var7.byte_, var7.protected_);
            var1.class_(var8);
            if (var4.case_(var5) < (Double)this.class_[2]) {
               this.class_(var2);
            }
         }
      }
   }

   public void class_(double var1) {
      Double var7 = var1;
      this.class_[2] = var7;
   }

   private void class_(List<rrTA> var1) {
      if (var1 != null && !var1.isEmpty()) {
         rrTA var7 = (rrTA)var1.get(((Random)this.class_[0]).nextInt(var1.size()));
         this.class_[1] = var7;
      } else {
         Object var6 = null;
         this.class_[1] = var6;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2136475356;
   }

   public double break_() {
      return (Double)this.class_[2];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{0.001};
      break_ = var0;
   }

   private static void catch_() {
      case_ = new double[]{0.001, 0.01F, 0.1F, 0.1F, 0.1F, 0.0, 0.001};
   }

   private static void case_() {
      throws_ = new short[]{0, 2, 1, 1, 1, 1, 2, 2, 1, 0, 1, 2, 0, 1, 2};
   }

   private static void implements_() {
      protected_ = new boolean[]{true, false};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         this.class_[2] = 0.0;
      }
   }

   private static void private_() {
      byte_ = new byte[]{3, 2};
   }
}
