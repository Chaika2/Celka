package celestial;

import java.util.Random;

public class ril_3 extends rrrw_1 {
   private final rip_3 id_protected;
   private final float id_throws;
   private final rqO_2 id_case;
   private final rqd_3 id_catch;
   private final boolean id_private;

   public ril_3(rrPt_1 var1, rqO_2 var2, rfH_2 var3, rqd_3 var4, float var5, rip_3 var6, boolean var7) {
      super(raF_2.id_float, 0);
      this.id_case = var2;
      this.id_byte = var3;
      this.id_catch = var4;
      this.id_throws = var5;
      this.id_protected = var6;
      this.id_private = var7;
      this.id_class(var1);
   }

   public ril_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_float, var2);
      this.id_case = new rqO_2(var2.id_native("Template"));
      this.id_catch = rqd_3.valueOf(var2.id_native("Rot"));
      this.id_throws = var2.id_finally("Integrity");
      this.id_protected = rip_3.valueOf(var2.id_native("BiomeType"));
      this.id_private = var2.id_new("IsLarge");
      this.id_class(var1);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_break.id_break().id_class(new rrPd_1(this.id_throws)).id_class(rrPG.id_protected);
      int var8 = var1.id_class(rKv_1.OCEAN_FLOOR_WG, this.id_byte.b_(), this.id_byte.d_());
      this.id_byte = new rfH_2(this.id_byte.b_(), var8, this.id_byte.d_());
      rfH_2 var9 = rrPl_1.id_class(
            new rfH_2(this.id_class.id_class().b_() - 1, 0, this.id_class.id_class().d_() - 1), rpa_3.NONE, this.id_catch, rfH_2.id_protected
         )
         .id_break(this.id_byte);
      this.id_byte = new rfH_2(this.id_byte.b_(), this.id_class(this.id_byte, var1, var9), this.id_byte.d_());
      return super.id_class(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   protected void id_class(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
      if ("chest".equals(var1)) {
         var3.id_class(var2, xu_3.re.id_continue().id_class(xt_3.id_int, Boolean.valueOf(var3.id_break(var2).id_class(rlG_2.id_break))), 2);
         ryO_2 var6 = var3.id_class(var2);
         if (var6 instanceof rHu_1) {
            ((rHu_1)var6).id_class(this.id_private ? rzl_3.id_abstract : rzl_3.id_char, var4.nextLong());
         }
      } else if ("drowned".equals(var1)) {
         rEx_1 var7 = aI_2.id_new.id_class(var3.id_byte());
         var7.b();
         var7.id_class(var2, 0.0F, 0.0F);
         var7.id_class(var3, var3.id_throws(var2), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
         var3.id_class(var7);
         if (var2.c_() > var3.id_short()) {
            var3.id_class(var2, xu_3.id_class.id_continue(), 2);
         } else {
            var3.id_class(var2, xu_3.id_try.id_continue(), 2);
         }
      }
   }

   private int id_class(rfH_2 var1, rRq_1 var2, rfH_2 var3) {
      int var4 = var1.c_();
      int var5 = 512;
      int var6 = var4 - 1;
      int var7 = 0;

      for (rfH_2 var9 : rfH_2.id_class(var1, var3)) {
         int var10 = var9.b_();
         int var11 = var9.d_();
         int var12 = var1.c_() - 1;
         rfw_3 var13 = new rfw_3(var10, var12, var11);
         xc_3 var14 = var2.id_byte(var13);

         for (rXE var15 = var2.id_break(var13);
            (var14.id_catch() || var15.id_class(rlG_2.id_break) || var14.id_break().id_class(rls_3.r)) && var12 > 1;
            var15 = var2.id_break(var13)
         ) {
            var13.id_class(var10, --var12, var11);
            var14 = var2.id_byte(var13);
         }

         var5 = Math.min(var5, var12);
         if (var12 < var6 - 2) {
            var7++;
         }
      }

      int var16 = Math.abs(var1.b_() - var3.b_());
      if (var6 - var5 > 2 && var7 > var16 - 2) {
         var4 = var5 + 1;
      }

      return var4;
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Template", this.id_case.toString());
      var1.id_class("Rot", this.id_catch.name());
      var1.id_class("Integrity", this.id_throws);
      var1.id_class("BiomeType", this.id_protected.toString());
      var1.id_class("IsLarge", this.id_private);
   }

   private void id_class(rrPt_1 var1) {
      rrPl_1 var2 = var1.id_class(this.id_case);
      rrPN var3 = new rrPN().id_class(this.id_catch).id_class(rpa_3.NONE).id_class(rrPG.id_protected);
      this.id_class(var2, this.id_byte, var3);
   }
}
