package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TotemTracker extends Module {
   private static String[] break_;
   private static short[] byte_;

   public TotemTracker() {
      super("Totem Tracker", "Отслеживает снос тотемов", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 996364963030403922L;
   }

   @EventTarget
   public void class_(rrAp_1 var1) {
      rhd_3 var2 = var1.break_();
      rdn_3 var3 = var1.class_();
      rVi_1 var4 = new rgN_2("").class_(rgF_2.GRAY);
      if (var2 == (cb_3)import_.class_[57]) {
         var4.break_("Вы потеряли ");
      } else {
         var4.class_(rrjZ_2.byte_((an_3)var2)).break_(" потерял ");
      }

      var4.class_(var3.continue_()).break_(", зачарован: ").break_(var3.public_() ? rgF_2.GREEN + "✔" : rgF_2.RED + "✖");
      rrfu_3.class_(var4);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -763390420;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-7, 28, -63, 89, -88, 19, 48, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      break_ = new String[]{
         new String("Totem Tracker"),
         new String("Отслеживает снос тотемов"),
         new String(""),
         new String("Вы потеряли "),
         new String(" потерял "),
         new String(", зачарован: ")
      };
   }

   private static void new_() {
      byte_ = new short[]{4, 57};
   }
}
