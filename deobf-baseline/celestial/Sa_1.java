package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sa_1 implements C_float<Boolean> {
   private static short[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static String[] id_throws;
   public static Object[] id_class;

   private static void id_byte() {
      id_protected = new boolean[]{true, false, false, false, true, true, false, true};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -618386505;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5368221297782928548L;
   }

   @Override
   public Class<Boolean> id_class() {
      return Boolean.class;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, -98, 118, 9, 60, 42, -46, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_throws = new String[]{
         new String("invalid boolean"),
         new String("1"),
         new String("true"),
         new String("yes"),
         new String("t"),
         new String("y"),
         new String("on"),
         new String("enable"),
         new String("0"),
         new String("false"),
         new String("no"),
         new String("f"),
         new String("n"),
         new String("off"),
         new String("disable")
      };
   }

   public Boolean id_break(C_import var1) throws RuntimeException {
      String var2 = var1.id_break();
      if (((List)id_class[id_break[0]]).contains(var2.toLowerCase(Locale.US))) {
         return id_protected[0];
      } else if (((List)id_class[id_break[1]]).contains(var2.toLowerCase(Locale.US))) {
         return id_protected[1];
      } else {
         throw new IllegalArgumentException(id_throws[0]);
      }
   }

   private static void id_throws() {
      id_break = new short[]{1, 2};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new Sa_1(), null, null};
      String[] var2 = new String[]{id_throws[1], id_throws[2], id_throws[3], id_throws[4], id_throws[5], id_throws[6], id_throws[7]};
      var0[1] = Arrays.asList(var2);
      String[] var3 = new String[]{id_throws[8], id_throws[9], id_throws[10], id_throws[11], id_throws[12], id_throws[13], id_throws[14]};
      var0[2] = Arrays.asList(var3);
      id_class = var0;
   }

   private static void id_protected() {
      id_byte = new byte[]{7, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6, 2, 3};
   }
}
