package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sd_3 implements D {
   private static short[] id_class;

   public sd_3(sx_3 var1) {
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(T var1) {
      CreeperFarm var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().i();
      if (var2.aJ_() && var2.id_new() != null) {
         if ((Boolean)C_class.id_instanceof().Pw.id_class[0]) {
            Color var3 = (Color)C_class.id_instanceof().id_try.id_class[0];
            float var4 = (Float)C_class.id_instanceof().id_super.id_class[0];
            float var5 = (Float)C_class.id_instanceof().PT.id_class[0];
            boolean var6 = (Boolean)C_class.id_instanceof().id_package.id_class[0];
            bj_3.id_class(var3, var4, var5, var6);
            bj_3.id_class(var1.id_byte(), var2.id_new().id_break());
            bj_3.id_class(var6);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -672219913;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, -119, 69, -3, -2, -108, -47, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3560867885830195352L;
   }

   private static void id_class() {
      id_class = new short[6];
   }
}
