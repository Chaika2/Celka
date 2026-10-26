package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcq_3 extends rrfI_2<Boolean> {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rrcq_3(rrcp_3 var1, rrNw_1 var2, rrNd_1 var3) {
      this.id_case();
      this.id_class[0] = var2;
      this.id_class[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, -37, 124, -87, 43, -57, -37, -6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1220632854;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2761279932027189137L;
   }

   public Boolean id_break() {
      this.id_case();
      rJY var1 = ((rrNw_1)this.id_class[0]).id_throws();
      rdb_3 var2 = ((rrNd_1)this.id_class[1]).id_catch();
      rdb_3 var3 = var1 == null ? ((rrNw_1)this.id_class[0]).id_protected().id_break() : var1.id_class().id_break();
      return var2.equals(var3);
   }

   private static void id_throws() {
      id_break = new byte[]{2};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_byte = new short[]{0, 1, 0, 1, 0};
   }
}
