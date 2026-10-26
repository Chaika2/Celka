package celestial;

import java.util.Random;

public class rGV extends rEb_1 {
   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.dP;
   }

   public rGV(aI_2<? extends rGV> var1, rYB var2) {
      super(var1, var2);
   }

   public static boolean class_(aI_2<rGV> var0, rRf_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return break_(var0, var1, var2, var3, var4) && (var2 == iO_2.SPAWNER || var1.case_(var3));
   }

   @Override
   protected rhm_3 break_(rdn_3 var1, float var2) {
      rhm_3 var3 = super.break_(var1, var2);
      if (var3 instanceof rhF_2) {
         ((rhF_2)var3).class_(new rLY(rLD.break_, 600));
      }

      return var3;
   }

   @Override
   rqA_2 L() {
      return rqn_3.dB;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.xi;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.dr;
   }
}
