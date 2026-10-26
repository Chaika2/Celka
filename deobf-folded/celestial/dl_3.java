package celestial;

import java.util.Random;

public class dl_3 extends JI<rHq_1> implements kd_3 {
   public static final rCc_1 id_final = kE_2.p;
   public static final rCN id_package = rCT.id_throw;
   protected static final rjC_2 id_int = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final rgP_2 id_new = new rgn_3("container.enderchest");

   protected dl_3(Jq_1 var1) {
      super(var1, () -> ryW_2.id_protected);
      this.id_extends(this.id_abstract.id_break().id_class(id_final, rpr_3.NORTH).id_class(id_package, Boolean.valueOf(false)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_package)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_final, id_package);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_final)));
   }

   @Override
   public ryJ_2<? extends rHu_1> id_class(xc_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      return ryX_2::id_break;
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_final, var2.id_class(var1.id_byte(id_final)));
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rXz_1 var7 = var4.se();
      ryO_2 var8 = var2.id_class(var3);
      if (var7 != null && var8 instanceof rHq_1) {
         rfH_2 var9 = var3.id_final();
         if (var2.id_byte(var9).id_catch(var2, var9)) {
            return ryZ_2.id_class(var2.id_continue);
         } else if (var2.id_continue) {
            return ryZ_2.SUCCESS;
         } else {
            rHq_1 var10 = (rHq_1)var8;
            var7.id_class(var10);
            var4.id_class(new rJR((var1x, var2x, var3x) -> rXe_1.id_class(var1x, var2x, var7), id_new));
            var4.id_break(rlB_2.d);
            rbW_2.id_class(var4, true);
            return ryZ_2.CONSUME;
         }
      } else {
         return ryZ_2.id_class(var2.id_continue);
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rXE var2 = var1.id_int().id_break(var1.id_class());
      return this.id_continue().id_class(id_final, var1.id_case().id_case()).id_class(id_package, Boolean.valueOf(var2.id_class() == rXG.id_byte));
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.ENTITYBLOCK_ANIMATED;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_int;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      for (int var5 = 0; var5 < 3; var5++) {
         int var6 = var4.nextInt(2) * 2 - 1;
         int var7 = var4.nextInt(2) * 2 - 1;
         double var8 = (double)var3.b_() + 0.5 + 0.25 * (double)var6;
         double var10 = (double)((float)var3.c_() + var4.nextFloat());
         double var12 = (double)var3.d_() + 0.5 + 0.25 * (double)var7;
         double var14 = (double)(var4.nextFloat() * (float)var6);
         double var16 = ((double)var4.nextFloat() - 0.5) * 0.125;
         double var18 = (double)(var4.nextFloat() * (float)var7);
         var2.id_class(rLQ.id_transient, var8, var10, var12, var14, var16, var18);
      }
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHq_1();
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_package) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }
}
