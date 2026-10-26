package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcw_3 extends rrfI_2<Boolean> {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcw_3(rrct_3 var1, rrNw_1 var2, rrNd_1 var3) {
      this.id_protected();
      this.id_class[id_byte[0]] = var1;
      this.id_class[id_byte[1]] = var2;
      this.id_class[id_byte[2]] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, 66, -30, 94, -79, 6, 90, 26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1922496675;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6183939659540882686L;
   }

   public Boolean id_break() {
      this.id_protected();
      rJY var1 = ((rrNw_1)this.id_class[id_byte[3]]).id_throws();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.id_class[id_byte[4]]).id_protected() : var1.id_class();
      if (var2 != null && var2.id_package() != null) {
         List var3 = ((rrct_3)this.id_class[id_byte[5]]).id_class(var2);
         if (!((rrct_3)this.id_class[id_byte[6]]).id_class((rrNd_1)this.id_class[id_byte[7]], var3)) {
            return id_break[1];
         } else {
            return !((rrct_3)this.id_class[id_byte[8]]).id_break((rrNd_1)this.id_class[id_byte[9]], var3)
               ? id_break[2]
               : ((rrct_3)this.id_class[id_byte[10]]).id_byte((rrNd_1)this.id_class[id_byte[11]], var3);
         }
      } else {
         return id_break[0];
      }
   }

   private static void id_throws() {
      id_protected = new byte[]{3};
   }

   private static void id_catch() {
      id_byte = new short[]{2, 0, 1, 0, 0, 2, 2, 1, 2, 1, 2, 1};
   }

   private static void id_case() {
      id_break = new boolean[3];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
      }
   }
}
