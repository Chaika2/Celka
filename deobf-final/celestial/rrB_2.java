package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class rrB_2 extends rrr_3<iB_2> {
   private List<iB_2> byte_(iB_2 var1) {
      return var1.SF().byte_(il_3.private_).orElse(Lists.newArrayList());
   }

   private List<iB_2> class_(iB_2 var1) {
      return this.byte_(var1).stream().filter(this::break_).collect(Collectors.toList());
   }

   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.implements_);
   }

   @Override
   protected void class_(rrEm_1 var1, iB_2 var2) {
      var2.SF().class_(il_3.implements_, this.class_(var2));
   }

   private boolean break_(iB_2 var1) {
      return var1.BC() == aI_2.D && var1.n_();
   }
}
