package celestial;

import it.unimi.dsi.fastutil.ints.Int2BooleanFunction;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rTh_1<T> implements AutoCloseable, Runnable, rTX<T> {
   private static final Logger id_break = LogManager.getLogger();
   private final AtomicInteger id_byte = new AtomicInteger(0);
   public final rTx_1<? super T, ? extends Runnable> id_class;
   private final Executor id_protected;
   private final String id_throws;

   private void id_byte() {
      int var1;
      do {
         var1 = this.id_byte.get();
      } while (!this.id_byte.compareAndSet(var1, var1 & -3));
   }

   public rTh_1(rTx_1<? super T, ? extends Runnable> var1, Executor var2, String var3) {
      this.id_protected = var2;
      this.id_class = var1;
      this.id_throws = var3;
   }

   @Override
   public void run() {
      try {
         this.id_class(var0 -> var0 == 0);
      } finally {
         this.id_byte();
         this.id_catch();
      }
   }

   @Override
   public String toString() {
      return this.id_throws + " " + this.id_byte.get() + " " + this.id_class.id_break();
   }

   private int id_class(Int2BooleanFunction var1) {
      int var2 = 0;

      while (var1.get(var2) && this.id_case()) {
         var2++;
      }

      return var2;
   }

   @Override
   public void id_class(T var1) {
      this.id_class.id_class((T)var1);
      this.id_catch();
   }

   public static rTh_1<Runnable> id_class(Executor var0, String var1) {
      return new rTh_1<>(new rTW<>(new ConcurrentLinkedQueue<>()), var0, var1);
   }

   @Override
   public void close() {
      int var1;
      do {
         var1 = this.id_byte.get();
      } while (!this.id_byte.compareAndSet(var1, var1 | 1));
   }

   private boolean id_break() {
      int var1;
      do {
         var1 = this.id_byte.get();
         if ((var1 & 3) != 0) {
            return false;
         }
      } while (!this.id_byte.compareAndSet(var1, var1 | 2));

      return true;
   }

   private boolean id_throws() {
      return (this.id_byte.get() & 2) != 0;
   }

   private void id_catch() {
      if (this.id_protected() && this.id_break()) {
         try {
            this.id_protected.execute(this);
         } catch (RejectedExecutionException var4) {
            try {
               this.id_protected.execute(this);
            } catch (RejectedExecutionException var3) {
               id_break.error("Cound not schedule mailbox", var3);
            }
         }
      }
   }

   private boolean id_case() {
      if (!this.id_throws()) {
         return false;
      } else {
         Runnable var1 = this.id_class.id_class();
         if (var1 == null) {
            return false;
         } else {
            String var2;
            Thread var3;
            if (rqu_3.id_byte) {
               var3 = Thread.currentThread();
               var2 = var3.getName();
               var3.setName(this.id_throws);
            } else {
               var3 = null;
               var2 = null;
            }

            var1.run();
            if (var3 != null) {
               var3.setName(var2);
            }

            return true;
         }
      }
   }

   private boolean id_protected() {
      return (this.id_byte.get() & 1) != 0 ? false : !this.id_class.id_break();
   }

   @Override
   public String j_() {
      return this.id_throws;
   }
}
