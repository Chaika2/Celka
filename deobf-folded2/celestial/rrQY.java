package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQY extends Lu_1 {
   private static boolean[] id_class;

   public rrQY(cm_3 var1, int var2, int var3, int var4, int var5, rgP_2 var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.id_class((var0, var1x) -> new rgN_2(var0).id_class(rgF_2.OBFUSCATED).id_catch());
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7168985748675211623L;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      return this.id_int && !vm_3.id_catch(var1) && !vm_3.id_throws(var1) ? super.id_class(var1, var2, var3) : id_class[0];
   }

   private static void id_goto() {
      id_class = new boolean[1];
   }

   private static int id_new(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -324428020;
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, -20, 4, -128, 35, -66, -124, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
