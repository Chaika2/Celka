package celestial;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class rCc_1 extends rCu_1<rpr_3> {
   protected rCc_1(String var1, Collection<rpr_3> var2) {
      super(var1, rpr_3.class, var2);
   }

   public static rCc_1 class_(String var0, Collection<rpr_3> var1) {
      return new rCc_1(var0, var1);
   }

   public static rCc_1 class_(String var0, rpr_3... var1) {
      return class_(var0, Lists.newArrayList(var1));
   }

   public static rCc_1 class_(String var0, Predicate<rpr_3> var1) {
      return class_(var0, Arrays.stream(rpr_3.values()).filter(var1).collect(Collectors.toList()));
   }
}
