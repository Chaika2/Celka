package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.BiPredicate;

public class rrN_2 extends rPm_1<iB_2> {
   private final int id_class;
   private final BiPredicate<iB_2, iB_2> id_byte;

   public rrN_2(int var1, BiPredicate<iB_2, iB_2> var2) {
      super(
         ImmutableMap.of(
            il_3.id_package, iC_2.VALUE_PRESENT, il_3.id_short, iC_2.REGISTERED, il_3.id_double, iC_2.VALUE_ABSENT, il_3.id_switch, iC_2.REGISTERED
         )
      );
      this.id_class = var1;
      this.id_byte = var2;
   }

   private iB_2 id_class(iB_2 var1) {
      return var1.SF().id_byte(il_3.id_package).get();
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      return this.id_class(var2).Sl();
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      iB_2 var5 = this.id_class(var2);
      if (this.id_byte.test(var2, var5)) {
         var2.SF().id_class(il_3.id_switch, true, (long)this.id_class);
      }

      var2.SF().id_class(il_3.id_double, var5.Bs(), (long)this.id_class);
      if (var5.BC() != aI_2.rM || var1.B().id_break(rRu_1.id_abstract)) {
         var2.SF().id_break(il_3.id_package);
         var2.SF().id_break(il_3.id_short);
      }
   }
}
