package celestial;

public class kz_3 extends dB_2 {
   public static final rCN id_volatile = rCT.id_final;

   protected kz_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Boolean.valueOf(false)));
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      super.id_class(var1, var2, var3, var4, var5);
      rcd_3 var6 = var5.id_int();
      if (var6.id_throws("BlockEntityTag")) {
         rcd_3 var7 = var6.id_int("BlockEntityTag");
         if (var7.id_throws("RecordItem")) {
            var1.id_class(var2, var3.id_class(id_volatile, Boolean.valueOf(true)), 2);
         }
      }
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHg_1();
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var1.id_byte(id_volatile)) {
         this.id_class(var2, var3);
         var1 = var1.id_class(id_volatile, Boolean.valueOf(false));
         var2.id_class(var3, var1, 2);
         return ryZ_2.id_class(var2.id_continue);
      } else {
         return ryZ_2.PASS;
      }
   }

   private void id_class(rYB var1, rfH_2 var2) {
      if (!var1.id_continue && var1.id_class(var2) instanceof rHg_1 var4) {
         rdn_3 var5 = var4.id_throws();
         if (!var5.id_class()) {
            var1.id_byte(1010, var2, 0);
            var4.id_public();
            float var6 = 0.7F;
            double var7 = (double)(var1.id_int.nextFloat() * 0.7F) + 0.15F;
            double var9 = (double)(var1.id_int.nextFloat() * 0.7F) + 0.060000002F + 0.6;
            double var11 = (double)(var1.id_int.nextFloat() * 0.7F) + 0.15F;
            rdn_3 var13 = var5.id_implements();
            rsE_2 var14 = new rsE_2(var1, (double)var2.b_() + var7, (double)var2.c_() + var9, (double)var2.d_() + var11, var13);
            var14.id_private();
            var1.a_(var14);
         }
      }
   }

   public void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, rdn_3 var4) {
      ryO_2 var5 = var1.id_class(var2);
      if (var5 instanceof rHg_1) {
         ((rHg_1)var5).id_class(var4.id_implements());
         var1.id_class(var2, var3.id_class(id_volatile, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         this.id_class(var2, var3);
         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      ryO_2 var4 = var2.id_class(var3);
      if (var4 instanceof rHg_1) {
         rdb_3 var5 = ((rHg_1)var4).id_throws().id_break();
         if (var5 instanceof rdR_2) {
            return ((rdR_2)var5).id_catch();
         }
      }

      return 0;
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }
}
