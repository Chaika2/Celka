package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcc_3 extends rrfI_2<Boolean> {
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcc_3(rrcN_2 var1, rrNw_1 var2, rrNd_1 var3) {
      this.id_case();
      this.id_class[id_protected[0]] = var1;
      this.id_class[id_protected[1]] = var2;
      this.id_class[id_protected[2]] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1576428106;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{15, -101, 58, -33, -87, 124, -82, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1845261551325302059L;
   }

   public Boolean id_break() {
      this.id_case();
      rJY var1 = ((rrNw_1)this.id_class[id_protected[3]]).id_throws();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.id_class[id_protected[4]]).id_protected() : var1.id_class();
      if (var2 == null) {
         return id_byte[0];
      } else {
         Map var3 = var2.id_static();
         if (!((rrcN_2)this.id_class[id_protected[5]]).id_class((rrNd_1)this.id_class[id_protected[6]], var2, var3)) {
            return id_byte[1];
         } else if (!((rrcN_2)this.id_class[id_protected[7]]).id_class((rrNd_1)this.id_class[id_protected[8]], var3)) {
            return id_byte[2];
         } else {
            return !((rrcN_2)this.id_class[id_protected[9]]).id_break((rrNd_1)this.id_class[id_protected[10]], var3) ? id_byte[3] : id_byte[4];
         }
      }
   }

   private static void id_throws() {
      id_protected = new short[]{2, 0, 1, 0, 0, 2, 1, 2, 1, 2, 1};
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, false, false, false, true};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new byte[]{3};
   }
}
