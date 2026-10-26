package celestial;

import com.mojang.serialization.Codec;

public class raK_2 extends rrrZ<raI_2> {
   public raK_2(Codec<raI_2> var1) {
      super(var1);
   }

   @Override
   public rrrv_1<raI_2> class_() {
      return raD_2::new;
   }

   protected boolean class_(rKd_1 var1, rYY var2, long var3, rqm_3 var5, int var6, int var7, rYG var8, rfj_3 var9, raI_2 var10) {
      var5.byte_(var3, var6, var7);
      double var11 = (double)var10.break_;
      return var5.nextDouble() < var11;
   }
}
