package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmg_3 implements rruT<rrjD_2>, rruq_1 {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static String[] protected_;

   private static void byte_() {
      break_ = new boolean[]{true, false, true, false, true};
   }

   rrmg_3(rrmf_3 var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1772241081;
   }

   public rVe_1 class_(rrjD_2 var1) {
      rVe_1 var2 = new rVe_1(" - ");
      var2.class_(new rgN_2("Удалить").class_(var2.class_().class_(rgF_2.RED)));
      rVe_1 var3 = new rVe_1("");
      var3.class_(var3.class_().class_(rgF_2.GRAY));
      var3.class_(String.join("\n", "Нажмите чтобы удалить '" + var1.byte_() + "' из вейпоинтов"));
      var2.class_(var2.class_().class_(new rgy_3(rgp_3.class_, var3)));
      eX_2 var4 = var1.break_();
      rVe_1 var5 = rrfu_3.class_(var1.byte_()).break_().class_(" | X: " + (int)var4.class_() + " Y: " + (int)var4.break_() + " Z: " + (int)var4.byte_());
      var5.class_(var5.class_().class_(rgF_2.GRAY));
      var5.class_(var2);
      var5.class_(var5.class_().class_(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + "waypoint remove " + var1.byte_())));
      return var5;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3235561371888517021L;
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_(var1x -> {
         rVe_1 var2 = this.class_(var1x);
         ((rrmf_3)this.class_[0]).class_(new rVi_1[]{var2});
      });
   }

   private static void class_() {
      byte_ = new short[4];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, 44, -122, -38, 41, 74, 23, -1}, "DES");
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
