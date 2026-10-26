package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqa_3 implements rrqe_3 {
   private static String[] class_;
   private static short[] break_;

   private static void byte_() {
      class_ = new String[]{
         new String(" добавлен в список"),
         new String(" уже есть в списке"),
         new String("Block ESP"),
         new String("Block ESP"),
         new String("Block not found"),
         new String("Block ESP"),
         new String(" удалён из списка"),
         new String(" не найден в списке"),
         new String("Block ESP"),
         new String("Block ESP"),
         new String("Список блоков очищен"),
         new String("Block ESP"),
         new String("Список блоков пуст"),
         new String("Block ESP"),
         new String("Block ESP")
      };
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, Exception var2) {
      String var3 = "'" + var1 + "'";
      String var4 = "Ошибка при добавлении " + var3;
      if (var2 instanceof u_1 var5 && var5.getMessage().equals("Block not found")) {
         var4 = "Блок " + var3 + " не найден или является воздухом";
      }

      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Block ESP", var4, 2000));
      rrfu_3.byte_(var4);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3938299881219647123L;
   }

   public String class_(rrqU_2 var1) {
      return "'" + var1.break_().native_().getString() + "'";
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1870333825;
   }

   @Override
   public void class_(rrqU_2 var1, boolean var2) {
      String var3 = this.class_(var1) + (var2 ? " удалён из списка" : class_[7]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Block ESP", var3, 2000) : new rrtx_3("Block ESP", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   @Override
   public void class_() {
      String var1 = "Список блоков пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Block ESP", var1, 2000));
      rrfu_3.byte_(var1);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, -126, -99, -13, -64, 19, 6, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new short[]{0, 2000, 2000, 0, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   @Override
   public void break_(rrqU_2 var1, boolean var2) {
      String var3 = this.class_(var1) + (var2 ? " добавлен в список" : class_[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Block ESP", var3, 2000) : new rrtx_3("Block ESP", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   @Override
   public void new_() {
      String var1 = "Список блоков очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Block ESP", var1, 2000));
      rrfu_3.byte_(var1);
   }

   @Override
   public void e_(String var1) {
      String var2 = "'" + var1 + "' не найден в списке";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Block ESP", var2, 2000));
      rrfu_3.byte_(var2);
   }
}
