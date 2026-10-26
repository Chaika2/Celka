package celestial;

import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.Validate;

public class Md_1 {
   public Object[] class_;
   private static long[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      protected_ = new short[]{3, 1, 2, 0, 0, 3, 1, 1, 0, 2, 0, 0, 2, 3};
   }

   public Md_1(int var1, long var2, @Nullable long[] var4) {
      this.protected_();
      Validate.inclusiveBetween(1L, 32L, (long)var1);
      Long var9 = var2;
      this.class_[3] = var9;
      Integer var10 = var1;
      this.class_[1] = var10;
      Long var11 = (1L << var1) - 1L;
      this.class_[2] = var11;
      if (var4 != null) {
         this.class_[0] = var4;
      } else {
         long[] var13 = new long[(int)(class_(var2 * (long)var1, 64L) / 64L)];
         this.class_[0] = var13;
      }
   }

   static {
      ntfClinit();
   }

   public long class_() {
      return (Long)this.class_[3];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, 88, -21, -32, -105, -102, 11, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 22171163;
   }

   public int class_(long var1) {
      Validate.inclusiveBetween(0L, (Long)this.class_[3] - 1L, var1);
      long var3 = var1 * (long)((Integer)this.class_[1]).intValue();
      int var5 = (int)(var3 >> 6);
      int var6 = (int)((var1 + 1L) * (long)((Integer)this.class_[1]).intValue() - 1L >> 6);
      int var7 = (int)(var3 & 63L);
      if (var5 == var6) {
         return (int)(((long[])this.class_[0])[var5] >>> var7 & (Long)this.class_[2]);
      } else {
         int var8 = byte_[3] - var7;
         return (int)((((long[])this.class_[0])[var5] >>> var7 | ((long[])this.class_[0])[var6] << var8) & (Long)this.class_[2]);
      }
   }

   public static long class_(long var0, long var2) {
      byte var4 = 1;
      if (var2 == 0L) {
         return 0L;
      } else if (var0 == 0L) {
         return var2;
      } else {
         if (var0 < 0L) {
            var4 = -1;
         }

         long var5 = var0 % (var2 * (long)var4);
         return var5 == 0L ? var0 : var0 + var2 * (long)var4 - var5;
      }
   }

   private static void break_() {
      throws_ = new boolean[]{true, true, false};
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6950415570235168973L;
   }

   private static void throws_() {
      byte_ = new byte[]{-1, 6, 6, 64, 4, 2, 3};
   }

   private static void case_() {
      break_ = new long[]{1L, 32L, 1L, 1L, 64L, 64L, 0L, 0L, 0L, 0L, 0L, 0L, 1L, 1L, 1L, 63L, 0L, 0L};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = 0L;
         var1[3] = 0L;
      }
   }
}
