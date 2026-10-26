package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNm_1 {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new byte[]{2, 2};
   }

   public rrNm_1(rrNd_1 var1, String var2) {
      this.id_throws();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNm_1 var2 = (rrNm_1)var1;
         return Objects.equals((rrNd_1)this.id_class[0], (rrNd_1)var2.id_class[0]) && Objects.equals((String)this.id_class[1], (String)var2.id_class[1])
            ? true
            : id_protected[3];
      } else {
         return id_protected[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rrNd_1)this.id_class[0], (String)this.id_class[1]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 284811020;
   }

   public rrNd_1 id_class() {
      return (rrNd_1)this.id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 666599172023230472L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-87, 100, -55, 118, 30, -10, 115, 115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_break() {
      return (String)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_protected = new boolean[]{true, false, true, false, false, true};
   }

   private static void id_protected() {
      id_byte = new short[]{0, 0, 1, 1, 0, 1, 0, 1, 0, 1};
   }
}
