package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClickFriend extends Module {
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] break_;
   private static String[] throws_;
   private static float[] catch_;

   public ClickFriend() {
      super("Click Friend", "Добавляет или удаляет игрока из\nдрузей на клавишу", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.new_();
      rrIF var5 = new rrIF("Клавиша", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[3]);
      this.break_[0] = var5;
      this.class_(new Setting[]{(rrIF)this.break_[0]});
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new float[]{128.0F};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2109532796250302310L;
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.new_();
      if (var1.break_() == ((rrIF)this.break_[0]).finally_().byte_()) {
         if (Ph_1.class_(((cb_3)import_.class_[57]).goto_(), 128.0F, true, var0 -> {
            if (var0 instanceof rhd_3 var1x && !var1x.sc() && var1x.Pu()) {
               return true;
            }

            return protected_[5];
         }) instanceof cG_2 var3) {
            if (var3 == this.O()) {
               return;
            }

            if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(var3)) {
               ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).byte_(var3.extends_());
            } else {
               ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(new rrZk_1(var3.extends_()), true);
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -254441626;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, -113, -73, -93, 51, 111, 84, 51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      protected_ = new boolean[]{true, false, true, true, true, false, true};
   }

   private static void else_() {
      throws_ = new String[]{new String("Click Friend"), new String("Добавляет или удаляет игрока из\nдрузей на клавишу"), new String("Клавиша")};
   }

   private void new_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }

   private static void super_() {
      byte_ = new short[]{4, 3, 0, 0, 0, 57, 0, 0, 0};
   }
}
