package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmn_3 implements rruT<String>, rruq_1 {
   private static short[] break_;
   private static boolean[] byte_;
   private static String[] protected_;
   public Object[] class_;

   private static void byte_() {
      break_ = new short[7];
   }

   rrmn_3(rrmF_2 var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5165808508160214586L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1220522337;
   }

   @Override
   public void class_(C_static var1) {
      ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).class_(var1x -> {
         rVe_1 var2 = this.class_(var1x);
         ((rrmF_2)this.class_[0]).class_(new rVi_1[]{var2});
      });
      if (!((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).byte_().isEmpty()) {
         ((rrmF_2)this.class_[0]).case_("Всего персонала: " + ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).class_());
      }
   }

   public rVe_1 class_(String var1) {
      rVe_1 var2 = new rVe_1(" - ");
      var2.class_(new rgN_2("Удалить").class_(var2.class_().class_(rgF_2.RED)));
      rVe_1 var3 = new rVe_1("");
      var3.class_(var3.class_().class_(rgF_2.GRAY));
      var3.class_(String.join("\n", "Нажмите чтобы удалить '" + var1 + "' из персонала"));
      var2.class_(var2.class_().class_(new rgy_3(rgp_3.class_, var3)));
      rVe_1 var4 = rrfu_3.class_((Object)var1).break_();
      var4.class_(var4.class_().class_(rgF_2.GRAY));
      var4.class_(var2);
      var4.class_(var4.class_().class_(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + "staff remove " + var1)));
      return var4;
   }

   private static void class_() {
      byte_ = new boolean[]{true, false, true, false, true};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, -100, -121, 48, 14, 110, 11, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
