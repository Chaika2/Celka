package celestial;

import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fP_2 implements fB_2 {
   private final Iterable<? extends fB_2> id_byte;

   public fP_2(Iterable<? extends fB_2> var1) {
      this.id_byte = var1;
   }

   @Override
   public Predicate<xc_3> getPredicate(rCF<xd_3, xc_3> var1) {
      List var2 = Streams.stream(this.id_byte).map(var1x -> var1x.getPredicate(var1)).collect(Collectors.toList());
      return var1x -> var2.stream().allMatch(var1xx -> var1xx.test(var1x));
   }
}
