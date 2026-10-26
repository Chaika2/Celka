package celestial;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class rrPT {
   private final List<rrPp_1> class_;
   private final Map<xd_3, List<rrPp_1>> break_ = Maps.newHashMap();

   rrPT(List<rrPp_1> var1) {
      this.class_ = var1;
   }

   public List<rrPp_1> class_(xd_3 var1) {
      return this.break_.computeIfAbsent(var1, var1x -> this.class_.stream().filter(var1xx -> var1xx.break_.class_(var1x)).collect(Collectors.toList()));
   }

   public List<rrPp_1> class_() {
      return this.class_;
   }
}
