package celestial;

public class rEX extends rGw_1 {
   public rEX(aI_2<? extends rEX> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      return var4;
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 0.45F;
   }

   public static iz_3 id_throws() {
      return rGw_1.L().id_class(iQ_2.id_class, 12.0);
   }

   @Override
   public boolean id_public(an_3 var1) {
      if (super.id_public(var1)) {
         if (var1 instanceof iB_2) {
            byte var2 = 0;
            if (((rYB)this.id_throws[7]).id_abstract() == rRO.NORMAL) {
               var2 = 7;
            } else if (((rYB)this.id_throws[7]).id_abstract() == rRO.HARD) {
               var2 = 15;
            }

            if (var2 > 0) {
               ((iB_2)var1).id_break(new rLY(rLD.id_super, var2 * 20, 0));
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
