package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BowSpam extends Module {
   private static String[] id_byte;
   public Object[] id_break;
   private static boolean[] id_protected;
   private static short[] id_throws;
   private static float[] id_catch;

   public BowSpam() {
      super(id_byte[0], id_byte[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_else();
      rrIm_1 var5 = new rrIm_1(id_byte[2], 2.0F, 2.0F, 5.0F, 1.0F);
      this.id_break[id_throws[1]] = var5;
      this.id_class((rrIm_1)this.id_break[id_throws[2]]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new short[]{0, 0, 0, 0, 57, 0, 55, 57, 57};
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[3]]) {
         if (!this.id_continue()) {
            return;
         }

         if ((float)((cb_3)id_import.id_class[57]).Sw() > ((rrIm_1)this.id_break[id_throws[5]]).id_byte()) {
            ((Ax_1)id_import.id_class[55]).id_break((cb_3)id_import.id_class[57]);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1327497761723026421L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1071132833;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-50, -122, -102, 57, 15, 69, -36, 97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean id_continue() {
      return ((cb_3)id_import.id_class[57]).sR();
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   private static void id_new() {
      id_catch = new float[]{2.0F, 2.0F, 5.0F, 1.0F};
   }

   private static void id_return() {
      id_protected = new boolean[]{true};
   }

   private static void id_super() {
      id_byte = new String[]{new String("Bow Spam"), new String("Позволяет быстро стрелять из лука"), new String("Задержка")};
   }
}
