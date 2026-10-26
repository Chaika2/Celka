package celestial;

import com.mojang.serialization.Codec;

public class rrri_1 extends rrrZ<rUt_1> {
   public rrri_1(Codec<rUt_1> var1) {
      super(var1);
   }

   @Override
   public rrrv_1<rUt_1> id_class() {
      return rrPr_1::new;
   }

   protected boolean id_class(rKd_1 var1, rYY var2, long var3, rqm_3 var5, int var6, int var7, rYG var8, rfj_3 var9, rUt_1 var10) {
      for (rYG var12 : var2.id_class(var6 * 16 + 9, var1.id_case(), var7 * 16 + 9, 32)) {
         if (!var12.id_throws().id_class(this)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected boolean id_break() {
      return false;
   }
}
