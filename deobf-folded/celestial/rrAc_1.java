package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAc_1 extends Om_1 {
   public static Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -253607254;
   }

   public static rrAc_1 id_class() {
      return (rrAc_1)id_class[id_break[0]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7931165048055360867L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-34, -115, -79, -74, -102, 102, -126, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAc_1 id_break() {
      rrAc_1 var0 = id_class();
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[1]]).id_finally().id_class(var0);
      return var0;
   }

   private static void id_throws() {
      id_break = new short[2];
   }

   private static void id_case() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrAc_1()};
      id_class = var0;
   }
}
