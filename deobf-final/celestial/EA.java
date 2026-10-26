package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EA {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;

   public rk_3 byte_() {
      return (rk_3)this.class_[0];
   }

   public EA() {
      this.throws_();
      En_1 var5 = new En_1();
      this.class_[1] = var5;
      HashMap var6 = new HashMap();
      this.class_[2] = var6;
   }

   static {
      ntfClinit();
   }

   public EA class_(Pm_1 var1, boolean var2) {
      ((Map)this.class_[2]).put(var1, var2);
      return this;
   }

   public EA class_(En_1 var1) {
      this.class_[1] = var1;
      return this;
   }

   public EA class_(rk_3 var1) {
      this.class_[0] = var1;
      return this;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, -13, 26, -50, -101, -86, -64, 53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1012984061;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5548255413247025014L;
   }

   public En_1 class_() {
      return (En_1)this.class_[1];
   }

   public Map<Pm_1, Boolean> break_() {
      return (Map<Pm_1, Boolean>)this.class_[2];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      break_ = new byte[]{3};
   }

   private static void protected_() {
      byte_ = new short[]{1, 2, 0, 0, 1, 1, 2, 2};
   }
}
