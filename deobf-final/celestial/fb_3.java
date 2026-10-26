package celestial;

import java.util.function.Predicate;

public class fb_3 {
   private final fB_2 class_;
   private final IU break_;

   public fb_3(fB_2 var1, IU var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("Missing condition for selector");
      } else if (var2 == null) {
         throw new IllegalArgumentException("Missing variant for selector");
      } else {
         this.class_ = var1;
         this.break_ = var2;
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

   public IU class_() {
      return this.break_;
   }

   public Predicate<xc_3> class_(rCF<xd_3, xc_3> var1) {
      return this.class_.getPredicate(var1);
   }
}
