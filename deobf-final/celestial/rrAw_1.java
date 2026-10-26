package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrAw_1 {
   ;
   private static String[] stringsfdd9e1cda53536f3a280666af211bfa1;
   public static Object[] staticFieldsfdd9e1cda53536f3a280666af211bfa1;
   private static byte[] bytesfdd9e1cda53536f3a280666af211bfa1;
   private static boolean[] booleansfdd9e1cda53536f3a280666af211bfa1;
   private static short[] shortsfdd9e1cda53536f3a280666af211bfa1;

   private static void byte_() {
      shortsfdd9e1cda53536f3a280666af211bfa1 = new short[]{2, 0, 1};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -140632170938183821L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1871872982;
   }

   private static void class_() {
      Object[] var0 = new Object[]{new rrAw_1(), new rrAw_1(), null};
      var0[2] = new rrAw_1[]{(rrAw_1)var0[0], (rrAw_1)var0[1]};
      staticFieldsfdd9e1cda53536f3a280666af211bfa1 = var0;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-88, 84, 10, -17, -41, -34, -69, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      bytesfdd9e1cda53536f3a280666af211bfa1 = new byte[]{2, 2, 3};
   }

   private static void case_() {
      booleansfdd9e1cda53536f3a280666af211bfa1 = new boolean[]{false, true, false, false, true, true};
   }

   private static void protected_() {
      stringsfdd9e1cda53536f3a280666af211bfa1 = new String[]{new String("START"), new String("STOP")};
   }
}
