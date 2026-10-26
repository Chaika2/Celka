package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFG implements rrFE {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static float[] protected_;
   private static boolean[] throws_;

   @Override
   public String byte_() {
      return ((Module)this.class_[0]).final_();
   }

   public rrFG(Module var1) {
      this.finally_();
      AnimValue var6 = new AnimValue(0.5F, false);
      this.class_[1] = var6;
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(boolean var1) {
      ((AnimValue)this.class_[1]).class_(var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1534443748;
   }

   @Override
   public AnimValue class_() {
      return (AnimValue)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7187839267519686352L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{94, 51, 11, -89, -102, 122, -82, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public String break_() {
      return "[" + ((Module)this.class_[0]).package_().break_() + "]";
   }

   @Override
   public boolean throws_() {
      return ((Module)this.class_[0]).aJ_() && ((Module)this.class_[0]).package_() != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]
         ? true
         : throws_[2];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      throws_ = new boolean[]{false, true, false, false};
   }

   private static void extends_() {
      protected_ = new float[]{0.5F};
   }

   public KeyBind case_() {
      return ((Module)this.class_[0]).package_();
   }

   private static void implements_() {
      break_ = new byte[]{2};
   }

   @Override
   public boolean protected_() {
      return false;
   }

   private static void private_() {
      byte_ = new short[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 0};
   }
}
