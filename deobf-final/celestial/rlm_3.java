package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class rlm_3<T> implements rlb_3<T> {
   private final ImmutableList<T> break_;
   private final Set<T> byte_;
   protected final Class<?> class_;

   private static <T> Class<?> byte_(Set<T> var0) {
      if (var0.isEmpty()) {
         return Void.class;
      } else {
         Class var1 = null;

         for (Object var3 : var0) {
            if (var1 == null) {
               var1 = var3.getClass();
            } else {
               var1 = class_(var1, var3.getClass());
            }
         }

         return var1;
      }
   }

   protected rlm_3(Set<T> var1, Class<?> var2) {
      this.class_ = var2;
      this.byte_ = var1;
      this.break_ = ImmutableList.copyOf(var1);
   }

   private static Class<?> class_(Class<?> var0, Class<?> var1) {
      while (!var0.isAssignableFrom(var1)) {
         var0 = var0.getSuperclass();
      }

      return var0;
   }

   @Override
   public List<T> class_() {
      return this.break_;
   }

   @Override
   public boolean class_(T var1) {
      return this.class_.isInstance(var1) && this.byte_.contains(var1);
   }

   public static <T> rlm_3<T> break_(Set<T> var0) {
      return new rlm_3<>(var0, byte_(var0));
   }

   public static <T> rlm_3<T> break_() {
      return new rlm_3<>(ImmutableSet.of(), Void.class);
   }
}
