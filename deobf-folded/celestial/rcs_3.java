package celestial;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rcs_3 extends rzO_2 {
   private static final Logger id_break = LogManager.getLogger();

   public static rzh_3<?> id_byte() {
      return id_class(rcs_3::new);
   }

   rcs_3(rQz_1[] var1) {
      super(var1);
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_case;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      if (var1.id_class()) {
         return var1;
      } else {
         Optional var3 = var2.id_byte().id_implements().id_class(rkj_3.id_break, new rXA(var1), var2.id_byte());
         if (var3.isPresent()) {
            rdn_3 var4 = ((rkT_2)var3.get()).id_byte();
            if (!var4.id_class()) {
               rdn_3 var5 = var4.id_implements();
               var5.id_throws(var1.id_char());
               return var5;
            }
         }

         id_break.warn("Couldn't smelt {} because there is no smelting recipe", var1);
         return var1;
      }
   }
}
