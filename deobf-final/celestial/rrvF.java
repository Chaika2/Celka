package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvF implements rrvv_1 {
   private static String[] class_;
   private static short[] break_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-33, -77, -35, -27, 121, -101, -6, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void byte_() {
      String var1 = "Список макросов пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Macro", var1, 2000));
      rrfu_3.byte_(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrvm_1 var1) {
      String var2 = this.protected_(var1.byte_());
      String var3 = "Макрос " + var2 + " добавлен в список";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Macro", var3, 2000));
      rrfu_3.byte_(var3);
   }

   @Override
   public void class_(String var1) {
      String var2 = "Макрос " + this.protected_(var1) + " не найден";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Macro", var2, 2000));
      rrfu_3.byte_(var2);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1495990719;
   }

   @Override
   public void class_() {
      String var1 = "Нажмите клавишу, на которую хотите привязать макрос";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Macro", var1, 2000));
      rrfu_3.byte_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7951230137723785942L;
   }

   @Override
   public void class_(rrvm_1 var1, boolean var2) {
      String var3 = this.protected_(var1.byte_());
      String var4 = var2 ? "Макрос " + var3 + " удалён из списка" : "Макрос " + var3 + " не найден в списке";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Macro", var4, 2000) : new rrtx_3("Macro", var4, 2000)));
      rrfu_3.byte_(var4);
   }

   @Override
   public void break_(String var1) {
      String var2 = "Макрос " + this.protected_(var1) + " уже есть в списке";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Macro", var2, 2000));
      rrfu_3.byte_(var2);
   }

   @Override
   public void break_() {
      String var1 = "Список макросов очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Macro", var1, 2000));
      rrfu_3.byte_(var1);
   }

   private static void throws_() {
      class_ = new String[]{
         new String("Macro"),
         new String("Macro"),
         new String("Macro"),
         new String("Список макросов очищен"),
         new String("Macro"),
         new String("Список макросов пуст"),
         new String("Macro"),
         new String("Нажмите клавишу, на которую хотите привязать макрос"),
         new String("Macro"),
         new String("Macro"),
         new String("Macro")
      };
   }

   private static void protected_() {
      break_ = new short[]{0, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   private String protected_(String var1) {
      return "'" + var1 + "'";
   }
}
