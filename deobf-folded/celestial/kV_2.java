package celestial;

public class kV_2 extends xd_3 {
   public static final rCu_1<rCV> id_volatile = rCT.j;
   public static final rCN id_final = rCT.id_return;
   public static final rCm_1 id_package = rCT.C;

   public kV_2(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract.id_break().id_class(id_volatile, rCV.HARP).id_class(id_package, Integer.valueOf(0)).id_class(id_final, Boolean.valueOf(false))
      );
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      if (!var2.id_continue) {
         this.id_class(var2, var3);
         var4.id_break(rlB_2.h);
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rYB var2, rfH_2 var3, int var4, int var5) {
      int var6 = var1.id_byte(id_package);
      float var7 = (float)Math.pow(2.0, (double)(var6 - 12) / 12.0);
      var2.id_class((rhd_3)null, var3, var1.id_byte(id_volatile).id_break(), rqL_2.RECORDS, 3.0F, var7);
      var2.id_class(rLQ.id_strictfp, (double)var3.b_() + 0.5, (double)var3.c_() + 1.2, (double)var3.d_() + 0.5, (double)var6 / 24.0, 0.0, 0.0);
      return true;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_package);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         var1 = var1.id_class(id_package);
         var2.id_class(var3, var1, 3);
         this.id_class(var2, var3);
         var4.id_break(rlB_2.X);
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN ? var1.id_class(id_volatile, rCV.id_class(var3)) : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      boolean var7 = var2.id_public(var3);
      if (var7 != var1.id_byte(id_final)) {
         if (var7) {
            this.id_class(var2, var3);
         }

         var2.id_class(var3, var1.id_class(id_final, Boolean.valueOf(var7)), 3);
      }
   }

   private void id_class(rYB var1, rfH_2 var2) {
      if (var1.id_byte(var2.id_final()).id_catch()) {
         var1.id_class(var2, this, 0, 0);
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_volatile, rCV.id_class(var1.id_int().id_byte(var1.id_class().id_break())));
   }
}
