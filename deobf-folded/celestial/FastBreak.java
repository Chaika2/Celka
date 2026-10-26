package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FastBreak extends Module {
   private static boolean[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;
   private static float[] id_throws;
   private static byte[] id_catch;
   private static String[] id_private;

   public FastBreak() {
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_else();
      rrIm_1 var5 = new rrIm_1(id_private[2], 0.4F, id_throws[1], 1.0F, 0.1F);
      this.id_break[id_protected[1]] = var5;
      rrIm_1 var6 = new rrIm_1(id_private[3], id_throws[4], id_throws[5], 5.0F, 1.0F);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1(id_private[4], id_byte[0]);
      this.id_break[2] = var7;
      Setting[] var10001 = new Setting[3];
      var10001[id_byte[1]] = (rrIm_1)this.id_break[id_protected[4]];
      var10001[1] = (rrIm_1)this.id_break[1];
      var10001[2] = (rrIk_1)this.id_break[2];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new byte[]{3, 2, 3};
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      this.id_else();
      if (var1.id_class() instanceof rZb_1 var2 && var2.id_protected() == rZM.STOP_DESTROY_BLOCK && ((rrIk_1)this.id_break[2]).id_class()) {
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_protected[11]]).id_break(new rZb_1(rZM.ABORT_DESTROY_BLOCK, rfH_2.id_protected, rpr_3.UP));
      }
   }

   @EventTarget
   public void id_class(rrLT var1) {
      this.id_else();
      var1.id_break(1.0F - ((rrIm_1)this.id_break[id_protected[7]]).id_byte());
   }

   @EventTarget
   public void id_class(rrLp_1 var1) {
      this.id_else();
      var1.id_class(((rrIm_1)this.id_break[1]).id_byte().intValue());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 905791794530969845L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1341422525;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{127, 9, 90, 10, 32, 117, -125, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_private = new String[]{
         new String("Fast Break"), new String("Позволяет ломать блоки быстрее"), new String("Сила"), new String("Задержка"), new String("Обход Grim")
      };
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }

   private static void id_new() {
      id_protected = new short[]{3, 0, 1, 2, 0, 1, 2, 0, 1, 2, 57, 0};
   }

   private static void id_return() {
      id_throws = new float[]{0.4F, 0.0F, 1.0F, 0.1F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F};
   }

   private static void id_super() {
      id_byte = new boolean[]{false, false, true};
   }
}
