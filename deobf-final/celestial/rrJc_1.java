package celestial;

import java.util.Map;

class rrJc_1 implements rrJQ {
   rrJc_1(Map var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(rrJF var1, rrJL var2) {
      synchronized (this.class_) {
         this.class_.put("Response", var2);
         this.class_.notifyAll();
      }
   }

   @Override
   public void class_(rrJF var1, Exception var2) {
      synchronized (this.class_) {
         this.class_.put("Exception", var2);
         this.class_.notifyAll();
      }
   }
}
