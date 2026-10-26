package celestial;

import java.util.Random;

public class raA_2 extends rrrw_1 {
   private final rqO_2 protected_;
   private final rqd_3 throws_;

   public raA_2(rrPt_1 var1, rqO_2 var2, rfH_2 var3, rqd_3 var4, int var5) {
      super(raF_2.void_, 0);
      this.protected_ = var2;
      rfH_2 var6 = raL_2.throws_.get(var2);
      this.byte_ = var3.break_(var6.b_(), var6.c_() - var5, var6.d_());
      this.throws_ = var4;
      this.class_(var1);
   }

   public raA_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.void_, var2);
      this.protected_ = new rqO_2(var2.native_("Template"));
      this.throws_ = rqd_3.valueOf(var2.native_("Rot"));
      this.class_(var1);
   }

   @Override
   protected void class_(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
      if ("chest".equals(var1)) {
         var3.class_(var2, xu_3.class_.continue_(), 3);
         ryO_2 var6 = var3.class_(var2.break_());
         if (var6 instanceof rHu_1) {
            ((rHu_1)var6).class_(rzl_3.throw_, var4.nextLong());
         }
      }
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      rrPN var8 = new rrPN().class_(this.throws_).class_(rpa_3.NONE).class_(raL_2.protected_.get(this.protected_)).class_(rrPG.break_);
      rfH_2 var9 = raL_2.throws_.get(this.protected_);
      rfH_2 var10 = this.byte_.break_(rrPl_1.class_(var8, new rfH_2(3 - var9.b_(), 0, 0 - var9.d_())));
      int var11 = var1.class_(rKv_1.WORLD_SURFACE_WG, var10.b_(), var10.d_());
      rfH_2 var12 = this.byte_;
      this.byte_ = this.byte_.break_(0, var11 - 90 - 1, 0);
      boolean var13 = super.class_(var1, var2, var3, var4, var5, var6, var7);
      if (this.protected_.equals(raL_2.class_)) {
         rfH_2 var14 = this.byte_.break_(rrPl_1.class_(var8, new rfH_2(3, 0, 5)));
         xc_3 var15 = var1.byte_(var14.break_());
         if (!var15.catch_() && !var15.class_(xu_3.PJ)) {
            var1.class_(var14, xu_3.Pt.continue_(), 3);
         }
      }

      this.byte_ = var12;
      return var13;
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Template", this.protected_.toString());
      var1.class_("Rot", this.throws_.name());
   }

   private void class_(rrPt_1 var1) {
      rrPl_1 var2 = var1.class_(this.protected_);
      rrPN var3 = new rrPN().class_(this.throws_).class_(rpa_3.NONE).class_(raL_2.protected_.get(this.protected_)).class_(rrPG.break_);
      this.class_(var2, this.byte_, var3);
   }
}
