package celestial;

import java.util.Random;

public class xZ_2 extends dB_2 {
   public static final rCN[] id_volatile = new rCN[]{rCT.id_extends, rCT.id_native, rCT.id_volatile};
   protected static final rjC_2 id_final = rjw_3.id_class(xd_3.id_class(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), xd_3.id_class(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   public xZ_2(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile[0], Boolean.valueOf(false))
            .id_class(id_volatile[1], Boolean.valueOf(false))
            .id_class(id_volatile[2], Boolean.valueOf(false))
      );
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      double var5 = (double)var3.b_() + 0.4 + (double)var4.nextFloat() * 0.2;
      double var7 = (double)var3.c_() + 0.7 + (double)var4.nextFloat() * 0.3;
      double var9 = (double)var3.d_() + 0.4 + (double)var4.nextFloat() * 0.2;
      var2.id_class(rLQ.id_double, var5, var7, var9, 0.0, 0.0, 0.0);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile[0], id_volatile[1], id_volatile[2]);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHQ();
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final;
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         ryO_2 var7 = var2.id_class(var3);
         if (var7 instanceof rHQ) {
            var4.id_class((rHQ)var7);
            var4.id_break(rlB_2.E);
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.id_this()) {
         ryO_2 var6 = var1.id_class(var2);
         if (var6 instanceof rHQ) {
            ((rHQ)var6).id_class(var5.id_continue());
         }
      }
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         ryO_2 var6 = var2.id_class(var3);
         if (var6 instanceof rHQ) {
            rXn_1.id_class(var2, var3, (rHQ)var6);
         }

         super.id_break(var1, var2, var3, var4, var5);
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
