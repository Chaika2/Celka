package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sf_1 implements Runnable {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   Sf_1(SI var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void run() {
      while (true) {
         try {
            rfj_3 var1 = (rfj_3)((LinkedBlockingQueue)((SI)this.class_[byte_[1]]).break_[byte_[2]]).take();
            roJ_2 var2 = (roJ_2)((Map)((SI)this.class_[byte_[3]]).break_[byte_[4]]).remove(var1);
            if (((LinkedBlockingQueue)((SI)this.class_[byte_[5]]).break_[byte_[6]]).size() <= (Integer)C_class.instanceof_().rw.class_[byte_[7]]) {
               St_1 var3 = Sj_1.class_(var2);
               ((SI)this.class_[byte_[8]]).class_(var3);
            }
         } catch (InterruptedException var4) {
            var4.printStackTrace();
            return;
         } catch (Throwable var5) {
            var5.printStackTrace();
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1801402066;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2409789568923652307L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, 29, -88, -44, -4, -56, -89, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new boolean[]{true};
   }

   private static void break_() {
      byte_ = new short[]{0, 0, 2, 0, 3, 0, 2, 0, 0};
   }
}
