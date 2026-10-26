package celestial;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class rCu_1<T extends Enum<T> & rpH_2> extends rCZ<T> {
   private final ImmutableSet<T> class_;
   private final Map<String, T> break_ = Maps.newHashMap();

   protected rCu_1(String var1, Class<T> var2, Collection<T> var3) {
      super(var1, var2);
      this.class_ = ImmutableSet.copyOf(var3);

      for (Enum var5 : var3) {
         String var6 = ((rpH_2)var5).class_();
         if (this.break_.containsKey(var6)) {
            throw new IllegalArgumentException("Multiple values have the same name '" + var6 + "'");
         }

         this.break_.put(var6, (T)var5);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rCu_1 && super.equals(var1)) {
         rCu_1 var2 = (rCu_1)var1;
         return this.class_.equals(var2.class_) && this.break_.equals(var2.break_);
      } else {
         return false;
      }
   }

   public static <T extends Enum<T> & rpH_2> rCu_1<T> class_(String var0, Class<T> var1) {
      return class_(var0, var1, Predicates.alwaysTrue());
   }

   public static <T extends Enum<T> & rpH_2> rCu_1<T> class_(String var0, Class<T> var1, Predicate<T> var2) {
      return class_(var0, var1, Arrays.stream((Enum[])var1.getEnumConstants()).filter(var2).collect(Collectors.toList()));
   }

   public static <T extends Enum<T> & rpH_2> rCu_1<T> class_(String var0, Class<T> var1, T... var2) {
      return class_(var0, var1, Lists.newArrayList(var2));
   }

   public static <T extends Enum<T> & rpH_2> rCu_1<T> class_(String var0, Class<T> var1, Collection<T> var2) {
      return new rCu_1<>(var0, var1, var2);
   }

   @Override
   public Collection<T> class_() {
      return this.class_;
   }

   public String class_(T var1) {
      return ((rpH_2)var1).class_();
   }

   @Override
   public int break_() {
      int var1 = super.break_();
      var1 = 31 * var1 + this.class_.hashCode();
      return 31 * var1 + this.break_.hashCode();
   }

   @Override
   public Optional<T> break_(String var1) {
      return Optional.ofNullable(this.break_.get(var1));
   }
}
