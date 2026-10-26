package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bc_1 extends Pv_1 {
   private static short[] id_break;
   private static byte[] id_byte;

   private void id_byte(rYB var1, rns_3 var2, rnP_2 var3) {
      for (rhd_3 var5 : var1.id_continue()) {
         if (var5 != ((Ps_1)this.id_class[1]).id_catch()) {
            rAa_1 var6 = var2.id_break(var5.i(), var3);
            Float var11 = (float)var6.id_break();
            var5.id_implements[24] = var11;
         }
      }
   }

   public Bc_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 752983154;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7454720866278355689L;
   }

   private static void id_class() {
      id_break = new short[]{0, 1, 1, 0, 1, 1, 24, 1, 24, 1, 24};
   }

   private void id_class(rYB var1, rns_3 var2, rnP_2 var3) {
      for (rhd_3 var5 : var1.id_continue()) {
         if (var5 != ((Ps_1)this.id_class[1]).id_catch()) {
            rAa_1 var6 = var2.id_break(var5.i(), var3);
            Float var11 = (float)var6.id_break();
            var5.id_implements[24] = var11;
         }
      }
   }

   @Override
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[0]]) {
         if ((rrfq_3)rrfp_3.id_class[1] == null) {
            return;
         }

         rYB var2 = ((Ps_1)this.id_class[1]).id_case();
         rns_3 var3 = var2.id_package();
         switch (((int[])Bu_1.id_class[id_break[3]])[((rrfq_3)rrfp_3.id_class[1]).ordinal()]) {
            case 1:
               rnP_2 var6 = var3.id_class(2);
               if (var6 != null) {
                  this.id_break(var2, var3, var6);
               }
               break;
            case 2:
               rnP_2 var5 = var3.id_class(2);
               if (var5 != null) {
                  this.id_class(var2, var3, var5);
               }
               break;
            case 3:
               rnP_2 var4 = var3.id_class(2);
               if (var4 != null) {
                  this.id_byte(var2, var3, var4);
               }
         }
      }
   }

   private static void id_break() {
      id_byte = new byte[]{2, 2, 2};
   }

   private void id_break(rYB var1, rns_3 var2, rnP_2 var3) {
      for (rhd_3 var5 : var1.id_continue()) {
         if (var5 != ((Ps_1)this.id_class[1]).id_catch() && !var5.Pp()) {
            rAa_1 var6 = var2.id_break(var5.i(), var3);
            Float var11 = (float)var6.id_break();
            var5.id_implements[24] = var11;
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, 19, -50, 48, 76, -42, 113, 1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
