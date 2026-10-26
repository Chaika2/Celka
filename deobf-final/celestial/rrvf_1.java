package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvf_1 implements rrvI {
   private static short[] class_;
   private static String[] break_;

   private static void byte_() {
      break_ = new String[]{
         new String("Все бинды были сброшены"), new String("Binds"), new String("Binds"), new String("Нет забинженных модулей"), new String("Binds")
      };
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(Module var1) {
      String var2 = "Бинд модуля " + this.break_(var1) + " сброшен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Binds", var2, 2000));
      rrfu_3.byte_(var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7144229370063808129L;
   }

   @Override
   public void class_() {
      String var1 = "Все бинды были сброшены";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Binds", var1, 2000));
      rrfu_3.byte_(var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1907661388;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, 47, -93, -91, 114, -116, -91, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private String break_(Module var1) {
      return "'" + var1.final_() + "'";
   }

   @Override
   public void break_() {
      String var1 = "Нет забинженных модулей";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Binds", var1, 2000));
      rrfu_3.byte_(var1);
   }

   private static void protected_() {
      class_ = new short[]{0, 2000, 0, 2000, 0, 2000};
   }
}
