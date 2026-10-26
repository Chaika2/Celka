package celestial;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnY_2 extends rrTF<AntiBot> {
   private static double[] id_class;
   private static boolean[] id_break;

   public rrnY_2(AntiBot var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrnk_3 var1) {
      cM_2 var2 = var1.id_class();
      if (!var2.sc() && var2.sv().getProperties().isEmpty() && !id_import.id_finally()) {
         int var3 = var2.Bq();
         double var4 = var2.id_class(iQ_2.id_private);
         int var6 = 0;

         for (rdn_3 var8 : var2.PV()) {
            if (var8.id_break() instanceof rxS_2) {
               var6++;
            }
         }

         boolean var9 = var3 == 0 && var6 > 0 && var4 == 4.0 ? true : id_break[4];
         if (var9) {
            var2.id_break(true, true);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8706633700954068610L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-14, 3, 82, -75, 126, -77, -5, 66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new boolean[]{true, true, false, true, false, true, true};
   }

   @EventTarget
   public void id_class(rrnM_2 var1) {
      cG_2 var2 = var1.id_class();
      if (!var2.sc() && !id_import.id_finally()) {
         GameProfile var3 = var2.sv();
         if (!var3.getId().equals(rhd_3.id_extends(var3.getName()))) {
            var2.id_break(true, true);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1071219453;
   }

   private static void id_break() {
      id_class = new double[]{4.0};
   }
}
