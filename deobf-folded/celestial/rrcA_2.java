package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcA_2 {
   public Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{true, false, true, false};
   }

   public rrcA_2(rdb_3 var1, rrcn_3[] var2) {
      this.id_protected();
      this.id_class[id_break[5]] = var1;
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
         rrcA_2 var2 = (rrcA_2)var1;
         return Objects.equals((rdb_3)this.id_class[id_break[0]], (rdb_3)var2.id_class[id_break[1]]);
      } else {
         return id_protected[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[1];
      var10000[id_protected[3]] = (rdb_3)this.id_class[id_break[2]];
      return Objects.hash(var10000);
   }

   public rrcn_3[] id_class() {
      return (rrcn_3[])this.id_class[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1537601212;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 5, -111, 1, 69, 40, 60, -25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5844574960034700090L;
   }

   public rdb_3 id_break() {
      return (rdb_3)this.id_class[id_break[3]];
   }

   private static void id_throws() {
      id_byte = new byte[]{2};
   }

   private static void id_case() {
      id_break = new short[]{0, 0, 0, 0, 1, 0, 1};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }
}
