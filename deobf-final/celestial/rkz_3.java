package celestial;

import java.util.List;

public class rkz_3 extends rxb_3 {
   public rkz_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rAB.class_(var1, var3, 0.125F);
   }

   @Override
   public void class_(rdX_2 var1, rqs_3<rdn_3> var2) {
      if (this.class_(var1)) {
         for (rLi_1 var4 : rVL.double_) {
            if (!var4.class_().isEmpty()) {
               var2.add(rAB.class_(new rdn_3(this), var4));
            }
         }
      }
   }

   @Override
   public String case_(rdn_3 var1) {
      return rAB.protected_(var1).break_(this.break_() + ".effect.");
   }

   @Override
   public rdn_3 continue_() {
      return rAB.class_(super.continue_(), rAS.interface_);
   }
}
