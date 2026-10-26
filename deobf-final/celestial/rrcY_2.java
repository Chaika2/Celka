package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcY_2 extends rrfI_2<Boolean> {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcY_2(rrcR_2 var1, rrNw_1 var2) {
      this.protected_();
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7817861422760907657L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1463435338;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, -22, 85, 38, -112, 40, -118, 73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Boolean break_() {
      this.protected_();
      String var1 = ((rrNw_1)this.class_[0]).catch_();
      if (var1 == null) {
         return false;
      } else {
         return var1.equals(MinecraftAccessor.import_.while_().byte_()) ? false : break_[2];
      }
   }

   private static void throws_() {
      byte_ = new short[2];
   }

   private static void case_() {
      break_ = new boolean[]{false, false, true, true};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
