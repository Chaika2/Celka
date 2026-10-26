package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlE_2 extends rrTF<Speed> {
   private static String[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static float[] case_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new boolean[]{true, false, true};
   }

   public rrlE_2(Speed var1) {
      super(var1);
      this.break_();
      rrIm_1 var6 = new rrIm_1("Скорость", 0.5F, 0.3F, 2.0F, 0.1F);
      this.class_[0] = var6;
      var1.class_(((rrIm_1)this.class_[0]).class_(() -> var1.new_() == this ? true : byte_[1]));
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5635585295514232056L;
   }

   private static void class_() {
      break_ = new String[]{new String("Скорость")};
   }

   @EventTarget
   public void class_(rrLz_1 var1) {
      this.break_();
      var1.class_(((rrIm_1)this.class_[0]).byte_());
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 788451313;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, -112, 108, 79, 47, 72, 43, -112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   private static void throws_() {
      protected_ = new short[3];
   }

   private static void protected_() {
      case_ = new float[]{0.5F, 0.3F, 2.0F, 0.1F};
   }
}
