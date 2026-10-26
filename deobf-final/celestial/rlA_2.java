package celestial;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class rlA_2 {
   private static final Map<rqO_2, rlF_2<?>> class_ = Maps.newHashMap();

   public static <T> rlF_2<T> class_(rqO_2 var0, Function<rlQ_2, rlW_2<T>> var1) {
      rlF_2 var2 = new rlF_2(var1);
      rlF_2 var3 = class_.putIfAbsent(var0, var2);
      if (var3 != null) {
         throw new IllegalStateException("Duplicate entry for static tag collection: " + var0);
      } else {
         return var2;
      }
   }

   public static void class_(rlQ_2 var0) {
      class_.values().forEach(var1 -> var1.class_(var0));
   }

   public static void class_() {
      class_.values().forEach(rlF_2::class_);
   }

   public static void break_() {
      rlF_2[] var0 = new rlF_2[]{rls_3.class_, rlc_3.class_, rlG_2.class_, rlE_2.class_};
      boolean var1 = Stream.of(var0).anyMatch(var0x -> !class_.containsValue(var0x));
      if (var1) {
         throw new IllegalStateException("Missing helper registrations");
      }
   }

   public static Multimap<rqO_2, rqO_2> break_(rlQ_2 var0) {
      HashMultimap var1 = HashMultimap.create();
      class_.forEach((var2, var3) -> var1.putAll(var2, var3.break_(var0)));
      return var1;
   }
}
