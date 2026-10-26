package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sd_3 implements D {
   private static short[] class_;

   public sd_3(sx_3 var1) {
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(T var1) {
      CreeperFarm var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().i();
      if (var2.aJ_() && var2.new_() != null) {
         if ((Boolean)C_class.instanceof_().Pw.class_[0]) {
            Color var3 = (Color)C_class.instanceof_().try_.class_[0];
            float var4 = (Float)C_class.instanceof_().super_.class_[0];
            float var5 = (Float)C_class.instanceof_().PT.class_[0];
            boolean var6 = (Boolean)C_class.instanceof_().package_.class_[0];
            bj_3.class_(var3, var4, var5, var6);
            bj_3.class_(var1.byte_(), var2.new_().break_());
            bj_3.class_(var6);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -672219913;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, -119, 69, -3, -2, -108, -47, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3560867885830195352L;
   }

   private static void class_() {
      class_ = new short[6];
   }
}
