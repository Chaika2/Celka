package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrli_3 extends rrTF<GuiMove> {
   private static boolean[] id_class;

   public rrli_3(GuiMove var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   public boolean id_class(vm_3 var1) {
      return false;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8495448147456392041L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, -11, -123, 1, -88, 102, -94, 14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 330579518;
   }

   private static void id_class() {
      id_class = new boolean[1];
   }
}
