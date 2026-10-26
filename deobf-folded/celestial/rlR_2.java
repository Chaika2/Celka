package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class rlR_2 {
   private static final Collection<rlj_3> id_class = Lists.newArrayList();
   private static final Set<String> id_break = Sets.newHashSet();
   private static final Map<String, Consumer<rrEm_1>> id_byte = Maps.newHashMap();
   private static final Collection<rlj_3> id_protected = Sets.newHashSet();

   public static Consumer<rrEm_1> id_byte(String var0) {
      return id_byte.get(var0);
   }

   public static Collection<rlj_3> id_byte() {
      return id_protected;
   }

   public static void id_class(rlj_3 var0) {
      id_protected.add(var0);
   }

   private static boolean id_class(rlj_3 var0, String var1) {
      return var0.id_class().toLowerCase().startsWith(var1.toLowerCase() + ".");
   }

   public static Collection<rlj_3> id_class() {
      return id_class;
   }

   public static Collection<rlj_3> id_class(String var0) {
      return id_class.stream().filter(var1 -> id_class(var1, var0)).collect(Collectors.toList());
   }

   public static boolean id_break(String var0) {
      return id_break.contains(var0);
   }

   public static Collection<String> id_break() {
      return id_break;
   }

   public static rlj_3 id_throws(String var0) {
      Optional var1 = id_protected(var0);
      if (!var1.isPresent()) {
         throw new IllegalArgumentException("Can't find the test function for " + var0);
      } else {
         return (rlj_3)var1.get();
      }
   }

   public static void id_protected() {
      id_protected.clear();
   }

   public static Optional<rlj_3> id_protected(String var0) {
      return id_class().stream().filter(var1 -> var1.id_class().equalsIgnoreCase(var0)).findFirst();
   }
}
