package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ItemScroller extends Module {
   private static float[] byte_;
   private static short[] protected_;
   private static String[] throws_;
   private static boolean[] catch_;
   private static byte[] private_;
   public Object[] break_;

   public ItemScroller() {
      super("Item Scroller", "Позволяет быстро забирать или\nперекладывать предметы", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.return_();
      rrIm_1 var5 = new rrIm_1("Задержка", 0.0F, 0.0F, 100.0F, 10.0F);
      this.break_[0] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.break_[1] = var6;
      this.class_((rrIm_1)this.break_[0]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      byte_ = new float[]{0.0F, 0.0F, 100.0F, 10.0F};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9196545789209238788L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 682197849;
   }

   @EventTarget
   public void class_(rrns_3 var1) {
      this.return_();
      Fu_1 var2 = var1.class_();
      rJY var3 = var2.int_();
      if (var3 != null && var3.break_()) {
         if (((rrfw_3)this.break_[1]).class_((double)((rrIm_1)this.break_[0]).byte_().floatValue())) {
            if (vm_3.synchronized_() && rrfC_2.break_(0)) {
               var2.class_(var3, var3.protected_, 0, rXa_1.QUICK_MOVE);
            } else if (vm_3.else_() && rrfC_2.break_(((Qw_1)import_.class_[20]).N.int_().break_())) {
               var2.class_(var3, var3.protected_, 1, rXa_1.THROW);
            }

            ((rrfw_3)this.break_[1]).class_();
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-110, 8, 126, -18, -71, -56, 36, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      private_ = new byte[]{2};
   }

   private static void else_() {
      protected_ = new short[]{4, 0, 1, 0, 1, 0, 20, 1};
   }

   private static void new_() {
      throws_ = new String[]{new String("Item Scroller"), new String("Позволяет быстро забирать или\nперекладывать предметы"), new String("Задержка")};
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
      }
   }

   private static void super_() {
      catch_ = new boolean[]{false, false, true};
   }
}
