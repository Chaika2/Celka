package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Optional;

public class rCN extends rCZ<Boolean> {
   private final ImmutableSet<Boolean> class_ = ImmutableSet.of(true, false);

   protected rCN(String var1) {
      super(var1, Boolean.class);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rCN && super.equals(var1)) {
         rCN var2 = (rCN)var1;
         return this.class_.equals(var2.class_);
      } else {
         return false;
      }
   }

   public String class_(Boolean var1) {
      return var1.toString();
   }

   @Override
   public Collection<Boolean> class_() {
      return this.class_;
   }

   public static rCN class_(String var0) {
      return new rCN(var0);
   }

   @Override
   public Optional<Boolean> break_(String var1) {
      return !"true".equals(var1) && !"false".equals(var1) ? Optional.empty() : Optional.of(Boolean.valueOf(var1));
   }

   @Override
   public int break_() {
      return 31 * super.break_() + this.class_.hashCode();
   }
}
