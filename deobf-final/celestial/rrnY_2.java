package celestial;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnY_2 extends rrTF<AntiBot> {
   private static double[] class_;
   private static boolean[] break_;

   public rrnY_2(AntiBot var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrnk_3 var1) {
      cM_2 var2 = var1.class_();
      if (!var2.sc() && var2.sv().getProperties().isEmpty() && !import_.finally_()) {
         int var3 = var2.Bq();
         double var4 = var2.class_(iQ_2.private_);
         int var6 = 0;

         for (rdn_3 var8 : var2.PV()) {
            if (var8.break_() instanceof rxS_2) {
               var6++;
            }
         }

         boolean var9 = var3 == 0 && var6 > 0 && var4 == 4.0 ? true : break_[4];
         if (var9) {
            var2.break_(true, true);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8706633700954068610L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-14, 3, 82, -75, 126, -77, -5, 66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new boolean[]{true, true, false, true, false, true, true};
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

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1071219453;
   }

   private static void break_() {
      class_ = new double[]{4.0};
   }
}
