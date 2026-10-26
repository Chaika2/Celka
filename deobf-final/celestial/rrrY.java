package celestial;

import java.util.Random;

public class rrrY extends rrrw_1 {
   private final String protected_;
   private final rqd_3 throws_;
   private final rpa_3 case_;

   public rrrY(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.E, var2);
      this.protected_ = var2.native_("Template");
      this.throws_ = rqd_3.valueOf(var2.native_("Rot"));
      this.case_ = rpa_3.valueOf(var2.native_("Mi"));
      this.class_(var1);
   }

   public rrrY(rrPt_1 var1, String var2, rfH_2 var3, rqd_3 var4, rpa_3 var5) {
      super(raF_2.E, 0);
      this.protected_ = var2;
      this.byte_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.class_(var1);
   }

   public rrrY(rrPt_1 var1, String var2, rfH_2 var3, rqd_3 var4) {
      this(var1, var2, var3, var4, rpa_3.NONE);
   }

   @Override
   protected void class_(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
      if (var1.startsWith("Chest")) {
         rqd_3 var6 = this.break_.protected_();
         xc_3 var7 = xu_3.re.continue_();
         if ("ChestWest".equals(var1)) {
            var7 = var7.class_(xt_3.final_, var6.class_(rpr_3.WEST));
         } else if ("ChestEast".equals(var1)) {
            var7 = var7.class_(xt_3.final_, var6.class_(rpr_3.EAST));
         } else if ("ChestSouth".equals(var1)) {
            var7 = var7.class_(xt_3.final_, var6.class_(rpr_3.SOUTH));
         } else if ("ChestNorth".equals(var1)) {
            var7 = var7.class_(xt_3.final_, var6.class_(rpr_3.NORTH));
         }

         this.class_(var3, var5, var4, var2, rzl_3.interface_, var7);
      } else {
         rsi_3 var9;
         switch (var1) {
            case "Mage":
               var9 = aI_2.return_.class_(var3.byte_());
               break;
            case "Warrior":
               var9 = aI_2.U.class_(var3.byte_());
               break;
            default:
               return;
         }

         var9.b();
         var9.class_(var2, 0.0F, 0.0F);
         var9.class_(var3, var3.throws_(var9.Bs()), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
         var3.class_(var9);
         var3.class_(var2, xu_3.class_.continue_(), 2);
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Template", this.protected_);
      var1.class_("Rot", this.break_.protected_().name());
      var1.class_("Mi", this.break_.byte_().name());
   }

   private void class_(rrPt_1 var1) {
      rrPl_1 var2 = var1.class_(new rqO_2("woodland_mansion/" + this.protected_));
      rrPN var3 = new rrPN().class_(true).class_(this.throws_).class_(this.case_).class_(rrPG.break_);
      this.class_(var2, this.byte_, var3);
   }
}
