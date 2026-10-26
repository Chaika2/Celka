package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class rro_3 extends rPm_1<iB_2> {
   private final Predicate<iB_2> id_class;
   private final float id_byte;

   public rro_3(Predicate<iB_2> var1, float var2) {
      super(ImmutableMap.of(il_3.id_final, iC_2.VALUE_ABSENT, il_3.id_private, iC_2.VALUE_PRESENT));
      this.id_class = var1;
      this.id_byte = var2 * var2;
   }

   public rro_3(float var1) {
      this(var0 -> true, var1);
   }

   public rro_3(aI_2<?> var1, float var2) {
      this(var1x -> var1.equals(var1x.BC()), var2);
   }

   public rro_3(aH_2 var1, float var2) {
      this(var1x -> var1.equals(var1x.BC().id_throws()), var2);
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      return var2.SF().id_byte(il_3.id_private).get().stream().anyMatch(this.id_class);
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.id_byte(il_3.id_private)
         .ifPresent(
            var3x -> var3x.stream()
                  .filter(this.id_class)
                  .filter(var2xx -> var2xx.id_int(var2) <= (double)this.id_byte)
                  .findFirst()
                  .ifPresent(var1xx -> var5.id_class(il_3.id_final, new rfY_2(var1xx, true)))
         );
   }
}
