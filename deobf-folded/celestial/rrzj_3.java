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
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[1] = id_protected[1];
         var1[3] = id_protected[2];
      }
   }

   public rrzj_3(rrzf_3 var1, FileChannel var2, boolean var3, rrzY_2 var4, boolean var5, Path var6) {
      this.id_byte();
      this.id_class[5] = var1;
      this.id_class[id_break[1]] = var2;
      Boolean var13 = var3;
      this.id_class[1] = var13;
      this.id_class[2] = var4;
      Boolean var15 = var5;
      this.id_class[3] = var15;
      this.id_class[4] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public FileLock lock(long var1, long var3, boolean var5) throws IOException {
      return ((FileChannel)this.id_class[id_break[19]]).lock(var1, var3, var5);
   }

   @Override
   public long size() throws IOException {
      return ((FileChannel)this.id_class[id_break[10]]).size();
   }

   @Override
   public long position() throws IOException {
      return ((FileChannel)this.id_class[id_break[8]]).position();
   }

   @Override
   public FileChannel position(long var1) throws IOException {
      ((FileChannel)this.id_class[id_break[9]]).position(var1);
      return this;
   }

   @Override
   public MappedByteBuffer map(MapMode var1, long var2, long var4) {
      throw new UnsupportedOperationException();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4965877509536292968L;
   }

   private static void id_class() {
      id_byte = new byte[]{6, 3};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -651383029;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-74, -18, -17, 33, 78, 41, 81, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public long write(ByteBuffer[] var1, int var2, int var3) throws IOException {
      return ((FileChannel)this.id_class[id_break[7]]).write(var1, var2, var3);
   }

   @Override
   public int write(ByteBuffer var1) throws IOException {
      return ((FileChannel)this.id_class[id_break[6]]).write(var1);
   }

   @Override
   public int write(ByteBuffer var1, long var2) throws IOException {
      return ((FileChannel)this.id_class[id_break[18]]).write(var1, var2);
   }

   @Override
   public long read(ByteBuffer[] var1, int var2, int var3) throws IOException {
      return ((FileChannel)this.id_class[id_break[17]]).read(var1, var2, var3);
   }

   @Override
   public int read(ByteBuffer var1, long var2) throws IOException {
      return ((FileChannel)this.id_class[id_break[16]]).read(var1, var2);
   }

   @Override
   public int read(ByteBuffer var1) throws IOException {
      return ((FileChannel)this.id_class[id_break[15]]).read(var1);
   }

   @Override
   public long transferTo(long var1, long var3, WritableByteChannel var5) throws IOException {
      return ((FileChannel)this.id_class[id_break[13]]).transferTo(var1, var3, var5);
   }

   private static void id_break() {
      id_break = new short[]{5, 0, 1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 7, 2, 2, 1, 12, 5, 2, 3, 5, 4};
   }

   @Override
   public long transferFrom(ReadableByteChannel var1, long var2, long var4) throws IOException {
      return ((FileChannel)this.id_class[id_break[14]]).transferFrom(var1, var2, var4);
   }

   @Override
   public void implCloseChannel() throws IOException {
      ((FileChannel)this.id_class[id_break[21]]).close();
      if ((Boolean)this.id_class[1]) {
         rrzY_2 var10000 = (rrzY_2)this.id_class[2];
         Long var5 = System.currentTimeMillis();
         var10000.id_class[7] = var5;
         var10000 = (rrzY_2)this.id_class[2];
         Long var6 = Files.size((Path)((rrzY_2)this.id_class[2]).id_class[1]);
         var10000.id_class[12] = var6;
         ((rrzf_3)this.id_class[5]).id_class((rrzY_2)this.id_class[2]);
      } else if (!(Boolean)this.id_class[3]) {
         ((rrzf_3)this.id_class[5]).id_throws((Path)this.id_class[4]);
      }
   }

   @Override
   public FileChannel truncate(long var1) throws IOException {
      ((FileChannel)this.id_class[id_break[11]]).truncate(var1);
      return this;
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, false, false};
   }

   @Override
   public void force(boolean var1) throws IOException {
      ((FileChannel)this.id_class[id_break[12]]).force(var1);
   }

   @Override
   public FileLock tryLock(long var1, long var3, boolean var5) throws IOException {
      return ((FileChannel)this.id_class[id_break[20]]).tryLock(var1, var3, var5);
   }
}
