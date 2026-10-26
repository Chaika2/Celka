package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnB_2 implements MinecraftAccessor {
   private static float[] byte_;
   public Object[] class_;
   private static short[] protected_;
   private static double[] throws_;
   public static Object[] break_;
   private static boolean[] case_;
   private static byte[] catch_;

   private static void byte_() {
      byte_ = new float[1];
   }

   public rrnB_2() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   public Ml_1 class_() {
      return (Ml_1)this.class_[0];
   }

   public static void class_(Ml_1 var0, float var1) {
      rrnB_2 var2 = break_(var0, var1);
      boolean var3 = ((Qw_1)import_.class_[20]).rs != 2 ? true : case_[1];
      if (var3) {
         rrnE_2.class_(2.0);
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).class_().class_(var0, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1]);
      if (var3) {
         rrnE_2.class_(const_.return_());
      }

      if ((cb_3)import_.class_[57] != null && (gm_3)import_.class_[56] != null) {
         rrvT var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_();
         var4.w().class_(var0, var1);
         var4.this_().class_(var1);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -111219804;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5407542977531287059L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, 127, 82, -13, -45, 99, -19, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrnB_2 break_(Ml_1 var0, float var1) {
      ((rrnB_2)break_[0]).class_[0] = var0;
      rrnB_2 var10000 = (rrnB_2)break_[0];
      Float var7 = var1;
      var10000.class_[1] = var7;
      return (rrnB_2)break_[0];
   }

   public float break_() {
      return (Float)this.class_[1];
   }

   private static void throws_() {
      case_ = new boolean[]{true, false, false, true, true};
   }

   private static void catch_() {
      catch_ = new byte[]{2, 2};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = 0.0F;
      }
   }

   private static void implements_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 20, 0, 0, 0, 1, 57, 56, 0, 0, 1};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrnB_2()};
      break_ = var0;
   }

   private static void private_() {
      throws_ = new double[]{2.0};
   }
}
