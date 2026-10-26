package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmb_3 implements rruT<rrZk_1>, rruq_1 {
   private static short[] break_;
   private static String[] byte_;
   public Object[] class_;
   private static boolean[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   rrmb_3(rrms_3 var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 840185984409463620L;
   }

   private static void class_() {
      byte_ = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }

   public rVe_1 class_(rrZk_1 var1) {
      rgN_2 var2 = new rgN_2(" - ");
      var2.class_(new rgN_2("Удалить").class_(var2.class_().class_(rgF_2.RED)));
      rgN_2 var3 = new rgN_2("");
      var3.class_(var3.class_().class_(rgF_2.GRAY));
      var3.break_(String.join("\n", "Нажмите чтобы удалить '" + var1.class_() + "' из друзей"));
      var2.class_(var2.class_().class_(new rgy_3(rgp_3.class_, var3)));
      rVe_1 var4 = rrfu_3.class_(var1.class_()).break_();
      var4.class_(var4.class_().class_(rgF_2.GRAY));
      var4.class_(var2);
      var4.class_(var4.class_().class_(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + "friend remove " + var1.class_())));
      return var4;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1040996569;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{75, -97, 90, 56, 95, -20, 91, 79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(C_static var1) {
      ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(var1x -> {
         rVe_1 var2 = this.class_(var1x);
         ((rrms_3)this.class_[0]).class_(new rVi_1[]{var2});
      });
      if (!((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_().isEmpty()) {
         ((rrms_3)this.class_[0]).case_("Всего друзей: " + ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).break_());
      }
   }

   private static void break_() {
      break_ = new short[7];
   }

   private static void protected_() {
      protected_ = new boolean[]{true, false, true, false, true};
   }
}
