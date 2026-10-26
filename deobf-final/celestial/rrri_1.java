package celestial;

import com.mojang.serialization.Codec;

public class rrri_1 extends rrrZ<rUt_1> {
   public rrri_1(Codec<rUt_1> var1) {
      super(var1);
   }

   @Override
   public rrrv_1<rUt_1> class_() {
      return rrPr_1::new;
   }

   protected boolean class_(rKd_1 var1, rYY var2, long var3, rqm_3 var5, int var6, int var7, rYG var8, rfj_3 var9, rUt_1 var10) {
      for (rYG var12 : var2.class_(var6 * 16 + 9, var1.case_(), var7 * 16 + 9, 32)) {
         if (!var12.throws_().class_(this)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected boolean break_() {
      return false;
   }
}
