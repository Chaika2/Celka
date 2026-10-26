package celestial;

import java.util.Random;

public class riD_2 extends rrrw_1 {
   private final rqd_3 protected_;
   private final rqO_2 throws_;
   private final boolean case_;

   public riD_2(rrPt_1 var1, rqO_2 var2, rfH_2 var3, rqd_3 var4, boolean var5) {
      super(raF_2.b, 0);
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var2;
      this.case_ = var5;
      this.class_(var1);
   }

   public riD_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.b, var2);
      this.throws_ = new rqO_2(var2.native_("Template"));
      this.case_ = var2.new_("isBeached");
      this.protected_ = rqd_3.valueOf(var2.native_("Rot"));
      this.class_(var1);
   }

   @Override
   protected void class_(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
      if ("map_chest".equals(var1)) {
         rHK.class_(var3, var4, var2.break_(), rzl_3.float_);
      } else if ("treasure_chest".equals(var1)) {
         rHK.class_(var3, var4, var2.break_(), rzl_3.static_);
      } else if ("supply_chest".equals(var1)) {
         rHK.class_(var3, var4, var2.break_(), rzl_3.void_);
      }
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      int var8 = 256;
      int var9 = 0;
      rfH_2 var10 = this.class_.class_();
      rKv_1 var11 = this.case_ ? rKv_1.WORLD_SURFACE_WG : rKv_1.OCEAN_FLOOR_WG;
      int var12 = var10.b_() * var10.d_();
      if (var12 == 0) {
         var9 = var1.class_(var11, this.byte_.b_(), this.byte_.d_());
      } else {
         rfH_2 var13 = this.byte_.break_(var10.b_() - 1, 0, var10.d_() - 1);

         for (rfH_2 var15 : rfH_2.class_(this.byte_, var13)) {
            int var16 = var1.class_(var11, var15.b_(), var15.d_());
            var9 += var16;
            var8 = Math.min(var8, var16);
         }

         var9 /= var12;
      }

      int var18 = this.case_ ? var8 - var10.c_() / 2 - var4.nextInt(3) : var9;
      this.byte_ = new rfH_2(this.byte_.b_(), var18, this.byte_.d_());
      return super.class_(var1, var2, var3, var4, var5, var6, var7);
   }

   private void class_(rrPt_1 var1) {
      rrPl_1 var2 = var1.class_(this.throws_);
      rrPN var3 = new rrPN().class_(this.protected_).class_(rpa_3.NONE).class_(riK_2.class_).class_(rrPG.protected_);
      this.class_(var2, this.byte_, var3);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Template", this.throws_.toString());
      var1.class_("isBeached", this.case_);
      var1.class_("Rot", this.protected_.name());
   }
}
