package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.IntSupplier;

public class yl_3 {
   private final ThreadLocal<yH_2> class_ = ThreadLocal.withInitial(() -> new yH_2());
   private final Long2ObjectLinkedOpenHashMap<int[]> break_ = new Long2ObjectLinkedOpenHashMap(256, 0.25F);
   private final ReentrantReadWriteLock byte_ = new ReentrantReadWriteLock();

   public void class_() {
      try {
         this.byte_.writeLock().lock();
         this.break_.clear();
      } finally {
         this.byte_.writeLock().unlock();
      }
   }

   public void class_(int var1, int var2) {
      try {
         this.byte_.writeLock().lock();

         for (int var3 = -1; var3 <= 1; var3++) {
            for (int var4 = -1; var4 <= 1; var4++) {
               long var5 = rfj_3.class_(var1 + var3, var2 + var4);
               this.break_.remove(var5);
            }
         }
      } finally {
         this.byte_.writeLock().unlock();
      }
   }

   public int class_(rfH_2 var1, IntSupplier var2) {
      int var3 = var1.b_() >> 4;
      int var4 = var1.d_() >> 4;
      yH_2 var5 = this.class_.get();
      if (var5.class_ != var3 || var5.break_ != var4) {
         var5.class_ = var3;
         var5.break_ = var4;
         var5.byte_ = this.break_(var3, var4);
      }

      int var6 = var1.b_() & 15;
      int var7 = var1.d_() & 15;
      int var8 = var7 << 4 | var6;
      int var9 = var5.byte_[var8];
      if (var9 != -1) {
         return var9;
      } else {
         int var10 = var2.getAsInt();
         var5.byte_[var8] = var10;
         return var10;
      }
   }

   private int[] break_(int var1, int var2) {
      long var3 = rfj_3.class_(var1, var2);
      this.byte_.readLock().lock();

      int[] var5;
      try {
         var5 = (int[])this.break_.get(var3);
      } finally {
         this.byte_.readLock().unlock();
      }

      if (var5 != null) {
         return var5;
      } else {
         int[] var6 = new int[256];
         Arrays.fill(var6, -1);

         try {
            this.byte_.writeLock().lock();
            if (this.break_.size() >= 256) {
               this.break_.removeFirst();
            }

            this.break_.put(var3, var6);
         } finally {
            this.byte_.writeLock().unlock();
         }

         return var6;
      }
   }
}
