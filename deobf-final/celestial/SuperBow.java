package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SuperBow extends Module {
   public Object[] break_;
   private static short[] byte_;
   private static double[] protected_;
   private static String[] throws_;
   private static float[] catch_;
   private static boolean[] private_;

   public SuperBow() {
      super("Super Bow", "Увеличивает урон с лука", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.continue_();
      rrIm_1 var5 = new rrIm_1("Сила выстрела", 50.0F, 10.0F, 100.0F, 10.0F);
      this.break_[0] = var5;
      this.class_((rrIm_1)this.break_[0]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new float[]{50.0F, 10.0F, 100.0F, 10.0F};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -461325330508360598L;
   }

   @EventTarget
   public void class_(rrLZ var1) {
      this.continue_();
      if (var1.class_() instanceof rZb_1 var2) {
         if (var2.protected_() != rZM.RELEASE_USE_ITEM || !((cb_3)import_.class_[57]).sR()) {
            return;
         }

         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rmD_2((cb_3)import_.class_[57], rmU_2.START_SPRINTING));

         for (int var4 = 0; var4 < ((rrIm_1)this.break_[0]).byte_().intValue(); var4++) {
            this.class_(((cb_3)import_.class_[57]).re() + 1.0E-10, false);
            this.class_(((cb_3)import_.class_[57]).re() - 1.0E-10, true);
         }
      }
   }

   private void class_(double var1, boolean var3) {
      ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rZh_1(((cb_3)import_.class_[57]).rx(), var1, ((cb_3)import_.class_[57]).BO(), var3));
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 979963855;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, -90, 11, 44, -17, -87, 85, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void continue_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }

   private static void else_() {
      protected_ = new double[]{1.0E-10, 1.0E-10};
   }

   private static void new_() {
      private_ = new boolean[]{false, false, true, true};
   }

   private static void return_() {
      throws_ = new String[]{new String("Super Bow"), new String("Увеличивает урон с лука"), new String("Сила выстрела")};
   }

   private static void super_() {
      byte_ = new short[]{0, 0, 0, 57, 57, 0, 57, 0, 57, 57, 57, 0, 57, 57};
   }
}
