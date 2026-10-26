package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqz_3 {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;

   public xd_3 id_byte() {
      return (xd_3)this.id_class[id_break[6]];
   }

   public rrqz_3(xd_3 var1, int var2) {
      this.id_throws();
      this.id_class[id_break[0]] = var1;
      Integer var8 = var2;
      this.id_class[id_break[1]] = var8;
      String var9 = ri_3.id_class(var1);
      this.id_class[id_break[2]] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_byte[0];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrqz_3 var2 = (rrqz_3)var1;
         return Objects.equals((String)this.id_class[id_break[3]], (String)var2.id_class[id_break[4]]);
      } else {
         return id_byte[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[id_byte[2]];
      var10000[id_byte[3]] = (String)this.id_class[id_break[5]];
      return Objects.hash(var10000);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 389164944810939150L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 690361776;
   }

   public int id_class() {
      return (Integer)this.id_class[id_break[8]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, 124, -22, 2, 50, 11, -102, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_break() {
      return (String)this.id_class[id_break[7]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[2] = 0;
      }
   }

   private static void id_catch() {
      id_break = new short[]{0, 2, 1, 1, 1, 1, 0, 1, 2};
   }

   private static void id_case() {
      id_protected = new byte[]{3, 2};
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, false, true, false, false};
   }
}
