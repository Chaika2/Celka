package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNf_1 implements rrNj_1 {
   private static short[] class_;
   private static String[] break_;

   static {
      ntfClinit();
   }

   @Override
   public void class_(boolean var1) {
      rrNj_1.super.class_(var1);
      String var2 = var1 ? "Список предметов сохранён" : break_[1];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var1 ? new rrtQ_2("Auto Buy", var2, 2000) : new rrtx_3("Auto Buy", var2, 2000)));
      rrfu_3.byte_(var2);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, 117, 100, -20, 33, -103, -100, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7189238808779784321L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 536412740;
   }

   private static void class_() {
      break_ = new String[]{
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
   public void break_(boolean var1) {
      rrNj_1.super.break_(var1);
      String var2 = var1 ? "Список предметов обновлён" : break_[5];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var1 ? new rrtQ_2("Auto Buy", var2, 2000) : new rrtx_3("Auto Buy", var2, 2000)));
      rrfu_3.byte_(var2);
   }

   private static void break_() {
      class_ = new short[]{0, 2000, 2000, 0, 2000, 2000};
   }
}
