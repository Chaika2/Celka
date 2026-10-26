package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruR implements rruq_1 {
   private static short[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{false, true};
   }

   rruR() {
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-114, 37, -30, -79, -29, -1, -7, 90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2359317265975959412L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 670489735;
   }

   private static void id_class() {
      id_class = new short[2];
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      String var2 = var1.id_extends();
      int var3 = var1.id_case(0) ? -1 : var1.id_break((rruD)rruD.staticFieldsba29985e322c382da8479b6f59b746b0[0]);
      ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).id_class(new rrqU_2(ri_3.id_class(var2), var3), var2, true);
   }

   private static void id_break() {
      id_byte = new byte[]{-1};
   }
}
