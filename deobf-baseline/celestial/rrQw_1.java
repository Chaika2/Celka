package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQw_1 implements rrQt_1 {
   private static String[] id_class;
   private static short[] id_break;

   @Override
   public void id_byte() {
      String var1 = id_class[10];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[8]]).id_class(new rrtx_3(id_class[11], var1, id_break[9]));
   }

   static {
      ntfClinit();
   }

   private String id_class(rrQx_1 var1) {
      return "'" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[19]]).id_private().id_throws().id_break(var1.id_class()) + "'";
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8849337857880628880L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -808719613;
   }

   @Override
   public void id_class(rrQd_1 var1) {
      String var2 = "Аккаунты с типом '" + var1.id_class() + "' не найдены";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[15]]).id_class(new rrtx_3(id_class[15], var2, id_break[16]));
   }

   @Override
   public void id_class(rrQx_1 var1, boolean var2) {
      String var3 = this.id_class(var1) + (var2 ? id_class[0] : id_class[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_class[2], var3, id_break[1]) : new rrtx_3(id_class[3], var3, id_break[2])));
   }

   @Override
   public void id_class() {
      String var1 = id_class[8];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[6]]).id_class(new rrtQ_2(id_class[9], var1, id_break[7]));
   }

   @Override
   public void id_class(String var1) {
      String var2 = "'"
         + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[10]]).id_private().id_throws().id_break(var1)
         + "' не найден в списке аккаунтов";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[11]]).id_class(new rrtx_3(id_class[12], var2, id_break[12]));
   }

   @Override
   public void id_break(rrQd_1 var1) {
      String var2 = "Все аккаунты с типом '" + var1.id_class() + "' удалены";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[17]]).id_class(new rrtQ_2(id_class[16], var2, id_break[18]));
   }

   @Override
   public void id_break(rrQx_1 var1, boolean var2) {
      String var3 = this.id_class(var1) + (var2 ? id_class[4] : id_class[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[3]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_class[6], var3, id_break[4]) : new rrtx_3(id_class[7], var3, id_break[5])));
   }

   @Override
   public void id_break() {
      String var1 = id_class[13];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[13]]).id_class(new rrtx_3(id_class[14], var1, id_break[14]));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-74, -116, 116, 15, 44, -77, -75, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_break = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0};
   }

   private static void id_protected() {
      id_class = new String[]{
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
