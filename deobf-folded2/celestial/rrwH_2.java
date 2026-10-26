package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwH_2 extends rrwp_3 {
   private static byte[] id_extends;
   private static String[] id_native;

   public rrwH_2() {
      super("ReallyWorld", "mc.reallyworld.ru", -1, "Most Popular");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3625202999393322228L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1994897764;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{106, 75, 49, -107, -52, 12, 11, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_extends() {
      id_native = new String[]{new String("ReallyWorld"), new String("mc.reallyworld.ru"), new String("Most Popular")};
   }

   private static void id_case() {
      id_extends = new byte[]{-1};
   }
}
