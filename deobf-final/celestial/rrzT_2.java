package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrzT_2 {
   ;
   public static Object[] staticFieldsf131934b317338e68bb375b05e34a601;
   private static short[] shortsf131934b317338e68bb375b05e34a601;
   private static boolean[] booleansf131934b317338e68bb375b05e34a601;
   private static String[] stringsf131934b317338e68bb375b05e34a601;
   private static byte[] bytesf131934b317338e68bb375b05e34a601;

   private static void byte_() {
      Object[] var0 = new Object[]{
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         new rrzT_2(),
         null
      };
      var0[15] = new rrzT_2[]{
         (rrzT_2)var0[0],
         (rrzT_2)var0[1],
         (rrzT_2)var0[2],
         (rrzT_2)var0[3],
         (rrzT_2)var0[4],
         (rrzT_2)var0[5],
         (rrzT_2)var0[6],
         (rrzT_2)var0[7],
         (rrzT_2)var0[8],
         (rrzT_2)var0[9],
         (rrzT_2)var0[10],
         (rrzT_2)var0[11],
         (rrzT_2)var0[12],
         (rrzT_2)var0[13],
         (rrzT_2)var0[14]
      };
      staticFieldsf131934b317338e68bb375b05e34a601 = var0;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{43, 77, 111, 115, -54, -3, 49, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4745327990207655795L;
   }

   private static void class_() {
      bytesf131934b317338e68bb375b05e34a601 = new byte[]{
         15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 16
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1787233629;
   }

   private static void throws_() {
      stringsf131934b317338e68bb375b05e34a601 = new String[]{
         new String("size"),
         new String("creationTime"),
         new String("lastAccessTime"),
         new String("lastModifiedTime"),
         new String("isDirectory"),
         new String("isRegularFile"),
         new String("isSymbolicLink"),
         new String("isOther"),
         new String("fileKey"),
         new String("compressedSize"),
         new String("crc"),
         new String("method"),
         new String("owner"),
         new String("group"),
         new String("permissions")
      };
   }

   private static void case_() {
      shortsf131934b317338e68bb375b05e34a601 = new short[]{15, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
   }

   private static void protected_() {
      booleansf131934b317338e68bb375b05e34a601 = new boolean[]{false, true, false, false, true, true};
   }
}
