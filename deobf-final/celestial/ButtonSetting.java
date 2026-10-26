package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ButtonSetting extends Setting<Runnable> {
   private static short[] byte_;
   public Object[] break_;
   private static byte[] protected_;

   public ButtonSetting(Module var1, String var2, Runnable var3) {
      super(var2, var3);
      this.native_();
      this.break_[0] = var1;
      this.break_[1] = var3;
   }

   static {
      ntfClinit();
   }

   public Module class_() {
      this.native_();
      return (Module)this.break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -979700072;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7660900345133855223L;
   }

   public Runnable break_() {
      this.native_();
      return (Runnable)this.break_[1];
   }

   private static void finally_() {
      byte_ = new short[]{0, 1, 0, 1};
   }

   private static void extends_() {
      protected_ = new byte[]{2};
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-77, 9, -126, -51, 77, -1, -21, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void native_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }
}
