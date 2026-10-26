package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class NoDelay extends Module {
   private static String[] byte_;
   private static float[] protected_;
   private static boolean[] throws_;
   private static byte[] catch_;
   public Object[] break_;
   private static short[] private_;

   public NoDelay() {
      super("No Delay", "Убирает задержку на что-либо", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.public_();
      Pair var5 = rrwg_3.class_(new rrIk_1("Прыжок", true), new rrIm_1("Задержка для прыжка", 0.0F, 0.0F, 10.0F, 1.0F));
      this.break_[0] = var5;
      Pair var6 = rrwg_3.class_(new rrIk_1("ПКМ", false), new rrIm_1("Задержка для ПКМ", 0.0F, 0.0F, 4.0F, 1.0F));
      this.break_[1] = var6;
      this.class_(
         new Setting[]{
            new rrIc_1("Убирать на", (rrIk_1)((Pair)this.break_[0]).getLeft(), (rrIk_1)((Pair)this.break_[1]).getLeft()),
            (Setting)((Pair)this.break_[0]).getRight(),
            (Setting)((Pair)this.break_[1]).getRight()
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new byte[]{3, 2, 2, 2};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1719108219;
   }

   @EventTarget
   public void class_(rrAu_1 var1) {
      if (this.return_()) {
         var1.class_(this.super_().intValue());
      }
   }

   @EventTarget
   public void class_(rrAS var1) {
      if (this.new_()) {
         var1.class_(this.goto_().intValue());
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2188550246434709538L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, -27, 32, 126, -12, -123, -63, 24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private Float goto_() {
      this.public_();
      return ((rrIm_1)((Pair)this.break_[0]).getRight()).byte_();
   }

   private static void continue_() {
      protected_ = new float[]{0.0F, 0.0F, 10.0F, 1.0F, 0.0F, 0.0F, 4.0F, 1.0F};
   }

   private static void else_() {
      throws_ = new boolean[]{true, false, false, false, true, true};
   }

   private boolean new_() {
      this.public_();
      return ((rrIk_1)((Pair)this.break_[0]).getLeft()).class_();
   }

   private boolean return_() {
      this.public_();
      return ((rrIk_1)((Pair)this.break_[1]).getLeft()).class_();
   }

   private Float super_() {
      this.public_();
      return ((rrIm_1)((Pair)this.break_[1]).getRight()).byte_();
   }

   private static void try_() {
      byte_ = new String[]{
         new String("No Delay"),
         new String("Убирает задержку на что-либо"),
         new String("Прыжок"),
         new String("Задержка для прыжка"),
         new String("ПКМ"),
         new String("Задержка для ПКМ"),
         new String("Убирать на")
      };
   }

   private static void while_() {
      private_ = new short[]{3, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
   }

   private void public_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }
}
