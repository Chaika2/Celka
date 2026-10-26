package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrji_3 implements rrja_3 {
   private static short[] id_class;
   private static String[] id_break;

   private static void id_byte() {
      id_class = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrjD_2 var1, boolean var2) {
      String var3 = "Вейпоинт " + this.id_break(var1) + (var2 ? id_break[4] : id_break[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[3]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_break[6], var3, 2000) : new rrtx_3(id_break[7], var3, 2000)));
      rrfu_3.id_byte(var3);
   }

   @Override
   public void id_class() {
      String var1 = id_break[10];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[8]]).id_class(new rrtx_3(id_break[11], var1, 2000));
      rrfu_3.id_byte(var1);
   }

   @Override
   public void id_class(rrjD_2 var1) {
      String var2 = "Вейпоинт " + this.id_break(var1) + " перезаписан";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[12]]).id_class(new rrtQ_2(id_break[13], var2, 2000));
      rrfu_3.id_byte(var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -790789157655257881L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1163485135;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, -10, 28, 59, -107, -33, -92, -28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(rrjD_2 var1, boolean var2) {
      String var3 = "Вейпоинт " + this.id_break(var1) + (var2 ? id_break[0] : id_break[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[0]])
         .id_class((rrtO_2)(var2 ? new rrtQ_2(id_break[2], var3, 2000) : new rrtx_3(id_break[3], var3, 2000)));
      rrfu_3.id_byte(var3);
   }

   private String id_break(rrjD_2 var1) {
      return "'" + var1.id_byte() + "'";
   }

   private static void id_break() {
      id_break = new String[]{
         new String(" добавлен в список"),
         new String(" уже есть в списке"),
         new String("Waypoints"),
         new String("Waypoints"),
         new String(" удалён из списка"),
         new String(" не найден в списке"),
         new String("Waypoints"),
         new String("Waypoints"),
         new String("Список вейпоинтов очищен"),
         new String("Waypoints"),
         new String("Список вейпоинтов пуст"),
         new String("Waypoints"),
         new String("Waypoints"),
         new String("Waypoints")
      };
   }

   @Override
   public void id_super() {
      String var1 = id_break[8];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[6]]).id_class(new rrtQ_2(id_break[9], var1, 2000));
      rrfu_3.id_byte(var1);
   }

   @Override
   public void b_(String var1) {
      String var2 = "'" + var1 + "' не найден в списке вейпоинтов";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[10]]).id_class(new rrtx_3(id_break[12], var2, 2000));
      rrfu_3.id_byte(var2);
   }
}
