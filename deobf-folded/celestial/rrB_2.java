package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class rrB_2 extends rrr_3<iB_2> {
   private List<iB_2> id_byte(iB_2 var1) {
      return var1.SF().id_byte(il_3.id_private).orElse(Lists.newArrayList());
   }

   private List<iB_2> id_class(iB_2 var1) {
      return this.id_byte(var1).stream().filter(this::id_break).collect(Collectors.toList());
   }

   @Override
   public Set<il_3<?>> id_class() {
      return ImmutableSet.of(il_3.id_implements);
   }

   @Override
   protected void id_class(rrEm_1 var1, iB_2 var2) {
      var2.SF().id_class(il_3.id_implements, this.id_class(var2));
   }

   private boolean id_break(iB_2 var1) {
      return var1.BC() == aI_2.D && var1.n_();
   }
}
