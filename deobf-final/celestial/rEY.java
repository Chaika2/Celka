package celestial;

import java.util.Random;

public class rEY extends rbB_2 {
   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.EQ;
   }

   public rEY(aI_2<? extends rEY> var1, rYB var2) {
      super(var1, var2);
   }

   public static boolean class_(aI_2<rEY> var0, rRf_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return break_(var0, var1, var2, var3, var4) && (var2 == iO_2.SPAWNER || var1.case_(var3));
   }

   @Override
   protected boolean sd() {
      return true;
   }

   @Override
   protected rdn_3 sx() {
      return rdn_3.break_;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Ek;
   }

   @Override
   public boolean public_(an_3 var1) {
      boolean var2 = super.public_(var1);
      if (var2 && this.ss().class_() && var1 instanceof iB_2) {
         float var3 = ((rYB)this.throws_[7]).throws_(this.Bs()).break_();
         ((iB_2)var1).break_(new rLY(rLD.new_, 140 * (int)var3));
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
      this.break_(aI_2.rs);
      if (!this.BF()) {
         ((rYB)this.throws_[7]).class_((rhd_3)null, 1041, this.Bs(), 0);
      }
   }
}
