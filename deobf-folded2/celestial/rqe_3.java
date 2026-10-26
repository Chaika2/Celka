package celestial;

class rqe_3 extends Thread {
   rqe_3(String var1) {
      super(var1);
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
            rqR_2.id_catch.warn("Timer hack thread interrupted, that really should not happen");
            return;
         }
      }
   }
}
