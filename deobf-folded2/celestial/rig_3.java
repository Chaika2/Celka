package celestial;

public class rig_3 extends rrrH<rUo_1> {
   protected rig_3(rrrZ<rUo_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void id_class(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUo_1 var7) {
      rif_3 var8 = new rif_3();
      riI_2 var9;
      if (var7.id_break == riV_2.DESERT) {
         var9 = riI_2.PARTLY_BURIED;
         var8.id_protected = false;
         var8.id_byte = 0.0F;
      } else if (var7.id_break == riV_2.JUNGLE) {
         var9 = riI_2.ON_LAND_SURFACE;
         var8.id_protected = this.id_protected.nextFloat() < 0.5F;
         var8.id_byte = 0.8F;
         var8.id_throws = true;
         var8.id_case = true;
      } else if (var7.id_break == riV_2.SWAMP) {
         var9 = riI_2.ON_OCEAN_FLOOR;
         var8.id_protected = false;
         var8.id_byte = 0.5F;
         var8.id_case = true;
      } else if (var7.id_break == riV_2.MOUNTAIN) {
         boolean var10 = this.id_protected.nextFloat() < 0.5F;
         var9 = var10 ? riI_2.IN_MOUNTAIN : riI_2.ON_LAND_SURFACE;
         var8.id_protected = var10 || this.id_protected.nextFloat() < 0.5F;
      } else if (var7.id_break == riV_2.OCEAN) {
         var9 = riI_2.ON_OCEAN_FLOOR;
         var8.id_protected = false;
         var8.id_byte = 0.8F;
      } else if (var7.id_break == riV_2.NETHER) {
         var9 = riI_2.IN_NETHER;
         var8.id_protected = this.id_protected.nextFloat() < 0.5F;
         var8.id_byte = 0.0F;
         var8.id_catch = true;
      } else {
         boolean var23 = this.id_protected.nextFloat() < 0.5F;
         var9 = var23 ? riI_2.UNDERGROUND : riI_2.ON_LAND_SURFACE;
         var8.id_protected = var23 || this.id_protected.nextFloat() < 0.5F;
      }

      rqO_2 var24;
      if (this.id_protected.nextFloat() < 0.05F) {
         var24 = new rqO_2(rij_3.id_synchronized[this.id_protected.nextInt(rij_3.id_synchronized.length)]);
      } else {
         var24 = new rqO_2(rij_3.id_else[this.id_protected.nextInt(rij_3.id_else.length)]);
      }

      rrPl_1 var11 = var3.id_class(var24);
      rqd_3 var12 = rqR_2.id_class(rqd_3.values(), this.id_protected);
      rpa_3 var13 = this.id_protected.nextFloat() < 0.5F ? rpa_3.NONE : rpa_3.FRONT_BACK;
      rfH_2 var14 = new rfH_2(var11.id_class().b_() / 2, 0, var11.id_class().d_() / 2);
      rfH_2 var15 = new rfj_3(var4, var5).id_finally();
      rfi_3 var16 = var11.id_class(var15, var12, var14, var13);
      rja_3 var17 = var16.id_catch();
      int var18 = var17.b_();
      int var19 = var17.d_();
      int var20 = var2.id_class(var18, var19, riw_3.id_class(var9)) - 1;
      int var21 = rij_3.id_class(this.id_protected, var2, var9, var8.id_protected, var20, var16.id_throws(), var16);
      rfH_2 var22 = new rfH_2(var15.b_(), var21, var15.d_());
      if (var7.id_break == riV_2.MOUNTAIN || var7.id_break == riV_2.OCEAN || var7.id_break == riV_2.STANDARD) {
         var8.id_break = rij_3.id_class(var22, var6);
      }

      this.id_break.add(new riw_3(var22, var9, var8, var24, var11, var12, var13, var14));
      this.id_break();
   }
}
