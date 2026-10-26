package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sl_1 extends SC {
   public Object[] class_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;

   public Sl_1(String var1, int var2) {
      super(var1);
      this.case_();
      Integer var7 = var2;
      this.class_[0] = var7;
   }

   public Sl_1(String var1) {
      this(var1, -1);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -547436702;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, 6, 34, 6, -76, -21, -11, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new byte[]{-1};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9124776747113590689L;
   }

   @Override
   public int break_() {
      this.case_();
      return (Integer)this.class_[0];
   }

   private static void throws_() {
      throws_ = new short[2];
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }

   private static void protected_() {
      protected_ = new boolean[]{true, false, false};
   }
}
