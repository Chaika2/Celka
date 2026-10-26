package celestial;

import java.util.Random;

public class xs_3 extends dB_2 {
   public static final rCc_1 id_volatile = rCT.id_default;
   public static final rCN id_final = rCT.id_else;

   public xs_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH).id_class(id_final, Boolean.valueOf(false)));
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.id_this()) {
         ryO_2 var6 = var1.id_class(var2);
         if (var6 instanceof rHM) {
            ((rHM)var6).id_class(var5.id_continue());
         }
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         ryO_2 var7 = var2.id_class(var3);
         if (var7 instanceof rHM) {
            var4.id_class((rHM)var7);
            var4.id_break(rlB_2.m);
            rbW_2.id_class(var4, true);
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_volatile, var1.id_protected().id_case());
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHM();
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         ryO_2 var6 = var2.id_class(var3);
         if (var6 instanceof rXu_1) {
            rXn_1.id_class(var2, var3, (rXu_1)var6);
            var2.id_byte(var3, this);
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      ryO_2 var5 = var2.id_class(var3);
      if (var5 instanceof rHM) {
         ((rHM)var5).id_catch();
      }
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.id_class(var2.id_class(var3));
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }
}
