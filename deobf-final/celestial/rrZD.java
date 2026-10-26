package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZD implements rrZp_1 {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   private static float[] throws_;

   private static void byte_() {
      break_ = new short[]{0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 0};
   }

   @Override
   public void byte_(rrIX var1) {
      ((rrZw_1)this.class_[0]).break_(var1.class_());
   }

   public rrZD(rrZw_1 var1, Supplier<Float> var2, Supplier<Float> var3, float var4, float var5) {
      this.throws_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
      Float var13 = var4;
      this.class_[3] = var13;
      Float var14 = var5;
      this.class_[4] = var14;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -415882283;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3341368454143812629L;
   }

   private static void class_() {
      protected_ = new boolean[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{31, -116, -127, 95, -103, 122, -51, 14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      throws_ = new float[2];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
      }
   }

   @Override
   public void protected_(rrIX var1) {
      rrZa_1 var2 = new rrZa_1(
         (rrZw_1)this.class_[0], var1, (Supplier<Float>)this.class_[1], (Supplier<Float>)this.class_[2], (Float)this.class_[3], (Float)this.class_[4]
      );
      ((rrZw_1)this.class_[0]).class_(0, var2);
   }

   private static void protected_() {
      byte_ = new byte[]{5, 3, 4};
   }
}
