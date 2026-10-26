package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTJ extends rrTB {
   private static String[] id_break;
   private static short[] id_byte;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-37, 100, -96, -82, -14, -66, -65, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrTJ() {
      super((rrTS)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[id_byte[0]], id_break[0], (rrTE[])rrTM.id_class[5]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3839814974473407163L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1131877762;
   }

   private static void id_implements() {
      id_byte = new short[]{0, 5};
   }

   private static void id_private() {
      id_break = new String[]{new String("Скрудж")};
   }
}
