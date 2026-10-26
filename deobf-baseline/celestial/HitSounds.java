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
      super(id_implements[0], id_implements[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
      this.id_goto();
      String var10003 = id_implements[2];
      String var10004 = id_implements[3];
      String[] var10005 = new String[id_catch[0]];
      var10005[id_protected[0]] = id_implements[4];
      var10005[id_protected[1]] = id_implements[5];
      var10005[id_catch[1]] = id_implements[6];
      var10005[id_catch[2]] = id_implements[7];
      rrIQ var5 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_byte[1]] = var5;
      rrIm_1 var6 = new rrIm_1(id_implements[8], id_private[0], id_private[1], id_private[2], id_private[3]);
      this.id_break[id_byte[2]] = var6;
      Setting[] var10001 = new Setting[id_catch[3]];
      var10001[id_protected[2]] = (rrIQ)this.id_break[id_byte[3]];
      var10001[id_protected[3]] = (rrIm_1)this.id_break[id_byte[4]];
      this.id_class(var10001);
      ((rrIQ)this.id_break[id_byte[5]]).id_class(id_implements[9], (var1, var2) -> {
         this.id_goto();
         if (!(Boolean)var2.getRight()) {
            String var3 = var1.id_byte();
            float var4 = ((rrIm_1)this.id_break[id_byte[8]]).id_byte();
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
         this.id_class(((rrIQ)this.id_break[id_byte[6]]).id_byte(), ((rrIm_1)this.id_break[id_byte[7]]).id_byte());
      }
   }

   private void id_class(String var1, float var2) {
      byte var4 = id_catch[4];
      switch (var1.hashCode()) {
         case 85459:
            if (var1.equals(id_implements[10])) {
               var4 = id_protected[4];
            }
            break;
         case 32090794:
            if (var1.equals(id_implements[11])) {
               var4 = id_protected[5];
            }
            break;
         case 1009712267:
            if (var1.equals(id_implements[13])) {
               var4 = id_catch[6];
            }
            break;
         case 1076597177:
            if (var1.equals(id_implements[12])) {
               var4 = id_catch[5];
            }
      }

      switch (var4) {
         case 0:
            rrIy_1.id_class(rqn_3.zx, id_private[4], var2);
            break;
         case 1:
            rrIy_1.id_class(rqn_3.zd, id_private[5], var2);
            break;
         case 2:
            rrIy_1.id_class(rqn_3.zk, id_private[6], var2);
            break;
         case 3:
            rrIy_1.id_class(this.id_public(), id_private[7], var2);
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
      return switch ((int)(Math.random() * id_throws[0])) {
         case 1 -> rqn_3.zz;
         case 2 -> rqn_3.zQ;
         case 3 -> rqn_3.zN;
         default -> rqn_3.zW;
      };
   }
}
