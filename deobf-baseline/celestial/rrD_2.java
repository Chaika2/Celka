package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.Random;

public class rrD_2 extends rPm_1<iB_2> {
   private final float id_class;

   public rrD_2(float var1) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.VALUE_ABSENT));
      this.id_class = var1;
   }

   public static boolean id_class(rrEm_1 var0, iB_2 var1, rfH_2 var2) {
      return var0.id_case(var2) && (double)var0.id_class(rKv_1.MOTION_BLOCKING, var2).c_() <= var1.re();
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      return !var1.id_case(var2.Bs());
   }

   private rjU_2 id_break(rrEm_1 var1, iB_2 var2) {
      Random var3 = var2.Sa();
      rfH_2 var4 = var2.Bs();

      for (int var5 = 0; var5 < 10; var5++) {
         rfH_2 var6 = var4.id_break(var3.nextInt(20) - 10, var3.nextInt(6) - 3, var3.nextInt(20) - 10);
         if (id_class(var1, var2, var6)) {
            return rjU_2.id_protected(var6);
         }
      }

      return null;
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      Optional var5 = Optional.ofNullable(this.id_break(var1, var2));
      if (var5.isPresent()) {
         var2.SF().id_class(il_3.id_volatile, var5.map(var1x -> new iH_2(var1x, this.id_class, 0)));
      }
   }
}
