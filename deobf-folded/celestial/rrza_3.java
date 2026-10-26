package celestial;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrza_3 extends OutputStream {
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static long[] id_protected;
   public Object[] id_class;
   private static short[] id_throws;

   byte[] id_byte() {
      return (ByteArrayOutputStream)this.id_class[id_throws[35]] == null ? null : ((ByteArrayOutputStream)this.id_class[id_throws[36]]).toByteArray();
   }

   rrza_3(rrzf_3 var1, rrzY_2 var2) {
      this.id_catch();
      this.id_class[4] = var1;
      ByteArrayOutputStream var8 = new ByteArrayOutputStream(8192);
      this.id_class[id_throws[2]] = var8;
      Long var9 = id_protected[0];
      this.id_class[3] = var9;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public void flush() throws IOException {
      if ((OutputStream)this.id_class[2] != null) {
         ((OutputStream)this.id_class[2]).flush();
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, -66, 61, 100, 60, -40, 82, -127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new byte[]{5, 3};
   }

   private void id_class(byte[] var1, int var2, int var3) throws IOException {
      ((OutputStream)this.id_class[2]).write(var1, var2, var3);
      Long var8 = (Long)this.id_class[3] + (long)var3;
      this.id_class[3] = var8;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6891910063415008979L;
   }

   private void id_class(int var1) throws IOException {
      ((OutputStream)this.id_class[2]).write(var1);
      Long var6 = (Long)this.id_class[3] + 1L;
      this.id_class[3] = var6;
   }

   @Override
   public void write(byte[] var1) throws IOException {
      this.write(var1, id_break[0], var1.length);
   }

   @Override
   public void write(int var1) throws IOException {
      if ((OutputStream)this.id_class[2] != null) {
         this.id_class(var1);
      } else if ((Long)this.id_class[3] + 1L < 10485760L) {
         ((ByteArrayOutputStream)this.id_class[id_throws[7]]).write(var1);
         Long var6 = (Long)this.id_class[3] + 1L;
         this.id_class[3] = var6;
      } else {
         this.id_throws();
         this.id_class(var1);
      }
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      if ((OutputStream)this.id_class[2] != null) {
         this.id_class(var1, var2, var3);
      } else if ((Long)this.id_class[3] + (long)var3 < 10485760L) {
         ((ByteArrayOutputStream)this.id_class[id_throws[12]]).write(var1, var2, var3);
         Long var8 = (Long)this.id_class[3] + (long)var3;
         this.id_class[3] = var8;
      } else {
         this.id_throws();
         this.id_class(var1, var2, var3);
      }
   }

   @Override
   public void close() throws IOException {
      Object var5 = null;
      this.id_class[id_throws[17]] = var5;
      if ((OutputStream)this.id_class[2] != null) {
         ((OutputStream)this.id_class[2]).close();
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1415618040;
   }

   private static void id_break() {
      id_throws = new short[]{4, 8192, 0, 3, 1, 2, 3, 0, 3, 3, 2, 3, 0, 3, 3, 2, 2, 0, 2, 2, 2, 3, 3, 2, 3, 3, 1, 4, 1, 1, 1, 2, 0, 2, 0, 0, 0};
   }

   private void id_throws() throws IOException {
      rrzY_2 var10000 = (rrzY_2)this.id_class[1];
      Path var5 = ((rrzf_3)this.id_class[4]).id_finally(null);
      var10000.id_class[1] = var5;
      BufferedOutputStream var6 = new BufferedOutputStream(Files.newOutputStream((Path)((rrzY_2)this.id_class[1]).id_class[1]));
      this.id_class[2] = var6;
      ((ByteArrayOutputStream)this.id_class[id_throws[32]]).writeTo((OutputStream)this.id_class[2]);
      Object var7 = null;
      this.id_class[id_throws[34]] = var7;
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         Object[] var1 = this.id_class;
         var1[3] = id_protected[6];
      }
   }

   private static void id_case() {
      id_protected = new long[]{0L, 1L, 10485760L, 1L, 10485760L, 1L, 0L};
   }

   private static void id_protected() {
      id_break = new boolean[2];
   }
}
