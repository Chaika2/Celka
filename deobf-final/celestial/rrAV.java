package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAV {
   private static byte[] byte_;
   public Object[] class_;
   private static short[] protected_;
   public static Object[] break_;
   private static boolean[] throws_;
   private static float[] case_;

   public float byte_() {
      return (Float)this.class_[3];
   }

   public rrAV() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8399934829677997262L;
   }

   public static rrAV class_(an_3 var0, tp_3<?> var1, Ml_1 var2, float var3) {
      ((rrAV)break_[0]).class_[0] = var0;
      ((rrAV)break_[0]).class_[1] = var1;
      ((rrAV)break_[0]).class_[2] = var2;
      rrAV var10000 = (rrAV)break_[0];
      Float var11 = var3;
      var10000.class_[3] = var11;
      return (rrAV)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1138379745;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, 104, 107, -39, -52, -72, -69, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public tp_3<?> class_() {
      return (tp_3<?>)this.class_[1];
   }

   public Ml_1 break_() {
      return (Ml_1)this.class_[2];
   }

   private static void throws_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 1, 2, 3};
   }

   private static void finally_() {
      byte_ = new byte[]{4, 3};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrAV()};
      break_ = var0;
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[3] = 0.0F;
      }
   }

   private static void implements_() {
      throws_ = new boolean[]{false, true};
   }

   public an_3 protected_() {
      return (an_3)this.class_[0];
   }

   private static void private_() {
      case_ = new float[1];
   }
}
