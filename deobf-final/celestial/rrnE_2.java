package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnE_2 implements MinecraftAccessor {
   private static double[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;
   public static Object[] class_;
   public Object[] break_;
   private static float[] case_;
   private static byte[] catch_;

   private static void byte_() {
      protected_ = new boolean[]{false, true, true};
   }

   public rrnE_2() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -782906388;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, -99, -42, 32, 83, -121, -30, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(double var0) {
      ((Hh_1)import_.class_[16]).class_(const_, var0);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2648504740233290170L;
   }

   public static void class_(Ml_1 var0, float var1) {
      rrnE_2 var2 = break_(var0, var1);
      class_(2.0);
      ((rrjU_2)rrjU_2.staticFieldsf70af72d4e3133959ed8b9ae51cf5789[0]).class_(var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
      class_(const_.return_());
   }

   public Ml_1 class_() {
      return (Ml_1)this.break_[0];
   }

   public float break_() {
      return (Float)this.break_[1];
   }

   public static rrnE_2 break_(Ml_1 var0, float var1) {
      ((rrnE_2)class_[0]).break_[0] = var0;
      rrnE_2 var10000 = (rrnE_2)class_[0];
      Float var7 = var1;
      var10000.break_[1] = var7;
      return (rrnE_2)class_[0];
   }

   private static void throws_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 0, 16, 0, 1};
   }

   private static void catch_() {
      catch_ = new byte[]{2};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrnE_2()};
      class_ = var0;
   }

   private static void implements_() {
      byte_ = new double[]{2.0};
   }

   private static void protected_() {
      case_ = new float[1];
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[1] = 0.0F;
      }
   }
}
