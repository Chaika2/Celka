package celestial;

import java.util.Set;
import java.util.function.Predicate;

class Rh_1 implements Predicate<ryw_3> {
   private final xc_3 id_class;
   private final Set<rCZ<?>> id_break;
   private final rcd_3 id_byte;

   public Rh_1(xc_3 var1, Set<rCZ<?>> var2, rcd_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public boolean id_class(ryw_3 var1) {
      xc_3 var2 = var1.id_class();
      if (!var2.id_class(this.id_class.id_break())) {
         return false;
      } else {
         for (rCZ var4 : this.id_break) {
            if (var2.id_byte(var4) != this.id_class.id_byte(var4)) {
               return false;
            }
         }

         if (this.id_byte == null) {
            return true;
         } else {
            ryO_2 var5 = var1.id_break();
            return var5 != null && rco_3.id_class(this.id_byte, var5.id_class(new rcd_3()), true);
         }
      }
   }
}
