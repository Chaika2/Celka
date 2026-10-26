package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ItemsOverlay extends Module {
   private static short[] id_break;
   private static String[] id_byte;

   public ItemsOverlay() {
      super(id_byte[0], id_byte[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5041061776836629246L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -724660369;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{51, -92, 70, 43, -99, 34, -110, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_break = new short[]{2};
   }

   private static void id_new() {
      id_byte = new String[]{new String("Items Overlay"), new String("Отображает полезные данные о\nпредметах в инвентаре")};
   }
}
