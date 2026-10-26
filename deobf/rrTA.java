package celestial;

import java.util.function.Predicate;

public interface rrTA extends rrTR {
   default double id_byte() {
      return this.rr().id_byte;
   }

   boolean id_class(rjU_2 var1, rrTj_1 var2, Predicate<xc_3> var3);

   default double id_class() {
      return this.rr().id_protected;
   }

   default double id_break() {
      return this.rr().id_break;
   }

   rjU_2 rr();
}
