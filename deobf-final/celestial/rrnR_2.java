package celestial;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnR_2 extends rrTF<AntiBot> {
   private static boolean[] class_;

   public rrnR_2(AntiBot var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      class_ = new boolean[]{true, true};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3318640259802006106L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, 60, -21, 33, -31, 23, -53, -31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1132771270;
   }

   @EventTarget
   public void class_(rrnM_2 var1) {
      cG_2 var2 = var1.class_();
      if (!var2.sc() && !import_.finally_()) {
         GameProfile var3 = var2.sv();
         if (!var3.getId().equals(rhd_3.extends_(var3.getName()))) {
            var2.break_(true, true);
         }
      }
   }
}
