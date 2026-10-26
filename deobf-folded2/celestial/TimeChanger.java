package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TimeChanger extends Module {
   public Object[] id_break;
   private static float[] id_byte;
   private static boolean[] id_protected;
   private static String[] id_throws;
   private static byte[] id_catch;
   private static short[] id_private;

   public TimeChanger() {
      super("Time Changer", "Изменяет время суток", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_public();
      rrIQ var5 = new rrIQ("Режим", "Закат", "Закат", "День", "Ночь");
      this.id_break[0] = var5;
      AnimValue var6 = new AnimValue(0.1F, false);
      this.id_break[1] = var6;
      this.id_class((rrIQ)this.id_break[0]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new byte[]{3, 2, -1, 2, 2};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3837706352448679390L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1544563248;
   }

   @EventTarget
   public void id_class(RenderEvent var1) {
      this.id_public();
      int var2 = this.id_return();
      ((AnimValue)this.id_break[1]).id_break((float)var2);
      ((gm_3)id_import.id_class[56]).id_break((long)((AnimValue)this.id_break[1]).id_byte());
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rFp_1) {
         var1.id_class(true);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, 21, -102, 32, 67, 28, 4, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_throws = new String[]{
         new String("Time Changer"),
         new String("Изменяет время суток"),
         new String("Режим"),
         new String("Закат"),
         new String("Закат"),
         new String("День"),
         new String("Ночь"),
         new String("Закат"),
         new String("День"),
         new String("Ночь")
      };
   }

   private static void id_else() {
      id_private = new short[]{2, 0, 1, 0, 1, 56, 1, 0, 13000, 1000, 18000};
   }

   private static void id_new() {
      id_byte = new float[]{0.1F};
   }

   private int id_return() {
      this.id_public();
      String var1 = ((rrIQ)this.id_break[0]).id_byte();

      return switch (var1) {
         case "Закат" -> id_private[8];
         case "День" -> id_private[9];
         case "Ночь" -> id_private[10];
         default -> id_protected[6];
      };
   }

   private static void id_super() {
      id_protected = new boolean[]{false, true, false, true, false, true, false};
   }

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }
}
