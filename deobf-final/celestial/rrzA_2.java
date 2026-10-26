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
   private static String[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   private static short[] throws_;
   private static byte[] case_;
   private static int[] catch_;
   private static long[] private_;
   public Object[] break_;

   public void byte_() {
      ((ReadWriteLock)this.break_[0]).writeLock().unlock();
   }

   private void byte_(int var1) {
      int var2 = ((byte[])this.break_[1]).length;
      int var3 = var2 << 1;
      if (var3 - var1 < 0) {
         var3 = var1;
      }

      if (var3 - 2147483639 > 0) {
         var3 = break_(var1);
      }

      byte[] var8 = Arrays.copyOf((byte[])this.break_[1], var3);
      this.break_[1] = var8;
   }

   public rrzA_2(int var1, boolean var2) {
      this.extends_();
      ReentrantReadWriteLock var7 = new ReentrantReadWriteLock();
      this.break_[0] = var7;
      byte[] var8 = new byte[var1];
      this.break_[1] = var8;
      Integer var9 = 0;
      this.break_[3] = var9;
      Integer var10 = 0;
      this.break_[2] = var10;
      Boolean var11 = var2;
      this.break_[5] = var11;
   }

   public rrzA_2(byte[] var1, boolean var2) {
      this.extends_();
      ReentrantReadWriteLock var7 = new ReentrantReadWriteLock();
      this.break_[0] = var7;
      this.break_[1] = var1;
      Integer var9 = 0;
      this.break_[2] = var9;
      Integer var10 = var1.length;
      this.break_[3] = var10;
      Boolean var11 = var2;
      this.break_[5] = var11;
   }

   static {
      ntfClinit();
   }

   @Override
   public long size() throws IOException {
      this.native_();

      long var1;
      try {
         this.case_();
         var1 = (long)((Integer)this.break_[throws_[33]]).intValue();
      } finally {
         this.catch_();
      }

      return var1;
   }

   @Override
   public long position() throws IOException {
      this.native_();

      long var1;
      try {
         this.case_();
         var1 = (long)((Integer)this.break_[throws_[11]]).intValue();
      } finally {
         this.catch_();
      }

      return var1;
   }

   @Override
   public SeekableByteChannel position(long var1) throws IOException {
      this.break_();

      rrzA_2 var3;
      try {
         this.case_();
         if (var1 < private_[0] || var1 >= private_[1]) {
            throw new IllegalArgumentException("Illegal position " + var1);
         }

         Integer var9 = Math.min((int)var1, (Integer)this.break_[throws_[12]]);
         this.break_[throws_[13]] = var9;
         var3 = this;
      } finally {
         this.byte_();
      }

      return var3;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1571744158164063877L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1190505052;
   }

   public byte[] class_() {
      this.native_();

      byte[] var1;
      try {
         var1 = Arrays.copyOf((byte[])this.break_[throws_[39]], (Integer)this.break_[throws_[40]]);
      } finally {
         this.catch_();
      }

      return var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-100, -34, -38, -42, -93, -89, 34, -121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean isOpen() {
      return !this.break_[4] ? true : protected_[3];
   }

   @Override
   public int write(ByteBuffer var1) throws IOException {
      if ((Boolean)this.break_[5]) {
         throw new NonWritableChannelException();
      } else {
         this.break_();

         int var3;
         try {
            this.case_();
            int var2 = var1.remaining();
            this.protected_((Integer)this.break_[throws_[24]] + var2);
            var1.get((byte[])this.break_[throws_[25]], (Integer)this.break_[throws_[26]], var2);
            Integer var9 = (Integer)this.break_[throws_[27]] + var2;
            this.break_[throws_[28]] = var9;
            if ((Integer)this.break_[throws_[29]] > (Integer)this.break_[throws_[30]]) {
               Integer var10 = (Integer)this.break_[throws_[31]];
               this.break_[throws_[32]] = var10;
            }

            var3 = var2;
         } finally {
            this.byte_();
         }

         return var3;
      }
   }

   @Override
   public int read(ByteBuffer var1) throws IOException {
      this.break_();

      int var2;
      try {
         this.case_();
         if ((Integer)this.break_[throws_[14]] != (Integer)this.break_[throws_[15]]) {
            var2 = Math.min(var1.remaining(), (Integer)this.break_[throws_[16]] - (Integer)this.break_[throws_[17]]);
            var1.put((byte[])this.break_[throws_[18]], (Integer)this.break_[throws_[19]], var2);
            Integer var9 = (Integer)this.break_[throws_[20]] + var2;
            this.break_[throws_[21]] = var9;
            return var2;
         }

         var2 = case_[0];
      } finally {
         this.byte_();
      }

      return var2;
   }

   @Override
   public void close() throws IOException {
      if (!(Boolean)this.break_[4]) {
         this.break_();

         try {
            Boolean var6 = protected_[4];
            this.break_[throws_[35]] = var6;
            Object var7 = null;
            this.break_[throws_[36]] = var7;
            Integer var8 = Integer.valueOf(protected_[5]);
            this.break_[throws_[37]] = var8;
            Integer var9 = Integer.valueOf(protected_[6]);
            this.break_[throws_[38]] = var9;
         } finally {
            this.byte_();
         }
      }
   }

   public void break_() {
      ((ReadWriteLock)this.break_[0]).writeLock().lock();
   }

   private static int break_(int var0) {
      if (var0 < 0) {
         throw new OutOfMemoryError("Required length exceeds implementation limit");
      } else {
         return var0 > 2147483639 ? Integer.MAX_VALUE : catch_[3];
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{2147483639};
      class_ = var0;
   }

   @Override
   public SeekableByteChannel truncate(long var1) throws IOException {
      if ((Boolean)this.break_[5]) {
         throw new NonWritableChannelException();
      } else {
         this.case_();
         throw new UnsupportedOperationException();
      }
   }

   private static void finally_() {
      byte_ = new String[]{new String("Required length exceeds implementation limit")};
   }

   private final void catch_() {
      ((ReadWriteLock)this.break_[0]).readLock().unlock();
   }

   private void extends_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
         Object[] var1 = this.break_;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = false;
         var1[5] = false;
      }
   }

   private void case_() throws IOException {
      if ((Boolean)this.break_[4]) {
         throw new ClosedChannelException();
      }
   }

   private static void implements_() {
      private_ = new long[]{0L, 2147483647L};
   }

   private void protected_(int var1) {
      if (var1 - ((byte[])this.break_[1]).length > 0) {
         this.byte_(var1);
      }
   }

   private static void protected_() {
      protected_ = new boolean[]{false, false, true, false, true, false, false, true, false, false, false, false, true, false};
   }

   private static void private_() {
      throws_ = new short[]{
         0, 1, 3, 2, 5, 0, 1, 2, 3, 5, 4, 2, 3, 2, 2, 3, 3, 2, 1, 2, 2, 2, 5, 5, 2, 1, 2, 2, 2, 2, 3, 2, 3, 3, 4, 4, 1, 2, 3, 1, 3, 4, 0, 0, 0, 0, 1, 1, 1, 1
      };
   }

   private static void final_() {
      case_ = new byte[]{-1, 6, 2, 3, 4, 5};
   }

   private static void volatile_() {
      catch_ = new int[]{2147483639, 2147483639, Integer.MAX_VALUE, 2147483639, 2147483639};
   }

   private final void native_() {
      ((ReadWriteLock)this.break_[0]).readLock().lock();
   }
}
