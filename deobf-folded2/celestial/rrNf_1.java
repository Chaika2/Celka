package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNf_1 implements rrNj_1 {
   private static short[] id_class;
   private static String[] id_break;

   static {
      ntfClinit();
   }

   @Override
   public void id_class(boolean var1) {
      rrNj_1.super.id_class(var1);
      String var2 = var1 ? "Список предметов сохранён" : id_break[1];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .id_class((rrtO_2)(var1 ? new rrtQ_2("Auto Buy", var2, 2000) : new rrtx_3("Auto Buy", var2, 2000)));
      rrfu_3.id_byte(var2);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, 117, 100, -20, 33, -103, -100, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7189238808779784321L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 536412740;
   }

   private static void id_class() {
      id_break = new String[]{
         new String("Список предметов сохранён"),
         new String("Не удалось сохранить список предметов"),
         new String("Auto Buy"),
         new String("Auto Buy"),
         new String("Список предметов обновлён"),
         new String("Не удалось обновить список предметов"),
         new String("Auto Buy"),
         new String("Auto Buy")
      };
   }

   @Override
   public void id_break(boolean var1) {
      rrNj_1.super.id_break(var1);
      String var2 = var1 ? "Список предметов обновлён" : id_break[5];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .id_class((rrtO_2)(var1 ? new rrtQ_2("Auto Buy", var2, 2000) : new rrtx_3("Auto Buy", var2, 2000)));
      rrfu_3.id_byte(var2);
   }

   private static void id_break() {
      id_class = new short[]{0, 2000, 2000, 0, 2000, 2000};
   }
}
