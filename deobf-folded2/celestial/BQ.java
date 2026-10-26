package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BQ {
   private static byte[] id_break;
   private static short[] id_byte;
   private static long[] id_protected;
   public Object[] id_class;

   public an_3 id_byte() {
      return (an_3)this.id_class[0];
   }

   public BQ(an_3 var1, rjU_2 var2, rdn_3 var3, List<BN> var4) {
      this.id_case();
      this.id_class[0] = var1;
      this.id_class[2] = var2;
      this.id_class[1] = var3;
      this.id_class[3] = var4;
      Long var13 = rqR_2.id_break();
      this.id_class[4] = var13;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-18, -20, 67, 77, 27, 113, -74, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6234106365949094498L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1042232214;
   }

   public long id_class() {
      return (Long)this.id_class[4];
   }

   public rjU_2 id_break() {
      return (rjU_2)this.id_class[2];
   }

   public rdn_3 id_throws() {
      return (rdn_3)this.id_class[1];
   }

   private static void id_catch() {
      id_protected = new long[1];
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         Object[] var1 = this.id_class;
         var1[4] = 0L;
      }
   }

   private static void id_implements() {
      id_byte = new short[]{0, 2, 1, 3, 4, 0, 1, 2, 3, 4};
   }

   public List<BN> id_protected() {
      return (List<BN>)this.id_class[3];
   }

   private static void id_private() {
      id_break = new byte[]{5, 4};
   }
}
