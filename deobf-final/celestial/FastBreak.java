package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FastBreak extends Module {
   private static boolean[] byte_;
   public Object[] break_;
   private static short[] protected_;
   private static float[] throws_;
   private static byte[] catch_;
   private static String[] private_;

   public FastBreak() {
      super("Fast Break", "Позволяет ломать блоки быстрее", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.else_();
      rrIm_1 var5 = new rrIm_1("Сила", 0.4F, 0.0F, 1.0F, 0.1F);
      this.break_[0] = var5;
      rrIm_1 var6 = new rrIm_1("Задержка", 0.0F, 0.0F, 5.0F, 1.0F);
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Обход Grim", false);
      this.break_[2] = var7;
      this.class_(new Setting[]{(rrIm_1)this.break_[0], (rrIm_1)this.break_[1], (rrIk_1)this.break_[2]});
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new byte[]{3, 2, 3};
   }

   @EventTarget
   public void class_(rrLZ var1) {
      this.else_();
      if (var1.class_() instanceof rZb_1 var2 && var2.protected_() == rZM.STOP_DESTROY_BLOCK && ((rrIk_1)this.break_[2]).class_()) {
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.ABORT_DESTROY_BLOCK, rfH_2.protected_, rpr_3.UP));
      }
   }

   @EventTarget
   public void class_(rrLT var1) {
      this.else_();
      var1.break_(1.0F - ((rrIm_1)this.break_[0]).byte_());
   }

   @EventTarget
   public void class_(rrLp_1 var1) {
      this.else_();
      var1.class_(((rrIm_1)this.break_[1]).byte_().intValue());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 905791794530969845L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1341422525;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{127, 9, 90, 10, 32, 117, -125, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      private_ = new String[]{
         new String("Fast Break"), new String("Позволяет ломать блоки быстрее"), new String("Сила"), new String("Задержка"), new String("Обход Grim")
      };
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
      }
   }

   private static void new_() {
      protected_ = new short[]{3, 0, 1, 2, 0, 1, 2, 0, 1, 2, 57, 0};
   }

   private static void return_() {
      throws_ = new float[]{0.4F, 0.0F, 1.0F, 0.1F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F};
   }

   private static void super_() {
      byte_ = new boolean[]{false, false, true};
   }
}
