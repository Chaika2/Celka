package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwA_2 extends rrwp_3 {
   private static byte[] id_extends;
   private static String[] id_native;

   public rrwA_2() {
      super(id_native[0], id_native[1], id_extends[0], id_native[2]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1301166446;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7516218109850198568L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{40, -62, -39, -127, -97, 70, -103, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_extends() {
      id_native = new String[]{new String("FunTime"), new String("mc.funtime.su"), new String("Most Popular")};
   }

   public rrwA_2 id_case() {
      rrwA_2 var1 = new rrwA_2();
      var1.id_class(this);
      return var1;
   }

   private static void id_native() {
      id_extends = new byte[]{-1};
   }
}
