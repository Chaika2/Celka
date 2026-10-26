package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class j_1 {
   private static boolean[] byte_;
   public static Object[] class_;
   public Object[] break_;
   private static short[] protected_;
   private static byte[] throws_;

   public Y byte_() {
      return (Y)this.break_[0];
   }

   public j_1(Y var1, V var2, int var3) {
      this.implements_();
      this.break_[0] = var1;
      this.break_[1] = var2;
      Integer var10 = var3;
      this.break_[2] = var10;
   }

   static {
      ntfClinit();
   }

   public V class_() {
      return (V)this.break_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3169976418145927550L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{103, -57, -47, 62, -113, -77, -17, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1987888086;
   }

   public static synchronized BiFunction<Y, V, j_1> break_() {
      int var10000 = (Integer)class_[0];
      Integer var5 = var10000 + 1;
      class_[0] = var5;
      int var0 = var10000;
      return (var1, var2) -> new j_1(var1, var2, var0);
   }

   private static void throws_() {
      Object[] var0 = new Object[]{0};
      class_ = var0;
   }

   private static void catch_() {
      byte_ = new boolean[]{true, false, true, false, false};
   }

   private static void case_() {
      throws_ = new byte[]{3, 2};
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[2] = 0;
      }
   }

   public int protected_() {
      return (Integer)this.break_[2];
   }

   private static void private_() {
      protected_ = new short[]{0, 1, 2, 0, 0, 0, 1, 2};
   }
}
