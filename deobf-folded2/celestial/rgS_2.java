package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface rgS_2 {
   Optional<rqg_3> id_class = Optional.of(rqg_3.INSTANCE);
   rgS_2 id_break = new rgs_3();

   static rgS_2 id_class(rgS_2... var0) {
      return id_class(ImmutableList.copyOf(var0));
   }

   static rgS_2 id_class(List<rgS_2> var0) {
      return new rgb_3(var0);
   }

   <T> Optional<T> id_class(rgO_2<T> var1);

   <T> Optional<T> id_class(rgM_2<T> var1, rgc_3 var2);

   static rgS_2 id_class(String var0, rgc_3 var1) {
      return new rgG_2(var0, var1);
   }

   default String getString() {
      StringBuilder var1 = new StringBuilder();
      this.id_class(var1x -> {
         var1.append(var1x);
         return Optional.empty();
      });
      return var1.toString();
   }

   static rgS_2 id_protected(String var0) {
      return new rgE_2(var0);
   }
}
