package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZU implements rrZp_1 {
   private static short[] class_;
   private static String[] break_;

   @Override
   public void byte_(rrIX var1) {
      this.class_(var1, "удалён");
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{107, 39, 15, -46, -21, -88, -74, 28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 321226379;
   }

   public void class_(rrIX var1, String var2) {
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Configs", "Конфиг " + this.throws_(var1) + " " + var2, 1500));
   }

   private static void class_() {
      class_ = new short[]{0, 1500};
   }

   @Override
   public void class_(rrIX var1) {
      this.class_(var1, "сохранён");
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6722043824286251716L;
   }

   private static void break_() {
      break_ = new String[]{new String("добавлен"), new String("удалён"), new String("загружен"), new String("сохранён"), new String("Configs")};
   }

   @Override
   public void break_(rrIX var1) {
      this.class_(var1, "загружен");
   }

   public String throws_(rrIX var1) {
      return "'" + var1.class_() + "'";
   }

   @Override
   public void protected_(rrIX var1) {
      this.class_(var1, "добавлен");
   }
}
