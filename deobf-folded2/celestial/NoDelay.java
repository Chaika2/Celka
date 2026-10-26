package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class NoDelay extends Module {
   private static String[] id_byte;
   private static float[] id_protected;
   private static boolean[] id_throws;
   private static byte[] id_catch;
   public Object[] id_break;
   private static short[] id_private;

   public NoDelay() {
      super("No Delay", "Убирает задержку на что-либо", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_public();
      Pair var5 = rrwg_3.id_class(new rrIk_1("Прыжок", true), new rrIm_1("Задержка для прыжка", 0.0F, 0.0F, 10.0F, 1.0F));
      this.id_break[0] = var5;
      Pair var6 = rrwg_3.id_class(new rrIk_1("ПКМ", false), new rrIm_1("Задержка для ПКМ", 0.0F, 0.0F, 4.0F, 1.0F));
      this.id_break[1] = var6;
      this.id_class(
         new Setting[]{
            new rrIc_1("Убирать на", (rrIk_1)((Pair)this.id_break[0]).getLeft(), (rrIk_1)((Pair)this.id_break[1]).getLeft()),
            (Setting)((Pair)this.id_break[0]).getRight(),
            (Setting)((Pair)this.id_break[1]).getRight()
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new byte[]{3, 2, 2, 2};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1719108219;
   }

   @EventTarget
   public void id_class(rrAu_1 var1) {
      if (this.id_return()) {
         var1.id_class(this.id_super().intValue());
      }
   }

   @EventTarget
   public void id_class(rrAS var1) {
      if (this.id_new()) {
         var1.id_class(this.id_goto().intValue());
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2188550246434709538L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, -27, 32, 126, -12, -123, -63, 24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private Float id_goto() {
      this.id_public();
      return ((rrIm_1)((Pair)this.id_break[0]).getRight()).id_byte();
   }

   private static void id_continue() {
      id_protected = new float[]{0.0F, 0.0F, 10.0F, 1.0F, 0.0F, 0.0F, 4.0F, 1.0F};
   }

   private static void id_else() {
      id_throws = new boolean[]{true, false, false, false, true, true};
   }

   private boolean id_new() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[0]).getLeft()).id_class();
   }

   private boolean id_return() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[1]).getLeft()).id_class();
   }

   private Float id_super() {
      this.id_public();
      return ((rrIm_1)((Pair)this.id_break[1]).getRight()).id_byte();
   }

   private static void id_try() {
      id_byte = new String[]{
         new String("No Delay"),
         new String("Убирает задержку на что-либо"),
         new String("Прыжок"),
         new String("Задержка для прыжка"),
         new String("ПКМ"),
         new String("Задержка для ПКМ"),
         new String("Убирать на")
      };
   }

   private static void id_while() {
      id_private = new short[]{3, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
   }

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }
}
