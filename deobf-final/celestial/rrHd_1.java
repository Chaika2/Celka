package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHd_1 implements rrHx_1 {
   private static String[] class_;
   private static short[] break_;

   private static void byte_() {
      break_ = new short[]{0, 2000, 2000, 0, 2000, 0, 2000, 2000, 0, 2000, 0, 2000};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 488762230;
   }

   public String class_(xd_3 var1) {
      return "'" + var1.native_().getString() + "'";
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6480066124745474168L;
   }

   @Override
   public void class_() {
      String var1 = "Список блоков пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Nuker", var1, 2000));
      rrfu_3.byte_(var1);
   }

   @Override
   public void class_(String var1, Exception var2) {
      String var3 = "'" + var1 + "'";
      String var4 = "Ошибка при добавлении " + var3;
      if (var2 instanceof u_1 var5 && var5.getMessage().equals("Block not found")) {
         var4 = "Блок " + var3 + " не найден или является воздухом";
      }

      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Nuker", var4, 2000));
      rrfu_3.byte_(var4);
   }

   @Override
   public void class_(xd_3 var1, boolean var2) {
      String var3 = this.class_(var1) + (var2 ? " удалён из списка" : class_[7]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Nuker", var3, 2000) : new rrtx_3("Nuker", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   @Override
   public void break_(xd_3 var1, boolean var2) {
      String var3 = this.class_(var1) + (var2 ? " добавлен в список" : class_[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Nuker", var3, 2000) : new rrtx_3("Nuker", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -36, 127, -100, -45, -7, 35, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_() {
      String var1 = "Список блоков очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Nuker", var1, 2000));
      rrfu_3.byte_(var1);
   }

   private static void protected_() {
      class_ = new String[]{
         new String(" добавлен в список"),
         new String(" уже есть в списке"),
         new String("Nuker"),
         new String("Nuker"),
         new String("Block not found"),
         new String("Nuker"),
         new String(" удалён из списка"),
         new String(" не найден в списке"),
         new String("Nuker"),
         new String("Nuker"),
         new String("Список блоков очищен"),
         new String("Nuker"),
         new String("Список блоков пуст"),
         new String("Nuker")
      };
   }
}
