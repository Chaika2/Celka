package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bP_2 extends bM_2 {
   private static boolean[] byte_;
   public Object[] class_;
   private static short[] protected_;

   public bP_2(br_3 var1, C_class var2) {
      super(var2);
      this.implements_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4642546139004465218L;
   }

   @Override
   public void class_(bb_3 var1, rVi_1 var2) {
      this.implements_();
      super.class_(var1, var2);
      ((br_3)this.class_[0]).protected_();
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().static_().class_(var2);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -31, -36, 44, -107, 69, 2, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 601285070;
   }

   private static void finally_() {
      byte_ = new boolean[]{true};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void private_() {
      protected_ = new short[3];
   }
}
