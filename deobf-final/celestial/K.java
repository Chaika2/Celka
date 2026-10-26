package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class K<T> {
   private static String[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static short[] throws_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = false;
      }
   }

   public K(T var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return String.format("Overrideable{modified=%b,value=%s}", (Boolean)this.class_[1], this.class_[0].toString());
   }

   public boolean class_() {
      return (Boolean)this.class_[1];
   }

   public void class_(T var1) {
      this.class_[0] = var1;
      Boolean var7 = true;
      this.class_[1] = var7;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1142315506;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2924487239077934270L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, 48, -22, 0, 14, -120, 98, 102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public T break_() {
      return (T)this.class_[0];
   }

   private static void throws_() {
      throws_ = new short[]{0, 0, 0, 1, 1, 1, 0};
   }

   private static void catch_() {
      break_ = new String[]{new String("Overrideable{modified=%b,value=%s}")};
   }

   private static void case_() {
      protected_ = new byte[]{2, 2};
   }

   private static void protected_() {
      byte_ = new boolean[]{true, false, true, true, false};
   }
}
