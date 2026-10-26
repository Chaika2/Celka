package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrCk_1 extends rrTF<AutoTotem> {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;

   public abstract void byte_();

   public rrCk_1(AutoTotem var1) {
      super(var1);
      this.implements_();
      rrmi_3 var6 = new rrmi_3();
      this.class_[1] = var6;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-88, -88, 28, 80, 52, 125, 17, -95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6208523094248859915L;
   }

   public abstract void class_();

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1491900727;
   }

   public boolean break_() {
      this.implements_();
      return (Boolean)this.class_[0];
   }

   private static void throws_() {
      protected_ = new boolean[3];
   }

   private static void case_() {
      break_ = new byte[]{2};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[0] = false;
      }
   }

   public rrmi_3 protected_() {
      this.implements_();
      return (rrmi_3)this.class_[1];
   }

   private static void private_() {
      byte_ = new short[]{1, 0, 0, 1};
   }

   @Override
   public boolean aK_() {
      this.implements_();
      Boolean var5 = false;
      this.class_[0] = var5;
      return super.aK_();
   }
}
