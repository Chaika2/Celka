package celestial;

public class rig_3 extends rrrH<rUo_1> {
   protected rig_3(rrrZ<rUo_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void class_(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUo_1 var7) {
      rif_3 var8 = new rif_3();
      riI_2 var9;
      if (var7.break_ == riV_2.DESERT) {
         var9 = riI_2.PARTLY_BURIED;
         var8.protected_ = false;
         var8.byte_ = 0.0F;
      } else if (var7.break_ == riV_2.JUNGLE) {
         var9 = riI_2.ON_LAND_SURFACE;
         var8.protected_ = this.protected_.nextFloat() < 0.5F;
         var8.byte_ = 0.8F;
         var8.throws_ = true;
         var8.case_ = true;
      } else if (var7.break_ == riV_2.SWAMP) {
         var9 = riI_2.ON_OCEAN_FLOOR;
         var8.protected_ = false;
         var8.byte_ = 0.5F;
         var8.case_ = true;
      } else if (var7.break_ == riV_2.MOUNTAIN) {
         boolean var10 = this.protected_.nextFloat() < 0.5F;
         var9 = var10 ? riI_2.IN_MOUNTAIN : riI_2.ON_LAND_SURFACE;
         var8.protected_ = var10 || this.protected_.nextFloat() < 0.5F;
      } else if (var7.break_ == riV_2.OCEAN) {
         var9 = riI_2.ON_OCEAN_FLOOR;
         var8.protected_ = false;
         var8.byte_ = 0.8F;
      } else if (var7.break_ == riV_2.NETHER) {
         var9 = riI_2.IN_NETHER;
         var8.protected_ = this.protected_.nextFloat() < 0.5F;
         var8.byte_ = 0.0F;
         var8.catch_ = true;
      } else {
         boolean var23 = this.protected_.nextFloat() < 0.5F;
         var9 = var23 ? riI_2.UNDERGROUND : riI_2.ON_LAND_SURFACE;
         var8.protected_ = var23 || this.protected_.nextFloat() < 0.5F;
      }

      rqO_2 var24;
      if (this.protected_.nextFloat() < 0.05F) {
         var24 = new rqO_2(rij_3.synchronized_[this.protected_.nextInt(rij_3.synchronized_.length)]);
      } else {
         var24 = new rqO_2(rij_3.else_[this.protected_.nextInt(rij_3.else_.length)]);
      }

      rrPl_1 var11 = var3.class_(var24);
      rqd_3 var12 = rqR_2.class_(rqd_3.values(), this.protected_);
      rpa_3 var13 = this.protected_.nextFloat() < 0.5F ? rpa_3.NONE : rpa_3.FRONT_BACK;
      rfH_2 var14 = new rfH_2(var11.class_().b_() / 2, 0, var11.class_().d_() / 2);
      rfH_2 var15 = new rfj_3(var4, var5).finally_();
      rfi_3 var16 = var11.class_(var15, var12, var14, var13);
      rja_3 var17 = var16.catch_();
      int var18 = var17.b_();
      int var19 = var17.d_();
      int var20 = var2.class_(var18, var19, riw_3.class_(var9)) - 1;
      int var21 = rij_3.class_(this.protected_, var2, var9, var8.protected_, var20, var16.throws_(), var16);
      rfH_2 var22 = new rfH_2(var15.b_(), var21, var15.d_());
      if (var7.break_ == riV_2.MOUNTAIN || var7.break_ == riV_2.OCEAN || var7.break_ == riV_2.STANDARD) {
         var8.break_ = rij_3.class_(var22, var6);
      }

      this.break_.add(new riw_3(var22, var9, var8, var24, var11, var12, var13, var14));
      this.break_();
   }
}
