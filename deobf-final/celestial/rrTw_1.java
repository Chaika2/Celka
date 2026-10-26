package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTw_1 {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static byte[] protected_;

   private static void byte_() {
      protected_ = new byte[]{2};
   }

   public rrTw_1(int var1) {
      this.case_();
      Integer var6 = var1;
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-66, 88, 79, 51, -92, 42, 109, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_() {
      return this.class_[1] > 0 ? true : break_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4231146467993932595L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 819378197;
   }

   public void class_(Runnable var1) {
      if ((Integer)this.class_[0] <= 0) {
         var1.run();
      } else {
         int var10002 = (Integer)this.class_[1] + 1;
         Integer var6 = var10002;
         this.class_[1] = var6;
         if (var10002 >= (Integer)this.class_[0]) {
            var1.run();
            this.break_();
         }
      }
   }

   public void break_() {
      Integer var5 = 0;
      this.class_[1] = var5;
   }

   private static void throws_() {
      byte_ = new short[]{0, 0, 1, 1, 0, 1, 1};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
      }
   }

   private static void protected_() {
      break_ = new boolean[]{true, true, false, false, false, false, true, false};
   }
}
