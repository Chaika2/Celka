package celestial;

import java.util.function.Predicate;

public class fb_3 {
   private final fB_2 id_class;
   private final IU id_break;

   public fb_3(fB_2 var1, IU var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("Missing condition for selector");
      } else if (var2 == null) {
         throw new IllegalArgumentException("Missing variant for selector");
      } else {
         this.id_class = var1;
         this.id_break = var2;
      }
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1;
   }

   @Override
   public int hashCode() {
      return System.identityHashCode(this);
   }

   public IU id_class() {
      return this.id_break;
   }

   public Predicate<xc_3> id_class(rCF<xd_3, xc_3> var1) {
      return this.id_class.getPredicate(var1);
   }
}
