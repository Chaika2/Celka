package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcf_3 extends rrfI_2<Boolean> {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcf_3(rrcI_2 var1, rrNw_1 var2, rrNd_1 var3) {
      this.id_protected();
      this.id_class[0] = var2;
      this.id_class[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 39, 57, 77, -6, -30, -120, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1072799475;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -833094010532912901L;
   }

   public Boolean id_break() {
      this.id_protected();
      rJY var1 = ((rrNw_1)this.id_class[0]).id_throws();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.id_class[0]).id_protected() : var1.id_class();
      List var3 = ((rrNd_1)this.id_class[1]).id_protected();
      List var4 = ((rrNd_1)this.id_class[1]).id_char();
      if (!var2.id_final()) {
         return false;
      } else {
         if (var4 != null && !var4.isEmpty()) {
            for (String var6 : var4) {
               if (var2.id_protected(var6)) {
                  return false;
               }
            }
         }

         if (var3 != null && !var3.isEmpty()) {
            for (String var8 : var3) {
               if (!var2.id_protected(var8)) {
                  return false;
               }
            }
         }

         return id_protected[3];
      }
   }

   private static void id_throws() {
      id_protected = new boolean[]{false, false, false, true};
   }

   private static void id_catch() {
      id_byte = new short[]{0, 1, 0, 0, 1, 1};
   }

   private static void id_case() {
      id_break = new byte[]{2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }
}
