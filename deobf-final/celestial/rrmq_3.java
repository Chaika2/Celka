package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmq_3 implements rruT<String>, rruq_1 {
   private static boolean[] break_;
   private static short[] byte_;
   private static String[] protected_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new short[7];
   }

   rrmq_3(rrmH_2 var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public rVe_1 class_(String var1) {
      rVe_1 var2 = new rVe_1(" - ");
      var2.class_(new rgN_2("Удалить").class_(var2.class_().class_(rgF_2.RED)));
      rVe_1 var3 = new rVe_1("");
      var3.class_(var3.class_().class_(rgF_2.GRAY));
      var3.class_(String.join("\n", "Нажмите чтобы удалить '" + var1 + "' из списка префиксов"));
      var2.class_(var2.class_().class_(new rgy_3(rgp_3.class_, var3)));
      rVe_1 var4 = rrfu_3.class_((Object)var1).break_();
      var4.class_(var4.class_().class_(rgF_2.GRAY));
      var4.class_(var2);
      var4.class_(var4.class_().class_(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + "staffprefix remove " + var1)));
      return var4;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1470645963;
   }

   private static void class_() {
      break_ = new boolean[]{true, false, true, false, true};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1387103326321036910L;
   }

   @Override
   public void class_(C_static var1) {
      ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).class_(var1x -> {
         rVe_1 var2 = this.class_(var1x);
         ((rrmH_2)this.class_[0]).class_(new rVi_1[]{var2});
      });
      if (!((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).byte_().isEmpty()) {
         ((rrmH_2)this.class_[0]).case_("Всего префиксов: " + ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).throws_());
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, -30, 110, -99, -104, -88, 123, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      protected_ = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }
}
