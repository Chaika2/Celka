package celestial;

import java.util.function.Predicate;

public class Qb_1 implements Predicate<xc_3> {
   private final xd_3 class_;

   public Qb_1(xd_3 var1) {
      this.class_ = var1;
   }

   public static Qb_1 class_(xd_3 var0) {
      return new Qb_1(var0);
   }

   public boolean class_(xc_3 var1) {
      return var1 != null && var1.class_(this.class_);
   }
}
