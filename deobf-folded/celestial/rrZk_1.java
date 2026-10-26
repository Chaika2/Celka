package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZk_1 {
   private static short[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public rrZk_1(String var1) {
      this.id_byte();
      this.id_class[id_break[4]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrZk_1 var2 = (rrZk_1)var1;
         return Objects.equals(((String)this.id_class[id_break[0]]).toLowerCase(), ((String)var2.id_class[id_break[1]]).toLowerCase());
      } else {
         return id_byte[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[1];
      var10000[id_byte[3]] = ((String)this.id_class[id_break[2]]).toLowerCase();
      return Objects.hash(var10000);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, 38, -109, 56, 11, -20, 85, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.id_class[id_break[3]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6952051550290940521L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1735071235;
   }

   private static void id_break() {
      id_break = new short[5];
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, false, true, false, true};
   }
}
