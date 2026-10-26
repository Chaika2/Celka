package celestial;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rcs_3 extends rzO_2 {
   private static final Logger break_ = LogManager.getLogger();

   public static rzh_3<?> byte_() {
      return class_(rcs_3::new);
   }

   rcs_3(rQz_1[] var1) {
      super(var1);
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.case_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      if (var1.class_()) {
         return var1;
      } else {
         Optional var3 = var2.byte_().implements_().class_(rkj_3.break_, new rXA(var1), var2.byte_());
         if (var3.isPresent()) {
            rdn_3 var4 = ((rkT_2)var3.get()).byte_();
            if (!var4.class_()) {
               rdn_3 var5 = var4.implements_();
               var5.throws_(var1.char_());
               return var5;
            }
         }

         break_.warn("Couldn't smelt {} because there is no smelting recipe", var1);
         return var1;
      }
   }
}
