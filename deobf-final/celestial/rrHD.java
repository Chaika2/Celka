package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHD implements Comparator<rLY> {
   private static byte[] break_;
   public static Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      protected_ = new boolean[]{false, true, false, true};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, -62, -46, -114, -20, 18, -44, 39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1184578071;
   }

   public int class_(rLY var1, rLY var2) {
      int var3 = ((List)class_[0]).indexOf(var1.class_());
      int var4 = ((List)class_[0]).indexOf(var2.class_());
      if (var3 == -1 && var4 == -1) {
         return 0;
      } else if (var3 == -1) {
         return 1;
      } else {
         return var4 == -1 ? -1 : Integer.compare(var3, var4);
      }
   }

   private static void class_() {
      break_ = new byte[]{-1, -1, -1, -1, -1};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4153987677645003447L;
   }

   private static void break_() {
      byte_ = new short[2];
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrHU()};
      class_ = var0;
   }
}
