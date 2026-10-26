package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class bq_3 implements PP, rz_3 {
   private static short[] break_;
   private static boolean[] throws_;
   private static byte[] catch_;
   public Object[] case_;

   public bq_3(C_class var1) {
      this.finally_();
      this.case_[0] = var1;
      Ps_1 var7 = var1.throw_();
      this.case_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7927040365553033380L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, 2, -58, 54, -48, -2, 7, 61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1279566370;
   }

   private void finally_() {
      if (this.case_ == null) {
         this.case_ = new Object[2];
         Object[] var1 = this.case_;
      }
   }

   @Override
   public boolean catch_() {
      return false;
   }

   private static void extends_() {
      throws_ = new boolean[1];
   }

   private static void implements_() {
      break_ = new short[]{0, 1, 0};
   }

   @Override
   public void protected_() {
      ((C_class)this.case_[0]).s().native_();
   }

   private static void final_() {
      catch_ = new byte[]{2};
   }
}
