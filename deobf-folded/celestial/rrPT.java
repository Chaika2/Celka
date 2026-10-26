package celestial;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class rrPT {
   private final List<rrPp_1> id_class;
   private final Map<xd_3, List<rrPp_1>> id_break = Maps.newHashMap();

   rrPT(List<rrPp_1> var1) {
      this.id_class = var1;
   }

   public List<rrPp_1> id_class(xd_3 var1) {
      return this.id_break
         .computeIfAbsent(var1, var1x -> this.id_class.stream().filter(var1xx -> var1xx.id_break.id_class(var1x)).collect(Collectors.toList()));
   }

   public List<rrPp_1> id_class() {
      return this.id_class;
   }
}
