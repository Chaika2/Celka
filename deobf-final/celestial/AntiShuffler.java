package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AntiShuffler extends Module {
   private static String[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   public AntiShuffler() {
      super("Anti Shuffler", "Убирает переключение слотов\nантичитом", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rvm_3 var2) {
         if ((cb_3)import_.class_[57] == null) {
            return;
         }

         uR_2 var4 = ((cq_3)import_.class_[19]).implements_();
         if (var4.protected_() == null && var4.class_() == null) {
            return;
         }

         rrfo_3.class_(var2.break_());
         rrfo_3.class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         var1.class_(true);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 667273603;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 595498148922535266L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, 114, -120, -73, 103, -107, -84, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      byte_ = new short[]{4, 57, 19, 57, 1};
   }

   private static void new_() {
      protected_ = new boolean[]{true};
   }

   private static void super_() {
      break_ = new String[]{new String("Anti Shuffler"), new String("Убирает переключение слотов\nантичитом")};
   }
}
