package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum sr_3 implements C_float<Float> {
   ;
   public static Object[] staticFieldsdd9a043fbdee37a982ad31015e01625d;
   private static String[] stringsdd9a043fbdee37a982ad31015e01625d;
   private static short[] shortsdd9a043fbdee37a982ad31015e01625d;
   private static byte[] bytesdd9a043fbdee37a982ad31015e01625d;
   private static boolean[] booleansdd9a043fbdee37a982ad31015e01625d;

   private static void byte_() {
      booleansdd9a043fbdee37a982ad31015e01625d = new boolean[]{true, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-19, -2, 123, 52, 49, -96, -102, -68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2542288222191577160L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -506419549;
   }

   @Override
   public Class<Float> class_() {
      return Float.class;
   }

   private static void break_() {
      Object[] var0 = new Object[]{new sr_3(), null};
      var0[1] = new sr_3[]{(sr_3)var0[0]};
      staticFieldsdd9a043fbdee37a982ad31015e01625d = var0;
   }

   public Float break_(C_import var1) throws RuntimeException {
      String var2 = var1.break_();
      if (!var2.matches("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$")) {
         throw new IllegalArgumentException("failed float format check");
      } else {
         return Float.parseFloat(var2);
      }
   }

   private static void catch_() {
      shortsdd9a043fbdee37a982ad31015e01625d = new short[]{1, 0};
   }

   private static void case_() {
      stringsdd9a043fbdee37a982ad31015e01625d = new String[]{
         new String("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$"), new String("failed float format check"), new String("INSTANCE")
      };
   }

   private static void protected_() {
      bytesdd9a043fbdee37a982ad31015e01625d = new byte[]{2};
   }
}
