package celestial;

import com.google.common.collect.Queues;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rTQ<R extends Runnable> implements Executor, rTX<R> {
   private final String id_class;
   private static final Logger id_break = LogManager.getLogger();
   private final Queue<R> id_protected = Queues.newConcurrentLinkedQueue();
   private int id_throws;

   protected abstract boolean id_byte(R var1);

   public void id_byte(BooleanSupplier var1) {
      this.id_throws++;

      try {
         while (!var1.getAsBoolean()) {
            if (!this.k_()) {
               this.l_();
            }
         }
      } finally {
         this.id_throws--;
      }
   }

   protected rTQ(String var1) {
      this.id_class = var1;
   }

   public <V> CompletableFuture<V> id_class(Supplier<V> var1) {
      return this.y() ? CompletableFuture.supplyAsync(var1, this) : CompletableFuture.completedFuture((V)var1.get());
   }

   private CompletableFuture<Void> id_class(Runnable var1) {
      return CompletableFuture.supplyAsync(() -> {
         var1.run();
         return null;
      }, this);
   }

   private double id_class(R[] var1) {
      double var2 = 0.0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         Runnable var5 = var1[var4];
         var2 += this.id_protected(var5);
      }

      return var2;
   }

   private int id_class(R[] var1, double var2) {
      double var4 = 0.0;

      for (int var6 = 0; var6 < var1.length; var6++) {
         Runnable var7 = var1[var6];
         var4 += this.id_protected(var7);
         if (var4 > var2) {
            return var6 + 1;
         }
      }

      return var1.length;
   }

   protected void rd() {
      int var1 = Integer.MAX_VALUE;
      if (rrbb_3.rh() && this == QY.id_instanceof()) {
         var1 = this.id_break();
      }

      while (this.k_()) {
         if (--var1 <= 0) {
            break;
         }
      }
   }

   @Override
   public void execute(Runnable var1) {
      if (this.y()) {
         this.id_private(this.id_break(var1));
      } else {
         var1.run();
      }
   }

   protected boolean y() {
      return !this.rX();
   }

   protected abstract R id_break(Runnable var1);

   private int id_break() {
      if (this.id_protected.isEmpty()) {
         return 0;
      } else {
         Runnable[] var1 = this.id_protected.toArray(new Runnable[this.id_protected.size()]);
         double var2 = this.id_class((R[])var1);
         if (var2 < 5.0) {
            return Integer.MAX_VALUE;
         } else {
            int var4 = var1.length;
            int var5 = Math.max(rrbb_3.rz(), 1);
            double var6 = (double)(var4 * 10 / var5);
            return this.id_class((R[])var1, var6);
         }
      }
   }

   protected void id_throws(R var1) {
      try {
         var1.run();
      } catch (Exception var4) {
         id_break.fatal("Error executing task on {}", this.j_(), var4);
         if (var4.getCause() instanceof OutOfMemoryError) {
            OutOfMemoryError var3 = (OutOfMemoryError)var4.getCause();
            throw var3;
         }
      }
   }

   protected abstract Thread P();

   public void id_catch(Runnable var1) {
      if (!this.rX()) {
         this.id_class(var1).join();
      } else {
         var1.run();
      }
   }

   public CompletableFuture<Void> id_case(Runnable var1) {
      if (this.y()) {
         return this.id_class(var1);
      } else {
         var1.run();
         return CompletableFuture.completedFuture((Void)null);
      }
   }

   private double id_protected(Runnable var1) {
      if (var1 instanceof rrzB_2 var2) {
         ruS_2 var3 = var2.id_class();
         if (var3 instanceof rZD) {
            return 1.0;
         }

         if (var3 instanceof rFC) {
            return 0.2;
         }

         if (var3 instanceof rFZ) {
            return 2.6;
         }
      }

      return 0.0;
   }

   public void id_private(R var1) {
      this.id_protected.add((R)var1);
      LockSupport.unpark(this.P());
   }

   public int rJ() {
      return this.id_protected.size();
   }

   public boolean rX() {
      return Thread.currentThread() == this.P();
   }

   protected void rx() {
      this.id_protected.clear();
   }

   @Override
   public String j_() {
      return this.id_class;
   }

   protected boolean k_() {
      Runnable var1 = this.id_protected.peek();
      if (var1 == null) {
         return false;
      } else if (this.id_throws == 0 && !this.id_byte((R)var1)) {
         return false;
      } else {
         this.id_throws(this.id_protected.remove());
         return true;
      }
   }

   protected void l_() {
      Thread.yield();
      LockSupport.parkNanos("waiting for tasks", 100000L);
   }
}
