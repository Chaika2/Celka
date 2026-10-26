package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class rrS_2 extends rrr_3<iB_2> {
   private static final ImmutableMap<aI_2<?>, Float> id_class = ImmutableMap.builder()
      .put(aI_2.id_new, 8.0F)
      .put(aI_2.id_return, 12.0F)
      .put(aI_2.id_void, 8.0F)
      .put(aI_2.id_static, 12.0F)
      .put(aI_2.W, 15.0F)
      .put(aI_2.u, 12.0F)
      .put(aI_2.K, 8.0F)
      .put(aI_2.U, 10.0F)
      .put(aI_2.rS, 10.0F)
      .put(aI_2.rs, 8.0F)
      .put(aI_2.rG, 8.0F)
      .build();

   private boolean id_byte(iB_2 var1) {
      return id_class.containsKey(var1.BC());
   }

   @Override
   public Set<il_3<?>> id_class() {
      return ImmutableSet.of(il_3.id_try);
   }

   @Override
   protected void id_class(rrEm_1 var1, iB_2 var2) {
      var2.SF().id_class(il_3.id_try, this.id_class(var2));
   }

   private Optional<iB_2> id_class(iB_2 var1) {
      return this.id_break(var1)
         .flatMap(
            var2 -> var2.stream().filter(this::id_byte).filter(var2x -> this.id_break(var1, var2x)).min((var2x, var3) -> this.id_class(var1, var2x, var3))
         );
   }

   private int id_class(iB_2 var1, iB_2 var2, iB_2 var3) {
      return rfU_2.id_byte(var2.id_int(var1) - var3.id_int(var1));
   }

   private boolean id_break(iB_2 var1, iB_2 var2) {
      float var3 = (Float)id_class.get(var2.BC());
      return var2.id_int(var1) <= (double)(var3 * var3);
   }

   private Optional<List<iB_2>> id_break(iB_2 var1) {
      return var1.SF().id_byte(il_3.id_private);
   }
}
