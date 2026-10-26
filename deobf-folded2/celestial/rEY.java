package celestial;

import java.util.Random;

public class rEY extends rbB_2 {
   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.EQ;
   }

   public rEY(aI_2<? extends rEY> var1, rYB var2) {
      super(var1, var2);
   }

   public static boolean id_class(aI_2<rEY> var0, rRf_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return id_break(var0, var1, var2, var3, var4) && (var2 == iO_2.SPAWNER || var1.id_case(var3));
   }

   @Override
   protected boolean sd() {
      return true;
   }

   @Override
   protected rdn_3 sx() {
      return rdn_3.id_break;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Ek;
   }

   @Override
   public boolean id_public(an_3 var1) {
      boolean var2 = super.id_public(var1);
      if (var2 && this.ss().id_class() && var1 instanceof iB_2) {
         float var3 = ((rYB)this.id_throws[7]).id_throws(this.Bs()).id_break();
         ((iB_2)var1).id_break(new rLY(rLD.id_new, 140 * (int)var3));
      }

      return var2;
   }

   @Override
   protected boolean R_() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Ez;
   }

   @Override
   protected rqA_2 sJ() {
      return rqn_3.EN;
   }

   @Override
   protected void sW() {
      this.id_break(aI_2.rs);
      if (!this.BF()) {
         ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1041, this.Bs(), 0);
      }
   }
}
