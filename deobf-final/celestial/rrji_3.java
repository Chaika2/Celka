package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrji_3 implements rrja_3 {
   private static short[] class_;
   private static String[] break_;

   private static void byte_() {
      class_ = new short[]{0, 2000, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrjD_2 var1, boolean var2) {
      String var3 = "Вейпоинт " + this.break_(var1) + (var2 ? " удалён из списка" : break_[5]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Waypoints", var3, 2000) : new rrtx_3("Waypoints", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   @Override
   public void class_() {
      String var1 = "Список вейпоинтов пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Waypoints", var1, 2000));
      rrfu_3.byte_(var1);
   }

   @Override
   public void class_(rrjD_2 var1) {
      String var2 = "Вейпоинт " + this.break_(var1) + " перезаписан";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Waypoints", var2, 2000));
      rrfu_3.byte_(var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -790789157655257881L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1163485135;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, -10, 28, 59, -107, -33, -92, -28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(rrjD_2 var1, boolean var2) {
      String var3 = "Вейпоинт " + this.break_(var1) + (var2 ? " добавлен в список" : break_[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("Waypoints", var3, 2000) : new rrtx_3("Waypoints", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   private String break_(rrjD_2 var1) {
      return "'" + var1.byte_() + "'";
   }

   private static void break_() {
      break_ = new String[]{
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
   public void super_() {
      String var1 = "Список вейпоинтов очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Waypoints", var1, 2000));
      rrfu_3.byte_(var1);
   }

   @Override
   public void b_(String var1) {
      String var2 = "'" + var1 + "' не найден в списке вейпоинтов";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Waypoints", var2, 2000));
      rrfu_3.byte_(var2);
   }
}
