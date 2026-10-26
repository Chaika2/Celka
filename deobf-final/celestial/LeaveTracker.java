package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class LeaveTracker extends Module {
   private static float[] break_;
   private static String[] byte_;
   private static short[] protected_;

   public LeaveTracker() {
      super("Leave Tracker", "Отслеживает позицию телепорта\nигроков", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1556851786;
   }

   @EventTarget
   public void class_(rrAQ var1) {
      if (var1.class_() instanceof cG_2 var3) {
         if (var3 == (cb_3)import_.class_[57]
            || var3.sc()
            || ((cb_3)import_.class_[57]).implements_(var3) < 100.0F
            || ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(var3)) {
            return;
         }

         Object var4 = rrfu_3.class_((Module)this);
         rgN_2 var5 = new rgN_2(rgF_2.GRAY + var4 + var3.extends_() + " ливнул на " + var3.PG());
         rgN_2 var6 = new rgN_2(rgF_2.GRAY + "Нажмите чтобы скопировать координаты");
         Runnable var7 = () -> {
            ((Qj_1)import_.class_[23]).class_((int)var3.rx() + " " + (int)var3.re() + " " + (int)var3.BO());
            rrfu_3.byte_(var4 + "Координаты скопированы в буфер обмена");
         };
         rVi_1 var8 = rgv_3.class_(var5, new rgy_3(rgp_3.class_, var6), new rgl_3(var7));
         rrfu_3.class_(var8);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3220178965759834904L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, -76, 41, 17, -28, -114, -113, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      break_ = new float[]{100.0F};
   }

   private static void new_() {
      byte_ = new String[]{new String("Leave Tracker"), new String("Отслеживает позицию телепорта\nигроков")};
   }

   private static void super_() {
      protected_ = new short[]{4, 57, 57, 0, 23};
   }
}
