package celestial;

public class raa_3 extends raw_3<rUt_1> {
   public raa_3(rrrZ<rUt_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void id_class(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUt_1 var7) {
      rfj_3 var8 = new rfj_3(var4, var5);
      int var9 = var8.id_break() + this.id_protected.nextInt(16);
      int var10 = var8.id_byte() + this.id_protected.nextInt(16);
      int var11 = var2.id_case();
      int var12 = var11 + this.id_protected.nextInt(var2.id_throws() - 2 - var11);
      rRq_1 var13 = var2.id_class(var9, var10);

      for (rfw_3 var14 = new rfw_3(var9, var12, var10); var12 > var11; var12--) {
         xc_3 var15 = var13.id_byte(var14);
         var14.id_class(rpr_3.DOWN);
         xc_3 var16 = var13.id_byte(var14);
         if (var15.id_catch() && (var16.id_class(xu_3.PY) || var16.id_protected(var13, var14, rpr_3.UP))) {
            break;
         }
      }

      if (var12 > var11) {
         rai_3.id_class(var3, this.id_break, this.id_protected, new rfH_2(var9, var12, var10));
         this.id_break();
      }
   }
}
