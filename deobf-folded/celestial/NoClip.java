package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoClip extends Module implements rrnZ_2 {
   private static boolean[] id_break;
   private static String[] id_byte;
   private static double[] id_protected;
   private static short[] id_throws;

   public NoClip() {
      super(id_byte[0], id_byte[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new short[]{3, 57, 57};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5469382177533792819L;
   }

   @EventTarget
   public void id_class(rrLz_1 var1) {
      if (((cb_3)id_import.id_class[57]).BW()) {
         rjU_2 var2 = var1.id_catch();
         if (var1.id_private()) {
            var1.id_protected(true);
         }

         if (var1.id_catch().id_byte > id_protected[0] || ((cb_3)id_import.id_class[57]).h()) {
            var1.id_break(true);
         }

         var2.id_byte = Math.min(var2.id_byte, 99999.0);
      }
   }

   @Override
   public void id_class() {
      this.id_byte(id_break[2]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 838209568;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{21, -50, -91, -32, 25, 102, -100, -107}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_break = new boolean[]{true, true, false};
   }

   private static void id_new() {
      id_protected = new double[]{0.0, 99999.0};
   }

   private static void id_super() {
      id_byte = new String[]{new String("No Clip"), new String("Позволяет проходить сквозь\nблоки")};
   }
}
