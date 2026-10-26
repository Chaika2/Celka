package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrvR_1 extends rrvj_1 {
   public Object[] byte_;
   private static short[] protected_;
   private static float[] native_;
   private static byte[] volatile_;

   public rrvR_1(String var1, AnimValue var2, AnimValue var3) {
      super(var1, () -> 0.0F, () -> 0.0F);
      this.throw_();
      this.byte_[0] = var2;
      this.byte_[1] = var3;
   }

   static {
      ntfClinit();
   }

   private static void B() {
      volatile_ = new byte[]{2};
   }

   private static void s() {
      native_ = new float[2];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1887564283;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.throw_();
      super.class_(var1, var2, var3, var4, var5);
      ((AnimValue)this.byte_[0]).break_(this.goto_());
      ((AnimValue)this.byte_[1]).break_(this.while_());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6275630762978964419L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{35, -7, -100, -28, -71, 0, 100, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract float goto_();

   @Override
   public float implements_() {
      this.throw_();
      return ((AnimValue)this.byte_[0]).byte_();
   }

   private void throw_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[2];
         Object[] var1 = this.byte_;
      }
   }

   public AnimValue try_() {
      this.throw_();
      return (AnimValue)this.byte_[0];
   }

   public abstract float while_();

   public AnimValue public_() {
      this.throw_();
      return (AnimValue)this.byte_[1];
   }

   private static void E() {
      protected_ = new short[]{0, 1, 0, 1, 0, 1, 0, 1};
   }

   @Override
   public float ao_() {
      this.throw_();
      return ((AnimValue)this.byte_[1]).byte_();
   }
}
