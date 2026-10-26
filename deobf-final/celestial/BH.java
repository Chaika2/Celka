package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BH {
   private static String[] break_;
   private static boolean[] byte_;
   public static Object[] class_;
   private static byte[] protected_;

   private static void byte_() {
      Object[] var0 = new Object[8];
      String[] var2 = new String[]{"аирдроп"};
      var0[0] = var2;
      String[] var3 = new String[]{"скрудж"};
      var0[1] = var3;
      String[] var4 = new String[]{"талисман"};
      var0[2] = var4;
      String[] var5 = new String[]{"тайный торговец » появился тайный торговец:"};
      var0[3] = var5;
      Pattern[] var6 = new Pattern[]{Pattern.compile("x: (-?\\d+)(?: y: (-?\\d+))? z: (-?\\d+)", 0)};
      var0[4] = var6;
      Pattern[] var7 = new Pattern[]{Pattern.compile("Координаты (-?\\d+)(?: (-?\\d+))? (-?\\d+)")};
      var0[5] = var7;
      Pattern[] var8 = new Pattern[]{Pattern.compile("Талисман: (-?\\d+)(?: (-?\\d+))? (-?\\d+)")};
      var0[6] = var8;
      Pattern[] var9 = new Pattern[]{Pattern.compile("ТАЙНЫЙ ТОРГОВЕЦ » Появился тайный торговец: (-?\\d+)(?: (-?\\d+))? (-?\\d+)")};
      var0[7] = var9;
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 941824619;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8166532556485156228L;
   }

   private static void class_() {
      protected_ = new byte[]{2, 3, 4, 5, 6, 7, 8};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{35, -51, -36, 126, -40, -18, -103, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new boolean[]{true, false, false, true, false, true, true, false, true, false, true, false, true, false, true, false, true, false};
   }

   private static void protected_() {
      break_ = new String[]{
         new String("аирдроп"),
         new String("скрудж"),
         new String("талисман"),
         new String("тайный торговец » появился тайный торговец:"),
         new String("x: (-?\\d+)(?: y: (-?\\d+))? z: (-?\\d+)"),
         new String("Координаты (-?\\d+)(?: (-?\\d+))? (-?\\d+)"),
         new String("Талисман: (-?\\d+)(?: (-?\\d+))? (-?\\d+)"),
         new String("ТАЙНЫЙ ТОРГОВЕЦ » Появился тайный торговец: (-?\\d+)(?: (-?\\d+))? (-?\\d+)")
      };
   }
}
