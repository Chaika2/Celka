package celestial;

public class kz_3 extends dB_2 {
   public static final rCN volatile_ = rCT.final_;

   protected kz_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Boolean.valueOf(false)));
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      super.class_(var1, var2, var3, var4, var5);
      rcd_3 var6 = var5.int_();
      if (var6.throws_("BlockEntityTag")) {
         rcd_3 var7 = var6.int_("BlockEntityTag");
         if (var7.throws_("RecordItem")) {
            var1.class_(var2, var3.class_(volatile_, Boolean.valueOf(true)), 2);
         }
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHg_1();
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var1.byte_(volatile_)) {
         this.class_(var2, var3);
         var1 = var1.class_(volatile_, Boolean.valueOf(false));
         var2.class_(var3, var1, 2);
         return ryZ_2.class_(var2.continue_);
      } else {
         return ryZ_2.PASS;
      }
   }

   private void class_(rYB var1, rfH_2 var2) {
      if (!var1.continue_ && var1.class_(var2) instanceof rHg_1 var4) {
         rdn_3 var5 = var4.throws_();
         if (!var5.class_()) {
            var1.byte_(1010, var2, 0);
            var4.public_();
            float var6 = 0.7F;
            double var7 = (double)(var1.int_.nextFloat() * 0.7F) + 0.15F;
            double var9 = (double)(var1.int_.nextFloat() * 0.7F) + 0.060000002F + 0.6;
            double var11 = (double)(var1.int_.nextFloat() * 0.7F) + 0.15F;
            rdn_3 var13 = var5.implements_();
            rsE_2 var14 = new rsE_2(var1, (double)var2.b_() + var7, (double)var2.c_() + var9, (double)var2.d_() + var11, var13);
            var14.private_();
            var1.a_(var14);
         }
      }
   }

   public void class_(rRg_1 var1, rfH_2 var2, xc_3 var3, rdn_3 var4) {
      ryO_2 var5 = var1.class_(var2);
      if (var5 instanceof rHg_1) {
         ((rHg_1)var5).class_(var4.implements_());
         var1.class_(var2, var3.class_(volatile_, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         this.class_(var2, var3);
         super.break_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      ryO_2 var4 = var2.class_(var3);
      if (var4 instanceof rHg_1) {
         rdb_3 var5 = ((rHg_1)var4).throws_().break_();
         if (var5 instanceof rdR_2) {
            return ((rdR_2)var5).catch_();
         }
      }

      return 0;
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }
}
