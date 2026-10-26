package celestial;

import java.util.Set;
import java.util.function.Predicate;

public class Rd_1 implements Predicate<ryw_3> {
   private final xc_3 id_class;
   private final Set<rCZ<?>> id_break;
   private final rcd_3 id_byte;

   public Rd_1(xc_3 var1, Set<rCZ<?>> var2, rcd_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public xc_3 id_class() {
      return this.id_class;
   }

   public boolean id_class(rrEm_1 var1, rfH_2 var2, int var3) {
      xc_3 var4 = xd_3.id_break(this.id_class, var1, var2);
      if (var4.id_catch()) {
         var4 = this.id_class;
      }

      if (!var1.id_class(var2, var4, var3)) {
         return false;
      } else {
         if (this.id_byte != null) {
            ryO_2 var5 = var1.id_class(var2);
            if (var5 != null) {
               rcd_3 var6 = this.id_byte.id_catch();
               var6.id_break("x", var2.b_());
               var6.id_break("y", var2.c_());
               var6.id_break("z", var2.d_());
               var5.id_class(var4, var6);
            }
         }

         return true;
      }
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
