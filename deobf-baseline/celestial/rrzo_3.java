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
   private static long[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   private static int[] id_throws;
   private static short[] id_case;

   private static void id_byte() {
      id_protected = new boolean[]{false, true, false, true, true, false, false, false, true};
   }

   public rrzo_3(rrzf_3 var1, rrzY_2 var2) throws IOException {
      this.id_case();
      this.id_class[id_case[0]] = var1;
      Long var9 = (Long)var2.id_class[id_case[1]];
      this.id_class[id_case[2]] = var9;
      Long var10 = (Long)var2.id_class[id_case[3]];
      this.id_class[id_case[4]] = var10;
      if ((Long)this.id_class[id_case[5]] == id_break[0]) {
         rrzY_2 var3 = var1.id_private((byte[])var2.id_protected[id_case[6]]);
         if (var3 == null) {
            throw new ZipException("invalid loc for entry <" + var1.id_throws((byte[])var2.id_protected[id_case[7]]) + ">");
         }

         Long var11 = (Long)var3.id_class[id_case[8]];
         this.id_class[id_case[9]] = var11;
      }

      Long var12 = -(Long)this.id_class[id_case[10]];
      this.id_class[id_case[11]] = var12;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2577146260369641959L;
   }

   private static void id_class() {
      id_throws = new int[]{Integer.MAX_VALUE};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 514687228;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -21, -3, -36, -20, -60, 94, 56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      ((rrzf_3)this.id_class[id_case[12]]).id_continue();
      this.id_protected();
      if ((Long)this.id_class[id_case[13]] == id_break[1]) {
         return id_byte[0];
      } else if (var3 <= 0) {
         return id_protected[0];
      } else {
         if ((long)var3 > (Long)this.id_class[id_case[14]]) {
            var3 = (int)((Long)this.id_class[id_case[15]]).longValue();
         }

         ByteBuffer var4 = ByteBuffer.wrap(var1);
         var4.position(var2);
         var4.limit(var2 + var3);
         long var5 = ((rrzf_3)this.id_class[id_case[16]]).id_class(var4, (Long)this.id_class[id_case[17]]);
         if (var5 > id_break[2]) {
            Long var11 = (Long)this.id_class[id_case[18]] + var5;
            this.id_class[id_case[19]] = var11;
            Long var12 = (Long)this.id_class[id_case[20]] - var5;
            this.id_class[id_case[21]] = var12;
         }

         if ((Long)this.id_class[id_case[22]] == id_break[3]) {
            this.close();
         }

         return (int)var5;
      }
   }

   @Override
   public int read() throws IOException {
      byte[] var1 = new byte[id_protected[1]];
      return this.read(var1, id_protected[2], id_protected[3]) == id_protected[4] ? var1[id_protected[5]] & id_case[23] : id_byte[1];
   }

   @Override
   public void close() {
      Long var5 = id_break[6];
      this.id_class[id_case[34]] = var5;
      ((Set)((rrzf_3)this.id_class[id_case[35]]).id_break[id_case[36]]).remove(this);
   }

   @Override
   public long skip(long var1) {
      ((rrzf_3)this.id_class[id_case[24]]).id_continue();
      if (var1 > (Long)this.id_class[id_case[25]]) {
         var1 = (Long)this.id_class[id_case[26]];
      }

      Long var7 = (Long)this.id_class[id_case[27]] + var1;
      this.id_class[id_case[28]] = var7;
      Long var8 = (Long)this.id_class[id_case[29]] - var1;
      this.id_class[id_case[30]] = var8;
      if ((Long)this.id_class[id_case[31]] == id_break[4]) {
         this.close();
      }

      return var1;
   }

   @Override
   public int available() {
      return this.id_class[id_case[32]] > id_break[5] ? id_throws[0] : (int)((Long)this.id_class[id_case[33]]).longValue();
   }

   private static void id_break() {
      id_byte = new byte[]{-1, -1, 30, 30, 3};
   }

   private static void id_throws() {
      id_break = new long[]{-1L, 0L, 0L, 0L, 0L, 2147483647L, 0L, 0L, 30L, 0L, 0L};
   }

   private static void id_catch() {
      id_case = new short[]{
         2, 11, 1, 14, 0, 0, 0, 0, 14, 0, 0, 0, 2, 1, 1, 1, 2, 0, 0, 0, 1, 1, 1, 255, 2, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 2, 17, 0, 0, 2, 23, 0, 2, 0, 0, 0, 0
      };
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[4]];
         Object[] var1 = this.id_class;
         var1[id_protected[7]] = id_break[9];
         var1[id_protected[8]] = id_break[10];
      }
   }

   private void id_protected() throws IOException {
      if ((Long)this.id_class[id_case[37]] <= id_break[7]) {
         Long var6 = -(Long)this.id_class[id_case[38]] + (Long)((rrzf_3)this.id_class[id_case[39]]).id_break[id_case[40]];
         this.id_class[id_case[41]] = var6;
         byte[] var1 = new byte[id_byte[2]];
         if (((rrzf_3)this.id_class[id_case[42]]).id_class(var1, id_protected[6], (long)var1.length, (Long)this.id_class[id_case[43]]) != id_break[8]) {
            throw new ZipException("invalid loc " + (Long)this.id_class[id_case[44]] + " for entry reading");
         }

         Long var7 = (Long)this.id_class[id_case[45]] + (long)(id_byte[3] + rrzH_2.id_extends(var1) + rrzH_2.id_volatile(var1));
         this.id_class[id_case[46]] = var7;
      }
   }
}
