package celestial;

public class rEX extends rGw_1 {
   public rEX(aI_2<? extends rEX> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      return var4;
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 0.45F;
   }

   public static iz_3 throws_() {
      return rGw_1.L().class_(iQ_2.class_, 12.0);
   }

   @Override
   public boolean public_(an_3 var1) {
      if (super.public_(var1)) {
         if (var1 instanceof iB_2) {
            byte var2 = 0;
            if (((rYB)this.throws_[7]).abstract_() == rRO.NORMAL) {
               var2 = 7;
            } else if (((rYB)this.throws_[7]).abstract_() == rRO.HARD) {
               var2 = 15;
            }

            if (var2 > 0) {
               ((iB_2)var1).break_(new rLY(rLD.super_, var2 * 20, 0));
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
