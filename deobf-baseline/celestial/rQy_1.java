package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rQy_1 implements rQz_1 {
   private static final Logger id_class = LogManager.getLogger();
   final rqO_2 id_break;

   rQy_1(rqO_2 var1) {
      this.id_break = var1;
   }

   public boolean id_class(rzr_3 var1) {
      rQz_1 var2 = var1.id_break(this.id_break);
      if (var1.id_class(var2)) {
         boolean var3;
         try {
            var3 = var2.test(var1);
         } finally {
            var1.id_break(var2);
         }

         return var3;
      } else {
         id_class.warn("Detected infinite loop in loot tables");
         return false;
      }
   }

   @Override
   public void id_class(rQs_1 var1) {
      if (var1.id_break(this.id_break)) {
         var1.id_class("Condition " + this.id_break + " is recursively called");
      } else {
         rQz_1.super.id_class(var1);
         rQz_1 var2 = var1.id_protected(this.id_break);
         if (var2 == null) {
            var1.id_class("Unknown condition table called " + this.id_break);
         } else {
            var2.id_class(var1.id_class(".{" + this.id_break + "}", this.id_break));
         }
      }
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_package;
   }
}
