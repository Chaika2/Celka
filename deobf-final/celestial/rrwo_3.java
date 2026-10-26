package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwo_3 implements rrwK_2 {
   private static String[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   @Override
   public void byte_(String var1) {
      this.class_(var1, "добавлен", false);
   }

   private static void byte_() {
      byte_ = new short[]{0, 0, 1500, 1500};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4180519224472450342L;
   }

   public void class_(String var1, String var2, boolean var3) {
      CreeperFarm var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().i();
      String var5 = "Конфиг " + this.case_(var1) + " " + var2;
      rrfu_3.byte_(var5);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var3 ? new rrtx_3(var4.final_(), var5, 1500) : new rrtQ_2(var4.final_(), var5, 1500)));
   }

   @Override
   public void class_(String var1) {
      this.class_(var1, "загружен", false);
   }

   private static void class_() {
      class_ = new String[]{new String("добавлен"), new String("удалён"), new String("загружен"), new String("сохранён"), new String("не существует")};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1216260960;
   }

   private static void break_() {
      break_ = new boolean[]{false, false, false, false, true};
   }

   @Override
   public void break_(String var1) {
      this.class_(var1, "не существует", true);
   }

   @Override
   public void throws_(String var1) {
      this.class_(var1, "удалён", false);
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-76, -116, -33, 93, 55, 67, 123, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String case_(String var1) {
      return "'" + var1 + "'";
   }

   @Override
   public void protected_(String var1) {
      this.class_(var1, "сохранён", false);
   }
}
