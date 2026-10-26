package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruj_1 implements rruT<Module>, rruq_1 {
   private static String[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static boolean[] protected_;

   private static void byte_() {
      protected_ = new boolean[]{true, false, true, false, true};
   }

   rruj_1(rruf_1 var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public rVe_1 class_(Module var1) {
      rVe_1 var2 = new rVe_1(" - ");
      var2.class_(new rgN_2("Сбросить").class_(var2.class_().class_(rgF_2.RED)));
      rVe_1 var3 = new rVe_1("");
      var3.class_(var3.class_().class_(rgF_2.GRAY));
      var3.class_(String.join("\n", "Нажмите чтобы сбросить бинд у '" + var1.final_() + "'"));
      var2.class_(var2.class_().class_(new rgy_3(rgp_3.class_, var3)));
      rVe_1 var4 = rrfu_3.class_(var1.final_()).break_().class_(rgF_2.GRAY + " [" + var1.package_().break_() + "]");
      var4.class_(var4.class_().class_(rgF_2.GRAY));
      var4.class_(var2);
      var4.class_(var4.class_().class_(new rgl_3(() -> ((rrvw_1)rrvw_1.staticFieldsb5a707e7713735c98363c6b6bc5591b6[0]).class_(var1))));
      return var4;
   }

   @Override
   public void class_(C_static var1) {
      ((rrvw_1)rrvw_1.staticFieldsb5a707e7713735c98363c6b6bc5591b6[0]).class_(var1x -> {
         rVe_1 var2 = this.class_(var1x);
         ((rruf_1)this.class_[0]).class_(new rVi_1[]{var2});
      });
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5872283121780540937L;
   }

   private static void class_() {
      break_ = new String[]{new String(" - "), new String("Сбросить"), new String(""), new String("\n")};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, 82, 2, -10, 94, -96, 12, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1103116183;
   }

   private static void break_() {
      byte_ = new short[4];
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
