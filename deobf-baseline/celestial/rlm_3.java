package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class rlm_3<T> implements rlb_3<T> {
   private final ImmutableList<T> id_break;
   private final Set<T> id_byte;
   protected final Class<?> id_class;

   private static <T> Class<?> id_byte(Set<T> var0) {
      if (var0.isEmpty()) {
         return Void.class;
      } else {
         Class var1 = null;

         for (Object var3 : var0) {
            if (var1 == null) {
               var1 = var3.getClass();
            } else {
               var1 = id_class(var1, var3.getClass());
            }
         }

         return var1;
      }
   }

   protected rlm_3(Set<T> var1, Class<?> var2) {
      this.id_class = var2;
      this.id_byte = var1;
      this.id_break = ImmutableList.copyOf(var1);
   }

   private static Class<?> id_class(Class<?> var0, Class<?> var1) {
      while (!var0.isAssignableFrom(var1)) {
         var0 = var0.getSuperclass();
      }

      return var0;
   }

   @Override
   public List<T> id_class() {
      return this.id_break;
   }

   @Override
   public boolean id_class(T var1) {
      return this.id_class.isInstance(var1) && this.id_byte.contains(var1);
   }

   public static <T> rlm_3<T> id_break(Set<T> var0) {
      return new rlm_3<>(var0, id_byte(var0));
   }

   public static <T> rlm_3<T> id_break() {
      return new rlm_3<>(ImmutableSet.of(), Void.class);
   }
}
