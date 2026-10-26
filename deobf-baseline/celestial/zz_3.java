package celestial;

import java.util.Random;

public class zz_3 extends xF_2 implements kX_2 {
   public static final rCm_1 id_volatile = rCT.J;
   private static final rjC_2 id_final = xd_3.id_class(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final rjC_2 id_package = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public zz_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var3.id_byte(id_volatile) < 3;
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      int var5 = Math.min(3, var4.id_byte(id_volatile) + 1);
      var1.id_class(var3, var4.id_class(id_volatile, Integer.valueOf(var5)), 2);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      int var7 = var1.id_byte(id_volatile);
      boolean var8 = var7 == 3;
      if (!var8 && var4.id_protected(var5).id_break() == rdy_3.Xg) {
         return ryZ_2.PASS;
      } else if (var7 > 1) {
         int var9 = 1 + var2.id_int.nextInt(2);
         id_class(var2, var3, new rdn_3(rdy_3.WQ, var9 + (var8 ? 1 : 0)));
         var2.id_class(null, var3, rqn_3.dE, rqL_2.BLOCKS, 1.0F, 0.8F + var2.id_int.nextFloat() * 0.4F);
         var2.id_class(var3, var1.id_class(id_volatile, Integer.valueOf(1)), 2);
         return ryZ_2.id_class(var2.id_continue);
      } else {
         return super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      if (var1.id_byte(id_volatile) == 0) {
         return id_final;
      } else {
         return var1.id_byte(id_volatile) < 3 ? id_package : super.id_class(var1, var2, var3, var4);
      }
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      int var5 = var1.id_byte(id_volatile);
      if (var5 < 3 && var4.nextInt(5) == 0 && var2.id_class(var3.id_final(), 0) >= 9) {
         var2.id_class(var3, var1.id_class(id_volatile, Integer.valueOf(var5 + 1)), 2);
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (var4 instanceof iB_2 && var4.BC() != aI_2.id_throw && var4.BC() != aI_2.id_throws) {
         if (var4 == (cb_3)QY.id_instanceof().id_class[57]) {
            rrAb_1 var5 = rrAb_1.id_class(this, new rjU_2(0.8F, 0.75, 0.8F));
            if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var5).id_byte()) {
               var4.id_class(var1, var5.id_break());
            }
         } else {
            var4.id_class(var1, new rjU_2(0.8F, 0.75, 0.8F));
         }

         var4.id_class((xd_3)this);
         if (!var2.id_continue && var1.id_byte(id_volatile) > 0 && ((Double)var4.id_throws[34] != var4.rx() || (Double)var4.id_throws[36] != var4.BO())) {
            double var9 = Math.abs(var4.rx() - (Double)var4.id_throws[34]);
            double var7 = Math.abs(var4.BO() - (Double)var4.id_throws[36]);
            if (var9 >= 0.003F || var7 >= 0.003F) {
               var4.id_break(rye_3.id_else, 1.0F);
            }
         }
      }
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(rdy_3.WQ);
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.id_byte(id_volatile) < 3;
   }
}
