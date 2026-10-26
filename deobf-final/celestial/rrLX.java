package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLX {
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;
   public static Object[] break_;

   private static rrLX byte_(boolean var0) {
      rrLX var10000 = (rrLX)break_[0];
      Boolean var5 = var0;
      var10000.class_[0] = var5;
      return (rrLX)break_[0];
   }

   private static void byte_() {
      Object[] var0 = new Object[]{new rrLX()};
      break_ = var0;
   }

   public rrLX() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1793916002;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6087353979856394318L;
   }

   public boolean class_() {
      return (Boolean)this.class_[0];
   }

   public static rrLX class_(boolean var0) {
      rrLX var1 = byte_(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      return var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, -15, -108, -14, 3, -44, 114, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new boolean[]{false, true, false, false, true};
   }

   public void break_(boolean var1) {
      Boolean var6 = var1;
      this.class_[0] = var6;
   }

   private static void throws_() {
      protected_ = new short[7];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = false;
      }
   }
}
