package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruz_1 {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_protected = new byte[]{2, 2};
   }

   public rruz_1(String var1, String var2) {
      this.id_protected();
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
         rruz_1 var2 = (rruz_1)var1;
         return Objects.equals((String)this.id_class[0], (String)var2.id_class[0]) && Objects.equals((String)this.id_class[1], (String)var2.id_class[1])
            ? true
            : id_break[3];
      } else {
         return id_break[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.id_class[0], (String)this.id_class[1]);
   }

   public String id_class() {
      return (String)this.id_class[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1847239551;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, 44, -120, 85, -78, 56, -97, 113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5484671391165483245L;
   }

   public String id_break() {
      return (String)this.id_class[1];
   }

   private static void id_throws() {
      id_break = new boolean[]{true, false, true, false, false, true};
   }

   private static void id_case() {
      id_byte = new short[]{0, 0, 1, 1, 0, 1, 0, 1, 0, 1};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }
}
