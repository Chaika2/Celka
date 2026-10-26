package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrH_2 extends rPm_1<aA_2> {
   private final float id_class;
   private final int id_byte;
   private final int id_protected;

   public rrH_2(float var1) {
      this(var1, 10, 7);
   }

   public rrH_2(float var1, int var2, int var3) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.VALUE_ABSENT));
      this.id_class = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   private void id_class(aA_2 var1) {
      Optional var2 = Optional.ofNullable(iX_2.id_break(var1, this.id_byte, this.id_protected));
      var1.SF().id_class(il_3.id_volatile, var2.map(var1x -> new iH_2(var1x, this.id_class, 0)));
   }

   protected void id_class(rrEm_1 var1, aA_2 var2, long var3) {
      rfH_2 var5 = var2.Bs();
      if (var1.id_throw(var5)) {
         this.id_class(var2);
      } else {
         rjh_3 var6 = rjh_3.id_class(var5);
         rjh_3 var7 = iA_2.id_class(var1, var6, 2);
         if (var7 != var6) {
            this.id_class(var2, var7);
         } else {
            this.id_class(var2);
         }
      }
   }

   private void id_class(aA_2 var1, rjh_3 var2) {
      Optional var3 = Optional.ofNullable(iX_2.id_break(var1, this.id_byte, this.id_protected, rjU_2.id_protected(var2.id_int())));
      var1.SF().id_class(il_3.id_volatile, var3.map(var1x -> new iH_2(var1x, this.id_class, 0)));
   }
}
