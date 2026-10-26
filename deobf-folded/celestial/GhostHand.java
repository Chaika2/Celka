package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GhostHand extends Module {
   private static String[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   public GhostHand() {
      super(id_break[0], id_break[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
   }

   static {
      ntfClinit();
   }

   @EventTarget(
      id_class = -200
   )
   public void id_class(rrAW var1) {
      var1.id_class(true);
   }

   @EventTarget(
      id_class = -200
   )
   public void id_class(rrAk_1 var1) {
      rff_3 var2 = var1.id_break();
      if (var2 != null) {
         xc_3 var3 = var1.id_class();
         rfH_2 var4 = var2.id_class();
         rJZ var5 = var3.id_break().id_class(var3, (gm_3)id_import.id_class[56], var4);
         ryO_2 var6 = ((gm_3)id_import.id_class[56]).id_class(var4);
         if (var5 == null && var6 == null) {
            var1.id_class(null);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1777638947;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3755017694607256116L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-44, 47, 75, 127, 36, 51, 21, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_break = new String[]{new String("Ghost Hand"), new String("Позволяет взаимодействовать с\nконтейнерами сквозь стены")};
   }

   private static void id_new() {
      id_byte = new short[]{3, 56, 56};
   }

   private static void id_super() {
      id_protected = new boolean[]{true};
   }
}
