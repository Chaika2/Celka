package celestial;

import java.util.Map;

class rrJc_1 implements rrJQ {
   rrJc_1(Map var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(rrJF var1, rrJL var2) {
      synchronized (this.id_class) {
         this.id_class.put("Response", var2);
         this.id_class.notifyAll();
      }
   }

   @Override
   public void id_class(rrJF var1, Exception var2) {
      synchronized (this.id_class) {
         this.id_class.put("Exception", var2);
         this.id_class.notifyAll();
      }
   }
}
