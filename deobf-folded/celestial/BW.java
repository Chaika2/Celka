package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BW {
   public Object[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static long[] id_protected;
   private static short[] id_throws;

   public int id_byte() {
      return (Integer)this.id_class[1];
   }

   public BW(rjU_2 var1, int var2) {
      this.id_private();
      Long var7 = rqR_2.id_break();
      this.id_class[2] = var7;
      this.id_class[id_throws[10]] = var1;
      Integer var9 = var2;
      this.id_class[1] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         BW var2 = (BW)var1;
         return this.id_class[1] == var2.id_class[1] && Objects.equals((rjU_2)this.id_class[id_throws[2]], (rjU_2)var2.id_class[id_throws[3]])
            ? true
            : id_byte[3];
      } else {
         return id_byte[1];
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[2];
      var10000[id_byte[4]] = (rjU_2)this.id_class[id_throws[4]];
      var10000[1] = (Integer)this.id_class[1];
      return Objects.hash(var10000);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 86732890;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4247795190290538087L;
   }

   public long id_class() {
      return (Long)this.id_class[2];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-100, 69, -24, -33, -10, -91, -49, 61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rjU_2 id_break() {
      return (rjU_2)this.id_class[id_throws[6]];
   }

   private static void id_throws() {
      id_protected = new long[1];
   }

   private static void id_catch() {
      id_throws = new short[]{1, 1, 0, 0, 0, 1, 0, 1, 2, 2, 0, 1};
   }

   private static void id_case() {
      id_break = new byte[]{2, 3, 2};
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, false, true, false, false, true, true, false};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[1] = Integer.valueOf(id_byte[7]);
         var1[2] = id_protected[0];
      }
   }
}
