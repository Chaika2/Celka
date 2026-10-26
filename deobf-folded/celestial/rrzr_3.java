package celestial;

import java.lang.reflect.Method;
import java.util.function.LongSupplier;

class rrzr_3 implements LongSupplier {
   private boolean id_byte;

   rrzr_3(Method var1, Object var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = false;
   }

   @Override
   public long getAsLong() {
      if (this.id_byte) {
         return -1L;
      } else {
         try {
            return (Long)this.id_class.invoke(this.id_break);
         } catch (Throwable var2) {
            rrbb_3.id_protected("(Reflector) " + var2.getClass().getName() + ": " + var2.getMessage());
            this.id_byte = true;
            return -1L;
         }
      }
   }
}
