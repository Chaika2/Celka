package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHJ {
   private static boolean[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;

   public xd_3 id_byte() {
      return (xd_3)this.id_class[id_protected[6]];
   }

   public rrHJ(xd_3 var1, xc_3 var2, rfH_2 var3) {
      this.id_catch();
      this.id_class[id_protected[9]] = var1;
      this.id_class[id_protected[10]] = var2;
      this.id_class[id_protected[11]] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_break[0];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrHJ var2 = (rrHJ)var1;
         return Objects.equals((xd_3)this.id_class[id_protected[0]], (xd_3)var2.id_class[id_protected[1]])
               && Objects.equals((rfH_2)this.id_class[id_protected[2]], (rfH_2)var2.id_class[id_protected[3]])
            ? id_break[2]
            : id_break[3];
      } else {
         return id_break[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[id_byte[0]];
      var10000[id_break[4]] = (xd_3)this.id_class[id_protected[4]];
      var10000[id_break[5]] = (rfH_2)this.id_class[id_protected[5]];
      return Objects.hash(var10000);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2804394550419784704L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, -109, -118, -69, -85, 121, 73, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1309569758;
   }

   public xc_3 id_class() {
      return (xc_3)this.id_class[id_protected[7]];
   }

   public rfH_2 id_break() {
      return (rfH_2)this.id_class[id_protected[8]];
   }

   private static void id_throws() {
      id_byte = new byte[]{2, 3};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
      }
   }

   private static void id_case() {
      id_break = new boolean[]{true, false, true, false, false, true};
   }

   private static void id_protected() {
      id_protected = new short[]{0, 0, 2, 2, 0, 2, 0, 1, 2, 0, 1, 2};
   }
}
