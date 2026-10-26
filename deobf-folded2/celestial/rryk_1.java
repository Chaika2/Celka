package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryk_1 {
   public Object[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_byte = new boolean[]{true, false};
   }

   public rryk_1(String var1, String var2) {
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
      } else {
         return var1 instanceof rryk_1 var2 ? Objects.equals(this.id_break(), var2.id_break()) : id_byte[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.id_break());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6287089806163990618L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-113, -105, -91, -79, 115, 7, 3, 26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2024150512;
   }

   public String id_class() {
      return (String)this.id_class[1];
   }

   public String id_break() {
      return (String)this.id_class[0];
   }

   private static void id_throws() {
      id_break = new byte[]{2};
   }

   private static void id_case() {
      id_protected = new short[]{0, 1, 0, 1};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
      }
   }
}
