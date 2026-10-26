package celestial;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzj_3 extends FileChannel {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[1] = false;
         var1[3] = false;
      }
   }

   public rrzj_3(rrzf_3 var1, FileChannel var2, boolean var3, rrzY_2 var4, boolean var5, Path var6) {
      this.byte_();
      this.class_[5] = var1;
      this.class_[0] = var2;
      Boolean var13 = var3;
      this.class_[1] = var13;
      this.class_[2] = var4;
      Boolean var15 = var5;
      this.class_[3] = var15;
      this.class_[4] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public FileLock lock(long var1, long var3, boolean var5) throws IOException {
      return ((FileChannel)this.class_[0]).lock(var1, var3, var5);
   }

   @Override
   public long size() throws IOException {
      return ((FileChannel)this.class_[0]).size();
   }

   @Override
   public long position() throws IOException {
      return ((FileChannel)this.class_[0]).position();
   }

   @Override
   public FileChannel position(long var1) throws IOException {
      ((FileChannel)this.class_[0]).position(var1);
      return this;
   }

   @Override
   public MappedByteBuffer map(MapMode var1, long var2, long var4) {
      throw new UnsupportedOperationException();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4965877509536292968L;
   }

   private static void class_() {
      byte_ = new byte[]{6, 3};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -651383029;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-74, -18, -17, 33, 78, 41, 81, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public long write(ByteBuffer[] var1, int var2, int var3) throws IOException {
      return ((FileChannel)this.class_[0]).write(var1, var2, var3);
   }

   @Override
   public int write(ByteBuffer var1) throws IOException {
      return ((FileChannel)this.class_[0]).write(var1);
   }

   @Override
   public int write(ByteBuffer var1, long var2) throws IOException {
      return ((FileChannel)this.class_[0]).write(var1, var2);
   }

   @Override
   public long read(ByteBuffer[] var1, int var2, int var3) throws IOException {
      return ((FileChannel)this.class_[0]).read(var1, var2, var3);
   }

   @Override
   public int read(ByteBuffer var1, long var2) throws IOException {
      return ((FileChannel)this.class_[0]).read(var1, var2);
   }

   @Override
   public int read(ByteBuffer var1) throws IOException {
      return ((FileChannel)this.class_[0]).read(var1);
   }

   @Override
   public long transferTo(long var1, long var3, WritableByteChannel var5) throws IOException {
      return ((FileChannel)this.class_[0]).transferTo(var1, var3, var5);
   }

   private static void break_() {
      break_ = new short[]{5, 0, 1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 7, 2, 2, 1, 12, 5, 2, 3, 5, 4};
   }

   @Override
   public long transferFrom(ReadableByteChannel var1, long var2, long var4) throws IOException {
      return ((FileChannel)this.class_[0]).transferFrom(var1, var2, var4);
   }

   @Override
   public void implCloseChannel() throws IOException {
      ((FileChannel)this.class_[0]).close();
      if ((Boolean)this.class_[1]) {
         rrzY_2 var10000 = (rrzY_2)this.class_[2];
         Long var5 = System.currentTimeMillis();
         var10000.class_[7] = var5;
         var10000 = (rrzY_2)this.class_[2];
         Long var6 = Files.size((Path)((rrzY_2)this.class_[2]).class_[1]);
         var10000.class_[12] = var6;
         ((rrzf_3)this.class_[5]).class_((rrzY_2)this.class_[2]);
      } else if (!(Boolean)this.class_[3]) {
         ((rrzf_3)this.class_[5]).throws_((Path)this.class_[4]);
      }
   }

   @Override
   public FileChannel truncate(long var1) throws IOException {
      ((FileChannel)this.class_[0]).truncate(var1);
      return this;
   }

   private static void protected_() {
      protected_ = new boolean[]{true, false, false};
   }

   @Override
   public void force(boolean var1) throws IOException {
      ((FileChannel)this.class_[0]).force(var1);
   }

   @Override
   public FileLock tryLock(long var1, long var3, boolean var5) throws IOException {
      return ((FileChannel)this.class_[0]).tryLock(var1, var3, var5);
   }
}
