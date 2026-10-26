package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum SK implements C_char {
   private static String[] strings84fbf20de4d13027acc13a6866788039;
   private static short[] shorts84fbf20de4d13027acc13a6866788039;
   private static byte[] bytes84fbf20de4d13027acc13a6866788039;
   private static boolean[] booleans84fbf20de4d13027acc13a6866788039;
   public static Object[] staticFields84fbf20de4d13027acc13a6866788039;

   private static void id_byte() {
      Object[] var0 = new Object[]{new SK(), null};
      var0[1] = new SK[]{(SK)var0[0]};
      staticFields84fbf20de4d13027acc13a6866788039 = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, -29, -63, 18, -54, -8, -4, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public C_void id_class() {
      return (SU)SU.staticFields60242b15623d3e12b4eaac026de79971[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -146940702868833858L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -979455904;
   }

   private static void id_break() {
      bytes84fbf20de4d13027acc13a6866788039 = new byte[]{2};
   }

   private static void id_throws() {
      booleans84fbf20de4d13027acc13a6866788039 = new boolean[]{true, false, false, false, true};
   }

   private static void id_case() {
      shorts84fbf20de4d13027acc13a6866788039 = new short[]{1, 0, 0};
   }

   private static void id_protected() {
      strings84fbf20de4d13027acc13a6866788039 = new String[]{new String("INSTANCE")};
   }
}
