package celestial;

import java.util.Random;

public class rTO extends Random {
   private static final long class_ = 1L;
   private rqC_2 break_;
   private long byte_ = Long.MIN_VALUE;
   private long protected_;
   private long throws_;
   private long case_;
   private long catch_;
   private boolean private_;
   private static final rqC_2 implements_ = new rqC_2(System.nanoTime());

   public rTO(long var1) {
      this.setSeed(var1);
   }

   public rTO() {
      this(class_());
   }

   public rTO class_(long var1) {
      this.setSeed(var1);
      return this;
   }

   public static long class_() {
      long var0;
      synchronized (implements_) {
         var0 = implements_.class_();
      }

      return var0 ^ System.nanoTime();
   }

   @Override
   public void setSeed(long var1) {
      if (this.private_ && this.byte_ == var1) {
         this.case_ = this.protected_;
         this.catch_ = this.throws_;
      } else {
         rqC_2 var3 = this.break_;
         if (var3 == null) {
            var3 = this.break_ = new rqC_2(var1);
         } else {
            var3.break_(var1);
         }

         this.case_ = var3.class_();
         this.catch_ = var3.class_();
         this.protected_ = this.case_;
         this.throws_ = this.catch_;
         this.byte_ = var1;
         this.private_ = true;
      }
   }

   @Override
   public long nextLong() {
      long var1 = this.case_;
      long var3 = this.catch_;
      long var5 = var1 + var3;
      var3 ^= var1;
      this.case_ = Long.rotateLeft(var1, 24) ^ var3 ^ var3 << 16;
      this.catch_ = Long.rotateLeft(var3, 37);
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
