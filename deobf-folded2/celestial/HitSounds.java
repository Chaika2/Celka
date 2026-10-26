package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class HitSounds extends Module {
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static double[] id_throws;
   public Object[] id_break;
   private static byte[] id_catch;
   private static float[] id_private;
   private static String[] id_implements;

   public HitSounds() {
      super("Hit Sounds", "Воспроизводит звуки при ударе", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.id_goto();
      rrIQ var5 = new rrIQ("Выбор звука", "UwU", "UwU", "Бонк", "Стоны", "Маркер");
      this.id_break[0] = var5;
      rrIm_1 var6 = new rrIm_1("Питч звука", 1.0F, 0.1F, 2.0F, 0.1F);
      this.id_break[1] = var6;
      this.id_class(new Setting[]{(rrIQ)this.id_break[0], (rrIm_1)this.id_break[1]});
      ((rrIQ)this.id_break[0]).id_class("change_mode", (var1, var2) -> {
         this.id_goto();
         if (!(Boolean)var2.getRight()) {
            String var3 = var1.id_byte();
            float var4 = ((rrIm_1)this.id_break[1]).id_byte();
            this.id_class(var3, var4);
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new boolean[]{false, true, false, true, false, true};
   }

   @EventTarget
   public void id_class(rrFj_1 var1) {
      this.id_goto();
      if (var1.id_class() instanceof iB_2) {
         this.id_class(((rrIQ)this.id_break[0]).id_byte(), ((rrIm_1)this.id_break[1]).id_byte());
      }
   }

   private void id_class(String var1, float var2) {
      switch (var1) {
         case "UwU":
            rrIy_1.id_class(rqn_3.zx, 1.0F, var2);
            break;
         case "Бонк":
            rrIy_1.id_class(rqn_3.zd, 1.0F, var2);
            break;
         case "Маркер":
            rrIy_1.id_class(rqn_3.zk, 1.0F, var2);
            break;
         case "Стоны":
            rrIy_1.id_class(this.id_public(), 1.0F, var2);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5615088515655037784L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -401675121;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{81, 11, 34, -89, -85, -44, 26, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   private static void id_continue() {
      id_implements = new String[]{
         new String("Hit Sounds"),
         new String("Воспроизводит звуки при ударе"),
         new String("Выбор звука"),
         new String("UwU"),
         new String("UwU"),
         new String("Бонк"),
         new String("Стоны"),
         new String("Маркер"),
         new String("Питч звука"),
         new String("change_mode"),
         new String("UwU"),
         new String("Бонк"),
         new String("Маркер"),
         new String("Стоны")
      };
   }

   private static void id_else() {
      id_catch = new byte[]{4, 2, 3, 2, -1, 2, 3, 2};
   }

   private static void id_new() {
      id_private = new float[]{1.0F, 0.1F, 2.0F, 0.1F, 1.0F, 1.0F, 1.0F, 1.0F};
   }

   private static void id_return() {
      id_byte = new short[]{0, 0, 1, 0, 1, 0, 0, 1, 1};
   }

   private static void id_super() {
      id_throws = new double[]{4.0};
   }

   private rqA_2 id_public() {
      return switch ((int)(Math.random() * 4.0)) {
         case 1 -> rqn_3.zz;
         case 2 -> rqn_3.zQ;
         case 3 -> rqn_3.zN;
         default -> rqn_3.zW;
      };
   }
}
