package celestial;

import java.util.List;
import java.util.Random;

public class riK_2 {
   static final rfH_2 class_ = new rfH_2(4, 0, 15);
   private static final rqO_2[] break_ = new rqO_2[]{
      new rqO_2("shipwreck/with_mast"),
      new rqO_2("shipwreck/sideways_full"),
      new rqO_2("shipwreck/sideways_fronthalf"),
      new rqO_2("shipwreck/sideways_backhalf"),
      new rqO_2("shipwreck/rightsideup_full"),
      new rqO_2("shipwreck/rightsideup_fronthalf"),
      new rqO_2("shipwreck/rightsideup_backhalf"),
      new rqO_2("shipwreck/with_mast_degraded"),
      new rqO_2("shipwreck/rightsideup_full_degraded"),
      new rqO_2("shipwreck/rightsideup_fronthalf_degraded"),
      new rqO_2("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final rqO_2[] byte_ = new rqO_2[]{
      new rqO_2("shipwreck/with_mast"),
      new rqO_2("shipwreck/upsidedown_full"),
      new rqO_2("shipwreck/upsidedown_fronthalf"),
      new rqO_2("shipwreck/upsidedown_backhalf"),
      new rqO_2("shipwreck/sideways_full"),
      new rqO_2("shipwreck/sideways_fronthalf"),
      new rqO_2("shipwreck/sideways_backhalf"),
      new rqO_2("shipwreck/rightsideup_full"),
      new rqO_2("shipwreck/rightsideup_fronthalf"),
      new rqO_2("shipwreck/rightsideup_backhalf"),
      new rqO_2("shipwreck/with_mast_degraded"),
      new rqO_2("shipwreck/upsidedown_full_degraded"),
      new rqO_2("shipwreck/upsidedown_fronthalf_degraded"),
      new rqO_2("shipwreck/upsidedown_backhalf_degraded"),
      new rqO_2("shipwreck/sideways_full_degraded"),
      new rqO_2("shipwreck/sideways_fronthalf_degraded"),
      new rqO_2("shipwreck/sideways_backhalf_degraded"),
      new rqO_2("shipwreck/rightsideup_full_degraded"),
      new rqO_2("shipwreck/rightsideup_fronthalf_degraded"),
      new rqO_2("shipwreck/rightsideup_backhalf_degraded")
   };

   public static void class_(rrPt_1 var0, rfH_2 var1, rqd_3 var2, List<rrrn_1> var3, Random var4, rio_3 var5) {
      rqO_2 var6 = rqR_2.class_(var5.break_ ? break_ : byte_, var4);
      var3.add(new riD_2(var0, var6, var1, var2, var5.break_));
   }
}
