package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class io_3 extends rrr_3<au_3> {
   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.void_, il_3.private_);
   }

   protected void class_(rrEm_1 var1, au_3 var2) {
      var2.SF().byte_(il_3.private_).ifPresent(var2x -> this.class_(var2, (List<iB_2>)var2x));
   }

   private void class_(au_3 var1, List<iB_2> var2) {
      Optional var3 = var2.stream().filter(var1x -> var1x.BC() == var1.BC()).map(var0 -> (au_3)var0).filter(var0 -> !var0.n_()).findFirst();
      var1.SF().class_(il_3.void_, var3);
   }
}
