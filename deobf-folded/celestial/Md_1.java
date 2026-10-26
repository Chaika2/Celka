package celestial;

import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.Validate;

public class Md_1 {
   public Object[] id_class;
   private static long[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_protected = new short[]{3, 1, 2, 0, 0, 3, 1, 1, 0, 2, 0, 0, 2, 3};
   }

   public Md_1(int var1, long var2, @Nullable long[] var4) {
      this.id_protected();
      Validate.inclusiveBetween(1L, 32L, (long)var1);
      Long var9 = var2;
      this.id_class[3] = var9;
      Integer var10 = var1;
      this.id_class[1] = var10;
      Long var11 = (1L << var1) - 1L;
      this.id_class[2] = var11;
      if (var4 != null) {
         this.id_class[id_protected[3]] = var4;
      } else {
         long[] var13 = new long[(int)(id_class(var2 * (long)var1, 64L) / 64L)];
         this.id_class[id_protected[4]] = var13;
      }
   }

   static {
      ntfClinit();
   }

   public long id_class() {
      return (Long)this.id_class[3];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, 88, -21, -32, -105, -102, 11, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 22171163;
   }

   public int id_class(long var1) {
      Validate.inclusiveBetween(id_break[11], (Long)this.id_class[3] - 1L, var1);
      long var3 = var1 * (long)((Integer)this.id_class[1]).intValue();
      int var5 = (int)(var3 >> 6);
      int var6 = (int)((var1 + 1L) * (long)((Integer)this.id_class[1]).intValue() - 1L >> 6);
      int var7 = (int)(var3 & 63L);
      if (var5 == var6) {
         return (int)(((long[])this.id_class[id_protected[8]])[var5] >>> var7 & (Long)this.id_class[2]);
      } else {
         int var8 = 64 - var7;
         return (int)(
            (((long[])this.id_class[id_protected[10]])[var5] >>> var7 | ((long[])this.id_class[id_protected[11]])[var6] << var8) & (Long)this.id_class[2]
         );
      }
   }

   public static long id_class(long var0, long var2) {
      byte var4 = 1;
      if (var2 == id_break[6]) {
         return id_break[7];
      } else if (var0 == id_break[8]) {
         return var2;
      } else {
         if (var0 < id_break[9]) {
            var4 = -1;
         }

         long var5 = var0 % (var2 * (long)var4);
         return var5 == id_break[10] ? var0 : var0 + var2 * (long)var4 - var5;
      }
   }

   private static void id_break() {
      id_throws = new boolean[]{true, true, false};
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6950415570235168973L;
   }

   private static void id_throws() {
      id_byte = new byte[]{-1, 6, 6, 64, 4, 2, 3};
   }

   private static void id_case() {
      id_break = new long[]{1L, 32L, 1L, 1L, 64L, 64L, 0L, 0L, 0L, 0L, 0L, 0L, 1L, 1L, 1L, 63L, 0L, 0L};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[1] = Integer.valueOf(id_throws[2]);
         var1[2] = id_break[16];
         var1[3] = id_break[17];
      }
   }
}
