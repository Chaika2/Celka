package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcm_3 extends rrfI_2<Boolean> {
   private static byte[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcm_3(rrcu_3 var1, rrNw_1 var2, rrNd_1 var3) {
      this.id_throws();
      this.id_class[2] = var1;
      this.id_class[0] = var2;
      this.id_class[1] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 317320827;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -104, -19, -52, -25, 53, 5, 13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1664999237194343862L;
   }

   public Boolean id_break() {
      this.id_throws();
      rJY var1 = ((rrNw_1)this.id_class[0]).id_throws();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.id_class[0]).id_protected() : var1.id_class();
      if (var2 == null) {
         return false;
      } else {
         List var3 = rrjS_2.id_class(var2);
         if (var3 == null) {
            return false;
         } else if (!((rrcu_3)this.id_class[2]).id_class((rrNd_1)this.id_class[1], var2, var3)) {
            return false;
         } else if (!((rrcu_3)this.id_class[2]).id_break((rrNd_1)this.id_class[1], var3)) {
            return false;
         } else {
            return !((rrcu_3)this.id_class[2]).id_class((rrNd_1)this.id_class[1], var3) ? false : id_byte[5];
         }
      }
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, false, false, false, false, true};
   }

   private static void id_case() {
      id_protected = new short[]{2, 0, 1, 0, 0, 2, 1, 2, 1, 2, 1};
   }

   private static void id_protected() {
      id_break = new byte[]{3};
   }
}
