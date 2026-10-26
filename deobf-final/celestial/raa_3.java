package celestial;

public class raa_3 extends raw_3<rUt_1> {
   public raa_3(rrrZ<rUt_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void class_(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUt_1 var7) {
      rfj_3 var8 = new rfj_3(var4, var5);
      int var9 = var8.break_() + this.protected_.nextInt(16);
      int var10 = var8.byte_() + this.protected_.nextInt(16);
      int var11 = var2.case_();
      int var12 = var11 + this.protected_.nextInt(var2.throws_() - 2 - var11);
      rRq_1 var13 = var2.class_(var9, var10);

      for (rfw_3 var14 = new rfw_3(var9, var12, var10); var12 > var11; var12--) {
         xc_3 var15 = var13.byte_(var14);
         var14.class_(rpr_3.DOWN);
         xc_3 var16 = var13.byte_(var14);
         if (var15.catch_() && (var16.class_(xu_3.PY) || var16.protected_(var13, var14, rpr_3.UP))) {
            break;
         }
      }

      if (var12 > var11) {
         rai_3.class_(var3, this.break_, this.protected_, new rfH_2(var9, var12, var10));
         this.break_();
      }
   }
}
