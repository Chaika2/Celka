package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHd_1 implements rrHx_1 {
   private static String[] id_class;
   private static short[] id_break;

   private static void id_byte() {
      id_break = new short[]{0, 2000, 2000, 0, 2000, 0, 2000, 2000, 0, 2000, 0, 2000};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 488762230;
   }

   public String id_class(xd_3 var1) {
      return "'" + var1.id_native().getString() + "'";
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6480066124745474168L;
   }

   @Override
   public void id_class() {
      String var1 = id_class[12];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[10]]).id_class(new rrtx_3(id_class[13], var1, 2000));
      rrfu_3.id_byte(var1);
   }

   @Override
   public void id_class(String var1, Exception var2) {
      String var3 = "'" + var1 + "'";
      String var4 = "Ошибка при добавлении " + var3;
      if (var2 instanceof u_1 var5 && var5.getMessage().equals(id_class[4])) {
         var4 = "Блок " + var3 + " не найден или является воздухом";
      }

      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[3]]).id_class(new rrtx_3(id_class[5], var4, 2000));
      rrfu_3.id_byte(var4);
   }

   @Override
   public void id_class(xd_3 var1, boolean var2) {
      String var3 = this.id_class(var1) + (var2 ? id_class[6] : id_class[7]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[5]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_class[8], var3, 2000) : new rrtx_3(id_class[9], var3, 2000)));
      rrfu_3.id_byte(var3);
   }

   @Override
   public void id_break(xd_3 var1, boolean var2) {
      String var3 = this.id_class(var1) + (var2 ? id_class[0] : id_class[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_class[2], var3, 2000) : new rrtx_3(id_class[3], var3, 2000)));
      rrfu_3.id_byte(var3);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -36, 127, -100, -45, -7, 35, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break() {
      String var1 = id_class[10];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[8]]).id_class(new rrtQ_2(id_class[11], var1, 2000));
      rrfu_3.id_byte(var1);
   }

   private static void id_protected() {
      id_class = new String[]{
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
