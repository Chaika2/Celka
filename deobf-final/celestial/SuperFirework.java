package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SuperFirework extends Module {
   private static short[] byte_;
   private static byte[] protected_;
   private static float[] throws_;
   private static boolean[] catch_;
   public Object[] break_;
   private static String[] private_;

   public SuperFirework() {
      super("Super Firework", "Увеличивает скорость при\nиспользовании фейерверка", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.super_();
      rrIm_1 var5 = new rrIm_1("Скорость по XZ", 1.6F, 1.5F, 2.0F, 0.01F).finally_();
      this.break_[0] = var5;
      rrIm_1 var6 = new rrIm_1("Скорость по Y", 1.6F, 1.5F, 2.0F, 0.01F).finally_();
      this.break_[1] = var6;
      this.class_(new Setting[]{(rrIm_1)this.break_[0], (rrIm_1)this.break_[1]});
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new boolean[]{false, true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1232846057;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2469010878196885644L;
   }

   @EventTarget
   public void class_(rrLJ var1) {
      this.super_();
      iB_2 var2 = var1.class_();
      if (var2 == (cb_3)import_.class_[57]) {
         float var3 = ((rrIm_1)this.break_[0]).byte_();
         float var4 = ((rrIm_1)this.break_[1]).byte_();
         var1.break_((double)var3);
         var1.class_((double)var4);
         var1.byte_((double)var3);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, -115, 68, -111, -101, 104, 75, -72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      protected_ = new byte[]{2, 2};
   }

   private static void else_() {
      throws_ = new float[]{1.6F, 1.5F, 2.0F, 0.01F, 1.6F, 1.5F, 2.0F, 0.01F};
   }

   private static void new_() {
      private_ = new String[]{
         new String("Super Firework"),
         new String("Увеличивает скорость при\nиспользовании фейерверка"),
         new String("Скорость по XZ"),
         new String("Скорость по Y")
      };
   }

   private static void return_() {
      byte_ = new short[]{1, 0, 1, 0, 1, 57, 0, 1};
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }
}
