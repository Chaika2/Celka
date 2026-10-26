package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

public class rCm_1 extends rCZ<Integer> {
   private final ImmutableSet<Integer> class_;

   protected rCm_1(String var1, int var2, int var3) {
      super(var1, Integer.class);
      if (var2 < 0) {
         throw new IllegalArgumentException("Min value of " + var1 + " must be 0 or greater");
      } else if (var3 <= var2) {
         throw new IllegalArgumentException("Max value of " + var1 + " must be greater than min (" + var2 + ")");
      } else {
         HashSet var4 = Sets.newHashSet();

         for (int var5 = var2; var5 <= var3; var5++) {
            var4.add(var5);
         }

         this.class_ = ImmutableSet.copyOf(var4);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rCm_1 && super.equals(var1)) {
         rCm_1 var2 = (rCm_1)var1;
         return this.class_.equals(var2.class_);
      } else {
         return false;
      }
   }

   public String class_(Integer var1) {
      return var1.toString();
   }

   public static rCm_1 class_(String var0, int var1, int var2) {
      return new rCm_1(var0, var1, var2);
   }

   @Override
   public Collection<Integer> class_() {
      return this.class_;
   }

   @Override
   public int break_() {
      return 31 * super.break_() + this.class_.hashCode();
   }

   @Override
   public Optional<Integer> break_(String var1) {
      try {
         Integer var2 = Integer.valueOf(var1);
         return this.class_.contains(var2) ? Optional.of(var2) : Optional.empty();
      } catch (NumberFormatException var3) {
         return Optional.empty();
      }
   }
}
