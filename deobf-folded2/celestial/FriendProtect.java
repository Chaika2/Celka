package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FriendProtect extends Module {
   private static boolean[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;

   public FriendProtect() {
      super("Friend Protect", "Отменяет урон по друзьям", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -171361038;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4037894801017577190L;
   }

   @EventTarget(
      id_class = -200
   )
   public void id_class(rrAW var1) {
      rfo_3 var2 = var1.id_class();
      if (var2 != null) {
         if (var2.id_class() instanceof cG_2 var4 && ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(var4)) {
            var1.id_class(true);
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, -53, 1, 3, -63, -27, -9, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_protected = new short[2];
   }

   private static void id_new() {
      id_byte = new String[]{new String("Friend Protect"), new String("Отменяет урон по друзьям")};
   }

   private static void id_super() {
      id_break = new boolean[]{true};
   }
}
