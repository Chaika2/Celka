package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmU_2 implements rruT<rrqz_3>, rruq_1 {
   private static boolean[] break_;
   private static String[] byte_;
   private static short[] protected_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }

   rrmU_2(rrmY_2 var1) {
      this.class_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(C_static var1) {
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).class_(var1x -> {
         rVe_1 var2 = this.class_(var1x);
         ((rrmY_2)this.class_[0]).class_(new rVi_1[]{var2});
      });
   }

   public rVe_1 class_(rrqz_3 var1) {
      String var2 = var1.break_();
      rVe_1 var3 = new rVe_1(" - ");
      var3.class_(new rgN_2("Удалить").class_(var3.class_().class_(rgF_2.RED)));
      rVe_1 var4 = new rVe_1("");
      var4.class_(var4.class_().class_(rgF_2.GRAY));
      var4.class_(String.join("\n", "Нажмите чтобы удалить '" + var2 + "' из списка блоков"));
      var3.class_(var3.class_().class_(new rgy_3(rgp_3.class_, var4)));
      rVe_1 var5 = rrfu_3.class_((Object)var2).break_();
      var5.class_(var5.class_().class_(rgF_2.GRAY));
      var5.class_(var3);
      var5.class_(var5.class_().class_(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + "xray remove " + var2)));
      return var5;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -907121634;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 95488440474732932L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -96, 7, 85, 23, 102, 127, 111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void break_() {
      break_ = new boolean[]{true, false, true, false, true};
   }

   private static void protected_() {
      protected_ = new short[4];
   }
}
