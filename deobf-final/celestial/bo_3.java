package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bo_3 implements D {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;

   private static void byte_() {
      break_ = new boolean[]{true};
   }

   public bo_3(bY_2 var1) {
      this.class_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 820737075;
   }

   @Override
   public void class_(j_1 var1) {
      if (var1.class_() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0]) {
         ((bY_2)this.class_[0]).volatile_();
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, 10, -52, -113, 54, -43, 115, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5143892211699326403L;
   }

   private static void break_() {
      byte_ = new short[3];
   }
}
