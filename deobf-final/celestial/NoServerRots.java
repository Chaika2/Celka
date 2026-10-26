package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoServerRots extends Module {
   private static boolean[] break_;
   private static short[] byte_;
   private static String[] protected_;

   public NoServerRots() {
      super("No Server Rots", "Убирает ротацию со стороны\nсервера", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1225496291;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5508295572345466364L;
   }

   @EventTarget
   public void class_(rrAl_1 var1) {
      if ((cb_3)import_.class_[57] != null) {
         String var2 = ((cb_3)import_.class_[57]).short_();
         if (var2 == null || !var2.contains("BotFilter (https://vk.cc/")) {
            var1.byte_(true);
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, -68, -41, 86, 10, 41, -95, -8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      byte_ = new short[]{4, 57, 57};
   }

   private static void new_() {
      protected_ = new String[]{new String("No Server Rots"), new String("Убирает ротацию со стороны\nсервера"), new String("BotFilter (https://vk.cc/")};
   }

   private static void super_() {
      break_ = new boolean[]{true};
   }
}
