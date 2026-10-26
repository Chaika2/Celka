package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.zip.ZipException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzo_3 extends InputStream {
   private static long[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   private static int[] throws_;
   private static short[] case_;

   private static void byte_() {
      protected_ = new boolean[]{false, true, false, true, true, false, false, false, true};
   }

   public rrzo_3(rrzf_3 var1, rrzY_2 var2) throws IOException {
      this.case_();
      this.class_[2] = var1;
      Long var9 = (Long)var2.class_[11];
      this.class_[1] = var9;
      Long var10 = (Long)var2.class_[14];
      this.class_[0] = var10;
      if ((Long)this.class_[0] == -1L) {
         rrzY_2 var3 = var1.private_((byte[])var2.protected_[0]);
         if (var3 == null) {
            throw new ZipException("invalid loc for entry <" + var1.throws_((byte[])var2.protected_[0]) + ">");
         }

         Long var11 = (Long)var3.class_[14];
         this.class_[0] = var11;
      }

      Long var12 = -(Long)this.class_[0];
      this.class_[0] = var12;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2577146260369641959L;
   }

   private static void class_() {
      throws_ = new int[]{Integer.MAX_VALUE};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 514687228;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -21, -3, -36, -20, -60, 94, 56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      ((rrzf_3)this.class_[2]).continue_();
      this.protected_();
      if ((Long)this.class_[1] == 0L) {
         return -1;
      } else if (var3 <= 0) {
         return 0;
      } else {
         if ((long)var3 > (Long)this.class_[1]) {
            var3 = (int)((Long)this.class_[1]).longValue();
         }

         ByteBuffer var4 = ByteBuffer.wrap(var1);
         var4.position(var2);
         var4.limit(var2 + var3);
         long var5 = ((rrzf_3)this.class_[2]).class_(var4, (Long)this.class_[0]);
         if (var5 > 0L) {
            Long var11 = (Long)this.class_[0] + var5;
            this.class_[0] = var11;
            Long var12 = (Long)this.class_[1] - var5;
            this.class_[1] = var12;
         }

         if ((Long)this.class_[1] == 0L) {
            this.close();
         }

         return (int)var5;
      }
   }

   @Override
   public int read() throws IOException {
      byte[] var1 = new byte[1];
      return this.read(var1, 0, 1) == 1 ? var1[0] & 0xFF : byte_[1];
   }

   @Override
   public void close() {
      Long var5 = 0L;
      this.class_[1] = var5;
      ((Set)((rrzf_3)this.class_[2]).break_[17]).remove(this);
   }

   @Override
   public long skip(long var1) {
      ((rrzf_3)this.class_[2]).continue_();
      if (var1 > (Long)this.class_[1]) {
         var1 = (Long)this.class_[1];
      }

      Long var7 = (Long)this.class_[0] + var1;
      this.class_[0] = var7;
      Long var8 = (Long)this.class_[1] - var1;
      this.class_[1] = var8;
      if ((Long)this.class_[1] == 0L) {
         this.close();
      }

      return var1;
   }

   @Override
   public int available() {
      return this.class_[1] > 2147483647L ? Integer.MAX_VALUE : (int)((Long)this.class_[1]).longValue();
   }

   private static void break_() {
      byte_ = new byte[]{-1, -1, 30, 30, 3};
   }

   private static void throws_() {
      break_ = new long[]{-1L, 0L, 0L, 0L, 0L, 2147483647L, 0L, 0L, 30L, 0L, 0L};
   }

   private static void catch_() {
      case_ = new short[]{
         2, 11, 1, 14, 0, 0, 0, 0, 14, 0, 0, 0, 2, 1, 1, 1, 2, 0, 0, 0, 1, 1, 1, 255, 2, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 2, 17, 0, 0, 2, 23, 0, 2, 0, 0, 0, 0
      };
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0L;
         var1[1] = 0L;
      }
   }

   private void protected_() throws IOException {
      if ((Long)this.class_[0] <= 0L) {
         Long var6 = -(Long)this.class_[0] + (Long)((rrzf_3)this.class_[2]).break_[23];
         this.class_[0] = var6;
         byte[] var1 = new byte[30];
         if (((rrzf_3)this.class_[2]).class_(var1, 0, (long)var1.length, (Long)this.class_[0]) != 30L) {
            throw new ZipException("invalid loc " + (Long)this.class_[0] + " for entry reading");
         }

         Long var7 = (Long)this.class_[0] + (long)(30 + rrzH_2.extends_(var1) + rrzH_2.volatile_(var1));
         this.class_[0] = var7;
      }
   }
}
