package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmc_3 implements rruT<xd_3>, rruq_1 {
   private static String[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }

   rrmc_3(rrmW_2 var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5303252691636795084L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -820355685;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, 94, 33, -40, 39, -64, -78, 7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(C_static var1) {
      ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).class_(var1x -> {
         rVe_1 var2 = this.class_(var1x);
         ((rrmW_2)this.class_[0]).class_(new rVi_1[]{var2});
      });
   }

   public rVe_1 class_(xd_3 var1) {
      String var2 = var1.native_().getString();
      rVe_1 var3 = new rVe_1(" - ");
      var3.class_(new rgN_2("Удалить").class_(var3.class_().class_(rgF_2.RED)));
      rVe_1 var4 = new rVe_1("");
      var4.class_(var4.class_().class_(rgF_2.GRAY));
      var4.class_(String.join("\n", "Нажмите чтобы удалить '" + var2 + "' из списка блоков"));
      var3.class_(var3.class_().class_(new rgy_3(rgp_3.class_, var4)));
      rVe_1 var5 = rrfu_3.class_((Object)var2).break_();
      var5.class_(var5.class_().class_(rgF_2.GRAY));
      var5.class_(var3);
      var5.class_(var5.class_().class_(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + "nuker remove " + var2)));
      return var5;
   }

   private static void class_() {
      byte_ = new short[4];
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      protected_ = new boolean[]{true, false, true, false, true};
   }
}
