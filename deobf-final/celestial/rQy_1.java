package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rQy_1 implements rQz_1 {
   private static final Logger class_ = LogManager.getLogger();
   final rqO_2 break_;

   rQy_1(rqO_2 var1) {
      this.break_ = var1;
   }

   public boolean class_(rzr_3 var1) {
      rQz_1 var2 = var1.break_(this.break_);
      if (var1.class_(var2)) {
         boolean var3;
         try {
            var3 = var2.test(var1);
         } finally {
            var1.break_(var2);
         }

         return var3;
      } else {
         class_.warn("Detected infinite loop in loot tables");
         return false;
      }
   }

   @Override
   public void class_(rQs_1 var1) {
      if (var1.break_(this.break_)) {
         var1.class_("Condition " + this.break_ + " is recursively called");
      } else {
         rQz_1.super.class_(var1);
         rQz_1 var2 = var1.protected_(this.break_);
         if (var2 == null) {
            var1.class_("Unknown condition table called " + this.break_);
         } else {
            var2.class_(var1.class_(".{" + this.break_ + "}", this.break_));
         }
      }
   }

   @Override
   public rWi_1 break_() {
      return rQF.package_;
   }
}
