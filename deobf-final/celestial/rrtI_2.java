package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtI_2 {
   public Object[] class_;
   private static short[] break_;
   private static byte[] byte_;
   private static float[] protected_;
   private static boolean[] throws_;

   public float byte_() {
      return ((rrtw_3)this.class_[0]).final_();
   }

   public rrtI_2(rrtw_3 var1) {
      this.catch_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public boolean class_(rrtu_3 var1, float var2, float var3, int var4, int var5, int var6) {
      if (!((rrtw_3)this.class_[0]).return_().protected_()) {
         return false;
      } else {
         boolean var7 = ((rrtw_3)this.class_[0]).class_(var1, this, var2, var3, var4, var5, var6);
         if (!var7 && var6 < 3) {
            ((rrtw_3)this.class_[0]).class_(!((rrtw_3)this.class_[0]).class_() ? true : throws_[2]);
         }

         return var7;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1953597121147496050L;
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, int var4) {
      if (!((rrtw_3)this.class_[0]).return_().case_()) {
         return false;
      } else if (var1.class_(((rrtw_3)this.class_[0]).private_(), var2, var3)) {
         ((rrtw_3)this.class_[0]).class_(false);
         return true;
      } else {
         return throws_[6];
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 937799035;
   }

   public void class_(Ml_1 var1, int var2, int var3) {
      ((rrtw_3)this.class_[0]).class_(var1, this, var2, var3);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, 119, 44, -99, 22, -121, -66, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public float class_() {
      return Math.max(10.0F, ((rrtw_3)this.class_[0]).class_(10.0F, 0.0F));
   }

   public float break_() {
      return ((rrtw_3)this.class_[0]).package_() + ((rrtw_3)this.class_[0]).new_() - this.private_();
   }

   public float throws_() {
      return this.private_();
   }

   private static void finally_() {
      break_ = new short[14];
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void extends_() {
      byte_ = new byte[]{3};
   }

   private static void case_() {
      throws_ = new boolean[]{false, true, false, false, false, true, false, true};
   }

   private static void implements_() {
      protected_ = new float[]{10.0F, 10.0F, 0.0F};
   }

   public rruv_1 protected_() {
      return new rruv_1(this.break_(), this.byte_(), this.throws_(), this.class_());
   }

   private float private_() {
      return ((rrtw_3)this.class_[0]).public_();
   }
}
