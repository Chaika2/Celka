package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface rgS_2 {
   Optional<rqg_3> class_ = Optional.of(rqg_3.INSTANCE);
   rgS_2 break_ = new rgs_3();

   static rgS_2 class_(rgS_2... var0) {
      return class_(ImmutableList.copyOf(var0));
   }

   static rgS_2 class_(List<rgS_2> var0) {
      return new rgb_3(var0);
   }

   <T> Optional<T> class_(rgO_2<T> var1);

   <T> Optional<T> class_(rgM_2<T> var1, rgc_3 var2);

   static rgS_2 class_(String var0, rgc_3 var1) {
      return new rgG_2(var0, var1);
   }

   default String getString() {
      StringBuilder var1 = new StringBuilder();
      this.class_(var1x -> {
         var1.append(var1x);
         return Optional.empty();
      });
      return var1.toString();
   }

   static rgS_2 protected_(String var0) {
      return new rgE_2(var0);
   }
}
