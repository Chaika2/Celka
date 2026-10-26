package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_throws {
   private static boolean[] id_break;
   private static short[] id_byte;
   public static Object[] id_class;
   private static byte[] id_protected;

   public static C_class id_byte() {
      return (C_class)id_class().id_break();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, 29, 32, 25, 1, -40, 37, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1773539219;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5772819695079633059L;
   }

   public static C_catch id_class() {
      return (C_catch)id_class[id_byte[0]];
   }

   public static C_private id_break() {
      return (C_private)id_class[id_byte[1]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[2];
      id_class = var0;
      C_private var10002 = new C_private();
      Pd_1.id_byte(var10002);
      var0[1] = var10002;
      var0[0] = new C_byte();
   }

   private static void id_catch() {
      id_break = new boolean[]{true, true, false};
   }

   private static void id_case() {
      id_byte = new short[]{0, 1};
   }

   private static void id_protected() {
      id_protected = new byte[]{2};
   }
}
