package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcH_2 {
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   public rrcH_2(rdb_3 var1, rrcy_3[] var2) {
      this.id_byte();
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
         rrcH_2 var2 = (rrcH_2)var1;
         return Objects.equals((rdb_3)this.id_class[0], (rdb_3)var2.id_class[0]);
      } else {
         return id_break[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rdb_3)this.id_class[0]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -249867815;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-71, 46, 15, -55, -42, 50, -64, -108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6823131687009805751L;
   }

   public rdb_3 id_class() {
      return (rdb_3)this.id_class[0];
   }

   public rrcy_3[] id_break() {
      return (rrcy_3[])this.id_class[1];
   }

   private static void id_throws() {
      id_byte = new byte[]{2};
   }

   private static void id_case() {
      id_protected = new short[]{0, 0, 0, 0, 1, 0, 1};
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, true, false};
   }
}
