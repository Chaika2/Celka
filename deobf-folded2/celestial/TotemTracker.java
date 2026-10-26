package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TotemTracker extends Module {
   private static String[] id_break;
   private static short[] id_byte;

   public TotemTracker() {
      super("Totem Tracker", "Отслеживает снос тотемов", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 996364963030403922L;
   }

   @EventTarget
   public void id_class(rrAp_1 var1) {
      rhd_3 var2 = var1.id_break();
      rdn_3 var3 = var1.id_class();
      rVi_1 var4 = new rgN_2("").id_class(rgF_2.GRAY);
      if (var2 == (cb_3)id_import.id_class[57]) {
         var4.id_break("Вы потеряли ");
      } else {
         var4.id_class(rrjZ_2.id_byte((an_3)var2)).id_break(" потерял ");
      }

      var4.id_class(var3.id_continue()).id_break(", зачарован: ").id_break(var3.id_public() ? rgF_2.GREEN + "✔" : rgF_2.RED + "✖");
      rrfu_3.id_class(var4);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -763390420;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-7, 28, -63, 89, -88, 19, 48, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_break = new String[]{
         new String("Totem Tracker"),
         new String("Отслеживает снос тотемов"),
         new String(""),
         new String("Вы потеряли "),
         new String(" потерял "),
         new String(", зачарован: ")
      };
   }

   private static void id_new() {
      id_byte = new short[]{4, 57};
   }
}
