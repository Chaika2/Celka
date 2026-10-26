package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmd_3 implements rruT<rrvm_1>, rruq_1 {
   public Object[] class_;
   private static String[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new String[]{
         new String(""),
         new String("\n"),
         new String(""),
         new String(""),
         new String("\n"),
         new String("\nНазвание: "),
         new String("\nКлавиша: "),
         new String("\nКоманда: ")
      };
   }

   rrmd_3(rrmX_2 var1) {
      this.class_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{97, 53, -59, -27, -43, -49, 47, 48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 944904070559177472L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -473532622;
   }

   @Override
   public void class_(C_static var1) {
      ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).class_(var1x -> {
         rVe_1 var2 = this.class_(var1x);
         ((rrmX_2)this.class_[0]).class_(new rVi_1[]{var2});
      });
   }

   public rVe_1 class_(rrvm_1 var1) {
      Set var2 = ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).byte_();
      int var3 = var2.stream().toList().indexOf(var1) + 1;
      String var4 = "Макрос #" + var3;
      String var5 = "\nНажмите чтобы удалить" + (var3 == var2.size() ? "" : break_[1]);
      rVe_1 var6 = new rVe_1("");
      var6.class_(new rgN_2(var5).class_(var6.class_().class_(rgF_2.RED)));
      rVe_1 var7 = new rVe_1("");
      var7.class_(var7.class_().class_(rgF_2.GRAY));
      var7.class_(String.join("\n", "Нажмите чтобы удалить '" + var1.byte_() + "' из макросов"));
      var6.class_(var6.class_().class_(new rgy_3(rgp_3.class_, var7)));
      rVe_1 var8 = new rVe_1(var4);
      var8.class_("\nНазвание: ");
      var8.class_(rrfu_3.class_(var1.byte_()).break_());
      var8.class_("\nКлавиша: ");
      var8.class_(rrfu_3.class_(var1.class_().break_()).break_());
      var8.class_("\nКоманда: ");
      var8.class_(rrfu_3.class_(var1.break_()).break_());
      var8.class_(var8.class_().class_(rgF_2.GRAY));
      var8.class_(var6);
      var8.class_(var8.class_().class_(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + "macro remove " + var1.byte_())));
      return var8;
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void break_() {
      byte_ = new short[5];
   }

   private static void protected_() {
      protected_ = new boolean[]{true, true, false, true, false, true};
   }
}
