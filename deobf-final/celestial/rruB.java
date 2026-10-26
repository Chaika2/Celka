package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruB implements rrci_3 {
   public Object[] class_;
   private static short[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      break_ = new short[2];
   }

   public rruB() {
      this.break_();
      Object var5 = null;
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1314221589;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{126, 91, -86, 48, -82, 94, 105, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean class_() {
      return true;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9050381257782635624L;
   }

   @Override
   public Ok_1 class_(Hx_1 var1, cG_2 var2) {
      return var1.getBuffer(HU.byte_(var2.case_()));
   }

   @Override
   public void class_(cG_2 var1, int var2, Iq_1 var3, Ml_1 var4, Hx_1 var5, int var6, int var7) {
      var3.class_(var4, (Ok_1)this.class_[0], var6, fZ_2.class_);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      byte_ = new boolean[]{true, true};
   }
}
