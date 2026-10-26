package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQw_1 implements rrQt_1 {
   private static String[] class_;
   private static short[] break_;

   @Override
   public void byte_() {
      String var1 = "Список аккаунтов пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Accounts", var1, 2000));
   }

   static {
      ntfClinit();
   }

   private String class_(rrQx_1 var1) {
      return "'" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().break_(var1.class_()) + "'";
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8849337857880628880L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -808719613;
   }

   @Override
   public void class_(rrQd_1 var1) {
      String var2 = "Аккаунты с типом '" + var1.class_() + "' не найдены";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Accounts", var2, 2000));
   }

   @Override
   public void class_(rrQx_1 var1, boolean var2) {
      String var3 = this.class_(var1) + (var2 ? " добавлен в список аккаунтов" : class_[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Accounts", var3, 2000) : new rrtx_3("Accounts", var3, 2000)));
   }

   @Override
   public void class_() {
      String var1 = "Список аккаунтов очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Accounts", var1, 2000));
   }

   @Override
   public void class_(String var1) {
      String var2 = "'" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().break_(var1) + "' не найден в списке аккаунтов";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Accounts", var2, 2000));
   }

   @Override
   public void break_(rrQd_1 var1) {
      String var2 = "Все аккаунты с типом '" + var1.class_() + "' удалены";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Accounts", var2, 2000));
   }

   @Override
   public void break_(rrQx_1 var1, boolean var2) {
      String var3 = this.class_(var1) + (var2 ? " удалён из списка аккаунтов" : class_[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Accounts", var3, 2000) : new rrtx_3("Accounts", var3, 2000)));
   }

   @Override
   public void break_() {
      String var1 = "Не удалось создать аккаунт";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Accounts", var1, 2000));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-74, -116, 116, 15, 44, -77, -75, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      break_ = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0};
   }

   private static void protected_() {
      class_ = new String[]{
         new String(" добавлен в список аккаунтов"),
         new String(" уже есть в списке аккаунтов"),
         new String("Accounts"),
         new String("Accounts"),
         new String(" удалён из списка аккаунтов"),
         new String(" не найден в списке аккаунтов"),
         new String("Accounts"),
         new String("Accounts"),
         new String("Список аккаунтов очищен"),
         new String("Accounts"),
         new String("Список аккаунтов пуст"),
         new String("Accounts"),
         new String("Accounts"),
         new String("Не удалось создать аккаунт"),
         new String("Accounts"),
         new String("Accounts"),
         new String("Accounts")
      };
   }
}
