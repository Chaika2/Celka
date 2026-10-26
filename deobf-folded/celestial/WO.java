package celestial;

public class WO extends zh_3 {
   protected WO(Jq_1 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.id_protected(var5);
      if (var7.id_break() == rdy_3.JJ) {
         if (!var2.id_continue) {
            rpr_3 var8 = var6.id_break();
            rpr_3 var9 = var8.id_final() == rpB_2.Y ? var4.Pg().id_case() : var8;
            var2.id_class((rhd_3)null, var3, rqn_3.XS, rqL_2.BLOCKS, 1.0F, 1.0F);
            var2.id_class(var3, xu_3.Br.id_continue().id_class(xy_3.id_volatile, var9), 11);
            rsE_2 var10 = new rsE_2(
               var2,
               (double)var3.b_() + 0.5 + (double)var9.id_implements() * 0.65,
               (double)var3.c_() + 0.1,
               (double)var3.d_() + 0.5 + (double)var9.id_extends() * 0.65,
               new rdn_3(rdy_3.Jk, 4)
            );
            var10.id_catch(
               0.05 * (double)var9.id_implements() + var2.id_int.nextDouble() * 0.02, 0.05, 0.05 * (double)var9.id_extends() + var2.id_int.nextDouble() * 0.02
            );
            var2.a_(var10);
            var7.id_class(1, var4, var1x -> var1x.id_byte(var5));
         }

         return ryZ_2.id_class(var2.id_continue);
      } else {
         return super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public zO_2 id_break() {
      return (zO_2)xu_3.Bo;
   }

   @Override
   public xr_3 id_implements() {
      return (xr_3)xu_3.BR;
   }
}
