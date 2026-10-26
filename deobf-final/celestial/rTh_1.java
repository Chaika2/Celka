package celestial;

import it.unimi.dsi.fastutil.ints.Int2BooleanFunction;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rTh_1<T> implements AutoCloseable, Runnable, rTX<T> {
   private static final Logger break_ = LogManager.getLogger();
   private final AtomicInteger byte_ = new AtomicInteger(0);
   public final rTx_1<? super T, ? extends Runnable> class_;
   private final Executor protected_;
   private final String throws_;

   private void byte_() {
      int var1;
      do {
         var1 = this.byte_.get();
      } while (!this.byte_.compareAndSet(var1, var1 & -3));
   }

   public rTh_1(rTx_1<? super T, ? extends Runnable> var1, Executor var2, String var3) {
      this.protected_ = var2;
      this.class_ = var1;
      this.throws_ = var3;
   }

   @Override
   public void run() {
      try {
         this.class_(var0 -> var0 == 0);
      } finally {
         this.byte_();
         this.catch_();
      }
   }

   @Override
   public String toString() {
      return this.throws_ + " " + this.byte_.get() + " " + this.class_.break_();
   }

   private int class_(Int2BooleanFunction var1) {
      int var2 = 0;

      while (var1.get(var2) && this.case_()) {
         var2++;
      }

      return var2;
   }

   @Override
   public void class_(T var1) {
      this.class_.class_((T)var1);
      this.catch_();
   }

   public static rTh_1<Runnable> class_(Executor var0, String var1) {
      return new rTh_1<>(new rTW<>(new ConcurrentLinkedQueue<>()), var0, var1);
   }

   @Override
   public void close() {
      int var1;
      do {
         var1 = this.byte_.get();
      } while (!this.byte_.compareAndSet(var1, var1 | 1));
   }

   private boolean break_() {
      int var1;
      do {
         var1 = this.byte_.get();
         if ((var1 & 3) != 0) {
            return false;
         }
      } while (!this.byte_.compareAndSet(var1, var1 | 2));

      return true;
   }

   private boolean throws_() {
      return (this.byte_.get() & 2) != 0;
   }

   private void catch_() {
      if (this.protected_() && this.break_()) {
         try {
            this.protected_.execute(this);
         } catch (RejectedExecutionException var4) {
            try {
               this.protected_.execute(this);
            } catch (RejectedExecutionException var3) {
               break_.error("Cound not schedule mailbox", var3);
            }
         }
      }
   }

   private boolean case_() {
      if (!this.throws_()) {
         return false;
      } else {
         Runnable var1 = this.class_.class_();
         if (var1 == null) {
            return false;
         } else {
            String var2;
            Thread var3;
            if (rqu_3.byte_) {
               var3 = Thread.currentThread();
               var2 = var3.getName();
               var3.setName(this.throws_);
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

   private boolean protected_() {
      return (this.byte_.get() & 1) != 0 ? false : !this.class_.break_();
   }

   @Override
   public String j_() {
      return this.throws_;
   }
}
