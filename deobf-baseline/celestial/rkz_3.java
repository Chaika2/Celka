package celestial;

import java.util.List;

public class rkz_3 extends rxb_3 {
   public rkz_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rAB.id_class(var1, var3, 0.125F);
   }

   @Override
   public void id_class(rdX_2 var1, rqs_3<rdn_3> var2) {
      if (this.id_class(var1)) {
         for (rLi_1 var4 : rVL.id_double) {
            if (!var4.id_class().isEmpty()) {
               var2.add(rAB.id_class(new rdn_3(this), var4));
            }
         }
      }
   }

   @Override
   public String id_case(rdn_3 var1) {
      return rAB.id_protected(var1).id_break(this.id_break() + ".effect.");
   }

   @Override
   public rdn_3 id_continue() {
      return rAB.id_class(super.id_continue(), rAS.id_interface);
   }
}
