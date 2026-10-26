package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rl_3 implements rq_3 {
   public Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;

   @Override
   public int byte_() {
      return (Integer)this.class_[2];
   }

   public rl_3() {
      this(0, 0, 0);
   }

   public rl_3(int var1, int var2, int var3) {
      this.private_();
      Integer var8 = var1;
      this.class_[0] = var8;
      Integer var9 = var2;
      this.class_[1] = var9;
      Integer var10 = var3;
      this.class_[2] = var10;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7595321734947514677L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-113, 108, -86, -107, -4, -57, -11, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -178144244;
   }

   @Override
   public int class_() {
      return (Integer)this.class_[1];
   }

   @Override
   public int break_() {
      return (Integer)this.class_[0];
   }

   private static void throws_() {
      byte_ = new byte[]{3, 2};
   }

   private static void catch_() {
      break_ = new boolean[]{false, false, false, false, false, true, false, false};
   }

   private static void case_() {
      protected_ = new short[]{0, 1, 2, 0, 1, 2};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
      }
   }
}
