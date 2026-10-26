package celestial;

import java.util.concurrent.locks.LockSupport;

public class Nw_1 extends rTQ<Runnable> {
   private Thread class_ = this.byte_();
   private volatile boolean break_;

   @Override
   protected boolean byte_(Runnable var1) {
      return !this.break_;
   }

   private Thread byte_() {
      Thread var1 = new Thread(this::protected_);
      var1.setDaemon(true);
      var1.setName("Sound engine");
      var1.start();
      return var1;
   }

   public Nw_1() {
      super("Sound executor");
   }

   public void break_() {
      this.break_ = true;
      this.class_.interrupt();

      try {
         this.class_.join();
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
      }

      this.rx();
      this.break_ = false;
      this.class_ = this.byte_();
   }

   @Override
   protected Runnable break_(Runnable var1) {
      return var1;
   }

   @Override
   protected Thread P() {
      return this.class_;
   }

   private void protected_() {
      while (!this.break_) {
         this.byte_(() -> this.break_);
      }
   }

   @Override
   protected void l_() {
      LockSupport.park("waiting for tasks");
   }
}
