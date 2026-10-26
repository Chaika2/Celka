package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class u_1 extends RuntimeException implements m_1 {
   private static String[] class_;

   public u_1(Throwable var1) {
      super(var1);
   }

   public u_1(String var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      class_ = new String[]{new String("Произошла ошибка, обратитесь в тикет чтобы решить проблему")};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6099115097068177771L;
   }

   @Override
   public void class_(C_interface var1, List<C_import> var2) {
      PP.a_.class_("Произошла ошибка, обратитесь в тикет чтобы решить проблему", rgF_2.RED);
      this.printStackTrace();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 384514928;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-17, 108, -40, 123, -45, -88, 111, -80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
