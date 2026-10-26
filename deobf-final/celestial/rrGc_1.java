package celestial;

import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrGc_1 {
   private static final Logger class_ = LogManager.getLogger();
   private final String break_;
   private boolean byte_;

   public void byte_() {
      this.class_(true);
   }

   public abstract rcd_3 byte_(rcd_3 var1);

   public rrGc_1(String var1) {
      this.break_ = var1;
   }

   public void class_(File var1) {
      if (this.protected_()) {
         rcd_3 var2 = new rcd_3();
         var2.class_("data", this.byte_(new rcd_3()));
         var2.break_("DataVersion", rqu_3.class_().getWorldVersion());

         try {
            rcW_2.class_(var2, var1);
         } catch (IOException var4) {
            class_.error("Could not save data {}", this, var4);
         }

         this.class_(false);
      }
   }

   public void class_(boolean var1) {
      this.byte_ = var1;
   }

   public abstract void class_(rcd_3 var1);

   public String throws_() {
      return this.break_;
   }

   public boolean protected_() {
      return this.byte_;
   }
}
