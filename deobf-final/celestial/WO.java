package celestial;

public class WO extends zh_3 {
   protected WO(Jq_1 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.protected_(var5);
      if (var7.break_() == rdy_3.JJ) {
         if (!var2.continue_) {
            rpr_3 var8 = var6.break_();
            rpr_3 var9 = var8.final_() == rpB_2.Y ? var4.Pg().case_() : var8;
            var2.class_((rhd_3)null, var3, rqn_3.XS, rqL_2.BLOCKS, 1.0F, 1.0F);
            var2.class_(var3, xu_3.Br.continue_().class_(xy_3.volatile_, var9), 11);
            rsE_2 var10 = new rsE_2(
               var2,
               (double)var3.b_() + 0.5 + (double)var9.implements_() * 0.65,
               (double)var3.c_() + 0.1,
               (double)var3.d_() + 0.5 + (double)var9.extends_() * 0.65,
               new rdn_3(rdy_3.Jk, 4)
            );
            var10.catch_(
               0.05 * (double)var9.implements_() + var2.int_.nextDouble() * 0.02, 0.05, 0.05 * (double)var9.extends_() + var2.int_.nextDouble() * 0.02
            );
            var2.a_(var10);
            var7.class_(1, var4, var1x -> var1x.byte_(var5));
         }

         return ryZ_2.class_(var2.continue_);
      } else {
         return super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public zO_2 break_() {
      return (zO_2)xu_3.Bo;
   }

   @Override
   public xr_3 implements_() {
      return (xr_3)xu_3.BR;
   }
}
