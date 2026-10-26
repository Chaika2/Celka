package celestial;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class rlA_2 {
   private static final Map<rqO_2, rlF_2<?>> id_class = Maps.newHashMap();

   public static <T> rlF_2<T> id_class(rqO_2 var0, Function<rlQ_2, rlW_2<T>> var1) {
      rlF_2 var2 = new rlF_2(var1);
      rlF_2 var3 = id_class.putIfAbsent(var0, var2);
      if (var3 != null) {
         throw new IllegalStateException("Duplicate entry for static tag collection: " + var0);
      } else {
         return var2;
      }
   }

   public static void id_class(rlQ_2 var0) {
      id_class.values().forEach(var1 -> var1.id_class(var0));
   }

   public static void id_class() {
      id_class.values().forEach(rlF_2::id_class);
   }

   public static void id_break() {
      rlF_2[] var0 = new rlF_2[]{rls_3.id_class, rlc_3.id_class, rlG_2.id_class, rlE_2.id_class};
      boolean var1 = Stream.of(var0).anyMatch(var0x -> !id_class.containsValue(var0x));
      if (var1) {
         throw new IllegalStateException("Missing helper registrations");
      }
   }

   public static Multimap<rqO_2, rqO_2> id_break(rlQ_2 var0) {
      HashMultimap var1 = HashMultimap.create();
      id_class.forEach((var2, var3) -> var1.putAll(var2, var3.id_break(var0)));
      return var1;
   }
}
