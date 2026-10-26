package celestial;

import java.util.function.Predicate;

class RU implements Predicate<rdn_3> {
   private final rdb_3 id_class;
   private final rcd_3 id_break;

   public RU(rdb_3 var1, rcd_3 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public boolean id_class(rdn_3 var1) {
      return var1.id_break() == this.id_class && rco_3.id_class(this.id_break, var1.id_package(), true);
   }
}
