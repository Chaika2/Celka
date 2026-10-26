package celestial;

public class pF_2 extends qc_3<rbf_3, tZ_2<rbf_3>> {
   public pF_2(pg_3 var1) {
      super(var1, new tZ_2<>(0.0F), 0.4F);
      this.id_class(new TZ(this));
   }

   protected void id_class(rbf_3 var1, Ml_1 var2, float var3, float var4, float var5) {
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = var1.id_throw(var5);
      if (var6 > 0.0F) {
         var2.id_class((double)(0.4F * var6), (double)(0.15F * var6), (double)(0.1F * var6));
         var2.id_class(rje_3.id_case.id_byte(rfU_2.id_private(var6, 0.0F, 90.0F)));
         rfH_2 var7 = var1.Bs();

         for (rhd_3 var9 : ((rYB)var1.id_throws[7]).id_class(rhd_3.class, new rfl_3(var7).id_byte(2.0, 2.0, 2.0))) {
            if (var9.Sc()) {
               var2.id_class((double)(0.15F * var6), 0.0, 0.0);
               break;
            }
         }
      }
   }

   protected void id_class(rbf_3 var1, Ml_1 var2, float var3) {
      super.id_class(var1, var2, var3);
      var2.id_class(0.8F, 0.8F, 0.8F);
   }

   public rqO_2 id_class(rbf_3 var1) {
      return var1.L();
   }
}
