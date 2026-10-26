package celestial;

import java.util.Random;

public class rar_3 extends rrrw_1 {
   private final String protected_;
   private final rqd_3 throws_;
   private final boolean case_;

   public rar_3(rrPt_1 var1, String var2, rfH_2 var3, rqd_3 var4, boolean var5) {
      super(raF_2.s, 0);
      this.protected_ = var2;
      this.byte_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.class_(var1);
   }

   public rar_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.s, var2);
      this.protected_ = var2.native_("Template");
      this.throws_ = rqd_3.valueOf(var2.native_("Rot"));
      this.case_ = var2.new_("OW");
      this.class_(var1);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Template", this.protected_);
      var1.class_("Rot", this.throws_.name());
      var1.class_("OW", this.case_);
   }

   @Override
   protected void class_(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
      if (var1.startsWith("Chest")) {
         rfH_2 var6 = var2.break_();
         if (var5.break_(var6)) {
            rHK.class_(var3, var4, var6, rzl_3.byte_);
         }
      } else if (var1.startsWith("Sentry")) {
         rGz_1 var7 = aI_2.v.class_(var3.byte_());
         var7.new_((double)var2.b_() + 0.5, (double)var2.c_() + 0.5, (double)var2.d_() + 0.5);
         var7.finally_(var2);
         var3.a_(var7);
      } else if (var1.startsWith("Elytra")) {
         rsG_2 var8 = new rsG_2(var3.byte_(), var2, this.throws_.class_(rpr_3.SOUTH));
         var8.class_(new rdn_3(rdy_3.kc), false);
         var3.a_(var8);
      }
   }

   private void class_(rrPt_1 var1) {
      rrPl_1 var2 = var1.class_(new rqO_2("end_city/" + this.protected_));
      rrPN var3 = (this.case_ ? reD_2.class_ : reD_2.break_).class_().class_(this.throws_);
      this.class_(var2, this.byte_, var3);
   }
}
