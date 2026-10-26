package celestial;

import java.util.function.Predicate;

public class Qb_1 implements Predicate<xc_3> {
   private final xd_3 id_class;

   public Qb_1(xd_3 var1) {
      this.id_class = var1;
   }

   public static Qb_1 id_class(xd_3 var0) {
      return new Qb_1(var0);
   }

   public boolean id_class(xc_3 var1) {
      return var1 != null && var1.id_class(this.id_class);
   }
}
