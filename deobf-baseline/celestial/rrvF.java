package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvF implements rrvv_1 {
   private static String[] id_class;
   private static short[] id_break;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-33, -77, -35, -27, 121, -101, -6, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_byte() {
      String var1 = id_class[5];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[7]]).id_class(new rrtx_3(id_class[6], var1, id_break[8]));
      rrfu_3.id_byte(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrvm_1 var1) {
      String var2 = this.id_protected(var1.id_byte());
      String var3 = "Макрос " + var2 + " добавлен в список";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]]).id_class(new rrtQ_2(id_class[0], var3, id_break[1]));
      rrfu_3.id_byte(var3);
   }

   @Override
   public void id_class(String var1) {
      String var2 = "Макрос " + this.id_protected(var1) + " не найден";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[11]]).id_class(new rrtx_3(id_class[9], var2, id_break[12]));
      rrfu_3.id_byte(var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1495990719;
   }

   @Override
   public void id_class() {
      String var1 = id_class[7];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[9]]).id_class(new rrtQ_2(id_class[8], var1, id_break[10]));
      rrfu_3.id_byte(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7951230137723785942L;
   }

   @Override
   public void id_class(rrvm_1 var1, boolean var2) {
      String var3 = this.id_protected(var1.id_byte());
      String var4 = var2 ? "Макрос " + var3 + " удалён из списка" : "Макрос " + var3 + " не найден в списке";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[2]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_class[1], var4, id_break[3]) : new rrtx_3(id_class[2], var4, id_break[4])));
      rrfu_3.id_byte(var4);
   }

   @Override
   public void id_break(String var1) {
      String var2 = "Макрос " + this.id_protected(var1) + " уже есть в списке";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[13]]).id_class(new rrtx_3(id_class[10], var2, id_break[14]));
      rrfu_3.id_byte(var2);
   }

   @Override
   public void id_break() {
      String var1 = id_class[3];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[5]]).id_class(new rrtQ_2(id_class[4], var1, id_break[6]));
      rrfu_3.id_byte(var1);
   }

   private static void id_throws() {
      id_class = new String[]{
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

   private static void id_protected() {
      id_break = new short[]{0, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   private String id_protected(String var1) {
      return "'" + var1 + "'";
   }
}
