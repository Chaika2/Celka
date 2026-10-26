package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FriendProtect extends Module {
   private static boolean[] break_;
   private static String[] byte_;
   private static short[] protected_;

   public FriendProtect() {
      super("Friend Protect", "Отменяет урон по друзьям", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -171361038;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4037894801017577190L;
   }

   @EventTarget(
      id_class = -200
   )
   public void class_(rrAW var1) {
      rfo_3 var2 = var1.class_();
      if (var2 != null) {
         if (var2.class_() instanceof cG_2 var4 && ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(var4)) {
            var1.class_(true);
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, -53, 1, 3, -63, -27, -9, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      protected_ = new short[2];
   }

   private static void new_() {
      byte_ = new String[]{new String("Friend Protect"), new String("Отменяет урон по друзьям")};
   }

   private static void super_() {
      break_ = new boolean[]{true};
   }
}
