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
   private final ImmutableSet<T> id_class;
   private final Map<String, T> id_break = Maps.newHashMap();

   protected rCu_1(String var1, Class<T> var2, Collection<T> var3) {
      super(var1, var2);
      this.id_class = ImmutableSet.copyOf(var3);

      for (Enum var5 : var3) {
         String var6 = ((rpH_2)var5).id_class();
         if (this.id_break.containsKey(var6)) {
            throw new IllegalArgumentException("Multiple values have the same name '" + var6 + "'");
         }

         this.id_break.put(var6, (T)var5);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rCu_1 && super.equals(var1)) {
         rCu_1 var2 = (rCu_1)var1;
         return this.id_class.equals(var2.id_class) && this.id_break.equals(var2.id_break);
      } else {
         return false;
      }
   }

   public static <T extends Enum<T> & rpH_2> rCu_1<T> id_class(String var0, Class<T> var1) {
      return id_class(var0, var1, Predicates.alwaysTrue());
   }

   public static <T extends Enum<T> & rpH_2> rCu_1<T> id_class(String var0, Class<T> var1, Predicate<T> var2) {
      return id_class(var0, var1, Arrays.stream((Enum[])var1.getEnumConstants()).filter(var2).collect(Collectors.toList()));
   }

   public static <T extends Enum<T> & rpH_2> rCu_1<T> id_class(String var0, Class<T> var1, T... var2) {
      return id_class(var0, var1, Lists.newArrayList(var2));
   }

   public static <T extends Enum<T> & rpH_2> rCu_1<T> id_class(String var0, Class<T> var1, Collection<T> var2) {
      return new rCu_1<>(var0, var1, var2);
   }

   @Override
   public Collection<T> id_class() {
      return this.id_class;
   }

   public String id_class(T var1) {
      return ((rpH_2)var1).id_class();
   }

   @Override
   public int id_break() {
      int var1 = super.id_break();
      var1 = 31 * var1 + this.id_class.hashCode();
      return 31 * var1 + this.id_break.hashCode();
   }

   @Override
   public Optional<T> id_break(String var1) {
      return Optional.ofNullable(this.id_break.get(var1));
   }
}
