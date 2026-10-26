package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class raZ_2 extends rrrZ<rUt_1> {
   private static final List<rYf_1> else_ = ImmutableList.of(
      new rYf_1(aI_2.case_, 10, 2, 3), new rYf_1(aI_2.rb, 5, 4, 4), new rYf_1(aI_2.rr, 8, 5, 5), new rYf_1(aI_2.A, 2, 5, 5), new rYf_1(aI_2.double_, 3, 4, 4)
   );

   @Override
   public List<rYf_1> byte_() {
      return else_;
   }

   public raZ_2(Codec<rUt_1> var1) {
      super(var1);
   }

   @Override
   public rrrv_1<rUt_1> class_() {
      return rav_3::new;
   }

   protected boolean class_(rKd_1 var1, rYY var2, long var3, rqm_3 var5, int var6, int var7, rYG var8, rfj_3 var9, rUt_1 var10) {
      return var5.nextInt(5) < 2;
   }
}
