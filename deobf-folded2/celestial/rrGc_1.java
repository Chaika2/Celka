package celestial;

import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrGc_1 {
   private static final Logger id_class = LogManager.getLogger();
   private final String id_break;
   private boolean id_byte;

   public void id_byte() {
      this.id_class(true);
   }

   public abstract rcd_3 id_byte(rcd_3 var1);

   public rrGc_1(String var1) {
      this.id_break = var1;
   }

   public void id_class(File var1) {
      if (this.id_protected()) {
         rcd_3 var2 = new rcd_3();
         var2.id_class("data", this.id_byte(new rcd_3()));
         var2.id_break("DataVersion", rqu_3.id_class().getWorldVersion());

         try {
            rcW_2.id_class(var2, var1);
         } catch (IOException var4) {
            id_class.error("Could not save data {}", this, var4);
         }

         this.id_class(false);
      }
   }

   public void id_class(boolean var1) {
      this.id_byte = var1;
   }

   public abstract void id_class(rcd_3 var1);

   public String id_throws() {
      return this.id_break;
   }

   public boolean id_protected() {
      return this.id_byte;
   }
}
