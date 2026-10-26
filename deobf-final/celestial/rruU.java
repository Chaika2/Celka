package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruU implements rruT<rrqU_2>, rruq_1 {
   private static String[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   rruU(rrug_1 var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, -126, 83, -117, 15, 59, 24, -46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rVe_1 class_(rrqU_2 var1) {
      String var2 = var1.byte_();
      rVe_1 var3 = new rVe_1(" - ");
      var3.class_(new rgN_2("Удалить").class_(var3.class_().class_(rgF_2.RED)));
      rVe_1 var4 = new rVe_1("");
      var4.class_(var4.class_().class_(rgF_2.GRAY));
      var4.class_(String.join("\n", "Нажмите чтобы удалить '" + var2 + "' из списка блоков"));
      var3.class_(var3.class_().class_(new rgy_3(rgp_3.class_, var4)));
      rVe_1 var5 = rrfu_3.class_((Object)var2).break_();
      var5.class_(var5.class_().class_(rgF_2.GRAY));
      var5.class_(var3);
      var5.class_(var5.class_().class_(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + "blockesp remove " + var2)));
      return var5;
   }

   @Override
   public void class_(C_static var1) {
      ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).class_(var1x -> {
         rVe_1 var2 = this.class_(var1x);
         ((rrug_1)this.class_[0]).class_(new rVi_1[]{var2});
      });
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -275726377;
   }

   private static void class_() {
      byte_ = new boolean[]{true, false, true, false, true};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2686667749901990291L;
   }

   private static void break_() {
      protected_ = new short[4];
   }

   private static void protected_() {
      break_ = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }
}
