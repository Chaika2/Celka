package celestial;

import java.util.List;

public class rdt_3 extends rkk_3 {
   public rdt_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rAB.id_class(var1, var3, 0.25F);
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      var1.id_class((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.Gh, rqL_2.NEUTRAL, 0.5F, 0.4F / (id_private.nextFloat() * 0.4F + 0.8F));
      return super.id_class(var1, var2, var3);
   }
}
