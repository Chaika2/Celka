package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BowSpam extends Module {
   private static String[] byte_;
   public Object[] break_;
   private static boolean[] protected_;
   private static short[] throws_;
   private static float[] catch_;

   public BowSpam() {
      super("Bow Spam", "Позволяет быстро стрелять из лука", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.else_();
      rrIm_1 var5 = new rrIm_1("Задержка", 2.0F, 2.0F, 5.0F, 1.0F);
      this.break_[0] = var5;
      this.class_((rrIm_1)this.break_[0]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new short[]{0, 0, 0, 0, 57, 0, 55, 57, 57};
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.else_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.continue_()) {
            return;
         }

         if ((float)((cb_3)import_.class_[57]).Sw() > ((rrIm_1)this.break_[0]).byte_()) {
            ((Ax_1)import_.class_[55]).break_((cb_3)import_.class_[57]);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1327497761723026421L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1071132833;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-50, -122, -102, 57, 15, 69, -36, 97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean continue_() {
      return ((cb_3)import_.class_[57]).sR();
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }

   private static void new_() {
      catch_ = new float[]{2.0F, 2.0F, 5.0F, 1.0F};
   }

   private static void return_() {
      protected_ = new boolean[]{true};
   }

   private static void super_() {
      byte_ = new String[]{new String("Bow Spam"), new String("Позволяет быстро стрелять из лука"), new String("Задержка")};
   }
}
