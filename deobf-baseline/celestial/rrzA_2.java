package celestial;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzA_2 implements SeekableByteChannel {
   private static String[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   private static short[] id_throws;
   private static byte[] id_case;
   private static int[] id_catch;
   private static long[] id_private;
   public Object[] id_break;

   public void id_byte() {
      ((ReadWriteLock)this.id_break[id_throws[43]]).writeLock().unlock();
   }

   private void id_byte(int var1) {
      int var2 = ((byte[])this.id_break[id_throws[47]]).length;
      int var3 = var2 << id_protected[7];
      if (var3 - var1 < 0) {
         var3 = var1;
      }

      if (var3 - id_catch[0] > 0) {
         var3 = id_break(var1);
      }

      byte[] var8 = Arrays.copyOf((byte[])this.id_break[id_throws[48]], var3);
      this.id_break[id_throws[49]] = var8;
   }

   public rrzA_2(int var1, boolean var2) {
      this.id_extends();
      ReentrantReadWriteLock var7 = new ReentrantReadWriteLock();
      this.id_break[id_throws[0]] = var7;
      byte[] var8 = new byte[var1];
      this.id_break[id_throws[1]] = var8;
      byte var10001 = id_protected[0];
      Integer var9 = Integer.valueOf(id_protected[0]);
      this.id_break[id_throws[2]] = var9;
      Integer var10 = Integer.valueOf(var10001);
      this.id_break[id_throws[3]] = var10;
      Boolean var11 = var2;
      this.id_break[id_throws[4]] = var11;
   }

   public rrzA_2(byte[] var1, boolean var2) {
      this.id_extends();
      ReentrantReadWriteLock var7 = new ReentrantReadWriteLock();
      this.id_break[id_throws[5]] = var7;
      this.id_break[id_throws[6]] = var1;
      Integer var9 = Integer.valueOf(id_protected[1]);
      this.id_break[id_throws[7]] = var9;
      Integer var10 = var1.length;
      this.id_break[id_throws[8]] = var10;
      Boolean var11 = var2;
      this.id_break[id_throws[9]] = var11;
   }

   static {
      ntfClinit();
   }

   @Override
   public long size() throws IOException {
      this.id_native();

      long var1;
      try {
         this.id_case();
         var1 = (long)((Integer)this.id_break[id_throws[33]]).intValue();
      } finally {
         this.id_catch();
      }

      return var1;
   }

   @Override
   public long position() throws IOException {
      this.id_native();

      long var1;
      try {
         this.id_case();
         var1 = (long)((Integer)this.id_break[id_throws[11]]).intValue();
      } finally {
         this.id_catch();
      }

      return var1;
   }

   @Override
   public SeekableByteChannel position(long var1) throws IOException {
      this.id_break();

      rrzA_2 var3;
      try {
         this.id_case();
         if (var1 < id_private[0] || var1 >= id_private[1]) {
            throw new IllegalArgumentException("Illegal position " + var1);
         }

         Integer var9 = Math.min((int)var1, (Integer)this.id_break[id_throws[12]]);
         this.id_break[id_throws[13]] = var9;
         var3 = this;
      } finally {
         this.id_byte();
      }

      return var3;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1571744158164063877L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1190505052;
   }

   public byte[] id_class() {
      this.id_native();

      byte[] var1;
      try {
         var1 = Arrays.copyOf((byte[])this.id_break[id_throws[39]], (Integer)this.id_break[id_throws[40]]);
      } finally {
         this.id_catch();
      }

      return var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-100, -34, -38, -42, -93, -89, 34, -121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean isOpen() {
      return !this.id_break[id_throws[10]] ? id_protected[2] : id_protected[3];
   }

   @Override
   public int write(ByteBuffer var1) throws IOException {
      if ((Boolean)this.id_break[id_throws[23]]) {
         throw new NonWritableChannelException();
      } else {
         this.id_break();

         int var3;
         try {
            this.id_case();
            int var2 = var1.remaining();
            this.id_protected((Integer)this.id_break[id_throws[24]] + var2);
            var1.get((byte[])this.id_break[id_throws[25]], (Integer)this.id_break[id_throws[26]], var2);
            Integer var9 = (Integer)this.id_break[id_throws[27]] + var2;
            this.id_break[id_throws[28]] = var9;
            if ((Integer)this.id_break[id_throws[29]] > (Integer)this.id_break[id_throws[30]]) {
               Integer var10 = (Integer)this.id_break[id_throws[31]];
               this.id_break[id_throws[32]] = var10;
            }

            var3 = var2;
         } finally {
            this.id_byte();
         }

         return var3;
      }
   }

   @Override
   public int read(ByteBuffer var1) throws IOException {
      this.id_break();

      int var2;
      try {
         this.id_case();
         if ((Integer)this.id_break[id_throws[14]] != (Integer)this.id_break[id_throws[15]]) {
            var2 = Math.min(var1.remaining(), (Integer)this.id_break[id_throws[16]] - (Integer)this.id_break[id_throws[17]]);
            var1.put((byte[])this.id_break[id_throws[18]], (Integer)this.id_break[id_throws[19]], var2);
            Integer var9 = (Integer)this.id_break[id_throws[20]] + var2;
            this.id_break[id_throws[21]] = var9;
            return var2;
         }

         var2 = id_case[0];
      } finally {
         this.id_byte();
      }

      return var2;
   }

   @Override
   public void close() throws IOException {
      if (!(Boolean)this.id_break[id_throws[34]]) {
         this.id_break();

         try {
            Boolean var6 = id_protected[4];
            this.id_break[id_throws[35]] = var6;
            Object var7 = null;
            this.id_break[id_throws[36]] = var7;
            Integer var8 = Integer.valueOf(id_protected[5]);
            this.id_break[id_throws[37]] = var8;
            Integer var9 = Integer.valueOf(id_protected[6]);
            this.id_break[id_throws[38]] = var9;
         } finally {
            this.id_byte();
         }
      }
   }

   public void id_break() {
      ((ReadWriteLock)this.id_break[id_throws[42]]).writeLock().lock();
   }

   private static int id_break(int var0) {
      if (var0 < 0) {
         throw new OutOfMemoryError(id_byte[0]);
      } else {
         return var0 > id_catch[1] ? id_catch[2] : id_catch[3];
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{2147483639};
      id_class = var0;
   }

   @Override
   public SeekableByteChannel truncate(long var1) throws IOException {
      if ((Boolean)this.id_break[id_throws[22]]) {
         throw new NonWritableChannelException();
      } else {
         this.id_case();
         throw new UnsupportedOperationException();
      }
   }

   private static void id_finally() {
      id_byte = new String[]{new String("Required length exceeds implementation limit")};
   }

   private final void id_catch() {
      ((ReadWriteLock)this.id_break[id_throws[45]]).readLock().unlock();
   }

   private void id_extends() {
      if (this.id_break == null) {
         this.id_break = new Object[id_case[1]];
         Object[] var1 = this.id_break;
         var1[id_case[2]] = Integer.valueOf(id_protected[8]);
         var1[id_case[3]] = Integer.valueOf(id_protected[9]);
         var1[id_case[4]] = id_protected[10];
         var1[id_case[5]] = id_protected[11];
      }
   }

   private void id_case() throws IOException {
      if ((Boolean)this.id_break[id_throws[41]]) {
         throw new ClosedChannelException();
      }
   }

   private static void id_implements() {
      id_private = new long[]{0L, 2147483647L};
   }

   private void id_protected(int var1) {
      if (var1 - ((byte[])this.id_break[id_throws[46]]).length > 0) {
         this.id_byte(var1);
      }
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, false, true, false, true, false, false, true, false, false, false, false, true, false};
   }

   private static void id_private() {
      id_throws = new short[]{
         0, 1, 3, 2, 5, 0, 1, 2, 3, 5, 4, 2, 3, 2, 2, 3, 3, 2, 1, 2, 2, 2, 5, 5, 2, 1, 2, 2, 2, 2, 3, 2, 3, 3, 4, 4, 1, 2, 3, 1, 3, 4, 0, 0, 0, 0, 1, 1, 1, 1
      };
   }

   private static void id_final() {
      id_case = new byte[]{-1, 6, 2, 3, 4, 5};
   }

   private static void id_volatile() {
      id_catch = new int[]{2147483639, 2147483639, Integer.MAX_VALUE, 2147483639, 2147483639};
   }

   private final void id_native() {
      ((ReadWriteLock)this.id_break[id_throws[44]]).readLock().lock();
   }
}
