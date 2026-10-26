package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqH_2 {
   private static float[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] class_;
   private static boolean[] throws_;

   public void byte_() {
      ((AnimValue)this.class_[2]).class_((Boolean)((Supplier)this.class_[1]).get());
   }

   public rrqH_2(Supplier<StringBuilder> var1, Supplier<Boolean> var2) {
      this.finally_();
      AnimValue var7 = new AnimValue(0.5F, false);
      this.class_[2] = var7;
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   public void class_(AnimValue var1) {
      this.class_[2] = var1;
   }

   public Supplier<StringBuilder> class_() {
      return (Supplier<StringBuilder>)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{43, -22, 94, -34, 1, 5, -53, -107}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1555469603;
   }

   public void class_(Supplier<Boolean> var1) {
      this.class_[1] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2354895094762763557L;
   }

   public float break_() {
      return ((AnimValue)this.class_[2]).byte_() * 8.0F;
   }

   public void break_(Supplier<StringBuilder> var1) {
      this.class_[0] = var1;
   }

   public AnimValue throws_() {
      return (AnimValue)this.class_[2];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
      }
   }

   private static void catch_() {
      protected_ = new short[]{2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void case_() {
      throws_ = new boolean[1];
   }

   private static void implements_() {
      break_ = new float[]{0.5F, 8.0F};
   }

   public Supplier<Boolean> protected_() {
      return (Supplier<Boolean>)this.class_[1];
   }

   private static void private_() {
      byte_ = new byte[]{3};
   }
}
