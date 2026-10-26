package celestial;

import com.mojang.serialization.Codec;

public class rrru_1 extends rrrZ<rUt_1> {
   public rrru_1(Codec<rUt_1> var1) {
      super(var1);
   }

   protected boolean id_class(rKd_1 var1, rYY var2, long var3, rqm_3 var5, int var6, int var7, rYG var8, rfj_3 var9, rUt_1 var10) {
      return var1.id_class(new rfj_3(var6, var7));
   }

   @Override
   public rrrv_1<rUt_1> id_class() {
      return rrrm_1::new;
   }
}
