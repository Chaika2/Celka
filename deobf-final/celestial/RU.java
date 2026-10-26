package celestial;

import java.util.function.Predicate;

class RU implements Predicate<rdn_3> {
   private final rdb_3 class_;
   private final rcd_3 break_;

   public RU(rdb_3 var1, rcd_3 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public boolean class_(rdn_3 var1) {
      return var1.break_() == this.class_ && rco_3.class_(this.break_, var1.package_(), true);
   }
}
