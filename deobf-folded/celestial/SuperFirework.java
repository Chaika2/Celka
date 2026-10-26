package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SuperFirework extends Module {
   private static short[] id_byte;
   private static byte[] id_protected;
   private static float[] id_throws;
   private static boolean[] id_catch;
   public Object[] id_break;
   private static String[] id_private;

   public SuperFirework() {
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.id_super();
      rrIm_1 var5 = new rrIm_1(id_private[2], 1.6F, 1.5F, 2.0F, 0.01F).id_finally();
      this.id_break[id_byte[1]] = var5;
      rrIm_1 var6 = new rrIm_1(id_private[3], 1.6F, 1.5F, 2.0F, 0.01F).id_finally();
      this.id_break[1] = var6;
      Setting[] var10001 = new Setting[2];
      var10001[id_catch[0]] = (rrIm_1)this.id_break[id_byte[3]];
      var10001[1] = (rrIm_1)this.id_break[1];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new boolean[]{false, true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1232846057;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2469010878196885644L;
   }

   @EventTarget
   public void id_class(rrLJ var1) {
      this.id_super();
      iB_2 var2 = var1.id_class();
      if (var2 == (cb_3)id_import.id_class[57]) {
         float var3 = ((rrIm_1)this.id_break[id_byte[6]]).id_byte();
         float var4 = ((rrIm_1)this.id_break[1]).id_byte();
         var1.id_break((double)var3);
         var1.id_class((double)var4);
         var1.id_byte((double)var3);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, -115, 68, -111, -101, 104, 75, -72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_protected = new byte[]{2, 2};
   }

   private static void id_else() {
      id_throws = new float[]{1.6F, 1.5F, 2.0F, 0.01F, 1.6F, 1.5F, 2.0F, 0.01F};
   }

   private static void id_new() {
      id_private = new String[]{
         new String("Super Firework"),
         new String("Увеличивает скорость при\nиспользовании фейерверка"),
         new String("Скорость по XZ"),
         new String("Скорость по Y")
      };
   }

   private static void id_return() {
      id_byte = new short[]{1, 0, 1, 0, 1, 57, 0, 1};
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }
}
