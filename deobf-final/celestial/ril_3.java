package celestial;

import java.util.Random;

public class ril_3 extends rrrw_1 {
   private final rip_3 protected_;
   private final float throws_;
   private final rqO_2 case_;
   private final rqd_3 catch_;
   private final boolean private_;

   public ril_3(rrPt_1 var1, rqO_2 var2, rfH_2 var3, rqd_3 var4, float var5, rip_3 var6, boolean var7) {
      super(raF_2.float_, 0);
      this.case_ = var2;
      this.byte_ = var3;
      this.catch_ = var4;
      this.throws_ = var5;
      this.protected_ = var6;
      this.private_ = var7;
      this.class_(var1);
   }

   public ril_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.float_, var2);
      this.case_ = new rqO_2(var2.native_("Template"));
      this.catch_ = rqd_3.valueOf(var2.native_("Rot"));
      this.throws_ = var2.finally_("Integrity");
      this.protected_ = rip_3.valueOf(var2.native_("BiomeType"));
      this.private_ = var2.new_("IsLarge");
      this.class_(var1);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.break_.break_().class_(new rrPd_1(this.throws_)).class_(rrPG.protected_);
      int var8 = var1.class_(rKv_1.OCEAN_FLOOR_WG, this.byte_.b_(), this.byte_.d_());
      this.byte_ = new rfH_2(this.byte_.b_(), var8, this.byte_.d_());
      rfH_2 var9 = rrPl_1.class_(new rfH_2(this.class_.class_().b_() - 1, 0, this.class_.class_().d_() - 1), rpa_3.NONE, this.catch_, rfH_2.protected_)
         .break_(this.byte_);
      this.byte_ = new rfH_2(this.byte_.b_(), this.class_(this.byte_, var1, var9), this.byte_.d_());
      return super.class_(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   protected void class_(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
      if ("chest".equals(var1)) {
         var3.class_(var2, xu_3.re.continue_().class_(xt_3.int_, Boolean.valueOf(var3.break_(var2).class_(rlG_2.break_))), 2);
         ryO_2 var6 = var3.class_(var2);
         if (var6 instanceof rHu_1) {
            ((rHu_1)var6).class_(this.private_ ? rzl_3.abstract_ : rzl_3.char_, var4.nextLong());
         }
      } else if ("drowned".equals(var1)) {
         rEx_1 var7 = aI_2.new_.class_(var3.byte_());
         var7.b();
         var7.class_(var2, 0.0F, 0.0F);
         var7.class_(var3, var3.throws_(var2), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
         var3.class_(var7);
         if (var2.c_() > var3.short_()) {
            var3.class_(var2, xu_3.class_.continue_(), 2);
         } else {
            var3.class_(var2, xu_3.try_.continue_(), 2);
         }
      }
   }

   private int class_(rfH_2 var1, rRq_1 var2, rfH_2 var3) {
      int var4 = var1.c_();
      int var5 = 512;
      int var6 = var4 - 1;
      int var7 = 0;

      for (rfH_2 var9 : rfH_2.class_(var1, var3)) {
         int var10 = var9.b_();
         int var11 = var9.d_();
         int var12 = var1.c_() - 1;
         rfw_3 var13 = new rfw_3(var10, var12, var11);
         xc_3 var14 = var2.byte_(var13);

         for (rXE var15 = var2.break_(var13);
            (var14.catch_() || var15.class_(rlG_2.break_) || var14.break_().class_(rls_3.r)) && var12 > 1;
            var15 = var2.break_(var13)
         ) {
            var13.class_(var10, --var12, var11);
            var14 = var2.byte_(var13);
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
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Template", this.case_.toString());
      var1.class_("Rot", this.catch_.name());
      var1.class_("Integrity", this.throws_);
      var1.class_("BiomeType", this.protected_.toString());
      var1.class_("IsLarge", this.private_);
   }

   private void class_(rrPt_1 var1) {
      rrPl_1 var2 = var1.class_(this.case_);
      rrPN var3 = new rrPN().class_(this.catch_).class_(rpa_3.NONE).class_(rrPG.protected_);
      this.class_(var2, this.byte_, var3);
   }
}
