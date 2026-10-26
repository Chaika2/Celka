package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjW_2 {
   public static Object[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static String[] id_protected;

   private static void id_byte() {
      Object[] var0 = new Object[]{id_protected[0], id_protected[1], id_protected[2], id_protected[3], id_protected[4], id_protected[5]};
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, -120, -81, -41, 102, -50, -55, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -936417963320825261L;
   }

   private static void id_class() {
      id_protected = new String[]{
         new String("SnowBall"),
         new String("STUN_STAR"),
         new String("ExplosiveStuff"),
         new String("EXPLOSIVE_TRAP"),
         new String("ALTERNATIVE_TRAP"),
         new String("backpack-inventory")
      };
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -653868657;
   }

   private static void id_break() {
      id_break = new byte[]{6, 2, 3, 4, 5};
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, true};
   }
}
