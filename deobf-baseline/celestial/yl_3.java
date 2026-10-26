package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.IntSupplier;

public class yl_3 {
   private final ThreadLocal<yH_2> id_class = ThreadLocal.withInitial(() -> new yH_2());
   private final Long2ObjectLinkedOpenHashMap<int[]> id_break = new Long2ObjectLinkedOpenHashMap(256, 0.25F);
   private final ReentrantReadWriteLock id_byte = new ReentrantReadWriteLock();

   public void id_class() {
      try {
         this.id_byte.writeLock().lock();
         this.id_break.clear();
      } finally {
         this.id_byte.writeLock().unlock();
      }
   }

   public void id_class(int var1, int var2) {
      try {
         this.id_byte.writeLock().lock();

         for (int var3 = -1; var3 <= 1; var3++) {
            for (int var4 = -1; var4 <= 1; var4++) {
               long var5 = rfj_3.id_class(var1 + var3, var2 + var4);
               this.id_break.remove(var5);
            }
         }
      } finally {
         this.id_byte.writeLock().unlock();
      }
   }

   public int id_class(rfH_2 var1, IntSupplier var2) {
      int var3 = var1.b_() >> 4;
      int var4 = var1.d_() >> 4;
      yH_2 var5 = this.id_class.get();
      if (var5.id_class != var3 || var5.id_break != var4) {
         var5.id_class = var3;
         var5.id_break = var4;
         var5.id_byte = this.id_break(var3, var4);
      }

      int var6 = var1.b_() & 15;
      int var7 = var1.d_() & 15;
      int var8 = var7 << 4 | var6;
      int var9 = var5.id_byte[var8];
      if (var9 != -1) {
         return var9;
      } else {
         int var10 = var2.getAsInt();
         var5.id_byte[var8] = var10;
         return var10;
      }
   }

   private int[] id_break(int var1, int var2) {
      long var3 = rfj_3.id_class(var1, var2);
      this.id_byte.readLock().lock();

      int[] var5;
      try {
         var5 = (int[])this.id_break.get(var3);
      } finally {
         this.id_byte.readLock().unlock();
      }

      if (var5 != null) {
         return var5;
      } else {
         int[] var6 = new int[256];
         Arrays.fill(var6, -1);

         try {
            this.id_byte.writeLock().lock();
            if (this.id_break.size() >= 256) {
               this.id_break.removeFirst();
            }

            this.id_break.put(var3, var6);
         } finally {
            this.id_byte.writeLock().unlock();
         }

         return var6;
      }
   }
}
