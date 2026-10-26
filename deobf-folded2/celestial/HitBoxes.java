package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class HitBoxes extends Module {
   private static byte[] id_byte;
   private static short[] id_protected;
   private static float[] id_throws;
   public Object[] id_break;
   private static boolean[] id_catch;
   private static String[] id_private;

   public HitBoxes() {
      super("Hitboxes", "Увеличивает хитбокс у энтити", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.id_else();
      CheckGroup var5 = new CheckGroup().id_catch(true).id_case(false).id_throws(false).id_implements(false).id_byte(false).id_protected(false).id_class(true);
      this.id_break[0] = var5;
      rrIm_1 var6 = new rrIm_1("Размер", 0.2F, 0.1F, 2.0F, 0.1F);
      this.id_break[1] = var6;
      this.id_class(new Setting[]{new rrIc_1("Выбор целей", ((CheckGroup)this.id_break[0]).id_byte()), (rrIm_1)this.id_break[1]});
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_private = new String[]{new String("Hitboxes"), new String("Увеличивает хитбокс у энтити"), new String("Размер"), new String("Выбор целей")};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4104110519189998539L;
   }

   private boolean id_class(an_3 var1) {
      this.id_else();
      return var1 == (cb_3)id_import.id_class[57] ? false : rrff_3.id_class(var1, (CheckGroup)this.id_break[0]);
   }

   @EventTarget
   public void id_class(rrnJ_2 var1) {
      this.id_else();
      an_3 var2 = var1.id_class();
      if (this.id_class(var2)) {
         var1.id_class(((rrIm_1)this.id_break[1]).id_byte());
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1016036912;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-79, -125, 23, -22, 41, -67, -70, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_protected = new short[]{0, 0, 1, 0, 1, 1, 57, 0};
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   private static void id_new() {
      id_byte = new byte[]{2, 2};
   }

   private static void id_return() {
      id_throws = new float[]{0.2F, 0.1F, 2.0F, 0.1F};
   }

   private static void id_super() {
      id_catch = new boolean[]{true, false, false, false, false, false, true, false, true, false};
   }
}
