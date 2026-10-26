package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ItemsOverlay extends Module {
   private static short[] break_;
   private static String[] byte_;

   public ItemsOverlay() {
      super("Items Overlay", "Отображает полезные данные о\nпредметах в инвентаре", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5041061776836629246L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -724660369;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{51, -92, 70, 43, -99, 34, -110, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      break_ = new short[]{2};
   }

   private static void new_() {
      byte_ = new String[]{new String("Items Overlay"), new String("Отображает полезные данные о\nпредметах в инвентаре")};
   }
}
