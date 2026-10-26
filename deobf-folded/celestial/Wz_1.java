package celestial;

import java.util.Random;

public class Wz_1 extends xd_3 {
   public static final rCN id_volatile = WQ.id_volatile;

   private static void id_byte(xc_3 var0, rYB var1, rfH_2 var2) {
      id_class(var1, var2);
      if (!var0.id_byte(id_volatile)) {
         var1.id_class(var2, var0.id_class(id_volatile, Boolean.valueOf(true)), 3);
      }
   }

   public Wz_1(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_continue().id_class(id_volatile, Boolean.valueOf(false)));
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, rdn_3 var4) {
      super.id_class(var1, var2, var3, var4);
      if (eA_2.id_class(eY_2.id_else, var4) == 0) {
         int var5 = 1 + var2.id_int.nextInt(5);
         this.id_class(var2, var3, var5);
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_volatile)) {
         id_class(var2, var3);
      }
   }

   private static void id_class(rYB var0, rfH_2 var1) {
      double var2 = 0.5625;
      Random var4 = var0.id_int;

      for (rpr_3 var8 : rpr_3.values()) {
         rfH_2 var9 = var1.id_break(var8);
         if (!var0.id_byte(var9).id_implements(var0, var9)) {
            rpB_2 var10 = var8.id_final();
            double var11 = var10 == rpB_2.X ? 0.5 + 0.5625 * (double)var8.id_implements() : (double)var4.nextFloat();
            double var13 = var10 == rpB_2.Y ? 0.5 + 0.5625 * (double)var8.id_finally() : (double)var4.nextFloat();
            double var15 = var10 == rpB_2.Z ? 0.5 + 0.5625 * (double)var8.id_extends() : (double)var4.nextFloat();
            var0.id_class(rLc_1.id_class, (double)var1.b_() + var11, (double)var1.c_() + var13, (double)var1.d_() + var15, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_volatile)) {
         var2.id_class(var3, var1.id_class(id_volatile, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         id_class(var2, var3);
      } else {
         id_byte(var1, var2, var3);
      }

      rdn_3 var7 = var4.id_protected(var5);
      return var7.id_break() instanceof rxJ_2 && new rxx_3(var4, var5, var7, var6).id_break() ? ryZ_2.PASS : ryZ_2.SUCCESS;
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, an_3 var3) {
      id_byte(var1.id_byte(var2), var1, var2);
      super.id_class(var1, var2, var3);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      id_byte(var1, var2, var3);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.id_byte(id_volatile);
   }
}
