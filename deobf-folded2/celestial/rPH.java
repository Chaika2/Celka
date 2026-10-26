package celestial;

import com.google.common.collect.ImmutableMap;

public class rPH extends rPm_1<rsq_3> {
   private final float id_class;
   private final int id_byte;

   public rPH(float var1, int var2) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.VALUE_ABSENT));
      this.id_class = var1;
      this.id_byte = var2;
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      rga_3 var5 = var1.d();
      int var6 = var5.id_class(rjh_3.id_class(var2.Bs()));
      rjU_2 var7 = null;

      for (int var8 = 0; var8 < 5; var8++) {
         rjU_2 var9 = iX_2.id_class(var2, 15, 7, var1x -> (double)(-var1.id_break(rjh_3.id_class(var1x))));
         if (var9 != null) {
            int var10 = var5.id_class(rjh_3.id_class(new rfH_2(var9)));
            if (var10 < var6) {
               var7 = var9;
               break;
            }

            if (var10 == var6) {
               var7 = var9;
            }
         }
      }

      if (var7 != null) {
         var2.SF().id_class(il_3.id_volatile, new iH_2(var7, this.id_class, this.id_byte));
      }
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      return !var1.id_throw(var2.Bs());
   }
}
