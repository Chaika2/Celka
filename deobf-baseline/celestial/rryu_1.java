package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryu_1 {
   private static short[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new short[]{0, 0, 0, 0, 1, 0, 1};
   }

   public rryu_1(String var1, rryv_1 var2) {
      this.id_protected();
      this.id_class[id_break[5]] = var1;
      this.id_class[id_break[6]] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_protected[0];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rryu_1 var2 = (rryu_1)var1;
         return Objects.equals((String)this.id_class[id_break[0]], (String)var2.id_class[id_break[1]]);
      } else {
         return id_protected[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((String)this.id_class[id_break[2]]);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, -24, -17, -46, -56, 96, -87, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 117002855;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9219450123234104810L;
   }

   public String id_class() {
      return (String)this.id_class[id_break[3]];
   }

   public rryv_1 id_break() {
      return (rryv_1)this.id_class[id_break[4]];
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, false};
   }

   private static void id_case() {
      id_byte = new byte[]{2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
      }
   }
}
