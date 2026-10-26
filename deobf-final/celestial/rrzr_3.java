package celestial;

import java.lang.reflect.Method;
import java.util.function.LongSupplier;

class rrzr_3 implements LongSupplier {
   private boolean byte_;

   rrzr_3(Method var1, Object var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = false;
   }

   @Override
   public long getAsLong() {
      if (this.byte_) {
         return -1L;
      } else {
         try {
            return (Long)this.class_.invoke(this.break_);
         } catch (Throwable var2) {
            rrbb_3.protected_("(Reflector) " + var2.getClass().getName() + ": " + var2.getMessage());
            this.byte_ = true;
            return -1L;
         }
      }
   }
}
