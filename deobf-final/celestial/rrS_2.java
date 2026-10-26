package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class rrS_2 extends rrr_3<iB_2> {
   private static final ImmutableMap<aI_2<?>, Float> class_ = ImmutableMap.builder()
      .put(aI_2.new_, 8.0F)
      .put(aI_2.return_, 12.0F)
      .put(aI_2.void_, 8.0F)
      .put(aI_2.static_, 12.0F)
      .put(aI_2.W, 15.0F)
      .put(aI_2.u, 12.0F)
      .put(aI_2.K, 8.0F)
      .put(aI_2.U, 10.0F)
      .put(aI_2.rS, 10.0F)
      .put(aI_2.rs, 8.0F)
      .put(aI_2.rG, 8.0F)
      .build();

   private boolean byte_(iB_2 var1) {
      return class_.containsKey(var1.BC());
   }

   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.try_);
   }

   @Override
   protected void class_(rrEm_1 var1, iB_2 var2) {
      var2.SF().class_(il_3.try_, this.class_(var2));
   }

   private Optional<iB_2> class_(iB_2 var1) {
      return this.break_(var1)
         .flatMap(var2 -> var2.stream().filter(this::byte_).filter(var2x -> this.break_(var1, var2x)).min((var2x, var3) -> this.class_(var1, var2x, var3)));
   }

   private int class_(iB_2 var1, iB_2 var2, iB_2 var3) {
      return rfU_2.byte_(var2.int_(var1) - var3.int_(var1));
   }

   private boolean break_(iB_2 var1, iB_2 var2) {
      float var3 = (Float)class_.get(var2.BC());
      return var2.int_(var1) <= (double)(var3 * var3);
   }

   private Optional<List<iB_2>> break_(iB_2 var1) {
      return var1.SF().byte_(il_3.private_);
   }
}
