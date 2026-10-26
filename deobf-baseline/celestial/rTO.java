package celestial;

import java.util.Random;

public class rTO extends Random {
   private static final long id_class = 1L;
   private rqC_2 id_break;
   private long id_byte = Long.MIN_VALUE;
   private long id_protected;
   private long id_throws;
   private long id_case;
   private long id_catch;
   private boolean id_private;
   private static final rqC_2 id_implements = new rqC_2(System.nanoTime());

   public rTO(long var1) {
      this.setSeed(var1);
   }

   public rTO() {
      this(id_class());
   }

   public rTO id_class(long var1) {
      this.setSeed(var1);
      return this;
   }

   public static long id_class() {
      long var0;
      synchronized (id_implements) {
         var0 = id_implements.id_class();
      }

      return var0 ^ System.nanoTime();
   }

   @Override
   public void setSeed(long var1) {
      if (this.id_private && this.id_byte == var1) {
         this.id_case = this.id_protected;
         this.id_catch = this.id_throws;
      } else {
         rqC_2 var3 = this.id_break;
         if (var3 == null) {
            var3 = this.id_break = new rqC_2(var1);
         } else {
            var3.id_break(var1);
         }

         this.id_case = var3.id_class();
         this.id_catch = var3.id_class();
         this.id_protected = this.id_case;
         this.id_throws = this.id_catch;
         this.id_byte = var1;
         this.id_private = true;
      }
   }

   @Override
   public long nextLong() {
      long var1 = this.id_case;
      long var3 = this.id_catch;
      long var5 = var1 + var3;
      var3 ^= var1;
      this.id_case = Long.rotateLeft(var1, 24) ^ var3 ^ var3 << 16;
      this.id_catch = Long.rotateLeft(var3, 37);
      return var5;
   }

   @Override
   public long nextLong(long var1) {
      if (var1 <= 0L) {
         throw new IllegalArgumentException("illegal bound " + var1 + " (must be positive)");
      } else {
         long var3 = this.nextLong();
         long var5 = var1 - 1L;
         if ((var1 & var5) == 0L) {
            return var3 >>> Long.numberOfLeadingZeros(var5) & var5;
         } else {
            long var7 = var3 >>> 1;

            while (var7 + var5 - (var3 = var7 % var1) < 0L) {
               var7 = this.nextLong() >>> 1;
            }

            return var3;
         }
      }
   }

   @Override
   public boolean nextBoolean() {
      return this.nextLong() < 0L;
   }

   @Override
   public float nextFloat() {
      return (float)(this.nextLong() >>> 40) * 5.9604645E-8F;
   }

   @Override
   public void nextBytes(byte[] var1) {
      int var2 = var1.length;

      while (var2 != 0) {
         int var3 = Math.min(var2, 8);

         for (long var4 = this.nextLong(); var3-- != 0; var4 >>= 8) {
            var2--;
            var1[var2] = (byte)((int)var4);
         }
      }
   }

   @Override
   public double nextDouble() {
      return Double.longBitsToDouble(4607182418800017408L | this.nextLong() >>> 12) - 1.0;
   }

   @Override
   public int nextInt() {
      return (int)this.nextLong();
   }

   @Override
   public int nextInt(int var1) {
      return (int)this.nextLong((long)var1);
   }
}
