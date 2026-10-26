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
   private final String class_;
   private static final Logger break_ = LogManager.getLogger();
   private final Queue<R> protected_ = Queues.newConcurrentLinkedQueue();
   private int throws_;

   protected abstract boolean byte_(R var1);

   public void byte_(BooleanSupplier var1) {
      this.throws_++;

      try {
         while (!var1.getAsBoolean()) {
            if (!this.k_()) {
               this.l_();
            }
         }
      } finally {
         this.throws_--;
      }
   }

   protected rTQ(String var1) {
      this.class_ = var1;
   }

   public <V> CompletableFuture<V> class_(Supplier<V> var1) {
      return this.y() ? CompletableFuture.supplyAsync(var1, this) : CompletableFuture.completedFuture((V)var1.get());
   }

   private CompletableFuture<Void> class_(Runnable var1) {
      return CompletableFuture.supplyAsync(() -> {
         var1.run();
         return null;
      }, this);
   }

   private double class_(R[] var1) {
      double var2 = 0.0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         Runnable var5 = var1[var4];
         var2 += this.protected_(var5);
      }

      return var2;
   }

   private int class_(R[] var1, double var2) {
      double var4 = 0.0;

      for (int var6 = 0; var6 < var1.length; var6++) {
         Runnable var7 = var1[var6];
         var4 += this.protected_(var7);
         if (var4 > var2) {
            return var6 + 1;
         }
      }

      return var1.length;
   }

   protected void rd() {
      int var1 = Integer.MAX_VALUE;
      if (rrbb_3.rh() && this == QY.instanceof_()) {
         var1 = this.break_();
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
         this.private_(this.break_(var1));
      } else {
         var1.run();
      }
   }

   protected boolean y() {
      return !this.rX();
   }

   protected abstract R break_(Runnable var1);

   private int break_() {
      if (this.protected_.isEmpty()) {
         return 0;
      } else {
         Runnable[] var1 = this.protected_.toArray(new Runnable[this.protected_.size()]);
         double var2 = this.class_((R[])var1);
         if (var2 < 5.0) {
            return Integer.MAX_VALUE;
         } else {
            int var4 = var1.length;
            int var5 = Math.max(rrbb_3.rz(), 1);
            double var6 = (double)(var4 * 10 / var5);
            return this.class_((R[])var1, var6);
         }
      }
   }

   protected void throws_(R var1) {
      try {
         var1.run();
      } catch (Exception var4) {
         break_.fatal("Error executing task on {}", this.j_(), var4);
         if (var4.getCause() instanceof OutOfMemoryError) {
            OutOfMemoryError var3 = (OutOfMemoryError)var4.getCause();
            throw var3;
         }
      }
   }

   protected abstract Thread P();

   public void catch_(Runnable var1) {
      if (!this.rX()) {
         this.class_(var1).join();
      } else {
         var1.run();
      }
   }

   public CompletableFuture<Void> case_(Runnable var1) {
      if (this.y()) {
         return this.class_(var1);
      } else {
         var1.run();
         return CompletableFuture.completedFuture((Void)null);
      }
   }

   private double protected_(Runnable var1) {
      if (var1 instanceof rrzB_2 var2) {
         ruS_2 var3 = var2.class_();
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

   public void private_(R var1) {
      this.protected_.add((R)var1);
      LockSupport.unpark(this.P());
   }

   public int rJ() {
      return this.protected_.size();
   }

   public boolean rX() {
      return Thread.currentThread() == this.P();
   }

   protected void rx() {
      this.protected_.clear();
   }

   @Override
   public String j_() {
      return this.class_;
   }

   protected boolean k_() {
      Runnable var1 = this.protected_.peek();
      if (var1 == null) {
         return false;
      } else if (this.throws_ == 0 && !this.byte_((R)var1)) {
         return false;
      } else {
         this.throws_(this.protected_.remove());
         return true;
      }
   }

   protected void l_() {
      Thread.yield();
      LockSupport.parkNanos("waiting for tasks", 100000L);
   }
}
