package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlr_3 extends rrTF<NoSlow> {
   public Object[] class_;
   private static String[] break_;
   private static boolean[] byte_;
   private static float[] protected_;
   private static short[] case_;

   private static void byte_() {
      case_ = new short[3];
   }

   public rrlr_3(NoSlow var1) {
      super(var1);
      this.protected_();
      rrIm_1 var6 = new rrIm_1("Скорость", 100.0F, 20.0F, 100.0F, 1.0F);
      this.class_[0] = var6;
      var1.class_(((rrIm_1)this.class_[0]).class_(() -> var1.new_() == this ? true : byte_[1]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrAB var1) {
      this.protected_();
      var1.break_(((rrIm_1)this.class_[0]).byte_() / 100.0F);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -114, -105, 52, -98, -34, -51, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2193176261155922981L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1169436654;
   }

   private static void class_() {
      byte_ = new boolean[]{true, false, true};
   }

   private static void break_() {
      protected_ = new float[]{100.0F, 20.0F, 100.0F, 1.0F, 100.0F};
   }

   private static void throws_() {
      break_ = new String[]{new String("Скорость")};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }
}
