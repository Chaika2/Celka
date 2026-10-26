package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqc_3 {
   private static byte[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;

   public rja_3 id_byte() {
      return (rja_3)this.id_class[2];
   }

   public rrqc_3(rrqz_3 var1, rfH_2 var2, rja_3 var3) {
      this.id_case();
      this.id_class[id_protected[6]] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrqc_3 var2 = (rrqc_3)var1;
         return Objects.equals((rja_3)this.id_class[2], (rja_3)var2.id_class[2]);
      } else {
         return id_byte[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[1];
      var10000[id_byte[3]] = (rja_3)this.id_class[2];
      return Objects.hash(var10000);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2120144782555872217L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-102, -80, 54, -53, -12, 3, -28, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrqz_3 id_class() {
      return (rrqz_3)this.id_class[id_protected[3]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2070234333;
   }

   public rfH_2 id_break() {
      return (rfH_2)this.id_class[1];
   }

   private static void id_throws() {
      id_protected = new short[]{2, 2, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void id_catch() {
      id_byte = new boolean[]{true, false, true, false};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
      }
   }

   private static void id_protected() {
      id_break = new byte[]{3};
   }
}
