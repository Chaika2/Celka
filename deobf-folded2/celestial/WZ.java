package celestial;

import java.util.Random;

public class WZ extends Wk_1 {
   public static final rCN id_volatile = rCT.id_super;
   public static final rCm_1 id_int = rCT.Q;

   protected WZ(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(p, rpr_3.NORTH)
            .id_class(id_int, Integer.valueOf(1))
            .id_class(id_volatile, Boolean.valueOf(false))
            .id_class(id_package, Boolean.valueOf(false))
      );
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_package)) {
         rpr_3 var5 = var1.id_byte(p);
         double var6 = (double)var3.b_() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         double var8 = (double)var3.c_() + 0.4 + (var4.nextDouble() - 0.5) * 0.2;
         double var10 = (double)var3.d_() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         float var12 = -5.0F;
         if (var4.nextBoolean()) {
            var12 = (float)(var1.id_byte(id_int) * 2 - 1);
         }

         var12 /= 16.0F;
         double var13 = (double)(var12 * (float)var5.id_implements());
         double var15 = (double)(var12 * (float)var5.id_extends());
         var2.id_class(rLc_1.id_class, var6 + var13, var8, var10 + var15, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(p, id_int, id_volatile, id_package);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (!((rhx_3)var4.id_implements[18]).id_throws) {
         return ryZ_2.PASS;
      } else {
         var2.id_class(var3, var1.id_class(id_int), 3);
         return ryZ_2.id_class(var2.id_continue);
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return !var4.id_import() && var2.id_final() != var1.id_byte(p).id_final()
         ? var1.id_class(id_volatile, Boolean.valueOf(this.id_class(var4, var5, var1)))
         : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = super.id_class(var1);
      return var2.id_class(id_volatile, Boolean.valueOf(this.id_class(var1.id_int(), var1.id_class(), var2)));
   }

   @Override
   public boolean id_class(rRR var1, rfH_2 var2, xc_3 var3) {
      return this.id_break(var1, var2, var3) > 0;
   }

   @Override
   protected boolean id_implements(xc_3 var1) {
      return id_volatile(var1);
   }

   @Override
   protected int id_private(xc_3 var1) {
      return var1.id_byte(id_int) * 2;
   }
}
