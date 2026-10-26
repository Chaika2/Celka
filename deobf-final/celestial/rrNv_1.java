package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNv_1 {
   public Object[] class_;
   private static boolean[] break_;
   private static long[] byte_;
   private static byte[] protected_;
   private static short[] throws_;

   public List<rrNd_1> byte_() {
      return (List<rrNd_1>)this.class_[0];
   }

   public rrNv_1(List<rrNd_1> var1, long var2, boolean var4) {
      this.case_();
      this.class_[0] = var1;
      Long var10 = var2;
      this.class_[1] = var10;
      Boolean var11 = var4;
      this.class_[2] = var11;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -100, 115, 67, 22, 89, 86, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -119346878;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2991489558425441312L;
   }

   public boolean class_() {
      return (Boolean)this.class_[2];
   }

   public long break_() {
      return (Long)this.class_[1];
   }

   private static void throws_() {
      byte_ = new long[1];
   }

   private static void catch_() {
      throws_ = new short[]{0, 1, 2, 0, 1, 2};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = 0L;
         var1[2] = false;
      }
   }

   private static void protected_() {
      protected_ = new byte[]{3, 2};
   }

   private static void private_() {
      break_ = new boolean[]{true, false};
   }
}
