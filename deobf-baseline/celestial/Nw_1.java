package celestial;

import java.util.concurrent.locks.LockSupport;

public class Nw_1 extends rTQ<Runnable> {
   private Thread id_class = this.id_byte();
   private volatile boolean id_break;

   @Override
   protected boolean id_byte(Runnable var1) {
      return !this.id_break;
   }

   private Thread id_byte() {
      Thread var1 = new Thread(this::id_protected);
      var1.setDaemon(true);
      var1.setName("Sound engine");
      var1.start();
      return var1;
   }

   public Nw_1() {
      super("Sound executor");
   }

   public void id_break() {
      this.id_break = true;
      this.id_class.interrupt();

      try {
         this.id_class.join();
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
      }

      this.rx();
      this.id_break = false;
      this.id_class = this.id_byte();
   }

   @Override
   protected Runnable id_break(Runnable var1) {
      return var1;
   }

   @Override
   protected Thread P() {
      return this.id_class;
   }

   private void id_protected() {
      while (!this.id_break) {
         this.id_byte(() -> this.id_break);
      }
   }

   @Override
   protected void l_() {
      LockSupport.park("waiting for tasks");
   }
}
