package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqx_3 implements rrqJ_2 {
   private static String[] id_class;
   private static short[] id_break;

   private String id_byte(String var1) {
      return "'" + var1 + "'";
   }

   @Override
   public void id_byte(String var1, boolean var2) {
      String var3 = this.id_byte(var1) + (var2 ? id_class[0] : id_class[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_class[2], var3, id_break[1]) : new rrtx_3(id_class[3], var3, id_break[2])));
      rrfu_3.id_byte(var3);
   }

   private static void id_byte() {
      id_class = new String[]{
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
   public void id_this() {
      String var1 = id_class[8];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[6]]).id_class(new rrtQ_2(id_class[9], var1, id_break[7]));
      rrfu_3.id_byte(var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 517847263;
   }

   @Override
   public void id_class() {
      String var1 = id_class[10];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[8]]).id_class(new rrtx_3(id_class[11], var1, id_break[9]));
      rrfu_3.id_byte(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5338020220652054877L;
   }

   @Override
   public void id_break(String var1, boolean var2) {
      String var3 = this.id_byte(var1) + (var2 ? id_class[4] : id_class[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[3]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_class[6], var3, id_break[4]) : new rrtx_3(id_class[7], var3, id_break[5])));
      rrfu_3.id_byte(var3);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{95, 87, -65, -102, -67, 76, 15, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 2000};
   }

   @Override
   public void e_(boolean var1) {
      String var2 = var1 ? id_class[13] : id_class[14];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[12]])
         .id_class((rrtO_2)(var1 ? new rrtQ_2(id_class[15], var2, id_break[13]) : new rrtx_3(id_class[16], var2, id_break[14])));
      rrfu_3.id_byte(var2);
   }

   @Override
   public void c_(String var1) {
      String var2 = this.id_byte(var1) + " не найден в списке префиксов";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[10]]).id_class(new rrtx_3(id_class[12], var2, id_break[11]));
      rrfu_3.id_byte(var2);
   }
}
