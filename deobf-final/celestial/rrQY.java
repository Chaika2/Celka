package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQY extends Lu_1 {
   private static boolean[] class_;

   public rrQY(cm_3 var1, int var2, int var3, int var4, int var5, rgP_2 var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.class_((var0, var1x) -> new rgN_2(var0).class_(rgF_2.OBFUSCATED).catch_());
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7168985748675211623L;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      return this.int_ && !vm_3.catch_(var1) && !vm_3.throws_(var1) ? super.class_(var1, var2, var3) : class_[0];
   }

   private static void goto_() {
      class_ = new boolean[1];
   }

   private static int new_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -324428020;
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, -20, 4, -128, 35, -66, -124, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
