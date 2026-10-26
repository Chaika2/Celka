package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvm_1 {
   private static byte[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;

   public String byte_() {
      return (String)this.class_[0];
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-25, 126, 51, -98, -8, 77, 20, -104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrvm_1(String var1, String var2, KeyBind var3) {
      this.catch_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrvm_1 var2 = (rrvm_1)var1;
         return (KeyBind)this.class_[2] == (KeyBind)var2.class_[2] ? true : byte_[3];
      } else {
         return byte_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((KeyBind)this.class_[2]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5027303227820135303L;
   }

   public KeyBind class_() {
      return (KeyBind)this.class_[2];
   }

   public rrvm_1 class_(KeyBind var1) {
      this.class_[2] = var1;
      return this;
   }

   public void class_(String var1) {
      this.class_[0] = var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1568634155;
   }

   public String break_() {
      return (String)this.class_[1];
   }

   public void break_(String var1) {
      this.class_[1] = var1;
   }

   private static void throws_() {
      byte_ = new boolean[]{true, false, true, false, true, false};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      protected_ = new short[]{2, 2, 2, 2, 0, 1, 2, 0, 1, 0, 1, 2};
   }

   private static void protected_() {
      break_ = new byte[]{3};
   }
}
