package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTc_1 extends rJY {
   private static boolean[] id_class;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -528784709;
   }

   public rrTc_1(rXu_1 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2501845015190606632L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{18, -108, -92, 52, -22, 126, 11, -122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rdn_3 id_class(int var1) {
      return rdn_3.id_break;
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return id_class[1];
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, rdn_3 var2) {
      return rdn_3.id_break;
   }

   @Override
   public void id_break(rdn_3 var1) {
   }

   private static void id_catch() {
      id_class = new boolean[2];
   }
}
