package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqx_3 implements rrqJ_2 {
   private static String[] class_;
   private static short[] break_;

   private String byte_(String var1) {
      return "'" + var1 + "'";
   }

   @Override
   public void byte_(String var1, boolean var2) {
      String var3 = this.byte_(var1) + (var2 ? " добавлен в список префиксов" : class_[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Unique Prefix", var3, 2000) : new rrtx_3("Unique Prefix", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   private static void byte_() {
      class_ = new String[]{
         new String(" добавлен в список префиксов"),
         new String(" уже есть в списке префиксов"),
         new String("Unique Prefix"),
         new String("Unique Prefix"),
         new String(" удалён из списка префиксов"),
         new String(" не найден в списке префиксов"),
         new String("Unique Prefix"),
         new String("Unique Prefix"),
         new String("Список префиксов очищен"),
         new String("Unique Prefix"),
         new String("Список префиксов пуст"),
         new String("Unique Prefix"),
         new String("Unique Prefix"),
         new String("Список префиксов успешно перезагружен"),
         new String("Не удалось перезагрузить список префиксов"),
         new String("Unique Prefix"),
         new String("Unique Prefix")
      };
   }

   static {
      ntfClinit();
   }

   @Override
   public void this_() {
      String var1 = "Список префиксов очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Unique Prefix", var1, 2000));
      rrfu_3.byte_(var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 517847263;
   }

   @Override
   public void class_() {
      String var1 = "Список префиксов пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Unique Prefix", var1, 2000));
      rrfu_3.byte_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5338020220652054877L;
   }

   @Override
   public void break_(String var1, boolean var2) {
      String var3 = this.byte_(var1) + (var2 ? " удалён из списка префиксов" : class_[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Unique Prefix", var3, 2000) : new rrtx_3("Unique Prefix", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{95, 87, -65, -102, -67, 76, 15, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 2000};
   }

   @Override
   public void e_(boolean var1) {
      String var2 = var1 ? "Список префиксов успешно перезагружен" : class_[14];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var1 ? new rrtQ_2("Unique Prefix", var2, 2000) : new rrtx_3("Unique Prefix", var2, 2000)));
      rrfu_3.byte_(var2);
   }

   @Override
   public void c_(String var1) {
      String var2 = this.byte_(var1) + " не найден в списке префиксов";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Unique Prefix", var2, 2000));
      rrfu_3.byte_(var2);
   }
}
