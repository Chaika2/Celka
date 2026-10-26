package celestial;

import java.util.Random;

public class rir_3 extends rrrw_1 {
   private final rqO_2 protected_;
   private final rqd_3 throws_;

   public rir_3(rrPt_1 var1, rqO_2 var2, rfH_2 var3, rqd_3 var4) {
      super(raF_2.M, 0);
      this.protected_ = var2;
      this.byte_ = var3;
      this.throws_ = var4;
      this.class_(var1);
   }

   public rir_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.M, var2);
      this.protected_ = new rqO_2(var2.native_("Template"));
      this.throws_ = rqd_3.valueOf(var2.native_("Rot"));
      this.class_(var1);
   }

   @Override
   protected void class_(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      var5.break_(this.class_.break_(this.break_, this.byte_));
      return super.class_(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Template", this.protected_.toString());
      var1.class_("Rot", this.throws_.name());
   }

   private void class_(rrPt_1 var1) {
      rrPl_1 var2 = var1.class_(this.protected_);
      rrPN var3 = new rrPN().class_(this.throws_).class_(rpa_3.NONE).class_(rrPG.protected_);
      this.class_(var2, this.byte_, var3);
   }
}
