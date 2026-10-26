package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Optional;

public class rCN extends rCZ<Boolean> {
   private final ImmutableSet<Boolean> id_class = ImmutableSet.of(true, false);

   protected rCN(String var1) {
      super(var1, Boolean.class);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rCN && super.equals(var1)) {
         rCN var2 = (rCN)var1;
         return this.id_class.equals(var2.id_class);
      } else {
         return false;
      }
   }

   public String id_class(Boolean var1) {
      return var1.toString();
   }

   @Override
   public Collection<Boolean> id_class() {
      return this.id_class;
   }

   public static rCN id_class(String var0) {
      return new rCN(var0);
   }

   @Override
   public Optional<Boolean> id_break(String var1) {
      return !"true".equals(var1) && !"false".equals(var1) ? Optional.empty() : Optional.of(Boolean.valueOf(var1));
   }

   @Override
   public int id_break() {
      return 31 * super.id_break() + this.id_class.hashCode();
   }
}
