package celestial;

import java.util.Random;

public class raA_2 extends rrrw_1 {
   private final rqO_2 id_protected;
   private final rqd_3 id_throws;

   public raA_2(rrPt_1 var1, rqO_2 var2, rfH_2 var3, rqd_3 var4, int var5) {
      super(raF_2.id_void, 0);
      this.id_protected = var2;
      rfH_2 var6 = raL_2.id_throws.get(var2);
      this.id_byte = var3.id_break(var6.b_(), var6.c_() - var5, var6.d_());
      this.id_throws = var4;
      this.id_class(var1);
   }

   public raA_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_void, var2);
      this.id_protected = new rqO_2(var2.id_native("Template"));
      this.id_throws = rqd_3.valueOf(var2.id_native("Rot"));
      this.id_class(var1);
   }

   @Override
   protected void id_class(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
      if ("chest".equals(var1)) {
         var3.id_class(var2, xu_3.id_class.id_continue(), 3);
         ryO_2 var6 = var3.id_class(var2.id_break());
         if (var6 instanceof rHu_1) {
            ((rHu_1)var6).id_class(rzl_3.id_throw, var4.nextLong());
         }
      }
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      rrPN var8 = new rrPN().id_class(this.id_throws).id_class(rpa_3.NONE).id_class(raL_2.id_protected.get(this.id_protected)).id_class(rrPG.id_break);
      rfH_2 var9 = raL_2.id_throws.get(this.id_protected);
      rfH_2 var10 = this.id_byte.id_break(rrPl_1.id_class(var8, new rfH_2(3 - var9.b_(), 0, 0 - var9.d_())));
      int var11 = var1.id_class(rKv_1.WORLD_SURFACE_WG, var10.b_(), var10.d_());
      rfH_2 var12 = this.id_byte;
      this.id_byte = this.id_byte.id_break(0, var11 - 90 - 1, 0);
      boolean var13 = super.id_class(var1, var2, var3, var4, var5, var6, var7);
      if (this.id_protected.equals(raL_2.id_class)) {
         rfH_2 var14 = this.id_byte.id_break(rrPl_1.id_class(var8, new rfH_2(3, 0, 5)));
         xc_3 var15 = var1.id_byte(var14.id_break());
         if (!var15.id_catch() && !var15.id_class(xu_3.PJ)) {
            var1.id_class(var14, xu_3.Pt.id_continue(), 3);
         }
      }

      this.id_byte = var12;
      return var13;
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Template", this.id_protected.toString());
      var1.id_class("Rot", this.id_throws.name());
   }

   private void id_class(rrPt_1 var1) {
      rrPl_1 var2 = var1.id_class(this.id_protected);
      rrPN var3 = new rrPN().id_class(this.id_throws).id_class(rpa_3.NONE).id_class(raL_2.id_protected.get(this.id_protected)).id_class(rrPG.id_break);
      this.id_class(var2, this.id_byte, var3);
   }
}
