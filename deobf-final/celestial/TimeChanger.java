package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TimeChanger extends Module {
   public Object[] break_;
   private static float[] byte_;
   private static boolean[] protected_;
   private static String[] throws_;
   private static byte[] catch_;
   private static short[] private_;

   public TimeChanger() {
      super("Time Changer", "Изменяет время суток", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.public_();
      rrIQ var5 = new rrIQ("Режим", "Закат", "Закат", "День", "Ночь");
      this.break_[0] = var5;
      AnimValue var6 = new AnimValue(0.1F, false);
      this.break_[1] = var6;
      this.class_((rrIQ)this.break_[0]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new byte[]{3, 2, -1, 2, 2};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3837706352448679390L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1544563248;
   }

   @EventTarget
   public void class_(RenderEvent var1) {
      this.public_();
      int var2 = this.return_();
      ((AnimValue)this.break_[1]).break_((float)var2);
      ((gm_3)import_.class_[56]).break_((long)((AnimValue)this.break_[1]).byte_());
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rFp_1) {
         var1.class_(true);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, 21, -102, 32, 67, 28, 4, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      throws_ = new String[]{
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

   private static void else_() {
      private_ = new short[]{2, 0, 1, 0, 1, 56, 1, 0, 13000, 1000, 18000};
   }

   private static void new_() {
      byte_ = new float[]{0.1F};
   }

   private int return_() {
      this.public_();
      String var1 = ((rrIQ)this.break_[0]).byte_();

      return switch (var1) {
         case "Закат" -> private_[8];
         case "День" -> private_[9];
         case "Ночь" -> private_[10];
         default -> protected_[6];
      };
   }

   private static void super_() {
      protected_ = new boolean[]{false, true, false, true, false, true, false};
   }

   private void public_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }
}
