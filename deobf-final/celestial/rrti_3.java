package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrti_3 {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   public rrti_3() {
      this.byte_();
      rrta_3 var5 = (rrta_3)rrta_3.staticFields0b9ba99d5751335787deb45ab94d73c6[0];
      this.class_[0] = var5;
      ArrayList var6 = new ArrayList();
      this.class_[3] = var6;
   }

   static {
      ntfClinit();
   }

   public rrti_3 class_(Pattern var1) {
      this.class_[1] = var1;
      return this;
   }

   public rrti_3 class_(rrta_3 var1) {
      this.class_[0] = var1;
      return this;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8473863149215780958L;
   }

   public rrte_3 class_() {
      return new rrte_3(this);
   }

   public rrti_3 class_(rrwr_3... var1) {
      ((List)this.class_[3]).addAll(List.of(var1));
      return this;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, 101, 75, -45, 11, 73, 55, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1488094577;
   }

   private static void break_() {
      break_ = new byte[]{4};
   }

   public rrti_3 break_(String var1) {
      this.class_[2] = var1;
      return this;
   }

   private static void protected_() {
      byte_ = new short[]{0, 0, 3, 3, 1, 0, 2};
   }
}
