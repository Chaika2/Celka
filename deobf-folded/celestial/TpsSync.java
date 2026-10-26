package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TpsSync extends Module {
   private static String[] id_break;
   private static short[] id_byte;

   public TpsSync() {
      super(id_break[0], id_break[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4107154490091488369L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -975527643;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 67, 92, 110, 111, 66, -113, 71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_break = new String[]{new String("Tps Sync"), new String("Синхронизирует модули с\nтикрейтом сервера")};
   }

   private static void id_new() {
      id_byte = new short[]{4};
   }
}
