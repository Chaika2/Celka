package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class rro_3 extends rPm_1<iB_2> {
   private final Predicate<iB_2> class_;
   private final float byte_;

   public rro_3(Predicate<iB_2> var1, float var2) {
      super(ImmutableMap.of(il_3.final_, iC_2.VALUE_ABSENT, il_3.private_, iC_2.VALUE_PRESENT));
      this.class_ = var1;
      this.byte_ = var2 * var2;
   }

   public rro_3(float var1) {
      this(var0 -> true, var1);
   }

   public rro_3(aI_2<?> var1, float var2) {
      this(var1x -> var1.equals(var1x.BC()), var2);
   }

   public rro_3(aH_2 var1, float var2) {
      this(var1x -> var1.equals(var1x.BC().throws_()), var2);
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2) {
      return var2.SF().byte_(il_3.private_).get().stream().anyMatch(this.class_);
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.byte_(il_3.private_)
         .ifPresent(
            var3x -> var3x.stream()
                  .filter(this.class_)
                  .filter(var2xx -> var2xx.int_(var2) <= (double)this.byte_)
                  .findFirst()
                  .ifPresent(var1xx -> var5.class_(il_3.final_, new rfY_2(var1xx, true)))
         );
   }
}
