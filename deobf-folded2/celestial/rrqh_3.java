package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqh_3 implements rrqO_2 {
   private static String[] id_class;
   private static short[] id_break;

   private String id_byte(String var1) {
      return "'" + var1 + "'";
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4152796636527343787L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1416542426;
   }

   @Override
   public void id_class(String var1, boolean var2) {
      String var3 = this.id_byte(var1) + (var2 ? " удалён из списка персонала" : id_class[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .id_class((rrtO_2)(var2 ? new rrtQ_2("Unique Staff", var3, 2000) : new rrtx_3("Unique Staff", var3, 2000)));
      rrfu_3.id_byte(var3);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{68, 80, -37, 89, 114, 97, -23, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break() {
      String var1 = "Список персонала пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3("Unique Staff", var1, 2000));
      rrfu_3.id_byte(var1);
   }

   private static void id_throws() {
      id_class = new String[]{
         new String(" добавлен в список персонала"),
         new String(" уже есть в списке персонала"),
         new String("Unique Staff"),
         new String("Unique Staff"),
         new String(" удалён из списка персонала"),
         new String(" не найден в списке персонала"),
         new String("Unique Staff"),
         new String("Unique Staff"),
         new String("Список персонала очищен"),
         new String("Unique Staff"),
         new String("Список персонала пуст"),
         new String("Unique Staff"),
         new String("Unique Staff"),
         new String("Ник слишком короткий или слишком большой"),
         new String("Unique Staff"),
         new String("Вы не можете добавить себя в список персонала"),
         new String("Unique Staff"),
         new String("Список персонала обновлён"),
         new String("Не удалось обновить список персонала"),
         new String("Unique Staff"),
         new String("Unique Staff")
      };
   }

   @Override
   public void id_continue() {
      String var1 = "Список персонала очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtQ_2("Unique Staff", var1, 2000));
      rrfu_3.id_byte(var1);
   }

   private static void id_protected() {
      id_break = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 2000};
   }

   @Override
   public void d_(String var1) {
      String var2 = "'" + var1 + "' не найден в списке персонала";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3("Unique Staff", var2, 2000));
      rrfu_3.id_byte(var2);
   }

   @Override
   public void d_(String var1, boolean var2) {
      String var3 = this.id_byte(var1) + (var2 ? " добавлен в список персонала" : id_class[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .id_class((rrtO_2)(var2 ? new rrtQ_2("Unique Staff", var3, 2000) : new rrtx_3("Unique Staff", var3, 2000)));
      rrfu_3.id_byte(var3);
   }

   @Override
   public void f_(boolean var1) {
      String var2 = var1 ? "Список персонала обновлён" : id_class[18];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .id_class((rrtO_2)(var1 ? new rrtQ_2("Unique Staff", var2, 2000) : new rrtx_3("Unique Staff", var2, 2000)));
      rrfu_3.id_byte(var2);
   }

   @Override
   public void aN_() {
      String var1 = "Вы не можете добавить себя в список персонала";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3("Unique Staff", var1, 2000));
      rrfu_3.id_byte(var1);
   }

   @Override
   public void aM_() {
      String var1 = "Ник слишком короткий или слишком большой";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3("Unique Staff", var1, 2000));
      rrfu_3.id_byte(var1);
   }
}
