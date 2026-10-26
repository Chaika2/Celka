package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoServerRots extends Module {
   private static boolean[] id_break;
   private static short[] id_byte;
   private static String[] id_protected;

   public NoServerRots() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1225496291;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5508295572345466364L;
   }

   @EventTarget
   public void id_class(rrAl_1 var1) {
      if ((cb_3)id_import.id_class[id_byte[1]] != null) {
         String var2 = ((cb_3)id_import.id_class[id_byte[2]]).id_short();
         if (var2 == null || !var2.contains(id_protected[2])) {
            var1.id_byte(id_break[0]);
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, -68, -41, 86, 10, 41, -95, -8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_byte = new short[]{4, 57, 57};
   }

   private static void id_new() {
      id_protected = new String[]{new String("No Server Rots"), new String("Убирает ротацию со стороны\nсервера"), new String("BotFilter (https://vk.cc/")};
   }

   private static void id_super() {
      id_break = new boolean[]{true};
   }
}
