package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmj_3 implements rruq_1 {
   private static boolean[] id_class;
   private static float[] id_break;
   private static double[] id_byte;
   private static String[] id_protected;
   private static short[] id_throws;
   private static byte[] id_case;

   private static void id_byte() {
      id_byte = new double[2];
   }

   rrmj_3() {
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, -66, -34, -68, 79, -32, 19, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6160871837883067820L;
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      rjU_2 var2 = ((Hh_1)PP.b_.id_class[16]).id_finally().id_new();
      if (var2 != null) {
         rjU_2 var3 = var2.id_class(0.0, (double)(((cb_3)PP.b_.id_class[57]).Bx() / 2.0F), 0.0);
         String var4 = !var1.id_case() && !var1.id_case(4)
            ? ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_class("Untitled")
            : var1.id_extends();
         rjU_2 var5 = var1.id_final() ? var1.id_break((h_1)h_1.staticFieldse900d351c8b53997a0ceaa72eeab0b7d[0], var3) : var3;
         ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_class(new rrjD_2(var4, var5, rrfp_3.id_throws()), true);
      }
   }

   private static void id_class() {
      id_class = new boolean[]{true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1419539048;
   }

   private static void id_break() {
      id_protected = new String[]{new String("Untitled")};
   }

   private static void id_throws() {
      id_throws = new short[]{16, 57, 0, 0, 0};
   }

   private static void id_case() {
      id_break = new float[]{2.0F};
   }

   private static void id_protected() {
      id_case = new byte[]{4};
   }
}
