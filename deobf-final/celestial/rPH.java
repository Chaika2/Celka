package celestial;

import com.google.common.collect.ImmutableMap;

public class rPH extends rPm_1<rsq_3> {
   private final float class_;
   private final int byte_;

   public rPH(float var1, int var2) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.VALUE_ABSENT));
      this.class_ = var1;
      this.byte_ = var2;
   }

   protected void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      rga_3 var5 = var1.d();
      int var6 = var5.class_(rjh_3.class_(var2.Bs()));
      rjU_2 var7 = null;

      for (int var8 = 0; var8 < 5; var8++) {
         rjU_2 var9 = iX_2.class_(var2, 15, 7, var1x -> (double)(-var1.break_(rjh_3.class_(var1x))));
         if (var9 != null) {
            int var10 = var5.class_(rjh_3.class_(new rfH_2(var9)));
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
         var2.SF().class_(il_3.volatile_, new iH_2(var7, this.class_, this.byte_));
      }
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      return !var1.throw_(var2.Bs());
   }
}
