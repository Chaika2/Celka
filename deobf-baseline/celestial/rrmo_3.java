package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmo_3 implements rruq_1 {
   private static short[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_byte = new boolean[]{false, true};
   }

   rrmo_3() {
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -748854037;
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      String var2 = var1.id_extends();
      int var3 = var1.id_case(id_byte[0]) ? id_break[0] : var1.id_break((rruD)rruD.staticFieldsba29985e322c382da8479b6f59b746b0[id_class[0]]);
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_class[1]]).id_class(new rrqz_3(ri_3.id_class(var2), var3), var2, id_byte[1]);
   }

   private static void id_class() {
      id_break = new byte[]{-1};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, 76, -21, 42, -8, 24, -54, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6608011646610890651L;
   }

   private static void id_break() {
      id_class = new short[2];
   }
}
