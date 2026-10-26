package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNZ {
   private static short[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;

   public rrNd_1 id_byte() {
      return (rrNd_1)this.id_class[id_break[3]];
   }

   public rrNZ(rrNd_1 var1, rrNw_1 var2, int var3) {
      this.id_protected();
      this.id_class[id_break[6]] = var1;
      this.id_class[id_break[7]] = var2;
      Integer var10 = var3;
      this.id_class[id_break[8]] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_protected[0];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNZ var2 = (rrNZ)var1;
         return Objects.equals(((rrNd_1)this.id_class[id_break[0]]).id_case(), ((rrNd_1)var2.id_class[id_break[1]]).id_case());
      } else {
         return id_protected[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(((rrNd_1)this.id_class[id_break[2]]).id_case());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5940649948841523519L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, 66, 103, -15, 108, -108, 61, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1376904309;
   }

   public rrNw_1 id_class() {
      return (rrNw_1)this.id_class[id_break[4]];
   }

   public int id_break() {
      return (Integer)this.id_class[id_break[5]];
   }

   private static void id_throws() {
      id_protected = new boolean[]{true, false, false};
   }

   private static void id_catch() {
      id_byte = new byte[]{3, 2};
   }

   private static void id_case() {
      id_break = new short[]{0, 0, 0, 0, 1, 2, 0, 1, 2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
         var1[id_byte[1]] = Integer.valueOf(id_protected[2]);
      }
   }
}
