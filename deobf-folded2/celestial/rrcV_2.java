package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcV_2 extends rrfI_2<rrcg_3> {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;

   @Override
   public boolean id_byte() {
      return this.id_break().equals((rrcg_3)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[0]);
   }

   public rrcV_2(rrcj_3 var1, rrNw_1 var2, rrNd_1 var3) {
      this.id_case();
      this.id_class[0] = var2;
      this.id_class[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{64, -30, 2, -15, 53, 76, 2, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1538988262;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -312621187014179853L;
   }

   public rrcg_3 id_break() {
      this.id_case();
      rJY var1 = ((rrNw_1)this.id_class[0]).id_throws();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.id_class[0]).id_protected() : var1.id_class();
      int var3 = ((rrNw_1)this.id_class[0]).id_case();
      if (var3 > ((rrNd_1)this.id_class[1]).id_else() * var2.id_char()) {
         return (rrcg_3)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[1];
      } else {
         return (long)var3 > C_throws.id_byte().id_native().id_byte()
            ? (rrcg_3)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[2]
            : (rrcg_3)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[0];
      }
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
      id_byte = new short[]{0, 1, 0, 0, 0, 1, 1, 2, 0, 0};
   }
}
