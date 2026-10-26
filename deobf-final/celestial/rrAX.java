package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAX implements MinecraftAccessor {
   private static short[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;
   public Object[] break_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrAX()};
      class_ = var0;
   }

   public rrAX() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static rrAX class_() {
      rrAX var0 = break_(new PX((Float)((cb_3)import_.class_[57]).throws_[15], (Float)((cb_3)import_.class_[57]).throws_[16]));
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var0);
      return var0;
   }

   public void class_(PX var1) {
      this.break_[0] = var1;
      cb_3 var10000 = (cb_3)import_.class_[57];
      Float var7 = var1.throws_();
      var10000.private_[25] = var7;
      var10000 = (cb_3)import_.class_[57];
      Float var8 = var1.protected_();
      var10000.private_[26] = var8;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3850867614614397133L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, -94, -82, 113, 50, -46, 0, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1037995513;
   }

   public static rrAX break_(PX var0) {
      ((rrAX)class_[0]).break_[0] = var0;
      return (rrAX)class_[0];
   }

   public PX break_() {
      return (PX)this.break_[0];
   }

   private static void throws_() {
      byte_ = new short[]{0, 0, 0, 57, 15, 57, 16, 0, 0, 0, 57, 25, 57, 26, 0};
   }

   private static void case_() {
      protected_ = new boolean[]{false, true, true};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
