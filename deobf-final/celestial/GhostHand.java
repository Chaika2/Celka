package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GhostHand extends Module {
   private static String[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   public GhostHand() {
      super("Ghost Hand", "Позволяет взаимодействовать с\nконтейнерами сквозь стены", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
   }

   static {
      ntfClinit();
   }

   @EventTarget(
      id_class = -200
   )
   public void class_(rrAW var1) {
      var1.class_(true);
   }

   @EventTarget(
      id_class = -200
   )
   public void class_(rrAk_1 var1) {
      rff_3 var2 = var1.break_();
      if (var2 != null) {
         xc_3 var3 = var1.class_();
         rfH_2 var4 = var2.class_();
         rJZ var5 = var3.break_().class_(var3, (gm_3)import_.class_[56], var4);
         ryO_2 var6 = ((gm_3)import_.class_[56]).class_(var4);
         if (var5 == null && var6 == null) {
            var1.class_(null);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1777638947;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3755017694607256116L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-44, 47, 75, 127, 36, 51, 21, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      break_ = new String[]{new String("Ghost Hand"), new String("Позволяет взаимодействовать с\nконтейнерами сквозь стены")};
   }

   private static void new_() {
      byte_ = new short[]{3, 56, 56};
   }

   private static void super_() {
      protected_ = new boolean[]{true};
   }
}
