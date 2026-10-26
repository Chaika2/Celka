package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmP_2 implements rruT<rryk_1>, rruq_1 {
   private static String[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new boolean[]{true, false, true, false, true};
   }

   rrmP_2(rrua_1 var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public rVe_1 class_(rryk_1 var1) {
      String var2 = var1.break_();
      String var3 = var1.class_();
      rVe_1 var4 = new rVe_1(" - ");
      var4.class_(new rgN_2("Удалить").class_(var4.class_().class_(rgF_2.RED)));
      rVe_1 var5 = new rVe_1("");
      var5.class_(var5.class_().class_(rgF_2.GRAY));
      var5.class_(String.join("\n", "Нажмите чтобы удалить '" + var2 + "' из чёрного списка"));
      if (var3 != null) {
         var5.class_("\nЗаметка: " + var3);
      } else {
         var5.class_("\nЗаметка отсутствует");
      }

      var4.class_(var4.class_().class_(new rgy_3(rgp_3.class_, var5)));
      rVe_1 var6 = rrfu_3.class_((Object)var2).break_();
      var6.class_(var6.class_().class_(rgF_2.GRAY));
      var6.class_(var4);
      var6.class_(var6.class_().class_(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + "duel blacklist remove " + var2)));
      return var6;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 822262359;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, -122, 77, -84, -85, -93, -12, 72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      protected_ = new short[7];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1660274982194236217L;
   }

   @Override
   public void class_(C_static var1) {
      ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).class_(var1x -> {
         rVe_1 var2 = this.class_(var1x);
         ((rrua_1)this.class_[0]).class_(new rVi_1[]{var2});
      });
      if (!((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).break_().isEmpty()) {
         ((rrua_1)this.class_[0]).case_("Всего в чёрном списке: " + ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).class_());
      }
   }

   private static void break_() {
      break_ = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n"), new String("\nЗаметка отсутствует")};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
