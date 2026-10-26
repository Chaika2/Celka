package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class En_1 {
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] class_;

   private static void byte_() {
      break_ = new byte[]{2};
   }

   public En_1() {
      this(null, false);
   }

   public En_1(PX var1, boolean var2) {
      this.case_();
      this.class_[0] = var1;
      Boolean var8 = var2;
      this.class_[1] = var8;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -808027246108947349L;
   }

   public En_1 class_(PX var1) {
      this.class_[0] = var1;
      return this;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{94, -45, -72, 44, 4, -82, -36, 9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -201943199;
   }

   public boolean class_() {
      return (Boolean)this.class_[1];
   }

   public Optional<PX> break_() {
      return Optional.ofNullable((PX)this.class_[0]);
   }

   private static void throws_() {
      byte_ = new short[]{0, 1, 0, 0, 1};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = false;
      }
   }

   private static void protected_() {
      protected_ = new boolean[]{false, true, false};
   }
}
