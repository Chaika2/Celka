package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Random;

public class rrV_2<E extends is_3> extends rPm_1<E> {
   private final int id_class;
   private final float id_byte;

   public rrV_2(int var1, float var2) {
      super(
         ImmutableMap.of(
            il_3.id_double, iC_2.VALUE_PRESENT, il_3.id_package, iC_2.VALUE_ABSENT, il_3.id_volatile, iC_2.VALUE_ABSENT, il_3.id_final, iC_2.REGISTERED
         )
      );
      this.id_class = var1;
      this.id_byte = var2;
   }

   private static rfH_2 id_class(is_3 var0) {
      return var0.SF().id_byte(il_3.id_double).get();
   }

   private static int id_class(Random var0) {
      return var0.nextInt(3) - 1;
   }

   private static rfH_2 id_class(is_3 var0, rfH_2 var1) {
      Random var2 = ((rYB)var0.id_throws[7]).id_int;
      return var1.id_break(id_class(var2), 0, id_class(var2));
   }

   protected void id_class(rrEm_1 var1, is_3 var2, long var3) {
      rfH_2 var5 = id_class(var2);
      boolean var6 = var5.id_class(var2.Bs(), (double)this.id_class);
      if (!var6) {
         iA_2.id_class(var2, id_class(var2, var5), this.id_byte, this.id_class);
      }
   }
}
