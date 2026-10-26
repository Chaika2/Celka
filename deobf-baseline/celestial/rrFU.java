package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFU {
   private static short[] id_break;
   private static boolean[] id_byte;
   public static Object[] id_class;

   private static void id_byte() {
      id_break = new short[3];
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1520241811003773213L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1160008550;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, 90, 50, -67, 102, 40, -48, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class() {
      rrFU var0 = id_protected();
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[1]]).id_finally().id_class(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_break[2]]).id_class(var0);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrFU()};
      id_class = var0;
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, true};
   }

   private static rrFU id_protected() {
      return (rrFU)id_class[id_break[0]];
   }
}
