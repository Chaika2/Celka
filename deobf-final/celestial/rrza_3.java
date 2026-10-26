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
   private static boolean[] break_;
   private static byte[] byte_;
   private static long[] protected_;
   public Object[] class_;
   private static short[] throws_;

   byte[] byte_() {
      return (ByteArrayOutputStream)this.class_[0] == null ? null : ((ByteArrayOutputStream)this.class_[0]).toByteArray();
   }

   rrza_3(rrzf_3 var1, rrzY_2 var2) {
      this.catch_();
      this.class_[4] = var1;
      ByteArrayOutputStream var8 = new ByteArrayOutputStream(8192);
      this.class_[0] = var8;
      Long var9 = 0L;
      this.class_[3] = var9;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public void flush() throws IOException {
      if ((OutputStream)this.class_[2] != null) {
         ((OutputStream)this.class_[2]).flush();
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, -66, 61, 100, 60, -40, 82, -127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new byte[]{5, 3};
   }

   private void class_(byte[] var1, int var2, int var3) throws IOException {
      ((OutputStream)this.class_[2]).write(var1, var2, var3);
      Long var8 = (Long)this.class_[3] + (long)var3;
      this.class_[3] = var8;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6891910063415008979L;
   }

   private void class_(int var1) throws IOException {
      ((OutputStream)this.class_[2]).write(var1);
      Long var6 = (Long)this.class_[3] + 1L;
      this.class_[3] = var6;
   }

   @Override
   public void write(byte[] var1) throws IOException {
      this.write(var1, 0, var1.length);
   }

   @Override
   public void write(int var1) throws IOException {
      if ((OutputStream)this.class_[2] != null) {
         this.class_(var1);
      } else if ((Long)this.class_[3] + 1L < 10485760L) {
         ((ByteArrayOutputStream)this.class_[0]).write(var1);
         Long var6 = (Long)this.class_[3] + 1L;
         this.class_[3] = var6;
      } else {
         this.throws_();
         this.class_(var1);
      }
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      if ((OutputStream)this.class_[2] != null) {
         this.class_(var1, var2, var3);
      } else if ((Long)this.class_[3] + (long)var3 < 10485760L) {
         ((ByteArrayOutputStream)this.class_[0]).write(var1, var2, var3);
         Long var8 = (Long)this.class_[3] + (long)var3;
         this.class_[3] = var8;
      } else {
         this.throws_();
         this.class_(var1, var2, var3);
      }
   }

   @Override
   public void close() throws IOException {
      Object var5 = null;
      this.class_[0] = var5;
      if ((OutputStream)this.class_[2] != null) {
         ((OutputStream)this.class_[2]).close();
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1415618040;
   }

   private static void break_() {
      throws_ = new short[]{4, 8192, 0, 3, 1, 2, 3, 0, 3, 3, 2, 3, 0, 3, 3, 2, 2, 0, 2, 2, 2, 3, 3, 2, 3, 3, 1, 4, 1, 1, 1, 2, 0, 2, 0, 0, 0};
   }

   private void throws_() throws IOException {
      rrzY_2 var10000 = (rrzY_2)this.class_[1];
      Path var5 = ((rrzf_3)this.class_[4]).finally_(null);
      var10000.class_[1] = var5;
      BufferedOutputStream var6 = new BufferedOutputStream(Files.newOutputStream((Path)((rrzY_2)this.class_[1]).class_[1]));
      this.class_[2] = var6;
      ((ByteArrayOutputStream)this.class_[0]).writeTo((OutputStream)this.class_[2]);
      Object var7 = null;
      this.class_[0] = var7;
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[3] = 0L;
      }
   }

   private static void case_() {
      protected_ = new long[]{0L, 1L, 10485760L, 1L, 10485760L, 1L, 0L};
   }

   private static void protected_() {
      break_ = new boolean[2];
   }
}
