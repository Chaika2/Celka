package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class W extends d_1 {
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static String[] id_protected;

   private static void id_byte() {
      id_byte = new byte[]{2};
   }

   public W(C_import var1, Throwable var2) {
      super(var1, var2.getMessage());
   }

   public W(C_import var1, String var2) {
      String var10002 = id_protected[1];
      Object[] var10003 = new Object[1];
      var10003[id_break[3]] = var2;
      super(var1, String.format(var10002, var10003));
   }

   public W(C_import var1, String var2, Throwable var3) {
      String var10002 = id_protected[0];
      Object[] var10003 = new Object[1];
      var10003[id_break[1]] = var2;
      super(var1, String.format(var10002, var10003), var3);
   }

   public W(C_import var1, String var2, String var3) {
      String var10002 = id_protected[2];
      Object[] var10003 = new Object[2];
      var10003[id_break[4]] = var2;
      var10003[1] = var3;
      super(var1, String.format(var10002, var10003));
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1250116677;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3299893787230363687L;
   }

   private static void id_class() {
      id_break = new boolean[]{true, false, true, false, false, true};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-98, -69, -121, -21, -36, -55, -38, -3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new String[]{new String("Ожидается %s"), new String("Ожидается %s"), new String("Ожидалось %s, но вместо этого получено %s")};
   }
}
