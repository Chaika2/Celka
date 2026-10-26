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
   private static final Collection<rlj_3> class_ = Lists.newArrayList();
   private static final Set<String> break_ = Sets.newHashSet();
   private static final Map<String, Consumer<rrEm_1>> byte_ = Maps.newHashMap();
   private static final Collection<rlj_3> protected_ = Sets.newHashSet();

   public static Consumer<rrEm_1> byte_(String var0) {
      return byte_.get(var0);
   }

   public static Collection<rlj_3> byte_() {
      return protected_;
   }

   public static void class_(rlj_3 var0) {
      protected_.add(var0);
   }

   private static boolean class_(rlj_3 var0, String var1) {
      return var0.class_().toLowerCase().startsWith(var1.toLowerCase() + ".");
   }

   public static Collection<rlj_3> class_() {
      return class_;
   }

   public static Collection<rlj_3> class_(String var0) {
      return class_.stream().filter(var1 -> class_(var1, var0)).collect(Collectors.toList());
   }

   public static boolean break_(String var0) {
      return break_.contains(var0);
   }

   public static Collection<String> break_() {
      return break_;
   }

   public static rlj_3 throws_(String var0) {
      Optional var1 = protected_(var0);
      if (!var1.isPresent()) {
         throw new IllegalArgumentException("Can't find the test function for " + var0);
      } else {
         return (rlj_3)var1.get();
      }
   }

   public static void protected_() {
      protected_.clear();
   }

   public static Optional<rlj_3> protected_(String var0) {
      return class_().stream().filter(var1 -> var1.class_().equalsIgnoreCase(var0)).findFirst();
   }
}
