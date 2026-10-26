package celestial;

import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rFe_1 implements Runnable {
   private static final Logger protected_ = LogManager.getLogger();
   private static final AtomicInteger throws_ = new AtomicInteger(0);
   protected volatile boolean class_;
   protected final String break_;
   protected Thread byte_;

   public boolean byte_() {
      return this.class_;
   }

   protected rFe_1(String var1) {
      this.break_ = var1;
   }

   public synchronized void class_() {
      this.class_ = false;
      if (null != this.byte_) {
         int var1 = 0;

         while (this.byte_.isAlive()) {
            try {
               this.byte_.join(1000L);
               if (++var1 >= 5) {
                  protected_.warn("Waited {} seconds attempting force stop!", var1);
               } else if (this.byte_.isAlive()) {
                  protected_.warn("Thread {} ({}) failed to exit after {} second(s)", this, this.byte_.getState(), var1, new Exception("Stack:"));
                  this.byte_.interrupt();
               }
            } catch (InterruptedException var3) {
            }
         }

         protected_.info("Thread {} stopped", this.break_);
         this.byte_ = null;
      }
   }

   public synchronized boolean break_() {
      if (this.class_) {
         return true;
      } else {
         this.class_ = true;
         this.byte_ = new Thread(this, this.break_ + " #" + throws_.incrementAndGet());
         this.byte_.setUncaughtExceptionHandler(new ryi_3(protected_));
         this.byte_.start();
         protected_.info("Thread {} started", this.break_);
         return true;
      }
   }
}
